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

package io.jetprocess.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import io.jetprocess.model.SecondaryHead;
import io.jetprocess.model.SecondaryHeadModel;
import io.jetprocess.model.SecondaryHeadSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the SecondaryHead service. Represents a row in the &quot;JP_SecondaryHead&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SecondaryHeadModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SecondaryHeadImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondaryHeadImpl
 * @generated
 */
@JSON(strict = true)
public class SecondaryHeadModelImpl
	extends BaseModelImpl<SecondaryHead> implements SecondaryHeadModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a secondary head model instance should use the <code>SecondaryHead</code> interface instead.
	 */
	public static final String TABLE_NAME = "JP_SecondaryHead";

	public static final Object[][] TABLE_COLUMNS = {
		{"id_", Types.BIGINT}, {"name", Types.VARCHAR},
		{"primaryHeadId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("primaryHeadId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table JP_SecondaryHead (id_ LONG not null primary key,name VARCHAR(255) null,primaryHeadId LONG)";

	public static final String TABLE_SQL_DROP = "drop table JP_SecondaryHead";

	public static final String ORDER_BY_JPQL = " ORDER BY secondaryHead.id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY JP_SecondaryHead.id_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long PRIMARYHEADID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static SecondaryHead toModel(SecondaryHeadSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		SecondaryHead model = new SecondaryHeadImpl();

		model.setId(soapModel.getId());
		model.setName(soapModel.getName());
		model.setPrimaryHeadId(soapModel.getPrimaryHeadId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<SecondaryHead> toModels(SecondaryHeadSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<SecondaryHead> models = new ArrayList<SecondaryHead>(
			soapModels.length);

		for (SecondaryHeadSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public SecondaryHeadModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SecondaryHead.class;
	}

	@Override
	public String getModelClassName() {
		return SecondaryHead.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SecondaryHead, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SecondaryHead, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SecondaryHead, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SecondaryHead)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SecondaryHead, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SecondaryHead, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SecondaryHead)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SecondaryHead, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SecondaryHead, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, SecondaryHead>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			SecondaryHead.class.getClassLoader(), SecondaryHead.class,
			ModelWrapper.class);

		try {
			Constructor<SecondaryHead> constructor =
				(Constructor<SecondaryHead>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<SecondaryHead, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<SecondaryHead, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<SecondaryHead, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<SecondaryHead, Object>>();
		Map<String, BiConsumer<SecondaryHead, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<SecondaryHead, ?>>();

		attributeGetterFunctions.put("id", SecondaryHead::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<SecondaryHead, Long>)SecondaryHead::setId);
		attributeGetterFunctions.put("name", SecondaryHead::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<SecondaryHead, String>)SecondaryHead::setName);
		attributeGetterFunctions.put(
			"primaryHeadId", SecondaryHead::getPrimaryHeadId);
		attributeSetterBiConsumers.put(
			"primaryHeadId",
			(BiConsumer<SecondaryHead, Long>)SecondaryHead::setPrimaryHeadId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_id = id;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	@JSON
	@Override
	public long getPrimaryHeadId() {
		return _primaryHeadId;
	}

	@Override
	public void setPrimaryHeadId(long primaryHeadId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_primaryHeadId = primaryHeadId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalPrimaryHeadId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("primaryHeadId"));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, SecondaryHead.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SecondaryHead toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SecondaryHead>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SecondaryHeadImpl secondaryHeadImpl = new SecondaryHeadImpl();

		secondaryHeadImpl.setId(getId());
		secondaryHeadImpl.setName(getName());
		secondaryHeadImpl.setPrimaryHeadId(getPrimaryHeadId());

		secondaryHeadImpl.resetOriginalValues();

		return secondaryHeadImpl;
	}

	@Override
	public SecondaryHead cloneWithOriginalValues() {
		SecondaryHeadImpl secondaryHeadImpl = new SecondaryHeadImpl();

		secondaryHeadImpl.setId(this.<Long>getColumnOriginalValue("id_"));
		secondaryHeadImpl.setName(this.<String>getColumnOriginalValue("name"));
		secondaryHeadImpl.setPrimaryHeadId(
			this.<Long>getColumnOriginalValue("primaryHeadId"));

		return secondaryHeadImpl;
	}

	@Override
	public int compareTo(SecondaryHead secondaryHead) {
		int value = 0;

		if (getId() < secondaryHead.getId()) {
			value = -1;
		}
		else if (getId() > secondaryHead.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SecondaryHead)) {
			return false;
		}

		SecondaryHead secondaryHead = (SecondaryHead)object;

		long primaryKey = secondaryHead.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<SecondaryHead> toCacheModel() {
		SecondaryHeadCacheModel secondaryHeadCacheModel =
			new SecondaryHeadCacheModel();

		secondaryHeadCacheModel.id = getId();

		secondaryHeadCacheModel.name = getName();

		String name = secondaryHeadCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			secondaryHeadCacheModel.name = null;
		}

		secondaryHeadCacheModel.primaryHeadId = getPrimaryHeadId();

		return secondaryHeadCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SecondaryHead, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SecondaryHead, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SecondaryHead, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((SecondaryHead)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<SecondaryHead, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<SecondaryHead, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SecondaryHead, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((SecondaryHead)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, SecondaryHead>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private long _id;
	private String _name;
	private long _primaryHeadId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<SecondaryHead, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SecondaryHead)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("id_", _id);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("primaryHeadId", _primaryHeadId);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("id_", "id");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("id_", 1L);

		columnBitmasks.put("name", 2L);

		columnBitmasks.put("primaryHeadId", 4L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SecondaryHead _escapedModel;

}