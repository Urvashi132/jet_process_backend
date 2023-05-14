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
 * This class is a wrapper for {@link DocumentNoteMapping}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentNoteMapping
 * @generated
 */
public class DocumentNoteMappingWrapper
	extends BaseModelWrapper<DocumentNoteMapping>
	implements DocumentNoteMapping, ModelWrapper<DocumentNoteMapping> {

	public DocumentNoteMappingWrapper(DocumentNoteMapping documentNoteMapping) {
		super(documentNoteMapping);
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
		attributes.put("noteDocumentId", getNoteDocumentId());
		attributes.put("noteId", getNoteId());

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

		Long noteDocumentId = (Long)attributes.get("noteDocumentId");

		if (noteDocumentId != null) {
			setNoteDocumentId(noteDocumentId);
		}

		Long noteId = (Long)attributes.get("noteId");

		if (noteId != null) {
			setNoteId(noteId);
		}
	}

	@Override
	public DocumentNoteMapping cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this document note mapping.
	 *
	 * @return the company ID of this document note mapping
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this document note mapping.
	 *
	 * @return the create date of this document note mapping
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this document note mapping.
	 *
	 * @return the group ID of this document note mapping
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this document note mapping.
	 *
	 * @return the ID of this document note mapping
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the modified date of this document note mapping.
	 *
	 * @return the modified date of this document note mapping
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the note document ID of this document note mapping.
	 *
	 * @return the note document ID of this document note mapping
	 */
	@Override
	public long getNoteDocumentId() {
		return model.getNoteDocumentId();
	}

	/**
	 * Returns the note ID of this document note mapping.
	 *
	 * @return the note ID of this document note mapping
	 */
	@Override
	public long getNoteId() {
		return model.getNoteId();
	}

	/**
	 * Returns the primary key of this document note mapping.
	 *
	 * @return the primary key of this document note mapping
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this document note mapping.
	 *
	 * @return the user ID of this document note mapping
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this document note mapping.
	 *
	 * @return the user name of this document note mapping
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this document note mapping.
	 *
	 * @return the user uuid of this document note mapping
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this document note mapping.
	 *
	 * @return the uuid of this document note mapping
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
	 * Sets the company ID of this document note mapping.
	 *
	 * @param companyId the company ID of this document note mapping
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this document note mapping.
	 *
	 * @param createDate the create date of this document note mapping
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this document note mapping.
	 *
	 * @param groupId the group ID of this document note mapping
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this document note mapping.
	 *
	 * @param id the ID of this document note mapping
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the modified date of this document note mapping.
	 *
	 * @param modifiedDate the modified date of this document note mapping
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the note document ID of this document note mapping.
	 *
	 * @param noteDocumentId the note document ID of this document note mapping
	 */
	@Override
	public void setNoteDocumentId(long noteDocumentId) {
		model.setNoteDocumentId(noteDocumentId);
	}

	/**
	 * Sets the note ID of this document note mapping.
	 *
	 * @param noteId the note ID of this document note mapping
	 */
	@Override
	public void setNoteId(long noteId) {
		model.setNoteId(noteId);
	}

	/**
	 * Sets the primary key of this document note mapping.
	 *
	 * @param primaryKey the primary key of this document note mapping
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this document note mapping.
	 *
	 * @param userId the user ID of this document note mapping
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this document note mapping.
	 *
	 * @param userName the user name of this document note mapping
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this document note mapping.
	 *
	 * @param userUuid the user uuid of this document note mapping
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this document note mapping.
	 *
	 * @param uuid the uuid of this document note mapping
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
	protected DocumentNoteMappingWrapper wrap(
		DocumentNoteMapping documentNoteMapping) {

		return new DocumentNoteMappingWrapper(documentNoteMapping);
	}

}