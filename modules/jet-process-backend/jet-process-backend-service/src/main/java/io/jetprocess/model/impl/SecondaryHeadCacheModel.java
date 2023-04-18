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

import io.jetprocess.model.SecondaryHead;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SecondaryHead in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SecondaryHeadCacheModel
	implements CacheModel<SecondaryHead>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SecondaryHeadCacheModel)) {
			return false;
		}

		SecondaryHeadCacheModel secondaryHeadCacheModel =
			(SecondaryHeadCacheModel)object;

		if (secondaryHeadId == secondaryHeadCacheModel.secondaryHeadId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, secondaryHeadId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", secondaryHeadId=");
		sb.append(secondaryHeadId);
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
		sb.append(", secondaryHeadValue=");
		sb.append(secondaryHeadValue);
		sb.append(", primaryHeadId=");
		sb.append(primaryHeadId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SecondaryHead toEntityModel() {
		SecondaryHeadImpl secondaryHeadImpl = new SecondaryHeadImpl();

		if (uuid == null) {
			secondaryHeadImpl.setUuid("");
		}
		else {
			secondaryHeadImpl.setUuid(uuid);
		}

		secondaryHeadImpl.setSecondaryHeadId(secondaryHeadId);
		secondaryHeadImpl.setGroupId(groupId);
		secondaryHeadImpl.setCompanyId(companyId);
		secondaryHeadImpl.setUserId(userId);

		if (userName == null) {
			secondaryHeadImpl.setUserName("");
		}
		else {
			secondaryHeadImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			secondaryHeadImpl.setCreateDate(null);
		}
		else {
			secondaryHeadImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			secondaryHeadImpl.setModifiedDate(null);
		}
		else {
			secondaryHeadImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (secondaryHeadValue == null) {
			secondaryHeadImpl.setSecondaryHeadValue("");
		}
		else {
			secondaryHeadImpl.setSecondaryHeadValue(secondaryHeadValue);
		}

		secondaryHeadImpl.setPrimaryHeadId(primaryHeadId);

		secondaryHeadImpl.resetOriginalValues();

		return secondaryHeadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		secondaryHeadId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		secondaryHeadValue = objectInput.readUTF();

		primaryHeadId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(secondaryHeadId);

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

		if (secondaryHeadValue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(secondaryHeadValue);
		}

		objectOutput.writeLong(primaryHeadId);
	}

	public String uuid;
	public long secondaryHeadId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String secondaryHeadValue;
	public long primaryHeadId;

}