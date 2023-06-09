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

import io.jetprocess.model.DraftRecipient;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DraftRecipient. This utility wraps
 * <code>io.jetprocess.service.impl.DraftRecipientLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DraftRecipientLocalService
 * @generated
 */
public class DraftRecipientLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>io.jetprocess.service.impl.DraftRecipientLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static DraftRecipient addDraftRecipient(
		DraftRecipient draftRecipient) {

		return getService().addDraftRecipient(draftRecipient);
	}

	/**
	 * Creates a new draft recipient with the primary key. Does not add the draft recipient to the database.
	 *
	 * @param id the primary key for the new draft recipient
	 * @return the new draft recipient
	 */
	public static DraftRecipient createDraftRecipient(long id) {
		return getService().createDraftRecipient(id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static DraftRecipient createRecipient(
		long draftId, long organizationId, String name, String designation,
		String email, String mobile, String address, long stateId, String city,
		String pinCode) {

		return getService().createRecipient(
			draftId, organizationId, name, designation, email, mobile, address,
			stateId, city, pinCode);
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
	public static DraftRecipient deleteDraftRecipient(
		DraftRecipient draftRecipient) {

		return getService().deleteDraftRecipient(draftRecipient);
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
	public static DraftRecipient deleteDraftRecipient(long id)
		throws PortalException {

		return getService().deleteDraftRecipient(id);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftRecipientModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DraftRecipientModelImpl</code>.
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

	public static DraftRecipient fetchDraftRecipient(long id) {
		return getService().fetchDraftRecipient(id);
	}

	/**
	 * Returns the draft recipient matching the UUID and group.
	 *
	 * @param uuid the draft recipient's UUID
	 * @param groupId the primary key of the group
	 * @return the matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public static DraftRecipient fetchDraftRecipientByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchDraftRecipientByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the draft recipient with the primary key.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient
	 * @throws PortalException if a draft recipient with the primary key could not be found
	 */
	public static DraftRecipient getDraftRecipient(long id)
		throws PortalException {

		return getService().getDraftRecipient(id);
	}

	/**
	 * Returns the draft recipient matching the UUID and group.
	 *
	 * @param uuid the draft recipient's UUID
	 * @param groupId the primary key of the group
	 * @return the matching draft recipient
	 * @throws PortalException if a matching draft recipient could not be found
	 */
	public static DraftRecipient getDraftRecipientByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getDraftRecipientByUuidAndGroupId(uuid, groupId);
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
	public static List<DraftRecipient> getDraftRecipients(int start, int end) {
		return getService().getDraftRecipients(start, end);
	}

	/**
	 * Returns all the draft recipients matching the UUID and company.
	 *
	 * @param uuid the UUID of the draft recipients
	 * @param companyId the primary key of the company
	 * @return the matching draft recipients, or an empty list if no matches were found
	 */
	public static List<DraftRecipient> getDraftRecipientsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getDraftRecipientsByUuidAndCompanyId(
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
	public static List<DraftRecipient> getDraftRecipientsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return getService().getDraftRecipientsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of draft recipients.
	 *
	 * @return the number of draft recipients
	 */
	public static int getDraftRecipientsCount() {
		return getService().getDraftRecipientsCount();
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

	public static List<DraftRecipient> getRecipientList(long draftId) {
		return getService().getRecipientList(draftId);
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
	public static DraftRecipient updateDraftRecipient(
		DraftRecipient draftRecipient) {

		return getService().updateDraftRecipient(draftRecipient);
	}

	public static DraftRecipient updateRecipient(
			long id, long organizationId, String name, String designation,
			String email, String mobile, String address, long stateId,
			String city, String pinCode)
		throws PortalException {

		return getService().updateRecipient(
			id, organizationId, name, designation, email, mobile, address,
			stateId, city, pinCode);
	}

	public static DraftRecipientLocalService getService() {
		return _service;
	}

	private static volatile DraftRecipientLocalService _service;

}