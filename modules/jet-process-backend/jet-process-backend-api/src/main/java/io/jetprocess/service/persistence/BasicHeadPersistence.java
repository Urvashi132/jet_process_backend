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

import io.jetprocess.exception.NoSuchBasicHeadException;
import io.jetprocess.model.BasicHead;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the basic head service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BasicHeadUtil
 * @generated
 */
@ProviderType
public interface BasicHeadPersistence extends BasePersistence<BasicHead> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BasicHeadUtil} to access the basic head persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the basic heads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching basic heads
	 */
	public java.util.List<BasicHead> findByUuid(String uuid);

	/**
	 * Returns a range of all the basic heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BasicHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @return the range of matching basic heads
	 */
	public java.util.List<BasicHead> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the basic heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BasicHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching basic heads
	 */
	public java.util.List<BasicHead> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
			orderByComparator);

	/**
	 * Returns an ordered range of all the basic heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BasicHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching basic heads
	 */
	public java.util.List<BasicHead> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first basic head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching basic head
	 * @throws NoSuchBasicHeadException if a matching basic head could not be found
	 */
	public BasicHead findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
				orderByComparator)
		throws NoSuchBasicHeadException;

	/**
	 * Returns the first basic head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching basic head, or <code>null</code> if a matching basic head could not be found
	 */
	public BasicHead fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
			orderByComparator);

	/**
	 * Returns the last basic head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching basic head
	 * @throws NoSuchBasicHeadException if a matching basic head could not be found
	 */
	public BasicHead findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
				orderByComparator)
		throws NoSuchBasicHeadException;

	/**
	 * Returns the last basic head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching basic head, or <code>null</code> if a matching basic head could not be found
	 */
	public BasicHead fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
			orderByComparator);

	/**
	 * Returns the basic heads before and after the current basic head in the ordered set where uuid = &#63;.
	 *
	 * @param basicHeadId the primary key of the current basic head
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next basic head
	 * @throws NoSuchBasicHeadException if a basic head with the primary key could not be found
	 */
	public BasicHead[] findByUuid_PrevAndNext(
			long basicHeadId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
				orderByComparator)
		throws NoSuchBasicHeadException;

	/**
	 * Removes all the basic heads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of basic heads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching basic heads
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the basic head where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchBasicHeadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching basic head
	 * @throws NoSuchBasicHeadException if a matching basic head could not be found
	 */
	public BasicHead findByUUID_G(String uuid, long groupId)
		throws NoSuchBasicHeadException;

	/**
	 * Returns the basic head where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching basic head, or <code>null</code> if a matching basic head could not be found
	 */
	public BasicHead fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the basic head where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching basic head, or <code>null</code> if a matching basic head could not be found
	 */
	public BasicHead fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the basic head where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the basic head that was removed
	 */
	public BasicHead removeByUUID_G(String uuid, long groupId)
		throws NoSuchBasicHeadException;

	/**
	 * Returns the number of basic heads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching basic heads
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the basic heads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching basic heads
	 */
	public java.util.List<BasicHead> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the basic heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BasicHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @return the range of matching basic heads
	 */
	public java.util.List<BasicHead> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the basic heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BasicHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching basic heads
	 */
	public java.util.List<BasicHead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
			orderByComparator);

	/**
	 * Returns an ordered range of all the basic heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>BasicHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching basic heads
	 */
	public java.util.List<BasicHead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first basic head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching basic head
	 * @throws NoSuchBasicHeadException if a matching basic head could not be found
	 */
	public BasicHead findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
				orderByComparator)
		throws NoSuchBasicHeadException;

	/**
	 * Returns the first basic head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching basic head, or <code>null</code> if a matching basic head could not be found
	 */
	public BasicHead fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
			orderByComparator);

	/**
	 * Returns the last basic head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching basic head
	 * @throws NoSuchBasicHeadException if a matching basic head could not be found
	 */
	public BasicHead findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
				orderByComparator)
		throws NoSuchBasicHeadException;

	/**
	 * Returns the last basic head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching basic head, or <code>null</code> if a matching basic head could not be found
	 */
	public BasicHead fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
			orderByComparator);

	/**
	 * Returns the basic heads before and after the current basic head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param basicHeadId the primary key of the current basic head
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next basic head
	 * @throws NoSuchBasicHeadException if a basic head with the primary key could not be found
	 */
	public BasicHead[] findByUuid_C_PrevAndNext(
			long basicHeadId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
				orderByComparator)
		throws NoSuchBasicHeadException;

	/**
	 * Removes all the basic heads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of basic heads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching basic heads
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the basic head in the entity cache if it is enabled.
	 *
	 * @param basicHead the basic head
	 */
	public void cacheResult(BasicHead basicHead);

	/**
	 * Caches the basic heads in the entity cache if it is enabled.
	 *
	 * @param basicHeads the basic heads
	 */
	public void cacheResult(java.util.List<BasicHead> basicHeads);

	/**
	 * Creates a new basic head with the primary key. Does not add the basic head to the database.
	 *
	 * @param basicHeadId the primary key for the new basic head
	 * @return the new basic head
	 */
	public BasicHead create(long basicHeadId);

	/**
	 * Removes the basic head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param basicHeadId the primary key of the basic head
	 * @return the basic head that was removed
	 * @throws NoSuchBasicHeadException if a basic head with the primary key could not be found
	 */
	public BasicHead remove(long basicHeadId) throws NoSuchBasicHeadException;

	public BasicHead updateImpl(BasicHead basicHead);

	/**
	 * Returns the basic head with the primary key or throws a <code>NoSuchBasicHeadException</code> if it could not be found.
	 *
	 * @param basicHeadId the primary key of the basic head
	 * @return the basic head
	 * @throws NoSuchBasicHeadException if a basic head with the primary key could not be found
	 */
	public BasicHead findByPrimaryKey(long basicHeadId)
		throws NoSuchBasicHeadException;

	/**
	 * Returns the basic head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param basicHeadId the primary key of the basic head
	 * @return the basic head, or <code>null</code> if a basic head with the primary key could not be found
	 */
	public BasicHead fetchByPrimaryKey(long basicHeadId);

	/**
	 * Returns all the basic heads.
	 *
	 * @return the basic heads
	 */
	public java.util.List<BasicHead> findAll();

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
	public java.util.List<BasicHead> findAll(int start, int end);

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
	public java.util.List<BasicHead> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
			orderByComparator);

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
	public java.util.List<BasicHead> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BasicHead>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the basic heads from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of basic heads.
	 *
	 * @return the number of basic heads
	 */
	public int countAll();

}