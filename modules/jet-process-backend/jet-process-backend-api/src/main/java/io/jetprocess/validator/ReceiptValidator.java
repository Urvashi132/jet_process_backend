package io.jetprocess.validator;

import java.util.List;

import io.jetprocess.exception.ReceiptValidationException;

public interface ReceiptValidator {

	public List<String> validate(String subject,String remarks,String reference , String type) throws ReceiptValidationException;

}
