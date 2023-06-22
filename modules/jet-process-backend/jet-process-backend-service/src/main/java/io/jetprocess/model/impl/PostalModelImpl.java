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
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import io.jetprocess.model.Postal;
import io.jetprocess.model.PostalModel;
import io.jetprocess.model.PostalSoap;

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
 * The base model implementation for the Postal service. Represents a row in the &quot;JP_Postal&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PostalModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PostalImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PostalImpl
 * @generated
 */
@JSON(strict = true)
public class PostalModelImpl
	extends BaseModelImpl<Postal> implements PostalModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a postal model instance should use the <code>Postal</code> interface instead.
	 */
	public static final String TABLE_NAME = "JP_Postal";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"id_", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"postalMode", Types.VARCHAR}, {"postalCharge", Types.VARCHAR},
		{"medium", Types.VARCHAR}, {"weight", Types.VARCHAR},
		{"modeNo", Types.BIGINT}, {"peonBookNo", Types.VARCHAR},
		{"peonName", Types.VARCHAR}, {"outDate", Types.TIMESTAMP},
		{"deliveryDate", Types.TIMESTAMP}, {"deliveryStatus", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("postalMode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("postalCharge", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("medium", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("weight", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modeNo", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("peonBookNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("peonName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("outDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("deliveryDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("deliveryStatus", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table JP_Postal (uuid_ VARCHAR(75) null,id_ LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,postalMode VARCHAR(75) null,postalCharge VARCHAR(75) null,medium VARCHAR(75) null,weight VARCHAR(75) null,modeNo LONG,peonBookNo VARCHAR(75) null,peonName VARCHAR(75) null,outDate DATE null,deliveryDate DATE null,deliveryStatus VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table JP_Postal";

	public static final String ORDER_BY_JPQL = " ORDER BY postal.id ASC";

	public static final String ORDER_BY_SQL = " ORDER BY JP_Postal.id_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ID_COLUMN_BITMASK = 8L;

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
	public static Postal toModel(PostalSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Postal model = new PostalImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setPostalMode(soapModel.getPostalMode());
		model.setPostalCharge(soapModel.getPostalCharge());
		model.setMedium(soapModel.getMedium());
		model.setWeight(soapModel.getWeight());
		model.setModeNo(soapModel.getModeNo());
		model.setPeonBookNo(soapModel.getPeonBookNo());
		model.setPeonName(soapModel.getPeonName());
		model.setOutDate(soapModel.getOutDate());
		model.setDeliveryDate(soapModel.getDeliveryDate());
		model.setDeliveryStatus(soapModel.getDeliveryStatus());

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
	public static List<Postal> toModels(PostalSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Postal> models = new ArrayList<Postal>(soapModels.length);

		for (PostalSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public PostalModelImpl() {
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
		return Postal.class;
	}

	@Override
	public String getModelClassName() {
		return Postal.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Postal, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Postal, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Postal, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Postal)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Postal, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Postal, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Postal)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Postal, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Postal, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Postal>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Postal.class.getClassLoader(), Postal.class, ModelWrapper.class);

		try {
			Constructor<Postal> constructor =
				(Constructor<Postal>)proxyClass.getConstructor(
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

	private static final Map<String, Function<Postal, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Postal, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Postal, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Postal, Object>>();
		Map<String, BiConsumer<Postal, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Postal, ?>>();

		attributeGetterFunctions.put("uuid", Postal::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Postal, String>)Postal::setUuid);
		attributeGetterFunctions.put("id", Postal::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<Postal, Long>)Postal::setId);
		attributeGetterFunctions.put("groupId", Postal::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Postal, Long>)Postal::setGroupId);
		attributeGetterFunctions.put("companyId", Postal::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Postal, Long>)Postal::setCompanyId);
		attributeGetterFunctions.put("userId", Postal::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Postal, Long>)Postal::setUserId);
		attributeGetterFunctions.put("userName", Postal::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Postal, String>)Postal::setUserName);
		attributeGetterFunctions.put("createDate", Postal::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Postal, Date>)Postal::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Postal::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<Postal, Date>)Postal::setModifiedDate);
		attributeGetterFunctions.put("postalMode", Postal::getPostalMode);
		attributeSetterBiConsumers.put(
			"postalMode", (BiConsumer<Postal, String>)Postal::setPostalMode);
		attributeGetterFunctions.put("postalCharge", Postal::getPostalCharge);
		attributeSetterBiConsumers.put(
			"postalCharge",
			(BiConsumer<Postal, String>)Postal::setPostalCharge);
		attributeGetterFunctions.put("medium", Postal::getMedium);
		attributeSetterBiConsumers.put(
			"medium", (BiConsumer<Postal, String>)Postal::setMedium);
		attributeGetterFunctions.put("weight", Postal::getWeight);
		attributeSetterBiConsumers.put(
			"weight", (BiConsumer<Postal, String>)Postal::setWeight);
		attributeGetterFunctions.put("modeNo", Postal::getModeNo);
		attributeSetterBiConsumers.put(
			"modeNo", (BiConsumer<Postal, Long>)Postal::setModeNo);
		attributeGetterFunctions.put("peonBookNo", Postal::getPeonBookNo);
		attributeSetterBiConsumers.put(
			"peonBookNo", (BiConsumer<Postal, String>)Postal::setPeonBookNo);
		attributeGetterFunctions.put("peonName", Postal::getPeonName);
		attributeSetterBiConsumers.put(
			"peonName", (BiConsumer<Postal, String>)Postal::setPeonName);
		attributeGetterFunctions.put("outDate", Postal::getOutDate);
		attributeSetterBiConsumers.put(
			"outDate", (BiConsumer<Postal, Date>)Postal::setOutDate);
		attributeGetterFunctions.put("deliveryDate", Postal::getDeliveryDate);
		attributeSetterBiConsumers.put(
			"deliveryDate", (BiConsumer<Postal, Date>)Postal::setDeliveryDate);
		attributeGetterFunctions.put(
			"deliveryStatus", Postal::getDeliveryStatus);
		attributeSetterBiConsumers.put(
			"deliveryStatus",
			(BiConsumer<Postal, String>)Postal::setDeliveryStatus);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
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
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getPostalMode() {
		if (_postalMode == null) {
			return "";
		}
		else {
			return _postalMode;
		}
	}

	@Override
	public void setPostalMode(String postalMode) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_postalMode = postalMode;
	}

	@JSON
	@Override
	public String getPostalCharge() {
		if (_postalCharge == null) {
			return "";
		}
		else {
			return _postalCharge;
		}
	}

	@Override
	public void setPostalCharge(String postalCharge) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_postalCharge = postalCharge;
	}

	@JSON
	@Override
	public String getMedium() {
		if (_medium == null) {
			return "";
		}
		else {
			return _medium;
		}
	}

	@Override
	public void setMedium(String medium) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_medium = medium;
	}

	@JSON
	@Override
	public String getWeight() {
		if (_weight == null) {
			return "";
		}
		else {
			return _weight;
		}
	}

	@Override
	public void setWeight(String weight) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_weight = weight;
	}

	@JSON
	@Override
	public long getModeNo() {
		return _modeNo;
	}

	@Override
	public void setModeNo(long modeNo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modeNo = modeNo;
	}

	@JSON
	@Override
	public String getPeonBookNo() {
		if (_peonBookNo == null) {
			return "";
		}
		else {
			return _peonBookNo;
		}
	}

	@Override
	public void setPeonBookNo(String peonBookNo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_peonBookNo = peonBookNo;
	}

	@JSON
	@Override
	public String getPeonName() {
		if (_peonName == null) {
			return "";
		}
		else {
			return _peonName;
		}
	}

	@Override
	public void setPeonName(String peonName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_peonName = peonName;
	}

	@JSON
	@Override
	public Date getOutDate() {
		return _outDate;
	}

	@Override
	public void setOutDate(Date outDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_outDate = outDate;
	}

	@JSON
	@Override
	public Date getDeliveryDate() {
		return _deliveryDate;
	}

	@Override
	public void setDeliveryDate(Date deliveryDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_deliveryDate = deliveryDate;
	}

	@JSON
	@Override
	public String getDeliveryStatus() {
		if (_deliveryStatus == null) {
			return "";
		}
		else {
			return _deliveryStatus;
		}
	}

	@Override
	public void setDeliveryStatus(String deliveryStatus) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_deliveryStatus = deliveryStatus;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Postal.class.getName()));
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
			getCompanyId(), Postal.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Postal toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Postal>
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
		PostalImpl postalImpl = new PostalImpl();

		postalImpl.setUuid(getUuid());
		postalImpl.setId(getId());
		postalImpl.setGroupId(getGroupId());
		postalImpl.setCompanyId(getCompanyId());
		postalImpl.setUserId(getUserId());
		postalImpl.setUserName(getUserName());
		postalImpl.setCreateDate(getCreateDate());
		postalImpl.setModifiedDate(getModifiedDate());
		postalImpl.setPostalMode(getPostalMode());
		postalImpl.setPostalCharge(getPostalCharge());
		postalImpl.setMedium(getMedium());
		postalImpl.setWeight(getWeight());
		postalImpl.setModeNo(getModeNo());
		postalImpl.setPeonBookNo(getPeonBookNo());
		postalImpl.setPeonName(getPeonName());
		postalImpl.setOutDate(getOutDate());
		postalImpl.setDeliveryDate(getDeliveryDate());
		postalImpl.setDeliveryStatus(getDeliveryStatus());

		postalImpl.resetOriginalValues();

		return postalImpl;
	}

	@Override
	public Postal cloneWithOriginalValues() {
		PostalImpl postalImpl = new PostalImpl();

		postalImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		postalImpl.setId(this.<Long>getColumnOriginalValue("id_"));
		postalImpl.setGroupId(this.<Long>getColumnOriginalValue("groupId"));
		postalImpl.setCompanyId(this.<Long>getColumnOriginalValue("companyId"));
		postalImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		postalImpl.setUserName(this.<String>getColumnOriginalValue("userName"));
		postalImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		postalImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		postalImpl.setPostalMode(
			this.<String>getColumnOriginalValue("postalMode"));
		postalImpl.setPostalCharge(
			this.<String>getColumnOriginalValue("postalCharge"));
		postalImpl.setMedium(this.<String>getColumnOriginalValue("medium"));
		postalImpl.setWeight(this.<String>getColumnOriginalValue("weight"));
		postalImpl.setModeNo(this.<Long>getColumnOriginalValue("modeNo"));
		postalImpl.setPeonBookNo(
			this.<String>getColumnOriginalValue("peonBookNo"));
		postalImpl.setPeonName(this.<String>getColumnOriginalValue("peonName"));
		postalImpl.setOutDate(this.<Date>getColumnOriginalValue("outDate"));
		postalImpl.setDeliveryDate(
			this.<Date>getColumnOriginalValue("deliveryDate"));
		postalImpl.setDeliveryStatus(
			this.<String>getColumnOriginalValue("deliveryStatus"));

		return postalImpl;
	}

	@Override
	public int compareTo(Postal postal) {
		long primaryKey = postal.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Postal)) {
			return false;
		}

		Postal postal = (Postal)object;

		long primaryKey = postal.getPrimaryKey();

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

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Postal> toCacheModel() {
		PostalCacheModel postalCacheModel = new PostalCacheModel();

		postalCacheModel.uuid = getUuid();

		String uuid = postalCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			postalCacheModel.uuid = null;
		}

		postalCacheModel.id = getId();

		postalCacheModel.groupId = getGroupId();

		postalCacheModel.companyId = getCompanyId();

		postalCacheModel.userId = getUserId();

		postalCacheModel.userName = getUserName();

		String userName = postalCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			postalCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			postalCacheModel.createDate = createDate.getTime();
		}
		else {
			postalCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			postalCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			postalCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		postalCacheModel.postalMode = getPostalMode();

		String postalMode = postalCacheModel.postalMode;

		if ((postalMode != null) && (postalMode.length() == 0)) {
			postalCacheModel.postalMode = null;
		}

		postalCacheModel.postalCharge = getPostalCharge();

		String postalCharge = postalCacheModel.postalCharge;

		if ((postalCharge != null) && (postalCharge.length() == 0)) {
			postalCacheModel.postalCharge = null;
		}

		postalCacheModel.medium = getMedium();

		String medium = postalCacheModel.medium;

		if ((medium != null) && (medium.length() == 0)) {
			postalCacheModel.medium = null;
		}

		postalCacheModel.weight = getWeight();

		String weight = postalCacheModel.weight;

		if ((weight != null) && (weight.length() == 0)) {
			postalCacheModel.weight = null;
		}

		postalCacheModel.modeNo = getModeNo();

		postalCacheModel.peonBookNo = getPeonBookNo();

		String peonBookNo = postalCacheModel.peonBookNo;

		if ((peonBookNo != null) && (peonBookNo.length() == 0)) {
			postalCacheModel.peonBookNo = null;
		}

		postalCacheModel.peonName = getPeonName();

		String peonName = postalCacheModel.peonName;

		if ((peonName != null) && (peonName.length() == 0)) {
			postalCacheModel.peonName = null;
		}

		Date outDate = getOutDate();

		if (outDate != null) {
			postalCacheModel.outDate = outDate.getTime();
		}
		else {
			postalCacheModel.outDate = Long.MIN_VALUE;
		}

		Date deliveryDate = getDeliveryDate();

		if (deliveryDate != null) {
			postalCacheModel.deliveryDate = deliveryDate.getTime();
		}
		else {
			postalCacheModel.deliveryDate = Long.MIN_VALUE;
		}

		postalCacheModel.deliveryStatus = getDeliveryStatus();

		String deliveryStatus = postalCacheModel.deliveryStatus;

		if ((deliveryStatus != null) && (deliveryStatus.length() == 0)) {
			postalCacheModel.deliveryStatus = null;
		}

		return postalCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Postal, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Postal, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Postal, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Postal)this);

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
		Map<String, Function<Postal, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Postal, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Postal, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Postal)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Postal>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _postalMode;
	private String _postalCharge;
	private String _medium;
	private String _weight;
	private long _modeNo;
	private String _peonBookNo;
	private String _peonName;
	private Date _outDate;
	private Date _deliveryDate;
	private String _deliveryStatus;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Postal, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Postal)this);
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

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("id_", _id);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("postalMode", _postalMode);
		_columnOriginalValues.put("postalCharge", _postalCharge);
		_columnOriginalValues.put("medium", _medium);
		_columnOriginalValues.put("weight", _weight);
		_columnOriginalValues.put("modeNo", _modeNo);
		_columnOriginalValues.put("peonBookNo", _peonBookNo);
		_columnOriginalValues.put("peonName", _peonName);
		_columnOriginalValues.put("outDate", _outDate);
		_columnOriginalValues.put("deliveryDate", _deliveryDate);
		_columnOriginalValues.put("deliveryStatus", _deliveryStatus);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");
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

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("id_", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("postalMode", 256L);

		columnBitmasks.put("postalCharge", 512L);

		columnBitmasks.put("medium", 1024L);

		columnBitmasks.put("weight", 2048L);

		columnBitmasks.put("modeNo", 4096L);

		columnBitmasks.put("peonBookNo", 8192L);

		columnBitmasks.put("peonName", 16384L);

		columnBitmasks.put("outDate", 32768L);

		columnBitmasks.put("deliveryDate", 65536L);

		columnBitmasks.put("deliveryStatus", 131072L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Postal _escapedModel;

}