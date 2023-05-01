/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package io.jetprocess.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;

import io.jetprocess.exception.NoSuchDeliveryModeException;
import io.jetprocess.model.DeliveryMode;
import io.jetprocess.model.DeliveryModeTable;
import io.jetprocess.model.impl.DeliveryModeImpl;
import io.jetprocess.model.impl.DeliveryModeModelImpl;
import io.jetprocess.service.persistence.DeliveryModePersistence;
import io.jetprocess.service.persistence.DeliveryModeUtil;
import io.jetprocess.service.persistence.impl.constants.JPPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the delivery mode service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {DeliveryModePersistence.class, BasePersistence.class})
public class DeliveryModePersistenceImpl
	extends BasePersistenceImpl<DeliveryMode>
	implements DeliveryModePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DeliveryModeUtil</code> to access the delivery mode persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DeliveryModeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public DeliveryModePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DeliveryMode.class);

		setModelImplClass(DeliveryModeImpl.class);
		setModelPKClass(long.class);

		setTable(DeliveryModeTable.INSTANCE);
	}

	/**
	 * Caches the delivery mode in the entity cache if it is enabled.
	 *
	 * @param deliveryMode the delivery mode
	 */
	@Override
	public void cacheResult(DeliveryMode deliveryMode) {
		entityCache.putResult(
			DeliveryModeImpl.class, deliveryMode.getPrimaryKey(), deliveryMode);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the delivery modes in the entity cache if it is enabled.
	 *
	 * @param deliveryModes the delivery modes
	 */
	@Override
	public void cacheResult(List<DeliveryMode> deliveryModes) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (deliveryModes.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DeliveryMode deliveryMode : deliveryModes) {
			if (entityCache.getResult(
					DeliveryModeImpl.class, deliveryMode.getPrimaryKey()) ==
						null) {

				cacheResult(deliveryMode);
			}
		}
	}

	/**
	 * Clears the cache for all delivery modes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DeliveryModeImpl.class);

		finderCache.clearCache(DeliveryModeImpl.class);
	}

	/**
	 * Clears the cache for the delivery mode.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DeliveryMode deliveryMode) {
		entityCache.removeResult(DeliveryModeImpl.class, deliveryMode);
	}

	@Override
	public void clearCache(List<DeliveryMode> deliveryModes) {
		for (DeliveryMode deliveryMode : deliveryModes) {
			entityCache.removeResult(DeliveryModeImpl.class, deliveryMode);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DeliveryModeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DeliveryModeImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new delivery mode with the primary key. Does not add the delivery mode to the database.
	 *
	 * @param id the primary key for the new delivery mode
	 * @return the new delivery mode
	 */
	@Override
	public DeliveryMode create(long id) {
		DeliveryMode deliveryMode = new DeliveryModeImpl();

		deliveryMode.setNew(true);
		deliveryMode.setPrimaryKey(id);

		return deliveryMode;
	}

	/**
	 * Removes the delivery mode with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the delivery mode
	 * @return the delivery mode that was removed
	 * @throws NoSuchDeliveryModeException if a delivery mode with the primary key could not be found
	 */
	@Override
	public DeliveryMode remove(long id) throws NoSuchDeliveryModeException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the delivery mode with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the delivery mode
	 * @return the delivery mode that was removed
	 * @throws NoSuchDeliveryModeException if a delivery mode with the primary key could not be found
	 */
	@Override
	public DeliveryMode remove(Serializable primaryKey)
		throws NoSuchDeliveryModeException {

		Session session = null;

		try {
			session = openSession();

			DeliveryMode deliveryMode = (DeliveryMode)session.get(
				DeliveryModeImpl.class, primaryKey);

			if (deliveryMode == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDeliveryModeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(deliveryMode);
		}
		catch (NoSuchDeliveryModeException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected DeliveryMode removeImpl(DeliveryMode deliveryMode) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(deliveryMode)) {
				deliveryMode = (DeliveryMode)session.get(
					DeliveryModeImpl.class, deliveryMode.getPrimaryKeyObj());
			}

			if (deliveryMode != null) {
				session.delete(deliveryMode);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (deliveryMode != null) {
			clearCache(deliveryMode);
		}

		return deliveryMode;
	}

	@Override
	public DeliveryMode updateImpl(DeliveryMode deliveryMode) {
		boolean isNew = deliveryMode.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(deliveryMode);
			}
			else {
				deliveryMode = (DeliveryMode)session.merge(deliveryMode);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DeliveryModeImpl.class, deliveryMode, false, true);

		if (isNew) {
			deliveryMode.setNew(false);
		}

		deliveryMode.resetOriginalValues();

		return deliveryMode;
	}

	/**
	 * Returns the delivery mode with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the delivery mode
	 * @return the delivery mode
	 * @throws NoSuchDeliveryModeException if a delivery mode with the primary key could not be found
	 */
	@Override
	public DeliveryMode findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDeliveryModeException {

		DeliveryMode deliveryMode = fetchByPrimaryKey(primaryKey);

		if (deliveryMode == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDeliveryModeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return deliveryMode;
	}

	/**
	 * Returns the delivery mode with the primary key or throws a <code>NoSuchDeliveryModeException</code> if it could not be found.
	 *
	 * @param id the primary key of the delivery mode
	 * @return the delivery mode
	 * @throws NoSuchDeliveryModeException if a delivery mode with the primary key could not be found
	 */
	@Override
	public DeliveryMode findByPrimaryKey(long id)
		throws NoSuchDeliveryModeException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the delivery mode with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the delivery mode
	 * @return the delivery mode, or <code>null</code> if a delivery mode with the primary key could not be found
	 */
	@Override
	public DeliveryMode fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the delivery modes.
	 *
	 * @return the delivery modes
	 */
	@Override
	public List<DeliveryMode> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the delivery modes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeliveryModeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of delivery modes
	 * @param end the upper bound of the range of delivery modes (not inclusive)
	 * @return the range of delivery modes
	 */
	@Override
	public List<DeliveryMode> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the delivery modes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeliveryModeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of delivery modes
	 * @param end the upper bound of the range of delivery modes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of delivery modes
	 */
	@Override
	public List<DeliveryMode> findAll(
		int start, int end, OrderByComparator<DeliveryMode> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the delivery modes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeliveryModeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of delivery modes
	 * @param end the upper bound of the range of delivery modes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of delivery modes
	 */
	@Override
	public List<DeliveryMode> findAll(
		int start, int end, OrderByComparator<DeliveryMode> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<DeliveryMode> list = null;

		if (useFinderCache) {
			list = (List<DeliveryMode>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DELIVERYMODE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DELIVERYMODE;

				sql = sql.concat(DeliveryModeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DeliveryMode>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the delivery modes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DeliveryMode deliveryMode : findAll()) {
			remove(deliveryMode);
		}
	}

	/**
	 * Returns the number of delivery modes.
	 *
	 * @return the number of delivery modes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DELIVERYMODE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id_";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DELIVERYMODE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DeliveryModeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the delivery mode persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_setDeliveryModeUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setDeliveryModeUtilPersistence(null);

		entityCache.removeCache(DeliveryModeImpl.class.getName());
	}

	private void _setDeliveryModeUtilPersistence(
		DeliveryModePersistence deliveryModePersistence) {

		try {
			Field field = DeliveryModeUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, deliveryModePersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = JPPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JPPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JPPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DELIVERYMODE =
		"SELECT deliveryMode FROM DeliveryMode deliveryMode";

	private static final String _SQL_COUNT_DELIVERYMODE =
		"SELECT COUNT(deliveryMode) FROM DeliveryMode deliveryMode";

	private static final String _ORDER_BY_ENTITY_ALIAS = "deliveryMode.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DeliveryMode exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		DeliveryModePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private DeliveryModeModelArgumentsResolver
		_deliveryModeModelArgumentsResolver;

}