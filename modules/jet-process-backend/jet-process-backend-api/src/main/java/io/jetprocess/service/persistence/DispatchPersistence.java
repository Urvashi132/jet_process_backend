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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import io.jetprocess.exception.NoSuchDispatchException;
import io.jetprocess.model.Dispatch;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the dispatch service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DispatchUtil
 * @generated
 */
@ProviderType
public interface DispatchPersistence extends BasePersistence<Dispatch> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DispatchUtil} to access the dispatch persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the dispatches where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dispatches
	 */
	public java.util.List<Dispatch> findByUuid(String uuid);

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
	public java.util.List<Dispatch> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Dispatch> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
			orderByComparator);

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
	public java.util.List<Dispatch> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dispatch in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch
	 * @throws NoSuchDispatchException if a matching dispatch could not be found
	 */
	public Dispatch findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
				orderByComparator)
		throws NoSuchDispatchException;

	/**
	 * Returns the first dispatch in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public Dispatch fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
			orderByComparator);

	/**
	 * Returns the last dispatch in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch
	 * @throws NoSuchDispatchException if a matching dispatch could not be found
	 */
	public Dispatch findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
				orderByComparator)
		throws NoSuchDispatchException;

	/**
	 * Returns the last dispatch in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public Dispatch fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
			orderByComparator);

	/**
	 * Returns the dispatches before and after the current dispatch in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current dispatch
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch
	 * @throws NoSuchDispatchException if a dispatch with the primary key could not be found
	 */
	public Dispatch[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
				orderByComparator)
		throws NoSuchDispatchException;

	/**
	 * Removes all the dispatches where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of dispatches where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dispatches
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the dispatch where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDispatchException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dispatch
	 * @throws NoSuchDispatchException if a matching dispatch could not be found
	 */
	public Dispatch findByUUID_G(String uuid, long groupId)
		throws NoSuchDispatchException;

	/**
	 * Returns the dispatch where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public Dispatch fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the dispatch where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public Dispatch fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the dispatch where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dispatch that was removed
	 */
	public Dispatch removeByUUID_G(String uuid, long groupId)
		throws NoSuchDispatchException;

	/**
	 * Returns the number of dispatches where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dispatches
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the dispatches where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dispatches
	 */
	public java.util.List<Dispatch> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Dispatch> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Dispatch> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
			orderByComparator);

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
	public java.util.List<Dispatch> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dispatch in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch
	 * @throws NoSuchDispatchException if a matching dispatch could not be found
	 */
	public Dispatch findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
				orderByComparator)
		throws NoSuchDispatchException;

	/**
	 * Returns the first dispatch in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public Dispatch fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
			orderByComparator);

	/**
	 * Returns the last dispatch in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch
	 * @throws NoSuchDispatchException if a matching dispatch could not be found
	 */
	public Dispatch findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
				orderByComparator)
		throws NoSuchDispatchException;

	/**
	 * Returns the last dispatch in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public Dispatch fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
			orderByComparator);

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
	public Dispatch[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
				orderByComparator)
		throws NoSuchDispatchException;

	/**
	 * Removes all the dispatches where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of dispatches where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dispatches
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the dispatch in the entity cache if it is enabled.
	 *
	 * @param dispatch the dispatch
	 */
	public void cacheResult(Dispatch dispatch);

	/**
	 * Caches the dispatches in the entity cache if it is enabled.
	 *
	 * @param dispatches the dispatches
	 */
	public void cacheResult(java.util.List<Dispatch> dispatches);

	/**
	 * Creates a new dispatch with the primary key. Does not add the dispatch to the database.
	 *
	 * @param id the primary key for the new dispatch
	 * @return the new dispatch
	 */
	public Dispatch create(long id);

	/**
	 * Removes the dispatch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dispatch
	 * @return the dispatch that was removed
	 * @throws NoSuchDispatchException if a dispatch with the primary key could not be found
	 */
	public Dispatch remove(long id) throws NoSuchDispatchException;

	public Dispatch updateImpl(Dispatch dispatch);

	/**
	 * Returns the dispatch with the primary key or throws a <code>NoSuchDispatchException</code> if it could not be found.
	 *
	 * @param id the primary key of the dispatch
	 * @return the dispatch
	 * @throws NoSuchDispatchException if a dispatch with the primary key could not be found
	 */
	public Dispatch findByPrimaryKey(long id) throws NoSuchDispatchException;

	/**
	 * Returns the dispatch with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dispatch
	 * @return the dispatch, or <code>null</code> if a dispatch with the primary key could not be found
	 */
	public Dispatch fetchByPrimaryKey(long id);

	/**
	 * Returns all the dispatches.
	 *
	 * @return the dispatches
	 */
	public java.util.List<Dispatch> findAll();

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
	public java.util.List<Dispatch> findAll(int start, int end);

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
	public java.util.List<Dispatch> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
			orderByComparator);

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
	public java.util.List<Dispatch> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Dispatch>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dispatches from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dispatches.
	 *
	 * @return the number of dispatches
	 */
	public int countAll();

}