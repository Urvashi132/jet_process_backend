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
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the ReceiptMovement service. Represents a row in the &quot;JP_ReceiptMovement&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>io.jetprocess.model.impl.ReceiptMovementModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>io.jetprocess.model.impl.ReceiptMovementImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReceiptMovement
 * @generated
 */
@ProviderType
public interface ReceiptMovementModel
	extends BaseModel<ReceiptMovement>, ShardedModel, StagedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a receipt movement model instance should use the {@link ReceiptMovement} interface instead.
	 */

	/**
	 * Returns the primary key of this receipt movement.
	 *
	 * @return the primary key of this receipt movement
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this receipt movement.
	 *
	 * @param primaryKey the primary key of this receipt movement
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this receipt movement.
	 *
	 * @return the uuid of this receipt movement
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this receipt movement.
	 *
	 * @param uuid the uuid of this receipt movement
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this receipt movement.
	 *
	 * @return the ID of this receipt movement
	 */
	public long getId();

	/**
	 * Sets the ID of this receipt movement.
	 *
	 * @param id the ID of this receipt movement
	 */
	public void setId(long id);

	/**
	 * Returns the group ID of this receipt movement.
	 *
	 * @return the group ID of this receipt movement
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this receipt movement.
	 *
	 * @param groupId the group ID of this receipt movement
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this receipt movement.
	 *
	 * @return the company ID of this receipt movement
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this receipt movement.
	 *
	 * @param companyId the company ID of this receipt movement
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this receipt movement.
	 *
	 * @return the user ID of this receipt movement
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this receipt movement.
	 *
	 * @param userId the user ID of this receipt movement
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this receipt movement.
	 *
	 * @return the user uuid of this receipt movement
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this receipt movement.
	 *
	 * @param userUuid the user uuid of this receipt movement
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this receipt movement.
	 *
	 * @return the create date of this receipt movement
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this receipt movement.
	 *
	 * @param createDate the create date of this receipt movement
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this receipt movement.
	 *
	 * @return the modified date of this receipt movement
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this receipt movement.
	 *
	 * @param modifiedDate the modified date of this receipt movement
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the receiver ID of this receipt movement.
	 *
	 * @return the receiver ID of this receipt movement
	 */
	public long getReceiverId();

	/**
	 * Sets the receiver ID of this receipt movement.
	 *
	 * @param receiverId the receiver ID of this receipt movement
	 */
	public void setReceiverId(long receiverId);

	/**
	 * Returns the sender ID of this receipt movement.
	 *
	 * @return the sender ID of this receipt movement
	 */
	public long getSenderId();

	/**
	 * Sets the sender ID of this receipt movement.
	 *
	 * @param senderId the sender ID of this receipt movement
	 */
	public void setSenderId(long senderId);

	/**
	 * Returns the receipt ID of this receipt movement.
	 *
	 * @return the receipt ID of this receipt movement
	 */
	public long getReceiptId();

	/**
	 * Sets the receipt ID of this receipt movement.
	 *
	 * @param receiptId the receipt ID of this receipt movement
	 */
	public void setReceiptId(long receiptId);

	/**
	 * Returns the priority of this receipt movement.
	 *
	 * @return the priority of this receipt movement
	 */
	@AutoEscape
	public String getPriority();

	/**
	 * Sets the priority of this receipt movement.
	 *
	 * @param priority the priority of this receipt movement
	 */
	public void setPriority(String priority);

	/**
	 * Returns the due date of this receipt movement.
	 *
	 * @return the due date of this receipt movement
	 */
	public Date getDueDate();

	/**
	 * Sets the due date of this receipt movement.
	 *
	 * @param dueDate the due date of this receipt movement
	 */
	public void setDueDate(Date dueDate);

	/**
	 * Returns the remarks of this receipt movement.
	 *
	 * @return the remarks of this receipt movement
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this receipt movement.
	 *
	 * @param remarks the remarks of this receipt movement
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the active of this receipt movement.
	 *
	 * @return the active of this receipt movement
	 */
	public boolean getActive();

	/**
	 * Returns <code>true</code> if this receipt movement is active.
	 *
	 * @return <code>true</code> if this receipt movement is active; <code>false</code> otherwise
	 */
	public boolean isActive();

	/**
	 * Sets whether this receipt movement is active.
	 *
	 * @param active the active of this receipt movement
	 */
	public void setActive(boolean active);

	/**
	 * Returns the movement type of this receipt movement.
	 *
	 * @return the movement type of this receipt movement
	 */
	public long getMovementType();

	/**
	 * Sets the movement type of this receipt movement.
	 *
	 * @param movementType the movement type of this receipt movement
	 */
	public void setMovementType(long movementType);

	@Override
	public ReceiptMovement cloneWithOriginalValues();

}