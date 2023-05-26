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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NoteDocumentMovementLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NoteDocumentMovementLocalService
 * @generated
 */
public class NoteDocumentMovementLocalServiceWrapper
	implements NoteDocumentMovementLocalService,
			   ServiceWrapper<NoteDocumentMovementLocalService> {

	public NoteDocumentMovementLocalServiceWrapper(
		NoteDocumentMovementLocalService noteDocumentMovementLocalService) {

		_noteDocumentMovementLocalService = noteDocumentMovementLocalService;
	}

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
	@Override
	public io.jetprocess.model.NoteDocumentMovement addNoteDocumentMovement(
		io.jetprocess.model.NoteDocumentMovement noteDocumentMovement) {

		return _noteDocumentMovementLocalService.addNoteDocumentMovement(
			noteDocumentMovement);
	}

	/**
	 * Creates a new note document movement with the primary key. Does not add the note document movement to the database.
	 *
	 * @param id the primary key for the new note document movement
	 * @return the new note document movement
	 */
	@Override
	public io.jetprocess.model.NoteDocumentMovement createNoteDocumentMovement(
		long id) {

		return _noteDocumentMovementLocalService.createNoteDocumentMovement(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _noteDocumentMovementLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public io.jetprocess.model.NoteDocumentMovement deleteNoteDocumentMovement(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _noteDocumentMovementLocalService.deleteNoteDocumentMovement(id);
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
	@Override
	public io.jetprocess.model.NoteDocumentMovement deleteNoteDocumentMovement(
		io.jetprocess.model.NoteDocumentMovement noteDocumentMovement) {

		return _noteDocumentMovementLocalService.deleteNoteDocumentMovement(
			noteDocumentMovement);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _noteDocumentMovementLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _noteDocumentMovementLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _noteDocumentMovementLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _noteDocumentMovementLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _noteDocumentMovementLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _noteDocumentMovementLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _noteDocumentMovementLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _noteDocumentMovementLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _noteDocumentMovementLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.NoteDocumentMovement fetchNoteDocumentMovement(
		long id) {

		return _noteDocumentMovementLocalService.fetchNoteDocumentMovement(id);
	}

	/**
	 * Returns the note document movement matching the UUID and group.
	 *
	 * @param uuid the note document movement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	@Override
	public io.jetprocess.model.NoteDocumentMovement
		fetchNoteDocumentMovementByUuidAndGroupId(String uuid, long groupId) {

		return _noteDocumentMovementLocalService.
			fetchNoteDocumentMovementByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _noteDocumentMovementLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _noteDocumentMovementLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _noteDocumentMovementLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List<io.jetprocess.model.NoteDocumentMovement>
		getListByNoteDocumentId(long noteDocumentId) {

		return _noteDocumentMovementLocalService.getListByNoteDocumentId(
			noteDocumentId);
	}

	/**
	 * Returns the note document movement with the primary key.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement
	 * @throws PortalException if a note document movement with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.NoteDocumentMovement getNoteDocumentMovement(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _noteDocumentMovementLocalService.getNoteDocumentMovement(id);
	}

	/**
	 * Returns the note document movement matching the UUID and group.
	 *
	 * @param uuid the note document movement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching note document movement
	 * @throws PortalException if a matching note document movement could not be found
	 */
	@Override
	public io.jetprocess.model.NoteDocumentMovement
			getNoteDocumentMovementByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _noteDocumentMovementLocalService.
			getNoteDocumentMovementByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<io.jetprocess.model.NoteDocumentMovement>
		getNoteDocumentMovements(int start, int end) {

		return _noteDocumentMovementLocalService.getNoteDocumentMovements(
			start, end);
	}

	/**
	 * Returns all the note document movements matching the UUID and company.
	 *
	 * @param uuid the UUID of the note document movements
	 * @param companyId the primary key of the company
	 * @return the matching note document movements, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.NoteDocumentMovement>
		getNoteDocumentMovementsByUuidAndCompanyId(
			String uuid, long companyId) {

		return _noteDocumentMovementLocalService.
			getNoteDocumentMovementsByUuidAndCompanyId(uuid, companyId);
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
	@Override
	public java.util.List<io.jetprocess.model.NoteDocumentMovement>
		getNoteDocumentMovementsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<io.jetprocess.model.NoteDocumentMovement> orderByComparator) {

		return _noteDocumentMovementLocalService.
			getNoteDocumentMovementsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of note document movements.
	 *
	 * @return the number of note document movements
	 */
	@Override
	public int getNoteDocumentMovementsCount() {
		return _noteDocumentMovementLocalService.
			getNoteDocumentMovementsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _noteDocumentMovementLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _noteDocumentMovementLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public io.jetprocess.model.NoteDocumentMovement saveNoteDocumentMovement(
			long receiverId, long senderId, long noteDocumentId, String remarks)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _noteDocumentMovementLocalService.saveNoteDocumentMovement(
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
	@Override
	public io.jetprocess.model.NoteDocumentMovement updateNoteDocumentMovement(
		io.jetprocess.model.NoteDocumentMovement noteDocumentMovement) {

		return _noteDocumentMovementLocalService.updateNoteDocumentMovement(
			noteDocumentMovement);
	}

	@Override
	public NoteDocumentMovementLocalService getWrappedService() {
		return _noteDocumentMovementLocalService;
	}

	@Override
	public void setWrappedService(
		NoteDocumentMovementLocalService noteDocumentMovementLocalService) {

		_noteDocumentMovementLocalService = noteDocumentMovementLocalService;
	}

	private NoteDocumentMovementLocalService _noteDocumentMovementLocalService;

}