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

package com.liferay.hms.internationalpatients.model.impl;

import com.liferay.hms.internationalpatients.model.International;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing International in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InternationalCacheModel
	implements CacheModel<International>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InternationalCacheModel)) {
			return false;
		}

		InternationalCacheModel internationalCacheModel =
			(InternationalCacheModel)object;

		if (id == internationalCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append(", country=");
		sb.append(country);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", query=");
		sb.append(query);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public International toEntityModel() {
		InternationalImpl internationalImpl = new InternationalImpl();

		if (uuid == null) {
			internationalImpl.setUuid("");
		}
		else {
			internationalImpl.setUuid(uuid);
		}

		internationalImpl.setId(id);
		internationalImpl.setGroupId(groupId);
		internationalImpl.setCompanyId(companyId);
		internationalImpl.setUserId(userId);

		if (userName == null) {
			internationalImpl.setUserName("");
		}
		else {
			internationalImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			internationalImpl.setCreateDate(null);
		}
		else {
			internationalImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			internationalImpl.setModifiedDate(null);
		}
		else {
			internationalImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			internationalImpl.setName("");
		}
		else {
			internationalImpl.setName(name);
		}

		if (email == null) {
			internationalImpl.setEmail("");
		}
		else {
			internationalImpl.setEmail(email);
		}

		if (country == null) {
			internationalImpl.setCountry("");
		}
		else {
			internationalImpl.setCountry(country);
		}

		if (mobile == null) {
			internationalImpl.setMobile("");
		}
		else {
			internationalImpl.setMobile(mobile);
		}

		if (query == null) {
			internationalImpl.setQuery("");
		}
		else {
			internationalImpl.setQuery(query);
		}

		internationalImpl.resetOriginalValues();

		return internationalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		email = objectInput.readUTF();
		country = objectInput.readUTF();
		mobile = objectInput.readUTF();
		query = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (country == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(country);
		}

		if (mobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (query == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(query);
		}
	}

	public String uuid;
	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String email;
	public String country;
	public String mobile;
	public String query;

}