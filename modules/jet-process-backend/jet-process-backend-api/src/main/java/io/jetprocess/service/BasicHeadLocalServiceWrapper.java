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
 * Provides a wrapper for {@link BasicHeadLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BasicHeadLocalService
 * @generated
 */
public class BasicHeadLocalServiceWrapper
	implements BasicHeadLocalService, ServiceWrapper<BasicHeadLocalService> {

	public BasicHeadLocalServiceWrapper(
		BasicHeadLocalService basicHeadLocalService) {

		_basicHeadLocalService = basicHeadLocalService;
	}

	/**
	 * Adds the basic head to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BasicHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param basicHead the basic head
	 * @return the basic head that was added
	 */
	@Override
	public io.jetprocess.model.BasicHead addBasicHead(
		io.jetprocess.model.BasicHead basicHead) {

		return _basicHeadLocalService.addBasicHead(basicHead);
	}

	/**
	 * Creates a new basic head with the primary key. Does not add the basic head to the database.
	 *
	 * @param basicHeadId the primary key for the new basic head
	 * @return the new basic head
	 */
	@Override
	public io.jetprocess.model.BasicHead createBasicHead(long basicHeadId) {
		return _basicHeadLocalService.createBasicHead(basicHeadId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _basicHeadLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the basic head from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BasicHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param basicHead the basic head
	 * @return the basic head that was removed
	 */
	@Override
	public io.jetprocess.model.BasicHead deleteBasicHead(
		io.jetprocess.model.BasicHead basicHead) {

		return _basicHeadLocalService.deleteBasicHead(basicHead);
	}

	/**
	 * Deletes the basic head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BasicHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param basicHeadId the primary key of the basic head
	 * @return the basic head that was removed
	 * @throws PortalException if a basic head with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.BasicHead deleteBasicHead(long basicHeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _basicHeadLocalService.deleteBasicHead(basicHeadId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _basicHeadLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _basicHeadLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _basicHeadLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _basicHeadLocalService.dynamicQuery();
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

		return _basicHeadLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.BasicHeadModelImpl</code>.
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

		return _basicHeadLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.BasicHeadModelImpl</code>.
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

		return _basicHeadLocalService.dynamicQuery(
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

		return _basicHeadLocalService.dynamicQueryCount(dynamicQuery);
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

		return _basicHeadLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.BasicHead fetchBasicHead(long basicHeadId) {
		return _basicHeadLocalService.fetchBasicHead(basicHeadId);
	}

	/**
	 * Returns the basic head matching the UUID and group.
	 *
	 * @param uuid the basic head's UUID
	 * @param groupId the primary key of the group
	 * @return the matching basic head, or <code>null</code> if a matching basic head could not be found
	 */
	@Override
	public io.jetprocess.model.BasicHead fetchBasicHeadByUuidAndGroupId(
		String uuid, long groupId) {

		return _basicHeadLocalService.fetchBasicHeadByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _basicHeadLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the basic head with the primary key.
	 *
	 * @param basicHeadId the primary key of the basic head
	 * @return the basic head
	 * @throws PortalException if a basic head with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.BasicHead getBasicHead(long basicHeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _basicHeadLocalService.getBasicHead(basicHeadId);
	}

	/**
	 * Returns the basic head matching the UUID and group.
	 *
	 * @param uuid the basic head's UUID
	 * @param groupId the primary key of the group
	 * @return the matching basic head
	 * @throws PortalException if a matching basic head could not be found
	 */
	@Override
	public io.jetprocess.model.BasicHead getBasicHeadByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _basicHeadLocalService.getBasicHeadByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the basic heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.BasicHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @return the range of basic heads
	 */
	@Override
	public java.util.List<io.jetprocess.model.BasicHead> getBasicHeads(
		int start, int end) {

		return _basicHeadLocalService.getBasicHeads(start, end);
	}

	/**
	 * Returns all the basic heads matching the UUID and company.
	 *
	 * @param uuid the UUID of the basic heads
	 * @param companyId the primary key of the company
	 * @return the matching basic heads, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.BasicHead>
		getBasicHeadsByUuidAndCompanyId(String uuid, long companyId) {

		return _basicHeadLocalService.getBasicHeadsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of basic heads matching the UUID and company.
	 *
	 * @param uuid the UUID of the basic heads
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of basic heads
	 * @param end the upper bound of the range of basic heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching basic heads, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.BasicHead>
		getBasicHeadsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<io.jetprocess.model.BasicHead> orderByComparator) {

		return _basicHeadLocalService.getBasicHeadsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of basic heads.
	 *
	 * @return the number of basic heads
	 */
	@Override
	public int getBasicHeadsCount() {
		return _basicHeadLocalService.getBasicHeadsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _basicHeadLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _basicHeadLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _basicHeadLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _basicHeadLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the basic head in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect BasicHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param basicHead the basic head
	 * @return the basic head that was updated
	 */
	@Override
	public io.jetprocess.model.BasicHead updateBasicHead(
		io.jetprocess.model.BasicHead basicHead) {

		return _basicHeadLocalService.updateBasicHead(basicHead);
	}

	@Override
	public BasicHeadLocalService getWrappedService() {
		return _basicHeadLocalService;
	}

	@Override
	public void setWrappedService(BasicHeadLocalService basicHeadLocalService) {
		_basicHeadLocalService = basicHeadLocalService;
	}

	private BasicHeadLocalService _basicHeadLocalService;

}