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

import io.jetprocess.model.SecondaryHead;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the secondary head service. This utility wraps <code>io.jetprocess.service.persistence.impl.SecondaryHeadPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondaryHeadPersistence
 * @generated
 */
public class SecondaryHeadUtil {

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
	public static void clearCache(SecondaryHead secondaryHead) {
		getPersistence().clearCache(secondaryHead);
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
	public static Map<Serializable, SecondaryHead> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SecondaryHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SecondaryHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SecondaryHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SecondaryHead update(SecondaryHead secondaryHead) {
		return getPersistence().update(secondaryHead);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SecondaryHead update(
		SecondaryHead secondaryHead, ServiceContext serviceContext) {

		return getPersistence().update(secondaryHead, serviceContext);
	}

	/**
	 * Returns all the secondary heads where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @return the matching secondary heads
	 */
	public static List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId) {

		return getPersistence().findBySecondaryHeadByPrimaryHeadId(
			primaryHeadId);
	}

	/**
	 * Returns a range of all the secondary heads where primaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param primaryHeadId the primary head ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @return the range of matching secondary heads
	 */
	public static List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId, int start, int end) {

		return getPersistence().findBySecondaryHeadByPrimaryHeadId(
			primaryHeadId, start, end);
	}

	/**
	 * Returns an ordered range of all the secondary heads where primaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param primaryHeadId the primary head ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching secondary heads
	 */
	public static List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId, int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator) {

		return getPersistence().findBySecondaryHeadByPrimaryHeadId(
			primaryHeadId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the secondary heads where primaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param primaryHeadId the primary head ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching secondary heads
	 */
	public static List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId, int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBySecondaryHeadByPrimaryHeadId(
			primaryHeadId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	public static SecondaryHead findBySecondaryHeadByPrimaryHeadId_First(
			long primaryHeadId,
			OrderByComparator<SecondaryHead> orderByComparator)
		throws io.jetprocess.exception.NoSuchSecondaryHeadException {

		return getPersistence().findBySecondaryHeadByPrimaryHeadId_First(
			primaryHeadId, orderByComparator);
	}

	/**
	 * Returns the first secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	public static SecondaryHead fetchBySecondaryHeadByPrimaryHeadId_First(
		long primaryHeadId,
		OrderByComparator<SecondaryHead> orderByComparator) {

		return getPersistence().fetchBySecondaryHeadByPrimaryHeadId_First(
			primaryHeadId, orderByComparator);
	}

	/**
	 * Returns the last secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	public static SecondaryHead findBySecondaryHeadByPrimaryHeadId_Last(
			long primaryHeadId,
			OrderByComparator<SecondaryHead> orderByComparator)
		throws io.jetprocess.exception.NoSuchSecondaryHeadException {

		return getPersistence().findBySecondaryHeadByPrimaryHeadId_Last(
			primaryHeadId, orderByComparator);
	}

	/**
	 * Returns the last secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	public static SecondaryHead fetchBySecondaryHeadByPrimaryHeadId_Last(
		long primaryHeadId,
		OrderByComparator<SecondaryHead> orderByComparator) {

		return getPersistence().fetchBySecondaryHeadByPrimaryHeadId_Last(
			primaryHeadId, orderByComparator);
	}

	/**
	 * Returns the secondary heads before and after the current secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the primary key of the current secondary head
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	public static SecondaryHead[]
			findBySecondaryHeadByPrimaryHeadId_PrevAndNext(
				long secondaryHeadId, long primaryHeadId,
				OrderByComparator<SecondaryHead> orderByComparator)
		throws io.jetprocess.exception.NoSuchSecondaryHeadException {

		return getPersistence().findBySecondaryHeadByPrimaryHeadId_PrevAndNext(
			secondaryHeadId, primaryHeadId, orderByComparator);
	}

	/**
	 * Removes all the secondary heads where primaryHeadId = &#63; from the database.
	 *
	 * @param primaryHeadId the primary head ID
	 */
	public static void removeBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId) {

		getPersistence().removeBySecondaryHeadByPrimaryHeadId(primaryHeadId);
	}

	/**
	 * Returns the number of secondary heads where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @return the number of matching secondary heads
	 */
	public static int countBySecondaryHeadByPrimaryHeadId(long primaryHeadId) {
		return getPersistence().countBySecondaryHeadByPrimaryHeadId(
			primaryHeadId);
	}

	/**
	 * Caches the secondary head in the entity cache if it is enabled.
	 *
	 * @param secondaryHead the secondary head
	 */
	public static void cacheResult(SecondaryHead secondaryHead) {
		getPersistence().cacheResult(secondaryHead);
	}

	/**
	 * Caches the secondary heads in the entity cache if it is enabled.
	 *
	 * @param secondaryHeads the secondary heads
	 */
	public static void cacheResult(List<SecondaryHead> secondaryHeads) {
		getPersistence().cacheResult(secondaryHeads);
	}

	/**
	 * Creates a new secondary head with the primary key. Does not add the secondary head to the database.
	 *
	 * @param secondaryHeadId the primary key for the new secondary head
	 * @return the new secondary head
	 */
	public static SecondaryHead create(long secondaryHeadId) {
		return getPersistence().create(secondaryHeadId);
	}

	/**
	 * Removes the secondary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head that was removed
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	public static SecondaryHead remove(long secondaryHeadId)
		throws io.jetprocess.exception.NoSuchSecondaryHeadException {

		return getPersistence().remove(secondaryHeadId);
	}

	public static SecondaryHead updateImpl(SecondaryHead secondaryHead) {
		return getPersistence().updateImpl(secondaryHead);
	}

	/**
	 * Returns the secondary head with the primary key or throws a <code>NoSuchSecondaryHeadException</code> if it could not be found.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	public static SecondaryHead findByPrimaryKey(long secondaryHeadId)
		throws io.jetprocess.exception.NoSuchSecondaryHeadException {

		return getPersistence().findByPrimaryKey(secondaryHeadId);
	}

	/**
	 * Returns the secondary head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head, or <code>null</code> if a secondary head with the primary key could not be found
	 */
	public static SecondaryHead fetchByPrimaryKey(long secondaryHeadId) {
		return getPersistence().fetchByPrimaryKey(secondaryHeadId);
	}

	/**
	 * Returns all the secondary heads.
	 *
	 * @return the secondary heads
	 */
	public static List<SecondaryHead> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the secondary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @return the range of secondary heads
	 */
	public static List<SecondaryHead> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the secondary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of secondary heads
	 */
	public static List<SecondaryHead> findAll(
		int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the secondary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of secondary heads
	 */
	public static List<SecondaryHead> findAll(
		int start, int end, OrderByComparator<SecondaryHead> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the secondary heads from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of secondary heads.
	 *
	 * @return the number of secondary heads
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SecondaryHeadPersistence getPersistence() {
		return _persistence;
	}

	private static volatile SecondaryHeadPersistence _persistence;

}