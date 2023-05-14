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
 * Provides a wrapper for {@link FileCategoryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FileCategoryLocalService
 * @generated
 */
public class FileCategoryLocalServiceWrapper
	implements FileCategoryLocalService,
			   ServiceWrapper<FileCategoryLocalService> {

	public FileCategoryLocalServiceWrapper(
		FileCategoryLocalService fileCategoryLocalService) {

		_fileCategoryLocalService = fileCategoryLocalService;
	}

	/**
	 * Adds the file category to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FileCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fileCategory the file category
	 * @return the file category that was added
	 */
	@Override
	public io.jetprocess.model.FileCategory addFileCategory(
		io.jetprocess.model.FileCategory fileCategory) {

		return _fileCategoryLocalService.addFileCategory(fileCategory);
	}

	/**
	 * Creates a new file category with the primary key. Does not add the file category to the database.
	 *
	 * @param id the primary key for the new file category
	 * @return the new file category
	 */
	@Override
	public io.jetprocess.model.FileCategory createFileCategory(long id) {
		return _fileCategoryLocalService.createFileCategory(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileCategoryLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the file category from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FileCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fileCategory the file category
	 * @return the file category that was removed
	 */
	@Override
	public io.jetprocess.model.FileCategory deleteFileCategory(
		io.jetprocess.model.FileCategory fileCategory) {

		return _fileCategoryLocalService.deleteFileCategory(fileCategory);
	}

	/**
	 * Deletes the file category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FileCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the file category
	 * @return the file category that was removed
	 * @throws PortalException if a file category with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.FileCategory deleteFileCategory(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileCategoryLocalService.deleteFileCategory(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileCategoryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fileCategoryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fileCategoryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fileCategoryLocalService.dynamicQuery();
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

		return _fileCategoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.FileCategoryModelImpl</code>.
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

		return _fileCategoryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.FileCategoryModelImpl</code>.
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

		return _fileCategoryLocalService.dynamicQuery(
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

		return _fileCategoryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _fileCategoryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.FileCategory fetchFileCategory(long id) {
		return _fileCategoryLocalService.fetchFileCategory(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fileCategoryLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the file categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.FileCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of file categories
	 * @param end the upper bound of the range of file categories (not inclusive)
	 * @return the range of file categories
	 */
	@Override
	public java.util.List<io.jetprocess.model.FileCategory> getFileCategories(
		int start, int end) {

		return _fileCategoryLocalService.getFileCategories(start, end);
	}

	/**
	 * Returns the number of file categories.
	 *
	 * @return the number of file categories
	 */
	@Override
	public int getFileCategoriesCount() {
		return _fileCategoryLocalService.getFileCategoriesCount();
	}

	/**
	 * Returns the file category with the primary key.
	 *
	 * @param id the primary key of the file category
	 * @return the file category
	 * @throws PortalException if a file category with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.FileCategory getFileCategory(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileCategoryLocalService.getFileCategory(id);
	}

	@Override
	public java.util.List<io.jetprocess.model.FileCategory>
			getFileCategoryList()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileCategoryLocalService.getFileCategoryList();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fileCategoryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fileCategoryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fileCategoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the file category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FileCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fileCategory the file category
	 * @return the file category that was updated
	 */
	@Override
	public io.jetprocess.model.FileCategory updateFileCategory(
		io.jetprocess.model.FileCategory fileCategory) {

		return _fileCategoryLocalService.updateFileCategory(fileCategory);
	}

	@Override
	public FileCategoryLocalService getWrappedService() {
		return _fileCategoryLocalService;
	}

	@Override
	public void setWrappedService(
		FileCategoryLocalService fileCategoryLocalService) {

		_fileCategoryLocalService = fileCategoryLocalService;
	}

	private FileCategoryLocalService _fileCategoryLocalService;

}