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
 * Provides a wrapper for {@link DraftLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DraftLocalService
 * @generated
 */
public class DraftLocalServiceWrapper
	implements DraftLocalService, ServiceWrapper<DraftLocalService> {

	public DraftLocalServiceWrapper(DraftLocalService draftLocalService) {
		_draftLocalService = draftLocalService;
	}

	/**
	 * Adds the draft to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param draft the draft
	 * @return the draft that was added
	 */
	@Override
	public io.jetprocess.model.Draft addDraft(io.jetprocess.model.Draft draft) {
		return _draftLocalService.addDraft(draft);
	}

	@Override
	public io.jetprocess.model.Draft createDraft(
		io.jetprocess.model.Draft draft) {

		return _draftLocalService.createDraft(draft);
	}

	/**
	 * Creates a new draft with the primary key. Does not add the draft to the database.
	 *
	 * @param id the primary key for the new draft
	 * @return the new draft
	 */
	@Override
	public io.jetprocess.model.Draft createDraft(long id) {
		return _draftLocalService.createDraft(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the draft from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param draft the draft
	 * @return the draft that was removed
	 */
	@Override
	public io.jetprocess.model.Draft deleteDraft(
		io.jetprocess.model.Draft draft) {

		return _draftLocalService.deleteDraft(draft);
	}

	/**
	 * Deletes the draft with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the draft
	 * @return the draft that was removed
	 * @throws PortalException if a draft with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.Draft deleteDraft(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftLocalService.deleteDraft(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _draftLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _draftLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _draftLocalService.dynamicQuery();
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

		return _draftLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftModelImpl</code>.
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

		return _draftLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftModelImpl</code>.
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

		return _draftLocalService.dynamicQuery(
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

		return _draftLocalService.dynamicQueryCount(dynamicQuery);
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

		return _draftLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.Draft fetchDraft(long id) {
		return _draftLocalService.fetchDraft(id);
	}

	/**
	 * Returns the draft matching the UUID and group.
	 *
	 * @param uuid the draft's UUID
	 * @param groupId the primary key of the group
	 * @return the matching draft, or <code>null</code> if a matching draft could not be found
	 */
	@Override
	public io.jetprocess.model.Draft fetchDraftByUuidAndGroupId(
		String uuid, long groupId) {

		return _draftLocalService.fetchDraftByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public String generateDraftNo(long id) {
		return _draftLocalService.generateDraftNo(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _draftLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the draft with the primary key.
	 *
	 * @param id the primary key of the draft
	 * @return the draft
	 * @throws PortalException if a draft with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.Draft getDraft(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftLocalService.getDraft(id);
	}

	/**
	 * Returns the draft matching the UUID and group.
	 *
	 * @param uuid the draft's UUID
	 * @param groupId the primary key of the group
	 * @return the matching draft
	 * @throws PortalException if a matching draft could not be found
	 */
	@Override
	public io.jetprocess.model.Draft getDraftByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftLocalService.getDraftByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<io.jetprocess.model.Draft> getDrafts() {
		return _draftLocalService.getDrafts();
	}

	/**
	 * Returns a range of all the drafts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @return the range of drafts
	 */
	@Override
	public java.util.List<io.jetprocess.model.Draft> getDrafts(
		int start, int end) {

		return _draftLocalService.getDrafts(start, end);
	}

	/**
	 * Returns all the drafts matching the UUID and company.
	 *
	 * @param uuid the UUID of the drafts
	 * @param companyId the primary key of the company
	 * @return the matching drafts, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.Draft>
		getDraftsByUuidAndCompanyId(String uuid, long companyId) {

		return _draftLocalService.getDraftsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of drafts matching the UUID and company.
	 *
	 * @param uuid the UUID of the drafts
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of drafts
	 * @param end the upper bound of the range of drafts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching drafts, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.Draft>
		getDraftsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<io.jetprocess.model.Draft> orderByComparator) {

		return _draftLocalService.getDraftsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of drafts.
	 *
	 * @return the number of drafts
	 */
	@Override
	public int getDraftsCount() {
		return _draftLocalService.getDraftsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _draftLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _draftLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _draftLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the draft in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param draft the draft
	 * @return the draft that was updated
	 */
	@Override
	public io.jetprocess.model.Draft updateDraft(
		io.jetprocess.model.Draft draft) {

		return _draftLocalService.updateDraft(draft);
	}

	@Override
	public io.jetprocess.model.Draft updateDraft(
			long id, io.jetprocess.model.Draft draft)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftLocalService.updateDraft(id, draft);
	}

	@Override
	public DraftLocalService getWrappedService() {
		return _draftLocalService;
	}

	@Override
	public void setWrappedService(DraftLocalService draftLocalService) {
		_draftLocalService = draftLocalService;
	}

	private DraftLocalService _draftLocalService;

}