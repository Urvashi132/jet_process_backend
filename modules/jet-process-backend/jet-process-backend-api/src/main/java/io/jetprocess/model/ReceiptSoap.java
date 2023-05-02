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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.ReceiptServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ReceiptSoap implements Serializable {

	public static ReceiptSoap toSoapModel(Receipt model) {
		ReceiptSoap soapModel = new ReceiptSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setReceiptId(model.getReceiptId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTypeId(model.getTypeId());
		soapModel.setDeliveryModeId(model.getDeliveryModeId());
		soapModel.setReceivedOn(model.getReceivedOn());
		soapModel.setLetterDate(model.getLetterDate());
		soapModel.setReferenceNo(model.getReferenceNo());
		soapModel.setModeNo(model.getModeNo());
		soapModel.setCategoryId(model.getCategoryId());
		soapModel.setSubject(model.getSubject());
		soapModel.setRemarks(model.getRemarks());
		soapModel.setName(model.getName());
		soapModel.setDesignation(model.getDesignation());
		soapModel.setMobile(model.getMobile());
		soapModel.setEmail(model.getEmail());
		soapModel.setAddress(model.getAddress());
		soapModel.setStateId(model.getStateId());
		soapModel.setPinCode(model.getPinCode());
		soapModel.setReceiptNo(model.getReceiptNo());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setCity(model.getCity());
		soapModel.setUserPostId(model.getUserPostId());
		soapModel.setViewPdfUrl(model.getViewPdfUrl());
		soapModel.setDocFileId(model.getDocFileId());
		soapModel.setNature(model.getNature());
		soapModel.setCurrentlyWith(model.getCurrentlyWith());
		soapModel.setCurrentState(model.getCurrentState());
		soapModel.setAttachStatus(model.getAttachStatus());

		return soapModel;
	}

	public static ReceiptSoap[] toSoapModels(Receipt[] models) {
		ReceiptSoap[] soapModels = new ReceiptSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ReceiptSoap[][] toSoapModels(Receipt[][] models) {
		ReceiptSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ReceiptSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ReceiptSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ReceiptSoap[] toSoapModels(List<Receipt> models) {
		List<ReceiptSoap> soapModels = new ArrayList<ReceiptSoap>(
			models.size());

		for (Receipt model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ReceiptSoap[soapModels.size()]);
	}

	public ReceiptSoap() {
	}

	public long getPrimaryKey() {
		return _receiptId;
	}

	public void setPrimaryKey(long pk) {
		setReceiptId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getReceiptId() {
		return _receiptId;
	}

	public void setReceiptId(long receiptId) {
		_receiptId = receiptId;
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

	public long getTypeId() {
		return _typeId;
	}

	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	public long getDeliveryModeId() {
		return _deliveryModeId;
	}

	public void setDeliveryModeId(long deliveryModeId) {
		_deliveryModeId = deliveryModeId;
	}

	public String getReceivedOn() {
		return _receivedOn;
	}

	public void setReceivedOn(String receivedOn) {
		_receivedOn = receivedOn;
	}

	public String getLetterDate() {
		return _letterDate;
	}

	public void setLetterDate(String letterDate) {
		_letterDate = letterDate;
	}

	public String getReferenceNo() {
		return _referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		_referenceNo = referenceNo;
	}

	public String getModeNo() {
		return _modeNo;
	}

	public void setModeNo(String modeNo) {
		_modeNo = modeNo;
	}

	public long getCategoryId() {
		return _CategoryId;
	}

	public void setCategoryId(long CategoryId) {
		_CategoryId = CategoryId;
	}

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public String getRemarks() {
		return _remarks;
	}

	public void setRemarks(String remarks) {
		_remarks = remarks;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDesignation() {
		return _designation;
	}

	public void setDesignation(String designation) {
		_designation = designation;
	}

	public String getMobile() {
		return _mobile;
	}

	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public long getStateId() {
		return _stateId;
	}

	public void setStateId(long stateId) {
		_stateId = stateId;
	}

	public String getPinCode() {
		return _pinCode;
	}

	public void setPinCode(String pinCode) {
		_pinCode = pinCode;
	}

	public String getReceiptNo() {
		return _receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		_receiptNo = receiptNo;
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public long getUserPostId() {
		return _userPostId;
	}

	public void setUserPostId(long userPostId) {
		_userPostId = userPostId;
	}

	public String getViewPdfUrl() {
		return _viewPdfUrl;
	}

	public void setViewPdfUrl(String viewPdfUrl) {
		_viewPdfUrl = viewPdfUrl;
	}

	public long getDocFileId() {
		return _docFileId;
	}

	public void setDocFileId(long docFileId) {
		_docFileId = docFileId;
	}

	public String getNature() {
		return _nature;
	}

	public void setNature(String nature) {
		_nature = nature;
	}

	public long getCurrentlyWith() {
		return _currentlyWith;
	}

	public void setCurrentlyWith(long currentlyWith) {
		_currentlyWith = currentlyWith;
	}

	public long getCurrentState() {
		return _currentState;
	}

	public void setCurrentState(long currentState) {
		_currentState = currentState;
	}

	public String getAttachStatus() {
		return _attachStatus;
	}

	public void setAttachStatus(String attachStatus) {
		_attachStatus = attachStatus;
	}

	private String _uuid;
	private long _receiptId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _typeId;
	private long _deliveryModeId;
	private String _receivedOn;
	private String _letterDate;
	private String _referenceNo;
	private String _modeNo;
	private long _CategoryId;
	private String _subject;
	private String _remarks;
	private String _name;
	private String _designation;
	private String _mobile;
	private String _email;
	private String _address;
	private long _stateId;
	private String _pinCode;
	private String _receiptNo;
	private long _organizationId;
	private String _city;
	private long _userPostId;
	private String _viewPdfUrl;
	private long _docFileId;
	private String _nature;
	private long _currentlyWith;
	private long _currentState;
	private String _attachStatus;

}