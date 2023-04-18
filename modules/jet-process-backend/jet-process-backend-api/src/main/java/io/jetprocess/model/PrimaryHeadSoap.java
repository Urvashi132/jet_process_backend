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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.PrimaryHeadServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class PrimaryHeadSoap implements Serializable {

	public static PrimaryHeadSoap toSoapModel(PrimaryHead model) {
		PrimaryHeadSoap soapModel = new PrimaryHeadSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPrimaryHeadId(model.getPrimaryHeadId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPrimaryHeadValue(model.getPrimaryHeadValue());
		soapModel.setBasicHeadId(model.getBasicHeadId());

		return soapModel;
	}

	public static PrimaryHeadSoap[] toSoapModels(PrimaryHead[] models) {
		PrimaryHeadSoap[] soapModels = new PrimaryHeadSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PrimaryHeadSoap[][] toSoapModels(PrimaryHead[][] models) {
		PrimaryHeadSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PrimaryHeadSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PrimaryHeadSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PrimaryHeadSoap[] toSoapModels(List<PrimaryHead> models) {
		List<PrimaryHeadSoap> soapModels = new ArrayList<PrimaryHeadSoap>(
			models.size());

		for (PrimaryHead model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PrimaryHeadSoap[soapModels.size()]);
	}

	public PrimaryHeadSoap() {
	}

	public long getPrimaryKey() {
		return _primaryHeadId;
	}

	public void setPrimaryKey(long pk) {
		setPrimaryHeadId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPrimaryHeadId() {
		return _primaryHeadId;
	}

	public void setPrimaryHeadId(long primaryHeadId) {
		_primaryHeadId = primaryHeadId;
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

	public String getPrimaryHeadValue() {
		return _primaryHeadValue;
	}

	public void setPrimaryHeadValue(String primaryHeadValue) {
		_primaryHeadValue = primaryHeadValue;
	}

	public long getBasicHeadId() {
		return _basicHeadId;
	}

	public void setBasicHeadId(long basicHeadId) {
		_basicHeadId = basicHeadId;
	}

	private String _uuid;
	private long _primaryHeadId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _primaryHeadValue;
	private long _basicHeadId;

}