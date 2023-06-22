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
 * This class is a wrapper for {@link Dispatch}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Dispatch
 * @generated
 */
public class DispatchWrapper
	extends BaseModelWrapper<Dispatch>
	implements Dispatch, ModelWrapper<Dispatch> {

	public DispatchWrapper(Dispatch dispatch) {
		super(dispatch);
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
		attributes.put("dispatchNo", getDispatchNo());
		attributes.put("dispatchBy", getDispatchBy());
		attributes.put("deliveryMode", getDeliveryMode());
		attributes.put("address", getAddress());
		attributes.put("subject", getSubject());
		attributes.put("dispathOn", getDispathOn());
		attributes.put("dispatchType", getDispatchType());
		attributes.put("issueNo", getIssueNo());
		attributes.put("receiptentId", getReceiptentId());
		attributes.put("draftId", getDraftId());

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

		String dispatchNo = (String)attributes.get("dispatchNo");

		if (dispatchNo != null) {
			setDispatchNo(dispatchNo);
		}

		String dispatchBy = (String)attributes.get("dispatchBy");

		if (dispatchBy != null) {
			setDispatchBy(dispatchBy);
		}

		String deliveryMode = (String)attributes.get("deliveryMode");

		if (deliveryMode != null) {
			setDeliveryMode(deliveryMode);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		String dispathOn = (String)attributes.get("dispathOn");

		if (dispathOn != null) {
			setDispathOn(dispathOn);
		}

		String dispatchType = (String)attributes.get("dispatchType");

		if (dispatchType != null) {
			setDispatchType(dispatchType);
		}

		String issueNo = (String)attributes.get("issueNo");

		if (issueNo != null) {
			setIssueNo(issueNo);
		}

		Long receiptentId = (Long)attributes.get("receiptentId");

		if (receiptentId != null) {
			setReceiptentId(receiptentId);
		}

		Long draftId = (Long)attributes.get("draftId");

		if (draftId != null) {
			setDraftId(draftId);
		}
	}

	@Override
	public Dispatch cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this dispatch.
	 *
	 * @return the address of this dispatch
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the company ID of this dispatch.
	 *
	 * @return the company ID of this dispatch
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this dispatch.
	 *
	 * @return the create date of this dispatch
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the delivery mode of this dispatch.
	 *
	 * @return the delivery mode of this dispatch
	 */
	@Override
	public String getDeliveryMode() {
		return model.getDeliveryMode();
	}

	/**
	 * Returns the dispatch by of this dispatch.
	 *
	 * @return the dispatch by of this dispatch
	 */
	@Override
	public String getDispatchBy() {
		return model.getDispatchBy();
	}

	/**
	 * Returns the dispatch no of this dispatch.
	 *
	 * @return the dispatch no of this dispatch
	 */
	@Override
	public String getDispatchNo() {
		return model.getDispatchNo();
	}

	/**
	 * Returns the dispatch type of this dispatch.
	 *
	 * @return the dispatch type of this dispatch
	 */
	@Override
	public String getDispatchType() {
		return model.getDispatchType();
	}

	/**
	 * Returns the dispath on of this dispatch.
	 *
	 * @return the dispath on of this dispatch
	 */
	@Override
	public String getDispathOn() {
		return model.getDispathOn();
	}

	/**
	 * Returns the draft ID of this dispatch.
	 *
	 * @return the draft ID of this dispatch
	 */
	@Override
	public long getDraftId() {
		return model.getDraftId();
	}

	/**
	 * Returns the group ID of this dispatch.
	 *
	 * @return the group ID of this dispatch
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this dispatch.
	 *
	 * @return the ID of this dispatch
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the issue no of this dispatch.
	 *
	 * @return the issue no of this dispatch
	 */
	@Override
	public String getIssueNo() {
		return model.getIssueNo();
	}

	/**
	 * Returns the modified date of this dispatch.
	 *
	 * @return the modified date of this dispatch
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this dispatch.
	 *
	 * @return the primary key of this dispatch
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the receiptent ID of this dispatch.
	 *
	 * @return the receiptent ID of this dispatch
	 */
	@Override
	public long getReceiptentId() {
		return model.getReceiptentId();
	}

	/**
	 * Returns the subject of this dispatch.
	 *
	 * @return the subject of this dispatch
	 */
	@Override
	public String getSubject() {
		return model.getSubject();
	}

	/**
	 * Returns the user ID of this dispatch.
	 *
	 * @return the user ID of this dispatch
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this dispatch.
	 *
	 * @return the user name of this dispatch
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this dispatch.
	 *
	 * @return the user uuid of this dispatch
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this dispatch.
	 *
	 * @return the uuid of this dispatch
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
	 * Sets the address of this dispatch.
	 *
	 * @param address the address of this dispatch
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the company ID of this dispatch.
	 *
	 * @param companyId the company ID of this dispatch
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this dispatch.
	 *
	 * @param createDate the create date of this dispatch
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the delivery mode of this dispatch.
	 *
	 * @param deliveryMode the delivery mode of this dispatch
	 */
	@Override
	public void setDeliveryMode(String deliveryMode) {
		model.setDeliveryMode(deliveryMode);
	}

	/**
	 * Sets the dispatch by of this dispatch.
	 *
	 * @param dispatchBy the dispatch by of this dispatch
	 */
	@Override
	public void setDispatchBy(String dispatchBy) {
		model.setDispatchBy(dispatchBy);
	}

	/**
	 * Sets the dispatch no of this dispatch.
	 *
	 * @param dispatchNo the dispatch no of this dispatch
	 */
	@Override
	public void setDispatchNo(String dispatchNo) {
		model.setDispatchNo(dispatchNo);
	}

	/**
	 * Sets the dispatch type of this dispatch.
	 *
	 * @param dispatchType the dispatch type of this dispatch
	 */
	@Override
	public void setDispatchType(String dispatchType) {
		model.setDispatchType(dispatchType);
	}

	/**
	 * Sets the dispath on of this dispatch.
	 *
	 * @param dispathOn the dispath on of this dispatch
	 */
	@Override
	public void setDispathOn(String dispathOn) {
		model.setDispathOn(dispathOn);
	}

	/**
	 * Sets the draft ID of this dispatch.
	 *
	 * @param draftId the draft ID of this dispatch
	 */
	@Override
	public void setDraftId(long draftId) {
		model.setDraftId(draftId);
	}

	/**
	 * Sets the group ID of this dispatch.
	 *
	 * @param groupId the group ID of this dispatch
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this dispatch.
	 *
	 * @param id the ID of this dispatch
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the issue no of this dispatch.
	 *
	 * @param issueNo the issue no of this dispatch
	 */
	@Override
	public void setIssueNo(String issueNo) {
		model.setIssueNo(issueNo);
	}

	/**
	 * Sets the modified date of this dispatch.
	 *
	 * @param modifiedDate the modified date of this dispatch
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this dispatch.
	 *
	 * @param primaryKey the primary key of this dispatch
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the receiptent ID of this dispatch.
	 *
	 * @param receiptentId the receiptent ID of this dispatch
	 */
	@Override
	public void setReceiptentId(long receiptentId) {
		model.setReceiptentId(receiptentId);
	}

	/**
	 * Sets the subject of this dispatch.
	 *
	 * @param subject the subject of this dispatch
	 */
	@Override
	public void setSubject(String subject) {
		model.setSubject(subject);
	}

	/**
	 * Sets the user ID of this dispatch.
	 *
	 * @param userId the user ID of this dispatch
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this dispatch.
	 *
	 * @param userName the user name of this dispatch
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this dispatch.
	 *
	 * @param userUuid the user uuid of this dispatch
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this dispatch.
	 *
	 * @param uuid the uuid of this dispatch
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
	protected DispatchWrapper wrap(Dispatch dispatch) {
		return new DispatchWrapper(dispatch);
	}

}