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

package com.liferay.hms.enquiry.service.impl;

import com.liferay.hms.enquiry.model.Enquiry;
import com.liferay.hms.enquiry.service.base.EnquiryServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=hms",
		"json.web.service.context.path=Enquiry"
	},
	service = AopService.class
)
public class EnquiryServiceImpl extends EnquiryServiceBaseImpl {
	
	// Create Enquiry
	
//		public Enquiry create(String name, String mobileNo, String concern) {
//			return enquiryLocalService.create(name, mobileNo, concern);
//		} 
	
}