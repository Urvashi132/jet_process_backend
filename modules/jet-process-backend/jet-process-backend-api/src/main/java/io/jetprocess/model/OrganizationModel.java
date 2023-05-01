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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Organization service. Represents a row in the &quot;JP_Organization&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>io.jetprocess.model.impl.OrganizationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>io.jetprocess.model.impl.OrganizationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Organization
 * @generated
 */
@ProviderType
public interface OrganizationModel extends BaseModel<Organization> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a organization model instance should use the {@link Organization} interface instead.
	 */

	/**
	 * Returns the primary key of this organization.
	 *
	 * @return the primary key of this organization
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this organization.
	 *
	 * @param primaryKey the primary key of this organization
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this organization.
	 *
	 * @return the ID of this organization
	 */
	public long getId();

	/**
	 * Sets the ID of this organization.
	 *
	 * @param id the ID of this organization
	 */
	public void setId(long id);

	/**
	 * Returns the name of this organization.
	 *
	 * @return the name of this organization
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this organization.
	 *
	 * @param name the name of this organization
	 */
	public void setName(String name);

	@Override
	public Organization cloneWithOriginalValues();

}