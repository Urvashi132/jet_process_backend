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

package io.jetprocess.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.FileMovementServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class FileMovementSoap implements Serializable {

	public static FileMovementSoap toSoapModel(FileMovement model) {
		FileMovementSoap soapModel = new FileMovementSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setReceiverId(model.getReceiverId());
		soapModel.setSenderId(model.getSenderId());
		soapModel.setFileId(model.getFileId());
		soapModel.setPriority(model.getPriority());
		soapModel.setDueDate(model.getDueDate());
		soapModel.setRemark(model.getRemark());
		soapModel.setActive(model.isActive());
		soapModel.setMovementType(model.getMovementType());

		return soapModel;
	}

	public static FileMovementSoap[] toSoapModels(FileMovement[] models) {
		FileMovementSoap[] soapModels = new FileMovementSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FileMovementSoap[][] toSoapModels(FileMovement[][] models) {
		FileMovementSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FileMovementSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FileMovementSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FileMovementSoap[] toSoapModels(List<FileMovement> models) {
		List<FileMovementSoap> soapModels = new ArrayList<FileMovementSoap>(
			models.size());

		for (FileMovement model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FileMovementSoap[soapModels.size()]);
	}

	public FileMovementSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getReceiverId() {
		return _receiverId;
	}

	public void setReceiverId(long receiverId) {
		_receiverId = receiverId;
	}

	public long getSenderId() {
		return _senderId;
	}

	public void setSenderId(long senderId) {
		_senderId = senderId;
	}

	public long getFileId() {
		return _fileId;
	}

	public void setFileId(long fileId) {
		_fileId = fileId;
	}

	public String getPriority() {
		return _priority;
	}

	public void setPriority(String priority) {
		_priority = priority;
	}

	public Date getDueDate() {
		return _dueDate;
	}

	public void setDueDate(Date dueDate) {
		_dueDate = dueDate;
	}

	public String getRemark() {
		return _remark;
	}

	public void setRemark(String remark) {
		_remark = remark;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	public long getMovementType() {
		return _movementType;
	}

	public void setMovementType(long movementType) {
		_movementType = movementType;
	}

	private String _uuid;
	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _receiverId;
	private long _senderId;
	private long _fileId;
	private String _priority;
	private Date _dueDate;
	private String _remark;
	private boolean _active;
	private long _movementType;

}