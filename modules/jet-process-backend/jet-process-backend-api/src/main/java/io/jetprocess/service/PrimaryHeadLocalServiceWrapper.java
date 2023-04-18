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
 * Provides a wrapper for {@link PrimaryHeadLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PrimaryHeadLocalService
 * @generated
 */
public class PrimaryHeadLocalServiceWrapper
	implements PrimaryHeadLocalService,
			   ServiceWrapper<PrimaryHeadLocalService> {

	public PrimaryHeadLocalServiceWrapper(
		PrimaryHeadLocalService primaryHeadLocalService) {

		_primaryHeadLocalService = primaryHeadLocalService;
	}

	/**
	 * Adds the primary head to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PrimaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param primaryHead the primary head
	 * @return the primary head that was added
	 */
	@Override
	public io.jetprocess.model.PrimaryHead addPrimaryHead(
		io.jetprocess.model.PrimaryHead primaryHead) {

		return _primaryHeadLocalService.addPrimaryHead(primaryHead);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _primaryHeadLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new primary head with the primary key. Does not add the primary head to the database.
	 *
	 * @param primaryHeadId the primary key for the new primary head
	 * @return the new primary head
	 */
	@Override
	public io.jetprocess.model.PrimaryHead createPrimaryHead(
		long primaryHeadId) {

		return _primaryHeadLocalService.createPrimaryHead(primaryHeadId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _primaryHeadLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the primary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PrimaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param primaryHeadId the primary key of the primary head
	 * @return the primary head that was removed
	 * @throws PortalException if a primary head with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.PrimaryHead deletePrimaryHead(long primaryHeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _primaryHeadLocalService.deletePrimaryHead(primaryHeadId);
	}

	/**
	 * Deletes the primary head from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PrimaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param primaryHead the primary head
	 * @return the primary head that was removed
	 */
	@Override
	public io.jetprocess.model.PrimaryHead deletePrimaryHead(
		io.jetprocess.model.PrimaryHead primaryHead) {

		return _primaryHeadLocalService.deletePrimaryHead(primaryHead);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _primaryHeadLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _primaryHeadLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _primaryHeadLocalService.dynamicQuery();
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

		return _primaryHeadLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.PrimaryHeadModelImpl</code>.
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

		return _primaryHeadLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.PrimaryHeadModelImpl</code>.
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

		return _primaryHeadLocalService.dynamicQuery(
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

		return _primaryHeadLocalService.dynamicQueryCount(dynamicQuery);
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

		return _primaryHeadLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.PrimaryHead fetchPrimaryHead(
		long primaryHeadId) {

		return _primaryHeadLocalService.fetchPrimaryHead(primaryHeadId);
	}

	/**
	 * Returns the primary head matching the UUID and group.
	 *
	 * @param uuid the primary head's UUID
	 * @param groupId the primary key of the group
	 * @return the matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	@Override
	public io.jetprocess.model.PrimaryHead fetchPrimaryHeadByUuidAndGroupId(
		String uuid, long groupId) {

		return _primaryHeadLocalService.fetchPrimaryHeadByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _primaryHeadLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _primaryHeadLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _primaryHeadLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _primaryHeadLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _primaryHeadLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the primary head with the primary key.
	 *
	 * @param primaryHeadId the primary key of the primary head
	 * @return the primary head
	 * @throws PortalException if a primary head with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.PrimaryHead getPrimaryHead(long primaryHeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _primaryHeadLocalService.getPrimaryHead(primaryHeadId);
	}

	@Override
	public java.util.List<io.jetprocess.model.PrimaryHead>
		getPrimaryHeadByBasicHead(long basicHeadId) {

		return _primaryHeadLocalService.getPrimaryHeadByBasicHead(basicHeadId);
	}

	/**
	 * Returns the primary head matching the UUID and group.
	 *
	 * @param uuid the primary head's UUID
	 * @param groupId the primary key of the group
	 * @return the matching primary head
	 * @throws PortalException if a matching primary head could not be found
	 */
	@Override
	public io.jetprocess.model.PrimaryHead getPrimaryHeadByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _primaryHeadLocalService.getPrimaryHeadByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the primary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @return the range of primary heads
	 */
	@Override
	public java.util.List<io.jetprocess.model.PrimaryHead> getPrimaryHeads(
		int start, int end) {

		return _primaryHeadLocalService.getPrimaryHeads(start, end);
	}

	/**
	 * Returns all the primary heads matching the UUID and company.
	 *
	 * @param uuid the UUID of the primary heads
	 * @param companyId the primary key of the company
	 * @return the matching primary heads, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.PrimaryHead>
		getPrimaryHeadsByUuidAndCompanyId(String uuid, long companyId) {

		return _primaryHeadLocalService.getPrimaryHeadsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of primary heads matching the UUID and company.
	 *
	 * @param uuid the UUID of the primary heads
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching primary heads, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.PrimaryHead>
		getPrimaryHeadsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<io.jetprocess.model.PrimaryHead> orderByComparator) {

		return _primaryHeadLocalService.getPrimaryHeadsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of primary heads.
	 *
	 * @return the number of primary heads
	 */
	@Override
	public int getPrimaryHeadsCount() {
		return _primaryHeadLocalService.getPrimaryHeadsCount();
	}

	/**
	 * Updates the primary head in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PrimaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param primaryHead the primary head
	 * @return the primary head that was updated
	 */
	@Override
	public io.jetprocess.model.PrimaryHead updatePrimaryHead(
		io.jetprocess.model.PrimaryHead primaryHead) {

		return _primaryHeadLocalService.updatePrimaryHead(primaryHead);
	}

	@Override
	public PrimaryHeadLocalService getWrappedService() {
		return _primaryHeadLocalService;
	}

	@Override
	public void setWrappedService(
		PrimaryHeadLocalService primaryHeadLocalService) {

		_primaryHeadLocalService = primaryHeadLocalService;
	}

	private PrimaryHeadLocalService _primaryHeadLocalService;

}