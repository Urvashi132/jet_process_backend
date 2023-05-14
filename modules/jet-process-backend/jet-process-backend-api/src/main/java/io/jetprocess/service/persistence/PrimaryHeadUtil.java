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

import io.jetprocess.model.PrimaryHead;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the primary head service. This utility wraps <code>io.jetprocess.service.persistence.impl.PrimaryHeadPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PrimaryHeadPersistence
 * @generated
 */
public class PrimaryHeadUtil {

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
	public static void clearCache(PrimaryHead primaryHead) {
		getPersistence().clearCache(primaryHead);
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
	public static Map<Serializable, PrimaryHead> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PrimaryHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PrimaryHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PrimaryHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PrimaryHead> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PrimaryHead update(PrimaryHead primaryHead) {
		return getPersistence().update(primaryHead);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PrimaryHead update(
		PrimaryHead primaryHead, ServiceContext serviceContext) {

		return getPersistence().update(primaryHead, serviceContext);
	}

	/**
	 * Returns all the primary heads where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @return the matching primary heads
	 */
	public static List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId) {

		return getPersistence().findByPrimaryHeadByBasicHeadId(basicHeadId);
	}

	/**
	 * Returns a range of all the primary heads where basicHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param basicHeadId the basic head ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @return the range of matching primary heads
	 */
	public static List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId, int start, int end) {

		return getPersistence().findByPrimaryHeadByBasicHeadId(
			basicHeadId, start, end);
	}

	/**
	 * Returns an ordered range of all the primary heads where basicHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param basicHeadId the basic head ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching primary heads
	 */
	public static List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId, int start, int end,
		OrderByComparator<PrimaryHead> orderByComparator) {

		return getPersistence().findByPrimaryHeadByBasicHeadId(
			basicHeadId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the primary heads where basicHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param basicHeadId the basic head ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching primary heads
	 */
	public static List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId, int start, int end,
		OrderByComparator<PrimaryHead> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByPrimaryHeadByBasicHeadId(
			basicHeadId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	public static PrimaryHead findByPrimaryHeadByBasicHeadId_First(
			long basicHeadId, OrderByComparator<PrimaryHead> orderByComparator)
		throws io.jetprocess.exception.NoSuchPrimaryHeadException {

		return getPersistence().findByPrimaryHeadByBasicHeadId_First(
			basicHeadId, orderByComparator);
	}

	/**
	 * Returns the first primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	public static PrimaryHead fetchByPrimaryHeadByBasicHeadId_First(
		long basicHeadId, OrderByComparator<PrimaryHead> orderByComparator) {

		return getPersistence().fetchByPrimaryHeadByBasicHeadId_First(
			basicHeadId, orderByComparator);
	}

	/**
	 * Returns the last primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	public static PrimaryHead findByPrimaryHeadByBasicHeadId_Last(
			long basicHeadId, OrderByComparator<PrimaryHead> orderByComparator)
		throws io.jetprocess.exception.NoSuchPrimaryHeadException {

		return getPersistence().findByPrimaryHeadByBasicHeadId_Last(
			basicHeadId, orderByComparator);
	}

	/**
	 * Returns the last primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	public static PrimaryHead fetchByPrimaryHeadByBasicHeadId_Last(
		long basicHeadId, OrderByComparator<PrimaryHead> orderByComparator) {

		return getPersistence().fetchByPrimaryHeadByBasicHeadId_Last(
			basicHeadId, orderByComparator);
	}

	/**
	 * Returns the primary heads before and after the current primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param id the primary key of the current primary head
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next primary head
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	public static PrimaryHead[] findByPrimaryHeadByBasicHeadId_PrevAndNext(
			long id, long basicHeadId,
			OrderByComparator<PrimaryHead> orderByComparator)
		throws io.jetprocess.exception.NoSuchPrimaryHeadException {

		return getPersistence().findByPrimaryHeadByBasicHeadId_PrevAndNext(
			id, basicHeadId, orderByComparator);
	}

	/**
	 * Removes all the primary heads where basicHeadId = &#63; from the database.
	 *
	 * @param basicHeadId the basic head ID
	 */
	public static void removeByPrimaryHeadByBasicHeadId(long basicHeadId) {
		getPersistence().removeByPrimaryHeadByBasicHeadId(basicHeadId);
	}

	/**
	 * Returns the number of primary heads where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @return the number of matching primary heads
	 */
	public static int countByPrimaryHeadByBasicHeadId(long basicHeadId) {
		return getPersistence().countByPrimaryHeadByBasicHeadId(basicHeadId);
	}

	/**
	 * Caches the primary head in the entity cache if it is enabled.
	 *
	 * @param primaryHead the primary head
	 */
	public static void cacheResult(PrimaryHead primaryHead) {
		getPersistence().cacheResult(primaryHead);
	}

	/**
	 * Caches the primary heads in the entity cache if it is enabled.
	 *
	 * @param primaryHeads the primary heads
	 */
	public static void cacheResult(List<PrimaryHead> primaryHeads) {
		getPersistence().cacheResult(primaryHeads);
	}

	/**
	 * Creates a new primary head with the primary key. Does not add the primary head to the database.
	 *
	 * @param id the primary key for the new primary head
	 * @return the new primary head
	 */
	public static PrimaryHead create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the primary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the primary head
	 * @return the primary head that was removed
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	public static PrimaryHead remove(long id)
		throws io.jetprocess.exception.NoSuchPrimaryHeadException {

		return getPersistence().remove(id);
	}

	public static PrimaryHead updateImpl(PrimaryHead primaryHead) {
		return getPersistence().updateImpl(primaryHead);
	}

	/**
	 * Returns the primary head with the primary key or throws a <code>NoSuchPrimaryHeadException</code> if it could not be found.
	 *
	 * @param id the primary key of the primary head
	 * @return the primary head
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	public static PrimaryHead findByPrimaryKey(long id)
		throws io.jetprocess.exception.NoSuchPrimaryHeadException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the primary head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the primary head
	 * @return the primary head, or <code>null</code> if a primary head with the primary key could not be found
	 */
	public static PrimaryHead fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the primary heads.
	 *
	 * @return the primary heads
	 */
	public static List<PrimaryHead> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the primary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @return the range of primary heads
	 */
	public static List<PrimaryHead> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the primary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of primary heads
	 */
	public static List<PrimaryHead> findAll(
		int start, int end, OrderByComparator<PrimaryHead> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the primary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of primary heads
	 */
	public static List<PrimaryHead> findAll(
		int start, int end, OrderByComparator<PrimaryHead> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the primary heads from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of primary heads.
	 *
	 * @return the number of primary heads
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PrimaryHeadPersistence getPersistence() {
		return _persistence;
	}

	private static volatile PrimaryHeadPersistence _persistence;

}