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

package com.liferay.hms.second.opinion.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.hms.second.opinion.model.SecondOpinion;
import com.liferay.hms.second.opinion.service.SecondOpinionLocalService;
import com.liferay.hms.second.opinion.service.base.SecondOpinionLocalServiceBaseImpl;
import com.liferay.hms.second.opinion.service.persistence.SecondOpinionUtil;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.hms.second.opinion.model.SecondOpinion",
	service = AopService.class
)
public class SecondOpinionLocalServiceImpl
	extends SecondOpinionLocalServiceBaseImpl {
	
	// Create SecondOpinion
	
//	public SecondOpinionLocalService create(String name, String email, String mobile, String specialty, String remark) {
//		long id = CounterLocalServiceUtil.increment(this.getClass().getName());
//		SecondOpinion secondOpinion = SecondOpinionUtil.create(id);
//		secondOpinion.setName(name);
//		secondOpinion.setEmail(email);
//		secondOpinion.setMobile(mobile);
//		secondOpinion.setSpecialty(specialty);
//		secondOpinion.setRemark(remark);
//		
//		return SecondOpinionUtil.update(secondOpinion);
//		   
//	}
	
}