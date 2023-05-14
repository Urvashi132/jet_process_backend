package io.jetprocess.validator;

import java.util.List;

import io.jetprocess.exception.FileValidationException;

public interface FileValidator {
	
	
	/*
	 * public List<String> validate(String subject,String remarks,String reference ,
	 * String type) throws FileValidationException;
	 */
	public List<String> validate(String subject, String type) throws FileValidationException;

}