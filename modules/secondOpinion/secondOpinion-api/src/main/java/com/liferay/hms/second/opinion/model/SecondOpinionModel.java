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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the SecondOpinion service. Represents a row in the &quot;hms_SecondOpinion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.hms.second.opinion.model.impl.SecondOpinionModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.hms.second.opinion.model.impl.SecondOpinionImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondOpinion
 * @generated
 */
@ProviderType
public interface SecondOpinionModel
	extends BaseModel<SecondOpinion>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a second opinion model instance should use the {@link SecondOpinion} interface instead.
	 */

	/**
	 * Returns the primary key of this second opinion.
	 *
	 * @return the primary key of this second opinion
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this second opinion.
	 *
	 * @param primaryKey the primary key of this second opinion
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this second opinion.
	 *
	 * @return the uuid of this second opinion
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this second opinion.
	 *
	 * @param uuid the uuid of this second opinion
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this second opinion.
	 *
	 * @return the ID of this second opinion
	 */
	public long getId();

	/**
	 * Sets the ID of this second opinion.
	 *
	 * @param id the ID of this second opinion
	 */
	public void setId(long id);

	/**
	 * Returns the group ID of this second opinion.
	 *
	 * @return the group ID of this second opinion
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this second opinion.
	 *
	 * @param groupId the group ID of this second opinion
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this second opinion.
	 *
	 * @return the company ID of this second opinion
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this second opinion.
	 *
	 * @param companyId the company ID of this second opinion
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this second opinion.
	 *
	 * @return the user ID of this second opinion
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this second opinion.
	 *
	 * @param userId the user ID of this second opinion
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this second opinion.
	 *
	 * @return the user uuid of this second opinion
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this second opinion.
	 *
	 * @param userUuid the user uuid of this second opinion
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this second opinion.
	 *
	 * @return the user name of this second opinion
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this second opinion.
	 *
	 * @param userName the user name of this second opinion
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this second opinion.
	 *
	 * @return the create date of this second opinion
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this second opinion.
	 *
	 * @param createDate the create date of this second opinion
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this second opinion.
	 *
	 * @return the modified date of this second opinion
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this second opinion.
	 *
	 * @param modifiedDate the modified date of this second opinion
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this second opinion.
	 *
	 * @return the name of this second opinion
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this second opinion.
	 *
	 * @param name the name of this second opinion
	 */
	public void setName(String name);

	/**
	 * Returns the email of this second opinion.
	 *
	 * @return the email of this second opinion
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this second opinion.
	 *
	 * @param email the email of this second opinion
	 */
	public void setEmail(String email);

	/**
	 * Returns the mobile of this second opinion.
	 *
	 * @return the mobile of this second opinion
	 */
	@AutoEscape
	public String getMobile();

	/**
	 * Sets the mobile of this second opinion.
	 *
	 * @param mobile the mobile of this second opinion
	 */
	public void setMobile(String mobile);

	/**
	 * Returns the specialty of this second opinion.
	 *
	 * @return the specialty of this second opinion
	 */
	@AutoEscape
	public String getSpecialty();

	/**
	 * Sets the specialty of this second opinion.
	 *
	 * @param specialty the specialty of this second opinion
	 */
	public void setSpecialty(String specialty);

	/**
	 * Returns the remark of this second opinion.
	 *
	 * @return the remark of this second opinion
	 */
	@AutoEscape
	public String getRemark();

	/**
	 * Sets the remark of this second opinion.
	 *
	 * @param remark the remark of this second opinion
	 */
	public void setRemark(String remark);

	@Override
	public SecondOpinion cloneWithOriginalValues();

}