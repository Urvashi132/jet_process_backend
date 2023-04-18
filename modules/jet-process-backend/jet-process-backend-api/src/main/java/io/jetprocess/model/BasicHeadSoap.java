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

		soapModel.setBasicHeadId(model.getBasicHeadId());
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

	public long getBasicHeadId() {
		return _basicHeadId;
	}

	public void setBasicHeadId(long basicHeadId) {
		_basicHeadId = basicHeadId;
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

	private long _basicHeadId;
	private String _basicHeadValue;
	private long _basicHeadCode;

}