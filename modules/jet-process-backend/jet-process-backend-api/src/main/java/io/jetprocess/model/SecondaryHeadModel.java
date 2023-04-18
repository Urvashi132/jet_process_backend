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
 * The base model interface for the SecondaryHead service. Represents a row in the &quot;JP_SecondaryHead&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>io.jetprocess.model.impl.SecondaryHeadModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>io.jetprocess.model.impl.SecondaryHeadImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondaryHead
 * @generated
 */
@ProviderType
public interface SecondaryHeadModel
	extends BaseModel<SecondaryHead>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a secondary head model instance should use the {@link SecondaryHead} interface instead.
	 */

	/**
	 * Returns the primary key of this secondary head.
	 *
	 * @return the primary key of this secondary head
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this secondary head.
	 *
	 * @param primaryKey the primary key of this secondary head
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this secondary head.
	 *
	 * @return the uuid of this secondary head
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this secondary head.
	 *
	 * @param uuid the uuid of this secondary head
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the secondary head ID of this secondary head.
	 *
	 * @return the secondary head ID of this secondary head
	 */
	public long getSecondaryHeadId();

	/**
	 * Sets the secondary head ID of this secondary head.
	 *
	 * @param secondaryHeadId the secondary head ID of this secondary head
	 */
	public void setSecondaryHeadId(long secondaryHeadId);

	/**
	 * Returns the group ID of this secondary head.
	 *
	 * @return the group ID of this secondary head
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this secondary head.
	 *
	 * @param groupId the group ID of this secondary head
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this secondary head.
	 *
	 * @return the company ID of this secondary head
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this secondary head.
	 *
	 * @param companyId the company ID of this secondary head
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this secondary head.
	 *
	 * @return the user ID of this secondary head
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this secondary head.
	 *
	 * @param userId the user ID of this secondary head
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this secondary head.
	 *
	 * @return the user uuid of this secondary head
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this secondary head.
	 *
	 * @param userUuid the user uuid of this secondary head
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this secondary head.
	 *
	 * @return the user name of this secondary head
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this secondary head.
	 *
	 * @param userName the user name of this secondary head
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this secondary head.
	 *
	 * @return the create date of this secondary head
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this secondary head.
	 *
	 * @param createDate the create date of this secondary head
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this secondary head.
	 *
	 * @return the modified date of this secondary head
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this secondary head.
	 *
	 * @param modifiedDate the modified date of this secondary head
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the secondary head value of this secondary head.
	 *
	 * @return the secondary head value of this secondary head
	 */
	@AutoEscape
	public String getSecondaryHeadValue();

	/**
	 * Sets the secondary head value of this secondary head.
	 *
	 * @param secondaryHeadValue the secondary head value of this secondary head
	 */
	public void setSecondaryHeadValue(String secondaryHeadValue);

	/**
	 * Returns the primary head ID of this secondary head.
	 *
	 * @return the primary head ID of this secondary head
	 */
	public long getPrimaryHeadId();

	/**
	 * Sets the primary head ID of this secondary head.
	 *
	 * @param primaryHeadId the primary head ID of this secondary head
	 */
	public void setPrimaryHeadId(long primaryHeadId);

	@Override
	public SecondaryHead cloneWithOriginalValues();

}