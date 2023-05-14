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

import io.jetprocess.model.DocumentNoteMapping;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DocumentNoteMapping in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DocumentNoteMappingCacheModel
	implements CacheModel<DocumentNoteMapping>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DocumentNoteMappingCacheModel)) {
			return false;
		}

		DocumentNoteMappingCacheModel documentNoteMappingCacheModel =
			(DocumentNoteMappingCacheModel)object;

		if (id == documentNoteMappingCacheModel.id) {
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
		StringBundler sb = new StringBundler(21);

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
		sb.append(", noteDocumentId=");
		sb.append(noteDocumentId);
		sb.append(", noteId=");
		sb.append(noteId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DocumentNoteMapping toEntityModel() {
		DocumentNoteMappingImpl documentNoteMappingImpl =
			new DocumentNoteMappingImpl();

		if (uuid == null) {
			documentNoteMappingImpl.setUuid("");
		}
		else {
			documentNoteMappingImpl.setUuid(uuid);
		}

		documentNoteMappingImpl.setId(id);
		documentNoteMappingImpl.setGroupId(groupId);
		documentNoteMappingImpl.setCompanyId(companyId);
		documentNoteMappingImpl.setUserId(userId);

		if (userName == null) {
			documentNoteMappingImpl.setUserName("");
		}
		else {
			documentNoteMappingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			documentNoteMappingImpl.setCreateDate(null);
		}
		else {
			documentNoteMappingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			documentNoteMappingImpl.setModifiedDate(null);
		}
		else {
			documentNoteMappingImpl.setModifiedDate(new Date(modifiedDate));
		}

		documentNoteMappingImpl.setNoteDocumentId(noteDocumentId);
		documentNoteMappingImpl.setNoteId(noteId);

		documentNoteMappingImpl.resetOriginalValues();

		return documentNoteMappingImpl;
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

		noteDocumentId = objectInput.readLong();

		noteId = objectInput.readLong();
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

		objectOutput.writeLong(noteDocumentId);

		objectOutput.writeLong(noteId);
	}

	public String uuid;
	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long noteDocumentId;
	public long noteId;

}