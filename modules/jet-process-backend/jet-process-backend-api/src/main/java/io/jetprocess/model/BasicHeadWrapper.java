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
 * This class is a wrapper for {@link BasicHead}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BasicHead
 * @generated
 */
public class BasicHeadWrapper
	extends BaseModelWrapper<BasicHead>
	implements BasicHead, ModelWrapper<BasicHead> {

	public BasicHeadWrapper(BasicHead basicHead) {
		super(basicHead);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("basicHeadId", getBasicHeadId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("basicHeadValue", getBasicHeadValue());
		attributes.put("basicHeadCode", getBasicHeadCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long basicHeadId = (Long)attributes.get("basicHeadId");

		if (basicHeadId != null) {
			setBasicHeadId(basicHeadId);
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

		String basicHeadValue = (String)attributes.get("basicHeadValue");

		if (basicHeadValue != null) {
			setBasicHeadValue(basicHeadValue);
		}

		Long basicHeadCode = (Long)attributes.get("basicHeadCode");

		if (basicHeadCode != null) {
			setBasicHeadCode(basicHeadCode);
		}
	}

	@Override
	public BasicHead cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the basic head code of this basic head.
	 *
	 * @return the basic head code of this basic head
	 */
	@Override
	public long getBasicHeadCode() {
		return model.getBasicHeadCode();
	}

	/**
	 * Returns the basic head ID of this basic head.
	 *
	 * @return the basic head ID of this basic head
	 */
	@Override
	public long getBasicHeadId() {
		return model.getBasicHeadId();
	}

	/**
	 * Returns the basic head value of this basic head.
	 *
	 * @return the basic head value of this basic head
	 */
	@Override
	public String getBasicHeadValue() {
		return model.getBasicHeadValue();
	}

	/**
	 * Returns the company ID of this basic head.
	 *
	 * @return the company ID of this basic head
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this basic head.
	 *
	 * @return the create date of this basic head
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this basic head.
	 *
	 * @return the group ID of this basic head
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this basic head.
	 *
	 * @return the modified date of this basic head
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this basic head.
	 *
	 * @return the primary key of this basic head
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this basic head.
	 *
	 * @return the user ID of this basic head
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this basic head.
	 *
	 * @return the user name of this basic head
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this basic head.
	 *
	 * @return the user uuid of this basic head
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this basic head.
	 *
	 * @return the uuid of this basic head
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
	 * Sets the basic head code of this basic head.
	 *
	 * @param basicHeadCode the basic head code of this basic head
	 */
	@Override
	public void setBasicHeadCode(long basicHeadCode) {
		model.setBasicHeadCode(basicHeadCode);
	}

	/**
	 * Sets the basic head ID of this basic head.
	 *
	 * @param basicHeadId the basic head ID of this basic head
	 */
	@Override
	public void setBasicHeadId(long basicHeadId) {
		model.setBasicHeadId(basicHeadId);
	}

	/**
	 * Sets the basic head value of this basic head.
	 *
	 * @param basicHeadValue the basic head value of this basic head
	 */
	@Override
	public void setBasicHeadValue(String basicHeadValue) {
		model.setBasicHeadValue(basicHeadValue);
	}

	/**
	 * Sets the company ID of this basic head.
	 *
	 * @param companyId the company ID of this basic head
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this basic head.
	 *
	 * @param createDate the create date of this basic head
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this basic head.
	 *
	 * @param groupId the group ID of this basic head
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this basic head.
	 *
	 * @param modifiedDate the modified date of this basic head
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this basic head.
	 *
	 * @param primaryKey the primary key of this basic head
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this basic head.
	 *
	 * @param userId the user ID of this basic head
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this basic head.
	 *
	 * @param userName the user name of this basic head
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this basic head.
	 *
	 * @param userUuid the user uuid of this basic head
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this basic head.
	 *
	 * @param uuid the uuid of this basic head
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
	protected BasicHeadWrapper wrap(BasicHead basicHead) {
		return new BasicHeadWrapper(basicHead);
	}

}