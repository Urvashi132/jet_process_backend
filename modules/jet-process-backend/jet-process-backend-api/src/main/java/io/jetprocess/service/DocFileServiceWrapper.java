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
 * Provides a wrapper for {@link DocFileService}.
 *
 * @author Brian Wing Shun Chan
 * @see DocFileService
 * @generated
 */
public class DocFileServiceWrapper
	implements DocFileService, ServiceWrapper<DocFileService> {

	public DocFileServiceWrapper(DocFileService docFileService) {
		_docFileService = docFileService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _docFileService.getOSGiServiceIdentifier();
	}

	@Override
	public DocFileService getWrappedService() {
		return _docFileService;
	}

	@Override
	public void setWrappedService(DocFileService docFileService) {
		_docFileService = docFileService;
	}

	private DocFileService _docFileService;

}