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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.NoteDocumentServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class NoteDocumentSoap implements Serializable {

	public static NoteDocumentSoap toSoapModel(NoteDocument model) {
		NoteDocumentSoap soapModel = new NoteDocumentSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNoteDocumentNumber(model.getNoteDocumentNumber());
		soapModel.setSubject(model.getSubject());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setSubjectCategoryId(model.getSubjectCategoryId());
		soapModel.setCurrentUser(model.getCurrentUser());
		soapModel.setCurrentState(model.getCurrentState());

		return soapModel;
	}

	public static NoteDocumentSoap[] toSoapModels(NoteDocument[] models) {
		NoteDocumentSoap[] soapModels = new NoteDocumentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NoteDocumentSoap[][] toSoapModels(NoteDocument[][] models) {
		NoteDocumentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NoteDocumentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NoteDocumentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NoteDocumentSoap[] toSoapModels(List<NoteDocument> models) {
		List<NoteDocumentSoap> soapModels = new ArrayList<NoteDocumentSoap>(
			models.size());

		for (NoteDocument model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NoteDocumentSoap[soapModels.size()]);
	}

	public NoteDocumentSoap() {
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

	public String getNoteDocumentNumber() {
		return _noteDocumentNumber;
	}

	public void setNoteDocumentNumber(String noteDocumentNumber) {
		_noteDocumentNumber = noteDocumentNumber;
	}

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public long getSubjectCategoryId() {
		return _subjectCategoryId;
	}

	public void setSubjectCategoryId(long subjectCategoryId) {
		_subjectCategoryId = subjectCategoryId;
	}

	public long getCurrentUser() {
		return _currentUser;
	}

	public void setCurrentUser(long currentUser) {
		_currentUser = currentUser;
	}

	public int getCurrentState() {
		return _currentState;
	}

	public void setCurrentState(int currentState) {
		_currentState = currentState;
	}

	private String _uuid;
	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _noteDocumentNumber;
	private String _subject;
	private long _createdBy;
	private long _subjectCategoryId;
	private long _currentUser;
	private int _currentState;

}