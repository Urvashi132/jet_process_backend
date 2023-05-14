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
 * Provides a wrapper for {@link DocumentNoteMappingService}.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentNoteMappingService
 * @generated
 */
public class DocumentNoteMappingServiceWrapper
	implements DocumentNoteMappingService,
			   ServiceWrapper<DocumentNoteMappingService> {

	public DocumentNoteMappingServiceWrapper(
		DocumentNoteMappingService documentNoteMappingService) {

		_documentNoteMappingService = documentNoteMappingService;
	}

	@Override
	public io.jetprocess.model.DocumentNoteMapping addDocumentNoteMapping(
			String subject, long subjectCategoryId, long createdBy,
			String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentNoteMappingService.addDocumentNoteMapping(
			subject, subjectCategoryId, createdBy, content);
	}

	@Override
	public void deleteDocumentNoteMapping(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		_documentNoteMappingService.deleteDocumentNoteMapping(id);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _documentNoteMappingService.getOSGiServiceIdentifier();
	}

	@Override
	public io.jetprocess.model.DocumentNoteMapping updateDocumentNoteMapping(
			long id, String subject, long subjectCategoryId, String content)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _documentNoteMappingService.updateDocumentNoteMapping(
			id, subject, subjectCategoryId, content);
	}

	@Override
	public DocumentNoteMappingService getWrappedService() {
		return _documentNoteMappingService;
	}

	@Override
	public void setWrappedService(
		DocumentNoteMappingService documentNoteMappingService) {

		_documentNoteMappingService = documentNoteMappingService;
	}

	private DocumentNoteMappingService _documentNoteMappingService;

}