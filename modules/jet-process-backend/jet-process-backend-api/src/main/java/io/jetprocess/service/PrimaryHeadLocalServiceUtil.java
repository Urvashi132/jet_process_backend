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

import io.jetprocess.model.PrimaryHead;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PrimaryHead. This utility wraps
 * <code>io.jetprocess.service.impl.PrimaryHeadLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PrimaryHeadLocalService
 * @generated
 */
public class PrimaryHeadLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>io.jetprocess.service.impl.PrimaryHeadLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static PrimaryHead addPrimaryHead(PrimaryHead primaryHead) {
		return getService().addPrimaryHead(primaryHead);
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
	 * Creates a new primary head with the primary key. Does not add the primary head to the database.
	 *
	 * @param primaryHeadId the primary key for the new primary head
	 * @return the new primary head
	 */
	public static PrimaryHead createPrimaryHead(long primaryHeadId) {
		return getService().createPrimaryHead(primaryHeadId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static PrimaryHead deletePrimaryHead(long primaryHeadId)
		throws PortalException {

		return getService().deletePrimaryHead(primaryHeadId);
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
	public static PrimaryHead deletePrimaryHead(PrimaryHead primaryHead) {
		return getService().deletePrimaryHead(primaryHead);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.PrimaryHeadModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.PrimaryHeadModelImpl</code>.
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

	public static PrimaryHead fetchPrimaryHead(long primaryHeadId) {
		return getService().fetchPrimaryHead(primaryHeadId);
	}

	/**
	 * Returns the primary head matching the UUID and group.
	 *
	 * @param uuid the primary head's UUID
	 * @param groupId the primary key of the group
	 * @return the matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	public static PrimaryHead fetchPrimaryHeadByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchPrimaryHeadByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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
	 * Returns the primary head with the primary key.
	 *
	 * @param primaryHeadId the primary key of the primary head
	 * @return the primary head
	 * @throws PortalException if a primary head with the primary key could not be found
	 */
	public static PrimaryHead getPrimaryHead(long primaryHeadId)
		throws PortalException {

		return getService().getPrimaryHead(primaryHeadId);
	}

	public static List<PrimaryHead> getPrimaryHeadByBasicHead(
		long basicHeadId) {

		return getService().getPrimaryHeadByBasicHead(basicHeadId);
	}

	/**
	 * Returns the primary head matching the UUID and group.
	 *
	 * @param uuid the primary head's UUID
	 * @param groupId the primary key of the group
	 * @return the matching primary head
	 * @throws PortalException if a matching primary head could not be found
	 */
	public static PrimaryHead getPrimaryHeadByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getPrimaryHeadByUuidAndGroupId(uuid, groupId);
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
	public static List<PrimaryHead> getPrimaryHeads(int start, int end) {
		return getService().getPrimaryHeads(start, end);
	}

	/**
	 * Returns all the primary heads matching the UUID and company.
	 *
	 * @param uuid the UUID of the primary heads
	 * @param companyId the primary key of the company
	 * @return the matching primary heads, or an empty list if no matches were found
	 */
	public static List<PrimaryHead> getPrimaryHeadsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getPrimaryHeadsByUuidAndCompanyId(uuid, companyId);
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
	public static List<PrimaryHead> getPrimaryHeadsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PrimaryHead> orderByComparator) {

		return getService().getPrimaryHeadsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of primary heads.
	 *
	 * @return the number of primary heads
	 */
	public static int getPrimaryHeadsCount() {
		return getService().getPrimaryHeadsCount();
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
	public static PrimaryHead updatePrimaryHead(PrimaryHead primaryHead) {
		return getService().updatePrimaryHead(primaryHead);
	}

	public static PrimaryHeadLocalService getService() {
		return _service;
	}

	private static volatile PrimaryHeadLocalService _service;

}