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
import com.liferay.portal.kernel.service.GroupLocalService;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import io.jetprocess.model.Receipt;
import io.jetprocess.service.base.ReceiptLocalServiceBaseImpl;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=io.jetprocess.model.Receipt",
	service = AopService.class
)
public class ReceiptLocalServiceImpl extends ReceiptLocalServiceBaseImpl {

	@Reference
	private GroupLocalService groupLocalService;
	
   public Receipt createReceipt(long groupId , long typeId , long deliveryModeId , String receivedOn , String letterDate
		   ,String referenceNo , String modeNo , long categoryId , String subject , String remark , String name
		   , String designation , String mobile , String email , String address , long stateId , String pinCode 
		   , long organizationId , String city , long userPostId , String viewPdfUrl , long docfileId , String nature
		   , long currentlyWith , long currentState , String attachStatus ,String receiptNo ) throws PortalException {
			
	   
	   String receiptNumber =null;
	   long receiptId = counterLocalService.increment(Receipt.class.getName());
	   Receipt receipt = receiptLocalService.createReceipt(receiptId);
	   receipt.setGroupId(groupId);
	    receipt.setTypeId(typeId);
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
		
		receipt.setReceiptNo(receiptNo);
		receipt = super.addReceipt(receipt);

	   return receipt;
	   
	   
   }
   
   public Receipt updateReceipt(long receiptId ,long groupId , long typeId , long deliveryModeId , String receivedOn , String letterDate
		   ,String referenceNo , String modeNo , long categoryId , String subject , String remark , String name
		   , String designation , String mobile , String email , String address , long stateId , String pinCode 
		   , long organizationId , String city , long userPostId , String viewPdfUrl , long docfileId , String nature
		   , long currentlyWith , long currentState , String attachStatus, String receiptNo) throws  PortalException{
	   Receipt receipt = getReceipt(receiptId);
	   receipt.setReceiptId(receiptId);
	   receipt.setTypeId(typeId);
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
		receipt.setReceiptNo(receiptNo);
		receipt = super.updateReceipt(receipt);
	  	   
	   return receipt;
	   
	   
   }


   public String generateReceiptNumber(long receiptId) {
		String receiptNumber = "R" + receiptId;
		return receiptNumber;

	}












}