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

package com.liferay.hms.internationalpatients.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InternationService}.
 *
 * @author Brian Wing Shun Chan
 * @see InternationService
 * @generated
 */
public class InternationServiceWrapper
	implements InternationService, ServiceWrapper<InternationService> {

	public InternationServiceWrapper() {
		this(null);
	}

	public InternationServiceWrapper(InternationService internationService) {
		_internationService = internationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _internationService.getOSGiServiceIdentifier();
	}

	@Override
	public InternationService getWrappedService() {
		return _internationService;
	}

	@Override
	public void setWrappedService(InternationService internationService) {
		_internationService = internationService;
	}

	private InternationService _internationService;

}