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

import io.jetprocess.model.NoteDocument;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NoteDocument in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NoteDocumentCacheModel
	implements CacheModel<NoteDocument>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof NoteDocumentCacheModel)) {
			return false;
		}

		NoteDocumentCacheModel noteDocumentCacheModel =
			(NoteDocumentCacheModel)object;

		if (id == noteDocumentCacheModel.id) {
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
		sb.append(", noteDocumentNumber=");
		sb.append(noteDocumentNumber);
		sb.append(", subject=");
		sb.append(subject);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", subjectCategoryId=");
		sb.append(subjectCategoryId);
		sb.append(", currentUser=");
		sb.append(currentUser);
		sb.append(", currentState=");
		sb.append(currentState);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public NoteDocument toEntityModel() {
		NoteDocumentImpl noteDocumentImpl = new NoteDocumentImpl();

		if (uuid == null) {
			noteDocumentImpl.setUuid("");
		}
		else {
			noteDocumentImpl.setUuid(uuid);
		}

		noteDocumentImpl.setId(id);
		noteDocumentImpl.setGroupId(groupId);
		noteDocumentImpl.setCompanyId(companyId);
		noteDocumentImpl.setUserId(userId);

		if (userName == null) {
			noteDocumentImpl.setUserName("");
		}
		else {
			noteDocumentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			noteDocumentImpl.setCreateDate(null);
		}
		else {
			noteDocumentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			noteDocumentImpl.setModifiedDate(null);
		}
		else {
			noteDocumentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (noteDocumentNumber == null) {
			noteDocumentImpl.setNoteDocumentNumber("");
		}
		else {
			noteDocumentImpl.setNoteDocumentNumber(noteDocumentNumber);
		}

		if (subject == null) {
			noteDocumentImpl.setSubject("");
		}
		else {
			noteDocumentImpl.setSubject(subject);
		}

		noteDocumentImpl.setCreatedBy(createdBy);
		noteDocumentImpl.setSubjectCategoryId(subjectCategoryId);
		noteDocumentImpl.setCurrentUser(currentUser);
		noteDocumentImpl.setCurrentState(currentState);

		noteDocumentImpl.resetOriginalValues();

		return noteDocumentImpl;
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
		noteDocumentNumber = objectInput.readUTF();
		subject = objectInput.readUTF();

		createdBy = objectInput.readLong();

		subjectCategoryId = objectInput.readLong();

		currentUser = objectInput.readLong();

		currentState = objectInput.readInt();
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

		if (noteDocumentNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(noteDocumentNumber);
		}

		if (subject == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subject);
		}

		objectOutput.writeLong(createdBy);

		objectOutput.writeLong(subjectCategoryId);

		objectOutput.writeLong(currentUser);

		objectOutput.writeInt(currentState);
	}

	public String uuid;
	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String noteDocumentNumber;
	public String subject;
	public long createdBy;
	public long subjectCategoryId;
	public long currentUser;
	public int currentState;

}