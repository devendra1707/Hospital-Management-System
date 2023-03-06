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

package com.liferay.hms.second.opinion.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SecondOpinion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondOpinion
 * @generated
 */
public class SecondOpinionWrapper
	extends BaseModelWrapper<SecondOpinion>
	implements ModelWrapper<SecondOpinion>, SecondOpinion {

	public SecondOpinionWrapper(SecondOpinion secondOpinion) {
		super(secondOpinion);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("mobile", getMobile());
		attributes.put("specialty", getSpecialty());
		attributes.put("remark", getRemark());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String specialty = (String)attributes.get("specialty");

		if (specialty != null) {
			setSpecialty(specialty);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
		}
	}

	@Override
	public SecondOpinion cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this second opinion.
	 *
	 * @return the company ID of this second opinion
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this second opinion.
	 *
	 * @return the create date of this second opinion
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this second opinion.
	 *
	 * @return the email of this second opinion
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the group ID of this second opinion.
	 *
	 * @return the group ID of this second opinion
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the ID of this second opinion.
	 *
	 * @return the ID of this second opinion
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the mobile of this second opinion.
	 *
	 * @return the mobile of this second opinion
	 */
	@Override
	public String getMobile() {
		return model.getMobile();
	}

	/**
	 * Returns the modified date of this second opinion.
	 *
	 * @return the modified date of this second opinion
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this second opinion.
	 *
	 * @return the name of this second opinion
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this second opinion.
	 *
	 * @return the primary key of this second opinion
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the remark of this second opinion.
	 *
	 * @return the remark of this second opinion
	 */
	@Override
	public String getRemark() {
		return model.getRemark();
	}

	/**
	 * Returns the specialty of this second opinion.
	 *
	 * @return the specialty of this second opinion
	 */
	@Override
	public String getSpecialty() {
		return model.getSpecialty();
	}

	/**
	 * Returns the user ID of this second opinion.
	 *
	 * @return the user ID of this second opinion
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this second opinion.
	 *
	 * @return the user name of this second opinion
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this second opinion.
	 *
	 * @return the user uuid of this second opinion
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this second opinion.
	 *
	 * @return the uuid of this second opinion
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
	 * Sets the company ID of this second opinion.
	 *
	 * @param companyId the company ID of this second opinion
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this second opinion.
	 *
	 * @param createDate the create date of this second opinion
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this second opinion.
	 *
	 * @param email the email of this second opinion
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the group ID of this second opinion.
	 *
	 * @param groupId the group ID of this second opinion
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the ID of this second opinion.
	 *
	 * @param id the ID of this second opinion
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the mobile of this second opinion.
	 *
	 * @param mobile the mobile of this second opinion
	 */
	@Override
	public void setMobile(String mobile) {
		model.setMobile(mobile);
	}

	/**
	 * Sets the modified date of this second opinion.
	 *
	 * @param modifiedDate the modified date of this second opinion
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this second opinion.
	 *
	 * @param name the name of this second opinion
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this second opinion.
	 *
	 * @param primaryKey the primary key of this second opinion
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the remark of this second opinion.
	 *
	 * @param remark the remark of this second opinion
	 */
	@Override
	public void setRemark(String remark) {
		model.setRemark(remark);
	}

	/**
	 * Sets the specialty of this second opinion.
	 *
	 * @param specialty the specialty of this second opinion
	 */
	@Override
	public void setSpecialty(String specialty) {
		model.setSpecialty(specialty);
	}

	/**
	 * Sets the user ID of this second opinion.
	 *
	 * @param userId the user ID of this second opinion
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this second opinion.
	 *
	 * @param userName the user name of this second opinion
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this second opinion.
	 *
	 * @param userUuid the user uuid of this second opinion
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this second opinion.
	 *
	 * @param uuid the uuid of this second opinion
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
	protected SecondOpinionWrapper wrap(SecondOpinion secondOpinion) {
		return new SecondOpinionWrapper(secondOpinion);
	}

}