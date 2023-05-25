package io.jetprocess.util.validator;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import io.jetprocess.exception.NoteDocumentValidationException;
import io.jetprocess.validator.NoteDocumentValidator;

@Component(immediate = true, service = NoteDocumentValidator.class)
public class NoteDocumentValidatorImpl implements NoteDocumentValidator {
	private boolean isSubjectValid(String subject, List<String> errors) {
		boolean result = true;
		if (subject.isEmpty() || subject.equalsIgnoreCase("")) {
			errors.add("Please enter subject");
			result = false;
		} else if (subject.length() >= 500) {
			errors.add("Subject should not be more than 500 charater ");
			result = false;
		}
		return result;

	}

	private boolean isSubjectCategoryValid(long subjectCategoryId, List<String> errors) {
		boolean result = true;
		if (subjectCategoryId <= 0) {
			errors.add("Please select subject category");
			result = false;
		}
		return result;
	}

	private boolean isContentValid(String content, List<String> errors) {
		boolean result = true;
		if (content.isEmpty() || content.equalsIgnoreCase("")) {
			errors.add("Please select content");
			result = false;
		}
		return result;
	}

	private boolean validator(String subject, long subjectCategoryId, String content, List<String> errors) {
		boolean result = true;
		result &= isSubjectValid(subject, errors);
		result &= isSubjectCategoryValid(subjectCategoryId, errors);
		result &= isContentValid(content, errors);
		return result;
	}

	@Override
	public List<String> validate(String subject, long subjectCategoryId, String content)
			throws NoteDocumentValidationException {
		List<String> errors = new ArrayList<String>();

		try {
			if (!validator(subject, subjectCategoryId, content, errors)) {
				throw new NoteDocumentValidationException(errors);
			}
		} catch (Exception e) {
			System.out.println(errors);
		}
		return errors;
	}

}