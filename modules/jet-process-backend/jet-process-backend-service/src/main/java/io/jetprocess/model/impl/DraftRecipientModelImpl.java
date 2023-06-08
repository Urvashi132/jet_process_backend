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

import io.jetprocess.model.DraftRecipient;
import io.jetprocess.model.DraftRecipientModel;
import io.jetprocess.model.DraftRecipientSoap;

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
 * The base model implementation for the DraftRecipient service. Represents a row in the &quot;JP_DraftRecipient&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>DraftRecipientModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DraftRecipientImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DraftRecipientImpl
 * @generated
 */
@JSON(strict = true)
public class DraftRecipientModelImpl
	extends BaseModelImpl<DraftRecipient> implements DraftRecipientModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a draft recipient model instance should use the <code>DraftRecipient</code> interface instead.
	 */
	public static final String TABLE_NAME = "JP_DraftRecipient";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"id_", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"draftId", Types.BIGINT}, {"organizationId", Types.BIGINT},
		{"name", Types.VARCHAR}, {"designation", Types.VARCHAR},
		{"email", Types.VARCHAR}, {"mobile", Types.VARCHAR},
		{"address", Types.VARCHAR}, {"stateId", Types.BIGINT},
		{"city", Types.VARCHAR}, {"pinCode", Types.VARCHAR}
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
		TABLE_COLUMNS_MAP.put("draftId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("organizationId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("designation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mobile", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("stateId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("city", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("pinCode", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table JP_DraftRecipient (uuid_ VARCHAR(75) null,id_ LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,draftId LONG,organizationId LONG,name VARCHAR(75) null,designation VARCHAR(75) null,email VARCHAR(75) null,mobile VARCHAR(75) null,address VARCHAR(75) null,stateId LONG,city VARCHAR(75) null,pinCode VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table JP_DraftRecipient";

	public static final String ORDER_BY_JPQL =
		" ORDER BY draftRecipient.id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY JP_DraftRecipient.id_ ASC";

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
	public static final long DRAFTID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long ID_COLUMN_BITMASK = 16L;

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
	public static DraftRecipient toModel(DraftRecipientSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DraftRecipient model = new DraftRecipientImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDraftId(soapModel.getDraftId());
		model.setOrganizationId(soapModel.getOrganizationId());
		model.setName(soapModel.getName());
		model.setDesignation(soapModel.getDesignation());
		model.setEmail(soapModel.getEmail());
		model.setMobile(soapModel.getMobile());
		model.setAddress(soapModel.getAddress());
		model.setStateId(soapModel.getStateId());
		model.setCity(soapModel.getCity());
		model.setPinCode(soapModel.getPinCode());

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
	public static List<DraftRecipient> toModels(
		DraftRecipientSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<DraftRecipient> models = new ArrayList<DraftRecipient>(
			soapModels.length);

		for (DraftRecipientSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public DraftRecipientModelImpl() {
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
		return DraftRecipient.class;
	}

	@Override
	public String getModelClassName() {
		return DraftRecipient.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<DraftRecipient, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<DraftRecipient, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DraftRecipient, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((DraftRecipient)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<DraftRecipient, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<DraftRecipient, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(DraftRecipient)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<DraftRecipient, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<DraftRecipient, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, DraftRecipient>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			DraftRecipient.class.getClassLoader(), DraftRecipient.class,
			ModelWrapper.class);

		try {
			Constructor<DraftRecipient> constructor =
				(Constructor<DraftRecipient>)proxyClass.getConstructor(
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

	private static final Map<String, Function<DraftRecipient, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<DraftRecipient, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<DraftRecipient, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<DraftRecipient, Object>>();
		Map<String, BiConsumer<DraftRecipient, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<DraftRecipient, ?>>();

		attributeGetterFunctions.put("uuid", DraftRecipient::getUuid);
		attributeSetterBiConsumers.put(
			"uuid",
			(BiConsumer<DraftRecipient, String>)DraftRecipient::setUuid);
		attributeGetterFunctions.put("id", DraftRecipient::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<DraftRecipient, Long>)DraftRecipient::setId);
		attributeGetterFunctions.put("groupId", DraftRecipient::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<DraftRecipient, Long>)DraftRecipient::setGroupId);
		attributeGetterFunctions.put("companyId", DraftRecipient::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<DraftRecipient, Long>)DraftRecipient::setCompanyId);
		attributeGetterFunctions.put("userId", DraftRecipient::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<DraftRecipient, Long>)DraftRecipient::setUserId);
		attributeGetterFunctions.put("userName", DraftRecipient::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<DraftRecipient, String>)DraftRecipient::setUserName);
		attributeGetterFunctions.put(
			"createDate", DraftRecipient::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<DraftRecipient, Date>)DraftRecipient::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", DraftRecipient::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<DraftRecipient, Date>)DraftRecipient::setModifiedDate);
		attributeGetterFunctions.put("draftId", DraftRecipient::getDraftId);
		attributeSetterBiConsumers.put(
			"draftId",
			(BiConsumer<DraftRecipient, Long>)DraftRecipient::setDraftId);
		attributeGetterFunctions.put(
			"organizationId", DraftRecipient::getOrganizationId);
		attributeSetterBiConsumers.put(
			"organizationId",
			(BiConsumer<DraftRecipient, Long>)
				DraftRecipient::setOrganizationId);
		attributeGetterFunctions.put("name", DraftRecipient::getName);
		attributeSetterBiConsumers.put(
			"name",
			(BiConsumer<DraftRecipient, String>)DraftRecipient::setName);
		attributeGetterFunctions.put(
			"designation", DraftRecipient::getDesignation);
		attributeSetterBiConsumers.put(
			"designation",
			(BiConsumer<DraftRecipient, String>)DraftRecipient::setDesignation);
		attributeGetterFunctions.put("email", DraftRecipient::getEmail);
		attributeSetterBiConsumers.put(
			"email",
			(BiConsumer<DraftRecipient, String>)DraftRecipient::setEmail);
		attributeGetterFunctions.put("mobile", DraftRecipient::getMobile);
		attributeSetterBiConsumers.put(
			"mobile",
			(BiConsumer<DraftRecipient, String>)DraftRecipient::setMobile);
		attributeGetterFunctions.put("address", DraftRecipient::getAddress);
		attributeSetterBiConsumers.put(
			"address",
			(BiConsumer<DraftRecipient, String>)DraftRecipient::setAddress);
		attributeGetterFunctions.put("stateId", DraftRecipient::getStateId);
		attributeSetterBiConsumers.put(
			"stateId",
			(BiConsumer<DraftRecipient, Long>)DraftRecipient::setStateId);
		attributeGetterFunctions.put("city", DraftRecipient::getCity);
		attributeSetterBiConsumers.put(
			"city",
			(BiConsumer<DraftRecipient, String>)DraftRecipient::setCity);
		attributeGetterFunctions.put("pinCode", DraftRecipient::getPinCode);
		attributeSetterBiConsumers.put(
			"pinCode",
			(BiConsumer<DraftRecipient, String>)DraftRecipient::setPinCode);

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
	public long getDraftId() {
		return _draftId;
	}

	@Override
	public void setDraftId(long draftId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_draftId = draftId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalDraftId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("draftId"));
	}

	@JSON
	@Override
	public long getOrganizationId() {
		return _organizationId;
	}

	@Override
	public void setOrganizationId(long organizationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_organizationId = organizationId;
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
	public String getDesignation() {
		if (_designation == null) {
			return "";
		}
		else {
			return _designation;
		}
	}

	@Override
	public void setDesignation(String designation) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_designation = designation;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return "";
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_email = email;
	}

	@JSON
	@Override
	public String getMobile() {
		if (_mobile == null) {
			return "";
		}
		else {
			return _mobile;
		}
	}

	@Override
	public void setMobile(String mobile) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_mobile = mobile;
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return "";
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_address = address;
	}

	@JSON
	@Override
	public long getStateId() {
		return _stateId;
	}

	@Override
	public void setStateId(long stateId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_stateId = stateId;
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return "";
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_city = city;
	}

	@JSON
	@Override
	public String getPinCode() {
		if (_pinCode == null) {
			return "";
		}
		else {
			return _pinCode;
		}
	}

	@Override
	public void setPinCode(String pinCode) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_pinCode = pinCode;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(DraftRecipient.class.getName()));
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
			getCompanyId(), DraftRecipient.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DraftRecipient toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, DraftRecipient>
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
		DraftRecipientImpl draftRecipientImpl = new DraftRecipientImpl();

		draftRecipientImpl.setUuid(getUuid());
		draftRecipientImpl.setId(getId());
		draftRecipientImpl.setGroupId(getGroupId());
		draftRecipientImpl.setCompanyId(getCompanyId());
		draftRecipientImpl.setUserId(getUserId());
		draftRecipientImpl.setUserName(getUserName());
		draftRecipientImpl.setCreateDate(getCreateDate());
		draftRecipientImpl.setModifiedDate(getModifiedDate());
		draftRecipientImpl.setDraftId(getDraftId());
		draftRecipientImpl.setOrganizationId(getOrganizationId());
		draftRecipientImpl.setName(getName());
		draftRecipientImpl.setDesignation(getDesignation());
		draftRecipientImpl.setEmail(getEmail());
		draftRecipientImpl.setMobile(getMobile());
		draftRecipientImpl.setAddress(getAddress());
		draftRecipientImpl.setStateId(getStateId());
		draftRecipientImpl.setCity(getCity());
		draftRecipientImpl.setPinCode(getPinCode());

		draftRecipientImpl.resetOriginalValues();

		return draftRecipientImpl;
	}

	@Override
	public DraftRecipient cloneWithOriginalValues() {
		DraftRecipientImpl draftRecipientImpl = new DraftRecipientImpl();

		draftRecipientImpl.setUuid(
			this.<String>getColumnOriginalValue("uuid_"));
		draftRecipientImpl.setId(this.<Long>getColumnOriginalValue("id_"));
		draftRecipientImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		draftRecipientImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		draftRecipientImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		draftRecipientImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		draftRecipientImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		draftRecipientImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		draftRecipientImpl.setDraftId(
			this.<Long>getColumnOriginalValue("draftId"));
		draftRecipientImpl.setOrganizationId(
			this.<Long>getColumnOriginalValue("organizationId"));
		draftRecipientImpl.setName(this.<String>getColumnOriginalValue("name"));
		draftRecipientImpl.setDesignation(
			this.<String>getColumnOriginalValue("designation"));
		draftRecipientImpl.setEmail(
			this.<String>getColumnOriginalValue("email"));
		draftRecipientImpl.setMobile(
			this.<String>getColumnOriginalValue("mobile"));
		draftRecipientImpl.setAddress(
			this.<String>getColumnOriginalValue("address"));
		draftRecipientImpl.setStateId(
			this.<Long>getColumnOriginalValue("stateId"));
		draftRecipientImpl.setCity(this.<String>getColumnOriginalValue("city"));
		draftRecipientImpl.setPinCode(
			this.<String>getColumnOriginalValue("pinCode"));

		return draftRecipientImpl;
	}

	@Override
	public int compareTo(DraftRecipient draftRecipient) {
		long primaryKey = draftRecipient.getPrimaryKey();

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

		if (!(object instanceof DraftRecipient)) {
			return false;
		}

		DraftRecipient draftRecipient = (DraftRecipient)object;

		long primaryKey = draftRecipient.getPrimaryKey();

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
	public CacheModel<DraftRecipient> toCacheModel() {
		DraftRecipientCacheModel draftRecipientCacheModel =
			new DraftRecipientCacheModel();

		draftRecipientCacheModel.uuid = getUuid();

		String uuid = draftRecipientCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			draftRecipientCacheModel.uuid = null;
		}

		draftRecipientCacheModel.id = getId();

		draftRecipientCacheModel.groupId = getGroupId();

		draftRecipientCacheModel.companyId = getCompanyId();

		draftRecipientCacheModel.userId = getUserId();

		draftRecipientCacheModel.userName = getUserName();

		String userName = draftRecipientCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			draftRecipientCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			draftRecipientCacheModel.createDate = createDate.getTime();
		}
		else {
			draftRecipientCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			draftRecipientCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			draftRecipientCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		draftRecipientCacheModel.draftId = getDraftId();

		draftRecipientCacheModel.organizationId = getOrganizationId();

		draftRecipientCacheModel.name = getName();

		String name = draftRecipientCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			draftRecipientCacheModel.name = null;
		}

		draftRecipientCacheModel.designation = getDesignation();

		String designation = draftRecipientCacheModel.designation;

		if ((designation != null) && (designation.length() == 0)) {
			draftRecipientCacheModel.designation = null;
		}

		draftRecipientCacheModel.email = getEmail();

		String email = draftRecipientCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			draftRecipientCacheModel.email = null;
		}

		draftRecipientCacheModel.mobile = getMobile();

		String mobile = draftRecipientCacheModel.mobile;

		if ((mobile != null) && (mobile.length() == 0)) {
			draftRecipientCacheModel.mobile = null;
		}

		draftRecipientCacheModel.address = getAddress();

		String address = draftRecipientCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			draftRecipientCacheModel.address = null;
		}

		draftRecipientCacheModel.stateId = getStateId();

		draftRecipientCacheModel.city = getCity();

		String city = draftRecipientCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			draftRecipientCacheModel.city = null;
		}

		draftRecipientCacheModel.pinCode = getPinCode();

		String pinCode = draftRecipientCacheModel.pinCode;

		if ((pinCode != null) && (pinCode.length() == 0)) {
			draftRecipientCacheModel.pinCode = null;
		}

		return draftRecipientCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<DraftRecipient, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<DraftRecipient, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DraftRecipient, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((DraftRecipient)this);

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
		Map<String, Function<DraftRecipient, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<DraftRecipient, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<DraftRecipient, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((DraftRecipient)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, DraftRecipient>
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
	private long _draftId;
	private long _organizationId;
	private String _name;
	private String _designation;
	private String _email;
	private String _mobile;
	private String _address;
	private long _stateId;
	private String _city;
	private String _pinCode;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<DraftRecipient, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((DraftRecipient)this);
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
		_columnOriginalValues.put("draftId", _draftId);
		_columnOriginalValues.put("organizationId", _organizationId);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("designation", _designation);
		_columnOriginalValues.put("email", _email);
		_columnOriginalValues.put("mobile", _mobile);
		_columnOriginalValues.put("address", _address);
		_columnOriginalValues.put("stateId", _stateId);
		_columnOriginalValues.put("city", _city);
		_columnOriginalValues.put("pinCode", _pinCode);
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

		columnBitmasks.put("draftId", 256L);

		columnBitmasks.put("organizationId", 512L);

		columnBitmasks.put("name", 1024L);

		columnBitmasks.put("designation", 2048L);

		columnBitmasks.put("email", 4096L);

		columnBitmasks.put("mobile", 8192L);

		columnBitmasks.put("address", 16384L);

		columnBitmasks.put("stateId", 32768L);

		columnBitmasks.put("city", 65536L);

		columnBitmasks.put("pinCode", 131072L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private DraftRecipient _escapedModel;

}