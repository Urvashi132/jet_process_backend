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
 * Provides a wrapper for {@link DeliveryModeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DeliveryModeLocalService
 * @generated
 */
public class DeliveryModeLocalServiceWrapper
	implements DeliveryModeLocalService,
			   ServiceWrapper<DeliveryModeLocalService> {

	public DeliveryModeLocalServiceWrapper(
		DeliveryModeLocalService deliveryModeLocalService) {

		_deliveryModeLocalService = deliveryModeLocalService;
	}

	/**
	 * Adds the delivery mode to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DeliveryModeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param deliveryMode the delivery mode
	 * @return the delivery mode that was added
	 */
	@Override
	public io.jetprocess.model.DeliveryMode addDeliveryMode(
		io.jetprocess.model.DeliveryMode deliveryMode) {

		return _deliveryModeLocalService.addDeliveryMode(deliveryMode);
	}

	/**
	 * Creates a new delivery mode with the primary key. Does not add the delivery mode to the database.
	 *
	 * @param id the primary key for the new delivery mode
	 * @return the new delivery mode
	 */
	@Override
	public io.jetprocess.model.DeliveryMode createDeliveryMode(long id) {
		return _deliveryModeLocalService.createDeliveryMode(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _deliveryModeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the delivery mode from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DeliveryModeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param deliveryMode the delivery mode
	 * @return the delivery mode that was removed
	 */
	@Override
	public io.jetprocess.model.DeliveryMode deleteDeliveryMode(
		io.jetprocess.model.DeliveryMode deliveryMode) {

		return _deliveryModeLocalService.deleteDeliveryMode(deliveryMode);
	}

	/**
	 * Deletes the delivery mode with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DeliveryModeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the delivery mode
	 * @return the delivery mode that was removed
	 * @throws PortalException if a delivery mode with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.DeliveryMode deleteDeliveryMode(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _deliveryModeLocalService.deleteDeliveryMode(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _deliveryModeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _deliveryModeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _deliveryModeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _deliveryModeLocalService.dynamicQuery();
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

		return _deliveryModeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DeliveryModeModelImpl</code>.
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

		return _deliveryModeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DeliveryModeModelImpl</code>.
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

		return _deliveryModeLocalService.dynamicQuery(
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

		return _deliveryModeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _deliveryModeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.DeliveryMode fetchDeliveryMode(long id) {
		return _deliveryModeLocalService.fetchDeliveryMode(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _deliveryModeLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the delivery mode with the primary key.
	 *
	 * @param id the primary key of the delivery mode
	 * @return the delivery mode
	 * @throws PortalException if a delivery mode with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.DeliveryMode getDeliveryMode(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _deliveryModeLocalService.getDeliveryMode(id);
	}

	/**
	 * Returns a range of all the delivery modes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DeliveryModeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of delivery modes
	 * @param end the upper bound of the range of delivery modes (not inclusive)
	 * @return the range of delivery modes
	 */
	@Override
	public java.util.List<io.jetprocess.model.DeliveryMode> getDeliveryModes(
		int start, int end) {

		return _deliveryModeLocalService.getDeliveryModes(start, end);
	}

	/**
	 * Returns the number of delivery modes.
	 *
	 * @return the number of delivery modes
	 */
	@Override
	public int getDeliveryModesCount() {
		return _deliveryModeLocalService.getDeliveryModesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _deliveryModeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _deliveryModeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _deliveryModeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the delivery mode in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DeliveryModeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param deliveryMode the delivery mode
	 * @return the delivery mode that was updated
	 */
	@Override
	public io.jetprocess.model.DeliveryMode updateDeliveryMode(
		io.jetprocess.model.DeliveryMode deliveryMode) {

		return _deliveryModeLocalService.updateDeliveryMode(deliveryMode);
	}

	@Override
	public DeliveryModeLocalService getWrappedService() {
		return _deliveryModeLocalService;
	}

	@Override
	public void setWrappedService(
		DeliveryModeLocalService deliveryModeLocalService) {

		_deliveryModeLocalService = deliveryModeLocalService;
	}

	private DeliveryModeLocalService _deliveryModeLocalService;

}