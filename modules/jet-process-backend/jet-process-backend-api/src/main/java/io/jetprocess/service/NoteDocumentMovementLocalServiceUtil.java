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

package io.jetprocess.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import io.jetprocess.model.NoteDocumentMovement;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NoteDocumentMovement. This utility wraps
 * <code>io.jetprocess.service.impl.NoteDocumentMovementLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NoteDocumentMovementLocalService
 * @generated
 */
public class NoteDocumentMovementLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>io.jetprocess.service.impl.NoteDocumentMovementLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the note document movement to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NoteDocumentMovementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param noteDocumentMovement the note document movement
	 * @return the note document movement that was added
	 */
	public static NoteDocumentMovement addNoteDocumentMovement(
		NoteDocumentMovement noteDocumentMovement) {

		return getService().addNoteDocumentMovement(noteDocumentMovement);
	}

	/**
	 * Creates a new note document movement with the primary key. Does not add the note document movement to the database.
	 *
	 * @param id the primary key for the new note document movement
	 * @return the new note document movement
	 */
	public static NoteDocumentMovement createNoteDocumentMovement(long id) {
		return getService().createNoteDocumentMovement(id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the note document movement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NoteDocumentMovementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement that was removed
	 * @throws PortalException if a note document movement with the primary key could not be found
	 */
	public static NoteDocumentMovement deleteNoteDocumentMovement(long id)
		throws PortalException {

		return getService().deleteNoteDocumentMovement(id);
	}

	/**
	 * Deletes the note document movement from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NoteDocumentMovementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param noteDocumentMovement the note document movement
	 * @return the note document movement that was removed
	 */
	public static NoteDocumentMovement deleteNoteDocumentMovement(
		NoteDocumentMovement noteDocumentMovement) {

		return getService().deleteNoteDocumentMovement(noteDocumentMovement);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static NoteDocumentMovement fetchNoteDocumentMovement(long id) {
		return getService().fetchNoteDocumentMovement(id);
	}

	/**
	 * Returns the note document movement matching the UUID and group.
	 *
	 * @param uuid the note document movement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement
		fetchNoteDocumentMovementByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchNoteDocumentMovementByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static List<NoteDocumentMovement> getListByNoteDocumentId(
		long noteDocumentId) {

		return getService().getListByNoteDocumentId(noteDocumentId);
	}

	/**
	 * Returns the note document movement with the primary key.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement
	 * @throws PortalException if a note document movement with the primary key could not be found
	 */
	public static NoteDocumentMovement getNoteDocumentMovement(long id)
		throws PortalException {

		return getService().getNoteDocumentMovement(id);
	}

	/**
	 * Returns the note document movement matching the UUID and group.
	 *
	 * @param uuid the note document movement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching note document movement
	 * @throws PortalException if a matching note document movement could not be found
	 */
	public static NoteDocumentMovement getNoteDocumentMovementByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getNoteDocumentMovementByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the note document movements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @return the range of note document movements
	 */
	public static List<NoteDocumentMovement> getNoteDocumentMovements(
		int start, int end) {

		return getService().getNoteDocumentMovements(start, end);
	}

	/**
	 * Returns all the note document movements matching the UUID and company.
	 *
	 * @param uuid the UUID of the note document movements
	 * @param companyId the primary key of the company
	 * @return the matching note document movements, or an empty list if no matches were found
	 */
	public static List<NoteDocumentMovement>
		getNoteDocumentMovementsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getNoteDocumentMovementsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of note document movements matching the UUID and company.
	 *
	 * @param uuid the UUID of the note document movements
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching note document movements, or an empty list if no matches were found
	 */
	public static List<NoteDocumentMovement>
		getNoteDocumentMovementsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return getService().getNoteDocumentMovementsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of note document movements.
	 *
	 * @return the number of note document movements
	 */
	public static int getNoteDocumentMovementsCount() {
		return getService().getNoteDocumentMovementsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static NoteDocumentMovement saveNoteDocumentMovement(
			long receiverId, long senderId, long noteDocumentId, String remarks)
		throws PortalException {

		return getService().saveNoteDocumentMovement(
			receiverId, senderId, noteDocumentId, remarks);
	}

	/**
	 * Updates the note document movement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NoteDocumentMovementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param noteDocumentMovement the note document movement
	 * @return the note document movement that was updated
	 */
	public static NoteDocumentMovement updateNoteDocumentMovement(
		NoteDocumentMovement noteDocumentMovement) {

		return getService().updateNoteDocumentMovement(noteDocumentMovement);
	}

	public static NoteDocumentMovementLocalService getService() {
		return _service;
	}

	private static volatile NoteDocumentMovementLocalService _service;

}