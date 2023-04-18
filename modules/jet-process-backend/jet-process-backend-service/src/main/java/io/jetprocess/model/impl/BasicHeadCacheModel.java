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

import io.jetprocess.model.BasicHead;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BasicHead in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BasicHeadCacheModel
	implements CacheModel<BasicHead>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof BasicHeadCacheModel)) {
			return false;
		}

		BasicHeadCacheModel basicHeadCacheModel = (BasicHeadCacheModel)object;

		if (basicHeadId == basicHeadCacheModel.basicHeadId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, basicHeadId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", basicHeadId=");
		sb.append(basicHeadId);
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
		sb.append(", basicHeadValue=");
		sb.append(basicHeadValue);
		sb.append(", basicHeadCode=");
		sb.append(basicHeadCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public BasicHead toEntityModel() {
		BasicHeadImpl basicHeadImpl = new BasicHeadImpl();

		if (uuid == null) {
			basicHeadImpl.setUuid("");
		}
		else {
			basicHeadImpl.setUuid(uuid);
		}

		basicHeadImpl.setBasicHeadId(basicHeadId);
		basicHeadImpl.setGroupId(groupId);
		basicHeadImpl.setCompanyId(companyId);
		basicHeadImpl.setUserId(userId);

		if (userName == null) {
			basicHeadImpl.setUserName("");
		}
		else {
			basicHeadImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			basicHeadImpl.setCreateDate(null);
		}
		else {
			basicHeadImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			basicHeadImpl.setModifiedDate(null);
		}
		else {
			basicHeadImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (basicHeadValue == null) {
			basicHeadImpl.setBasicHeadValue("");
		}
		else {
			basicHeadImpl.setBasicHeadValue(basicHeadValue);
		}

		basicHeadImpl.setBasicHeadCode(basicHeadCode);

		basicHeadImpl.resetOriginalValues();

		return basicHeadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		basicHeadId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		basicHeadValue = objectInput.readUTF();

		basicHeadCode = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(basicHeadId);

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

		if (basicHeadValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(basicHeadValue);
		}

		objectOutput.writeLong(basicHeadCode);
	}

	public String uuid;
	public long basicHeadId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String basicHeadValue;
	public long basicHeadCode;

}