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

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import io.jetprocess.model.DocumentNoteMapping;
import io.jetprocess.model.Note;
import io.jetprocess.model.NoteDocument;
import io.jetprocess.service.NoteDocumentLocalService;
import io.jetprocess.service.NoteLocalService;
import io.jetprocess.service.base.DocumentNoteMappingLocalServiceBaseImpl;
import io.jetprocess.validator.NoteDocumentValidator;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=io.jetprocess.model.DocumentNoteMapping", service = AopService.class)
public class DocumentNoteMappingLocalServiceImpl extends DocumentNoteMappingLocalServiceBaseImpl {

	public DocumentNoteMapping addDocumentNoteMapping(String subject, long subjectCategoryId, long createdBy,
			String content) throws PortalException {
		DocumentNoteMapping documentNoteMapping = null;
		List<String> error = noteDocumentValidator.validate(subject, subjectCategoryId, content);
		if (!error.isEmpty()) {
		} else {

			long id = counterLocalService.increment(DocumentNoteMapping.class.getName());
			documentNoteMapping = createDocumentNoteMapping(id);

			// get note id
			Note note = noteLocalService.createNote(content, createdBy);

			// get note document id
			NoteDocument noteDocument = noteDocumentLocalService.createNoteDocument(subject, subjectCategoryId,
					createdBy);

			documentNoteMapping.setNoteId(note.getId());
			documentNoteMapping.setNoteDocumentId(noteDocument.getId());
			addDocumentNoteMapping(documentNoteMapping);
		}
		return documentNoteMapping;
	}

	public DocumentNoteMapping updateDocumentNoteMapping(long id, String subject, long subjectCategoryId,
			String content) throws PortalException {
		DocumentNoteMapping documentNoteMapping = null;
		List<String> error = noteDocumentValidator.validate(subject, subjectCategoryId, content);
		if (!error.isEmpty()) {
		} else {
			documentNoteMapping = getDocumentNoteMapping(id);

			// get note id
			Note note = noteLocalService.updateNote(documentNoteMapping.getNoteId(), content);

			// get note document id
			NoteDocument noteDocument = noteDocumentLocalService
					.updateNoteDocument(documentNoteMapping.getNoteDocumentId(), subject, subjectCategoryId);

			documentNoteMapping.setNoteId(note.getId());
			documentNoteMapping.setNoteDocumentId(noteDocument.getId());
			updateDocumentNoteMapping(documentNoteMapping);
		}
		return documentNoteMapping;
	}

	public void deleteDocumentNoteMappingById(long id) throws PortalException {
		DocumentNoteMapping documentNoteMapping = getDocumentNoteMapping(id);

		// get note id
		noteLocalService.deleteNote(documentNoteMapping.getNoteId());

		// get note document id
		noteDocumentLocalService.deleteNoteDocument(documentNoteMapping.getNoteDocumentId());

		super.deleteDocumentNoteMapping(id);
	}

	@Reference
	private NoteDocumentValidator noteDocumentValidator;

	@Reference
	private NoteLocalService noteLocalService;

	@Reference
	private NoteDocumentLocalService noteDocumentLocalService;
}