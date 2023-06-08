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

import io.jetprocess.model.Draft;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Draft in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class DraftCacheModel implements CacheModel<Draft>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DraftCacheModel)) {
			return false;
		}

		DraftCacheModel draftCacheModel = (DraftCacheModel)object;

		if (id == draftCacheModel.id) {
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
		sb.append(", draftNo=");
		sb.append(draftNo);
		sb.append(", nature=");
		sb.append(nature);
		sb.append(", receiptId=");
		sb.append(receiptId);
		sb.append(", replyTypeId=");
		sb.append(replyTypeId);
		sb.append(", categoryId=");
		sb.append(categoryId);
		sb.append(", subject=");
		sb.append(subject);
		sb.append(", content=");
		sb.append(content);
		sb.append(", dispatch=");
		sb.append(dispatch);
		sb.append(", status=");
		sb.append(status);
		sb.append(", approvedBy=");
		sb.append(approvedBy);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Draft toEntityModel() {
		DraftImpl draftImpl = new DraftImpl();

		if (uuid == null) {
			draftImpl.setUuid("");
		}
		else {
			draftImpl.setUuid(uuid);
		}

		draftImpl.setId(id);
		draftImpl.setGroupId(groupId);
		draftImpl.setCompanyId(companyId);
		draftImpl.setUserId(userId);

		if (userName == null) {
			draftImpl.setUserName("");
		}
		else {
			draftImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			draftImpl.setCreateDate(null);
		}
		else {
			draftImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			draftImpl.setModifiedDate(null);
		}
		else {
			draftImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (draftNo == null) {
			draftImpl.setDraftNo("");
		}
		else {
			draftImpl.setDraftNo(draftNo);
		}

		if (nature == null) {
			draftImpl.setNature("");
		}
		else {
			draftImpl.setNature(nature);
		}

		draftImpl.setReceiptId(receiptId);
		draftImpl.setReplyTypeId(replyTypeId);
		draftImpl.setCategoryId(categoryId);

		if (subject == null) {
			draftImpl.setSubject("");
		}
		else {
			draftImpl.setSubject(subject);
		}

		if (content == null) {
			draftImpl.setContent("");
		}
		else {
			draftImpl.setContent(content);
		}

		draftImpl.setDispatch(dispatch);

		if (status == null) {
			draftImpl.setStatus("");
		}
		else {
			draftImpl.setStatus(status);
		}

		if (approvedBy == null) {
			draftImpl.setApprovedBy("");
		}
		else {
			draftImpl.setApprovedBy(approvedBy);
		}

		draftImpl.resetOriginalValues();

		return draftImpl;
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
		draftNo = objectInput.readUTF();
		nature = objectInput.readUTF();

		receiptId = objectInput.readLong();

		replyTypeId = objectInput.readLong();

		categoryId = objectInput.readLong();
		subject = objectInput.readUTF();
		content = (String)objectInput.readObject();

		dispatch = objectInput.readBoolean();
		status = objectInput.readUTF();
		approvedBy = objectInput.readUTF();
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

		if (draftNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(draftNo);
		}

		if (nature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nature);
		}

		objectOutput.writeLong(receiptId);

		objectOutput.writeLong(replyTypeId);

		objectOutput.writeLong(categoryId);

		if (subject == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subject);
		}

		if (content == null) {
			objectOutput.writeObject("");
		}
		else {
			objectOutput.writeObject(content);
		}

		objectOutput.writeBoolean(dispatch);

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (approvedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(approvedBy);
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
	public String draftNo;
	public String nature;
	public long receiptId;
	public long replyTypeId;
	public long categoryId;
	public String subject;
	public String content;
	public boolean dispatch;
	public String status;
	public String approvedBy;

}