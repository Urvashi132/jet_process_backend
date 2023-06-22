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

import io.jetprocess.model.Dispatch;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Dispatch. This utility wraps
 * <code>io.jetprocess.service.impl.DispatchLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DispatchLocalService
 * @generated
 */
public class DispatchLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>io.jetprocess.service.impl.DispatchLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the dispatch to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DispatchLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dispatch the dispatch
	 * @return the dispatch that was added
	 */
	public static Dispatch addDispatch(Dispatch dispatch) {
		return getService().addDispatch(dispatch);
	}

	public static Dispatch addDispatch(
		String dispatchBy, String deliveryMode, String address, String subject,
		String dispatchedOn, String dispatchType, String issuNo,
		long receiptentId, long draftId) {

		return getService().addDispatch(
			dispatchBy, deliveryMode, address, subject, dispatchedOn,
			dispatchType, issuNo, receiptentId, draftId);
	}

	/**
	 * Creates a new dispatch with the primary key. Does not add the dispatch to the database.
	 *
	 * @param id the primary key for the new dispatch
	 * @return the new dispatch
	 */
	public static Dispatch createDispatch(long id) {
		return getService().createDispatch(id);
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
	 * Deletes the dispatch from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DispatchLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dispatch the dispatch
	 * @return the dispatch that was removed
	 */
	public static Dispatch deleteDispatch(Dispatch dispatch) {
		return getService().deleteDispatch(dispatch);
	}

	/**
	 * Deletes the dispatch with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DispatchLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the dispatch
	 * @return the dispatch that was removed
	 * @throws PortalException if a dispatch with the primary key could not be found
	 */
	public static Dispatch deleteDispatch(long id) throws PortalException {
		return getService().deleteDispatch(id);
	}

	public static void deleteDispatchById(long dispatchId)
		throws PortalException {

		getService().deleteDispatchById(dispatchId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DispatchModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DispatchModelImpl</code>.
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

	public static Dispatch fetchDispatch(long id) {
		return getService().fetchDispatch(id);
	}

	/**
	 * Returns the dispatch matching the UUID and group.
	 *
	 * @param uuid the dispatch's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	public static Dispatch fetchDispatchByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchDispatchByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the dispatch with the primary key.
	 *
	 * @param id the primary key of the dispatch
	 * @return the dispatch
	 * @throws PortalException if a dispatch with the primary key could not be found
	 */
	public static Dispatch getDispatch(long id) throws PortalException {
		return getService().getDispatch(id);
	}

	public static Dispatch getdispatchById(long dispatchId) {
		return getService().getdispatchById(dispatchId);
	}

	/**
	 * Returns the dispatch matching the UUID and group.
	 *
	 * @param uuid the dispatch's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dispatch
	 * @throws PortalException if a matching dispatch could not be found
	 */
	public static Dispatch getDispatchByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getDispatchByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the dispatches.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DispatchModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @return the range of dispatches
	 */
	public static List<Dispatch> getDispatches(int start, int end) {
		return getService().getDispatches(start, end);
	}

	/**
	 * Returns all the dispatches matching the UUID and company.
	 *
	 * @param uuid the UUID of the dispatches
	 * @param companyId the primary key of the company
	 * @return the matching dispatches, or an empty list if no matches were found
	 */
	public static List<Dispatch> getDispatchesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getDispatchesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of dispatches matching the UUID and company.
	 *
	 * @param uuid the UUID of the dispatches
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of dispatches
	 * @param end the upper bound of the range of dispatches (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching dispatches, or an empty list if no matches were found
	 */
	public static List<Dispatch> getDispatchesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Dispatch> orderByComparator) {

		return getService().getDispatchesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of dispatches.
	 *
	 * @return the number of dispatches
	 */
	public static int getDispatchesCount() {
		return getService().getDispatchesCount();
	}

	public static List<Dispatch> getDispatchList() {
		return getService().getDispatchList();
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

	/**
	 * Updates the dispatch in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DispatchLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dispatch the dispatch
	 * @return the dispatch that was updated
	 */
	public static Dispatch updateDispatch(Dispatch dispatch) {
		return getService().updateDispatch(dispatch);
	}

	public static DispatchLocalService getService() {
		return _service;
	}

	private static volatile DispatchLocalService _service;

}