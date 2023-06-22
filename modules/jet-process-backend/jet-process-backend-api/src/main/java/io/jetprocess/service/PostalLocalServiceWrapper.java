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
 * Provides a wrapper for {@link PostalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PostalLocalService
 * @generated
 */
public class PostalLocalServiceWrapper
	implements PostalLocalService, ServiceWrapper<PostalLocalService> {

	public PostalLocalServiceWrapper(PostalLocalService postalLocalService) {
		_postalLocalService = postalLocalService;
	}

	/**
	 * Adds the postal to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PostalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param postal the postal
	 * @return the postal that was added
	 */
	@Override
	public io.jetprocess.model.Postal addPostal(
		io.jetprocess.model.Postal postal) {

		return _postalLocalService.addPostal(postal);
	}

	@Override
	public io.jetprocess.model.Postal addPostal(
		String postalMode, String postalCharge, String medium, String weight,
		long modeNo, String peonBookNo, String peonName, java.util.Date outDate,
		java.util.Date deliveryDate, String deliveryStatus) {

		return _postalLocalService.addPostal(
			postalMode, postalCharge, medium, weight, modeNo, peonBookNo,
			peonName, outDate, deliveryDate, deliveryStatus);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _postalLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new postal with the primary key. Does not add the postal to the database.
	 *
	 * @param id the primary key for the new postal
	 * @return the new postal
	 */
	@Override
	public io.jetprocess.model.Postal createPostal(long id) {
		return _postalLocalService.createPostal(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _postalLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the postal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PostalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the postal
	 * @return the postal that was removed
	 * @throws PortalException if a postal with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.Postal deletePostal(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _postalLocalService.deletePostal(id);
	}

	/**
	 * Deletes the postal from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PostalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param postal the postal
	 * @return the postal that was removed
	 */
	@Override
	public io.jetprocess.model.Postal deletePostal(
		io.jetprocess.model.Postal postal) {

		return _postalLocalService.deletePostal(postal);
	}

	@Override
	public void deletePostalById(long postalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		_postalLocalService.deletePostalById(postalId);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _postalLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _postalLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _postalLocalService.dynamicQuery();
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

		return _postalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.PostalModelImpl</code>.
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

		return _postalLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.PostalModelImpl</code>.
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

		return _postalLocalService.dynamicQuery(
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

		return _postalLocalService.dynamicQueryCount(dynamicQuery);
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

		return _postalLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.Postal fetchPostal(long id) {
		return _postalLocalService.fetchPostal(id);
	}

	/**
	 * Returns the postal matching the UUID and group.
	 *
	 * @param uuid the postal's UUID
	 * @param groupId the primary key of the group
	 * @return the matching postal, or <code>null</code> if a matching postal could not be found
	 */
	@Override
	public io.jetprocess.model.Postal fetchPostalByUuidAndGroupId(
		String uuid, long groupId) {

		return _postalLocalService.fetchPostalByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _postalLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _postalLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _postalLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _postalLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _postalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the postal with the primary key.
	 *
	 * @param id the primary key of the postal
	 * @return the postal
	 * @throws PortalException if a postal with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.Postal getPostal(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _postalLocalService.getPostal(id);
	}

	@Override
	public io.jetprocess.model.Postal getPostalById(long postalId) {
		return _postalLocalService.getPostalById(postalId);
	}

	/**
	 * Returns the postal matching the UUID and group.
	 *
	 * @param uuid the postal's UUID
	 * @param groupId the primary key of the group
	 * @return the matching postal
	 * @throws PortalException if a matching postal could not be found
	 */
	@Override
	public io.jetprocess.model.Postal getPostalByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _postalLocalService.getPostalByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<io.jetprocess.model.Postal> getPostalList() {
		return _postalLocalService.getPostalList();
	}

	/**
	 * Returns a range of all the postals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.PostalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @return the range of postals
	 */
	@Override
	public java.util.List<io.jetprocess.model.Postal> getPostals(
		int start, int end) {

		return _postalLocalService.getPostals(start, end);
	}

	/**
	 * Returns all the postals matching the UUID and company.
	 *
	 * @param uuid the UUID of the postals
	 * @param companyId the primary key of the company
	 * @return the matching postals, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.Postal>
		getPostalsByUuidAndCompanyId(String uuid, long companyId) {

		return _postalLocalService.getPostalsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of postals matching the UUID and company.
	 *
	 * @param uuid the UUID of the postals
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching postals, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.Postal>
		getPostalsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<io.jetprocess.model.Postal> orderByComparator) {

		return _postalLocalService.getPostalsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of postals.
	 *
	 * @return the number of postals
	 */
	@Override
	public int getPostalsCount() {
		return _postalLocalService.getPostalsCount();
	}

	/**
	 * Updates the postal in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PostalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param postal the postal
	 * @return the postal that was updated
	 */
	@Override
	public io.jetprocess.model.Postal updatePostal(
		io.jetprocess.model.Postal postal) {

		return _postalLocalService.updatePostal(postal);
	}

	@Override
	public PostalLocalService getWrappedService() {
		return _postalLocalService;
	}

	@Override
	public void setWrappedService(PostalLocalService postalLocalService) {
		_postalLocalService = postalLocalService;
	}

	private PostalLocalService _postalLocalService;

}