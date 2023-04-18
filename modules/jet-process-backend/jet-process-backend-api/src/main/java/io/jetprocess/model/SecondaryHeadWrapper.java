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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SecondaryHead}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondaryHead
 * @generated
 */
public class SecondaryHeadWrapper
	extends BaseModelWrapper<SecondaryHead>
	implements ModelWrapper<SecondaryHead>, SecondaryHead {

	public SecondaryHeadWrapper(SecondaryHead secondaryHead) {
		super(secondaryHead);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("secondaryHeadId", getSecondaryHeadId());
		attributes.put("secondaryHeadValue", getSecondaryHeadValue());
		attributes.put("primaryHeadId", getPrimaryHeadId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long secondaryHeadId = (Long)attributes.get("secondaryHeadId");

		if (secondaryHeadId != null) {
			setSecondaryHeadId(secondaryHeadId);
		}

		String secondaryHeadValue = (String)attributes.get(
			"secondaryHeadValue");

		if (secondaryHeadValue != null) {
			setSecondaryHeadValue(secondaryHeadValue);
		}

		Long primaryHeadId = (Long)attributes.get("primaryHeadId");

		if (primaryHeadId != null) {
			setPrimaryHeadId(primaryHeadId);
		}
	}

	@Override
	public SecondaryHead cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the primary head ID of this secondary head.
	 *
	 * @return the primary head ID of this secondary head
	 */
	@Override
	public long getPrimaryHeadId() {
		return model.getPrimaryHeadId();
	}

	/**
	 * Returns the primary key of this secondary head.
	 *
	 * @return the primary key of this secondary head
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the secondary head ID of this secondary head.
	 *
	 * @return the secondary head ID of this secondary head
	 */
	@Override
	public long getSecondaryHeadId() {
		return model.getSecondaryHeadId();
	}

	/**
	 * Returns the secondary head value of this secondary head.
	 *
	 * @return the secondary head value of this secondary head
	 */
	@Override
	public String getSecondaryHeadValue() {
		return model.getSecondaryHeadValue();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the primary head ID of this secondary head.
	 *
	 * @param primaryHeadId the primary head ID of this secondary head
	 */
	@Override
	public void setPrimaryHeadId(long primaryHeadId) {
		model.setPrimaryHeadId(primaryHeadId);
	}

	/**
	 * Sets the primary key of this secondary head.
	 *
	 * @param primaryKey the primary key of this secondary head
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the secondary head ID of this secondary head.
	 *
	 * @param secondaryHeadId the secondary head ID of this secondary head
	 */
	@Override
	public void setSecondaryHeadId(long secondaryHeadId) {
		model.setSecondaryHeadId(secondaryHeadId);
	}

	/**
	 * Sets the secondary head value of this secondary head.
	 *
	 * @param secondaryHeadValue the secondary head value of this secondary head
	 */
	@Override
	public void setSecondaryHeadValue(String secondaryHeadValue) {
		model.setSecondaryHeadValue(secondaryHeadValue);
	}

	@Override
	protected SecondaryHeadWrapper wrap(SecondaryHead secondaryHead) {
		return new SecondaryHeadWrapper(secondaryHead);
	}

}