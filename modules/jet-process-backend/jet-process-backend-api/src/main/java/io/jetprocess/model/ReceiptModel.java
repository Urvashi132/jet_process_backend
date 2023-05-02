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
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Receipt service. Represents a row in the &quot;JP_Receipt&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>io.jetprocess.model.impl.ReceiptModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>io.jetprocess.model.impl.ReceiptImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Receipt
 * @generated
 */
@ProviderType
public interface ReceiptModel
	extends BaseModel<Receipt>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a receipt model instance should use the {@link Receipt} interface instead.
	 */

	/**
	 * Returns the primary key of this receipt.
	 *
	 * @return the primary key of this receipt
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this receipt.
	 *
	 * @param primaryKey the primary key of this receipt
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this receipt.
	 *
	 * @return the uuid of this receipt
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this receipt.
	 *
	 * @param uuid the uuid of this receipt
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the receipt ID of this receipt.
	 *
	 * @return the receipt ID of this receipt
	 */
	public long getReceiptId();

	/**
	 * Sets the receipt ID of this receipt.
	 *
	 * @param receiptId the receipt ID of this receipt
	 */
	public void setReceiptId(long receiptId);

	/**
	 * Returns the group ID of this receipt.
	 *
	 * @return the group ID of this receipt
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this receipt.
	 *
	 * @param groupId the group ID of this receipt
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this receipt.
	 *
	 * @return the company ID of this receipt
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this receipt.
	 *
	 * @param companyId the company ID of this receipt
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this receipt.
	 *
	 * @return the user ID of this receipt
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this receipt.
	 *
	 * @param userId the user ID of this receipt
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this receipt.
	 *
	 * @return the user uuid of this receipt
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this receipt.
	 *
	 * @param userUuid the user uuid of this receipt
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this receipt.
	 *
	 * @return the user name of this receipt
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this receipt.
	 *
	 * @param userName the user name of this receipt
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this receipt.
	 *
	 * @return the create date of this receipt
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this receipt.
	 *
	 * @param createDate the create date of this receipt
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this receipt.
	 *
	 * @return the modified date of this receipt
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this receipt.
	 *
	 * @param modifiedDate the modified date of this receipt
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the type ID of this receipt.
	 *
	 * @return the type ID of this receipt
	 */
	public long getTypeId();

	/**
	 * Sets the type ID of this receipt.
	 *
	 * @param typeId the type ID of this receipt
	 */
	public void setTypeId(long typeId);

	/**
	 * Returns the delivery mode ID of this receipt.
	 *
	 * @return the delivery mode ID of this receipt
	 */
	public long getDeliveryModeId();

	/**
	 * Sets the delivery mode ID of this receipt.
	 *
	 * @param deliveryModeId the delivery mode ID of this receipt
	 */
	public void setDeliveryModeId(long deliveryModeId);

	/**
	 * Returns the received on of this receipt.
	 *
	 * @return the received on of this receipt
	 */
	@AutoEscape
	public String getReceivedOn();

	/**
	 * Sets the received on of this receipt.
	 *
	 * @param receivedOn the received on of this receipt
	 */
	public void setReceivedOn(String receivedOn);

	/**
	 * Returns the letter date of this receipt.
	 *
	 * @return the letter date of this receipt
	 */
	@AutoEscape
	public String getLetterDate();

	/**
	 * Sets the letter date of this receipt.
	 *
	 * @param letterDate the letter date of this receipt
	 */
	public void setLetterDate(String letterDate);

	/**
	 * Returns the reference no of this receipt.
	 *
	 * @return the reference no of this receipt
	 */
	@AutoEscape
	public String getReferenceNo();

	/**
	 * Sets the reference no of this receipt.
	 *
	 * @param referenceNo the reference no of this receipt
	 */
	public void setReferenceNo(String referenceNo);

	/**
	 * Returns the mode no of this receipt.
	 *
	 * @return the mode no of this receipt
	 */
	@AutoEscape
	public String getModeNo();

	/**
	 * Sets the mode no of this receipt.
	 *
	 * @param modeNo the mode no of this receipt
	 */
	public void setModeNo(String modeNo);

	/**
	 * Returns the category ID of this receipt.
	 *
	 * @return the category ID of this receipt
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this receipt.
	 *
	 * @param CategoryId the category ID of this receipt
	 */
	public void setCategoryId(long CategoryId);

	/**
	 * Returns the subject of this receipt.
	 *
	 * @return the subject of this receipt
	 */
	@AutoEscape
	public String getSubject();

	/**
	 * Sets the subject of this receipt.
	 *
	 * @param subject the subject of this receipt
	 */
	public void setSubject(String subject);

	/**
	 * Returns the remarks of this receipt.
	 *
	 * @return the remarks of this receipt
	 */
	@AutoEscape
	public String getRemarks();

	/**
	 * Sets the remarks of this receipt.
	 *
	 * @param remarks the remarks of this receipt
	 */
	public void setRemarks(String remarks);

	/**
	 * Returns the name of this receipt.
	 *
	 * @return the name of this receipt
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this receipt.
	 *
	 * @param name the name of this receipt
	 */
	public void setName(String name);

	/**
	 * Returns the designation of this receipt.
	 *
	 * @return the designation of this receipt
	 */
	@AutoEscape
	public String getDesignation();

	/**
	 * Sets the designation of this receipt.
	 *
	 * @param designation the designation of this receipt
	 */
	public void setDesignation(String designation);

	/**
	 * Returns the mobile of this receipt.
	 *
	 * @return the mobile of this receipt
	 */
	@AutoEscape
	public String getMobile();

	/**
	 * Sets the mobile of this receipt.
	 *
	 * @param mobile the mobile of this receipt
	 */
	public void setMobile(String mobile);

	/**
	 * Returns the email of this receipt.
	 *
	 * @return the email of this receipt
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this receipt.
	 *
	 * @param email the email of this receipt
	 */
	public void setEmail(String email);

	/**
	 * Returns the address of this receipt.
	 *
	 * @return the address of this receipt
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this receipt.
	 *
	 * @param address the address of this receipt
	 */
	public void setAddress(String address);

	/**
	 * Returns the state ID of this receipt.
	 *
	 * @return the state ID of this receipt
	 */
	public long getStateId();

	/**
	 * Sets the state ID of this receipt.
	 *
	 * @param stateId the state ID of this receipt
	 */
	public void setStateId(long stateId);

	/**
	 * Returns the pin code of this receipt.
	 *
	 * @return the pin code of this receipt
	 */
	@AutoEscape
	public String getPinCode();

	/**
	 * Sets the pin code of this receipt.
	 *
	 * @param pinCode the pin code of this receipt
	 */
	public void setPinCode(String pinCode);

	/**
	 * Returns the receipt no of this receipt.
	 *
	 * @return the receipt no of this receipt
	 */
	@AutoEscape
	public String getReceiptNo();

	/**
	 * Sets the receipt no of this receipt.
	 *
	 * @param receiptNo the receipt no of this receipt
	 */
	public void setReceiptNo(String receiptNo);

	/**
	 * Returns the organization ID of this receipt.
	 *
	 * @return the organization ID of this receipt
	 */
	public long getOrganizationId();

	/**
	 * Sets the organization ID of this receipt.
	 *
	 * @param organizationId the organization ID of this receipt
	 */
	public void setOrganizationId(long organizationId);

	/**
	 * Returns the city of this receipt.
	 *
	 * @return the city of this receipt
	 */
	@AutoEscape
	public String getCity();

	/**
	 * Sets the city of this receipt.
	 *
	 * @param city the city of this receipt
	 */
	public void setCity(String city);

	/**
	 * Returns the user post ID of this receipt.
	 *
	 * @return the user post ID of this receipt
	 */
	public long getUserPostId();

	/**
	 * Sets the user post ID of this receipt.
	 *
	 * @param userPostId the user post ID of this receipt
	 */
	public void setUserPostId(long userPostId);

	/**
	 * Returns the view pdf url of this receipt.
	 *
	 * @return the view pdf url of this receipt
	 */
	@AutoEscape
	public String getViewPdfUrl();

	/**
	 * Sets the view pdf url of this receipt.
	 *
	 * @param viewPdfUrl the view pdf url of this receipt
	 */
	public void setViewPdfUrl(String viewPdfUrl);

	/**
	 * Returns the doc file ID of this receipt.
	 *
	 * @return the doc file ID of this receipt
	 */
	public long getDocFileId();

	/**
	 * Sets the doc file ID of this receipt.
	 *
	 * @param docFileId the doc file ID of this receipt
	 */
	public void setDocFileId(long docFileId);

	/**
	 * Returns the nature of this receipt.
	 *
	 * @return the nature of this receipt
	 */
	@AutoEscape
	public String getNature();

	/**
	 * Sets the nature of this receipt.
	 *
	 * @param nature the nature of this receipt
	 */
	public void setNature(String nature);

	/**
	 * Returns the currently with of this receipt.
	 *
	 * @return the currently with of this receipt
	 */
	public long getCurrentlyWith();

	/**
	 * Sets the currently with of this receipt.
	 *
	 * @param currentlyWith the currently with of this receipt
	 */
	public void setCurrentlyWith(long currentlyWith);

	/**
	 * Returns the current state of this receipt.
	 *
	 * @return the current state of this receipt
	 */
	public long getCurrentState();

	/**
	 * Sets the current state of this receipt.
	 *
	 * @param currentState the current state of this receipt
	 */
	public void setCurrentState(long currentState);

	/**
	 * Returns the attach status of this receipt.
	 *
	 * @return the attach status of this receipt
	 */
	@AutoEscape
	public String getAttachStatus();

	/**
	 * Sets the attach status of this receipt.
	 *
	 * @param attachStatus the attach status of this receipt
	 */
	public void setAttachStatus(String attachStatus);

	@Override
	public Receipt cloneWithOriginalValues();

}