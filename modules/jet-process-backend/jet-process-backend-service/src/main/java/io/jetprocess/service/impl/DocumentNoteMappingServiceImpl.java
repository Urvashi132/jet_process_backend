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

package io.jetprocess.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;

import org.osgi.service.component.annotations.Component;

import io.jetprocess.model.DocumentNoteMapping;
import io.jetprocess.service.base.DocumentNoteMappingServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=jp",
		"json.web.service.context.path=DocumentNoteMapping"
	},
	service = AopService.class
)
public class DocumentNoteMappingServiceImpl
	extends DocumentNoteMappingServiceBaseImpl {
	
	public DocumentNoteMapping addDocumentNoteMapping(String subject, long subjectCategoryId, long createdBy,String content) throws PortalException {
		DocumentNoteMapping documentNoteMapping = documentNoteMappingLocalService.addDocumentNoteMapping(subject, subjectCategoryId, createdBy, content);
		return documentNoteMapping;
	}
	public DocumentNoteMapping updateDocumentNoteMapping(long id, String subject, long subjectCategoryId,
			String content) throws PortalException {
		DocumentNoteMapping documentNoteMapping = documentNoteMappingLocalService.updateDocumentNoteMapping(id, subject, subjectCategoryId, content);
		return documentNoteMapping;
	}

	
	public void deleteDocumentNoteMapping(long id) throws PortalException {
		documentNoteMappingLocalService.deleteDocumentNoteMapping(id);
	}

}