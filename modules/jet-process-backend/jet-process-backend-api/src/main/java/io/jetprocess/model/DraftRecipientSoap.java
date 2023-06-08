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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.DraftRecipientServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DraftRecipientSoap implements Serializable {

	public static DraftRecipientSoap toSoapModel(DraftRecipient model) {
		DraftRecipientSoap soapModel = new DraftRecipientSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDraftId(model.getDraftId());
		soapModel.setOrganizationId(model.getOrganizationId());
		soapModel.setName(model.getName());
		soapModel.setDesignation(model.getDesignation());
		soapModel.setEmail(model.getEmail());
		soapModel.setMobile(model.getMobile());
		soapModel.setAddress(model.getAddress());
		soapModel.setStateId(model.getStateId());
		soapModel.setCity(model.getCity());
		soapModel.setPinCode(model.getPinCode());

		return soapModel;
	}

	public static DraftRecipientSoap[] toSoapModels(DraftRecipient[] models) {
		DraftRecipientSoap[] soapModels = new DraftRecipientSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DraftRecipientSoap[][] toSoapModels(
		DraftRecipient[][] models) {

		DraftRecipientSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new DraftRecipientSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DraftRecipientSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DraftRecipientSoap[] toSoapModels(
		List<DraftRecipient> models) {

		List<DraftRecipientSoap> soapModels = new ArrayList<DraftRecipientSoap>(
			models.size());

		for (DraftRecipient model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DraftRecipientSoap[soapModels.size()]);
	}

	public DraftRecipientSoap() {
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

	public long getDraftId() {
		return _draftId;
	}

	public void setDraftId(long draftId) {
		_draftId = draftId;
	}

	public long getOrganizationId() {
		return _organizationId;
	}

	public void setOrganizationId(long organizationId) {
		_organizationId = organizationId;
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

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getMobile() {
		return _mobile;
	}

	public void setMobile(String mobile) {
		_mobile = mobile;
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

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getPinCode() {
		return _pinCode;
	}

	public void setPinCode(String pinCode) {
		_pinCode = pinCode;
	}

	private String _uuid;
	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _draftId;
	private long _organizationId;
	private String _name;
	private String _designation;
	private String _email;
	private String _mobile;
	private String _address;
	private long _stateId;
	private String _city;
	private String _pinCode;

}