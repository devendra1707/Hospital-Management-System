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

package com.liferay.hms.appointment.model.impl;

import com.liferay.hms.appointment.model.Appointment;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Appointment in entity cache.
 *
 * @author devendra
 * @generated
 */
public class AppointmentCacheModel
	implements CacheModel<Appointment>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AppointmentCacheModel)) {
			return false;
		}

		AppointmentCacheModel appointmentCacheModel =
			(AppointmentCacheModel)object;

		if (appointmentId == appointmentCacheModel.appointmentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, appointmentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", appointmentId=");
		sb.append(appointmentId);
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
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", email=");
		sb.append(email);
		sb.append(", country=");
		sb.append(country);
		sb.append(", age=");
		sb.append(age);
		sb.append(", speciality=");
		sb.append(speciality);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Appointment toEntityModel() {
		AppointmentImpl appointmentImpl = new AppointmentImpl();

		if (uuid == null) {
			appointmentImpl.setUuid("");
		}
		else {
			appointmentImpl.setUuid(uuid);
		}

		appointmentImpl.setAppointmentId(appointmentId);
		appointmentImpl.setGroupId(groupId);
		appointmentImpl.setCompanyId(companyId);
		appointmentImpl.setUserId(userId);

		if (userName == null) {
			appointmentImpl.setUserName("");
		}
		else {
			appointmentImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			appointmentImpl.setCreateDate(null);
		}
		else {
			appointmentImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			appointmentImpl.setModifiedDate(null);
		}
		else {
			appointmentImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			appointmentImpl.setName("");
		}
		else {
			appointmentImpl.setName(name);
		}

		if (mobile == null) {
			appointmentImpl.setMobile("");
		}
		else {
			appointmentImpl.setMobile(mobile);
		}

		if (email == null) {
			appointmentImpl.setEmail("");
		}
		else {
			appointmentImpl.setEmail(email);
		}

		if (country == null) {
			appointmentImpl.setCountry("");
		}
		else {
			appointmentImpl.setCountry(country);
		}

		if (age == null) {
			appointmentImpl.setAge("");
		}
		else {
			appointmentImpl.setAge(age);
		}

		if (speciality == null) {
			appointmentImpl.setSpeciality("");
		}
		else {
			appointmentImpl.setSpeciality(speciality);
		}

		appointmentImpl.resetOriginalValues();

		return appointmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		appointmentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		mobile = objectInput.readUTF();
		email = objectInput.readUTF();
		country = objectInput.readUTF();
		age = objectInput.readUTF();
		speciality = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(appointmentId);

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

		if (mobile == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mobile);
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

		if (age == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(age);
		}

		if (speciality == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(speciality);
		}
	}

	public String uuid;
	public long appointmentId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String mobile;
	public String email;
	public String country;
	public String age;
	public String speciality;

}