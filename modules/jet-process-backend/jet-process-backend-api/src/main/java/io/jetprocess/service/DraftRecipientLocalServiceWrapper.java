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
 * Provides a wrapper for {@link DraftRecipientLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DraftRecipientLocalService
 * @generated
 */
public class DraftRecipientLocalServiceWrapper
	implements DraftRecipientLocalService,
			   ServiceWrapper<DraftRecipientLocalService> {

	public DraftRecipientLocalServiceWrapper(
		DraftRecipientLocalService draftRecipientLocalService) {

		_draftRecipientLocalService = draftRecipientLocalService;
	}

	/**
	 * Adds the draft recipient to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftRecipientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param draftRecipient the draft recipient
	 * @return the draft recipient that was added
	 */
	@Override
	public io.jetprocess.model.DraftRecipient addDraftRecipient(
		io.jetprocess.model.DraftRecipient draftRecipient) {

		return _draftRecipientLocalService.addDraftRecipient(draftRecipient);
	}

	@Override
	public io.jetprocess.model.DraftRecipient createDraft(
		io.jetprocess.model.DraftRecipient draftRecipient) {

		return _draftRecipientLocalService.createDraft(draftRecipient);
	}

	/**
	 * Creates a new draft recipient with the primary key. Does not add the draft recipient to the database.
	 *
	 * @param id the primary key for the new draft recipient
	 * @return the new draft recipient
	 */
	@Override
	public io.jetprocess.model.DraftRecipient createDraftRecipient(long id) {
		return _draftRecipientLocalService.createDraftRecipient(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftRecipientLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the draft recipient from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftRecipientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param draftRecipient the draft recipient
	 * @return the draft recipient that was removed
	 */
	@Override
	public io.jetprocess.model.DraftRecipient deleteDraftRecipient(
		io.jetprocess.model.DraftRecipient draftRecipient) {

		return _draftRecipientLocalService.deleteDraftRecipient(draftRecipient);
	}

	/**
	 * Deletes the draft recipient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftRecipientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient that was removed
	 * @throws PortalException if a draft recipient with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.DraftRecipient deleteDraftRecipient(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftRecipientLocalService.deleteDraftRecipient(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftRecipientLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _draftRecipientLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _draftRecipientLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _draftRecipientLocalService.dynamicQuery();
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

		return _draftRecipientLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftRecipientModelImpl</code>.
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

		return _draftRecipientLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftRecipientModelImpl</code>.
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

		return _draftRecipientLocalService.dynamicQuery(
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

		return _draftRecipientLocalService.dynamicQueryCount(dynamicQuery);
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

		return _draftRecipientLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.DraftRecipient fetchDraftRecipient(long id) {
		return _draftRecipientLocalService.fetchDraftRecipient(id);
	}

	/**
	 * Returns the draft recipient matching the UUID and group.
	 *
	 * @param uuid the draft recipient's UUID
	 * @param groupId the primary key of the group
	 * @return the matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	@Override
	public io.jetprocess.model.DraftRecipient
		fetchDraftRecipientByUuidAndGroupId(String uuid, long groupId) {

		return _draftRecipientLocalService.fetchDraftRecipientByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _draftRecipientLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the draft recipient with the primary key.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient
	 * @throws PortalException if a draft recipient with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.DraftRecipient getDraftRecipient(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftRecipientLocalService.getDraftRecipient(id);
	}

	/**
	 * Returns the draft recipient matching the UUID and group.
	 *
	 * @param uuid the draft recipient's UUID
	 * @param groupId the primary key of the group
	 * @return the matching draft recipient
	 * @throws PortalException if a matching draft recipient could not be found
	 */
	@Override
	public io.jetprocess.model.DraftRecipient getDraftRecipientByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftRecipientLocalService.getDraftRecipientByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the draft recipients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @return the range of draft recipients
	 */
	@Override
	public java.util.List<io.jetprocess.model.DraftRecipient>
		getDraftRecipients(int start, int end) {

		return _draftRecipientLocalService.getDraftRecipients(start, end);
	}

	/**
	 * Returns all the draft recipients matching the UUID and company.
	 *
	 * @param uuid the UUID of the draft recipients
	 * @param companyId the primary key of the company
	 * @return the matching draft recipients, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.DraftRecipient>
		getDraftRecipientsByUuidAndCompanyId(String uuid, long companyId) {

		return _draftRecipientLocalService.getDraftRecipientsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of draft recipients matching the UUID and company.
	 *
	 * @param uuid the UUID of the draft recipients
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching draft recipients, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.DraftRecipient>
		getDraftRecipientsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<io.jetprocess.model.DraftRecipient> orderByComparator) {

		return _draftRecipientLocalService.getDraftRecipientsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of draft recipients.
	 *
	 * @return the number of draft recipients
	 */
	@Override
	public int getDraftRecipientsCount() {
		return _draftRecipientLocalService.getDraftRecipientsCount();
	}

	@Override
	public java.util.List<io.jetprocess.model.DraftRecipient> getDrafts(
		long draftId) {

		return _draftRecipientLocalService.getDrafts(draftId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _draftRecipientLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _draftRecipientLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _draftRecipientLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _draftRecipientLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the draft recipient in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DraftRecipientLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param draftRecipient the draft recipient
	 * @return the draft recipient that was updated
	 */
	@Override
	public io.jetprocess.model.DraftRecipient updateDraftRecipient(
		io.jetprocess.model.DraftRecipient draftRecipient) {

		return _draftRecipientLocalService.updateDraftRecipient(draftRecipient);
	}

	@Override
	public DraftRecipientLocalService getWrappedService() {
		return _draftRecipientLocalService;
	}

	@Override
	public void setWrappedService(
		DraftRecipientLocalService draftRecipientLocalService) {

		_draftRecipientLocalService = draftRecipientLocalService;
	}

	private DraftRecipientLocalService _draftRecipientLocalService;

}