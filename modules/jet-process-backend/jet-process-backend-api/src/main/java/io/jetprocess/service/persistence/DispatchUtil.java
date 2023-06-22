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

import io.jetprocess.model.Dispatch;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the dispatch service. This utility wraps <code>io.jetprocess.service.persistence.impl.DispatchPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DispatchPersistence
 * @generated
 */
public class DispatchUtil {

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
	public static void clearCache(Dispatch dispatch) {
		getPersistence().clearCache(dispatch);
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
	public static Map<Serializable, Dispatch> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Dispatch> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Dispatch> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Dispatch> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Dispatch> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Dispatch update(Dispatch dispatch) {
		return getPersistence().update(dispatch);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Dispatch update(
		Dispatch dispatch, ServiceContext serviceContext) {

		return getPersistence().update(dispatch, serviceContext);
	}

	/**
	 * Returns all the dispatches where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dispatches
	 */
	public static List<Dispatch> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the dispatches where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @return the range of matching dispatches
	 */
	public static List<Dispatch> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatches where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatches
	 */
	public static List<Dispatch> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Dispatch> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dispatches where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dispatches
	 */
	public static List<Dispatch> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Dispatch> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dispatch in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch
	 * @throws NoSuchDispatchException if a matching dispatch could not be found
	 */
	public static Dispatch findByUuid_First(
			String uuid, OrderByComparator<Dispatch> orderByComparator)
		throws io.jetprocess.exception.NoSuchDispatchException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first dispatch in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public static Dispatch fetchByUuid_First(
		String uuid, OrderByComparator<Dispatch> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last dispatch in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch
	 * @throws NoSuchDispatchException if a matching dispatch could not be found
	 */
	public static Dispatch findByUuid_Last(
			String uuid, OrderByComparator<Dispatch> orderByComparator)
		throws io.jetprocess.exception.NoSuchDispatchException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last dispatch in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public static Dispatch fetchByUuid_Last(
		String uuid, OrderByComparator<Dispatch> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the dispatches before and after the current dispatch in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current dispatch
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch
	 * @throws NoSuchDispatchException if a dispatch with the primary key could not be found
	 */
	public static Dispatch[] findByUuid_PrevAndNext(
			long id, String uuid, OrderByComparator<Dispatch> orderByComparator)
		throws io.jetprocess.exception.NoSuchDispatchException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the dispatches where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of dispatches where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dispatches
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the dispatch where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDispatchException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dispatch
	 * @throws NoSuchDispatchException if a matching dispatch could not be found
	 */
	public static Dispatch findByUUID_G(String uuid, long groupId)
		throws io.jetprocess.exception.NoSuchDispatchException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the dispatch where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public static Dispatch fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the dispatch where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public static Dispatch fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the dispatch where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dispatch that was removed
	 */
	public static Dispatch removeByUUID_G(String uuid, long groupId)
		throws io.jetprocess.exception.NoSuchDispatchException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of dispatches where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dispatches
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the dispatches where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dispatches
	 */
	public static List<Dispatch> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the dispatches where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @return the range of matching dispatches
	 */
	public static List<Dispatch> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatches where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatches
	 */
	public static List<Dispatch> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Dispatch> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dispatches where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dispatches
	 */
	public static List<Dispatch> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Dispatch> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dispatch in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch
	 * @throws NoSuchDispatchException if a matching dispatch could not be found
	 */
	public static Dispatch findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Dispatch> orderByComparator)
		throws io.jetprocess.exception.NoSuchDispatchException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first dispatch in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public static Dispatch fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Dispatch> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last dispatch in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch
	 * @throws NoSuchDispatchException if a matching dispatch could not be found
	 */
	public static Dispatch findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Dispatch> orderByComparator)
		throws io.jetprocess.exception.NoSuchDispatchException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last dispatch in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public static Dispatch fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Dispatch> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the dispatches before and after the current dispatch in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current dispatch
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch
	 * @throws NoSuchDispatchException if a dispatch with the primary key could not be found
	 */
	public static Dispatch[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<Dispatch> orderByComparator)
		throws io.jetprocess.exception.NoSuchDispatchException {

		return getPersistence().findByUuid_C_PrevAndNext(
			id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the dispatches where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of dispatches where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dispatches
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the dispatch in the entity cache if it is enabled.
	 *
	 * @param dispatch the dispatch
	 */
	public static void cacheResult(Dispatch dispatch) {
		getPersistence().cacheResult(dispatch);
	}

	/**
	 * Caches the dispatches in the entity cache if it is enabled.
	 *
	 * @param dispatches the dispatches
	 */
	public static void cacheResult(List<Dispatch> dispatches) {
		getPersistence().cacheResult(dispatches);
	}

	/**
	 * Creates a new dispatch with the primary key. Does not add the dispatch to the database.
	 *
	 * @param id the primary key for the new dispatch
	 * @return the new dispatch
	 */
	public static Dispatch create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the dispatch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dispatch
	 * @return the dispatch that was removed
	 * @throws NoSuchDispatchException if a dispatch with the primary key could not be found
	 */
	public static Dispatch remove(long id)
		throws io.jetprocess.exception.NoSuchDispatchException {

		return getPersistence().remove(id);
	}

	public static Dispatch updateImpl(Dispatch dispatch) {
		return getPersistence().updateImpl(dispatch);
	}

	/**
	 * Returns the dispatch with the primary key or throws a <code>NoSuchDispatchException</code> if it could not be found.
	 *
	 * @param id the primary key of the dispatch
	 * @return the dispatch
	 * @throws NoSuchDispatchException if a dispatch with the primary key could not be found
	 */
	public static Dispatch findByPrimaryKey(long id)
		throws io.jetprocess.exception.NoSuchDispatchException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the dispatch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dispatch
	 * @return the dispatch, or <code>null</code> if a dispatch with the primary key could not be found
	 */
	public static Dispatch fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the dispatches.
	 *
	 * @return the dispatches
	 */
	public static List<Dispatch> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dispatches.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @return the range of dispatches
	 */
	public static List<Dispatch> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dispatches.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dispatches
	 */
	public static List<Dispatch> findAll(
		int start, int end, OrderByComparator<Dispatch> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dispatches.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dispatches
	 */
	public static List<Dispatch> findAll(
		int start, int end, OrderByComparator<Dispatch> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dispatches from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dispatches.
	 *
	 * @return the number of dispatches
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DispatchPersistence getPersistence() {
		return _persistence;
	}

	private static volatile DispatchPersistence _persistence;

}