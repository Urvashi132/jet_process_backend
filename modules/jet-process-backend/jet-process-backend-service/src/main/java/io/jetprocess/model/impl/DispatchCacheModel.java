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

import io.jetprocess.model.Dispatch;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Dispatch in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DispatchCacheModel
	implements CacheModel<Dispatch>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DispatchCacheModel)) {
			return false;
		}

		DispatchCacheModel dispatchCacheModel = (DispatchCacheModel)object;

		if (id == dispatchCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
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
		sb.append(", dispatchNo=");
		sb.append(dispatchNo);
		sb.append(", dispatchBy=");
		sb.append(dispatchBy);
		sb.append(", deliveryMode=");
		sb.append(deliveryMode);
		sb.append(", address=");
		sb.append(address);
		sb.append(", subject=");
		sb.append(subject);
		sb.append(", dispathOn=");
		sb.append(dispathOn);
		sb.append(", dispatchType=");
		sb.append(dispatchType);
		sb.append(", issueNo=");
		sb.append(issueNo);
		sb.append(", receiptentId=");
		sb.append(receiptentId);
		sb.append(", draftId=");
		sb.append(draftId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Dispatch toEntityModel() {
		DispatchImpl dispatchImpl = new DispatchImpl();

		if (uuid == null) {
			dispatchImpl.setUuid("");
		}
		else {
			dispatchImpl.setUuid(uuid);
		}

		dispatchImpl.setId(id);
		dispatchImpl.setGroupId(groupId);
		dispatchImpl.setCompanyId(companyId);
		dispatchImpl.setUserId(userId);

		if (userName == null) {
			dispatchImpl.setUserName("");
		}
		else {
			dispatchImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dispatchImpl.setCreateDate(null);
		}
		else {
			dispatchImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dispatchImpl.setModifiedDate(null);
		}
		else {
			dispatchImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (dispatchNo == null) {
			dispatchImpl.setDispatchNo("");
		}
		else {
			dispatchImpl.setDispatchNo(dispatchNo);
		}

		if (dispatchBy == null) {
			dispatchImpl.setDispatchBy("");
		}
		else {
			dispatchImpl.setDispatchBy(dispatchBy);
		}

		if (deliveryMode == null) {
			dispatchImpl.setDeliveryMode("");
		}
		else {
			dispatchImpl.setDeliveryMode(deliveryMode);
		}

		if (address == null) {
			dispatchImpl.setAddress("");
		}
		else {
			dispatchImpl.setAddress(address);
		}

		if (subject == null) {
			dispatchImpl.setSubject("");
		}
		else {
			dispatchImpl.setSubject(subject);
		}

		if (dispathOn == null) {
			dispatchImpl.setDispathOn("");
		}
		else {
			dispatchImpl.setDispathOn(dispathOn);
		}

		if (dispatchType == null) {
			dispatchImpl.setDispatchType("");
		}
		else {
			dispatchImpl.setDispatchType(dispatchType);
		}

		if (issueNo == null) {
			dispatchImpl.setIssueNo("");
		}
		else {
			dispatchImpl.setIssueNo(issueNo);
		}

		dispatchImpl.setReceiptentId(receiptentId);
		dispatchImpl.setDraftId(draftId);

		dispatchImpl.resetOriginalValues();

		return dispatchImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		dispatchNo = objectInput.readUTF();
		dispatchBy = objectInput.readUTF();
		deliveryMode = objectInput.readUTF();
		address = objectInput.readUTF();
		subject = objectInput.readUTF();
		dispathOn = objectInput.readUTF();
		dispatchType = objectInput.readUTF();
		issueNo = objectInput.readUTF();

		receiptentId = objectInput.readLong();

		draftId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

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

		if (dispatchNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dispatchNo);
		}

		if (dispatchBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dispatchBy);
		}

		if (deliveryMode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(deliveryMode);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (subject == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subject);
		}

		if (dispathOn == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dispathOn);
		}

		if (dispatchType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dispatchType);
		}

		if (issueNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(issueNo);
		}

		objectOutput.writeLong(receiptentId);

		objectOutput.writeLong(draftId);
	}

	public String uuid;
	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String dispatchNo;
	public String dispatchBy;
	public String deliveryMode;
	public String address;
	public String subject;
	public String dispathOn;
	public String dispatchType;
	public String issueNo;
	public long receiptentId;
	public long draftId;

}