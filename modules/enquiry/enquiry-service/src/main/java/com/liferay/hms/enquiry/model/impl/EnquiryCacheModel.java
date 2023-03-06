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

package com.liferay.hms.enquiry.model.impl;

import com.liferay.hms.enquiry.model.Enquiry;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Enquiry in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EnquiryCacheModel implements CacheModel<Enquiry>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EnquiryCacheModel)) {
			return false;
		}

		EnquiryCacheModel enquiryCacheModel = (EnquiryCacheModel)object;

		if (enquiryId == enquiryCacheModel.enquiryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, enquiryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", enquiryId=");
		sb.append(enquiryId);
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
		sb.append(", mobileNo=");
		sb.append(mobileNo);
		sb.append(", concern=");
		sb.append(concern);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Enquiry toEntityModel() {
		EnquiryImpl enquiryImpl = new EnquiryImpl();

		if (uuid == null) {
			enquiryImpl.setUuid("");
		}
		else {
			enquiryImpl.setUuid(uuid);
		}

		enquiryImpl.setEnquiryId(enquiryId);
		enquiryImpl.setGroupId(groupId);
		enquiryImpl.setCompanyId(companyId);
		enquiryImpl.setUserId(userId);

		if (userName == null) {
			enquiryImpl.setUserName("");
		}
		else {
			enquiryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			enquiryImpl.setCreateDate(null);
		}
		else {
			enquiryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			enquiryImpl.setModifiedDate(null);
		}
		else {
			enquiryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			enquiryImpl.setName("");
		}
		else {
			enquiryImpl.setName(name);
		}

		if (mobileNo == null) {
			enquiryImpl.setMobileNo("");
		}
		else {
			enquiryImpl.setMobileNo(mobileNo);
		}

		if (concern == null) {
			enquiryImpl.setConcern("");
		}
		else {
			enquiryImpl.setConcern(concern);
		}

		enquiryImpl.resetOriginalValues();

		return enquiryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		enquiryId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		mobileNo = objectInput.readUTF();
		concern = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(enquiryId);

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

		if (mobileNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobileNo);
		}

		if (concern == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(concern);
		}
	}

	public String uuid;
	public long enquiryId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String mobileNo;
	public String concern;

}