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

import io.jetprocess.model.BasicHead;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the basic head service. This utility wraps <code>io.jetprocess.service.persistence.impl.BasicHeadPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BasicHeadPersistence
 * @generated
 */
public class BasicHeadUtil {

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
	public static void clearCache(BasicHead basicHead) {
		getPersistence().clearCache(basicHead);
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
	public static Map<Serializable, BasicHead> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<BasicHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BasicHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BasicHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BasicHead> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BasicHead update(BasicHead basicHead) {
		return getPersistence().update(basicHead);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BasicHead update(
		BasicHead basicHead, ServiceContext serviceContext) {

		return getPersistence().update(basicHead, serviceContext);
	}

	/**
	 * Caches the basic head in the entity cache if it is enabled.
	 *
	 * @param basicHead the basic head
	 */
	public static void cacheResult(BasicHead basicHead) {
		getPersistence().cacheResult(basicHead);
	}

	/**
	 * Caches the basic heads in the entity cache if it is enabled.
	 *
	 * @param basicHeads the basic heads
	 */
	public static void cacheResult(List<BasicHead> basicHeads) {
		getPersistence().cacheResult(basicHeads);
	}

	/**
	 * Creates a new basic head with the primary key. Does not add the basic head to the database.
	 *
	 * @param id the primary key for the new basic head
	 * @return the new basic head
	 */
	public static BasicHead create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the basic head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the basic head
	 * @return the basic head that was removed
	 * @throws NoSuchBasicHeadException if a basic head with the primary key could not be found
	 */
	public static BasicHead remove(long id)
		throws io.jetprocess.exception.NoSuchBasicHeadException {

		return getPersistence().remove(id);
	}

	public static BasicHead updateImpl(BasicHead basicHead) {
		return getPersistence().updateImpl(basicHead);
	}

	/**
	 * Returns the basic head with the primary key or throws a <code>NoSuchBasicHeadException</code> if it could not be found.
	 *
	 * @param id the primary key of the basic head
	 * @return the basic head
	 * @throws NoSuchBasicHeadException if a basic head with the primary key could not be found
	 */
	public static BasicHead findByPrimaryKey(long id)
		throws io.jetprocess.exception.NoSuchBasicHeadException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the basic head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the basic head
	 * @return the basic head, or <code>null</code> if a basic head with the primary key could not be found
	 */
	public static BasicHead fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the basic heads.
	 *
	 * @return the basic heads
	 */
	public static List<BasicHead> findAll() {
		return getPersistence().findAll();
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
	public static List<BasicHead> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<BasicHead> findAll(
		int start, int end, OrderByComparator<BasicHead> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<BasicHead> findAll(
		int start, int end, OrderByComparator<BasicHead> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the basic heads from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of basic heads.
	 *
	 * @return the number of basic heads
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static BasicHeadPersistence getPersistence() {
		return _persistence;
	}

	private static volatile BasicHeadPersistence _persistence;

}