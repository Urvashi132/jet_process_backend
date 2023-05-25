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

import io.jetprocess.exception.NoSuchNoteDocumentMovementException;
import io.jetprocess.model.NoteDocumentMovement;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the note document movement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NoteDocumentMovementUtil
 * @generated
 */
@ProviderType
public interface NoteDocumentMovementPersistence
	extends BasePersistence<NoteDocumentMovement> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NoteDocumentMovementUtil} to access the note document movement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the note document movements where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching note document movements
	 */
	public java.util.List<NoteDocumentMovement> findByUuid(String uuid);

	/**
	 * Returns a range of all the note document movements where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @return the range of matching note document movements
	 */
	public java.util.List<NoteDocumentMovement> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the note document movements where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching note document movements
	 */
	public java.util.List<NoteDocumentMovement> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NoteDocumentMovement>
			orderByComparator);

	/**
	 * Returns an ordered range of all the note document movements where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching note document movements
	 */
	public java.util.List<NoteDocumentMovement> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NoteDocumentMovement>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public NoteDocumentMovement findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException;

	/**
	 * Returns the first note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public NoteDocumentMovement fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NoteDocumentMovement>
			orderByComparator);

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public NoteDocumentMovement findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException;

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public NoteDocumentMovement fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NoteDocumentMovement>
			orderByComparator);

	/**
	 * Returns the note document movements before and after the current note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current note document movement
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	public NoteDocumentMovement[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException;

	/**
	 * Removes all the note document movements where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of note document movements where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching note document movements
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the note document movement where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNoteDocumentMovementException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public NoteDocumentMovement findByUUID_G(String uuid, long groupId)
		throws NoSuchNoteDocumentMovementException;

	/**
	 * Returns the note document movement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public NoteDocumentMovement fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the note document movement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public NoteDocumentMovement fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the note document movement where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the note document movement that was removed
	 */
	public NoteDocumentMovement removeByUUID_G(String uuid, long groupId)
		throws NoSuchNoteDocumentMovementException;

	/**
	 * Returns the number of note document movements where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching note document movements
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching note document movements
	 */
	public java.util.List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @return the range of matching note document movements
	 */
	public java.util.List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching note document movements
	 */
	public java.util.List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NoteDocumentMovement>
			orderByComparator);

	/**
	 * Returns an ordered range of all the note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching note document movements
	 */
	public java.util.List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NoteDocumentMovement>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public NoteDocumentMovement findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException;

	/**
	 * Returns the first note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public NoteDocumentMovement fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NoteDocumentMovement>
			orderByComparator);

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public NoteDocumentMovement findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException;

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public NoteDocumentMovement fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NoteDocumentMovement>
			orderByComparator);

	/**
	 * Returns the note document movements before and after the current note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current note document movement
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	public NoteDocumentMovement[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException;

	/**
	 * Removes all the note document movements where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching note document movements
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the note document movement in the entity cache if it is enabled.
	 *
	 * @param noteDocumentMovement the note document movement
	 */
	public void cacheResult(NoteDocumentMovement noteDocumentMovement);

	/**
	 * Caches the note document movements in the entity cache if it is enabled.
	 *
	 * @param noteDocumentMovements the note document movements
	 */
	public void cacheResult(
		java.util.List<NoteDocumentMovement> noteDocumentMovements);

	/**
	 * Creates a new note document movement with the primary key. Does not add the note document movement to the database.
	 *
	 * @param id the primary key for the new note document movement
	 * @return the new note document movement
	 */
	public NoteDocumentMovement create(long id);

	/**
	 * Removes the note document movement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement that was removed
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	public NoteDocumentMovement remove(long id)
		throws NoSuchNoteDocumentMovementException;

	public NoteDocumentMovement updateImpl(
		NoteDocumentMovement noteDocumentMovement);

	/**
	 * Returns the note document movement with the primary key or throws a <code>NoSuchNoteDocumentMovementException</code> if it could not be found.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	public NoteDocumentMovement findByPrimaryKey(long id)
		throws NoSuchNoteDocumentMovementException;

	/**
	 * Returns the note document movement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement, or <code>null</code> if a note document movement with the primary key could not be found
	 */
	public NoteDocumentMovement fetchByPrimaryKey(long id);

	/**
	 * Returns all the note document movements.
	 *
	 * @return the note document movements
	 */
	public java.util.List<NoteDocumentMovement> findAll();

	/**
	 * Returns a range of all the note document movements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @return the range of note document movements
	 */
	public java.util.List<NoteDocumentMovement> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the note document movements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of note document movements
	 */
	public java.util.List<NoteDocumentMovement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NoteDocumentMovement>
			orderByComparator);

	/**
	 * Returns an ordered range of all the note document movements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of note document movements
	 */
	public java.util.List<NoteDocumentMovement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NoteDocumentMovement>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the note document movements from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of note document movements.
	 *
	 * @return the number of note document movements
	 */
	public int countAll();

}