package io.jetprocess.validator;

import java.util.List;

import io.jetprocess.exception.NoteDocumentValidationException;

public interface NoteDocumentValidator {

	public List<String> validate(String subject, long subjectCategoryId, String content) throws NoteDocumentValidationException;

}