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

package com.liferay.hms.enquiry.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Enquiry}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Enquiry
 * @generated
 */
public class EnquiryWrapper
	extends BaseModelWrapper<Enquiry>
	implements Enquiry, ModelWrapper<Enquiry> {

	public EnquiryWrapper(Enquiry enquiry) {
		super(enquiry);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("enquiryId", getEnquiryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("mobileNo", getMobileNo());
		attributes.put("concern", getConcern());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long enquiryId = (Long)attributes.get("enquiryId");

		if (enquiryId != null) {
			setEnquiryId(enquiryId);
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

		String mobileNo = (String)attributes.get("mobileNo");

		if (mobileNo != null) {
			setMobileNo(mobileNo);
		}

		String concern = (String)attributes.get("concern");

		if (concern != null) {
			setConcern(concern);
		}
	}

	@Override
	public Enquiry cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this enquiry.
	 *
	 * @return the company ID of this enquiry
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the concern of this enquiry.
	 *
	 * @return the concern of this enquiry
	 */
	@Override
	public String getConcern() {
		return model.getConcern();
	}

	/**
	 * Returns the create date of this enquiry.
	 *
	 * @return the create date of this enquiry
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the enquiry ID of this enquiry.
	 *
	 * @return the enquiry ID of this enquiry
	 */
	@Override
	public long getEnquiryId() {
		return model.getEnquiryId();
	}

	/**
	 * Returns the group ID of this enquiry.
	 *
	 * @return the group ID of this enquiry
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mobile no of this enquiry.
	 *
	 * @return the mobile no of this enquiry
	 */
	@Override
	public String getMobileNo() {
		return model.getMobileNo();
	}

	/**
	 * Returns the modified date of this enquiry.
	 *
	 * @return the modified date of this enquiry
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this enquiry.
	 *
	 * @return the name of this enquiry
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this enquiry.
	 *
	 * @return the primary key of this enquiry
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this enquiry.
	 *
	 * @return the user ID of this enquiry
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this enquiry.
	 *
	 * @return the user name of this enquiry
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this enquiry.
	 *
	 * @return the user uuid of this enquiry
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this enquiry.
	 *
	 * @return the uuid of this enquiry
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
	 * Sets the company ID of this enquiry.
	 *
	 * @param companyId the company ID of this enquiry
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the concern of this enquiry.
	 *
	 * @param concern the concern of this enquiry
	 */
	@Override
	public void setConcern(String concern) {
		model.setConcern(concern);
	}

	/**
	 * Sets the create date of this enquiry.
	 *
	 * @param createDate the create date of this enquiry
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the enquiry ID of this enquiry.
	 *
	 * @param enquiryId the enquiry ID of this enquiry
	 */
	@Override
	public void setEnquiryId(long enquiryId) {
		model.setEnquiryId(enquiryId);
	}

	/**
	 * Sets the group ID of this enquiry.
	 *
	 * @param groupId the group ID of this enquiry
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mobile no of this enquiry.
	 *
	 * @param mobileNo the mobile no of this enquiry
	 */
	@Override
	public void setMobileNo(String mobileNo) {
		model.setMobileNo(mobileNo);
	}

	/**
	 * Sets the modified date of this enquiry.
	 *
	 * @param modifiedDate the modified date of this enquiry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this enquiry.
	 *
	 * @param name the name of this enquiry
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this enquiry.
	 *
	 * @param primaryKey the primary key of this enquiry
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this enquiry.
	 *
	 * @param userId the user ID of this enquiry
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this enquiry.
	 *
	 * @param userName the user name of this enquiry
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this enquiry.
	 *
	 * @param userUuid the user uuid of this enquiry
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this enquiry.
	 *
	 * @param uuid the uuid of this enquiry
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
	protected EnquiryWrapper wrap(Enquiry enquiry) {
		return new EnquiryWrapper(enquiry);
	}

}