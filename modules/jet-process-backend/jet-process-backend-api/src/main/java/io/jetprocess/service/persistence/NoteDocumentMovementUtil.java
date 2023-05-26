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

import io.jetprocess.model.NoteDocumentMovement;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the note document movement service. This utility wraps <code>io.jetprocess.service.persistence.impl.NoteDocumentMovementPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NoteDocumentMovementPersistence
 * @generated
 */
public class NoteDocumentMovementUtil {

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
	public static void clearCache(NoteDocumentMovement noteDocumentMovement) {
		getPersistence().clearCache(noteDocumentMovement);
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
	public static Map<Serializable, NoteDocumentMovement> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NoteDocumentMovement> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NoteDocumentMovement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NoteDocumentMovement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NoteDocumentMovement update(
		NoteDocumentMovement noteDocumentMovement) {

		return getPersistence().update(noteDocumentMovement);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NoteDocumentMovement update(
		NoteDocumentMovement noteDocumentMovement,
		ServiceContext serviceContext) {

		return getPersistence().update(noteDocumentMovement, serviceContext);
	}

	/**
	 * Returns all the note document movements where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching note document movements
	 */
	public static List<NoteDocumentMovement> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<NoteDocumentMovement> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<NoteDocumentMovement> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<NoteDocumentMovement> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement findByUuid_First(
			String uuid,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement fetchByUuid_First(
		String uuid,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement findByUuid_Last(
			String uuid,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement fetchByUuid_Last(
		String uuid,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the note document movements before and after the current note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current note document movement
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	public static NoteDocumentMovement[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the note document movements where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of note document movements where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching note document movements
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the note document movement where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNoteDocumentMovementException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement findByUUID_G(String uuid, long groupId)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the note document movement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the note document movement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the note document movement where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the note document movement that was removed
	 */
	public static NoteDocumentMovement removeByUUID_G(String uuid, long groupId)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of note document movements where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching note document movements
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching note document movements
	 */
	public static List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static NoteDocumentMovement[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByUuid_C_PrevAndNext(
			id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the note document movements where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching note document movements
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the note document movements where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @return the matching note document movements
	 */
	public static List<NoteDocumentMovement> findByNoteDocumentId(
		long noteDocumentId) {

		return getPersistence().findByNoteDocumentId(noteDocumentId);
	}

	/**
	 * Returns a range of all the note document movements where noteDocumentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param noteDocumentId the note document ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @return the range of matching note document movements
	 */
	public static List<NoteDocumentMovement> findByNoteDocumentId(
		long noteDocumentId, int start, int end) {

		return getPersistence().findByNoteDocumentId(
			noteDocumentId, start, end);
	}

	/**
	 * Returns an ordered range of all the note document movements where noteDocumentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param noteDocumentId the note document ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching note document movements
	 */
	public static List<NoteDocumentMovement> findByNoteDocumentId(
		long noteDocumentId, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().findByNoteDocumentId(
			noteDocumentId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the note document movements where noteDocumentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param noteDocumentId the note document ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching note document movements
	 */
	public static List<NoteDocumentMovement> findByNoteDocumentId(
		long noteDocumentId, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByNoteDocumentId(
			noteDocumentId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first note document movement in the ordered set where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement findByNoteDocumentId_First(
			long noteDocumentId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByNoteDocumentId_First(
			noteDocumentId, orderByComparator);
	}

	/**
	 * Returns the first note document movement in the ordered set where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement fetchByNoteDocumentId_First(
		long noteDocumentId,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().fetchByNoteDocumentId_First(
			noteDocumentId, orderByComparator);
	}

	/**
	 * Returns the last note document movement in the ordered set where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement findByNoteDocumentId_Last(
			long noteDocumentId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByNoteDocumentId_Last(
			noteDocumentId, orderByComparator);
	}

	/**
	 * Returns the last note document movement in the ordered set where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement fetchByNoteDocumentId_Last(
		long noteDocumentId,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().fetchByNoteDocumentId_Last(
			noteDocumentId, orderByComparator);
	}

	/**
	 * Returns the note document movements before and after the current note document movement in the ordered set where noteDocumentId = &#63;.
	 *
	 * @param id the primary key of the current note document movement
	 * @param noteDocumentId the note document ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	public static NoteDocumentMovement[] findByNoteDocumentId_PrevAndNext(
			long id, long noteDocumentId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByNoteDocumentId_PrevAndNext(
			id, noteDocumentId, orderByComparator);
	}

	/**
	 * Removes all the note document movements where noteDocumentId = &#63; from the database.
	 *
	 * @param noteDocumentId the note document ID
	 */
	public static void removeByNoteDocumentId(long noteDocumentId) {
		getPersistence().removeByNoteDocumentId(noteDocumentId);
	}

	/**
	 * Returns the number of note document movements where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @return the number of matching note document movements
	 */
	public static int countByNoteDocumentId(long noteDocumentId) {
		return getPersistence().countByNoteDocumentId(noteDocumentId);
	}

	/**
	 * Caches the note document movement in the entity cache if it is enabled.
	 *
	 * @param noteDocumentMovement the note document movement
	 */
	public static void cacheResult(NoteDocumentMovement noteDocumentMovement) {
		getPersistence().cacheResult(noteDocumentMovement);
	}

	/**
	 * Caches the note document movements in the entity cache if it is enabled.
	 *
	 * @param noteDocumentMovements the note document movements
	 */
	public static void cacheResult(
		List<NoteDocumentMovement> noteDocumentMovements) {

		getPersistence().cacheResult(noteDocumentMovements);
	}

	/**
	 * Creates a new note document movement with the primary key. Does not add the note document movement to the database.
	 *
	 * @param id the primary key for the new note document movement
	 * @return the new note document movement
	 */
	public static NoteDocumentMovement create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the note document movement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement that was removed
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	public static NoteDocumentMovement remove(long id)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().remove(id);
	}

	public static NoteDocumentMovement updateImpl(
		NoteDocumentMovement noteDocumentMovement) {

		return getPersistence().updateImpl(noteDocumentMovement);
	}

	/**
	 * Returns the note document movement with the primary key or throws a <code>NoSuchNoteDocumentMovementException</code> if it could not be found.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	public static NoteDocumentMovement findByPrimaryKey(long id)
		throws io.jetprocess.exception.NoSuchNoteDocumentMovementException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the note document movement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement, or <code>null</code> if a note document movement with the primary key could not be found
	 */
	public static NoteDocumentMovement fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the note document movements.
	 *
	 * @return the note document movements
	 */
	public static List<NoteDocumentMovement> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<NoteDocumentMovement> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<NoteDocumentMovement> findAll(
		int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<NoteDocumentMovement> findAll(
		int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the note document movements from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of note document movements.
	 *
	 * @return the number of note document movements
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NoteDocumentMovementPersistence getPersistence() {
		return _persistence;
	}

	private static volatile NoteDocumentMovementPersistence _persistence;

}