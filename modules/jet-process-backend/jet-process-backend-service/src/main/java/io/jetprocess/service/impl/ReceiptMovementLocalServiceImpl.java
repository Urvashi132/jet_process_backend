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

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import io.jetprocess.model.FileMovement;
import io.jetprocess.model.Receipt;
import io.jetprocess.model.ReceiptMovement;
import io.jetprocess.service.ReceiptLocalService;
import io.jetprocess.service.base.ReceiptMovementLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=io.jetprocess.model.ReceiptMovement",
	service = AopService.class
)
public class ReceiptMovementLocalServiceImpl
	extends ReceiptMovementLocalServiceBaseImpl {
	
	public ReceiptMovement saveReceiptMovement(long receiverId, long senderId, long receiptId, String priority, Date dueDate,
			String remarks) throws PortalException {
		long id = counterLocalService.increment(FileMovement.class.getName());
		ReceiptMovement receiptMovement = receiptMovementLocalService.createReceiptMovement(id);
		receiptMovement.setId(id);
		receiptMovement.setReceiverId(receiverId);
		receiptMovement.setSenderId(senderId);
		receiptMovement.setReceiptId(receiptId);
		receiptMovement.setRemarks(remarks);
		receiptMovement.setPriority(priority);
		receiptMovement.setDueDate(dueDate);
		receiptMovement = addReceiptMovement(receiptMovement);
		Receipt receipt = receiptLocalService.getReceipt(receiptId);
		receipt.setCurrentState(2);
		receipt.setCurrentlyWith(receiverId);
		receiptLocalService.updateReceipt(receipt);
		return receiptMovement;
	}

	public List<ReceiptMovement> getListByReceiptId(long receiptId) {
		return receiptMovementPersistence.findByReceiptId(receiptId);
	}
	
	@Reference
	private ReceiptLocalService receiptLocalService;
}