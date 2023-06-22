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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.PostalServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class PostalSoap implements Serializable {

	public static PostalSoap toSoapModel(Postal model) {
		PostalSoap soapModel = new PostalSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPostalMode(model.getPostalMode());
		soapModel.setPostalCharge(model.getPostalCharge());
		soapModel.setMedium(model.getMedium());
		soapModel.setWeight(model.getWeight());
		soapModel.setModeNo(model.getModeNo());
		soapModel.setPeonBookNo(model.getPeonBookNo());
		soapModel.setPeonName(model.getPeonName());
		soapModel.setOutDate(model.getOutDate());
		soapModel.setDeliveryDate(model.getDeliveryDate());
		soapModel.setDeliveryStatus(model.getDeliveryStatus());

		return soapModel;
	}

	public static PostalSoap[] toSoapModels(Postal[] models) {
		PostalSoap[] soapModels = new PostalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PostalSoap[][] toSoapModels(Postal[][] models) {
		PostalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PostalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PostalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PostalSoap[] toSoapModels(List<Postal> models) {
		List<PostalSoap> soapModels = new ArrayList<PostalSoap>(models.size());

		for (Postal model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PostalSoap[soapModels.size()]);
	}

	public PostalSoap() {
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

	public String getPostalMode() {
		return _postalMode;
	}

	public void setPostalMode(String postalMode) {
		_postalMode = postalMode;
	}

	public String getPostalCharge() {
		return _postalCharge;
	}

	public void setPostalCharge(String postalCharge) {
		_postalCharge = postalCharge;
	}

	public String getMedium() {
		return _medium;
	}

	public void setMedium(String medium) {
		_medium = medium;
	}

	public String getWeight() {
		return _weight;
	}

	public void setWeight(String weight) {
		_weight = weight;
	}

	public long getModeNo() {
		return _modeNo;
	}

	public void setModeNo(long modeNo) {
		_modeNo = modeNo;
	}

	public String getPeonBookNo() {
		return _peonBookNo;
	}

	public void setPeonBookNo(String peonBookNo) {
		_peonBookNo = peonBookNo;
	}

	public String getPeonName() {
		return _peonName;
	}

	public void setPeonName(String peonName) {
		_peonName = peonName;
	}

	public Date getOutDate() {
		return _outDate;
	}

	public void setOutDate(Date outDate) {
		_outDate = outDate;
	}

	public Date getDeliveryDate() {
		return _deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		_deliveryDate = deliveryDate;
	}

	public String getDeliveryStatus() {
		return _deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		_deliveryStatus = deliveryStatus;
	}

	private String _uuid;
	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _postalMode;
	private String _postalCharge;
	private String _medium;
	private String _weight;
	private long _modeNo;
	private String _peonBookNo;
	private String _peonName;
	private Date _outDate;
	private Date _deliveryDate;
	private String _deliveryStatus;

}