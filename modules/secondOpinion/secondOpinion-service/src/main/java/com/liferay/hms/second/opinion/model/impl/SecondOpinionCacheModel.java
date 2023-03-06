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

import com.liferay.hms.second.opinion.model.SecondOpinion;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing SecondOpinion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SecondOpinionCacheModel
	implements CacheModel<SecondOpinion>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SecondOpinionCacheModel)) {
			return false;
		}

		SecondOpinionCacheModel secondOpinionCacheModel =
			(SecondOpinionCacheModel)object;

		if (id == secondOpinionCacheModel.id) {
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
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", specialty=");
		sb.append(specialty);
		sb.append(", remark=");
		sb.append(remark);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public SecondOpinion toEntityModel() {
		SecondOpinionImpl secondOpinionImpl = new SecondOpinionImpl();

		if (uuid == null) {
			secondOpinionImpl.setUuid("");
		}
		else {
			secondOpinionImpl.setUuid(uuid);
		}

		secondOpinionImpl.setId(id);
		secondOpinionImpl.setGroupId(groupId);
		secondOpinionImpl.setCompanyId(companyId);
		secondOpinionImpl.setUserId(userId);

		if (userName == null) {
			secondOpinionImpl.setUserName("");
		}
		else {
			secondOpinionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			secondOpinionImpl.setCreateDate(null);
		}
		else {
			secondOpinionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			secondOpinionImpl.setModifiedDate(null);
		}
		else {
			secondOpinionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			secondOpinionImpl.setName("");
		}
		else {
			secondOpinionImpl.setName(name);
		}

		if (email == null) {
			secondOpinionImpl.setEmail("");
		}
		else {
			secondOpinionImpl.setEmail(email);
		}

		if (mobile == null) {
			secondOpinionImpl.setMobile("");
		}
		else {
			secondOpinionImpl.setMobile(mobile);
		}

		if (specialty == null) {
			secondOpinionImpl.setSpecialty("");
		}
		else {
			secondOpinionImpl.setSpecialty(specialty);
		}

		if (remark == null) {
			secondOpinionImpl.setRemark("");
		}
		else {
			secondOpinionImpl.setRemark(remark);
		}

		secondOpinionImpl.resetOriginalValues();

		return secondOpinionImpl;
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
		mobile = objectInput.readUTF();
		specialty = objectInput.readUTF();
		remark = objectInput.readUTF();
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

		if (mobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (specialty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(specialty);
		}

		if (remark == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remark);
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
	public String mobile;
	public String specialty;
	public String remark;

}