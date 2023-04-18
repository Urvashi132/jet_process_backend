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

import io.jetprocess.model.TertiaryHead;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TertiaryHead in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TertiaryHeadCacheModel
	implements CacheModel<TertiaryHead>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TertiaryHeadCacheModel)) {
			return false;
		}

		TertiaryHeadCacheModel tertiaryHeadCacheModel =
			(TertiaryHeadCacheModel)object;

		if (tertiaryHeadId == tertiaryHeadCacheModel.tertiaryHeadId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tertiaryHeadId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", tertiaryHeadId=");
		sb.append(tertiaryHeadId);
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
		sb.append(", tertiaryHeadvalue=");
		sb.append(tertiaryHeadvalue);
		sb.append(", secondaryHeadId=");
		sb.append(secondaryHeadId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TertiaryHead toEntityModel() {
		TertiaryHeadImpl tertiaryHeadImpl = new TertiaryHeadImpl();

		if (uuid == null) {
			tertiaryHeadImpl.setUuid("");
		}
		else {
			tertiaryHeadImpl.setUuid(uuid);
		}

		tertiaryHeadImpl.setTertiaryHeadId(tertiaryHeadId);
		tertiaryHeadImpl.setGroupId(groupId);
		tertiaryHeadImpl.setCompanyId(companyId);
		tertiaryHeadImpl.setUserId(userId);

		if (userName == null) {
			tertiaryHeadImpl.setUserName("");
		}
		else {
			tertiaryHeadImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tertiaryHeadImpl.setCreateDate(null);
		}
		else {
			tertiaryHeadImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tertiaryHeadImpl.setModifiedDate(null);
		}
		else {
			tertiaryHeadImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tertiaryHeadvalue == null) {
			tertiaryHeadImpl.setTertiaryHeadvalue("");
		}
		else {
			tertiaryHeadImpl.setTertiaryHeadvalue(tertiaryHeadvalue);
		}

		tertiaryHeadImpl.setSecondaryHeadId(secondaryHeadId);

		tertiaryHeadImpl.resetOriginalValues();

		return tertiaryHeadImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		tertiaryHeadId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tertiaryHeadvalue = objectInput.readUTF();

		secondaryHeadId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(tertiaryHeadId);

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

		if (tertiaryHeadvalue == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tertiaryHeadvalue);
		}

		objectOutput.writeLong(secondaryHeadId);
	}

	public String uuid;
	public long tertiaryHeadId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tertiaryHeadvalue;
	public long secondaryHeadId;

}