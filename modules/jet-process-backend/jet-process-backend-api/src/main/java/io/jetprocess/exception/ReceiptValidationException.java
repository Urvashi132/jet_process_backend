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
package io.jetprocess.exception;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ReceiptValidationException extends PortalException {

	public ReceiptValidationException() {
	}

	public ReceiptValidationException(String msg) {
		super(msg);
	}

	public ReceiptValidationException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public ReceiptValidationException(Throwable throwable) {
		super(throwable);
	}

	public ReceiptValidationException(List<String> errors) {
		// TODO Auto-generated constructor stub
	}

}