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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SecondaryHead}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondaryHead
 * @generated
 */
public class SecondaryHeadWrapper
	extends BaseModelWrapper<SecondaryHead>
	implements ModelWrapper<SecondaryHead>, SecondaryHead {

	public SecondaryHeadWrapper(SecondaryHead secondaryHead) {
		super(secondaryHead);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("secondaryHeadId", getSecondaryHeadId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("secondaryHeadValue", getSecondaryHeadValue());
		attributes.put("primaryHeadId", getPrimaryHeadId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long secondaryHeadId = (Long)attributes.get("secondaryHeadId");

		if (secondaryHeadId != null) {
			setSecondaryHeadId(secondaryHeadId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String secondaryHeadValue = (String)attributes.get(
			"secondaryHeadValue");

		if (secondaryHeadValue != null) {
			setSecondaryHeadValue(secondaryHeadValue);
		}

		Long primaryHeadId = (Long)attributes.get("primaryHeadId");

		if (primaryHeadId != null) {
			setPrimaryHeadId(primaryHeadId);
		}
	}

	@Override
	public SecondaryHead cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this secondary head.
	 *
	 * @return the company ID of this secondary head
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this secondary head.
	 *
	 * @return the create date of this secondary head
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this secondary head.
	 *
	 * @return the group ID of this secondary head
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this secondary head.
	 *
	 * @return the modified date of this secondary head
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary head ID of this secondary head.
	 *
	 * @return the primary head ID of this secondary head
	 */
	@Override
	public long getPrimaryHeadId() {
		return model.getPrimaryHeadId();
	}

	/**
	 * Returns the primary key of this secondary head.
	 *
	 * @return the primary key of this secondary head
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the secondary head ID of this secondary head.
	 *
	 * @return the secondary head ID of this secondary head
	 */
	@Override
	public long getSecondaryHeadId() {
		return model.getSecondaryHeadId();
	}

	/**
	 * Returns the secondary head value of this secondary head.
	 *
	 * @return the secondary head value of this secondary head
	 */
	@Override
	public String getSecondaryHeadValue() {
		return model.getSecondaryHeadValue();
	}

	/**
	 * Returns the user ID of this secondary head.
	 *
	 * @return the user ID of this secondary head
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this secondary head.
	 *
	 * @return the user name of this secondary head
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this secondary head.
	 *
	 * @return the user uuid of this secondary head
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this secondary head.
	 *
	 * @return the uuid of this secondary head
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this secondary head.
	 *
	 * @param companyId the company ID of this secondary head
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this secondary head.
	 *
	 * @param createDate the create date of this secondary head
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this secondary head.
	 *
	 * @param groupId the group ID of this secondary head
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this secondary head.
	 *
	 * @param modifiedDate the modified date of this secondary head
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary head ID of this secondary head.
	 *
	 * @param primaryHeadId the primary head ID of this secondary head
	 */
	@Override
	public void setPrimaryHeadId(long primaryHeadId) {
		model.setPrimaryHeadId(primaryHeadId);
	}

	/**
	 * Sets the primary key of this secondary head.
	 *
	 * @param primaryKey the primary key of this secondary head
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the secondary head ID of this secondary head.
	 *
	 * @param secondaryHeadId the secondary head ID of this secondary head
	 */
	@Override
	public void setSecondaryHeadId(long secondaryHeadId) {
		model.setSecondaryHeadId(secondaryHeadId);
	}

	/**
	 * Sets the secondary head value of this secondary head.
	 *
	 * @param secondaryHeadValue the secondary head value of this secondary head
	 */
	@Override
	public void setSecondaryHeadValue(String secondaryHeadValue) {
		model.setSecondaryHeadValue(secondaryHeadValue);
	}

	/**
	 * Sets the user ID of this secondary head.
	 *
	 * @param userId the user ID of this secondary head
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this secondary head.
	 *
	 * @param userName the user name of this secondary head
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this secondary head.
	 *
	 * @param userUuid the user uuid of this secondary head
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this secondary head.
	 *
	 * @param uuid the uuid of this secondary head
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected SecondaryHeadWrapper wrap(SecondaryHead secondaryHead) {
		return new SecondaryHeadWrapper(secondaryHead);
	}

}