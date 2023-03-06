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

package com.liferay.hms.appointment.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AppointmentLocalService}.
 *
 * @author devendra
 * @see AppointmentLocalService
 * @generated
 */
public class AppointmentLocalServiceWrapper
	implements AppointmentLocalService,
			   ServiceWrapper<AppointmentLocalService> {

	public AppointmentLocalServiceWrapper() {
		this(null);
	}

	public AppointmentLocalServiceWrapper(
		AppointmentLocalService appointmentLocalService) {

		_appointmentLocalService = appointmentLocalService;
	}

	/**
	 * Adds the appointment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppointmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appointment the appointment
	 * @return the appointment that was added
	 */
	@Override
	public com.liferay.hms.appointment.model.Appointment addAppointment(
		com.liferay.hms.appointment.model.Appointment appointment) {

		return _appointmentLocalService.addAppointment(appointment);
	}

	/**
	 * Creates a new appointment with the primary key. Does not add the appointment to the database.
	 *
	 * @param appointmentId the primary key for the new appointment
	 * @return the new appointment
	 */
	@Override
	public com.liferay.hms.appointment.model.Appointment createAppointment(
		long appointmentId) {

		return _appointmentLocalService.createAppointment(appointmentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appointmentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the appointment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppointmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appointment the appointment
	 * @return the appointment that was removed
	 */
	@Override
	public com.liferay.hms.appointment.model.Appointment deleteAppointment(
		com.liferay.hms.appointment.model.Appointment appointment) {

		return _appointmentLocalService.deleteAppointment(appointment);
	}

	/**
	 * Deletes the appointment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppointmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment that was removed
	 * @throws PortalException if a appointment with the primary key could not be found
	 */
	@Override
	public com.liferay.hms.appointment.model.Appointment deleteAppointment(
			long appointmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appointmentLocalService.deleteAppointment(appointmentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appointmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _appointmentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _appointmentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _appointmentLocalService.dynamicQuery();
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

		return _appointmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.appointment.model.impl.AppointmentModelImpl</code>.
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

		return _appointmentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.appointment.model.impl.AppointmentModelImpl</code>.
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

		return _appointmentLocalService.dynamicQuery(
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

		return _appointmentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _appointmentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.hms.appointment.model.Appointment fetchAppointment(
		long appointmentId) {

		return _appointmentLocalService.fetchAppointment(appointmentId);
	}

	/**
	 * Returns the appointment matching the UUID and group.
	 *
	 * @param uuid the appointment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public com.liferay.hms.appointment.model.Appointment
		fetchAppointmentByUuidAndGroupId(String uuid, long groupId) {

		return _appointmentLocalService.fetchAppointmentByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _appointmentLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the appointment with the primary key.
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment
	 * @throws PortalException if a appointment with the primary key could not be found
	 */
	@Override
	public com.liferay.hms.appointment.model.Appointment getAppointment(
			long appointmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appointmentLocalService.getAppointment(appointmentId);
	}

	/**
	 * Returns the appointment matching the UUID and group.
	 *
	 * @param uuid the appointment's UUID
	 * @param groupId the primary key of the group
	 * @return the matching appointment
	 * @throws PortalException if a matching appointment could not be found
	 */
	@Override
	public com.liferay.hms.appointment.model.Appointment
			getAppointmentByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appointmentLocalService.getAppointmentByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the appointments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.hms.appointment.model.impl.AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @return the range of appointments
	 */
	@Override
	public java.util.List<com.liferay.hms.appointment.model.Appointment>
		getAppointments(int start, int end) {

		return _appointmentLocalService.getAppointments(start, end);
	}

	/**
	 * Returns all the appointments matching the UUID and company.
	 *
	 * @param uuid the UUID of the appointments
	 * @param companyId the primary key of the company
	 * @return the matching appointments, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.hms.appointment.model.Appointment>
		getAppointmentsByUuidAndCompanyId(String uuid, long companyId) {

		return _appointmentLocalService.getAppointmentsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of appointments matching the UUID and company.
	 *
	 * @param uuid the UUID of the appointments
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching appointments, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.hms.appointment.model.Appointment>
		getAppointmentsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.hms.appointment.model.Appointment>
					orderByComparator) {

		return _appointmentLocalService.getAppointmentsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of appointments.
	 *
	 * @return the number of appointments
	 */
	@Override
	public int getAppointmentsCount() {
		return _appointmentLocalService.getAppointmentsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _appointmentLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _appointmentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _appointmentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appointmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the appointment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppointmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appointment the appointment
	 * @return the appointment that was updated
	 */
	@Override
	public com.liferay.hms.appointment.model.Appointment updateAppointment(
		com.liferay.hms.appointment.model.Appointment appointment) {

		return _appointmentLocalService.updateAppointment(appointment);
	}

	@Override
	public AppointmentLocalService getWrappedService() {
		return _appointmentLocalService;
	}

	@Override
	public void setWrappedService(
		AppointmentLocalService appointmentLocalService) {

		_appointmentLocalService = appointmentLocalService;
	}

	private AppointmentLocalService _appointmentLocalService;

}