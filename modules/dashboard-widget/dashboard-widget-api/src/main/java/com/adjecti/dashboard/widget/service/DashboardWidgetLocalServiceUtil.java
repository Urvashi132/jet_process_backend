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

package com.adjecti.dashboard.widget.service;

import com.adjecti.dashboard.widget.model.DashboardWidget;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DashboardWidget. This utility wraps
 * <code>com.adjecti.dashboard.widget.service.impl.DashboardWidgetLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DashboardWidgetLocalService
 * @generated
 */
public class DashboardWidgetLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.adjecti.dashboard.widget.service.impl.DashboardWidgetLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the dashboard widget to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardWidgetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardWidget the dashboard widget
	 * @return the dashboard widget that was added
	 */
	public static DashboardWidget addDashboardWidget(
		DashboardWidget dashboardWidget) {

		return getService().addDashboardWidget(dashboardWidget);
	}

	public static DashboardWidget addDashboardWidget(
		String portletName, String thumbnail, boolean added) {

		return getService().addDashboardWidget(portletName, thumbnail, added);
	}

	/**
	 * Creates a new dashboard widget with the primary key. Does not add the dashboard widget to the database.
	 *
	 * @param dashboardWidgetId the primary key for the new dashboard widget
	 * @return the new dashboard widget
	 */
	public static DashboardWidget createDashboardWidget(
		long dashboardWidgetId) {

		return getService().createDashboardWidget(dashboardWidgetId);
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
	 * Deletes the dashboard widget from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardWidgetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardWidget the dashboard widget
	 * @return the dashboard widget that was removed
	 */
	public static DashboardWidget deleteDashboardWidget(
		DashboardWidget dashboardWidget) {

		return getService().deleteDashboardWidget(dashboardWidget);
	}

	/**
	 * Deletes the dashboard widget with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardWidgetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardWidgetId the primary key of the dashboard widget
	 * @return the dashboard widget that was removed
	 * @throws PortalException if a dashboard widget with the primary key could not be found
	 */
	public static DashboardWidget deleteDashboardWidget(long dashboardWidgetId)
		throws PortalException {

		return getService().deleteDashboardWidget(dashboardWidgetId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.dashboard.widget.model.impl.DashboardWidgetModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.dashboard.widget.model.impl.DashboardWidgetModelImpl</code>.
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

	public static DashboardWidget fetchDashboardWidget(long dashboardWidgetId) {
		return getService().fetchDashboardWidget(dashboardWidgetId);
	}

	/**
	 * Returns the dashboard widget matching the UUID and group.
	 *
	 * @param uuid the dashboard widget's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dashboard widget, or <code>null</code> if a matching dashboard widget could not be found
	 */
	public static DashboardWidget fetchDashboardWidgetByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchDashboardWidgetByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the dashboard widget with the primary key.
	 *
	 * @param dashboardWidgetId the primary key of the dashboard widget
	 * @return the dashboard widget
	 * @throws PortalException if a dashboard widget with the primary key could not be found
	 */
	public static DashboardWidget getDashboardWidget(long dashboardWidgetId)
		throws PortalException {

		return getService().getDashboardWidget(dashboardWidgetId);
	}

	/**
	 * Returns the dashboard widget matching the UUID and group.
	 *
	 * @param uuid the dashboard widget's UUID
	 * @param groupId the primary key of the group
	 * @return the matching dashboard widget
	 * @throws PortalException if a matching dashboard widget could not be found
	 */
	public static DashboardWidget getDashboardWidgetByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getDashboardWidgetByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the dashboard widgets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.dashboard.widget.model.impl.DashboardWidgetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @return the range of dashboard widgets
	 */
	public static List<DashboardWidget> getDashboardWidgets(
		int start, int end) {

		return getService().getDashboardWidgets(start, end);
	}

	/**
	 * Returns all the dashboard widgets matching the UUID and company.
	 *
	 * @param uuid the UUID of the dashboard widgets
	 * @param companyId the primary key of the company
	 * @return the matching dashboard widgets, or an empty list if no matches were found
	 */
	public static List<DashboardWidget> getDashboardWidgetsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getDashboardWidgetsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of dashboard widgets matching the UUID and company.
	 *
	 * @param uuid the UUID of the dashboard widgets
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching dashboard widgets, or an empty list if no matches were found
	 */
	public static List<DashboardWidget> getDashboardWidgetsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DashboardWidget> orderByComparator) {

		return getService().getDashboardWidgetsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of dashboard widgets.
	 *
	 * @return the number of dashboard widgets
	 */
	public static int getDashboardWidgetsCount() {
		return getService().getDashboardWidgetsCount();
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
	 * Updates the dashboard widget in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardWidgetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardWidget the dashboard widget
	 * @return the dashboard widget that was updated
	 */
	public static DashboardWidget updateDashboardWidget(
		DashboardWidget dashboardWidget) {

		return getService().updateDashboardWidget(dashboardWidget);
	}

	public static DashboardWidgetLocalService getService() {
		return _service;
	}

	private static volatile DashboardWidgetLocalService _service;

}