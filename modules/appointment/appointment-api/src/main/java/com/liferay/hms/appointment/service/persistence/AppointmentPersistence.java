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

import com.liferay.hms.appointment.exception.NoSuchAppointmentException;
import com.liferay.hms.appointment.model.Appointment;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the appointment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author devendra
 * @see AppointmentUtil
 * @generated
 */
@ProviderType
public interface AppointmentPersistence extends BasePersistence<Appointment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AppointmentUtil} to access the appointment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the appointments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching appointments
	 */
	public java.util.List<Appointment> findByUuid(String uuid);

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
	public java.util.List<Appointment> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Appointment> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

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
	public java.util.List<Appointment> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

	/**
	 * Returns the appointments before and after the current appointment in the ordered set where uuid = &#63;.
	 *
	 * @param appointmentId the primary key of the current appointment
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public Appointment[] findByUuid_PrevAndNext(
			long appointmentId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Removes all the appointments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of appointments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching appointments
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the appointment where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAppointmentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByUUID_G(String uuid, long groupId)
		throws NoSuchAppointmentException;

	/**
	 * Returns the appointment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the appointment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the appointment where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the appointment that was removed
	 */
	public Appointment removeByUUID_G(String uuid, long groupId)
		throws NoSuchAppointmentException;

	/**
	 * Returns the number of appointments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching appointments
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the appointments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching appointments
	 */
	public java.util.List<Appointment> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<Appointment> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Appointment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

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
	public java.util.List<Appointment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

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
	public Appointment[] findByUuid_C_PrevAndNext(
			long appointmentId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Removes all the appointments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of appointments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching appointments
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the appointments where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching appointments
	 */
	public java.util.List<Appointment> findByName(String name);

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
	public java.util.List<Appointment> findByName(
		String name, int start, int end);

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
	public java.util.List<Appointment> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

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
	public java.util.List<Appointment> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByName_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Returns the first appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByName_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

	/**
	 * Returns the last appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByName_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Returns the last appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByName_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

	/**
	 * Returns the appointments before and after the current appointment in the ordered set where name = &#63;.
	 *
	 * @param appointmentId the primary key of the current appointment
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public Appointment[] findByName_PrevAndNext(
			long appointmentId, String name,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Removes all the appointments where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of appointments where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching appointments
	 */
	public int countByName(String name);

	/**
	 * Returns all the appointments where country = &#63;.
	 *
	 * @param country the country
	 * @return the matching appointments
	 */
	public java.util.List<Appointment> findByCountry(String country);

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
	public java.util.List<Appointment> findByCountry(
		String country, int start, int end);

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
	public java.util.List<Appointment> findByCountry(
		String country, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

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
	public java.util.List<Appointment> findByCountry(
		String country, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByCountry_First(
			String country,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Returns the first appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByCountry_First(
		String country,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

	/**
	 * Returns the last appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByCountry_Last(
			String country,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Returns the last appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByCountry_Last(
		String country,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

	/**
	 * Returns the appointments before and after the current appointment in the ordered set where country = &#63;.
	 *
	 * @param appointmentId the primary key of the current appointment
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public Appointment[] findByCountry_PrevAndNext(
			long appointmentId, String country,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Removes all the appointments where country = &#63; from the database.
	 *
	 * @param country the country
	 */
	public void removeByCountry(String country);

	/**
	 * Returns the number of appointments where country = &#63;.
	 *
	 * @param country the country
	 * @return the number of matching appointments
	 */
	public int countByCountry(String country);

	/**
	 * Returns all the appointments where age = &#63;.
	 *
	 * @param age the age
	 * @return the matching appointments
	 */
	public java.util.List<Appointment> findByAge(String age);

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
	public java.util.List<Appointment> findByAge(
		String age, int start, int end);

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
	public java.util.List<Appointment> findByAge(
		String age, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

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
	public java.util.List<Appointment> findByAge(
		String age, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByAge_First(
			String age,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Returns the first appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByAge_First(
		String age,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

	/**
	 * Returns the last appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	public Appointment findByAge_Last(
			String age,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Returns the last appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	public Appointment fetchByAge_Last(
		String age,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

	/**
	 * Returns the appointments before and after the current appointment in the ordered set where age = &#63;.
	 *
	 * @param appointmentId the primary key of the current appointment
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public Appointment[] findByAge_PrevAndNext(
			long appointmentId, String age,
			com.liferay.portal.kernel.util.OrderByComparator<Appointment>
				orderByComparator)
		throws NoSuchAppointmentException;

	/**
	 * Removes all the appointments where age = &#63; from the database.
	 *
	 * @param age the age
	 */
	public void removeByAge(String age);

	/**
	 * Returns the number of appointments where age = &#63;.
	 *
	 * @param age the age
	 * @return the number of matching appointments
	 */
	public int countByAge(String age);

	/**
	 * Caches the appointment in the entity cache if it is enabled.
	 *
	 * @param appointment the appointment
	 */
	public void cacheResult(Appointment appointment);

	/**
	 * Caches the appointments in the entity cache if it is enabled.
	 *
	 * @param appointments the appointments
	 */
	public void cacheResult(java.util.List<Appointment> appointments);

	/**
	 * Creates a new appointment with the primary key. Does not add the appointment to the database.
	 *
	 * @param appointmentId the primary key for the new appointment
	 * @return the new appointment
	 */
	public Appointment create(long appointmentId);

	/**
	 * Removes the appointment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment that was removed
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public Appointment remove(long appointmentId)
		throws NoSuchAppointmentException;

	public Appointment updateImpl(Appointment appointment);

	/**
	 * Returns the appointment with the primary key or throws a <code>NoSuchAppointmentException</code> if it could not be found.
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	public Appointment findByPrimaryKey(long appointmentId)
		throws NoSuchAppointmentException;

	/**
	 * Returns the appointment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment, or <code>null</code> if a appointment with the primary key could not be found
	 */
	public Appointment fetchByPrimaryKey(long appointmentId);

	/**
	 * Returns all the appointments.
	 *
	 * @return the appointments
	 */
	public java.util.List<Appointment> findAll();

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
	public java.util.List<Appointment> findAll(int start, int end);

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
	public java.util.List<Appointment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator);

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
	public java.util.List<Appointment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Appointment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the appointments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of appointments.
	 *
	 * @return the number of appointments
	 */
	public int countAll();

}