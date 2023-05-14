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

import io.jetprocess.exception.NoSuchSubjectCategoryException;
import io.jetprocess.model.SubjectCategory;
import io.jetprocess.model.SubjectCategoryTable;
import io.jetprocess.model.impl.SubjectCategoryImpl;
import io.jetprocess.model.impl.SubjectCategoryModelImpl;
import io.jetprocess.service.persistence.SubjectCategoryPersistence;
import io.jetprocess.service.persistence.SubjectCategoryUtil;
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
 * The persistence implementation for the subject category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {SubjectCategoryPersistence.class, BasePersistence.class})
public class SubjectCategoryPersistenceImpl
	extends BasePersistenceImpl<SubjectCategory>
	implements SubjectCategoryPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SubjectCategoryUtil</code> to access the subject category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SubjectCategoryImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public SubjectCategoryPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);

		setModelClass(SubjectCategory.class);

		setModelImplClass(SubjectCategoryImpl.class);
		setModelPKClass(long.class);

		setTable(SubjectCategoryTable.INSTANCE);
	}

	/**
	 * Caches the subject category in the entity cache if it is enabled.
	 *
	 * @param subjectCategory the subject category
	 */
	@Override
	public void cacheResult(SubjectCategory subjectCategory) {
		entityCache.putResult(
			SubjectCategoryImpl.class, subjectCategory.getPrimaryKey(),
			subjectCategory);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the subject categories in the entity cache if it is enabled.
	 *
	 * @param subjectCategories the subject categories
	 */
	@Override
	public void cacheResult(List<SubjectCategory> subjectCategories) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (subjectCategories.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SubjectCategory subjectCategory : subjectCategories) {
			if (entityCache.getResult(
					SubjectCategoryImpl.class,
					subjectCategory.getPrimaryKey()) == null) {

				cacheResult(subjectCategory);
			}
		}
	}

	/**
	 * Clears the cache for all subject categories.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SubjectCategoryImpl.class);

		finderCache.clearCache(SubjectCategoryImpl.class);
	}

	/**
	 * Clears the cache for the subject category.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SubjectCategory subjectCategory) {
		entityCache.removeResult(SubjectCategoryImpl.class, subjectCategory);
	}

	@Override
	public void clearCache(List<SubjectCategory> subjectCategories) {
		for (SubjectCategory subjectCategory : subjectCategories) {
			entityCache.removeResult(
				SubjectCategoryImpl.class, subjectCategory);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SubjectCategoryImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SubjectCategoryImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new subject category with the primary key. Does not add the subject category to the database.
	 *
	 * @param id the primary key for the new subject category
	 * @return the new subject category
	 */
	@Override
	public SubjectCategory create(long id) {
		SubjectCategory subjectCategory = new SubjectCategoryImpl();

		subjectCategory.setNew(true);
		subjectCategory.setPrimaryKey(id);

		return subjectCategory;
	}

	/**
	 * Removes the subject category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the subject category
	 * @return the subject category that was removed
	 * @throws NoSuchSubjectCategoryException if a subject category with the primary key could not be found
	 */
	@Override
	public SubjectCategory remove(long id)
		throws NoSuchSubjectCategoryException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the subject category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the subject category
	 * @return the subject category that was removed
	 * @throws NoSuchSubjectCategoryException if a subject category with the primary key could not be found
	 */
	@Override
	public SubjectCategory remove(Serializable primaryKey)
		throws NoSuchSubjectCategoryException {

		Session session = null;

		try {
			session = openSession();

			SubjectCategory subjectCategory = (SubjectCategory)session.get(
				SubjectCategoryImpl.class, primaryKey);

			if (subjectCategory == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSubjectCategoryException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(subjectCategory);
		}
		catch (NoSuchSubjectCategoryException noSuchEntityException) {
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
	protected SubjectCategory removeImpl(SubjectCategory subjectCategory) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(subjectCategory)) {
				subjectCategory = (SubjectCategory)session.get(
					SubjectCategoryImpl.class,
					subjectCategory.getPrimaryKeyObj());
			}

			if (subjectCategory != null) {
				session.delete(subjectCategory);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (subjectCategory != null) {
			clearCache(subjectCategory);
		}

		return subjectCategory;
	}

	@Override
	public SubjectCategory updateImpl(SubjectCategory subjectCategory) {
		boolean isNew = subjectCategory.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(subjectCategory);
			}
			else {
				subjectCategory = (SubjectCategory)session.merge(
					subjectCategory);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SubjectCategoryImpl.class, subjectCategory, false, true);

		if (isNew) {
			subjectCategory.setNew(false);
		}

		subjectCategory.resetOriginalValues();

		return subjectCategory;
	}

	/**
	 * Returns the subject category with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the subject category
	 * @return the subject category
	 * @throws NoSuchSubjectCategoryException if a subject category with the primary key could not be found
	 */
	@Override
	public SubjectCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSubjectCategoryException {

		SubjectCategory subjectCategory = fetchByPrimaryKey(primaryKey);

		if (subjectCategory == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSubjectCategoryException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return subjectCategory;
	}

	/**
	 * Returns the subject category with the primary key or throws a <code>NoSuchSubjectCategoryException</code> if it could not be found.
	 *
	 * @param id the primary key of the subject category
	 * @return the subject category
	 * @throws NoSuchSubjectCategoryException if a subject category with the primary key could not be found
	 */
	@Override
	public SubjectCategory findByPrimaryKey(long id)
		throws NoSuchSubjectCategoryException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the subject category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the subject category
	 * @return the subject category, or <code>null</code> if a subject category with the primary key could not be found
	 */
	@Override
	public SubjectCategory fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the subject categories.
	 *
	 * @return the subject categories
	 */
	@Override
	public List<SubjectCategory> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the subject categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject categories
	 * @param end the upper bound of the range of subject categories (not inclusive)
	 * @return the range of subject categories
	 */
	@Override
	public List<SubjectCategory> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the subject categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject categories
	 * @param end the upper bound of the range of subject categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of subject categories
	 */
	@Override
	public List<SubjectCategory> findAll(
		int start, int end,
		OrderByComparator<SubjectCategory> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the subject categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SubjectCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject categories
	 * @param end the upper bound of the range of subject categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of subject categories
	 */
	@Override
	public List<SubjectCategory> findAll(
		int start, int end,
		OrderByComparator<SubjectCategory> orderByComparator,
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

		List<SubjectCategory> list = null;

		if (useFinderCache) {
			list = (List<SubjectCategory>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SUBJECTCATEGORY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SUBJECTCATEGORY;

				sql = sql.concat(SubjectCategoryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SubjectCategory>)QueryUtil.list(
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
	 * Removes all the subject categories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SubjectCategory subjectCategory : findAll()) {
			remove(subjectCategory);
		}
	}

	/**
	 * Returns the number of subject categories.
	 *
	 * @return the number of subject categories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SUBJECTCATEGORY);

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
		return _SQL_SELECT_SUBJECTCATEGORY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SubjectCategoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the subject category persistence.
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

		_setSubjectCategoryUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setSubjectCategoryUtilPersistence(null);

		entityCache.removeCache(SubjectCategoryImpl.class.getName());
	}

	private void _setSubjectCategoryUtilPersistence(
		SubjectCategoryPersistence subjectCategoryPersistence) {

		try {
			Field field = SubjectCategoryUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, subjectCategoryPersistence);
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

	private static final String _SQL_SELECT_SUBJECTCATEGORY =
		"SELECT subjectCategory FROM SubjectCategory subjectCategory";

	private static final String _SQL_COUNT_SUBJECTCATEGORY =
		"SELECT COUNT(subjectCategory) FROM SubjectCategory subjectCategory";

	private static final String _ORDER_BY_ENTITY_ALIAS = "subjectCategory.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SubjectCategory exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		SubjectCategoryPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private SubjectCategoryModelArgumentsResolver
		_subjectCategoryModelArgumentsResolver;

}