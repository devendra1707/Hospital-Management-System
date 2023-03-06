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

package com.liferay.hms.second.opinion.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SecondOpinionService}.
 *
 * @author Brian Wing Shun Chan
 * @see SecondOpinionService
 * @generated
 */
public class SecondOpinionServiceWrapper
	implements SecondOpinionService, ServiceWrapper<SecondOpinionService> {

	public SecondOpinionServiceWrapper() {
		this(null);
	}

	public SecondOpinionServiceWrapper(
		SecondOpinionService secondOpinionService) {

		_secondOpinionService = secondOpinionService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _secondOpinionService.getOSGiServiceIdentifier();
	}

	@Override
	public SecondOpinionService getWrappedService() {
		return _secondOpinionService;
	}

	@Override
	public void setWrappedService(SecondOpinionService secondOpinionService) {
		_secondOpinionService = secondOpinionService;
	}

	private SecondOpinionService _secondOpinionService;

}