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
 * Provides a wrapper for {@link TertiaryHeadLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TertiaryHeadLocalService
 * @generated
 */
public class TertiaryHeadLocalServiceWrapper
	implements ServiceWrapper<TertiaryHeadLocalService>,
			   TertiaryHeadLocalService {

	public TertiaryHeadLocalServiceWrapper(
		TertiaryHeadLocalService tertiaryHeadLocalService) {

		_tertiaryHeadLocalService = tertiaryHeadLocalService;
	}

	/**
	 * Adds the tertiary head to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TertiaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tertiaryHead the tertiary head
	 * @return the tertiary head that was added
	 */
	@Override
	public io.jetprocess.model.TertiaryHead addTertiaryHead(
		io.jetprocess.model.TertiaryHead tertiaryHead) {

		return _tertiaryHeadLocalService.addTertiaryHead(tertiaryHead);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tertiaryHeadLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new tertiary head with the primary key. Does not add the tertiary head to the database.
	 *
	 * @param tertiaryHeadId the primary key for the new tertiary head
	 * @return the new tertiary head
	 */
	@Override
	public io.jetprocess.model.TertiaryHead createTertiaryHead(
		long tertiaryHeadId) {

		return _tertiaryHeadLocalService.createTertiaryHead(tertiaryHeadId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tertiaryHeadLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the tertiary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TertiaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tertiaryHeadId the primary key of the tertiary head
	 * @return the tertiary head that was removed
	 * @throws PortalException if a tertiary head with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.TertiaryHead deleteTertiaryHead(
			long tertiaryHeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tertiaryHeadLocalService.deleteTertiaryHead(tertiaryHeadId);
	}

	/**
	 * Deletes the tertiary head from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TertiaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tertiaryHead the tertiary head
	 * @return the tertiary head that was removed
	 */
	@Override
	public io.jetprocess.model.TertiaryHead deleteTertiaryHead(
		io.jetprocess.model.TertiaryHead tertiaryHead) {

		return _tertiaryHeadLocalService.deleteTertiaryHead(tertiaryHead);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _tertiaryHeadLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _tertiaryHeadLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tertiaryHeadLocalService.dynamicQuery();
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

		return _tertiaryHeadLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.TertiaryHeadModelImpl</code>.
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

		return _tertiaryHeadLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.TertiaryHeadModelImpl</code>.
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

		return _tertiaryHeadLocalService.dynamicQuery(
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

		return _tertiaryHeadLocalService.dynamicQueryCount(dynamicQuery);
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

		return _tertiaryHeadLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.TertiaryHead fetchTertiaryHead(
		long tertiaryHeadId) {

		return _tertiaryHeadLocalService.fetchTertiaryHead(tertiaryHeadId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _tertiaryHeadLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _tertiaryHeadLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _tertiaryHeadLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tertiaryHeadLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<io.jetprocess.model.TertiaryHead>
		getTeritaryHeadBySecondaryHeadId(long secondaryHeadId) {

		return _tertiaryHeadLocalService.getTeritaryHeadBySecondaryHeadId(
			secondaryHeadId);
	}

	/**
	 * Returns the tertiary head with the primary key.
	 *
	 * @param tertiaryHeadId the primary key of the tertiary head
	 * @return the tertiary head
	 * @throws PortalException if a tertiary head with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.TertiaryHead getTertiaryHead(long tertiaryHeadId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _tertiaryHeadLocalService.getTertiaryHead(tertiaryHeadId);
	}

	/**
	 * Returns a range of all the tertiary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @return the range of tertiary heads
	 */
	@Override
	public java.util.List<io.jetprocess.model.TertiaryHead> getTertiaryHeads(
		int start, int end) {

		return _tertiaryHeadLocalService.getTertiaryHeads(start, end);
	}

	/**
	 * Returns the number of tertiary heads.
	 *
	 * @return the number of tertiary heads
	 */
	@Override
	public int getTertiaryHeadsCount() {
		return _tertiaryHeadLocalService.getTertiaryHeadsCount();
	}

	/**
	 * Updates the tertiary head in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect TertiaryHeadLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param tertiaryHead the tertiary head
	 * @return the tertiary head that was updated
	 */
	@Override
	public io.jetprocess.model.TertiaryHead updateTertiaryHead(
		io.jetprocess.model.TertiaryHead tertiaryHead) {

		return _tertiaryHeadLocalService.updateTertiaryHead(tertiaryHead);
	}

	@Override
	public TertiaryHeadLocalService getWrappedService() {
		return _tertiaryHeadLocalService;
	}

	@Override
	public void setWrappedService(
		TertiaryHeadLocalService tertiaryHeadLocalService) {

		_tertiaryHeadLocalService = tertiaryHeadLocalService;
	}

	private TertiaryHeadLocalService _tertiaryHeadLocalService;

}