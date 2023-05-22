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
import com.liferay.portal.kernel.service.GroupLocalService;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import io.jetprocess.model.Receipt;
import io.jetprocess.service.base.ReceiptLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=io.jetprocess.model.Receipt", service = AopService.class)
public class ReceiptLocalServiceImpl extends ReceiptLocalServiceBaseImpl {

	private final Log logger = LogFactoryUtil.getLog(ReceiptLocalServiceImpl.class);

	public Receipt createReceipt(long groupId, String type, long deliveryModeId, String receivedOn, String letterDate,
			String referenceNo, String modeNo, long categoryId, String subject, String remark, String name,
			String designation, String mobile, String email, String address, long stateId, String pinCode,
			long organizationId, String city, long userPostId, String viewPdfUrl, long docfileId, String nature,
			long currentlyWith, long currentState, String attachStatus) throws PortalException {

		String receiptNumber = null;
		long receiptId = counterLocalService.increment(Receipt.class.getName());
		Receipt receipt = receiptLocalService.createReceipt(receiptId);
		receipt.setGroupId(groupId);
		receipt.setType(type);
		receipt.setDeliveryModeId(deliveryModeId);
		receipt.setReceivedOn(receivedOn);
		receipt.setLetterDate(letterDate);
		receipt.setReferenceNo(referenceNo);
		receipt.setModeNo(modeNo);
		receipt.setOrganizationId(organizationId);
		receipt.setCategoryId(categoryId);
		receipt.setSubject(subject);
		receipt.setRemarks(remark);
		receipt.setName(name);
		receipt.setAddress(address);
		receipt.setDesignation(designation);
		receipt.setEmail(email);
		receipt.setMobile(mobile);
		receipt.setStateId(stateId);
		receipt.setCity(city);
		receipt.setNature(nature);
		receipt.setPinCode(pinCode);
		receipt.setCurrentlyWith(currentlyWith);
		receipt.setCurrentState(currentState);
		receipt.setAttachStatus(attachStatus);
		receipt.setNature(nature);
		receipt.setViewPdfUrl(viewPdfUrl);
		receipt.setDocFileId(docfileId);
		receipt.setUserPostId(userPostId);
		receiptNumber = generateReceiptNumber(receiptId);
		receipt.setReceiptNo(receiptNumber);
		receipt = super.addReceipt(receipt);
		logger.info("create receipt service builder called-----");
		return receipt;

	}

	public Receipt updateReceipt(long receiptId, long groupId, String type, long deliveryModeId, String receivedOn,
			String letterDate, String referenceNo, String modeNo, long categoryId, String subject, String remark,
			String name, String designation, String mobile, String email, String address, long stateId, String pinCode,
			long organizationId, String city, long userPostId, String viewPdfUrl, long docfileId, String nature,
			long currentlyWith, long currentState, String attachStatus) throws PortalException {
		Receipt receipt = getReceipt(receiptId);
		receipt.setId(receiptId);
		receipt.setType(type);
		receipt.setDeliveryModeId(deliveryModeId);
		receipt.setReceivedOn(receivedOn);
		receipt.setLetterDate(letterDate);
		receipt.setReferenceNo(referenceNo);
		receipt.setModeNo(modeNo);
		receipt.setOrganizationId(organizationId);
		receipt.setCategoryId(categoryId);
		receipt.setSubject(subject);
		receipt.setRemarks(remark);
		receipt.setName(name);
		receipt.setAddress(address);
		receipt.setDesignation(designation);
		receipt.setEmail(email);
		receipt.setMobile(mobile);
		receipt.setStateId(stateId);
		receipt.setCity(city);
		receipt.setNature(nature);
		receipt.setPinCode(pinCode);
		receipt.setCurrentlyWith(currentlyWith);
		receipt.setCurrentState(currentState);
		receipt.setAttachStatus(attachStatus);
		receipt.setNature(nature);
		receipt.setViewPdfUrl(viewPdfUrl);
		receipt.setDocFileId(docfileId);
		receipt.setUserPostId(userPostId);
		receipt = super.updateReceipt(receipt);
		logger.info("update receipt service builder called-----");
		return receipt;

	}

	public String generateReceiptNumber(long receiptId) {
		String receiptNumber = "R" + receiptId;
		return receiptNumber;

	}

	public Receipt getReceiptById(long receiptId) throws PortalException {
		return getReceipt(receiptId);
	}

	public List<Receipt> getReceiptList() {
		return getReceipts(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public void deleteReceiptById(long receiptId) throws PortalException {
		deleteReceipt(receiptId);
	}

	@Reference
	private GroupLocalService groupLocalService;

}