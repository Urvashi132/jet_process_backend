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

import io.jetprocess.model.FileMovement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FileMovement in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FileMovementCacheModel
	implements CacheModel<FileMovement>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FileMovementCacheModel)) {
			return false;
		}

		FileMovementCacheModel fileMovementCacheModel =
			(FileMovementCacheModel)object;

		if (id == fileMovementCacheModel.id) {
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
		StringBundler sb = new StringBundler(31);

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
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", receiverId=");
		sb.append(receiverId);
		sb.append(", senderId=");
		sb.append(senderId);
		sb.append(", fileId=");
		sb.append(fileId);
		sb.append(", priority=");
		sb.append(priority);
		sb.append(", dueDate=");
		sb.append(dueDate);
		sb.append(", remarks=");
		sb.append(remarks);
		sb.append(", active=");
		sb.append(active);
		sb.append(", movementType=");
		sb.append(movementType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FileMovement toEntityModel() {
		FileMovementImpl fileMovementImpl = new FileMovementImpl();

		if (uuid == null) {
			fileMovementImpl.setUuid("");
		}
		else {
			fileMovementImpl.setUuid(uuid);
		}

		fileMovementImpl.setId(id);
		fileMovementImpl.setGroupId(groupId);
		fileMovementImpl.setCompanyId(companyId);
		fileMovementImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			fileMovementImpl.setCreateDate(null);
		}
		else {
			fileMovementImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fileMovementImpl.setModifiedDate(null);
		}
		else {
			fileMovementImpl.setModifiedDate(new Date(modifiedDate));
		}

		fileMovementImpl.setReceiverId(receiverId);
		fileMovementImpl.setSenderId(senderId);
		fileMovementImpl.setFileId(fileId);

		if (priority == null) {
			fileMovementImpl.setPriority("");
		}
		else {
			fileMovementImpl.setPriority(priority);
		}

		if (dueDate == Long.MIN_VALUE) {
			fileMovementImpl.setDueDate(null);
		}
		else {
			fileMovementImpl.setDueDate(new Date(dueDate));
		}

		if (remarks == null) {
			fileMovementImpl.setRemarks("");
		}
		else {
			fileMovementImpl.setRemarks(remarks);
		}

		fileMovementImpl.setActive(active);
		fileMovementImpl.setMovementType(movementType);

		fileMovementImpl.resetOriginalValues();

		return fileMovementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		receiverId = objectInput.readLong();

		senderId = objectInput.readLong();

		fileId = objectInput.readLong();
		priority = objectInput.readUTF();
		dueDate = objectInput.readLong();
		remarks = objectInput.readUTF();

		active = objectInput.readBoolean();

		movementType = objectInput.readLong();
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
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(receiverId);

		objectOutput.writeLong(senderId);

		objectOutput.writeLong(fileId);

		if (priority == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(priority);
		}

		objectOutput.writeLong(dueDate);

		if (remarks == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarks);
		}

		objectOutput.writeBoolean(active);

		objectOutput.writeLong(movementType);
	}

	public String uuid;
	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long receiverId;
	public long senderId;
	public long fileId;
	public String priority;
	public long dueDate;
	public String remarks;
	public boolean active;
	public long movementType;

}