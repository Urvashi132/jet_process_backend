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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.DispatchServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DispatchSoap implements Serializable {

	public static DispatchSoap toSoapModel(Dispatch model) {
		DispatchSoap soapModel = new DispatchSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDispatchNo(model.getDispatchNo());
		soapModel.setDispatchBy(model.getDispatchBy());
		soapModel.setDeliveryMode(model.getDeliveryMode());
		soapModel.setAddress(model.getAddress());
		soapModel.setSubject(model.getSubject());
		soapModel.setDispathOn(model.getDispathOn());
		soapModel.setDispatchType(model.getDispatchType());
		soapModel.setIssueNo(model.getIssueNo());
		soapModel.setReceiptentId(model.getReceiptentId());
		soapModel.setDraftId(model.getDraftId());

		return soapModel;
	}

	public static DispatchSoap[] toSoapModels(Dispatch[] models) {
		DispatchSoap[] soapModels = new DispatchSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DispatchSoap[][] toSoapModels(Dispatch[][] models) {
		DispatchSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DispatchSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DispatchSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DispatchSoap[] toSoapModels(List<Dispatch> models) {
		List<DispatchSoap> soapModels = new ArrayList<DispatchSoap>(
			models.size());

		for (Dispatch model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DispatchSoap[soapModels.size()]);
	}

	public DispatchSoap() {
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

	public String getDispatchNo() {
		return _dispatchNo;
	}

	public void setDispatchNo(String dispatchNo) {
		_dispatchNo = dispatchNo;
	}

	public String getDispatchBy() {
		return _dispatchBy;
	}

	public void setDispatchBy(String dispatchBy) {
		_dispatchBy = dispatchBy;
	}

	public String getDeliveryMode() {
		return _deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		_deliveryMode = deliveryMode;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public String getDispathOn() {
		return _dispathOn;
	}

	public void setDispathOn(String dispathOn) {
		_dispathOn = dispathOn;
	}

	public String getDispatchType() {
		return _dispatchType;
	}

	public void setDispatchType(String dispatchType) {
		_dispatchType = dispatchType;
	}

	public String getIssueNo() {
		return _issueNo;
	}

	public void setIssueNo(String issueNo) {
		_issueNo = issueNo;
	}

	public long getReceiptentId() {
		return _receiptentId;
	}

	public void setReceiptentId(long receiptentId) {
		_receiptentId = receiptentId;
	}

	public long getDraftId() {
		return _draftId;
	}

	public void setDraftId(long draftId) {
		_draftId = draftId;
	}

	private String _uuid;
	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _dispatchNo;
	private String _dispatchBy;
	private String _deliveryMode;
	private String _address;
	private String _subject;
	private String _dispathOn;
	private String _dispatchType;
	private String _issueNo;
	private long _receiptentId;
	private long _draftId;

}