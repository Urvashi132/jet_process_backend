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

import io.jetprocess.model.TertiaryHead;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tertiary head service. This utility wraps <code>io.jetprocess.service.persistence.impl.TertiaryHeadPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TertiaryHeadPersistence
 * @generated
 */
public class TertiaryHeadUtil {

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
	public static void clearCache(TertiaryHead tertiaryHead) {
		getPersistence().clearCache(tertiaryHead);
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
	public static Map<Serializable, TertiaryHead> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TertiaryHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TertiaryHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TertiaryHead> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TertiaryHead> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TertiaryHead update(TertiaryHead tertiaryHead) {
		return getPersistence().update(tertiaryHead);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TertiaryHead update(
		TertiaryHead tertiaryHead, ServiceContext serviceContext) {

		return getPersistence().update(tertiaryHead, serviceContext);
	}

	/**
	 * Returns all the tertiary heads where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @return the matching tertiary heads
	 */
	public static List<TertiaryHead> findByTertiaryHeadBySecondaryHeadId(
		long secondaryHeadId) {

		return getPersistence().findByTertiaryHeadBySecondaryHeadId(
			secondaryHeadId);
	}

	/**
	 * Returns a range of all the tertiary heads where secondaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @return the range of matching tertiary heads
	 */
	public static List<TertiaryHead> findByTertiaryHeadBySecondaryHeadId(
		long secondaryHeadId, int start, int end) {

		return getPersistence().findByTertiaryHeadBySecondaryHeadId(
			secondaryHeadId, start, end);
	}

	/**
	 * Returns an ordered range of all the tertiary heads where secondaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tertiary heads
	 */
	public static List<TertiaryHead> findByTertiaryHeadBySecondaryHeadId(
		long secondaryHeadId, int start, int end,
		OrderByComparator<TertiaryHead> orderByComparator) {

		return getPersistence().findByTertiaryHeadBySecondaryHeadId(
			secondaryHeadId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tertiary heads where secondaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tertiary heads
	 */
	public static List<TertiaryHead> findByTertiaryHeadBySecondaryHeadId(
		long secondaryHeadId, int start, int end,
		OrderByComparator<TertiaryHead> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByTertiaryHeadBySecondaryHeadId(
			secondaryHeadId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tertiary head in the ordered set where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tertiary head
	 * @throws NoSuchTertiaryHeadException if a matching tertiary head could not be found
	 */
	public static TertiaryHead findByTertiaryHeadBySecondaryHeadId_First(
			long secondaryHeadId,
			OrderByComparator<TertiaryHead> orderByComparator)
		throws io.jetprocess.exception.NoSuchTertiaryHeadException {

		return getPersistence().findByTertiaryHeadBySecondaryHeadId_First(
			secondaryHeadId, orderByComparator);
	}

	/**
	 * Returns the first tertiary head in the ordered set where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tertiary head, or <code>null</code> if a matching tertiary head could not be found
	 */
	public static TertiaryHead fetchByTertiaryHeadBySecondaryHeadId_First(
		long secondaryHeadId,
		OrderByComparator<TertiaryHead> orderByComparator) {

		return getPersistence().fetchByTertiaryHeadBySecondaryHeadId_First(
			secondaryHeadId, orderByComparator);
	}

	/**
	 * Returns the last tertiary head in the ordered set where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tertiary head
	 * @throws NoSuchTertiaryHeadException if a matching tertiary head could not be found
	 */
	public static TertiaryHead findByTertiaryHeadBySecondaryHeadId_Last(
			long secondaryHeadId,
			OrderByComparator<TertiaryHead> orderByComparator)
		throws io.jetprocess.exception.NoSuchTertiaryHeadException {

		return getPersistence().findByTertiaryHeadBySecondaryHeadId_Last(
			secondaryHeadId, orderByComparator);
	}

	/**
	 * Returns the last tertiary head in the ordered set where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tertiary head, or <code>null</code> if a matching tertiary head could not be found
	 */
	public static TertiaryHead fetchByTertiaryHeadBySecondaryHeadId_Last(
		long secondaryHeadId,
		OrderByComparator<TertiaryHead> orderByComparator) {

		return getPersistence().fetchByTertiaryHeadBySecondaryHeadId_Last(
			secondaryHeadId, orderByComparator);
	}

	/**
	 * Returns the tertiary heads before and after the current tertiary head in the ordered set where secondaryHeadId = &#63;.
	 *
	 * @param tertiaryHeadId the primary key of the current tertiary head
	 * @param secondaryHeadId the secondary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tertiary head
	 * @throws NoSuchTertiaryHeadException if a tertiary head with the primary key could not be found
	 */
	public static TertiaryHead[]
			findByTertiaryHeadBySecondaryHeadId_PrevAndNext(
				long tertiaryHeadId, long secondaryHeadId,
				OrderByComparator<TertiaryHead> orderByComparator)
		throws io.jetprocess.exception.NoSuchTertiaryHeadException {

		return getPersistence().findByTertiaryHeadBySecondaryHeadId_PrevAndNext(
			tertiaryHeadId, secondaryHeadId, orderByComparator);
	}

	/**
	 * Removes all the tertiary heads where secondaryHeadId = &#63; from the database.
	 *
	 * @param secondaryHeadId the secondary head ID
	 */
	public static void removeByTertiaryHeadBySecondaryHeadId(
		long secondaryHeadId) {

		getPersistence().removeByTertiaryHeadBySecondaryHeadId(secondaryHeadId);
	}

	/**
	 * Returns the number of tertiary heads where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @return the number of matching tertiary heads
	 */
	public static int countByTertiaryHeadBySecondaryHeadId(
		long secondaryHeadId) {

		return getPersistence().countByTertiaryHeadBySecondaryHeadId(
			secondaryHeadId);
	}

	/**
	 * Caches the tertiary head in the entity cache if it is enabled.
	 *
	 * @param tertiaryHead the tertiary head
	 */
	public static void cacheResult(TertiaryHead tertiaryHead) {
		getPersistence().cacheResult(tertiaryHead);
	}

	/**
	 * Caches the tertiary heads in the entity cache if it is enabled.
	 *
	 * @param tertiaryHeads the tertiary heads
	 */
	public static void cacheResult(List<TertiaryHead> tertiaryHeads) {
		getPersistence().cacheResult(tertiaryHeads);
	}

	/**
	 * Creates a new tertiary head with the primary key. Does not add the tertiary head to the database.
	 *
	 * @param tertiaryHeadId the primary key for the new tertiary head
	 * @return the new tertiary head
	 */
	public static TertiaryHead create(long tertiaryHeadId) {
		return getPersistence().create(tertiaryHeadId);
	}

	/**
	 * Removes the tertiary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tertiaryHeadId the primary key of the tertiary head
	 * @return the tertiary head that was removed
	 * @throws NoSuchTertiaryHeadException if a tertiary head with the primary key could not be found
	 */
	public static TertiaryHead remove(long tertiaryHeadId)
		throws io.jetprocess.exception.NoSuchTertiaryHeadException {

		return getPersistence().remove(tertiaryHeadId);
	}

	public static TertiaryHead updateImpl(TertiaryHead tertiaryHead) {
		return getPersistence().updateImpl(tertiaryHead);
	}

	/**
	 * Returns the tertiary head with the primary key or throws a <code>NoSuchTertiaryHeadException</code> if it could not be found.
	 *
	 * @param tertiaryHeadId the primary key of the tertiary head
	 * @return the tertiary head
	 * @throws NoSuchTertiaryHeadException if a tertiary head with the primary key could not be found
	 */
	public static TertiaryHead findByPrimaryKey(long tertiaryHeadId)
		throws io.jetprocess.exception.NoSuchTertiaryHeadException {

		return getPersistence().findByPrimaryKey(tertiaryHeadId);
	}

	/**
	 * Returns the tertiary head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tertiaryHeadId the primary key of the tertiary head
	 * @return the tertiary head, or <code>null</code> if a tertiary head with the primary key could not be found
	 */
	public static TertiaryHead fetchByPrimaryKey(long tertiaryHeadId) {
		return getPersistence().fetchByPrimaryKey(tertiaryHeadId);
	}

	/**
	 * Returns all the tertiary heads.
	 *
	 * @return the tertiary heads
	 */
	public static List<TertiaryHead> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tertiary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @return the range of tertiary heads
	 */
	public static List<TertiaryHead> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tertiary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tertiary heads
	 */
	public static List<TertiaryHead> findAll(
		int start, int end, OrderByComparator<TertiaryHead> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tertiary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tertiary heads
	 */
	public static List<TertiaryHead> findAll(
		int start, int end, OrderByComparator<TertiaryHead> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tertiary heads from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tertiary heads.
	 *
	 * @return the number of tertiary heads
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TertiaryHeadPersistence getPersistence() {
		return _persistence;
	}

	private static volatile TertiaryHeadPersistence _persistence;

}