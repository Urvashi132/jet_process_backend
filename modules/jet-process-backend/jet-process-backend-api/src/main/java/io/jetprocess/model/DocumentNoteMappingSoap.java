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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.DocumentNoteMappingServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DocumentNoteMappingSoap implements Serializable {

	public static DocumentNoteMappingSoap toSoapModel(
		DocumentNoteMapping model) {

		DocumentNoteMappingSoap soapModel = new DocumentNoteMappingSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNoteDocumentId(model.getNoteDocumentId());
		soapModel.setNoteId(model.getNoteId());

		return soapModel;
	}

	public static DocumentNoteMappingSoap[] toSoapModels(
		DocumentNoteMapping[] models) {

		DocumentNoteMappingSoap[] soapModels =
			new DocumentNoteMappingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocumentNoteMappingSoap[][] toSoapModels(
		DocumentNoteMapping[][] models) {

		DocumentNoteMappingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new DocumentNoteMappingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocumentNoteMappingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocumentNoteMappingSoap[] toSoapModels(
		List<DocumentNoteMapping> models) {

		List<DocumentNoteMappingSoap> soapModels =
			new ArrayList<DocumentNoteMappingSoap>(models.size());

		for (DocumentNoteMapping model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new DocumentNoteMappingSoap[soapModels.size()]);
	}

	public DocumentNoteMappingSoap() {
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

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
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

	public long getNoteDocumentId() {
		return _noteDocumentId;
	}

	public void setNoteDocumentId(long noteDocumentId) {
		_noteDocumentId = noteDocumentId;
	}

	public long getNoteId() {
		return _noteId;
	}

	public void setNoteId(long noteId) {
		_noteId = noteId;
	}

	private String _uuid;
	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _noteDocumentId;
	private long _noteId;

}