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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.DocFileServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DocFileSoap implements Serializable {

	public static DocFileSoap toSoapModel(DocFile model) {
		DocFileSoap soapModel = new DocFileSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setDocFileId(model.getDocFileId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNature(model.getNature());
		soapModel.setType(model.getType());
		soapModel.setHeadId(model.getHeadId());
		soapModel.setFileCodeId(model.getFileCodeId());
		soapModel.setSubject(model.getSubject());
		soapModel.setFileNo(model.getFileNo());
		soapModel.setCategoryId(model.getCategoryId());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setReference(model.getReference());
		soapModel.setYear(model.getYear());
		soapModel.setUserPostId(model.getUserPostId());
		soapModel.setCurrentUser(model.getCurrentUser());
		soapModel.setCurrentState(model.getCurrentState());
		soapModel.setDealingOrganizationId(model.getDealingOrganizationId());

		return soapModel;
	}

	public static DocFileSoap[] toSoapModels(DocFile[] models) {
		DocFileSoap[] soapModels = new DocFileSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DocFileSoap[][] toSoapModels(DocFile[][] models) {
		DocFileSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DocFileSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DocFileSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DocFileSoap[] toSoapModels(List<DocFile> models) {
		List<DocFileSoap> soapModels = new ArrayList<DocFileSoap>(
			models.size());

		for (DocFile model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DocFileSoap[soapModels.size()]);
	}

	public DocFileSoap() {
	}

	public long getPrimaryKey() {
		return _docFileId;
	}

	public void setPrimaryKey(long pk) {
		setDocFileId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getDocFileId() {
		return _docFileId;
	}

	public void setDocFileId(long docFileId) {
		_docFileId = docFileId;
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

	public String getNature() {
		return _nature;
	}

	public void setNature(String nature) {
		_nature = nature;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public long getHeadId() {
		return _headId;
	}

	public void setHeadId(long headId) {
		_headId = headId;
	}

	public long getFileCodeId() {
		return _fileCodeId;
	}

	public void setFileCodeId(long fileCodeId) {
		_fileCodeId = fileCodeId;
	}

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public String getFileNo() {
		return _fileNo;
	}

	public void setFileNo(String fileNo) {
		_fileNo = fileNo;
	}

	public long getCategoryId() {
		return _categoryId;
	}

	public void setCategoryId(long categoryId) {
		_categoryId = categoryId;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getReference() {
		return _reference;
	}

	public void setReference(String reference) {
		_reference = reference;
	}

	public long getYear() {
		return _year;
	}

	public void setYear(long year) {
		_year = year;
	}

	public long getUserPostId() {
		return _userPostId;
	}

	public void setUserPostId(long userPostId) {
		_userPostId = userPostId;
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

	public long getDealingOrganizationId() {
		return _dealingOrganizationId;
	}

	public void setDealingOrganizationId(long dealingOrganizationId) {
		_dealingOrganizationId = dealingOrganizationId;
	}

	private String _uuid;
	private long _docFileId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nature;
	private String _type;
	private long _headId;
	private long _fileCodeId;
	private String _subject;
	private String _fileNo;
	private long _categoryId;
	private String _remarks;
	private String _reference;
	private long _year;
	private long _userPostId;
	private long _currentUser;
	private int _currentState;
	private long _dealingOrganizationId;

}