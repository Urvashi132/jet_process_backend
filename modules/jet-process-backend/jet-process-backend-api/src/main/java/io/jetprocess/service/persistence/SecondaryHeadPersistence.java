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

import io.jetprocess.exception.NoSuchSecondaryHeadException;
import io.jetprocess.model.SecondaryHead;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the secondary head service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondaryHeadUtil
 * @generated
 */
@ProviderType
public interface SecondaryHeadPersistence
	extends BasePersistence<SecondaryHead> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SecondaryHeadUtil} to access the secondary head persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the secondary heads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching secondary heads
	 */
	public java.util.List<SecondaryHead> findByUuid(String uuid);

	/**
	 * Returns a range of all the secondary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @return the range of matching secondary heads
	 */
	public java.util.List<SecondaryHead> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the secondary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching secondary heads
	 */
	public java.util.List<SecondaryHead> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator);

	/**
	 * Returns an ordered range of all the secondary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching secondary heads
	 */
	public java.util.List<SecondaryHead> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first secondary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	public SecondaryHead findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
				orderByComparator)
		throws NoSuchSecondaryHeadException;

	/**
	 * Returns the first secondary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	public SecondaryHead fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator);

	/**
	 * Returns the last secondary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	public SecondaryHead findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
				orderByComparator)
		throws NoSuchSecondaryHeadException;

	/**
	 * Returns the last secondary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	public SecondaryHead fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator);

	/**
	 * Returns the secondary heads before and after the current secondary head in the ordered set where uuid = &#63;.
	 *
	 * @param secondaryHeadId the primary key of the current secondary head
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	public SecondaryHead[] findByUuid_PrevAndNext(
			long secondaryHeadId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
				orderByComparator)
		throws NoSuchSecondaryHeadException;

	/**
	 * Removes all the secondary heads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of secondary heads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching secondary heads
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the secondary head where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSecondaryHeadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	public SecondaryHead findByUUID_G(String uuid, long groupId)
		throws NoSuchSecondaryHeadException;

	/**
	 * Returns the secondary head where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	public SecondaryHead fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the secondary head where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	public SecondaryHead fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the secondary head where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the secondary head that was removed
	 */
	public SecondaryHead removeByUUID_G(String uuid, long groupId)
		throws NoSuchSecondaryHeadException;

	/**
	 * Returns the number of secondary heads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching secondary heads
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the secondary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching secondary heads
	 */
	public java.util.List<SecondaryHead> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the secondary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @return the range of matching secondary heads
	 */
	public java.util.List<SecondaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the secondary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching secondary heads
	 */
	public java.util.List<SecondaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator);

	/**
	 * Returns an ordered range of all the secondary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching secondary heads
	 */
	public java.util.List<SecondaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first secondary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	public SecondaryHead findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
				orderByComparator)
		throws NoSuchSecondaryHeadException;

	/**
	 * Returns the first secondary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	public SecondaryHead fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator);

	/**
	 * Returns the last secondary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	public SecondaryHead findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
				orderByComparator)
		throws NoSuchSecondaryHeadException;

	/**
	 * Returns the last secondary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	public SecondaryHead fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator);

	/**
	 * Returns the secondary heads before and after the current secondary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param secondaryHeadId the primary key of the current secondary head
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	public SecondaryHead[] findByUuid_C_PrevAndNext(
			long secondaryHeadId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
				orderByComparator)
		throws NoSuchSecondaryHeadException;

	/**
	 * Removes all the secondary heads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of secondary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching secondary heads
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the secondary heads where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @return the matching secondary heads
	 */
	public java.util.List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId);

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
	public java.util.List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId, int start, int end);

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
	public java.util.List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator);

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
	public java.util.List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	public SecondaryHead findBySecondaryHeadByPrimaryHeadId_First(
			long primaryHeadId,
			com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
				orderByComparator)
		throws NoSuchSecondaryHeadException;

	/**
	 * Returns the first secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	public SecondaryHead fetchBySecondaryHeadByPrimaryHeadId_First(
		long primaryHeadId,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator);

	/**
	 * Returns the last secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	public SecondaryHead findBySecondaryHeadByPrimaryHeadId_Last(
			long primaryHeadId,
			com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
				orderByComparator)
		throws NoSuchSecondaryHeadException;

	/**
	 * Returns the last secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	public SecondaryHead fetchBySecondaryHeadByPrimaryHeadId_Last(
		long primaryHeadId,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator);

	/**
	 * Returns the secondary heads before and after the current secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the primary key of the current secondary head
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	public SecondaryHead[] findBySecondaryHeadByPrimaryHeadId_PrevAndNext(
			long secondaryHeadId, long primaryHeadId,
			com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
				orderByComparator)
		throws NoSuchSecondaryHeadException;

	/**
	 * Removes all the secondary heads where primaryHeadId = &#63; from the database.
	 *
	 * @param primaryHeadId the primary head ID
	 */
	public void removeBySecondaryHeadByPrimaryHeadId(long primaryHeadId);

	/**
	 * Returns the number of secondary heads where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @return the number of matching secondary heads
	 */
	public int countBySecondaryHeadByPrimaryHeadId(long primaryHeadId);

	/**
	 * Caches the secondary head in the entity cache if it is enabled.
	 *
	 * @param secondaryHead the secondary head
	 */
	public void cacheResult(SecondaryHead secondaryHead);

	/**
	 * Caches the secondary heads in the entity cache if it is enabled.
	 *
	 * @param secondaryHeads the secondary heads
	 */
	public void cacheResult(java.util.List<SecondaryHead> secondaryHeads);

	/**
	 * Creates a new secondary head with the primary key. Does not add the secondary head to the database.
	 *
	 * @param secondaryHeadId the primary key for the new secondary head
	 * @return the new secondary head
	 */
	public SecondaryHead create(long secondaryHeadId);

	/**
	 * Removes the secondary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head that was removed
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	public SecondaryHead remove(long secondaryHeadId)
		throws NoSuchSecondaryHeadException;

	public SecondaryHead updateImpl(SecondaryHead secondaryHead);

	/**
	 * Returns the secondary head with the primary key or throws a <code>NoSuchSecondaryHeadException</code> if it could not be found.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	public SecondaryHead findByPrimaryKey(long secondaryHeadId)
		throws NoSuchSecondaryHeadException;

	/**
	 * Returns the secondary head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head, or <code>null</code> if a secondary head with the primary key could not be found
	 */
	public SecondaryHead fetchByPrimaryKey(long secondaryHeadId);

	/**
	 * Returns all the secondary heads.
	 *
	 * @return the secondary heads
	 */
	public java.util.List<SecondaryHead> findAll();

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
	public java.util.List<SecondaryHead> findAll(int start, int end);

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
	public java.util.List<SecondaryHead> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator);

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
	public java.util.List<SecondaryHead> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondaryHead>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the secondary heads from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of secondary heads.
	 *
	 * @return the number of secondary heads
	 */
	public int countAll();

}