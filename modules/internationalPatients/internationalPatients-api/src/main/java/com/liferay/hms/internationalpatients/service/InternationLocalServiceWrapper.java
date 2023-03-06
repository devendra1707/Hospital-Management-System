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
 * Provides a wrapper for {@link InternationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see InternationLocalService
 * @generated
 */
public class InternationLocalServiceWrapper
	implements InternationLocalService,
			   ServiceWrapper<InternationLocalService> {

	public InternationLocalServiceWrapper() {
		this(null);
	}

	public InternationLocalServiceWrapper(
		InternationLocalService internationLocalService) {

		_internationLocalService = internationLocalService;
	}

	/**
	 * Adds the internation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InternationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param internation the internation
	 * @return the internation that was added
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.Internation
		addInternation(
			com.liferay.hms.internationalpatients.model.Internation
				internation) {

		return _internationLocalService.addInternation(internation);
	}

	/**
	 * Creates a new internation with the primary key. Does not add the internation to the database.
	 *
	 * @param id the primary key for the new internation
	 * @return the new internation
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.Internation
		createInternation(long id) {

		return _internationLocalService.createInternation(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the internation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InternationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param internation the internation
	 * @return the internation that was removed
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.Internation
		deleteInternation(
			com.liferay.hms.internationalpatients.model.Internation
				internation) {

		return _internationLocalService.deleteInternation(internation);
	}

	/**
	 * Deletes the internation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InternationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the internation
	 * @return the internation that was removed
	 * @throws PortalException if a internation with the primary key could not be found
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.Internation
			deleteInternation(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationLocalService.deleteInternation(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _internationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _internationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _internationLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _internationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.internationalpatients.model.impl.InternationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _internationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.internationalpatients.model.impl.InternationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _internationLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _internationLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _internationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.hms.internationalpatients.model.Internation
		fetchInternation(long id) {

		return _internationLocalService.fetchInternation(id);
	}

	/**
	 * Returns the internation matching the UUID and group.
	 *
	 * @param uuid the internation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching internation, or <code>null</code> if a matching internation could not be found
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.Internation
		fetchInternationByUuidAndGroupId(String uuid, long groupId) {

		return _internationLocalService.fetchInternationByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _internationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _internationLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _internationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the internation with the primary key.
	 *
	 * @param id the primary key of the internation
	 * @return the internation
	 * @throws PortalException if a internation with the primary key could not be found
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.Internation
			getInternation(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationLocalService.getInternation(id);
	}

	/**
	 * Returns the internation matching the UUID and group.
	 *
	 * @param uuid the internation's UUID
	 * @param groupId the primary key of the group
	 * @return the matching internation
	 * @throws PortalException if a matching internation could not be found
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.Internation
			getInternationByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationLocalService.getInternationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the internations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.internationalpatients.model.impl.InternationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @return the range of internations
	 */
	@Override
	public java.util.List
		<com.liferay.hms.internationalpatients.model.Internation>
			getInternations(int start, int end) {

		return _internationLocalService.getInternations(start, end);
	}

	/**
	 * Returns all the internations matching the UUID and company.
	 *
	 * @param uuid the UUID of the internations
	 * @param companyId the primary key of the company
	 * @return the matching internations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.liferay.hms.internationalpatients.model.Internation>
			getInternationsByUuidAndCompanyId(String uuid, long companyId) {

		return _internationLocalService.getInternationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of internations matching the UUID and company.
	 *
	 * @param uuid the UUID of the internations
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching internations, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.liferay.hms.internationalpatients.model.Internation>
			getInternationsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.hms.internationalpatients.model.Internation>
						orderByComparator) {

		return _internationLocalService.getInternationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of internations.
	 *
	 * @return the number of internations
	 */
	@Override
	public int getInternationsCount() {
		return _internationLocalService.getInternationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _internationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the internation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InternationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param internation the internation
	 * @return the internation that was updated
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.Internation
		updateInternation(
			com.liferay.hms.internationalpatients.model.Internation
				internation) {

		return _internationLocalService.updateInternation(internation);
	}

	@Override
	public InternationLocalService getWrappedService() {
		return _internationLocalService;
	}

	@Override
	public void setWrappedService(
		InternationLocalService internationLocalService) {

		_internationLocalService = internationLocalService;
	}

	private InternationLocalService _internationLocalService;

}