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
 * Provides a wrapper for {@link DocumentNoteMappingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentNoteMappingLocalService
 * @generated
 */
public class DocumentNoteMappingLocalServiceWrapper
	implements DocumentNoteMappingLocalService,
			   ServiceWrapper<DocumentNoteMappingLocalService> {

	public DocumentNoteMappingLocalServiceWrapper(
		DocumentNoteMappingLocalService documentNoteMappingLocalService) {

		_documentNoteMappingLocalService = documentNoteMappingLocalService;
	}

	/**
	 * Adds the document note mapping to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentNoteMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param documentNoteMapping the document note mapping
	 * @return the document note mapping that was added
	 */
	@Override
	public io.jetprocess.model.DocumentNoteMapping addDocumentNoteMapping(
		io.jetprocess.model.DocumentNoteMapping documentNoteMapping) {

		return _documentNoteMappingLocalService.addDocumentNoteMapping(
			documentNoteMapping);
	}

	@Override
	public io.jetprocess.model.DocumentNoteMapping addDocumentNoteMapping(
			String subject, long subjectCategoryId, long createdBy,
			String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentNoteMappingLocalService.addDocumentNoteMapping(
			subject, subjectCategoryId, createdBy, content);
	}

	/**
	 * Creates a new document note mapping with the primary key. Does not add the document note mapping to the database.
	 *
	 * @param id the primary key for the new document note mapping
	 * @return the new document note mapping
	 */
	@Override
	public io.jetprocess.model.DocumentNoteMapping createDocumentNoteMapping(
		long id) {

		return _documentNoteMappingLocalService.createDocumentNoteMapping(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentNoteMappingLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the document note mapping from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentNoteMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param documentNoteMapping the document note mapping
	 * @return the document note mapping that was removed
	 */
	@Override
	public io.jetprocess.model.DocumentNoteMapping deleteDocumentNoteMapping(
		io.jetprocess.model.DocumentNoteMapping documentNoteMapping) {

		return _documentNoteMappingLocalService.deleteDocumentNoteMapping(
			documentNoteMapping);
	}

	/**
	 * Deletes the document note mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentNoteMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping that was removed
	 * @throws PortalException if a document note mapping with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.DocumentNoteMapping deleteDocumentNoteMapping(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentNoteMappingLocalService.deleteDocumentNoteMapping(id);
	}

	@Override
	public void deleteDocumentNoteMappingById(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		_documentNoteMappingLocalService.deleteDocumentNoteMappingById(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentNoteMappingLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _documentNoteMappingLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _documentNoteMappingLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _documentNoteMappingLocalService.dynamicQuery();
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

		return _documentNoteMappingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DocumentNoteMappingModelImpl</code>.
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

		return _documentNoteMappingLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DocumentNoteMappingModelImpl</code>.
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

		return _documentNoteMappingLocalService.dynamicQuery(
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

		return _documentNoteMappingLocalService.dynamicQueryCount(dynamicQuery);
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

		return _documentNoteMappingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public io.jetprocess.model.DocumentNoteMapping fetchDocumentNoteMapping(
		long id) {

		return _documentNoteMappingLocalService.fetchDocumentNoteMapping(id);
	}

	/**
	 * Returns the document note mapping matching the UUID and group.
	 *
	 * @param uuid the document note mapping's UUID
	 * @param groupId the primary key of the group
	 * @return the matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	@Override
	public io.jetprocess.model.DocumentNoteMapping
		fetchDocumentNoteMappingByUuidAndGroupId(String uuid, long groupId) {

		return _documentNoteMappingLocalService.
			fetchDocumentNoteMappingByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _documentNoteMappingLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the document note mapping with the primary key.
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping
	 * @throws PortalException if a document note mapping with the primary key could not be found
	 */
	@Override
	public io.jetprocess.model.DocumentNoteMapping getDocumentNoteMapping(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentNoteMappingLocalService.getDocumentNoteMapping(id);
	}

	/**
	 * Returns the document note mapping matching the UUID and group.
	 *
	 * @param uuid the document note mapping's UUID
	 * @param groupId the primary key of the group
	 * @return the matching document note mapping
	 * @throws PortalException if a matching document note mapping could not be found
	 */
	@Override
	public io.jetprocess.model.DocumentNoteMapping
			getDocumentNoteMappingByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentNoteMappingLocalService.
			getDocumentNoteMappingByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the document note mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>io.jetprocess.model.impl.DocumentNoteMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @return the range of document note mappings
	 */
	@Override
	public java.util.List<io.jetprocess.model.DocumentNoteMapping>
		getDocumentNoteMappings(int start, int end) {

		return _documentNoteMappingLocalService.getDocumentNoteMappings(
			start, end);
	}

	/**
	 * Returns all the document note mappings matching the UUID and company.
	 *
	 * @param uuid the UUID of the document note mappings
	 * @param companyId the primary key of the company
	 * @return the matching document note mappings, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.DocumentNoteMapping>
		getDocumentNoteMappingsByUuidAndCompanyId(String uuid, long companyId) {

		return _documentNoteMappingLocalService.
			getDocumentNoteMappingsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of document note mappings matching the UUID and company.
	 *
	 * @param uuid the UUID of the document note mappings
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching document note mappings, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<io.jetprocess.model.DocumentNoteMapping>
		getDocumentNoteMappingsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<io.jetprocess.model.DocumentNoteMapping> orderByComparator) {

		return _documentNoteMappingLocalService.
			getDocumentNoteMappingsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of document note mappings.
	 *
	 * @return the number of document note mappings
	 */
	@Override
	public int getDocumentNoteMappingsCount() {
		return _documentNoteMappingLocalService.getDocumentNoteMappingsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _documentNoteMappingLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _documentNoteMappingLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _documentNoteMappingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentNoteMappingLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the document note mapping in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DocumentNoteMappingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param documentNoteMapping the document note mapping
	 * @return the document note mapping that was updated
	 */
	@Override
	public io.jetprocess.model.DocumentNoteMapping updateDocumentNoteMapping(
		io.jetprocess.model.DocumentNoteMapping documentNoteMapping) {

		return _documentNoteMappingLocalService.updateDocumentNoteMapping(
			documentNoteMapping);
	}

	@Override
	public io.jetprocess.model.DocumentNoteMapping updateDocumentNoteMapping(
			long id, String subject, long subjectCategoryId, String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentNoteMappingLocalService.updateDocumentNoteMapping(
			id, subject, subjectCategoryId, content);
	}

	@Override
	public DocumentNoteMappingLocalService getWrappedService() {
		return _documentNoteMappingLocalService;
	}

	@Override
	public void setWrappedService(
		DocumentNoteMappingLocalService documentNoteMappingLocalService) {

		_documentNoteMappingLocalService = documentNoteMappingLocalService;
	}

	private DocumentNoteMappingLocalService _documentNoteMappingLocalService;

}