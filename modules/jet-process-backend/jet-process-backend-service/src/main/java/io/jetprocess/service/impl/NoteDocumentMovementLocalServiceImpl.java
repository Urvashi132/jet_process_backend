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

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import io.jetprocess.model.NoteDocument;
import io.jetprocess.model.NoteDocumentMovement;
import io.jetprocess.service.NoteDocumentLocalService;
import io.jetprocess.service.base.NoteDocumentMovementLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=io.jetprocess.model.NoteDocumentMovement", service = AopService.class)
public class NoteDocumentMovementLocalServiceImpl extends NoteDocumentMovementLocalServiceBaseImpl {
	
	public NoteDocumentMovement saveNoteDocumentMovement(long receiverId, long senderId, long noteDocumentId,
			String remarks) throws PortalException {
		LOGGER.info("serivce");
		long movementId = counterLocalService.increment(NoteDocumentMovement.class.getName());
		NoteDocumentMovement noteDocMovement = createNoteDocumentMovement(movementId);
		noteDocMovement.setReceiverId(receiverId);
		noteDocMovement.setSenderId(senderId);
		noteDocMovement.setNoteDocumentId(noteDocumentId);
		noteDocMovement.setRemarks(remarks);
		noteDocMovement = addNoteDocumentMovement(noteDocMovement);
		NoteDocument noteDocument = noteDocumentLocalService.getNoteDocument(noteDocumentId);
		noteDocument.setCurrentState(2);
		noteDocument.setCurrentUser(receiverId);
		noteDocumentLocalService.updateNoteDocument(noteDocument);
		return noteDocMovement;
	}

	public List<NoteDocumentMovement> getListByNoteDocumentId(long noteDocumentId) {
		LOGGER.info("serivce");
		return noteDocumentMovementPersistence.findByNoteDocumentId(noteDocumentId);
	}

	private final Log LOGGER = LogFactoryUtil.getLog(NoteDocumentMovementLocalServiceImpl.class);

	@Reference
	private NoteDocumentLocalService noteDocumentLocalService;
}