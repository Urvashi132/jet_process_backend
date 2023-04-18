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

import io.jetprocess.model.PrimaryHead;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PrimaryHead in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PrimaryHeadCacheModel
	implements CacheModel<PrimaryHead>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PrimaryHeadCacheModel)) {
			return false;
		}

		PrimaryHeadCacheModel primaryHeadCacheModel =
			(PrimaryHeadCacheModel)object;

		if (primaryHeadId == primaryHeadCacheModel.primaryHeadId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, primaryHeadId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", primaryHeadId=");
		sb.append(primaryHeadId);
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
		sb.append(", primaryHeadValue=");
		sb.append(primaryHeadValue);
		sb.append(", basicHeadId=");
		sb.append(basicHeadId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PrimaryHead toEntityModel() {
		PrimaryHeadImpl primaryHeadImpl = new PrimaryHeadImpl();

		if (uuid == null) {
			primaryHeadImpl.setUuid("");
		}
		else {
			primaryHeadImpl.setUuid(uuid);
		}

		primaryHeadImpl.setPrimaryHeadId(primaryHeadId);
		primaryHeadImpl.setGroupId(groupId);
		primaryHeadImpl.setCompanyId(companyId);
		primaryHeadImpl.setUserId(userId);

		if (userName == null) {
			primaryHeadImpl.setUserName("");
		}
		else {
			primaryHeadImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			primaryHeadImpl.setCreateDate(null);
		}
		else {
			primaryHeadImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			primaryHeadImpl.setModifiedDate(null);
		}
		else {
			primaryHeadImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (primaryHeadValue == null) {
			primaryHeadImpl.setPrimaryHeadValue("");
		}
		else {
			primaryHeadImpl.setPrimaryHeadValue(primaryHeadValue);
		}

		primaryHeadImpl.setBasicHeadId(basicHeadId);

		primaryHeadImpl.resetOriginalValues();

		return primaryHeadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		primaryHeadId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		primaryHeadValue = objectInput.readUTF();

		basicHeadId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(primaryHeadId);

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

		if (primaryHeadValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(primaryHeadValue);
		}

		objectOutput.writeLong(basicHeadId);
	}

	public String uuid;
	public long primaryHeadId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String primaryHeadValue;
	public long basicHeadId;

}