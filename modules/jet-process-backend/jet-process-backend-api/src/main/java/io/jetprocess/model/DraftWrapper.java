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
 * This class is a wrapper for {@link Draft}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Draft
 * @generated
 */
public class DraftWrapper
	extends BaseModelWrapper<Draft> implements Draft, ModelWrapper<Draft> {

	public DraftWrapper(Draft draft) {
		super(draft);
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
		attributes.put("draftNo", getDraftNo());
		attributes.put("nature", getNature());
		attributes.put("receiptId", getReceiptId());
		attributes.put("replyTypeId", getReplyTypeId());
		attributes.put("categoryId", getCategoryId());
		attributes.put("subject", getSubject());
		attributes.put("content", getContent());
		attributes.put("dispatch", isDispatch());
		attributes.put("status", getStatus());
		attributes.put("approvedBy", getApprovedBy());

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

		String draftNo = (String)attributes.get("draftNo");

		if (draftNo != null) {
			setDraftNo(draftNo);
		}

		String nature = (String)attributes.get("nature");

		if (nature != null) {
			setNature(nature);
		}

		Long receiptId = (Long)attributes.get("receiptId");

		if (receiptId != null) {
			setReceiptId(receiptId);
		}

		Long replyTypeId = (Long)attributes.get("replyTypeId");

		if (replyTypeId != null) {
			setReplyTypeId(replyTypeId);
		}

		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Boolean dispatch = (Boolean)attributes.get("dispatch");

		if (dispatch != null) {
			setDispatch(dispatch);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String approvedBy = (String)attributes.get("approvedBy");

		if (approvedBy != null) {
			setApprovedBy(approvedBy);
		}
	}

	@Override
	public Draft cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the approved by of this draft.
	 *
	 * @return the approved by of this draft
	 */
	@Override
	public String getApprovedBy() {
		return model.getApprovedBy();
	}

	/**
	 * Returns the category ID of this draft.
	 *
	 * @return the category ID of this draft
	 */
	@Override
	public long getCategoryId() {
		return model.getCategoryId();
	}

	/**
	 * Returns the company ID of this draft.
	 *
	 * @return the company ID of this draft
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the content of this draft.
	 *
	 * @return the content of this draft
	 */
	@Override
	public String getContent() {
		return model.getContent();
	}

	/**
	 * Returns the create date of this draft.
	 *
	 * @return the create date of this draft
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the dispatch of this draft.
	 *
	 * @return the dispatch of this draft
	 */
	@Override
	public boolean getDispatch() {
		return model.getDispatch();
	}

	/**
	 * Returns the draft no of this draft.
	 *
	 * @return the draft no of this draft
	 */
	@Override
	public String getDraftNo() {
		return model.getDraftNo();
	}

	/**
	 * Returns the group ID of this draft.
	 *
	 * @return the group ID of this draft
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this draft.
	 *
	 * @return the ID of this draft
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the modified date of this draft.
	 *
	 * @return the modified date of this draft
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nature of this draft.
	 *
	 * @return the nature of this draft
	 */
	@Override
	public String getNature() {
		return model.getNature();
	}

	/**
	 * Returns the primary key of this draft.
	 *
	 * @return the primary key of this draft
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the receipt ID of this draft.
	 *
	 * @return the receipt ID of this draft
	 */
	@Override
	public long getReceiptId() {
		return model.getReceiptId();
	}

	/**
	 * Returns the reply type ID of this draft.
	 *
	 * @return the reply type ID of this draft
	 */
	@Override
	public long getReplyTypeId() {
		return model.getReplyTypeId();
	}

	/**
	 * Returns the status of this draft.
	 *
	 * @return the status of this draft
	 */
	@Override
	public String getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the subject of this draft.
	 *
	 * @return the subject of this draft
	 */
	@Override
	public String getSubject() {
		return model.getSubject();
	}

	/**
	 * Returns the user ID of this draft.
	 *
	 * @return the user ID of this draft
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this draft.
	 *
	 * @return the user name of this draft
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this draft.
	 *
	 * @return the user uuid of this draft
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this draft.
	 *
	 * @return the uuid of this draft
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this draft is dispatch.
	 *
	 * @return <code>true</code> if this draft is dispatch; <code>false</code> otherwise
	 */
	@Override
	public boolean isDispatch() {
		return model.isDispatch();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the approved by of this draft.
	 *
	 * @param approvedBy the approved by of this draft
	 */
	@Override
	public void setApprovedBy(String approvedBy) {
		model.setApprovedBy(approvedBy);
	}

	/**
	 * Sets the category ID of this draft.
	 *
	 * @param categoryId the category ID of this draft
	 */
	@Override
	public void setCategoryId(long categoryId) {
		model.setCategoryId(categoryId);
	}

	/**
	 * Sets the company ID of this draft.
	 *
	 * @param companyId the company ID of this draft
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the content of this draft.
	 *
	 * @param content the content of this draft
	 */
	@Override
	public void setContent(String content) {
		model.setContent(content);
	}

	/**
	 * Sets the create date of this draft.
	 *
	 * @param createDate the create date of this draft
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets whether this draft is dispatch.
	 *
	 * @param dispatch the dispatch of this draft
	 */
	@Override
	public void setDispatch(boolean dispatch) {
		model.setDispatch(dispatch);
	}

	/**
	 * Sets the draft no of this draft.
	 *
	 * @param draftNo the draft no of this draft
	 */
	@Override
	public void setDraftNo(String draftNo) {
		model.setDraftNo(draftNo);
	}

	/**
	 * Sets the group ID of this draft.
	 *
	 * @param groupId the group ID of this draft
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this draft.
	 *
	 * @param id the ID of this draft
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the modified date of this draft.
	 *
	 * @param modifiedDate the modified date of this draft
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nature of this draft.
	 *
	 * @param nature the nature of this draft
	 */
	@Override
	public void setNature(String nature) {
		model.setNature(nature);
	}

	/**
	 * Sets the primary key of this draft.
	 *
	 * @param primaryKey the primary key of this draft
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the receipt ID of this draft.
	 *
	 * @param receiptId the receipt ID of this draft
	 */
	@Override
	public void setReceiptId(long receiptId) {
		model.setReceiptId(receiptId);
	}

	/**
	 * Sets the reply type ID of this draft.
	 *
	 * @param replyTypeId the reply type ID of this draft
	 */
	@Override
	public void setReplyTypeId(long replyTypeId) {
		model.setReplyTypeId(replyTypeId);
	}

	/**
	 * Sets the status of this draft.
	 *
	 * @param status the status of this draft
	 */
	@Override
	public void setStatus(String status) {
		model.setStatus(status);
	}

	/**
	 * Sets the subject of this draft.
	 *
	 * @param subject the subject of this draft
	 */
	@Override
	public void setSubject(String subject) {
		model.setSubject(subject);
	}

	/**
	 * Sets the user ID of this draft.
	 *
	 * @param userId the user ID of this draft
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this draft.
	 *
	 * @param userName the user name of this draft
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this draft.
	 *
	 * @param userUuid the user uuid of this draft
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this draft.
	 *
	 * @param uuid the uuid of this draft
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
	protected DraftWrapper wrap(Draft draft) {
		return new DraftWrapper(draft);
	}

}