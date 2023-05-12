package io.jetprocess.util.validator;

import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import io.jetprocess.exception.FileValidationException;
import io.jetprocess.exception.ReceiptValidationException;
import io.jetprocess.validator.ReceiptValidator;

@Component(immediate = true, service = ReceiptValidator.class)
public class ReceiptValidatorImpl implements ReceiptValidator {

	private boolean isSubjectValid(final String subject, List<String> errors) {
		boolean result = true;
		if (subject.isEmpty() || subject.equalsIgnoreCase("")) {
			errors.add("Please Enter subject");
			result = false;
		}
		return result;

	}

	private boolean isRemarksValid(final String remarks, List<String> errors) {
		boolean result = true;
		if (remarks.isEmpty() || remarks.equalsIgnoreCase("")) {
			errors.add("Please Enter remarks");
			result = false;
		}
		return result;

	}

	private boolean isReferenceValid(final String reference, List<String> errors) {
		boolean result = true;
		if (reference.isEmpty() || reference.equalsIgnoreCase("")) {
			errors.add("Please Enter reference");
			result = false;
		}
		return result;

	}

	private boolean isTypeValid(String type, List<String> errors) {
		boolean result = true;
		if (Validator.isNull(type) || type.equalsIgnoreCase("")) {
			errors.add("Please Enter Type");
			result = false;
		}
		return result;

	}

	private boolean validator(final String subject, final String remarks, final String reference, final String type,
			final List<String> errors) {
		boolean result = true;

		result &= isSubjectValid(subject, errors);
		result &= isRemarksValid(remarks, errors);
		result &= isReferenceValid(reference, errors);
		result &= isTypeValid(type, errors);
		return result;
	}

	@Override
	public List<String> validate(String subject, String remarks, String reference, String type) throws ReceiptValidationException {
		List<String> errors = new ArrayList<String>();
      
		try {
		if (!validator(subject, remarks, reference, type, errors)) {
			throw new ReceiptValidationException(errors);
		}
		}catch(Exception e) {
			System.out.println(errors);
		}
		return errors;

	}

}
