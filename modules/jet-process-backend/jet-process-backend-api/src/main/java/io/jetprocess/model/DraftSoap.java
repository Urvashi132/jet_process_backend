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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.DraftServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DraftSoap implements Serializable {

	public static DraftSoap toSoapModel(Draft model) {
		DraftSoap soapModel = new DraftSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDraftNo(model.getDraftNo());
		soapModel.setNature(model.getNature());
		soapModel.setReceiptId(model.getReceiptId());
		soapModel.setReplyTypeId(model.getReplyTypeId());
		soapModel.setCategoryId(model.getCategoryId());
		soapModel.setSubject(model.getSubject());
		soapModel.setContent(model.getContent());
		soapModel.setDispatch(model.isDispatch());
		soapModel.setStatus(model.getStatus());
		soapModel.setApprovedBy(model.getApprovedBy());

		return soapModel;
	}

	public static DraftSoap[] toSoapModels(Draft[] models) {
		DraftSoap[] soapModels = new DraftSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DraftSoap[][] toSoapModels(Draft[][] models) {
		DraftSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DraftSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DraftSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DraftSoap[] toSoapModels(List<Draft> models) {
		List<DraftSoap> soapModels = new ArrayList<DraftSoap>(models.size());

		for (Draft model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DraftSoap[soapModels.size()]);
	}

	public DraftSoap() {
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

	public String getDraftNo() {
		return _draftNo;
	}

	public void setDraftNo(String draftNo) {
		_draftNo = draftNo;
	}

	public String getNature() {
		return _nature;
	}

	public void setNature(String nature) {
		_nature = nature;
	}

	public long getReceiptId() {
		return _receiptId;
	}

	public void setReceiptId(long receiptId) {
		_receiptId = receiptId;
	}

	public long getReplyTypeId() {
		return _replyTypeId;
	}

	public void setReplyTypeId(long replyTypeId) {
		_replyTypeId = replyTypeId;
	}

	public long getCategoryId() {
		return _categoryId;
	}

	public void setCategoryId(long categoryId) {
		_categoryId = categoryId;
	}

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public boolean getDispatch() {
		return _dispatch;
	}

	public boolean isDispatch() {
		return _dispatch;
	}

	public void setDispatch(boolean dispatch) {
		_dispatch = dispatch;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public String getApprovedBy() {
		return _approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		_approvedBy = approvedBy;
	}

	private String _uuid;
	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _draftNo;
	private String _nature;
	private long _receiptId;
	private long _replyTypeId;
	private long _categoryId;
	private String _subject;
	private String _content;
	private boolean _dispatch;
	private String _status;
	private String _approvedBy;

}