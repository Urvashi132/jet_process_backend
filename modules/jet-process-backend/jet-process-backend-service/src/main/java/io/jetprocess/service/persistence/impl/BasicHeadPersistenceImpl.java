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

import io.jetprocess.exception.NoSuchBasicHeadException;
import io.jetprocess.model.BasicHead;
import io.jetprocess.model.BasicHeadTable;
import io.jetprocess.model.impl.BasicHeadImpl;
import io.jetprocess.model.impl.BasicHeadModelImpl;
import io.jetprocess.service.persistence.BasicHeadPersistence;
import io.jetprocess.service.persistence.BasicHeadUtil;
import io.jetprocess.service.persistence.impl.constants.JPPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the basic head service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {BasicHeadPersistence.class, BasePersistence.class})
public class BasicHeadPersistenceImpl
	extends BasePersistenceImpl<BasicHead> implements BasicHeadPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>BasicHeadUtil</code> to access the basic head persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		BasicHeadImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public BasicHeadPersistenceImpl() {
		setModelClass(BasicHead.class);

		setModelImplClass(BasicHeadImpl.class);
		setModelPKClass(long.class);

		setTable(BasicHeadTable.INSTANCE);
	}

	/**
	 * Caches the basic head in the entity cache if it is enabled.
	 *
	 * @param basicHead the basic head
	 */
	@Override
	public void cacheResult(BasicHead basicHead) {
		entityCache.putResult(
			BasicHeadImpl.class, basicHead.getPrimaryKey(), basicHead);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the basic heads in the entity cache if it is enabled.
	 *
	 * @param basicHeads the basic heads
	 */
	@Override
	public void cacheResult(List<BasicHead> basicHeads) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (basicHeads.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (BasicHead basicHead : basicHeads) {
			if (entityCache.getResult(
					BasicHeadImpl.class, basicHead.getPrimaryKey()) == null) {

				cacheResult(basicHead);
			}
		}
	}

	/**
	 * Clears the cache for all basic heads.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BasicHeadImpl.class);

		finderCache.clearCache(BasicHeadImpl.class);
	}

	/**
	 * Clears the cache for the basic head.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BasicHead basicHead) {
		entityCache.removeResult(BasicHeadImpl.class, basicHead);
	}

	@Override
	public void clearCache(List<BasicHead> basicHeads) {
		for (BasicHead basicHead : basicHeads) {
			entityCache.removeResult(BasicHeadImpl.class, basicHead);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(BasicHeadImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(BasicHeadImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new basic head with the primary key. Does not add the basic head to the database.
	 *
	 * @param basicHeadId the primary key for the new basic head
	 * @return the new basic head
	 */
	@Override
	public BasicHead create(long basicHeadId) {
		BasicHead basicHead = new BasicHeadImpl();

		basicHead.setNew(true);
		basicHead.setPrimaryKey(basicHeadId);

		return basicHead;
	}

	/**
	 * Removes the basic head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param basicHeadId the primary key of the basic head
	 * @return the basic head that was removed
	 * @throws NoSuchBasicHeadException if a basic head with the primary key could not be found
	 */
	@Override
	public BasicHead remove(long basicHeadId) throws NoSuchBasicHeadException {
		return remove((Serializable)basicHeadId);
	}

	/**
	 * Removes the basic head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the basic head
	 * @return the basic head that was removed
	 * @throws NoSuchBasicHeadException if a basic head with the primary key could not be found
	 */
	@Override
	public BasicHead remove(Serializable primaryKey)
		throws NoSuchBasicHeadException {

		Session session = null;

		try {
			session = openSession();

			BasicHead basicHead = (BasicHead)session.get(
				BasicHeadImpl.class, primaryKey);

			if (basicHead == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBasicHeadException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(basicHead);
		}
		catch (NoSuchBasicHeadException noSuchEntityException) {
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
	protected BasicHead removeImpl(BasicHead basicHead) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(basicHead)) {
				basicHead = (BasicHead)session.get(
					BasicHeadImpl.class, basicHead.getPrimaryKeyObj());
			}

			if (basicHead != null) {
				session.delete(basicHead);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (basicHead != null) {
			clearCache(basicHead);
		}

		return basicHead;
	}

	@Override
	public BasicHead updateImpl(BasicHead basicHead) {
		boolean isNew = basicHead.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(basicHead);
			}
			else {
				basicHead = (BasicHead)session.merge(basicHead);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(BasicHeadImpl.class, basicHead, false, true);

		if (isNew) {
			basicHead.setNew(false);
		}

		basicHead.resetOriginalValues();

		return basicHead;
	}

	/**
	 * Returns the basic head with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the basic head
	 * @return the basic head
	 * @throws NoSuchBasicHeadException if a basic head with the primary key could not be found
	 */
	@Override
	public BasicHead findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBasicHeadException {

		BasicHead basicHead = fetchByPrimaryKey(primaryKey);

		if (basicHead == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBasicHeadException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return basicHead;
	}

	/**
	 * Returns the basic head with the primary key or throws a <code>NoSuchBasicHeadException</code> if it could not be found.
	 *
	 * @param basicHeadId the primary key of the basic head
	 * @return the basic head
	 * @throws NoSuchBasicHeadException if a basic head with the primary key could not be found
	 */
	@Override
	public BasicHead findByPrimaryKey(long basicHeadId)
		throws NoSuchBasicHeadException {

		return findByPrimaryKey((Serializable)basicHeadId);
	}

	/**
	 * Returns the basic head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param basicHeadId the primary key of the basic head
	 * @return the basic head, or <code>null</code> if a basic head with the primary key could not be found
	 */
	@Override
	public BasicHead fetchByPrimaryKey(long basicHeadId) {
		return fetchByPrimaryKey((Serializable)basicHeadId);
	}

	/**
	 * Returns all the basic heads.
	 *
	 * @return the basic heads
	 */
	@Override
	public List<BasicHead> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the basic heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BasicHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @return the range of basic heads
	 */
	@Override
	public List<BasicHead> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the basic heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BasicHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of basic heads
	 */
	@Override
	public List<BasicHead> findAll(
		int start, int end, OrderByComparator<BasicHead> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the basic heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BasicHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of basic heads
	 */
	@Override
	public List<BasicHead> findAll(
		int start, int end, OrderByComparator<BasicHead> orderByComparator,
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

		List<BasicHead> list = null;

		if (useFinderCache) {
			list = (List<BasicHead>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_BASICHEAD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_BASICHEAD;

				sql = sql.concat(BasicHeadModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<BasicHead>)QueryUtil.list(
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
	 * Removes all the basic heads from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BasicHead basicHead : findAll()) {
			remove(basicHead);
		}
	}

	/**
	 * Returns the number of basic heads.
	 *
	 * @return the number of basic heads
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_BASICHEAD);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "basicHeadId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_BASICHEAD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return BasicHeadModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the basic head persistence.
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

		_setBasicHeadUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setBasicHeadUtilPersistence(null);

		entityCache.removeCache(BasicHeadImpl.class.getName());
	}

	private void _setBasicHeadUtilPersistence(
		BasicHeadPersistence basicHeadPersistence) {

		try {
			Field field = BasicHeadUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, basicHeadPersistence);
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

	private static final String _SQL_SELECT_BASICHEAD =
		"SELECT basicHead FROM BasicHead basicHead";

	private static final String _SQL_COUNT_BASICHEAD =
		"SELECT COUNT(basicHead) FROM BasicHead basicHead";

	private static final String _ORDER_BY_ENTITY_ALIAS = "basicHead.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No BasicHead exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		BasicHeadPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private BasicHeadModelArgumentsResolver _basicHeadModelArgumentsResolver;

}