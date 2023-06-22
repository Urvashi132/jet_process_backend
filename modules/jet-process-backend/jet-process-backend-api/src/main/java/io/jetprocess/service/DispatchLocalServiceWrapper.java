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
 * Provides a wrapper for {@link DispatchLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DispatchLocalService
 * @generated
 */
public class DispatchLocalServiceWrapper
	implements DispatchLocalService, ServiceWrapper<DispatchLocalService> {

	public DispatchLocalServiceWrapper(
		DispatchLocalService dispatchLocalService) {

		_dispatchLocalService = dispatchLocalService;
	}

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
	@Override
	public io.jetprocess.model.Dispatch addDispatch(
		io.jetprocess.model.Dispatch dispatch) {

		return _dispatchLocalService.addDispatch(dispatch);
	}

	@Override
	public io.jetprocess.model.Dispatch addDispatch(
		String dispatchBy, String deliveryMode, String address, String subject,
		String dispatchedOn, String dispatchType, String issuNo,
		long receiptentId, long draftId) {

		return _dispatchLocalService.addDispatch(
			dispatchBy, deliveryMode, address, subject, dispatchedOn,
			dispatchType, issuNo, receiptentId, draftId);
	}

	/**
	 * Creates a new dispatch with the primary key. Does not add the dispatch to the database.
	 *
	 * @param id the primary key for the new dispatch
	 * @return the new dispatch
	 */
	@Override
	public io.jetprocess.model.Dispatch createDispatch(long id) {
		return _dispatchLocalService.createDispatch(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dispatchLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public io.jetprocess.model.Dispatch deleteDispatch(
		io.jetprocess.model.Dispatch dispatch) {

		return _dispatchLocalService.deleteDispatch(dispatch);
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
	@Override
	public io.jetprocess.model.Dispatch deleteDispatch(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dispatchLocalService.deleteDispatch(id);
	}

	@Override
	public void deleteDispatchById(long dispatchId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_dispatchLocalService.deleteDispatchById(dispatchId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dispatchLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _dispatchLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _dispatchLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dispatchLocalService.dynamicQuery();
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

		return _dispatchLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _dispatchLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _dispatchLocalService.dynamicQuery(
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

		return _dispatchLocalService.dynamicQueryCount(dynamicQuery);
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

		return _dispatchLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.Dispatch fetchDispatch(long id) {
		return _dispatchLocalService.fetchDispatch(id);
	}

	/**
	 * Returns the dispatch matching the UUID and group.
	 *
	 * @param uuid the dispatch's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dispatch, or <code>null</code> if a matching dispatch could not be found
	 */
	@Override
	public io.jetprocess.model.Dispatch fetchDispatchByUuidAndGroupId(
		String uuid, long groupId) {

		return _dispatchLocalService.fetchDispatchByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _dispatchLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the dispatch with the primary key.
	 *
	 * @param id the primary key of the dispatch
	 * @return the dispatch
	 * @throws PortalException if a dispatch with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.Dispatch getDispatch(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dispatchLocalService.getDispatch(id);
	}

	@Override
	public io.jetprocess.model.Dispatch getdispatchById(long dispatchId) {
		return _dispatchLocalService.getdispatchById(dispatchId);
	}

	/**
	 * Returns the dispatch matching the UUID and group.
	 *
	 * @param uuid the dispatch's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dispatch
	 * @throws PortalException if a matching dispatch could not be found
	 */
	@Override
	public io.jetprocess.model.Dispatch getDispatchByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dispatchLocalService.getDispatchByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<io.jetprocess.model.Dispatch> getDispatches(
		int start, int end) {

		return _dispatchLocalService.getDispatches(start, end);
	}

	/**
	 * Returns all the dispatches matching the UUID and company.
	 *
	 * @param uuid the UUID of the dispatches
	 * @param companyId the primary key of the company
	 * @return the matching dispatches, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.Dispatch>
		getDispatchesByUuidAndCompanyId(String uuid, long companyId) {

		return _dispatchLocalService.getDispatchesByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<io.jetprocess.model.Dispatch>
		getDispatchesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<io.jetprocess.model.Dispatch> orderByComparator) {

		return _dispatchLocalService.getDispatchesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of dispatches.
	 *
	 * @return the number of dispatches
	 */
	@Override
	public int getDispatchesCount() {
		return _dispatchLocalService.getDispatchesCount();
	}

	@Override
	public java.util.List<io.jetprocess.model.Dispatch> getDispatchList() {
		return _dispatchLocalService.getDispatchList();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _dispatchLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _dispatchLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dispatchLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dispatchLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public io.jetprocess.model.Dispatch updateDispatch(
		io.jetprocess.model.Dispatch dispatch) {

		return _dispatchLocalService.updateDispatch(dispatch);
	}

	@Override
	public DispatchLocalService getWrappedService() {
		return _dispatchLocalService;
	}

	@Override
	public void setWrappedService(DispatchLocalService dispatchLocalService) {
		_dispatchLocalService = dispatchLocalService;
	}

	private DispatchLocalService _dispatchLocalService;

}