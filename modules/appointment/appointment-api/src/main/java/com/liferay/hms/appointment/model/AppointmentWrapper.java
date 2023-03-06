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

package com.liferay.hms.appointment.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Appointment}.
 * </p>
 *
 * @author devendra
 * @see Appointment
 * @generated
 */
public class AppointmentWrapper
	extends BaseModelWrapper<Appointment>
	implements Appointment, ModelWrapper<Appointment> {

	public AppointmentWrapper(Appointment appointment) {
		super(appointment);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("appointmentId", getAppointmentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("mobile", getMobile());
		attributes.put("email", getEmail());
		attributes.put("country", getCountry());
		attributes.put("age", getAge());
		attributes.put("speciality", getSpeciality());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long appointmentId = (Long)attributes.get("appointmentId");

		if (appointmentId != null) {
			setAppointmentId(appointmentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		String age = (String)attributes.get("age");

		if (age != null) {
			setAge(age);
		}

		String speciality = (String)attributes.get("speciality");

		if (speciality != null) {
			setSpeciality(speciality);
		}
	}

	@Override
	public Appointment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the age of this appointment.
	 *
	 * @return the age of this appointment
	 */
	@Override
	public String getAge() {
		return model.getAge();
	}

	/**
	 * Returns the appointment ID of this appointment.
	 *
	 * @return the appointment ID of this appointment
	 */
	@Override
	public long getAppointmentId() {
		return model.getAppointmentId();
	}

	/**
	 * Returns the company ID of this appointment.
	 *
	 * @return the company ID of this appointment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the country of this appointment.
	 *
	 * @return the country of this appointment
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this appointment.
	 *
	 * @return the create date of this appointment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this appointment.
	 *
	 * @return the email of this appointment
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this appointment.
	 *
	 * @return the group ID of this appointment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mobile of this appointment.
	 *
	 * @return the mobile of this appointment
	 */
	@Override
	public String getMobile() {
		return model.getMobile();
	}

	/**
	 * Returns the modified date of this appointment.
	 *
	 * @return the modified date of this appointment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this appointment.
	 *
	 * @return the name of this appointment
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this appointment.
	 *
	 * @return the primary key of this appointment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the speciality of this appointment.
	 *
	 * @return the speciality of this appointment
	 */
	@Override
	public String getSpeciality() {
		return model.getSpeciality();
	}

	/**
	 * Returns the user ID of this appointment.
	 *
	 * @return the user ID of this appointment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this appointment.
	 *
	 * @return the user name of this appointment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this appointment.
	 *
	 * @return the user uuid of this appointment
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this appointment.
	 *
	 * @return the uuid of this appointment
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the age of this appointment.
	 *
	 * @param age the age of this appointment
	 */
	@Override
	public void setAge(String age) {
		model.setAge(age);
	}

	/**
	 * Sets the appointment ID of this appointment.
	 *
	 * @param appointmentId the appointment ID of this appointment
	 */
	@Override
	public void setAppointmentId(long appointmentId) {
		model.setAppointmentId(appointmentId);
	}

	/**
	 * Sets the company ID of this appointment.
	 *
	 * @param companyId the company ID of this appointment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the country of this appointment.
	 *
	 * @param country the country of this appointment
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this appointment.
	 *
	 * @param createDate the create date of this appointment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this appointment.
	 *
	 * @param email the email of this appointment
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this appointment.
	 *
	 * @param groupId the group ID of this appointment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mobile of this appointment.
	 *
	 * @param mobile the mobile of this appointment
	 */
	@Override
	public void setMobile(String mobile) {
		model.setMobile(mobile);
	}

	/**
	 * Sets the modified date of this appointment.
	 *
	 * @param modifiedDate the modified date of this appointment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this appointment.
	 *
	 * @param name the name of this appointment
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this appointment.
	 *
	 * @param primaryKey the primary key of this appointment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the speciality of this appointment.
	 *
	 * @param speciality the speciality of this appointment
	 */
	@Override
	public void setSpeciality(String speciality) {
		model.setSpeciality(speciality);
	}

	/**
	 * Sets the user ID of this appointment.
	 *
	 * @param userId the user ID of this appointment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this appointment.
	 *
	 * @param userName the user name of this appointment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this appointment.
	 *
	 * @param userUuid the user uuid of this appointment
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this appointment.
	 *
	 * @param uuid the uuid of this appointment
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected AppointmentWrapper wrap(Appointment appointment) {
		return new AppointmentWrapper(appointment);
	}

}