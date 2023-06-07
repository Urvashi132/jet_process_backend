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

import io.jetprocess.exception.NoSuchDraftException;
import io.jetprocess.model.Draft;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the draft service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DraftUtil
 * @generated
 */
@ProviderType
public interface DraftPersistence extends BasePersistence<Draft> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DraftUtil} to access the draft persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the drafts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching drafts
	 */
	public java.util.List<Draft> findByUuid(String uuid);

	/**
	 * Returns a range of all the drafts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @return the range of matching drafts
	 */
	public java.util.List<Draft> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the drafts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching drafts
	 */
	public java.util.List<Draft> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Draft>
			orderByComparator);

	/**
	 * Returns an ordered range of all the drafts where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching drafts
	 */
	public java.util.List<Draft> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Draft>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first draft in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft
	 * @throws NoSuchDraftException if a matching draft could not be found
	 */
	public Draft findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Draft>
				orderByComparator)
		throws NoSuchDraftException;

	/**
	 * Returns the first draft in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft, or <code>null</code> if a matching draft could not be found
	 */
	public Draft fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Draft>
			orderByComparator);

	/**
	 * Returns the last draft in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft
	 * @throws NoSuchDraftException if a matching draft could not be found
	 */
	public Draft findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Draft>
				orderByComparator)
		throws NoSuchDraftException;

	/**
	 * Returns the last draft in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft, or <code>null</code> if a matching draft could not be found
	 */
	public Draft fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Draft>
			orderByComparator);

	/**
	 * Returns the drafts before and after the current draft in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current draft
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next draft
	 * @throws NoSuchDraftException if a draft with the primary key could not be found
	 */
	public Draft[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Draft>
				orderByComparator)
		throws NoSuchDraftException;

	/**
	 * Removes all the drafts where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of drafts where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching drafts
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the draft where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDraftException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching draft
	 * @throws NoSuchDraftException if a matching draft could not be found
	 */
	public Draft findByUUID_G(String uuid, long groupId)
		throws NoSuchDraftException;

	/**
	 * Returns the draft where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching draft, or <code>null</code> if a matching draft could not be found
	 */
	public Draft fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the draft where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching draft, or <code>null</code> if a matching draft could not be found
	 */
	public Draft fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the draft where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the draft that was removed
	 */
	public Draft removeByUUID_G(String uuid, long groupId)
		throws NoSuchDraftException;

	/**
	 * Returns the number of drafts where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching drafts
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the drafts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching drafts
	 */
	public java.util.List<Draft> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the drafts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @return the range of matching drafts
	 */
	public java.util.List<Draft> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the drafts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching drafts
	 */
	public java.util.List<Draft> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Draft>
			orderByComparator);

	/**
	 * Returns an ordered range of all the drafts where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching drafts
	 */
	public java.util.List<Draft> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Draft>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first draft in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft
	 * @throws NoSuchDraftException if a matching draft could not be found
	 */
	public Draft findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Draft>
				orderByComparator)
		throws NoSuchDraftException;

	/**
	 * Returns the first draft in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft, or <code>null</code> if a matching draft could not be found
	 */
	public Draft fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Draft>
			orderByComparator);

	/**
	 * Returns the last draft in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft
	 * @throws NoSuchDraftException if a matching draft could not be found
	 */
	public Draft findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Draft>
				orderByComparator)
		throws NoSuchDraftException;

	/**
	 * Returns the last draft in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft, or <code>null</code> if a matching draft could not be found
	 */
	public Draft fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Draft>
			orderByComparator);

	/**
	 * Returns the drafts before and after the current draft in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current draft
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next draft
	 * @throws NoSuchDraftException if a draft with the primary key could not be found
	 */
	public Draft[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Draft>
				orderByComparator)
		throws NoSuchDraftException;

	/**
	 * Removes all the drafts where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of drafts where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching drafts
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the draft in the entity cache if it is enabled.
	 *
	 * @param draft the draft
	 */
	public void cacheResult(Draft draft);

	/**
	 * Caches the drafts in the entity cache if it is enabled.
	 *
	 * @param drafts the drafts
	 */
	public void cacheResult(java.util.List<Draft> drafts);

	/**
	 * Creates a new draft with the primary key. Does not add the draft to the database.
	 *
	 * @param id the primary key for the new draft
	 * @return the new draft
	 */
	public Draft create(long id);

	/**
	 * Removes the draft with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the draft
	 * @return the draft that was removed
	 * @throws NoSuchDraftException if a draft with the primary key could not be found
	 */
	public Draft remove(long id) throws NoSuchDraftException;

	public Draft updateImpl(Draft draft);

	/**
	 * Returns the draft with the primary key or throws a <code>NoSuchDraftException</code> if it could not be found.
	 *
	 * @param id the primary key of the draft
	 * @return the draft
	 * @throws NoSuchDraftException if a draft with the primary key could not be found
	 */
	public Draft findByPrimaryKey(long id) throws NoSuchDraftException;

	/**
	 * Returns the draft with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the draft
	 * @return the draft, or <code>null</code> if a draft with the primary key could not be found
	 */
	public Draft fetchByPrimaryKey(long id);

	/**
	 * Returns all the drafts.
	 *
	 * @return the drafts
	 */
	public java.util.List<Draft> findAll();

	/**
	 * Returns a range of all the drafts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @return the range of drafts
	 */
	public java.util.List<Draft> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the drafts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of drafts
	 */
	public java.util.List<Draft> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Draft>
			orderByComparator);

	/**
	 * Returns an ordered range of all the drafts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of drafts
	 */
	public java.util.List<Draft> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Draft>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the drafts from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of drafts.
	 *
	 * @return the number of drafts
	 */
	public int countAll();

}