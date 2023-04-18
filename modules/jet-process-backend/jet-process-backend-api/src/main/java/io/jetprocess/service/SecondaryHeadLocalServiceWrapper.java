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
 * Provides a wrapper for {@link SecondaryHeadLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SecondaryHeadLocalService
 * @generated
 */
public class SecondaryHeadLocalServiceWrapper
	implements SecondaryHeadLocalService,
			   ServiceWrapper<SecondaryHeadLocalService> {

	public SecondaryHeadLocalServiceWrapper(
		SecondaryHeadLocalService secondaryHeadLocalService) {

		_secondaryHeadLocalService = secondaryHeadLocalService;
	}

	/**
	 * Adds the secondary head to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondaryHead the secondary head
	 * @return the secondary head that was added
	 */
	@Override
	public io.jetprocess.model.SecondaryHead addSecondaryHead(
		io.jetprocess.model.SecondaryHead secondaryHead) {

		return _secondaryHeadLocalService.addSecondaryHead(secondaryHead);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondaryHeadLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new secondary head with the primary key. Does not add the secondary head to the database.
	 *
	 * @param secondaryHeadId the primary key for the new secondary head
	 * @return the new secondary head
	 */
	@Override
	public io.jetprocess.model.SecondaryHead createSecondaryHead(
		long secondaryHeadId) {

		return _secondaryHeadLocalService.createSecondaryHead(secondaryHeadId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondaryHeadLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the secondary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head that was removed
	 * @throws PortalException if a secondary head with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.SecondaryHead deleteSecondaryHead(
			long secondaryHeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondaryHeadLocalService.deleteSecondaryHead(secondaryHeadId);
	}

	/**
	 * Deletes the secondary head from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondaryHead the secondary head
	 * @return the secondary head that was removed
	 */
	@Override
	public io.jetprocess.model.SecondaryHead deleteSecondaryHead(
		io.jetprocess.model.SecondaryHead secondaryHead) {

		return _secondaryHeadLocalService.deleteSecondaryHead(secondaryHead);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _secondaryHeadLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _secondaryHeadLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _secondaryHeadLocalService.dynamicQuery();
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

		return _secondaryHeadLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.SecondaryHeadModelImpl</code>.
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

		return _secondaryHeadLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.SecondaryHeadModelImpl</code>.
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

		return _secondaryHeadLocalService.dynamicQuery(
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

		return _secondaryHeadLocalService.dynamicQueryCount(dynamicQuery);
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

		return _secondaryHeadLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.SecondaryHead fetchSecondaryHead(
		long secondaryHeadId) {

		return _secondaryHeadLocalService.fetchSecondaryHead(secondaryHeadId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _secondaryHeadLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _secondaryHeadLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _secondaryHeadLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondaryHeadLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the secondary head with the primary key.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head
	 * @throws PortalException if a secondary head with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.SecondaryHead getSecondaryHead(
			long secondaryHeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondaryHeadLocalService.getSecondaryHead(secondaryHeadId);
	}

	@Override
	public java.util.List<io.jetprocess.model.SecondaryHead>
		getSecondaryHeadByPrimaryHeadId(long primaryHeadId) {

		return _secondaryHeadLocalService.getSecondaryHeadByPrimaryHeadId(
			primaryHeadId);
	}

	/**
	 * Returns a range of all the secondary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @return the range of secondary heads
	 */
	@Override
	public java.util.List<io.jetprocess.model.SecondaryHead> getSecondaryHeads(
		int start, int end) {

		return _secondaryHeadLocalService.getSecondaryHeads(start, end);
	}

	/**
	 * Returns the number of secondary heads.
	 *
	 * @return the number of secondary heads
	 */
	@Override
	public int getSecondaryHeadsCount() {
		return _secondaryHeadLocalService.getSecondaryHeadsCount();
	}

	/**
	 * Updates the secondary head in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondaryHead the secondary head
	 * @return the secondary head that was updated
	 */
	@Override
	public io.jetprocess.model.SecondaryHead updateSecondaryHead(
		io.jetprocess.model.SecondaryHead secondaryHead) {

		return _secondaryHeadLocalService.updateSecondaryHead(secondaryHead);
	}

	@Override
	public SecondaryHeadLocalService getWrappedService() {
		return _secondaryHeadLocalService;
	}

	@Override
	public void setWrappedService(
		SecondaryHeadLocalService secondaryHeadLocalService) {

		_secondaryHeadLocalService = secondaryHeadLocalService;
	}

	private SecondaryHeadLocalService _secondaryHeadLocalService;

}