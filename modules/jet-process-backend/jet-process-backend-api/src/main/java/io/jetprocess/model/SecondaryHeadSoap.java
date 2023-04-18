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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.SecondaryHeadServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class SecondaryHeadSoap implements Serializable {

	public static SecondaryHeadSoap toSoapModel(SecondaryHead model) {
		SecondaryHeadSoap soapModel = new SecondaryHeadSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setSecondaryHeadId(model.getSecondaryHeadId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setSecondaryHeadValue(model.getSecondaryHeadValue());
		soapModel.setPrimaryHeadId(model.getPrimaryHeadId());

		return soapModel;
	}

	public static SecondaryHeadSoap[] toSoapModels(SecondaryHead[] models) {
		SecondaryHeadSoap[] soapModels = new SecondaryHeadSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SecondaryHeadSoap[][] toSoapModels(SecondaryHead[][] models) {
		SecondaryHeadSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SecondaryHeadSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SecondaryHeadSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SecondaryHeadSoap[] toSoapModels(List<SecondaryHead> models) {
		List<SecondaryHeadSoap> soapModels = new ArrayList<SecondaryHeadSoap>(
			models.size());

		for (SecondaryHead model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SecondaryHeadSoap[soapModels.size()]);
	}

	public SecondaryHeadSoap() {
	}

	public long getPrimaryKey() {
		return _secondaryHeadId;
	}

	public void setPrimaryKey(long pk) {
		setSecondaryHeadId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getSecondaryHeadId() {
		return _secondaryHeadId;
	}

	public void setSecondaryHeadId(long secondaryHeadId) {
		_secondaryHeadId = secondaryHeadId;
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

	public String getSecondaryHeadValue() {
		return _secondaryHeadValue;
	}

	public void setSecondaryHeadValue(String secondaryHeadValue) {
		_secondaryHeadValue = secondaryHeadValue;
	}

	public long getPrimaryHeadId() {
		return _primaryHeadId;
	}

	public void setPrimaryHeadId(long primaryHeadId) {
		_primaryHeadId = primaryHeadId;
	}

	private String _uuid;
	private long _secondaryHeadId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _secondaryHeadValue;
	private long _primaryHeadId;

}