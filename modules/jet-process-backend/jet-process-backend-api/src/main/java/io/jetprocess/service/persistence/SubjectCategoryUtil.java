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

package io.jetprocess.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import io.jetprocess.model.SubjectCategory;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the subject category service. This utility wraps <code>io.jetprocess.service.persistence.impl.SubjectCategoryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubjectCategoryPersistence
 * @generated
 */
public class SubjectCategoryUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(SubjectCategory subjectCategory) {
		getPersistence().clearCache(subjectCategory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, SubjectCategory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SubjectCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SubjectCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SubjectCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SubjectCategory> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SubjectCategory update(SubjectCategory subjectCategory) {
		return getPersistence().update(subjectCategory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SubjectCategory update(
		SubjectCategory subjectCategory, ServiceContext serviceContext) {

		return getPersistence().update(subjectCategory, serviceContext);
	}

	/**
	 * Caches the subject category in the entity cache if it is enabled.
	 *
	 * @param subjectCategory the subject category
	 */
	public static void cacheResult(SubjectCategory subjectCategory) {
		getPersistence().cacheResult(subjectCategory);
	}

	/**
	 * Caches the subject categories in the entity cache if it is enabled.
	 *
	 * @param subjectCategories the subject categories
	 */
	public static void cacheResult(List<SubjectCategory> subjectCategories) {
		getPersistence().cacheResult(subjectCategories);
	}

	/**
	 * Creates a new subject category with the primary key. Does not add the subject category to the database.
	 *
	 * @param id the primary key for the new subject category
	 * @return the new subject category
	 */
	public static SubjectCategory create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the subject category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the subject category
	 * @return the subject category that was removed
	 * @throws NoSuchSubjectCategoryException if a subject category with the primary key could not be found
	 */
	public static SubjectCategory remove(long id)
		throws io.jetprocess.exception.NoSuchSubjectCategoryException {

		return getPersistence().remove(id);
	}

	public static SubjectCategory updateImpl(SubjectCategory subjectCategory) {
		return getPersistence().updateImpl(subjectCategory);
	}

	/**
	 * Returns the subject category with the primary key or throws a <code>NoSuchSubjectCategoryException</code> if it could not be found.
	 *
	 * @param id the primary key of the subject category
	 * @return the subject category
	 * @throws NoSuchSubjectCategoryException if a subject category with the primary key could not be found
	 */
	public static SubjectCategory findByPrimaryKey(long id)
		throws io.jetprocess.exception.NoSuchSubjectCategoryException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the subject category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the subject category
	 * @return the subject category, or <code>null</code> if a subject category with the primary key could not be found
	 */
	public static SubjectCategory fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the subject categories.
	 *
	 * @return the subject categories
	 */
	public static List<SubjectCategory> findAll() {
		return getPersistence().findAll();
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
	public static List<SubjectCategory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<SubjectCategory> findAll(
		int start, int end,
		OrderByComparator<SubjectCategory> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<SubjectCategory> findAll(
		int start, int end,
		OrderByComparator<SubjectCategory> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the subject categories from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of subject categories.
	 *
	 * @return the number of subject categories
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SubjectCategoryPersistence getPersistence() {
		return _persistence;
	}

	private static volatile SubjectCategoryPersistence _persistence;

}