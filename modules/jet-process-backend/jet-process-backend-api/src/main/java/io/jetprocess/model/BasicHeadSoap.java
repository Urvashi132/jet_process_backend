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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.BasicHeadServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class BasicHeadSoap implements Serializable {

	public static BasicHeadSoap toSoapModel(BasicHead model) {
		BasicHeadSoap soapModel = new BasicHeadSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBasicHeadId(model.getBasicHeadId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setBasicHeadValue(model.getBasicHeadValue());
		soapModel.setBasicHeadCode(model.getBasicHeadCode());

		return soapModel;
	}

	public static BasicHeadSoap[] toSoapModels(BasicHead[] models) {
		BasicHeadSoap[] soapModels = new BasicHeadSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BasicHeadSoap[][] toSoapModels(BasicHead[][] models) {
		BasicHeadSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BasicHeadSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BasicHeadSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BasicHeadSoap[] toSoapModels(List<BasicHead> models) {
		List<BasicHeadSoap> soapModels = new ArrayList<BasicHeadSoap>(
			models.size());

		for (BasicHead model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BasicHeadSoap[soapModels.size()]);
	}

	public BasicHeadSoap() {
	}

	public long getPrimaryKey() {
		return _basicHeadId;
	}

	public void setPrimaryKey(long pk) {
		setBasicHeadId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBasicHeadId() {
		return _basicHeadId;
	}

	public void setBasicHeadId(long basicHeadId) {
		_basicHeadId = basicHeadId;
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

	public String getBasicHeadValue() {
		return _basicHeadValue;
	}

	public void setBasicHeadValue(String basicHeadValue) {
		_basicHeadValue = basicHeadValue;
	}

	public long getBasicHeadCode() {
		return _basicHeadCode;
	}

	public void setBasicHeadCode(long basicHeadCode) {
		_basicHeadCode = basicHeadCode;
	}

	private String _uuid;
	private long _basicHeadId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _basicHeadValue;
	private long _basicHeadCode;

}