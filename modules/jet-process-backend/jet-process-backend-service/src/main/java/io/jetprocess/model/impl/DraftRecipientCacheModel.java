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

import io.jetprocess.model.DraftRecipient;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DraftRecipient in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DraftRecipientCacheModel
	implements CacheModel<DraftRecipient>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DraftRecipientCacheModel)) {
			return false;
		}

		DraftRecipientCacheModel draftRecipientCacheModel =
			(DraftRecipientCacheModel)object;

		if (id == draftRecipientCacheModel.id) {
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
		sb.append(", draftId=");
		sb.append(draftId);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", designation=");
		sb.append(designation);
		sb.append(", email=");
		sb.append(email);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", address=");
		sb.append(address);
		sb.append(", stateId=");
		sb.append(stateId);
		sb.append(", city=");
		sb.append(city);
		sb.append(", pinCode=");
		sb.append(pinCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DraftRecipient toEntityModel() {
		DraftRecipientImpl draftRecipientImpl = new DraftRecipientImpl();

		if (uuid == null) {
			draftRecipientImpl.setUuid("");
		}
		else {
			draftRecipientImpl.setUuid(uuid);
		}

		draftRecipientImpl.setId(id);
		draftRecipientImpl.setGroupId(groupId);
		draftRecipientImpl.setCompanyId(companyId);
		draftRecipientImpl.setUserId(userId);

		if (userName == null) {
			draftRecipientImpl.setUserName("");
		}
		else {
			draftRecipientImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			draftRecipientImpl.setCreateDate(null);
		}
		else {
			draftRecipientImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			draftRecipientImpl.setModifiedDate(null);
		}
		else {
			draftRecipientImpl.setModifiedDate(new Date(modifiedDate));
		}

		draftRecipientImpl.setDraftId(draftId);
		draftRecipientImpl.setOrganizationId(organizationId);

		if (name == null) {
			draftRecipientImpl.setName("");
		}
		else {
			draftRecipientImpl.setName(name);
		}

		if (designation == null) {
			draftRecipientImpl.setDesignation("");
		}
		else {
			draftRecipientImpl.setDesignation(designation);
		}

		if (email == null) {
			draftRecipientImpl.setEmail("");
		}
		else {
			draftRecipientImpl.setEmail(email);
		}

		if (mobile == null) {
			draftRecipientImpl.setMobile("");
		}
		else {
			draftRecipientImpl.setMobile(mobile);
		}

		if (address == null) {
			draftRecipientImpl.setAddress("");
		}
		else {
			draftRecipientImpl.setAddress(address);
		}

		draftRecipientImpl.setStateId(stateId);

		if (city == null) {
			draftRecipientImpl.setCity("");
		}
		else {
			draftRecipientImpl.setCity(city);
		}

		if (pinCode == null) {
			draftRecipientImpl.setPinCode("");
		}
		else {
			draftRecipientImpl.setPinCode(pinCode);
		}

		draftRecipientImpl.resetOriginalValues();

		return draftRecipientImpl;
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

		draftId = objectInput.readLong();

		organizationId = objectInput.readLong();
		name = objectInput.readUTF();
		designation = objectInput.readUTF();
		email = objectInput.readUTF();
		mobile = objectInput.readUTF();
		address = objectInput.readUTF();

		stateId = objectInput.readLong();
		city = objectInput.readUTF();
		pinCode = objectInput.readUTF();
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

		objectOutput.writeLong(draftId);

		objectOutput.writeLong(organizationId);

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

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (mobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		objectOutput.writeLong(stateId);

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (pinCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(pinCode);
		}
	}

	public String uuid;
	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long draftId;
	public long organizationId;
	public String name;
	public String designation;
	public String email;
	public String mobile;
	public String address;
	public long stateId;
	public String city;
	public String pinCode;

}