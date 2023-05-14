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

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("code", getCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Long code = (Long)attributes.get("code");

		if (code != null) {
			setCode(code);
		}
	}

	@Override
	public BasicHead cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the code of this basic head.
	 *
	 * @return the code of this basic head
	 */
	@Override
	public long getCode() {
		return model.getCode();
	}

	/**
	 * Returns the ID of this basic head.
	 *
	 * @return the ID of this basic head
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the name of this basic head.
	 *
	 * @return the name of this basic head
	 */
	@Override
	public String getName() {
		return model.getName();
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
	 * Sets the code of this basic head.
	 *
	 * @param code the code of this basic head
	 */
	@Override
	public void setCode(long code) {
		model.setCode(code);
	}

	/**
	 * Sets the ID of this basic head.
	 *
	 * @param id the ID of this basic head
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the name of this basic head.
	 *
	 * @param name the name of this basic head
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
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