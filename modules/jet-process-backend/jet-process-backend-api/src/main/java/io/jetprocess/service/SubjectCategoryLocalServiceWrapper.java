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
 * Provides a wrapper for {@link SubjectCategoryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SubjectCategoryLocalService
 * @generated
 */
public class SubjectCategoryLocalServiceWrapper
	implements ServiceWrapper<SubjectCategoryLocalService>,
			   SubjectCategoryLocalService {

	public SubjectCategoryLocalServiceWrapper(
		SubjectCategoryLocalService subjectCategoryLocalService) {

		_subjectCategoryLocalService = subjectCategoryLocalService;
	}

	/**
	 * Adds the subject category to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectCategory the subject category
	 * @return the subject category that was added
	 */
	@Override
	public io.jetprocess.model.SubjectCategory addSubjectCategory(
		io.jetprocess.model.SubjectCategory subjectCategory) {

		return _subjectCategoryLocalService.addSubjectCategory(subjectCategory);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectCategoryLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new subject category with the primary key. Does not add the subject category to the database.
	 *
	 * @param id the primary key for the new subject category
	 * @return the new subject category
	 */
	@Override
	public io.jetprocess.model.SubjectCategory createSubjectCategory(long id) {
		return _subjectCategoryLocalService.createSubjectCategory(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectCategoryLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the subject category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the subject category
	 * @return the subject category that was removed
	 * @throws PortalException if a subject category with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.SubjectCategory deleteSubjectCategory(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectCategoryLocalService.deleteSubjectCategory(id);
	}

	/**
	 * Deletes the subject category from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectCategory the subject category
	 * @return the subject category that was removed
	 */
	@Override
	public io.jetprocess.model.SubjectCategory deleteSubjectCategory(
		io.jetprocess.model.SubjectCategory subjectCategory) {

		return _subjectCategoryLocalService.deleteSubjectCategory(
			subjectCategory);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _subjectCategoryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _subjectCategoryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _subjectCategoryLocalService.dynamicQuery();
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

		return _subjectCategoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.SubjectCategoryModelImpl</code>.
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

		return _subjectCategoryLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.SubjectCategoryModelImpl</code>.
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

		return _subjectCategoryLocalService.dynamicQuery(
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

		return _subjectCategoryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _subjectCategoryLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.SubjectCategory fetchSubjectCategory(long id) {
		return _subjectCategoryLocalService.fetchSubjectCategory(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _subjectCategoryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _subjectCategoryLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _subjectCategoryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectCategoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns a range of all the subject categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.SubjectCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of subject categories
	 * @param end the upper bound of the range of subject categories (not inclusive)
	 * @return the range of subject categories
	 */
	@Override
	public java.util.List<io.jetprocess.model.SubjectCategory>
		getSubjectCategories(int start, int end) {

		return _subjectCategoryLocalService.getSubjectCategories(start, end);
	}

	/**
	 * Returns the number of subject categories.
	 *
	 * @return the number of subject categories
	 */
	@Override
	public int getSubjectCategoriesCount() {
		return _subjectCategoryLocalService.getSubjectCategoriesCount();
	}

	/**
	 * Returns the subject category with the primary key.
	 *
	 * @param id the primary key of the subject category
	 * @return the subject category
	 * @throws PortalException if a subject category with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.SubjectCategory getSubjectCategory(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectCategoryLocalService.getSubjectCategory(id);
	}

	@Override
	public java.util.List<io.jetprocess.model.SubjectCategory>
			getSubjectCategoryList()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _subjectCategoryLocalService.getSubjectCategoryList();
	}

	/**
	 * Updates the subject category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SubjectCategoryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param subjectCategory the subject category
	 * @return the subject category that was updated
	 */
	@Override
	public io.jetprocess.model.SubjectCategory updateSubjectCategory(
		io.jetprocess.model.SubjectCategory subjectCategory) {

		return _subjectCategoryLocalService.updateSubjectCategory(
			subjectCategory);
	}

	@Override
	public SubjectCategoryLocalService getWrappedService() {
		return _subjectCategoryLocalService;
	}

	@Override
	public void setWrappedService(
		SubjectCategoryLocalService subjectCategoryLocalService) {

		_subjectCategoryLocalService = subjectCategoryLocalService;
	}

	private SubjectCategoryLocalService _subjectCategoryLocalService;

}