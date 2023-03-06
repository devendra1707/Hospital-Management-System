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
 * Provides a wrapper for {@link InternationalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see InternationalLocalService
 * @generated
 */
public class InternationalLocalServiceWrapper
	implements InternationalLocalService,
			   ServiceWrapper<InternationalLocalService> {

	public InternationalLocalServiceWrapper() {
		this(null);
	}

	public InternationalLocalServiceWrapper(
		InternationalLocalService internationalLocalService) {

		_internationalLocalService = internationalLocalService;
	}

	/**
	 * Adds the international to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InternationalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param international the international
	 * @return the international that was added
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.International
		addInternational(
			com.liferay.hms.internationalpatients.model.International
				international) {

		return _internationalLocalService.addInternational(international);
	}

	/**
	 * Creates a new international with the primary key. Does not add the international to the database.
	 *
	 * @param id the primary key for the new international
	 * @return the new international
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.International
		createInternational(long id) {

		return _internationalLocalService.createInternational(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationalLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the international from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InternationalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param international the international
	 * @return the international that was removed
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.International
		deleteInternational(
			com.liferay.hms.internationalpatients.model.International
				international) {

		return _internationalLocalService.deleteInternational(international);
	}

	/**
	 * Deletes the international with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InternationalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the international
	 * @return the international that was removed
	 * @throws PortalException if a international with the primary key could not be found
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.International
			deleteInternational(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationalLocalService.deleteInternational(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationalLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _internationalLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _internationalLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _internationalLocalService.dynamicQuery();
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

		return _internationalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.internationalpatients.model.impl.InternationalModelImpl</code>.
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

		return _internationalLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.internationalpatients.model.impl.InternationalModelImpl</code>.
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

		return _internationalLocalService.dynamicQuery(
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

		return _internationalLocalService.dynamicQueryCount(dynamicQuery);
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

		return _internationalLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.hms.internationalpatients.model.International
		fetchInternational(long id) {

		return _internationalLocalService.fetchInternational(id);
	}

	/**
	 * Returns the international matching the UUID and group.
	 *
	 * @param uuid the international's UUID
	 * @param groupId the primary key of the group
	 * @return the matching international, or <code>null</code> if a matching international could not be found
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.International
		fetchInternationalByUuidAndGroupId(String uuid, long groupId) {

		return _internationalLocalService.fetchInternationalByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _internationalLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _internationalLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _internationalLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the international with the primary key.
	 *
	 * @param id the primary key of the international
	 * @return the international
	 * @throws PortalException if a international with the primary key could not be found
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.International
			getInternational(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationalLocalService.getInternational(id);
	}

	/**
	 * Returns the international matching the UUID and group.
	 *
	 * @param uuid the international's UUID
	 * @param groupId the primary key of the group
	 * @return the matching international
	 * @throws PortalException if a matching international could not be found
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.International
			getInternationalByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationalLocalService.getInternationalByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the internationals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.internationalpatients.model.impl.InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @return the range of internationals
	 */
	@Override
	public java.util.List
		<com.liferay.hms.internationalpatients.model.International>
			getInternationals(int start, int end) {

		return _internationalLocalService.getInternationals(start, end);
	}

	/**
	 * Returns all the internationals matching the UUID and company.
	 *
	 * @param uuid the UUID of the internationals
	 * @param companyId the primary key of the company
	 * @return the matching internationals, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.liferay.hms.internationalpatients.model.International>
			getInternationalsByUuidAndCompanyId(String uuid, long companyId) {

		return _internationalLocalService.getInternationalsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of internationals matching the UUID and company.
	 *
	 * @param uuid the UUID of the internationals
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching internationals, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.liferay.hms.internationalpatients.model.International>
			getInternationalsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.liferay.hms.internationalpatients.model.International>
						orderByComparator) {

		return _internationalLocalService.getInternationalsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of internationals.
	 *
	 * @return the number of internationals
	 */
	@Override
	public int getInternationalsCount() {
		return _internationalLocalService.getInternationalsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _internationalLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _internationalLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the international in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect InternationalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param international the international
	 * @return the international that was updated
	 */
	@Override
	public com.liferay.hms.internationalpatients.model.International
		updateInternational(
			com.liferay.hms.internationalpatients.model.International
				international) {

		return _internationalLocalService.updateInternational(international);
	}

	@Override
	public InternationalLocalService getWrappedService() {
		return _internationalLocalService;
	}

	@Override
	public void setWrappedService(
		InternationalLocalService internationalLocalService) {

		_internationalLocalService = internationalLocalService;
	}

	private InternationalLocalService _internationalLocalService;

}