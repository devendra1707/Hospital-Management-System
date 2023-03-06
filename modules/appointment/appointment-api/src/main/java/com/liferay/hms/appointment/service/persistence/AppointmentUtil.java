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

package com.liferay.hms.appointment.service.persistence;

import com.liferay.hms.appointment.model.Appointment;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the appointment service. This utility wraps <code>com.liferay.hms.appointment.service.persistence.impl.AppointmentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author devendra
 * @see AppointmentPersistence
 * @generated
 */
public class AppointmentUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Appointment appointment) {
		getPersistence().clearCache(appointment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Appointment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Appointment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Appointment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Appointment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Appointment update(Appointment appointment) {
		return getPersistence().update(appointment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Appointment update(
		Appointment appointment, ServiceContext serviceContext) {

		return getPersistence().update(appointment, serviceContext);
	}

	/**
	 * Returns all the appointments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching appointments
	 */
	public static List<Appointment> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the appointments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @return the range of matching appointments
	 */
	public static List<Appointment> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the appointments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching appointments
	 */
	public static List<Appointment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appointments where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching appointments
	 */
	public static List<Appointment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByUuid_First(
			String uuid, OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByUuid_First(
		String uuid, OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByUuid_Last(
			String uuid, OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByUuid_Last(
		String uuid, OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the appointments before and after the current appointment in the ordered set where uuid = &#63;.
	 *
	 * @param appointmentId the primary key of the current appointment
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public static Appointment[] findByUuid_PrevAndNext(
			long appointmentId, String uuid,
			OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByUuid_PrevAndNext(
			appointmentId, uuid, orderByComparator);
	}

	/**
	 * Removes all the appointments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of appointments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching appointments
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the appointment where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAppointmentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByUUID_G(String uuid, long groupId)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the appointment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the appointment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the appointment where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the appointment that was removed
	 */
	public static Appointment removeByUUID_G(String uuid, long groupId)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of appointments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching appointments
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the appointments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching appointments
	 */
	public static List<Appointment> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the appointments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @return the range of matching appointments
	 */
	public static List<Appointment> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the appointments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching appointments
	 */
	public static List<Appointment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appointments where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching appointments
	 */
	public static List<Appointment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the appointments before and after the current appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param appointmentId the primary key of the current appointment
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public static Appointment[] findByUuid_C_PrevAndNext(
			long appointmentId, String uuid, long companyId,
			OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByUuid_C_PrevAndNext(
			appointmentId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the appointments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of appointments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching appointments
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the appointments where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching appointments
	 */
	public static List<Appointment> findByName(String name) {
		return getPersistence().findByName(name);
	}

	/**
	 * Returns a range of all the appointments where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @return the range of matching appointments
	 */
	public static List<Appointment> findByName(
		String name, int start, int end) {

		return getPersistence().findByName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the appointments where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching appointments
	 */
	public static List<Appointment> findByName(
		String name, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appointments where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching appointments
	 */
	public static List<Appointment> findByName(
		String name, int start, int end,
		OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByName_First(
			String name, OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	 * Returns the first appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByName_First(
		String name, OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	 * Returns the last appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByName_Last(
			String name, OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByName_Last(
		String name, OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the appointments before and after the current appointment in the ordered set where name = &#63;.
	 *
	 * @param appointmentId the primary key of the current appointment
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public static Appointment[] findByName_PrevAndNext(
			long appointmentId, String name,
			OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByName_PrevAndNext(
			appointmentId, name, orderByComparator);
	}

	/**
	 * Removes all the appointments where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByName(String name) {
		getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of appointments where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching appointments
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Returns all the appointments where country = &#63;.
	 *
	 * @param country the country
	 * @return the matching appointments
	 */
	public static List<Appointment> findByCountry(String country) {
		return getPersistence().findByCountry(country);
	}

	/**
	 * Returns a range of all the appointments where country = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param country the country
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @return the range of matching appointments
	 */
	public static List<Appointment> findByCountry(
		String country, int start, int end) {

		return getPersistence().findByCountry(country, start, end);
	}

	/**
	 * Returns an ordered range of all the appointments where country = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param country the country
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching appointments
	 */
	public static List<Appointment> findByCountry(
		String country, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().findByCountry(
			country, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appointments where country = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param country the country
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching appointments
	 */
	public static List<Appointment> findByCountry(
		String country, int start, int end,
		OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCountry(
			country, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByCountry_First(
			String country, OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByCountry_First(country, orderByComparator);
	}

	/**
	 * Returns the first appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByCountry_First(
		String country, OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().fetchByCountry_First(
			country, orderByComparator);
	}

	/**
	 * Returns the last appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByCountry_Last(
			String country, OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByCountry_Last(country, orderByComparator);
	}

	/**
	 * Returns the last appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByCountry_Last(
		String country, OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().fetchByCountry_Last(country, orderByComparator);
	}

	/**
	 * Returns the appointments before and after the current appointment in the ordered set where country = &#63;.
	 *
	 * @param appointmentId the primary key of the current appointment
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public static Appointment[] findByCountry_PrevAndNext(
			long appointmentId, String country,
			OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByCountry_PrevAndNext(
			appointmentId, country, orderByComparator);
	}

	/**
	 * Removes all the appointments where country = &#63; from the database.
	 *
	 * @param country the country
	 */
	public static void removeByCountry(String country) {
		getPersistence().removeByCountry(country);
	}

	/**
	 * Returns the number of appointments where country = &#63;.
	 *
	 * @param country the country
	 * @return the number of matching appointments
	 */
	public static int countByCountry(String country) {
		return getPersistence().countByCountry(country);
	}

	/**
	 * Returns all the appointments where age = &#63;.
	 *
	 * @param age the age
	 * @return the matching appointments
	 */
	public static List<Appointment> findByAge(String age) {
		return getPersistence().findByAge(age);
	}

	/**
	 * Returns a range of all the appointments where age = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param age the age
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @return the range of matching appointments
	 */
	public static List<Appointment> findByAge(String age, int start, int end) {
		return getPersistence().findByAge(age, start, end);
	}

	/**
	 * Returns an ordered range of all the appointments where age = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param age the age
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching appointments
	 */
	public static List<Appointment> findByAge(
		String age, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().findByAge(age, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appointments where age = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param age the age
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching appointments
	 */
	public static List<Appointment> findByAge(
		String age, int start, int end,
		OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByAge(
			age, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByAge_First(
			String age, OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByAge_First(age, orderByComparator);
	}

	/**
	 * Returns the first appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByAge_First(
		String age, OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().fetchByAge_First(age, orderByComparator);
	}

	/**
	 * Returns the last appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public static Appointment findByAge_Last(
			String age, OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByAge_Last(age, orderByComparator);
	}

	/**
	 * Returns the last appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public static Appointment fetchByAge_Last(
		String age, OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().fetchByAge_Last(age, orderByComparator);
	}

	/**
	 * Returns the appointments before and after the current appointment in the ordered set where age = &#63;.
	 *
	 * @param appointmentId the primary key of the current appointment
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public static Appointment[] findByAge_PrevAndNext(
			long appointmentId, String age,
			OrderByComparator<Appointment> orderByComparator)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByAge_PrevAndNext(
			appointmentId, age, orderByComparator);
	}

	/**
	 * Removes all the appointments where age = &#63; from the database.
	 *
	 * @param age the age
	 */
	public static void removeByAge(String age) {
		getPersistence().removeByAge(age);
	}

	/**
	 * Returns the number of appointments where age = &#63;.
	 *
	 * @param age the age
	 * @return the number of matching appointments
	 */
	public static int countByAge(String age) {
		return getPersistence().countByAge(age);
	}

	/**
	 * Caches the appointment in the entity cache if it is enabled.
	 *
	 * @param appointment the appointment
	 */
	public static void cacheResult(Appointment appointment) {
		getPersistence().cacheResult(appointment);
	}

	/**
	 * Caches the appointments in the entity cache if it is enabled.
	 *
	 * @param appointments the appointments
	 */
	public static void cacheResult(List<Appointment> appointments) {
		getPersistence().cacheResult(appointments);
	}

	/**
	 * Creates a new appointment with the primary key. Does not add the appointment to the database.
	 *
	 * @param appointmentId the primary key for the new appointment
	 * @return the new appointment
	 */
	public static Appointment create(long appointmentId) {
		return getPersistence().create(appointmentId);
	}

	/**
	 * Removes the appointment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment that was removed
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public static Appointment remove(long appointmentId)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().remove(appointmentId);
	}

	public static Appointment updateImpl(Appointment appointment) {
		return getPersistence().updateImpl(appointment);
	}

	/**
	 * Returns the appointment with the primary key or throws a <code>NoSuchAppointmentException</code> if it could not be found.
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public static Appointment findByPrimaryKey(long appointmentId)
		throws com.liferay.hms.appointment.exception.
			NoSuchAppointmentException {

		return getPersistence().findByPrimaryKey(appointmentId);
	}

	/**
	 * Returns the appointment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment, or <code>null</code> if a appointment with the primary key could not be found
	 */
	public static Appointment fetchByPrimaryKey(long appointmentId) {
		return getPersistence().fetchByPrimaryKey(appointmentId);
	}

	/**
	 * Returns all the appointments.
	 *
	 * @return the appointments
	 */
	public static List<Appointment> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the appointments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @return the range of appointments
	 */
	public static List<Appointment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the appointments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of appointments
	 */
	public static List<Appointment> findAll(
		int start, int end, OrderByComparator<Appointment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the appointments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppointmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of appointments
	 * @param end the upper bound of the range of appointments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of appointments
	 */
	public static List<Appointment> findAll(
		int start, int end, OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the appointments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of appointments.
	 *
	 * @return the number of appointments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AppointmentPersistence getPersistence() {
		return _persistence;
	}

	private static volatile AppointmentPersistence _persistence;

}