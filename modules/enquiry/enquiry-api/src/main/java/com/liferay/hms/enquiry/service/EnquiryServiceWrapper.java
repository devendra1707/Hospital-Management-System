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

package com.liferay.hms.enquiry.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EnquiryService}.
 *
 * @author Brian Wing Shun Chan
 * @see EnquiryService
 * @generated
 */
public class EnquiryServiceWrapper
	implements EnquiryService, ServiceWrapper<EnquiryService> {

	public EnquiryServiceWrapper() {
		this(null);
	}

	public EnquiryServiceWrapper(EnquiryService enquiryService) {
		_enquiryService = enquiryService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _enquiryService.getOSGiServiceIdentifier();
	}

	@Override
	public EnquiryService getWrappedService() {
		return _enquiryService;
	}

	@Override
	public void setWrappedService(EnquiryService enquiryService) {
		_enquiryService = enquiryService;
	}

	private EnquiryService _enquiryService;

}