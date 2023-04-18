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
 * This class is a wrapper for {@link TertiaryHead}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TertiaryHead
 * @generated
 */
public class TertiaryHeadWrapper
	extends BaseModelWrapper<TertiaryHead>
	implements ModelWrapper<TertiaryHead>, TertiaryHead {

	public TertiaryHeadWrapper(TertiaryHead tertiaryHead) {
		super(tertiaryHead);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tertiaryHeadId", getTertiaryHeadId());
		attributes.put("tertiaryHeadvalue", getTertiaryHeadvalue());
		attributes.put("secondaryHeadId", getSecondaryHeadId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tertiaryHeadId = (Long)attributes.get("tertiaryHeadId");

		if (tertiaryHeadId != null) {
			setTertiaryHeadId(tertiaryHeadId);
		}

		String tertiaryHeadvalue = (String)attributes.get("tertiaryHeadvalue");

		if (tertiaryHeadvalue != null) {
			setTertiaryHeadvalue(tertiaryHeadvalue);
		}

		Long secondaryHeadId = (Long)attributes.get("secondaryHeadId");

		if (secondaryHeadId != null) {
			setSecondaryHeadId(secondaryHeadId);
		}
	}

	@Override
	public TertiaryHead cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the primary key of this tertiary head.
	 *
	 * @return the primary key of this tertiary head
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the secondary head ID of this tertiary head.
	 *
	 * @return the secondary head ID of this tertiary head
	 */
	@Override
	public long getSecondaryHeadId() {
		return model.getSecondaryHeadId();
	}

	/**
	 * Returns the tertiary head ID of this tertiary head.
	 *
	 * @return the tertiary head ID of this tertiary head
	 */
	@Override
	public long getTertiaryHeadId() {
		return model.getTertiaryHeadId();
	}

	/**
	 * Returns the tertiary headvalue of this tertiary head.
	 *
	 * @return the tertiary headvalue of this tertiary head
	 */
	@Override
	public String getTertiaryHeadvalue() {
		return model.getTertiaryHeadvalue();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the primary key of this tertiary head.
	 *
	 * @param primaryKey the primary key of this tertiary head
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the secondary head ID of this tertiary head.
	 *
	 * @param secondaryHeadId the secondary head ID of this tertiary head
	 */
	@Override
	public void setSecondaryHeadId(long secondaryHeadId) {
		model.setSecondaryHeadId(secondaryHeadId);
	}

	/**
	 * Sets the tertiary head ID of this tertiary head.
	 *
	 * @param tertiaryHeadId the tertiary head ID of this tertiary head
	 */
	@Override
	public void setTertiaryHeadId(long tertiaryHeadId) {
		model.setTertiaryHeadId(tertiaryHeadId);
	}

	/**
	 * Sets the tertiary headvalue of this tertiary head.
	 *
	 * @param tertiaryHeadvalue the tertiary headvalue of this tertiary head
	 */
	@Override
	public void setTertiaryHeadvalue(String tertiaryHeadvalue) {
		model.setTertiaryHeadvalue(tertiaryHeadvalue);
	}

	@Override
	protected TertiaryHeadWrapper wrap(TertiaryHead tertiaryHead) {
		return new TertiaryHeadWrapper(tertiaryHead);
	}

}