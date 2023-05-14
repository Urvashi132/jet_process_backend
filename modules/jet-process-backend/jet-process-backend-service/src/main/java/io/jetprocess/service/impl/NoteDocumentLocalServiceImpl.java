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
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.util.List;

import org.osgi.service.component.annotations.Component;

import io.jetprocess.model.NoteDocument;
import io.jetprocess.service.base.NoteDocumentLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=io.jetprocess.model.NoteDocument", service = AopService.class)
public class NoteDocumentLocalServiceImpl extends NoteDocumentLocalServiceBaseImpl {

	public NoteDocument createNoteDocument(String subject, long subjectCategoryId, long createdBy)
			throws PortalException {
		logger.info("note document");
		long id = counterLocalService.increment(NoteDocument.class.getName());
		NoteDocument noteDocument = createNoteDocument(id);
		noteDocument.setNoteDocumentNumber(generateNoteDocumentNumber(id));
		noteDocument.setSubject(subject);
		noteDocument.setCreatedBy(createdBy);
		noteDocument.setSubjectCategoryId(subjectCategoryId);
		noteDocument.setCurrentUser(createdBy);
		noteDocument.setCurrentState(1);
		noteDocument = super.addNoteDocument(noteDocument);
		return noteDocument;
	}

	public String generateNoteDocumentNumber(long id) {
		String noteDocumentNumber = "N" + id;
		return noteDocumentNumber;
	}

	public NoteDocument updateNoteDocument(long id, String subject, long subjectCategoryId)
			throws PortalException {
		NoteDocument noteDocument = getNoteDocument(id);
		noteDocument.setNoteDocumentNumber(generateNoteDocumentNumber(id));
		noteDocument.setSubject(subject);
		noteDocument.setSubjectCategoryId(subjectCategoryId);
		noteDocument = super.updateNoteDocument(noteDocument);
		return noteDocument;
	}

	/*
	 * public NoteDocument deleteNoteDocumentById(long id) throws PortalException {
	 * NoteDocument docFile = deleteNoteDocument(id); return docFile; }
	 * 
	 * public NoteDocument getNoteDocumentById(long id) throws PortalException {
	 * return getNoteDocument(id); }
	 */
	public List<NoteDocument> getNoteDocuments() throws PortalException {
		List<NoteDocument> noteDocumentList = getNoteDocuments(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		return noteDocumentList;
	}

	private static Log logger = LogFactoryUtil.getLog(NoteDocumentLocalServiceImpl.class);

}