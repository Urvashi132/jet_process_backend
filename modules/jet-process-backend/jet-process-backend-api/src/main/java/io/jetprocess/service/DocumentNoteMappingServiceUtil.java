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

import com.liferay.portal.kernel.exception.PortalException;

import io.jetprocess.model.DocumentNoteMapping;

/**
 * Provides the remote service utility for DocumentNoteMapping. This utility wraps
 * <code>io.jetprocess.service.impl.DocumentNoteMappingServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentNoteMappingService
 * @generated
 */
public class DocumentNoteMappingServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>io.jetprocess.service.impl.DocumentNoteMappingServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static DocumentNoteMapping addDocumentNoteMapping(
			String subject, long subjectCategoryId, long createdBy,
			String content)
		throws PortalException {

		return getService().addDocumentNoteMapping(
			subject, subjectCategoryId, createdBy, content);
	}

	public static void deleteDocumentNoteMapping(long id)
		throws PortalException {

		getService().deleteDocumentNoteMapping(id);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static DocumentNoteMapping updateDocumentNoteMapping(
			long id, String subject, long subjectCategoryId, String content)
		throws PortalException {

		return getService().updateDocumentNoteMapping(
			id, subject, subjectCategoryId, content);
	}

	public static DocumentNoteMappingService getService() {
		return _service;
	}

	private static volatile DocumentNoteMappingService _service;

}