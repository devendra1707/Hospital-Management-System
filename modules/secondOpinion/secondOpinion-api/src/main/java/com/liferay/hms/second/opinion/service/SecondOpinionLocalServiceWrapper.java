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
 * Provides a wrapper for {@link SecondOpinionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SecondOpinionLocalService
 * @generated
 */
public class SecondOpinionLocalServiceWrapper
	implements SecondOpinionLocalService,
			   ServiceWrapper<SecondOpinionLocalService> {

	public SecondOpinionLocalServiceWrapper() {
		this(null);
	}

	public SecondOpinionLocalServiceWrapper(
		SecondOpinionLocalService secondOpinionLocalService) {

		_secondOpinionLocalService = secondOpinionLocalService;
	}

	/**
	 * Adds the second opinion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondOpinionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondOpinion the second opinion
	 * @return the second opinion that was added
	 */
	@Override
	public com.liferay.hms.second.opinion.model.SecondOpinion addSecondOpinion(
		com.liferay.hms.second.opinion.model.SecondOpinion secondOpinion) {

		return _secondOpinionLocalService.addSecondOpinion(secondOpinion);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondOpinionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new second opinion with the primary key. Does not add the second opinion to the database.
	 *
	 * @param id the primary key for the new second opinion
	 * @return the new second opinion
	 */
	@Override
	public com.liferay.hms.second.opinion.model.SecondOpinion
		createSecondOpinion(long id) {

		return _secondOpinionLocalService.createSecondOpinion(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondOpinionLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the second opinion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondOpinionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the second opinion
	 * @return the second opinion that was removed
	 * @throws PortalException if a second opinion with the primary key could not be found
	 */
	@Override
	public com.liferay.hms.second.opinion.model.SecondOpinion
			deleteSecondOpinion(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondOpinionLocalService.deleteSecondOpinion(id);
	}

	/**
	 * Deletes the second opinion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondOpinionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondOpinion the second opinion
	 * @return the second opinion that was removed
	 */
	@Override
	public com.liferay.hms.second.opinion.model.SecondOpinion
		deleteSecondOpinion(
			com.liferay.hms.second.opinion.model.SecondOpinion secondOpinion) {

		return _secondOpinionLocalService.deleteSecondOpinion(secondOpinion);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _secondOpinionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _secondOpinionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _secondOpinionLocalService.dynamicQuery();
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

		return _secondOpinionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.second.opinion.model.impl.SecondOpinionModelImpl</code>.
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

		return _secondOpinionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.second.opinion.model.impl.SecondOpinionModelImpl</code>.
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

		return _secondOpinionLocalService.dynamicQuery(
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

		return _secondOpinionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _secondOpinionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.hms.second.opinion.model.SecondOpinion
		fetchSecondOpinion(long id) {

		return _secondOpinionLocalService.fetchSecondOpinion(id);
	}

	/**
	 * Returns the second opinion matching the UUID and group.
	 *
	 * @param uuid the second opinion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	@Override
	public com.liferay.hms.second.opinion.model.SecondOpinion
		fetchSecondOpinionByUuidAndGroupId(String uuid, long groupId) {

		return _secondOpinionLocalService.fetchSecondOpinionByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _secondOpinionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _secondOpinionLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _secondOpinionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _secondOpinionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondOpinionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the second opinion with the primary key.
	 *
	 * @param id the primary key of the second opinion
	 * @return the second opinion
	 * @throws PortalException if a second opinion with the primary key could not be found
	 */
	@Override
	public com.liferay.hms.second.opinion.model.SecondOpinion getSecondOpinion(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondOpinionLocalService.getSecondOpinion(id);
	}

	/**
	 * Returns the second opinion matching the UUID and group.
	 *
	 * @param uuid the second opinion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching second opinion
	 * @throws PortalException if a matching second opinion could not be found
	 */
	@Override
	public com.liferay.hms.second.opinion.model.SecondOpinion
			getSecondOpinionByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _secondOpinionLocalService.getSecondOpinionByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the second opinions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.second.opinion.model.impl.SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @return the range of second opinions
	 */
	@Override
	public java.util.List<com.liferay.hms.second.opinion.model.SecondOpinion>
		getSecondOpinions(int start, int end) {

		return _secondOpinionLocalService.getSecondOpinions(start, end);
	}

	/**
	 * Returns all the second opinions matching the UUID and company.
	 *
	 * @param uuid the UUID of the second opinions
	 * @param companyId the primary key of the company
	 * @return the matching second opinions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.hms.second.opinion.model.SecondOpinion>
		getSecondOpinionsByUuidAndCompanyId(String uuid, long companyId) {

		return _secondOpinionLocalService.getSecondOpinionsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of second opinions matching the UUID and company.
	 *
	 * @param uuid the UUID of the second opinions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching second opinions, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.hms.second.opinion.model.SecondOpinion>
		getSecondOpinionsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.hms.second.opinion.model.SecondOpinion>
					orderByComparator) {

		return _secondOpinionLocalService.getSecondOpinionsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of second opinions.
	 *
	 * @return the number of second opinions
	 */
	@Override
	public int getSecondOpinionsCount() {
		return _secondOpinionLocalService.getSecondOpinionsCount();
	}

	/**
	 * Updates the second opinion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SecondOpinionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param secondOpinion the second opinion
	 * @return the second opinion that was updated
	 */
	@Override
	public com.liferay.hms.second.opinion.model.SecondOpinion
		updateSecondOpinion(
			com.liferay.hms.second.opinion.model.SecondOpinion secondOpinion) {

		return _secondOpinionLocalService.updateSecondOpinion(secondOpinion);
	}

	@Override
	public SecondOpinionLocalService getWrappedService() {
		return _secondOpinionLocalService;
	}

	@Override
	public void setWrappedService(
		SecondOpinionLocalService secondOpinionLocalService) {

		_secondOpinionLocalService = secondOpinionLocalService;
	}

	private SecondOpinionLocalService _secondOpinionLocalService;

}