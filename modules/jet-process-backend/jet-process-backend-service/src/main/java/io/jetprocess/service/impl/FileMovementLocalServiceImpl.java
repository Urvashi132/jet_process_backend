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
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import io.jetprocess.model.DocFile;
import io.jetprocess.model.FileMovement;
import io.jetprocess.service.DocFileLocalService;
import io.jetprocess.service.base.FileMovementLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=io.jetprocess.model.FileMovement", service = AopService.class)
public class FileMovementLocalServiceImpl extends FileMovementLocalServiceBaseImpl {

	public FileMovement saveFileMovement(long receiverId, long senderId, long fileId, String priority, Date dueDate,
			String remarks) throws PortalException {
		LOGGER.info("service");
		long id = counterLocalService.increment(FileMovement.class.getName());
		FileMovement fileMovement = fileMovementLocalService.createFileMovement(id);
		fileMovement.setId(id);
		fileMovement.setReceiverId(receiverId);
		fileMovement.setSenderId(senderId);
		fileMovement.setFileId(fileId);
		fileMovement.setRemarks(remarks);
		fileMovement.setPriority(priority);
		fileMovement.setDueDate(dueDate);
		fileMovement = addFileMovement(fileMovement);
		DocFile docFile = docFileLocalService.getDocFile(fileId);
		docFile.setCurrentState(2);
		docFile.setCurrentUser(receiverId);
		docFileLocalService.updateDocFile(docFile);
		return fileMovement;
	}
	
	public FileMovement getFileMovement() {
		long id = counterLocalService.increment(FileMovement.class.getName());
		FileMovement fileMovement = fileMovementLocalService.createFileMovement(id);
		return fileMovement;
		}
	
	public List<FileMovement> getListByFileId(long fileId) {
		LOGGER.info("service");
		return fileMovementPersistence.findByFileId(fileId);
	}

	@Reference
	private DocFileLocalService docFileLocalService;

	private final Log LOGGER = LogFactoryUtil.getLog(FileMovementLocalServiceImpl.class);

}