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

import io.jetprocess.model.Note;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Note in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NoteCacheModel implements CacheModel<Note>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NoteCacheModel)) {
			return false;
		}

		NoteCacheModel noteCacheModel = (NoteCacheModel)object;

		if (id == noteCacheModel.id) {
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
		StringBundler sb = new StringBundler(23);

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
		sb.append(", content=");
		sb.append(content);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", signature=");
		sb.append(signature);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Note toEntityModel() {
		NoteImpl noteImpl = new NoteImpl();

		if (uuid == null) {
			noteImpl.setUuid("");
		}
		else {
			noteImpl.setUuid(uuid);
		}

		noteImpl.setId(id);
		noteImpl.setGroupId(groupId);
		noteImpl.setCompanyId(companyId);
		noteImpl.setUserId(userId);

		if (userName == null) {
			noteImpl.setUserName("");
		}
		else {
			noteImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			noteImpl.setCreateDate(null);
		}
		else {
			noteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			noteImpl.setModifiedDate(null);
		}
		else {
			noteImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (content == null) {
			noteImpl.setContent("");
		}
		else {
			noteImpl.setContent(content);
		}

		noteImpl.setCreatedBy(createdBy);

		if (signature == null) {
			noteImpl.setSignature("");
		}
		else {
			noteImpl.setSignature(signature);
		}

		noteImpl.resetOriginalValues();

		return noteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput)
		throws ClassNotFoundException, IOException {

		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		content = (String)objectInput.readObject();

		createdBy = objectInput.readLong();
		signature = objectInput.readUTF();
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

		if (content == null) {
			objectOutput.writeObject("");
		}
		else {
			objectOutput.writeObject(content);
		}

		objectOutput.writeLong(createdBy);

		if (signature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(signature);
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
	public String content;
	public long createdBy;
	public String signature;

}