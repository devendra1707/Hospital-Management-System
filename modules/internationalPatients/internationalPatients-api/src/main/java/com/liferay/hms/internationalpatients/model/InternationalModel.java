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

package com.liferay.hms.internationalpatients.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the International service. Represents a row in the &quot;HMS_International&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.hms.internationalpatients.model.impl.InternationalModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.hms.internationalpatients.model.impl.InternationalImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see International
 * @generated
 */
@ProviderType
public interface InternationalModel
	extends BaseModel<International>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a international model instance should use the {@link International} interface instead.
	 */

	/**
	 * Returns the primary key of this international.
	 *
	 * @return the primary key of this international
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this international.
	 *
	 * @param primaryKey the primary key of this international
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this international.
	 *
	 * @return the uuid of this international
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this international.
	 *
	 * @param uuid the uuid of this international
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the ID of this international.
	 *
	 * @return the ID of this international
	 */
	public long getId();

	/**
	 * Sets the ID of this international.
	 *
	 * @param id the ID of this international
	 */
	public void setId(long id);

	/**
	 * Returns the group ID of this international.
	 *
	 * @return the group ID of this international
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this international.
	 *
	 * @param groupId the group ID of this international
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this international.
	 *
	 * @return the company ID of this international
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this international.
	 *
	 * @param companyId the company ID of this international
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this international.
	 *
	 * @return the user ID of this international
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this international.
	 *
	 * @param userId the user ID of this international
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this international.
	 *
	 * @return the user uuid of this international
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this international.
	 *
	 * @param userUuid the user uuid of this international
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this international.
	 *
	 * @return the user name of this international
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this international.
	 *
	 * @param userName the user name of this international
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this international.
	 *
	 * @return the create date of this international
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this international.
	 *
	 * @param createDate the create date of this international
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this international.
	 *
	 * @return the modified date of this international
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this international.
	 *
	 * @param modifiedDate the modified date of this international
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this international.
	 *
	 * @return the name of this international
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this international.
	 *
	 * @param name the name of this international
	 */
	public void setName(String name);

	/**
	 * Returns the email of this international.
	 *
	 * @return the email of this international
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this international.
	 *
	 * @param email the email of this international
	 */
	public void setEmail(String email);

	/**
	 * Returns the country of this international.
	 *
	 * @return the country of this international
	 */
	@AutoEscape
	public String getCountry();

	/**
	 * Sets the country of this international.
	 *
	 * @param country the country of this international
	 */
	public void setCountry(String country);

	/**
	 * Returns the mobile of this international.
	 *
	 * @return the mobile of this international
	 */
	@AutoEscape
	public String getMobile();

	/**
	 * Sets the mobile of this international.
	 *
	 * @param mobile the mobile of this international
	 */
	public void setMobile(String mobile);

	/**
	 * Returns the query of this international.
	 *
	 * @return the query of this international
	 */
	@AutoEscape
	public String getQuery();

	/**
	 * Sets the query of this international.
	 *
	 * @param query the query of this international
	 */
	public void setQuery(String query);

	@Override
	public International cloneWithOriginalValues();

}