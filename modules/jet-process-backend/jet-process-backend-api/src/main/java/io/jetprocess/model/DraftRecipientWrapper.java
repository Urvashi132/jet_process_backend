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
 * This class is a wrapper for {@link DraftRecipient}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DraftRecipient
 * @generated
 */
public class DraftRecipientWrapper
	extends BaseModelWrapper<DraftRecipient>
	implements DraftRecipient, ModelWrapper<DraftRecipient> {

	public DraftRecipientWrapper(DraftRecipient draftRecipient) {
		super(draftRecipient);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("draftId", getDraftId());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("name", getName());
		attributes.put("designation", getDesignation());
		attributes.put("email", getEmail());
		attributes.put("mobile", getMobile());
		attributes.put("address", getAddress());
		attributes.put("stateId", getStateId());
		attributes.put("city", getCity());
		attributes.put("pinCode", getPinCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		Long draftId = (Long)attributes.get("draftId");

		if (draftId != null) {
			setDraftId(draftId);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		Long stateId = (Long)attributes.get("stateId");

		if (stateId != null) {
			setStateId(stateId);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String pinCode = (String)attributes.get("pinCode");

		if (pinCode != null) {
			setPinCode(pinCode);
		}
	}

	@Override
	public DraftRecipient cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this draft recipient.
	 *
	 * @return the address of this draft recipient
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the city of this draft recipient.
	 *
	 * @return the city of this draft recipient
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this draft recipient.
	 *
	 * @return the company ID of this draft recipient
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this draft recipient.
	 *
	 * @return the create date of this draft recipient
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the designation of this draft recipient.
	 *
	 * @return the designation of this draft recipient
	 */
	@Override
	public String getDesignation() {
		return model.getDesignation();
	}

	/**
	 * Returns the draft ID of this draft recipient.
	 *
	 * @return the draft ID of this draft recipient
	 */
	@Override
	public long getDraftId() {
		return model.getDraftId();
	}

	/**
	 * Returns the email of this draft recipient.
	 *
	 * @return the email of this draft recipient
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this draft recipient.
	 *
	 * @return the group ID of this draft recipient
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this draft recipient.
	 *
	 * @return the ID of this draft recipient
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the mobile of this draft recipient.
	 *
	 * @return the mobile of this draft recipient
	 */
	@Override
	public String getMobile() {
		return model.getMobile();
	}

	/**
	 * Returns the modified date of this draft recipient.
	 *
	 * @return the modified date of this draft recipient
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this draft recipient.
	 *
	 * @return the name of this draft recipient
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the organization ID of this draft recipient.
	 *
	 * @return the organization ID of this draft recipient
	 */
	@Override
	public long getOrganizationId() {
		return model.getOrganizationId();
	}

	/**
	 * Returns the pin code of this draft recipient.
	 *
	 * @return the pin code of this draft recipient
	 */
	@Override
	public String getPinCode() {
		return model.getPinCode();
	}

	/**
	 * Returns the primary key of this draft recipient.
	 *
	 * @return the primary key of this draft recipient
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the state ID of this draft recipient.
	 *
	 * @return the state ID of this draft recipient
	 */
	@Override
	public long getStateId() {
		return model.getStateId();
	}

	/**
	 * Returns the user ID of this draft recipient.
	 *
	 * @return the user ID of this draft recipient
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this draft recipient.
	 *
	 * @return the user name of this draft recipient
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this draft recipient.
	 *
	 * @return the user uuid of this draft recipient
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this draft recipient.
	 *
	 * @return the uuid of this draft recipient
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
	 * Sets the address of this draft recipient.
	 *
	 * @param address the address of this draft recipient
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the city of this draft recipient.
	 *
	 * @param city the city of this draft recipient
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this draft recipient.
	 *
	 * @param companyId the company ID of this draft recipient
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this draft recipient.
	 *
	 * @param createDate the create date of this draft recipient
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the designation of this draft recipient.
	 *
	 * @param designation the designation of this draft recipient
	 */
	@Override
	public void setDesignation(String designation) {
		model.setDesignation(designation);
	}

	/**
	 * Sets the draft ID of this draft recipient.
	 *
	 * @param draftId the draft ID of this draft recipient
	 */
	@Override
	public void setDraftId(long draftId) {
		model.setDraftId(draftId);
	}

	/**
	 * Sets the email of this draft recipient.
	 *
	 * @param email the email of this draft recipient
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this draft recipient.
	 *
	 * @param groupId the group ID of this draft recipient
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this draft recipient.
	 *
	 * @param id the ID of this draft recipient
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the mobile of this draft recipient.
	 *
	 * @param mobile the mobile of this draft recipient
	 */
	@Override
	public void setMobile(String mobile) {
		model.setMobile(mobile);
	}

	/**
	 * Sets the modified date of this draft recipient.
	 *
	 * @param modifiedDate the modified date of this draft recipient
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this draft recipient.
	 *
	 * @param name the name of this draft recipient
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the organization ID of this draft recipient.
	 *
	 * @param organizationId the organization ID of this draft recipient
	 */
	@Override
	public void setOrganizationId(long organizationId) {
		model.setOrganizationId(organizationId);
	}

	/**
	 * Sets the pin code of this draft recipient.
	 *
	 * @param pinCode the pin code of this draft recipient
	 */
	@Override
	public void setPinCode(String pinCode) {
		model.setPinCode(pinCode);
	}

	/**
	 * Sets the primary key of this draft recipient.
	 *
	 * @param primaryKey the primary key of this draft recipient
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the state ID of this draft recipient.
	 *
	 * @param stateId the state ID of this draft recipient
	 */
	@Override
	public void setStateId(long stateId) {
		model.setStateId(stateId);
	}

	/**
	 * Sets the user ID of this draft recipient.
	 *
	 * @param userId the user ID of this draft recipient
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this draft recipient.
	 *
	 * @param userName the user name of this draft recipient
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this draft recipient.
	 *
	 * @param userUuid the user uuid of this draft recipient
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this draft recipient.
	 *
	 * @param uuid the uuid of this draft recipient
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
	protected DraftRecipientWrapper wrap(DraftRecipient draftRecipient) {
		return new DraftRecipientWrapper(draftRecipient);
	}

}