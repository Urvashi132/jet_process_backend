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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.TertiaryHeadServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class TertiaryHeadSoap implements Serializable {

	public static TertiaryHeadSoap toSoapModel(TertiaryHead model) {
		TertiaryHeadSoap soapModel = new TertiaryHeadSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTertiaryHeadId(model.getTertiaryHeadId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTertiaryHeadvalue(model.getTertiaryHeadvalue());
		soapModel.setSecondaryHeadId(model.getSecondaryHeadId());

		return soapModel;
	}

	public static TertiaryHeadSoap[] toSoapModels(TertiaryHead[] models) {
		TertiaryHeadSoap[] soapModels = new TertiaryHeadSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TertiaryHeadSoap[][] toSoapModels(TertiaryHead[][] models) {
		TertiaryHeadSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TertiaryHeadSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TertiaryHeadSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TertiaryHeadSoap[] toSoapModels(List<TertiaryHead> models) {
		List<TertiaryHeadSoap> soapModels = new ArrayList<TertiaryHeadSoap>(
			models.size());

		for (TertiaryHead model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TertiaryHeadSoap[soapModels.size()]);
	}

	public TertiaryHeadSoap() {
	}

	public long getPrimaryKey() {
		return _tertiaryHeadId;
	}

	public void setPrimaryKey(long pk) {
		setTertiaryHeadId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTertiaryHeadId() {
		return _tertiaryHeadId;
	}

	public void setTertiaryHeadId(long tertiaryHeadId) {
		_tertiaryHeadId = tertiaryHeadId;
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

	public String getTertiaryHeadvalue() {
		return _tertiaryHeadvalue;
	}

	public void setTertiaryHeadvalue(String tertiaryHeadvalue) {
		_tertiaryHeadvalue = tertiaryHeadvalue;
	}

	public long getSecondaryHeadId() {
		return _secondaryHeadId;
	}

	public void setSecondaryHeadId(long secondaryHeadId) {
		_secondaryHeadId = secondaryHeadId;
	}

	private String _uuid;
	private long _tertiaryHeadId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tertiaryHeadvalue;
	private long _secondaryHeadId;

}