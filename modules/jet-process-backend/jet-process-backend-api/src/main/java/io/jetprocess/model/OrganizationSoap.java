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
 * This class is used by SOAP remote services, specifically {@link io.jetprocess.service.http.OrganizationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class OrganizationSoap implements Serializable {

	public static OrganizationSoap toSoapModel(Organization model) {
		OrganizationSoap soapModel = new OrganizationSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static OrganizationSoap[] toSoapModels(Organization[] models) {
		OrganizationSoap[] soapModels = new OrganizationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrganizationSoap[][] toSoapModels(Organization[][] models) {
		OrganizationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrganizationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrganizationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrganizationSoap[] toSoapModels(List<Organization> models) {
		List<OrganizationSoap> soapModels = new ArrayList<OrganizationSoap>(
			models.size());

		for (Organization model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrganizationSoap[soapModels.size()]);
	}

	public OrganizationSoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	private String _uuid;
	private long _id;
	private String _name;

}