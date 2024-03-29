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

package com.liferay.hms.second.opinion.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.hms.second.opinion.model.SecondOpinion;
import com.liferay.hms.second.opinion.model.SecondOpinionModel;
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

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the SecondOpinion service. Represents a row in the &quot;hms_SecondOpinion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SecondOpinionModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SecondOpinionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondOpinionImpl
 * @generated
 */
@JSON(strict = true)
public class SecondOpinionModelImpl
	extends BaseModelImpl<SecondOpinion> implements SecondOpinionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a second opinion model instance should use the <code>SecondOpinion</code> interface instead.
	 */
	public static final String TABLE_NAME = "hms_SecondOpinion";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"id_", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"name", Types.VARCHAR}, {"email", Types.VARCHAR},
		{"mobile", Types.VARCHAR}, {"specialty", Types.VARCHAR},
		{"remark", Types.VARCHAR}
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
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mobile", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("specialty", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("remark", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table hms_SecondOpinion (uuid_ VARCHAR(75) null,id_ LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,email VARCHAR(75) null,mobile VARCHAR(75) null,specialty VARCHAR(75) null,remark VARCHAR(2036) null)";

	public static final String TABLE_SQL_DROP = "drop table hms_SecondOpinion";

	public static final String ORDER_BY_JPQL =
		" ORDER BY secondOpinion.name ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY hms_SecondOpinion.name ASC";

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
	public static final long NAME_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

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

	public SecondOpinionModelImpl() {
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
		return SecondOpinion.class;
	}

	@Override
	public String getModelClassName() {
		return SecondOpinion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<SecondOpinion, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<SecondOpinion, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SecondOpinion, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((SecondOpinion)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<SecondOpinion, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<SecondOpinion, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(SecondOpinion)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<SecondOpinion, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<SecondOpinion, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<SecondOpinion, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<SecondOpinion, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<SecondOpinion, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<SecondOpinion, Object>>();
		Map<String, BiConsumer<SecondOpinion, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<SecondOpinion, ?>>();

		attributeGetterFunctions.put("uuid", SecondOpinion::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<SecondOpinion, String>)SecondOpinion::setUuid);
		attributeGetterFunctions.put("id", SecondOpinion::getId);
		attributeSetterBiConsumers.put(
			"id", (BiConsumer<SecondOpinion, Long>)SecondOpinion::setId);
		attributeGetterFunctions.put("groupId", SecondOpinion::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<SecondOpinion, Long>)SecondOpinion::setGroupId);
		attributeGetterFunctions.put("companyId", SecondOpinion::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<SecondOpinion, Long>)SecondOpinion::setCompanyId);
		attributeGetterFunctions.put("userId", SecondOpinion::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<SecondOpinion, Long>)SecondOpinion::setUserId);
		attributeGetterFunctions.put("userName", SecondOpinion::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<SecondOpinion, String>)SecondOpinion::setUserName);
		attributeGetterFunctions.put(
			"createDate", SecondOpinion::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<SecondOpinion, Date>)SecondOpinion::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", SecondOpinion::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<SecondOpinion, Date>)SecondOpinion::setModifiedDate);
		attributeGetterFunctions.put("name", SecondOpinion::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<SecondOpinion, String>)SecondOpinion::setName);
		attributeGetterFunctions.put("email", SecondOpinion::getEmail);
		attributeSetterBiConsumers.put(
			"email",
			(BiConsumer<SecondOpinion, String>)SecondOpinion::setEmail);
		attributeGetterFunctions.put("mobile", SecondOpinion::getMobile);
		attributeSetterBiConsumers.put(
			"mobile",
			(BiConsumer<SecondOpinion, String>)SecondOpinion::setMobile);
		attributeGetterFunctions.put("specialty", SecondOpinion::getSpecialty);
		attributeSetterBiConsumers.put(
			"specialty",
			(BiConsumer<SecondOpinion, String>)SecondOpinion::setSpecialty);
		attributeGetterFunctions.put("remark", SecondOpinion::getRemark);
		attributeSetterBiConsumers.put(
			"remark",
			(BiConsumer<SecondOpinion, String>)SecondOpinion::setRemark);

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

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalName() {
		return getColumnOriginalValue("name");
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
	public String getSpecialty() {
		if (_specialty == null) {
			return "";
		}
		else {
			return _specialty;
		}
	}

	@Override
	public void setSpecialty(String specialty) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_specialty = specialty;
	}

	@JSON
	@Override
	public String getRemark() {
		if (_remark == null) {
			return "";
		}
		else {
			return _remark;
		}
	}

	@Override
	public void setRemark(String remark) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_remark = remark;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(SecondOpinion.class.getName()));
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
			getCompanyId(), SecondOpinion.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SecondOpinion toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, SecondOpinion>
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
		SecondOpinionImpl secondOpinionImpl = new SecondOpinionImpl();

		secondOpinionImpl.setUuid(getUuid());
		secondOpinionImpl.setId(getId());
		secondOpinionImpl.setGroupId(getGroupId());
		secondOpinionImpl.setCompanyId(getCompanyId());
		secondOpinionImpl.setUserId(getUserId());
		secondOpinionImpl.setUserName(getUserName());
		secondOpinionImpl.setCreateDate(getCreateDate());
		secondOpinionImpl.setModifiedDate(getModifiedDate());
		secondOpinionImpl.setName(getName());
		secondOpinionImpl.setEmail(getEmail());
		secondOpinionImpl.setMobile(getMobile());
		secondOpinionImpl.setSpecialty(getSpecialty());
		secondOpinionImpl.setRemark(getRemark());

		secondOpinionImpl.resetOriginalValues();

		return secondOpinionImpl;
	}

	@Override
	public SecondOpinion cloneWithOriginalValues() {
		SecondOpinionImpl secondOpinionImpl = new SecondOpinionImpl();

		secondOpinionImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		secondOpinionImpl.setId(this.<Long>getColumnOriginalValue("id_"));
		secondOpinionImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		secondOpinionImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		secondOpinionImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		secondOpinionImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		secondOpinionImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		secondOpinionImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		secondOpinionImpl.setName(this.<String>getColumnOriginalValue("name"));
		secondOpinionImpl.setEmail(
			this.<String>getColumnOriginalValue("email"));
		secondOpinionImpl.setMobile(
			this.<String>getColumnOriginalValue("mobile"));
		secondOpinionImpl.setSpecialty(
			this.<String>getColumnOriginalValue("specialty"));
		secondOpinionImpl.setRemark(
			this.<String>getColumnOriginalValue("remark"));

		return secondOpinionImpl;
	}

	@Override
	public int compareTo(SecondOpinion secondOpinion) {
		int value = 0;

		value = getName().compareTo(secondOpinion.getName());

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

		if (!(object instanceof SecondOpinion)) {
			return false;
		}

		SecondOpinion secondOpinion = (SecondOpinion)object;

		long primaryKey = secondOpinion.getPrimaryKey();

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
	public CacheModel<SecondOpinion> toCacheModel() {
		SecondOpinionCacheModel secondOpinionCacheModel =
			new SecondOpinionCacheModel();

		secondOpinionCacheModel.uuid = getUuid();

		String uuid = secondOpinionCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			secondOpinionCacheModel.uuid = null;
		}

		secondOpinionCacheModel.id = getId();

		secondOpinionCacheModel.groupId = getGroupId();

		secondOpinionCacheModel.companyId = getCompanyId();

		secondOpinionCacheModel.userId = getUserId();

		secondOpinionCacheModel.userName = getUserName();

		String userName = secondOpinionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			secondOpinionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			secondOpinionCacheModel.createDate = createDate.getTime();
		}
		else {
			secondOpinionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			secondOpinionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			secondOpinionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		secondOpinionCacheModel.name = getName();

		String name = secondOpinionCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			secondOpinionCacheModel.name = null;
		}

		secondOpinionCacheModel.email = getEmail();

		String email = secondOpinionCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			secondOpinionCacheModel.email = null;
		}

		secondOpinionCacheModel.mobile = getMobile();

		String mobile = secondOpinionCacheModel.mobile;

		if ((mobile != null) && (mobile.length() == 0)) {
			secondOpinionCacheModel.mobile = null;
		}

		secondOpinionCacheModel.specialty = getSpecialty();

		String specialty = secondOpinionCacheModel.specialty;

		if ((specialty != null) && (specialty.length() == 0)) {
			secondOpinionCacheModel.specialty = null;
		}

		secondOpinionCacheModel.remark = getRemark();

		String remark = secondOpinionCacheModel.remark;

		if ((remark != null) && (remark.length() == 0)) {
			secondOpinionCacheModel.remark = null;
		}

		return secondOpinionCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<SecondOpinion, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<SecondOpinion, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SecondOpinion, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((SecondOpinion)this);

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
		Map<String, Function<SecondOpinion, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<SecondOpinion, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<SecondOpinion, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((SecondOpinion)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, SecondOpinion>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					SecondOpinion.class, ModelWrapper.class);

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
	private String _name;
	private String _email;
	private String _mobile;
	private String _specialty;
	private String _remark;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<SecondOpinion, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((SecondOpinion)this);
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
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("email", _email);
		_columnOriginalValues.put("mobile", _mobile);
		_columnOriginalValues.put("specialty", _specialty);
		_columnOriginalValues.put("remark", _remark);
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

		columnBitmasks.put("name", 256L);

		columnBitmasks.put("email", 512L);

		columnBitmasks.put("mobile", 1024L);

		columnBitmasks.put("specialty", 2048L);

		columnBitmasks.put("remark", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private SecondOpinion _escapedModel;

}