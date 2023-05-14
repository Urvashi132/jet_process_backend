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

import io.jetprocess.model.FileCategory;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the file category service. This utility wraps <code>io.jetprocess.service.persistence.impl.FileCategoryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FileCategoryPersistence
 * @generated
 */
public class FileCategoryUtil {

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
	public static void clearCache(FileCategory fileCategory) {
		getPersistence().clearCache(fileCategory);
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
	public static Map<Serializable, FileCategory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FileCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FileCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FileCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FileCategory> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FileCategory update(FileCategory fileCategory) {
		return getPersistence().update(fileCategory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FileCategory update(
		FileCategory fileCategory, ServiceContext serviceContext) {

		return getPersistence().update(fileCategory, serviceContext);
	}

	/**
	 * Caches the file category in the entity cache if it is enabled.
	 *
	 * @param fileCategory the file category
	 */
	public static void cacheResult(FileCategory fileCategory) {
		getPersistence().cacheResult(fileCategory);
	}

	/**
	 * Caches the file categories in the entity cache if it is enabled.
	 *
	 * @param fileCategories the file categories
	 */
	public static void cacheResult(List<FileCategory> fileCategories) {
		getPersistence().cacheResult(fileCategories);
	}

	/**
	 * Creates a new file category with the primary key. Does not add the file category to the database.
	 *
	 * @param id the primary key for the new file category
	 * @return the new file category
	 */
	public static FileCategory create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the file category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the file category
	 * @return the file category that was removed
	 * @throws NoSuchFileCategoryException if a file category with the primary key could not be found
	 */
	public static FileCategory remove(long id)
		throws io.jetprocess.exception.NoSuchFileCategoryException {

		return getPersistence().remove(id);
	}

	public static FileCategory updateImpl(FileCategory fileCategory) {
		return getPersistence().updateImpl(fileCategory);
	}

	/**
	 * Returns the file category with the primary key or throws a <code>NoSuchFileCategoryException</code> if it could not be found.
	 *
	 * @param id the primary key of the file category
	 * @return the file category
	 * @throws NoSuchFileCategoryException if a file category with the primary key could not be found
	 */
	public static FileCategory findByPrimaryKey(long id)
		throws io.jetprocess.exception.NoSuchFileCategoryException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the file category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the file category
	 * @return the file category, or <code>null</code> if a file category with the primary key could not be found
	 */
	public static FileCategory fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the file categories.
	 *
	 * @return the file categories
	 */
	public static List<FileCategory> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the file categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FileCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of file categories
	 * @param end the upper bound of the range of file categories (not inclusive)
	 * @return the range of file categories
	 */
	public static List<FileCategory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the file categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FileCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of file categories
	 * @param end the upper bound of the range of file categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of file categories
	 */
	public static List<FileCategory> findAll(
		int start, int end, OrderByComparator<FileCategory> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the file categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FileCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of file categories
	 * @param end the upper bound of the range of file categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of file categories
	 */
	public static List<FileCategory> findAll(
		int start, int end, OrderByComparator<FileCategory> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the file categories from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of file categories.
	 *
	 * @return the number of file categories
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FileCategoryPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FileCategoryPersistence _persistence;

}