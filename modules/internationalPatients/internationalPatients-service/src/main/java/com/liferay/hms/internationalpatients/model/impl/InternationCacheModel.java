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

import com.liferay.hms.internationalpatients.model.Internation;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Internation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class InternationCacheModel
	implements CacheModel<Internation>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof InternationCacheModel)) {
			return false;
		}

		InternationCacheModel internationCacheModel =
			(InternationCacheModel)object;

		if (id == internationCacheModel.id) {
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
	public Internation toEntityModel() {
		InternationImpl internationImpl = new InternationImpl();

		if (uuid == null) {
			internationImpl.setUuid("");
		}
		else {
			internationImpl.setUuid(uuid);
		}

		internationImpl.setId(id);
		internationImpl.setGroupId(groupId);
		internationImpl.setCompanyId(companyId);
		internationImpl.setUserId(userId);

		if (userName == null) {
			internationImpl.setUserName("");
		}
		else {
			internationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			internationImpl.setCreateDate(null);
		}
		else {
			internationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			internationImpl.setModifiedDate(null);
		}
		else {
			internationImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			internationImpl.setName("");
		}
		else {
			internationImpl.setName(name);
		}

		if (email == null) {
			internationImpl.setEmail("");
		}
		else {
			internationImpl.setEmail(email);
		}

		if (country == null) {
			internationImpl.setCountry("");
		}
		else {
			internationImpl.setCountry(country);
		}

		if (mobile == null) {
			internationImpl.setMobile("");
		}
		else {
			internationImpl.setMobile(mobile);
		}

		if (query == null) {
			internationImpl.setQuery("");
		}
		else {
			internationImpl.setQuery(query);
		}

		internationImpl.resetOriginalValues();

		return internationImpl;
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