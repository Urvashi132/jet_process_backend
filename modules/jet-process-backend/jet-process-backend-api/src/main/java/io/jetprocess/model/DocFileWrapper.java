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
 * This class is a wrapper for {@link DocFile}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocFile
 * @generated
 */
public class DocFileWrapper
	extends BaseModelWrapper<DocFile>
	implements DocFile, ModelWrapper<DocFile> {

	public DocFileWrapper(DocFile docFile) {
		super(docFile);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("docFileId", getDocFileId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nature", getNature());
		attributes.put("type", getType());
		attributes.put("headId", getHeadId());
		attributes.put("fileCodeId", getFileCodeId());
		attributes.put("subject", getSubject());
		attributes.put("fileNo", getFileNo());
		attributes.put("categoryId", getCategoryId());
		attributes.put("remarks", getRemarks());
		attributes.put("reference", getReference());
		attributes.put("year", getYear());
		attributes.put("userPostId", getUserPostId());
		attributes.put("currentUser", getCurrentUser());
		attributes.put("currentState", getCurrentState());
		attributes.put("dealingOrganizationId", getDealingOrganizationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long docFileId = (Long)attributes.get("docFileId");

		if (docFileId != null) {
			setDocFileId(docFileId);
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

		String nature = (String)attributes.get("nature");

		if (nature != null) {
			setNature(nature);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		Long headId = (Long)attributes.get("headId");

		if (headId != null) {
			setHeadId(headId);
		}

		Long fileCodeId = (Long)attributes.get("fileCodeId");

		if (fileCodeId != null) {
			setFileCodeId(fileCodeId);
		}

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		String fileNo = (String)attributes.get("fileNo");

		if (fileNo != null) {
			setFileNo(fileNo);
		}

		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		String reference = (String)attributes.get("reference");

		if (reference != null) {
			setReference(reference);
		}

		Long year = (Long)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Long userPostId = (Long)attributes.get("userPostId");

		if (userPostId != null) {
			setUserPostId(userPostId);
		}

		Long currentUser = (Long)attributes.get("currentUser");

		if (currentUser != null) {
			setCurrentUser(currentUser);
		}

		Integer currentState = (Integer)attributes.get("currentState");

		if (currentState != null) {
			setCurrentState(currentState);
		}

		Long dealingOrganizationId = (Long)attributes.get(
			"dealingOrganizationId");

		if (dealingOrganizationId != null) {
			setDealingOrganizationId(dealingOrganizationId);
		}
	}

	@Override
	public DocFile cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the category ID of this doc file.
	 *
	 * @return the category ID of this doc file
	 */
	@Override
	public long getCategoryId() {
		return model.getCategoryId();
	}

	/**
	 * Returns the company ID of this doc file.
	 *
	 * @return the company ID of this doc file
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this doc file.
	 *
	 * @return the create date of this doc file
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the current state of this doc file.
	 *
	 * @return the current state of this doc file
	 */
	@Override
	public int getCurrentState() {
		return model.getCurrentState();
	}

	/**
	 * Returns the current user of this doc file.
	 *
	 * @return the current user of this doc file
	 */
	@Override
	public long getCurrentUser() {
		return model.getCurrentUser();
	}

	/**
	 * Returns the dealing organization ID of this doc file.
	 *
	 * @return the dealing organization ID of this doc file
	 */
	@Override
	public long getDealingOrganizationId() {
		return model.getDealingOrganizationId();
	}

	/**
	 * Returns the doc file ID of this doc file.
	 *
	 * @return the doc file ID of this doc file
	 */
	@Override
	public long getDocFileId() {
		return model.getDocFileId();
	}

	/**
	 * Returns the file code ID of this doc file.
	 *
	 * @return the file code ID of this doc file
	 */
	@Override
	public long getFileCodeId() {
		return model.getFileCodeId();
	}

	/**
	 * Returns the file no of this doc file.
	 *
	 * @return the file no of this doc file
	 */
	@Override
	public String getFileNo() {
		return model.getFileNo();
	}

	/**
	 * Returns the group ID of this doc file.
	 *
	 * @return the group ID of this doc file
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the head ID of this doc file.
	 *
	 * @return the head ID of this doc file
	 */
	@Override
	public long getHeadId() {
		return model.getHeadId();
	}

	/**
	 * Returns the modified date of this doc file.
	 *
	 * @return the modified date of this doc file
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nature of this doc file.
	 *
	 * @return the nature of this doc file
	 */
	@Override
	public String getNature() {
		return model.getNature();
	}

	/**
	 * Returns the primary key of this doc file.
	 *
	 * @return the primary key of this doc file
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the reference of this doc file.
	 *
	 * @return the reference of this doc file
	 */
	@Override
	public String getReference() {
		return model.getReference();
	}

	/**
	 * Returns the remarks of this doc file.
	 *
	 * @return the remarks of this doc file
	 */
	@Override
	public String getRemarks() {
		return model.getRemarks();
	}

	/**
	 * Returns the subject of this doc file.
	 *
	 * @return the subject of this doc file
	 */
	@Override
	public String getSubject() {
		return model.getSubject();
	}

	/**
	 * Returns the type of this doc file.
	 *
	 * @return the type of this doc file
	 */
	@Override
	public String getType() {
		return model.getType();
	}

	/**
	 * Returns the user ID of this doc file.
	 *
	 * @return the user ID of this doc file
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this doc file.
	 *
	 * @return the user name of this doc file
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user post ID of this doc file.
	 *
	 * @return the user post ID of this doc file
	 */
	@Override
	public long getUserPostId() {
		return model.getUserPostId();
	}

	/**
	 * Returns the user uuid of this doc file.
	 *
	 * @return the user uuid of this doc file
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this doc file.
	 *
	 * @return the uuid of this doc file
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the year of this doc file.
	 *
	 * @return the year of this doc file
	 */
	@Override
	public long getYear() {
		return model.getYear();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the category ID of this doc file.
	 *
	 * @param categoryId the category ID of this doc file
	 */
	@Override
	public void setCategoryId(long categoryId) {
		model.setCategoryId(categoryId);
	}

	/**
	 * Sets the company ID of this doc file.
	 *
	 * @param companyId the company ID of this doc file
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this doc file.
	 *
	 * @param createDate the create date of this doc file
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the current state of this doc file.
	 *
	 * @param currentState the current state of this doc file
	 */
	@Override
	public void setCurrentState(int currentState) {
		model.setCurrentState(currentState);
	}

	/**
	 * Sets the current user of this doc file.
	 *
	 * @param currentUser the current user of this doc file
	 */
	@Override
	public void setCurrentUser(long currentUser) {
		model.setCurrentUser(currentUser);
	}

	/**
	 * Sets the dealing organization ID of this doc file.
	 *
	 * @param dealingOrganizationId the dealing organization ID of this doc file
	 */
	@Override
	public void setDealingOrganizationId(long dealingOrganizationId) {
		model.setDealingOrganizationId(dealingOrganizationId);
	}

	/**
	 * Sets the doc file ID of this doc file.
	 *
	 * @param docFileId the doc file ID of this doc file
	 */
	@Override
	public void setDocFileId(long docFileId) {
		model.setDocFileId(docFileId);
	}

	/**
	 * Sets the file code ID of this doc file.
	 *
	 * @param fileCodeId the file code ID of this doc file
	 */
	@Override
	public void setFileCodeId(long fileCodeId) {
		model.setFileCodeId(fileCodeId);
	}

	/**
	 * Sets the file no of this doc file.
	 *
	 * @param fileNo the file no of this doc file
	 */
	@Override
	public void setFileNo(String fileNo) {
		model.setFileNo(fileNo);
	}

	/**
	 * Sets the group ID of this doc file.
	 *
	 * @param groupId the group ID of this doc file
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the head ID of this doc file.
	 *
	 * @param headId the head ID of this doc file
	 */
	@Override
	public void setHeadId(long headId) {
		model.setHeadId(headId);
	}

	/**
	 * Sets the modified date of this doc file.
	 *
	 * @param modifiedDate the modified date of this doc file
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nature of this doc file.
	 *
	 * @param nature the nature of this doc file
	 */
	@Override
	public void setNature(String nature) {
		model.setNature(nature);
	}

	/**
	 * Sets the primary key of this doc file.
	 *
	 * @param primaryKey the primary key of this doc file
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the reference of this doc file.
	 *
	 * @param reference the reference of this doc file
	 */
	@Override
	public void setReference(String reference) {
		model.setReference(reference);
	}

	/**
	 * Sets the remarks of this doc file.
	 *
	 * @param remarks the remarks of this doc file
	 */
	@Override
	public void setRemarks(String remarks) {
		model.setRemarks(remarks);
	}

	/**
	 * Sets the subject of this doc file.
	 *
	 * @param subject the subject of this doc file
	 */
	@Override
	public void setSubject(String subject) {
		model.setSubject(subject);
	}

	/**
	 * Sets the type of this doc file.
	 *
	 * @param type the type of this doc file
	 */
	@Override
	public void setType(String type) {
		model.setType(type);
	}

	/**
	 * Sets the user ID of this doc file.
	 *
	 * @param userId the user ID of this doc file
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this doc file.
	 *
	 * @param userName the user name of this doc file
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user post ID of this doc file.
	 *
	 * @param userPostId the user post ID of this doc file
	 */
	@Override
	public void setUserPostId(long userPostId) {
		model.setUserPostId(userPostId);
	}

	/**
	 * Sets the user uuid of this doc file.
	 *
	 * @param userUuid the user uuid of this doc file
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this doc file.
	 *
	 * @param uuid the uuid of this doc file
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the year of this doc file.
	 *
	 * @param year the year of this doc file
	 */
	@Override
	public void setYear(long year) {
		model.setYear(year);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected DocFileWrapper wrap(DocFile docFile) {
		return new DocFileWrapper(docFile);
	}

}