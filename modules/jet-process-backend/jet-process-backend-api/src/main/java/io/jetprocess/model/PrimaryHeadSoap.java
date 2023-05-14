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

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
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
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getBasicHeadId() {
		return _basicHeadId;
	}

	public void setBasicHeadId(long basicHeadId) {
		_basicHeadId = basicHeadId;
	}

	private long _id;
	private String _name;
	private long _basicHeadId;

}