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
 * This class is a wrapper for {@link ReceiptMovement}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReceiptMovement
 * @generated
 */
public class ReceiptMovementWrapper
	extends BaseModelWrapper<ReceiptMovement>
	implements ModelWrapper<ReceiptMovement>, ReceiptMovement {

	public ReceiptMovementWrapper(ReceiptMovement receiptMovement) {
		super(receiptMovement);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("receiverId", getReceiverId());
		attributes.put("senderId", getSenderId());
		attributes.put("receiptId", getReceiptId());
		attributes.put("priority", getPriority());
		attributes.put("dueDate", getDueDate());
		attributes.put("remarks", getRemarks());
		attributes.put("active", isActive());
		attributes.put("movementType", getMovementType());

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

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long receiverId = (Long)attributes.get("receiverId");

		if (receiverId != null) {
			setReceiverId(receiverId);
		}

		Long senderId = (Long)attributes.get("senderId");

		if (senderId != null) {
			setSenderId(senderId);
		}

		Long receiptId = (Long)attributes.get("receiptId");

		if (receiptId != null) {
			setReceiptId(receiptId);
		}

		String priority = (String)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}

		Date dueDate = (Date)attributes.get("dueDate");

		if (dueDate != null) {
			setDueDate(dueDate);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Long movementType = (Long)attributes.get("movementType");

		if (movementType != null) {
			setMovementType(movementType);
		}
	}

	@Override
	public ReceiptMovement cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the active of this receipt movement.
	 *
	 * @return the active of this receipt movement
	 */
	@Override
	public boolean getActive() {
		return model.getActive();
	}

	/**
	 * Returns the company ID of this receipt movement.
	 *
	 * @return the company ID of this receipt movement
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this receipt movement.
	 *
	 * @return the create date of this receipt movement
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the due date of this receipt movement.
	 *
	 * @return the due date of this receipt movement
	 */
	@Override
	public Date getDueDate() {
		return model.getDueDate();
	}

	/**
	 * Returns the group ID of this receipt movement.
	 *
	 * @return the group ID of this receipt movement
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this receipt movement.
	 *
	 * @return the ID of this receipt movement
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the modified date of this receipt movement.
	 *
	 * @return the modified date of this receipt movement
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the movement type of this receipt movement.
	 *
	 * @return the movement type of this receipt movement
	 */
	@Override
	public long getMovementType() {
		return model.getMovementType();
	}

	/**
	 * Returns the primary key of this receipt movement.
	 *
	 * @return the primary key of this receipt movement
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the priority of this receipt movement.
	 *
	 * @return the priority of this receipt movement
	 */
	@Override
	public String getPriority() {
		return model.getPriority();
	}

	/**
	 * Returns the receipt ID of this receipt movement.
	 *
	 * @return the receipt ID of this receipt movement
	 */
	@Override
	public long getReceiptId() {
		return model.getReceiptId();
	}

	/**
	 * Returns the receiver ID of this receipt movement.
	 *
	 * @return the receiver ID of this receipt movement
	 */
	@Override
	public long getReceiverId() {
		return model.getReceiverId();
	}

	/**
	 * Returns the remarks of this receipt movement.
	 *
	 * @return the remarks of this receipt movement
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the sender ID of this receipt movement.
	 *
	 * @return the sender ID of this receipt movement
	 */
	@Override
	public long getSenderId() {
		return model.getSenderId();
	}

	/**
	 * Returns the user ID of this receipt movement.
	 *
	 * @return the user ID of this receipt movement
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this receipt movement.
	 *
	 * @return the user uuid of this receipt movement
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this receipt movement.
	 *
	 * @return the uuid of this receipt movement
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this receipt movement is active.
	 *
	 * @return <code>true</code> if this receipt movement is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isActive() {
		return model.isActive();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this receipt movement is active.
	 *
	 * @param active the active of this receipt movement
	 */
	@Override
	public void setActive(boolean active) {
		model.setActive(active);
	}

	/**
	 * Sets the company ID of this receipt movement.
	 *
	 * @param companyId the company ID of this receipt movement
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this receipt movement.
	 *
	 * @param createDate the create date of this receipt movement
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the due date of this receipt movement.
	 *
	 * @param dueDate the due date of this receipt movement
	 */
	@Override
	public void setDueDate(Date dueDate) {
		model.setDueDate(dueDate);
	}

	/**
	 * Sets the group ID of this receipt movement.
	 *
	 * @param groupId the group ID of this receipt movement
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this receipt movement.
	 *
	 * @param id the ID of this receipt movement
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the modified date of this receipt movement.
	 *
	 * @param modifiedDate the modified date of this receipt movement
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the movement type of this receipt movement.
	 *
	 * @param movementType the movement type of this receipt movement
	 */
	@Override
	public void setMovementType(long movementType) {
		model.setMovementType(movementType);
	}

	/**
	 * Sets the primary key of this receipt movement.
	 *
	 * @param primaryKey the primary key of this receipt movement
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the priority of this receipt movement.
	 *
	 * @param priority the priority of this receipt movement
	 */
	@Override
	public void setPriority(String priority) {
		model.setPriority(priority);
	}

	/**
	 * Sets the receipt ID of this receipt movement.
	 *
	 * @param receiptId the receipt ID of this receipt movement
	 */
	@Override
	public void setReceiptId(long receiptId) {
		model.setReceiptId(receiptId);
	}

	/**
	 * Sets the receiver ID of this receipt movement.
	 *
	 * @param receiverId the receiver ID of this receipt movement
	 */
	@Override
	public void setReceiverId(long receiverId) {
		model.setReceiverId(receiverId);
	}

	/**
	 * Sets the remarks of this receipt movement.
	 *
	 * @param remarks the remarks of this receipt movement
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the sender ID of this receipt movement.
	 *
	 * @param senderId the sender ID of this receipt movement
	 */
	@Override
	public void setSenderId(long senderId) {
		model.setSenderId(senderId);
	}

	/**
	 * Sets the user ID of this receipt movement.
	 *
	 * @param userId the user ID of this receipt movement
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this receipt movement.
	 *
	 * @param userUuid the user uuid of this receipt movement
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this receipt movement.
	 *
	 * @param uuid the uuid of this receipt movement
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
	protected ReceiptMovementWrapper wrap(ReceiptMovement receiptMovement) {
		return new ReceiptMovementWrapper(receiptMovement);
	}

}