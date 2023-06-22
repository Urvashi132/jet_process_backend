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

import io.jetprocess.model.Postal;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Postal in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PostalCacheModel implements CacheModel<Postal>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PostalCacheModel)) {
			return false;
		}

		PostalCacheModel postalCacheModel = (PostalCacheModel)object;

		if (id == postalCacheModel.id) {
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
		sb.append(", postalMode=");
		sb.append(postalMode);
		sb.append(", postalCharge=");
		sb.append(postalCharge);
		sb.append(", medium=");
		sb.append(medium);
		sb.append(", weight=");
		sb.append(weight);
		sb.append(", modeNo=");
		sb.append(modeNo);
		sb.append(", peonBookNo=");
		sb.append(peonBookNo);
		sb.append(", peonName=");
		sb.append(peonName);
		sb.append(", outDate=");
		sb.append(outDate);
		sb.append(", deliveryDate=");
		sb.append(deliveryDate);
		sb.append(", deliveryStatus=");
		sb.append(deliveryStatus);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Postal toEntityModel() {
		PostalImpl postalImpl = new PostalImpl();

		if (uuid == null) {
			postalImpl.setUuid("");
		}
		else {
			postalImpl.setUuid(uuid);
		}

		postalImpl.setId(id);
		postalImpl.setGroupId(groupId);
		postalImpl.setCompanyId(companyId);
		postalImpl.setUserId(userId);

		if (userName == null) {
			postalImpl.setUserName("");
		}
		else {
			postalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			postalImpl.setCreateDate(null);
		}
		else {
			postalImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			postalImpl.setModifiedDate(null);
		}
		else {
			postalImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (postalMode == null) {
			postalImpl.setPostalMode("");
		}
		else {
			postalImpl.setPostalMode(postalMode);
		}

		if (postalCharge == null) {
			postalImpl.setPostalCharge("");
		}
		else {
			postalImpl.setPostalCharge(postalCharge);
		}

		if (medium == null) {
			postalImpl.setMedium("");
		}
		else {
			postalImpl.setMedium(medium);
		}

		if (weight == null) {
			postalImpl.setWeight("");
		}
		else {
			postalImpl.setWeight(weight);
		}

		postalImpl.setModeNo(modeNo);

		if (peonBookNo == null) {
			postalImpl.setPeonBookNo("");
		}
		else {
			postalImpl.setPeonBookNo(peonBookNo);
		}

		if (peonName == null) {
			postalImpl.setPeonName("");
		}
		else {
			postalImpl.setPeonName(peonName);
		}

		if (outDate == Long.MIN_VALUE) {
			postalImpl.setOutDate(null);
		}
		else {
			postalImpl.setOutDate(new Date(outDate));
		}

		if (deliveryDate == Long.MIN_VALUE) {
			postalImpl.setDeliveryDate(null);
		}
		else {
			postalImpl.setDeliveryDate(new Date(deliveryDate));
		}

		if (deliveryStatus == null) {
			postalImpl.setDeliveryStatus("");
		}
		else {
			postalImpl.setDeliveryStatus(deliveryStatus);
		}

		postalImpl.resetOriginalValues();

		return postalImpl;
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
		postalMode = objectInput.readUTF();
		postalCharge = objectInput.readUTF();
		medium = objectInput.readUTF();
		weight = objectInput.readUTF();

		modeNo = objectInput.readLong();
		peonBookNo = objectInput.readUTF();
		peonName = objectInput.readUTF();
		outDate = objectInput.readLong();
		deliveryDate = objectInput.readLong();
		deliveryStatus = objectInput.readUTF();
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

		if (postalMode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(postalMode);
		}

		if (postalCharge == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(postalCharge);
		}

		if (medium == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(medium);
		}

		if (weight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(weight);
		}

		objectOutput.writeLong(modeNo);

		if (peonBookNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(peonBookNo);
		}

		if (peonName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(peonName);
		}

		objectOutput.writeLong(outDate);
		objectOutput.writeLong(deliveryDate);

		if (deliveryStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(deliveryStatus);
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
	public String postalMode;
	public String postalCharge;
	public String medium;
	public String weight;
	public long modeNo;
	public String peonBookNo;
	public String peonName;
	public long outDate;
	public long deliveryDate;
	public String deliveryStatus;

}