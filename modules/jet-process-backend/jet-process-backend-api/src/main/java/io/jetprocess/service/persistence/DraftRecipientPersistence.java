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

import io.jetprocess.exception.NoSuchDraftRecipientException;
import io.jetprocess.model.DraftRecipient;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the draft recipient service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DraftRecipientUtil
 * @generated
 */
@ProviderType
public interface DraftRecipientPersistence
	extends BasePersistence<DraftRecipient> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DraftRecipientUtil} to access the draft recipient persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the draft recipients where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByUuid(String uuid);

	/**
	 * Returns a range of all the draft recipients where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @return the range of matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the draft recipients where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator);

	/**
	 * Returns an ordered range of all the draft recipients where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public DraftRecipient findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
				orderByComparator)
		throws NoSuchDraftRecipientException;

	/**
	 * Returns the first draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public DraftRecipient fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator);

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public DraftRecipient findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
				orderByComparator)
		throws NoSuchDraftRecipientException;

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public DraftRecipient fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator);

	/**
	 * Returns the draft recipients before and after the current draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current draft recipient
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next draft recipient
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	public DraftRecipient[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
				orderByComparator)
		throws NoSuchDraftRecipientException;

	/**
	 * Removes all the draft recipients where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of draft recipients where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching draft recipients
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the draft recipient where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDraftRecipientException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public DraftRecipient findByUUID_G(String uuid, long groupId)
		throws NoSuchDraftRecipientException;

	/**
	 * Returns the draft recipient where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public DraftRecipient fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the draft recipient where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public DraftRecipient fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the draft recipient where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the draft recipient that was removed
	 */
	public DraftRecipient removeByUUID_G(String uuid, long groupId)
		throws NoSuchDraftRecipientException;

	/**
	 * Returns the number of draft recipients where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching draft recipients
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @return the range of matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator);

	/**
	 * Returns an ordered range of all the draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public DraftRecipient findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
				orderByComparator)
		throws NoSuchDraftRecipientException;

	/**
	 * Returns the first draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public DraftRecipient fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator);

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public DraftRecipient findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
				orderByComparator)
		throws NoSuchDraftRecipientException;

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public DraftRecipient fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator);

	/**
	 * Returns the draft recipients before and after the current draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current draft recipient
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next draft recipient
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	public DraftRecipient[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
				orderByComparator)
		throws NoSuchDraftRecipientException;

	/**
	 * Removes all the draft recipients where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching draft recipients
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the draft recipients where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @return the matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByDraftId(long draftId);

	/**
	 * Returns a range of all the draft recipients where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @return the range of matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByDraftId(
		long draftId, int start, int end);

	/**
	 * Returns an ordered range of all the draft recipients where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByDraftId(
		long draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator);

	/**
	 * Returns an ordered range of all the draft recipients where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching draft recipients
	 */
	public java.util.List<DraftRecipient> findByDraftId(
		long draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public DraftRecipient findByDraftId_First(
			long draftId,
			com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
				orderByComparator)
		throws NoSuchDraftRecipientException;

	/**
	 * Returns the first draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public DraftRecipient fetchByDraftId_First(
		long draftId,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator);

	/**
	 * Returns the last draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public DraftRecipient findByDraftId_Last(
			long draftId,
			com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
				orderByComparator)
		throws NoSuchDraftRecipientException;

	/**
	 * Returns the last draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public DraftRecipient fetchByDraftId_Last(
		long draftId,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator);

	/**
	 * Returns the draft recipients before and after the current draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param id the primary key of the current draft recipient
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next draft recipient
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	public DraftRecipient[] findByDraftId_PrevAndNext(
			long id, long draftId,
			com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
				orderByComparator)
		throws NoSuchDraftRecipientException;

	/**
	 * Removes all the draft recipients where draftId = &#63; from the database.
	 *
	 * @param draftId the draft ID
	 */
	public void removeByDraftId(long draftId);

	/**
	 * Returns the number of draft recipients where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @return the number of matching draft recipients
	 */
	public int countByDraftId(long draftId);

	/**
	 * Caches the draft recipient in the entity cache if it is enabled.
	 *
	 * @param draftRecipient the draft recipient
	 */
	public void cacheResult(DraftRecipient draftRecipient);

	/**
	 * Caches the draft recipients in the entity cache if it is enabled.
	 *
	 * @param draftRecipients the draft recipients
	 */
	public void cacheResult(java.util.List<DraftRecipient> draftRecipients);

	/**
	 * Creates a new draft recipient with the primary key. Does not add the draft recipient to the database.
	 *
	 * @param id the primary key for the new draft recipient
	 * @return the new draft recipient
	 */
	public DraftRecipient create(long id);

	/**
	 * Removes the draft recipient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient that was removed
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	public DraftRecipient remove(long id) throws NoSuchDraftRecipientException;

	public DraftRecipient updateImpl(DraftRecipient draftRecipient);

	/**
	 * Returns the draft recipient with the primary key or throws a <code>NoSuchDraftRecipientException</code> if it could not be found.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	public DraftRecipient findByPrimaryKey(long id)
		throws NoSuchDraftRecipientException;

	/**
	 * Returns the draft recipient with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient, or <code>null</code> if a draft recipient with the primary key could not be found
	 */
	public DraftRecipient fetchByPrimaryKey(long id);

	/**
	 * Returns all the draft recipients.
	 *
	 * @return the draft recipients
	 */
	public java.util.List<DraftRecipient> findAll();

	/**
	 * Returns a range of all the draft recipients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @return the range of draft recipients
	 */
	public java.util.List<DraftRecipient> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the draft recipients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of draft recipients
	 */
	public java.util.List<DraftRecipient> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator);

	/**
	 * Returns an ordered range of all the draft recipients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of draft recipients
	 */
	public java.util.List<DraftRecipient> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DraftRecipient>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the draft recipients from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of draft recipients.
	 *
	 * @return the number of draft recipients
	 */
	public int countAll();

}