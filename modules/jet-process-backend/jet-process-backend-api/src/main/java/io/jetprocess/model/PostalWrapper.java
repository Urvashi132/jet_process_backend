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
 * This class is a wrapper for {@link Postal}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Postal
 * @generated
 */
public class PostalWrapper
	extends BaseModelWrapper<Postal> implements ModelWrapper<Postal>, Postal {

	public PostalWrapper(Postal postal) {
		super(postal);
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
		attributes.put("postalMode", getPostalMode());
		attributes.put("postalCharge", getPostalCharge());
		attributes.put("medium", getMedium());
		attributes.put("weight", getWeight());
		attributes.put("modeNo", getModeNo());
		attributes.put("peonBookNo", getPeonBookNo());
		attributes.put("peonName", getPeonName());
		attributes.put("outDate", getOutDate());
		attributes.put("deliveryDate", getDeliveryDate());
		attributes.put("deliveryStatus", getDeliveryStatus());

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

		String postalMode = (String)attributes.get("postalMode");

		if (postalMode != null) {
			setPostalMode(postalMode);
		}

		String postalCharge = (String)attributes.get("postalCharge");

		if (postalCharge != null) {
			setPostalCharge(postalCharge);
		}

		String medium = (String)attributes.get("medium");

		if (medium != null) {
			setMedium(medium);
		}

		String weight = (String)attributes.get("weight");

		if (weight != null) {
			setWeight(weight);
		}

		Long modeNo = (Long)attributes.get("modeNo");

		if (modeNo != null) {
			setModeNo(modeNo);
		}

		String peonBookNo = (String)attributes.get("peonBookNo");

		if (peonBookNo != null) {
			setPeonBookNo(peonBookNo);
		}

		String peonName = (String)attributes.get("peonName");

		if (peonName != null) {
			setPeonName(peonName);
		}

		Date outDate = (Date)attributes.get("outDate");

		if (outDate != null) {
			setOutDate(outDate);
		}

		Date deliveryDate = (Date)attributes.get("deliveryDate");

		if (deliveryDate != null) {
			setDeliveryDate(deliveryDate);
		}

		String deliveryStatus = (String)attributes.get("deliveryStatus");

		if (deliveryStatus != null) {
			setDeliveryStatus(deliveryStatus);
		}
	}

	@Override
	public Postal cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this postal.
	 *
	 * @return the company ID of this postal
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this postal.
	 *
	 * @return the create date of this postal
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the delivery date of this postal.
	 *
	 * @return the delivery date of this postal
	 */
	@Override
	public Date getDeliveryDate() {
		return model.getDeliveryDate();
	}

	/**
	 * Returns the delivery status of this postal.
	 *
	 * @return the delivery status of this postal
	 */
	@Override
	public String getDeliveryStatus() {
		return model.getDeliveryStatus();
	}

	/**
	 * Returns the group ID of this postal.
	 *
	 * @return the group ID of this postal
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this postal.
	 *
	 * @return the ID of this postal
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the medium of this postal.
	 *
	 * @return the medium of this postal
	 */
	@Override
	public String getMedium() {
		return model.getMedium();
	}

	/**
	 * Returns the mode no of this postal.
	 *
	 * @return the mode no of this postal
	 */
	@Override
	public long getModeNo() {
		return model.getModeNo();
	}

	/**
	 * Returns the modified date of this postal.
	 *
	 * @return the modified date of this postal
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the out date of this postal.
	 *
	 * @return the out date of this postal
	 */
	@Override
	public Date getOutDate() {
		return model.getOutDate();
	}

	/**
	 * Returns the peon book no of this postal.
	 *
	 * @return the peon book no of this postal
	 */
	@Override
	public String getPeonBookNo() {
		return model.getPeonBookNo();
	}

	/**
	 * Returns the peon name of this postal.
	 *
	 * @return the peon name of this postal
	 */
	@Override
	public String getPeonName() {
		return model.getPeonName();
	}

	/**
	 * Returns the postal charge of this postal.
	 *
	 * @return the postal charge of this postal
	 */
	@Override
	public String getPostalCharge() {
		return model.getPostalCharge();
	}

	/**
	 * Returns the postal mode of this postal.
	 *
	 * @return the postal mode of this postal
	 */
	@Override
	public String getPostalMode() {
		return model.getPostalMode();
	}

	/**
	 * Returns the primary key of this postal.
	 *
	 * @return the primary key of this postal
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this postal.
	 *
	 * @return the user ID of this postal
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this postal.
	 *
	 * @return the user name of this postal
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this postal.
	 *
	 * @return the user uuid of this postal
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this postal.
	 *
	 * @return the uuid of this postal
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the weight of this postal.
	 *
	 * @return the weight of this postal
	 */
	@Override
	public String getWeight() {
		return model.getWeight();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this postal.
	 *
	 * @param companyId the company ID of this postal
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this postal.
	 *
	 * @param createDate the create date of this postal
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the delivery date of this postal.
	 *
	 * @param deliveryDate the delivery date of this postal
	 */
	@Override
	public void setDeliveryDate(Date deliveryDate) {
		model.setDeliveryDate(deliveryDate);
	}

	/**
	 * Sets the delivery status of this postal.
	 *
	 * @param deliveryStatus the delivery status of this postal
	 */
	@Override
	public void setDeliveryStatus(String deliveryStatus) {
		model.setDeliveryStatus(deliveryStatus);
	}

	/**
	 * Sets the group ID of this postal.
	 *
	 * @param groupId the group ID of this postal
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this postal.
	 *
	 * @param id the ID of this postal
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the medium of this postal.
	 *
	 * @param medium the medium of this postal
	 */
	@Override
	public void setMedium(String medium) {
		model.setMedium(medium);
	}

	/**
	 * Sets the mode no of this postal.
	 *
	 * @param modeNo the mode no of this postal
	 */
	@Override
	public void setModeNo(long modeNo) {
		model.setModeNo(modeNo);
	}

	/**
	 * Sets the modified date of this postal.
	 *
	 * @param modifiedDate the modified date of this postal
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the out date of this postal.
	 *
	 * @param outDate the out date of this postal
	 */
	@Override
	public void setOutDate(Date outDate) {
		model.setOutDate(outDate);
	}

	/**
	 * Sets the peon book no of this postal.
	 *
	 * @param peonBookNo the peon book no of this postal
	 */
	@Override
	public void setPeonBookNo(String peonBookNo) {
		model.setPeonBookNo(peonBookNo);
	}

	/**
	 * Sets the peon name of this postal.
	 *
	 * @param peonName the peon name of this postal
	 */
	@Override
	public void setPeonName(String peonName) {
		model.setPeonName(peonName);
	}

	/**
	 * Sets the postal charge of this postal.
	 *
	 * @param postalCharge the postal charge of this postal
	 */
	@Override
	public void setPostalCharge(String postalCharge) {
		model.setPostalCharge(postalCharge);
	}

	/**
	 * Sets the postal mode of this postal.
	 *
	 * @param postalMode the postal mode of this postal
	 */
	@Override
	public void setPostalMode(String postalMode) {
		model.setPostalMode(postalMode);
	}

	/**
	 * Sets the primary key of this postal.
	 *
	 * @param primaryKey the primary key of this postal
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this postal.
	 *
	 * @param userId the user ID of this postal
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this postal.
	 *
	 * @param userName the user name of this postal
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this postal.
	 *
	 * @param userUuid the user uuid of this postal
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this postal.
	 *
	 * @param uuid the uuid of this postal
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the weight of this postal.
	 *
	 * @param weight the weight of this postal
	 */
	@Override
	public void setWeight(String weight) {
		model.setWeight(weight);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected PostalWrapper wrap(Postal postal) {
		return new PostalWrapper(postal);
	}

}