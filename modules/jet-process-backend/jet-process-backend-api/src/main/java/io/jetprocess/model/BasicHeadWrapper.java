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
 * This class is a wrapper for {@link BasicHead}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BasicHead
 * @generated
 */
public class BasicHeadWrapper
	extends BaseModelWrapper<BasicHead>
	implements BasicHead, ModelWrapper<BasicHead> {

	public BasicHeadWrapper(BasicHead basicHead) {
		super(basicHead);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("basicHeadId", getBasicHeadId());
		attributes.put("basicHeadValue", getBasicHeadValue());
		attributes.put("basicHeadCode", getBasicHeadCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long basicHeadId = (Long)attributes.get("basicHeadId");

		if (basicHeadId != null) {
			setBasicHeadId(basicHeadId);
		}

		String basicHeadValue = (String)attributes.get("basicHeadValue");

		if (basicHeadValue != null) {
			setBasicHeadValue(basicHeadValue);
		}

		Long basicHeadCode = (Long)attributes.get("basicHeadCode");

		if (basicHeadCode != null) {
			setBasicHeadCode(basicHeadCode);
		}
	}

	@Override
	public BasicHead cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the basic head code of this basic head.
	 *
	 * @return the basic head code of this basic head
	 */
	@Override
	public long getBasicHeadCode() {
		return model.getBasicHeadCode();
	}

	/**
	 * Returns the basic head ID of this basic head.
	 *
	 * @return the basic head ID of this basic head
	 */
	@Override
	public long getBasicHeadId() {
		return model.getBasicHeadId();
	}

	/**
	 * Returns the basic head value of this basic head.
	 *
	 * @return the basic head value of this basic head
	 */
	@Override
	public String getBasicHeadValue() {
		return model.getBasicHeadValue();
	}

	/**
	 * Returns the primary key of this basic head.
	 *
	 * @return the primary key of this basic head
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the basic head code of this basic head.
	 *
	 * @param basicHeadCode the basic head code of this basic head
	 */
	@Override
	public void setBasicHeadCode(long basicHeadCode) {
		model.setBasicHeadCode(basicHeadCode);
	}

	/**
	 * Sets the basic head ID of this basic head.
	 *
	 * @param basicHeadId the basic head ID of this basic head
	 */
	@Override
	public void setBasicHeadId(long basicHeadId) {
		model.setBasicHeadId(basicHeadId);
	}

	/**
	 * Sets the basic head value of this basic head.
	 *
	 * @param basicHeadValue the basic head value of this basic head
	 */
	@Override
	public void setBasicHeadValue(String basicHeadValue) {
		model.setBasicHeadValue(basicHeadValue);
	}

	/**
	 * Sets the primary key of this basic head.
	 *
	 * @param primaryKey the primary key of this basic head
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected BasicHeadWrapper wrap(BasicHead basicHead) {
		return new BasicHeadWrapper(basicHead);
	}

}