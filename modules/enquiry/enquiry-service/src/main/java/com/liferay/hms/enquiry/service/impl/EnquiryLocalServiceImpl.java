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

import com.liferay.hms.enquiry.service.base.EnquiryLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.hms.enquiry.model.Enquiry",
	service = AopService.class
)
public class EnquiryLocalServiceImpl extends EnquiryLocalServiceBaseImpl {

	
	// Create Enquiry
	
//	public Enquiry create(String name, String mobileNo, String concern) {
//		long enquiryId = CounterLocalServiceUtil.increment(this.getClass().getName());
//		Enquiry enquiry = EnquiryUtil.create(enquiryId);
//		enquiry.setName(name);
//		enquiry.setMobileNo(mobileNo);
//		enquiry.setConcern(concern);
//		
//		return EnquiryUtil.update(enquiry);
//		   
//	}
	
//	public Appointment findAppointment(long appointmentId) {
//			
//		
//		Appointment appointment = null;
//		try {
//			appointment = AppointmentLocalServiceUtil.fetchAppointment(appointmentId);
//		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return appointment;
//		
//	} 
//	@Reference
//	AppointmentLocalService appointmentLocalService;
}