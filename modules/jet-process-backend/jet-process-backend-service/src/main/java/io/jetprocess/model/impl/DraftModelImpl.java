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

import io.jetprocess.model.Draft;
import io.jetprocess.model.DraftModel;
import io.jetprocess.model.DraftSoap;

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
 * The base model implementation for the Draft service. Represents a row in the &quot;JP_Draft&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>DraftModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DraftImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DraftImpl
 * @generated
 */
@JSON(strict = true)
public class DraftModelImpl extends BaseModelImpl<Draft> implements DraftModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a draft model instance should use the <code>Draft</code> interface instead.
	 */
	public static final String TABLE_NAME = "JP_Draft";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"id_", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"nature", Types.VARCHAR}, {"receiptId", Types.BIGINT},
		{"replyTypeId", Types.BIGINT}, {"categoryId", Types.BIGINT},
		{"subject", Types.VARCHAR}, {"content", Types.CLOB},
		{"dispatch", Types.BOOLEAN}, {"status", Types.VARCHAR},
		{"approvedBy", Types.VARCHAR}
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
		TABLE_COLUMNS_MAP.put("nature", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("receiptId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("replyTypeId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("categoryId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("subject", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("content", Types.CLOB);
		TABLE_COLUMNS_MAP.put("dispatch", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("status", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("approvedBy", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table JP_Draft (uuid_ VARCHAR(75) null,id_ LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,nature VARCHAR(75) null,receiptId LONG,replyTypeId LONG,categoryId LONG,subject VARCHAR(500) null,content TEXT null,dispatch BOOLEAN,status VARCHAR(75) null,approvedBy VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table JP_Draft";

	public static final String ORDER_BY_JPQL = " ORDER BY draft.id ASC";

	public static final String ORDER_BY_SQL = " ORDER BY JP_Draft.id_ ASC";

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
	public static Draft toModel(DraftSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Draft model = new DraftImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setNature(soapModel.getNature());
		model.setReceiptId(soapModel.getReceiptId());
		model.setReplyTypeId(soapModel.getReplyTypeId());
		model.setCategoryId(soapModel.getCategoryId());
		model.setSubject(soapModel.getSubject());
		model.setContent(soapModel.getContent());
		model.setDispatch(soapModel.isDispatch());
		model.setStatus(soapModel.getStatus());
		model.setApprovedBy(soapModel.getApprovedBy());

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
	public static List<Draft> toModels(DraftSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Draft> models = new ArrayList<Draft>(soapModels.length);

		for (DraftSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public DraftModelImpl() {
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
		return Draft.class;
	}

	@Override
	public String getModelClassName() {
		return Draft.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Draft, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Draft, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Draft, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Draft)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Draft, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Draft, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Draft)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Draft, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Draft, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Draft>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Draft.class.getClassLoader(), Draft.class, ModelWrapper.class);

		try {
			Constructor<Draft> constructor =
				(Constructor<Draft>)proxyClass.getConstructor(
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

	private static final Map<String, Function<Draft, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Draft, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Draft, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Draft, Object>>();
		Map<String, BiConsumer<Draft, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Draft, ?>>();

		attributeGetterFunctions.put("uuid", Draft::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Draft, String>)Draft::setUuid);
		attributeGetterFunctions.put("id", Draft::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<Draft, Long>)Draft::setId);
		attributeGetterFunctions.put("groupId", Draft::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Draft, Long>)Draft::setGroupId);
		attributeGetterFunctions.put("companyId", Draft::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Draft, Long>)Draft::setCompanyId);
		attributeGetterFunctions.put("userId", Draft::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Draft, Long>)Draft::setUserId);
		attributeGetterFunctions.put("userName", Draft::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Draft, String>)Draft::setUserName);
		attributeGetterFunctions.put("createDate", Draft::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Draft, Date>)Draft::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Draft::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<Draft, Date>)Draft::setModifiedDate);
		attributeGetterFunctions.put("nature", Draft::getNature);
		attributeSetterBiConsumers.put(
			"nature", (BiConsumer<Draft, String>)Draft::setNature);
		attributeGetterFunctions.put("receiptId", Draft::getReceiptId);
		attributeSetterBiConsumers.put(
			"receiptId", (BiConsumer<Draft, Long>)Draft::setReceiptId);
		attributeGetterFunctions.put("replyTypeId", Draft::getReplyTypeId);
		attributeSetterBiConsumers.put(
			"replyTypeId", (BiConsumer<Draft, Long>)Draft::setReplyTypeId);
		attributeGetterFunctions.put("categoryId", Draft::getCategoryId);
		attributeSetterBiConsumers.put(
			"categoryId", (BiConsumer<Draft, Long>)Draft::setCategoryId);
		attributeGetterFunctions.put("subject", Draft::getSubject);
		attributeSetterBiConsumers.put(
			"subject", (BiConsumer<Draft, String>)Draft::setSubject);
		attributeGetterFunctions.put("content", Draft::getContent);
		attributeSetterBiConsumers.put(
			"content", (BiConsumer<Draft, String>)Draft::setContent);
		attributeGetterFunctions.put("dispatch", Draft::getDispatch);
		attributeSetterBiConsumers.put(
			"dispatch", (BiConsumer<Draft, Boolean>)Draft::setDispatch);
		attributeGetterFunctions.put("status", Draft::getStatus);
		attributeSetterBiConsumers.put(
			"status", (BiConsumer<Draft, String>)Draft::setStatus);
		attributeGetterFunctions.put("approvedBy", Draft::getApprovedBy);
		attributeSetterBiConsumers.put(
			"approvedBy", (BiConsumer<Draft, String>)Draft::setApprovedBy);

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
	public String getNature() {
		if (_nature == null) {
			return "";
		}
		else {
			return _nature;
		}
	}

	@Override
	public void setNature(String nature) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nature = nature;
	}

	@JSON
	@Override
	public long getReceiptId() {
		return _receiptId;
	}

	@Override
	public void setReceiptId(long receiptId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_receiptId = receiptId;
	}

	@JSON
	@Override
	public long getReplyTypeId() {
		return _replyTypeId;
	}

	@Override
	public void setReplyTypeId(long replyTypeId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_replyTypeId = replyTypeId;
	}

	@JSON
	@Override
	public long getCategoryId() {
		return _categoryId;
	}

	@Override
	public void setCategoryId(long categoryId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_categoryId = categoryId;
	}

	@JSON
	@Override
	public String getSubject() {
		if (_subject == null) {
			return "";
		}
		else {
			return _subject;
		}
	}

	@Override
	public void setSubject(String subject) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_subject = subject;
	}

	@JSON
	@Override
	public String getContent() {
		if (_content == null) {
			return "";
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_content = content;
	}

	@JSON
	@Override
	public boolean getDispatch() {
		return _dispatch;
	}

	@JSON
	@Override
	public boolean isDispatch() {
		return _dispatch;
	}

	@Override
	public void setDispatch(boolean dispatch) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dispatch = dispatch;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return "";
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_status = status;
	}

	@JSON
	@Override
	public String getApprovedBy() {
		if (_approvedBy == null) {
			return "";
		}
		else {
			return _approvedBy;
		}
	}

	@Override
	public void setApprovedBy(String approvedBy) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_approvedBy = approvedBy;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Draft.class.getName()));
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
			getCompanyId(), Draft.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Draft toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Draft>
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
		DraftImpl draftImpl = new DraftImpl();

		draftImpl.setUuid(getUuid());
		draftImpl.setId(getId());
		draftImpl.setGroupId(getGroupId());
		draftImpl.setCompanyId(getCompanyId());
		draftImpl.setUserId(getUserId());
		draftImpl.setUserName(getUserName());
		draftImpl.setCreateDate(getCreateDate());
		draftImpl.setModifiedDate(getModifiedDate());
		draftImpl.setNature(getNature());
		draftImpl.setReceiptId(getReceiptId());
		draftImpl.setReplyTypeId(getReplyTypeId());
		draftImpl.setCategoryId(getCategoryId());
		draftImpl.setSubject(getSubject());
		draftImpl.setContent(getContent());
		draftImpl.setDispatch(isDispatch());
		draftImpl.setStatus(getStatus());
		draftImpl.setApprovedBy(getApprovedBy());

		draftImpl.resetOriginalValues();

		return draftImpl;
	}

	@Override
	public Draft cloneWithOriginalValues() {
		DraftImpl draftImpl = new DraftImpl();

		draftImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		draftImpl.setId(this.<Long>getColumnOriginalValue("id_"));
		draftImpl.setGroupId(this.<Long>getColumnOriginalValue("groupId"));
		draftImpl.setCompanyId(this.<Long>getColumnOriginalValue("companyId"));
		draftImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		draftImpl.setUserName(this.<String>getColumnOriginalValue("userName"));
		draftImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		draftImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		draftImpl.setNature(this.<String>getColumnOriginalValue("nature"));
		draftImpl.setReceiptId(this.<Long>getColumnOriginalValue("receiptId"));
		draftImpl.setReplyTypeId(
			this.<Long>getColumnOriginalValue("replyTypeId"));
		draftImpl.setCategoryId(
			this.<Long>getColumnOriginalValue("categoryId"));
		draftImpl.setSubject(this.<String>getColumnOriginalValue("subject"));
		draftImpl.setContent(this.<String>getColumnOriginalValue("content"));
		draftImpl.setDispatch(this.<Boolean>getColumnOriginalValue("dispatch"));
		draftImpl.setStatus(this.<String>getColumnOriginalValue("status"));
		draftImpl.setApprovedBy(
			this.<String>getColumnOriginalValue("approvedBy"));

		return draftImpl;
	}

	@Override
	public int compareTo(Draft draft) {
		long primaryKey = draft.getPrimaryKey();

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

		if (!(object instanceof Draft)) {
			return false;
		}

		Draft draft = (Draft)object;

		long primaryKey = draft.getPrimaryKey();

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
	public CacheModel<Draft> toCacheModel() {
		DraftCacheModel draftCacheModel = new DraftCacheModel();

		draftCacheModel.uuid = getUuid();

		String uuid = draftCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			draftCacheModel.uuid = null;
		}

		draftCacheModel.id = getId();

		draftCacheModel.groupId = getGroupId();

		draftCacheModel.companyId = getCompanyId();

		draftCacheModel.userId = getUserId();

		draftCacheModel.userName = getUserName();

		String userName = draftCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			draftCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			draftCacheModel.createDate = createDate.getTime();
		}
		else {
			draftCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			draftCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			draftCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		draftCacheModel.nature = getNature();

		String nature = draftCacheModel.nature;

		if ((nature != null) && (nature.length() == 0)) {
			draftCacheModel.nature = null;
		}

		draftCacheModel.receiptId = getReceiptId();

		draftCacheModel.replyTypeId = getReplyTypeId();

		draftCacheModel.categoryId = getCategoryId();

		draftCacheModel.subject = getSubject();

		String subject = draftCacheModel.subject;

		if ((subject != null) && (subject.length() == 0)) {
			draftCacheModel.subject = null;
		}

		draftCacheModel.content = getContent();

		String content = draftCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			draftCacheModel.content = null;
		}

		draftCacheModel.dispatch = isDispatch();

		draftCacheModel.status = getStatus();

		String status = draftCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			draftCacheModel.status = null;
		}

		draftCacheModel.approvedBy = getApprovedBy();

		String approvedBy = draftCacheModel.approvedBy;

		if ((approvedBy != null) && (approvedBy.length() == 0)) {
			draftCacheModel.approvedBy = null;
		}

		return draftCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Draft, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Draft, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Draft, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Draft)this);

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
		Map<String, Function<Draft, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Draft, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Draft, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Draft)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Draft>
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
	private String _nature;
	private long _receiptId;
	private long _replyTypeId;
	private long _categoryId;
	private String _subject;
	private String _content;
	private boolean _dispatch;
	private String _status;
	private String _approvedBy;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Draft, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Draft)this);
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
		_columnOriginalValues.put("nature", _nature);
		_columnOriginalValues.put("receiptId", _receiptId);
		_columnOriginalValues.put("replyTypeId", _replyTypeId);
		_columnOriginalValues.put("categoryId", _categoryId);
		_columnOriginalValues.put("subject", _subject);
		_columnOriginalValues.put("content", _content);
		_columnOriginalValues.put("dispatch", _dispatch);
		_columnOriginalValues.put("status", _status);
		_columnOriginalValues.put("approvedBy", _approvedBy);
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

		columnBitmasks.put("nature", 256L);

		columnBitmasks.put("receiptId", 512L);

		columnBitmasks.put("replyTypeId", 1024L);

		columnBitmasks.put("categoryId", 2048L);

		columnBitmasks.put("subject", 4096L);

		columnBitmasks.put("content", 8192L);

		columnBitmasks.put("dispatch", 16384L);

		columnBitmasks.put("status", 32768L);

		columnBitmasks.put("approvedBy", 65536L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Draft _escapedModel;

}