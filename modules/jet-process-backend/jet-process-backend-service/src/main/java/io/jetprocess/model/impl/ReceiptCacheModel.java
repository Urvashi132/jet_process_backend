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

package io.jetprocess.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import io.jetprocess.model.Receipt;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Receipt in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ReceiptCacheModel implements CacheModel<Receipt>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ReceiptCacheModel)) {
			return false;
		}

		ReceiptCacheModel receiptCacheModel = (ReceiptCacheModel)object;

		if (receiptId == receiptCacheModel.receiptId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, receiptId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", receiptId=");
		sb.append(receiptId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", type=");
		sb.append(type);
		sb.append(", deliveryModeId=");
		sb.append(deliveryModeId);
		sb.append(", receivedOn=");
		sb.append(receivedOn);
		sb.append(", letterDate=");
		sb.append(letterDate);
		sb.append(", referenceNo=");
		sb.append(referenceNo);
		sb.append(", modeNo=");
		sb.append(modeNo);
		sb.append(", CategoryId=");
		sb.append(CategoryId);
		sb.append(", subject=");
		sb.append(subject);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", name=");
		sb.append(name);
		sb.append(", designation=");
		sb.append(designation);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", email=");
		sb.append(email);
		sb.append(", address=");
		sb.append(address);
		sb.append(", stateId=");
		sb.append(stateId);
		sb.append(", pinCode=");
		sb.append(pinCode);
		sb.append(", receiptNo=");
		sb.append(receiptNo);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", city=");
		sb.append(city);
		sb.append(", userPostId=");
		sb.append(userPostId);
		sb.append(", viewPdfUrl=");
		sb.append(viewPdfUrl);
		sb.append(", docFileId=");
		sb.append(docFileId);
		sb.append(", nature=");
		sb.append(nature);
		sb.append(", currentlyWith=");
		sb.append(currentlyWith);
		sb.append(", currentState=");
		sb.append(currentState);
		sb.append(", attachStatus=");
		sb.append(attachStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Receipt toEntityModel() {
		ReceiptImpl receiptImpl = new ReceiptImpl();

		if (uuid == null) {
			receiptImpl.setUuid("");
		}
		else {
			receiptImpl.setUuid(uuid);
		}

		receiptImpl.setReceiptId(receiptId);
		receiptImpl.setGroupId(groupId);
		receiptImpl.setCompanyId(companyId);
		receiptImpl.setUserId(userId);

		if (userName == null) {
			receiptImpl.setUserName("");
		}
		else {
			receiptImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			receiptImpl.setCreateDate(null);
		}
		else {
			receiptImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			receiptImpl.setModifiedDate(null);
		}
		else {
			receiptImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (type == null) {
			receiptImpl.setType("");
		}
		else {
			receiptImpl.setType(type);
		}

		receiptImpl.setDeliveryModeId(deliveryModeId);

		if (receivedOn == null) {
			receiptImpl.setReceivedOn("");
		}
		else {
			receiptImpl.setReceivedOn(receivedOn);
		}

		if (letterDate == null) {
			receiptImpl.setLetterDate("");
		}
		else {
			receiptImpl.setLetterDate(letterDate);
		}

		if (referenceNo == null) {
			receiptImpl.setReferenceNo("");
		}
		else {
			receiptImpl.setReferenceNo(referenceNo);
		}

		if (modeNo == null) {
			receiptImpl.setModeNo("");
		}
		else {
			receiptImpl.setModeNo(modeNo);
		}

		receiptImpl.setCategoryId(CategoryId);

		if (subject == null) {
			receiptImpl.setSubject("");
		}
		else {
			receiptImpl.setSubject(subject);
		}

		if (remarks == null) {
			receiptImpl.setRemarks("");
		}
		else {
			receiptImpl.setRemarks(remarks);
		}

		if (name == null) {
			receiptImpl.setName("");
		}
		else {
			receiptImpl.setName(name);
		}

		if (designation == null) {
			receiptImpl.setDesignation("");
		}
		else {
			receiptImpl.setDesignation(designation);
		}

		if (mobile == null) {
			receiptImpl.setMobile("");
		}
		else {
			receiptImpl.setMobile(mobile);
		}

		if (email == null) {
			receiptImpl.setEmail("");
		}
		else {
			receiptImpl.setEmail(email);
		}

		if (address == null) {
			receiptImpl.setAddress("");
		}
		else {
			receiptImpl.setAddress(address);
		}

		receiptImpl.setStateId(stateId);

		if (pinCode == null) {
			receiptImpl.setPinCode("");
		}
		else {
			receiptImpl.setPinCode(pinCode);
		}

		if (receiptNo == null) {
			receiptImpl.setReceiptNo("");
		}
		else {
			receiptImpl.setReceiptNo(receiptNo);
		}

		receiptImpl.setOrganizationId(organizationId);

		if (city == null) {
			receiptImpl.setCity("");
		}
		else {
			receiptImpl.setCity(city);
		}

		receiptImpl.setUserPostId(userPostId);

		if (viewPdfUrl == null) {
			receiptImpl.setViewPdfUrl("");
		}
		else {
			receiptImpl.setViewPdfUrl(viewPdfUrl);
		}

		receiptImpl.setDocFileId(docFileId);

		if (nature == null) {
			receiptImpl.setNature("");
		}
		else {
			receiptImpl.setNature(nature);
		}

		receiptImpl.setCurrentlyWith(currentlyWith);
		receiptImpl.setCurrentState(currentState);

		if (attachStatus == null) {
			receiptImpl.setAttachStatus("");
		}
		else {
			receiptImpl.setAttachStatus(attachStatus);
		}

		receiptImpl.resetOriginalValues();

		return receiptImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		receiptId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		type = objectInput.readUTF();

		deliveryModeId = objectInput.readLong();
		receivedOn = objectInput.readUTF();
		letterDate = objectInput.readUTF();
		referenceNo = objectInput.readUTF();
		modeNo = objectInput.readUTF();

		CategoryId = objectInput.readLong();
		subject = objectInput.readUTF();
		remarks = objectInput.readUTF();
		name = objectInput.readUTF();
		designation = objectInput.readUTF();
		mobile = objectInput.readUTF();
		email = objectInput.readUTF();
		address = objectInput.readUTF();

		stateId = objectInput.readLong();
		pinCode = objectInput.readUTF();
		receiptNo = objectInput.readUTF();

		organizationId = objectInput.readLong();
		city = objectInput.readUTF();

		userPostId = objectInput.readLong();
		viewPdfUrl = objectInput.readUTF();

		docFileId = objectInput.readLong();
		nature = objectInput.readUTF();

		currentlyWith = objectInput.readLong();

		currentState = objectInput.readLong();
		attachStatus = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(receiptId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(type);
		}

		objectOutput.writeLong(deliveryModeId);

		if (receivedOn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(receivedOn);
		}

		if (letterDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(letterDate);
		}

		if (referenceNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(referenceNo);
		}

		if (modeNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modeNo);
		}

		objectOutput.writeLong(CategoryId);

		if (subject == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subject);
		}

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (designation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(designation);
		}

		if (mobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeLong(stateId);

		if (pinCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pinCode);
		}

		if (receiptNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(receiptNo);
		}

		objectOutput.writeLong(organizationId);

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		objectOutput.writeLong(userPostId);

		if (viewPdfUrl == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(viewPdfUrl);
		}

		objectOutput.writeLong(docFileId);

		if (nature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nature);
		}

		objectOutput.writeLong(currentlyWith);

		objectOutput.writeLong(currentState);

		if (attachStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(attachStatus);
		}
	}

	public String uuid;
	public long receiptId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String type;
	public long deliveryModeId;
	public String receivedOn;
	public String letterDate;
	public String referenceNo;
	public String modeNo;
	public long CategoryId;
	public String subject;
	public String remarks;
	public String name;
	public String designation;
	public String mobile;
	public String email;
	public String address;
	public long stateId;
	public String pinCode;
	public String receiptNo;
	public long organizationId;
	public String city;
	public long userPostId;
	public String viewPdfUrl;
	public long docFileId;
	public String nature;
	public long currentlyWith;
	public long currentState;
	public String attachStatus;

}