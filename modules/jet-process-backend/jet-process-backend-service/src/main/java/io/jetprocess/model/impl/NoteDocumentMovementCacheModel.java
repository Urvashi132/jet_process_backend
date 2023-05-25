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

import io.jetprocess.model.NoteDocumentMovement;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NoteDocumentMovement in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NoteDocumentMovementCacheModel
	implements CacheModel<NoteDocumentMovement>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NoteDocumentMovementCacheModel)) {
			return false;
		}

		NoteDocumentMovementCacheModel noteDocumentMovementCacheModel =
			(NoteDocumentMovementCacheModel)object;

		if (id == noteDocumentMovementCacheModel.id) {
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
		StringBundler sb = new StringBundler(29);

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
		sb.append(", receiverId=");
		sb.append(receiverId);
		sb.append(", senderId=");
		sb.append(senderId);
		sb.append(", noteDocumentId=");
		sb.append(noteDocumentId);
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
	public NoteDocumentMovement toEntityModel() {
		NoteDocumentMovementImpl noteDocumentMovementImpl =
			new NoteDocumentMovementImpl();

		if (uuid == null) {
			noteDocumentMovementImpl.setUuid("");
		}
		else {
			noteDocumentMovementImpl.setUuid(uuid);
		}

		noteDocumentMovementImpl.setId(id);
		noteDocumentMovementImpl.setGroupId(groupId);
		noteDocumentMovementImpl.setCompanyId(companyId);
		noteDocumentMovementImpl.setUserId(userId);

		if (userName == null) {
			noteDocumentMovementImpl.setUserName("");
		}
		else {
			noteDocumentMovementImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			noteDocumentMovementImpl.setCreateDate(null);
		}
		else {
			noteDocumentMovementImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			noteDocumentMovementImpl.setModifiedDate(null);
		}
		else {
			noteDocumentMovementImpl.setModifiedDate(new Date(modifiedDate));
		}

		noteDocumentMovementImpl.setReceiverId(receiverId);
		noteDocumentMovementImpl.setSenderId(senderId);
		noteDocumentMovementImpl.setNoteDocumentId(noteDocumentId);

		if (remarks == null) {
			noteDocumentMovementImpl.setRemarks("");
		}
		else {
			noteDocumentMovementImpl.setRemarks(remarks);
		}

		noteDocumentMovementImpl.setActive(active);
		noteDocumentMovementImpl.setMovementType(movementType);

		noteDocumentMovementImpl.resetOriginalValues();

		return noteDocumentMovementImpl;
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

		receiverId = objectInput.readLong();

		senderId = objectInput.readLong();

		noteDocumentId = objectInput.readLong();
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

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(receiverId);

		objectOutput.writeLong(senderId);

		objectOutput.writeLong(noteDocumentId);

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
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long receiverId;
	public long senderId;
	public long noteDocumentId;
	public String remarks;
	public boolean active;
	public long movementType;

}