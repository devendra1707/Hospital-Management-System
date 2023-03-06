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
 * Provides a wrapper for {@link EnquiryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EnquiryLocalService
 * @generated
 */
public class EnquiryLocalServiceWrapper
	implements EnquiryLocalService, ServiceWrapper<EnquiryLocalService> {

	public EnquiryLocalServiceWrapper() {
		this(null);
	}

	public EnquiryLocalServiceWrapper(EnquiryLocalService enquiryLocalService) {
		_enquiryLocalService = enquiryLocalService;
	}

	/**
	 * Adds the enquiry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnquiryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param enquiry the enquiry
	 * @return the enquiry that was added
	 */
	@Override
	public com.liferay.hms.enquiry.model.Enquiry addEnquiry(
		com.liferay.hms.enquiry.model.Enquiry enquiry) {

		return _enquiryLocalService.addEnquiry(enquiry);
	}

	/**
	 * Creates a new enquiry with the primary key. Does not add the enquiry to the database.
	 *
	 * @param enquiryId the primary key for the new enquiry
	 * @return the new enquiry
	 */
	@Override
	public com.liferay.hms.enquiry.model.Enquiry createEnquiry(long enquiryId) {
		return _enquiryLocalService.createEnquiry(enquiryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enquiryLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the enquiry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnquiryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param enquiry the enquiry
	 * @return the enquiry that was removed
	 */
	@Override
	public com.liferay.hms.enquiry.model.Enquiry deleteEnquiry(
		com.liferay.hms.enquiry.model.Enquiry enquiry) {

		return _enquiryLocalService.deleteEnquiry(enquiry);
	}

	/**
	 * Deletes the enquiry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnquiryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry that was removed
	 * @throws PortalException if a enquiry with the primary key could not be found
	 */
	@Override
	public com.liferay.hms.enquiry.model.Enquiry deleteEnquiry(long enquiryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enquiryLocalService.deleteEnquiry(enquiryId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enquiryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _enquiryLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _enquiryLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _enquiryLocalService.dynamicQuery();
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

		return _enquiryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.enquiry.model.impl.EnquiryModelImpl</code>.
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

		return _enquiryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.enquiry.model.impl.EnquiryModelImpl</code>.
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

		return _enquiryLocalService.dynamicQuery(
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

		return _enquiryLocalService.dynamicQueryCount(dynamicQuery);
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

		return _enquiryLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.hms.enquiry.model.Enquiry fetchEnquiry(long enquiryId) {
		return _enquiryLocalService.fetchEnquiry(enquiryId);
	}

	/**
	 * Returns the enquiry matching the UUID and group.
	 *
	 * @param uuid the enquiry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public com.liferay.hms.enquiry.model.Enquiry fetchEnquiryByUuidAndGroupId(
		String uuid, long groupId) {

		return _enquiryLocalService.fetchEnquiryByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _enquiryLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the enquiries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.enquiry.model.impl.EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @return the range of enquiries
	 */
	@Override
	public java.util.List<com.liferay.hms.enquiry.model.Enquiry> getEnquiries(
		int start, int end) {

		return _enquiryLocalService.getEnquiries(start, end);
	}

	/**
	 * Returns all the enquiries matching the UUID and company.
	 *
	 * @param uuid the UUID of the enquiries
	 * @param companyId the primary key of the company
	 * @return the matching enquiries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.hms.enquiry.model.Enquiry>
		getEnquiriesByUuidAndCompanyId(String uuid, long companyId) {

		return _enquiryLocalService.getEnquiriesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of enquiries matching the UUID and company.
	 *
	 * @param uuid the UUID of the enquiries
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching enquiries, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.hms.enquiry.model.Enquiry>
		getEnquiriesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.hms.enquiry.model.Enquiry> orderByComparator) {

		return _enquiryLocalService.getEnquiriesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of enquiries.
	 *
	 * @return the number of enquiries
	 */
	@Override
	public int getEnquiriesCount() {
		return _enquiryLocalService.getEnquiriesCount();
	}

	/**
	 * Returns the enquiry with the primary key.
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry
	 * @throws PortalException if a enquiry with the primary key could not be found
	 */
	@Override
	public com.liferay.hms.enquiry.model.Enquiry getEnquiry(long enquiryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enquiryLocalService.getEnquiry(enquiryId);
	}

	/**
	 * Returns the enquiry matching the UUID and group.
	 *
	 * @param uuid the enquiry's UUID
	 * @param groupId the primary key of the group
	 * @return the matching enquiry
	 * @throws PortalException if a matching enquiry could not be found
	 */
	@Override
	public com.liferay.hms.enquiry.model.Enquiry getEnquiryByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enquiryLocalService.getEnquiryByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _enquiryLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _enquiryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _enquiryLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _enquiryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the enquiry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EnquiryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param enquiry the enquiry
	 * @return the enquiry that was updated
	 */
	@Override
	public com.liferay.hms.enquiry.model.Enquiry updateEnquiry(
		com.liferay.hms.enquiry.model.Enquiry enquiry) {

		return _enquiryLocalService.updateEnquiry(enquiry);
	}

	@Override
	public EnquiryLocalService getWrappedService() {
		return _enquiryLocalService;
	}

	@Override
	public void setWrappedService(EnquiryLocalService enquiryLocalService) {
		_enquiryLocalService = enquiryLocalService;
	}

	private EnquiryLocalService _enquiryLocalService;

}