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

package com.liferay.hms.appointment.service.persistence.impl;

import com.liferay.hms.appointment.exception.NoSuchAppointmentException;
import com.liferay.hms.appointment.model.Appointment;
import com.liferay.hms.appointment.model.AppointmentTable;
import com.liferay.hms.appointment.model.impl.AppointmentImpl;
import com.liferay.hms.appointment.model.impl.AppointmentModelImpl;
import com.liferay.hms.appointment.service.persistence.AppointmentPersistence;
import com.liferay.hms.appointment.service.persistence.AppointmentUtil;
import com.liferay.hms.appointment.service.persistence.impl.constants.hmsPersistenceConstants;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the appointment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author devendra
 * @generated
 */
@Component(service = {AppointmentPersistence.class, BasePersistence.class})
public class AppointmentPersistenceImpl
	extends BasePersistenceImpl<Appointment> implements AppointmentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AppointmentUtil</code> to access the appointment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AppointmentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the appointments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching appointments
	 */
	@Override
	public List<Appointment> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Appointment> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<Appointment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<Appointment> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Appointment> list = null;

		if (useFinderCache) {
			list = (List<Appointment>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Appointment appointment : list) {
					if (!uuid.equals(appointment.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AppointmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Appointment>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	@Override
	public Appointment findByUuid_First(
			String uuid, OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByUuid_First(uuid, orderByComparator);

		if (appointment != null) {
			return appointment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAppointmentException(sb.toString());
	}

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByUuid_First(
		String uuid, OrderByComparator<Appointment> orderByComparator) {

		List<Appointment> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	@Override
	public Appointment findByUuid_Last(
			String uuid, OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByUuid_Last(uuid, orderByComparator);

		if (appointment != null) {
			return appointment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAppointmentException(sb.toString());
	}

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByUuid_Last(
		String uuid, OrderByComparator<Appointment> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Appointment> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Appointment[] findByUuid_PrevAndNext(
			long appointmentId, String uuid,
			OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		uuid = Objects.toString(uuid, "");

		Appointment appointment = findByPrimaryKey(appointmentId);

		Session session = null;

		try {
			session = openSession();

			Appointment[] array = new AppointmentImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, appointment, uuid, orderByComparator, true);

			array[1] = appointment;

			array[2] = getByUuid_PrevAndNext(
				session, appointment, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Appointment getByUuid_PrevAndNext(
		Session session, Appointment appointment, String uuid,
		OrderByComparator<Appointment> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AppointmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(appointment)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Appointment> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the appointments where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Appointment appointment :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(appointment);
		}
	}

	/**
	 * Returns the number of appointments where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching appointments
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_APPOINTMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"appointment.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(appointment.uuid IS NULL OR appointment.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the appointment where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAppointmentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	@Override
	public Appointment findByUUID_G(String uuid, long groupId)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByUUID_G(uuid, groupId);

		if (appointment == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAppointmentException(sb.toString());
		}

		return appointment;
	}

	/**
	 * Returns the appointment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the appointment where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs);
		}

		if (result instanceof Appointment) {
			Appointment appointment = (Appointment)result;

			if (!Objects.equals(uuid, appointment.getUuid()) ||
				(groupId != appointment.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<Appointment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Appointment appointment = list.get(0);

					result = appointment;

					cacheResult(appointment);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Appointment)result;
		}
	}

	/**
	 * Removes the appointment where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the appointment that was removed
	 */
	@Override
	public Appointment removeByUUID_G(String uuid, long groupId)
		throws NoSuchAppointmentException {

		Appointment appointment = findByUUID_G(uuid, groupId);

		return remove(appointment);
	}

	/**
	 * Returns the number of appointments where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching appointments
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_APPOINTMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"appointment.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(appointment.uuid IS NULL OR appointment.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"appointment.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the appointments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching appointments
	 */
	@Override
	public List<Appointment> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Appointment> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<Appointment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<Appointment> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<Appointment> list = null;

		if (useFinderCache) {
			list = (List<Appointment>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Appointment appointment : list) {
					if (!uuid.equals(appointment.getUuid()) ||
						(companyId != appointment.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AppointmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<Appointment>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Appointment findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (appointment != null) {
			return appointment;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAppointmentException(sb.toString());
	}

	/**
	 * Returns the first appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Appointment> orderByComparator) {

		List<Appointment> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Appointment findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (appointment != null) {
			return appointment;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAppointmentException(sb.toString());
	}

	/**
	 * Returns the last appointment in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Appointment> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Appointment> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Appointment[] findByUuid_C_PrevAndNext(
			long appointmentId, String uuid, long companyId,
			OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		uuid = Objects.toString(uuid, "");

		Appointment appointment = findByPrimaryKey(appointmentId);

		Session session = null;

		try {
			session = openSession();

			Appointment[] array = new AppointmentImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, appointment, uuid, companyId, orderByComparator, true);

			array[1] = appointment;

			array[2] = getByUuid_C_PrevAndNext(
				session, appointment, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Appointment getByUuid_C_PrevAndNext(
		Session session, Appointment appointment, String uuid, long companyId,
		OrderByComparator<Appointment> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AppointmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(appointment)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Appointment> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the appointments where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Appointment appointment :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(appointment);
		}
	}

	/**
	 * Returns the number of appointments where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching appointments
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_APPOINTMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"appointment.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(appointment.uuid IS NULL OR appointment.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"appointment.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByName;
	private FinderPath _finderPathWithoutPaginationFindByName;
	private FinderPath _finderPathCountByName;

	/**
	 * Returns all the appointments where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching appointments
	 */
	@Override
	public List<Appointment> findByName(String name) {
		return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Appointment> findByName(String name, int start, int end) {
		return findByName(name, start, end, null);
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
	@Override
	public List<Appointment> findByName(
		String name, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return findByName(name, start, end, orderByComparator, true);
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
	@Override
	public List<Appointment> findByName(
		String name, int start, int end,
		OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		name = Objects.toString(name, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByName;
				finderArgs = new Object[] {name};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByName;
			finderArgs = new Object[] {name, start, end, orderByComparator};
		}

		List<Appointment> list = null;

		if (useFinderCache) {
			list = (List<Appointment>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Appointment appointment : list) {
					if (!name.equals(appointment.getName())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

			boolean bindName = false;

			if (name.isEmpty()) {
				sb.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				sb.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AppointmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindName) {
					queryPos.add(name);
				}

				list = (List<Appointment>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	@Override
	public Appointment findByName_First(
			String name, OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByName_First(name, orderByComparator);

		if (appointment != null) {
			return appointment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("name=");
		sb.append(name);

		sb.append("}");

		throw new NoSuchAppointmentException(sb.toString());
	}

	/**
	 * Returns the first appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByName_First(
		String name, OrderByComparator<Appointment> orderByComparator) {

		List<Appointment> list = findByName(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	@Override
	public Appointment findByName_Last(
			String name, OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByName_Last(name, orderByComparator);

		if (appointment != null) {
			return appointment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("name=");
		sb.append(name);

		sb.append("}");

		throw new NoSuchAppointmentException(sb.toString());
	}

	/**
	 * Returns the last appointment in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByName_Last(
		String name, OrderByComparator<Appointment> orderByComparator) {

		int count = countByName(name);

		if (count == 0) {
			return null;
		}

		List<Appointment> list = findByName(
			name, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Appointment[] findByName_PrevAndNext(
			long appointmentId, String name,
			OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		name = Objects.toString(name, "");

		Appointment appointment = findByPrimaryKey(appointmentId);

		Session session = null;

		try {
			session = openSession();

			Appointment[] array = new AppointmentImpl[3];

			array[0] = getByName_PrevAndNext(
				session, appointment, name, orderByComparator, true);

			array[1] = appointment;

			array[2] = getByName_PrevAndNext(
				session, appointment, name, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Appointment getByName_PrevAndNext(
		Session session, Appointment appointment, String name,
		OrderByComparator<Appointment> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

		boolean bindName = false;

		if (name.isEmpty()) {
			sb.append(_FINDER_COLUMN_NAME_NAME_3);
		}
		else {
			bindName = true;

			sb.append(_FINDER_COLUMN_NAME_NAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AppointmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindName) {
			queryPos.add(name);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(appointment)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Appointment> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the appointments where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	@Override
	public void removeByName(String name) {
		for (Appointment appointment :
				findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(appointment);
		}
	}

	/**
	 * Returns the number of appointments where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching appointments
	 */
	@Override
	public int countByName(String name) {
		name = Objects.toString(name, "");

		FinderPath finderPath = _finderPathCountByName;

		Object[] finderArgs = new Object[] {name};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_APPOINTMENT_WHERE);

			boolean bindName = false;

			if (name.isEmpty()) {
				sb.append(_FINDER_COLUMN_NAME_NAME_3);
			}
			else {
				bindName = true;

				sb.append(_FINDER_COLUMN_NAME_NAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindName) {
					queryPos.add(name);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_NAME_NAME_2 =
		"appointment.name = ?";

	private static final String _FINDER_COLUMN_NAME_NAME_3 =
		"(appointment.name IS NULL OR appointment.name = '')";

	private FinderPath _finderPathWithPaginationFindByCountry;
	private FinderPath _finderPathWithoutPaginationFindByCountry;
	private FinderPath _finderPathCountByCountry;

	/**
	 * Returns all the appointments where country = &#63;.
	 *
	 * @param country the country
	 * @return the matching appointments
	 */
	@Override
	public List<Appointment> findByCountry(String country) {
		return findByCountry(
			country, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Appointment> findByCountry(String country, int start, int end) {
		return findByCountry(country, start, end, null);
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
	@Override
	public List<Appointment> findByCountry(
		String country, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return findByCountry(country, start, end, orderByComparator, true);
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
	@Override
	public List<Appointment> findByCountry(
		String country, int start, int end,
		OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		country = Objects.toString(country, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByCountry;
				finderArgs = new Object[] {country};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByCountry;
			finderArgs = new Object[] {country, start, end, orderByComparator};
		}

		List<Appointment> list = null;

		if (useFinderCache) {
			list = (List<Appointment>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Appointment appointment : list) {
					if (!country.equals(appointment.getCountry())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

			boolean bindCountry = false;

			if (country.isEmpty()) {
				sb.append(_FINDER_COLUMN_COUNTRY_COUNTRY_3);
			}
			else {
				bindCountry = true;

				sb.append(_FINDER_COLUMN_COUNTRY_COUNTRY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AppointmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCountry) {
					queryPos.add(country);
				}

				list = (List<Appointment>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	@Override
	public Appointment findByCountry_First(
			String country, OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByCountry_First(
			country, orderByComparator);

		if (appointment != null) {
			return appointment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("country=");
		sb.append(country);

		sb.append("}");

		throw new NoSuchAppointmentException(sb.toString());
	}

	/**
	 * Returns the first appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByCountry_First(
		String country, OrderByComparator<Appointment> orderByComparator) {

		List<Appointment> list = findByCountry(
			country, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	@Override
	public Appointment findByCountry_Last(
			String country, OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByCountry_Last(
			country, orderByComparator);

		if (appointment != null) {
			return appointment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("country=");
		sb.append(country);

		sb.append("}");

		throw new NoSuchAppointmentException(sb.toString());
	}

	/**
	 * Returns the last appointment in the ordered set where country = &#63;.
	 *
	 * @param country the country
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByCountry_Last(
		String country, OrderByComparator<Appointment> orderByComparator) {

		int count = countByCountry(country);

		if (count == 0) {
			return null;
		}

		List<Appointment> list = findByCountry(
			country, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Appointment[] findByCountry_PrevAndNext(
			long appointmentId, String country,
			OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		country = Objects.toString(country, "");

		Appointment appointment = findByPrimaryKey(appointmentId);

		Session session = null;

		try {
			session = openSession();

			Appointment[] array = new AppointmentImpl[3];

			array[0] = getByCountry_PrevAndNext(
				session, appointment, country, orderByComparator, true);

			array[1] = appointment;

			array[2] = getByCountry_PrevAndNext(
				session, appointment, country, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Appointment getByCountry_PrevAndNext(
		Session session, Appointment appointment, String country,
		OrderByComparator<Appointment> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

		boolean bindCountry = false;

		if (country.isEmpty()) {
			sb.append(_FINDER_COLUMN_COUNTRY_COUNTRY_3);
		}
		else {
			bindCountry = true;

			sb.append(_FINDER_COLUMN_COUNTRY_COUNTRY_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AppointmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCountry) {
			queryPos.add(country);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(appointment)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Appointment> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the appointments where country = &#63; from the database.
	 *
	 * @param country the country
	 */
	@Override
	public void removeByCountry(String country) {
		for (Appointment appointment :
				findByCountry(
					country, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(appointment);
		}
	}

	/**
	 * Returns the number of appointments where country = &#63;.
	 *
	 * @param country the country
	 * @return the number of matching appointments
	 */
	@Override
	public int countByCountry(String country) {
		country = Objects.toString(country, "");

		FinderPath finderPath = _finderPathCountByCountry;

		Object[] finderArgs = new Object[] {country};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_APPOINTMENT_WHERE);

			boolean bindCountry = false;

			if (country.isEmpty()) {
				sb.append(_FINDER_COLUMN_COUNTRY_COUNTRY_3);
			}
			else {
				bindCountry = true;

				sb.append(_FINDER_COLUMN_COUNTRY_COUNTRY_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCountry) {
					queryPos.add(country);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_COUNTRY_COUNTRY_2 =
		"appointment.country = ?";

	private static final String _FINDER_COLUMN_COUNTRY_COUNTRY_3 =
		"(appointment.country IS NULL OR appointment.country = '')";

	private FinderPath _finderPathWithPaginationFindByAge;
	private FinderPath _finderPathWithoutPaginationFindByAge;
	private FinderPath _finderPathCountByAge;

	/**
	 * Returns all the appointments where age = &#63;.
	 *
	 * @param age the age
	 * @return the matching appointments
	 */
	@Override
	public List<Appointment> findByAge(String age) {
		return findByAge(age, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Appointment> findByAge(String age, int start, int end) {
		return findByAge(age, start, end, null);
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
	@Override
	public List<Appointment> findByAge(
		String age, int start, int end,
		OrderByComparator<Appointment> orderByComparator) {

		return findByAge(age, start, end, orderByComparator, true);
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
	@Override
	public List<Appointment> findByAge(
		String age, int start, int end,
		OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		age = Objects.toString(age, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByAge;
				finderArgs = new Object[] {age};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByAge;
			finderArgs = new Object[] {age, start, end, orderByComparator};
		}

		List<Appointment> list = null;

		if (useFinderCache) {
			list = (List<Appointment>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Appointment appointment : list) {
					if (!age.equals(appointment.getAge())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

			boolean bindAge = false;

			if (age.isEmpty()) {
				sb.append(_FINDER_COLUMN_AGE_AGE_3);
			}
			else {
				bindAge = true;

				sb.append(_FINDER_COLUMN_AGE_AGE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AppointmentModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAge) {
					queryPos.add(age);
				}

				list = (List<Appointment>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	@Override
	public Appointment findByAge_First(
			String age, OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByAge_First(age, orderByComparator);

		if (appointment != null) {
			return appointment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("age=");
		sb.append(age);

		sb.append("}");

		throw new NoSuchAppointmentException(sb.toString());
	}

	/**
	 * Returns the first appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByAge_First(
		String age, OrderByComparator<Appointment> orderByComparator) {

		List<Appointment> list = findByAge(age, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment
	 * @throws NoSuchAppointmentException if a matching appointment could not be found
	 */
	@Override
	public Appointment findByAge_Last(
			String age, OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByAge_Last(age, orderByComparator);

		if (appointment != null) {
			return appointment;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("age=");
		sb.append(age);

		sb.append("}");

		throw new NoSuchAppointmentException(sb.toString());
	}

	/**
	 * Returns the last appointment in the ordered set where age = &#63;.
	 *
	 * @param age the age
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching appointment, or <code>null</code> if a matching appointment could not be found
	 */
	@Override
	public Appointment fetchByAge_Last(
		String age, OrderByComparator<Appointment> orderByComparator) {

		int count = countByAge(age);

		if (count == 0) {
			return null;
		}

		List<Appointment> list = findByAge(
			age, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Appointment[] findByAge_PrevAndNext(
			long appointmentId, String age,
			OrderByComparator<Appointment> orderByComparator)
		throws NoSuchAppointmentException {

		age = Objects.toString(age, "");

		Appointment appointment = findByPrimaryKey(appointmentId);

		Session session = null;

		try {
			session = openSession();

			Appointment[] array = new AppointmentImpl[3];

			array[0] = getByAge_PrevAndNext(
				session, appointment, age, orderByComparator, true);

			array[1] = appointment;

			array[2] = getByAge_PrevAndNext(
				session, appointment, age, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Appointment getByAge_PrevAndNext(
		Session session, Appointment appointment, String age,
		OrderByComparator<Appointment> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_APPOINTMENT_WHERE);

		boolean bindAge = false;

		if (age.isEmpty()) {
			sb.append(_FINDER_COLUMN_AGE_AGE_3);
		}
		else {
			bindAge = true;

			sb.append(_FINDER_COLUMN_AGE_AGE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AppointmentModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindAge) {
			queryPos.add(age);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(appointment)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Appointment> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the appointments where age = &#63; from the database.
	 *
	 * @param age the age
	 */
	@Override
	public void removeByAge(String age) {
		for (Appointment appointment :
				findByAge(age, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(appointment);
		}
	}

	/**
	 * Returns the number of appointments where age = &#63;.
	 *
	 * @param age the age
	 * @return the number of matching appointments
	 */
	@Override
	public int countByAge(String age) {
		age = Objects.toString(age, "");

		FinderPath finderPath = _finderPathCountByAge;

		Object[] finderArgs = new Object[] {age};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_APPOINTMENT_WHERE);

			boolean bindAge = false;

			if (age.isEmpty()) {
				sb.append(_FINDER_COLUMN_AGE_AGE_3);
			}
			else {
				bindAge = true;

				sb.append(_FINDER_COLUMN_AGE_AGE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAge) {
					queryPos.add(age);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_AGE_AGE_2 =
		"appointment.age = ?";

	private static final String _FINDER_COLUMN_AGE_AGE_3 =
		"(appointment.age IS NULL OR appointment.age = '')";

	public AppointmentPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Appointment.class);

		setModelImplClass(AppointmentImpl.class);
		setModelPKClass(long.class);

		setTable(AppointmentTable.INSTANCE);
	}

	/**
	 * Caches the appointment in the entity cache if it is enabled.
	 *
	 * @param appointment the appointment
	 */
	@Override
	public void cacheResult(Appointment appointment) {
		entityCache.putResult(
			AppointmentImpl.class, appointment.getPrimaryKey(), appointment);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {appointment.getUuid(), appointment.getGroupId()},
			appointment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the appointments in the entity cache if it is enabled.
	 *
	 * @param appointments the appointments
	 */
	@Override
	public void cacheResult(List<Appointment> appointments) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (appointments.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Appointment appointment : appointments) {
			if (entityCache.getResult(
					AppointmentImpl.class, appointment.getPrimaryKey()) ==
						null) {

				cacheResult(appointment);
			}
		}
	}

	/**
	 * Clears the cache for all appointments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AppointmentImpl.class);

		finderCache.clearCache(AppointmentImpl.class);
	}

	/**
	 * Clears the cache for the appointment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Appointment appointment) {
		entityCache.removeResult(AppointmentImpl.class, appointment);
	}

	@Override
	public void clearCache(List<Appointment> appointments) {
		for (Appointment appointment : appointments) {
			entityCache.removeResult(AppointmentImpl.class, appointment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AppointmentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AppointmentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AppointmentModelImpl appointmentModelImpl) {

		Object[] args = new Object[] {
			appointmentModelImpl.getUuid(), appointmentModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, appointmentModelImpl);
	}

	/**
	 * Creates a new appointment with the primary key. Does not add the appointment to the database.
	 *
	 * @param appointmentId the primary key for the new appointment
	 * @return the new appointment
	 */
	@Override
	public Appointment create(long appointmentId) {
		Appointment appointment = new AppointmentImpl();

		appointment.setNew(true);
		appointment.setPrimaryKey(appointmentId);

		String uuid = _portalUUID.generate();

		appointment.setUuid(uuid);

		appointment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return appointment;
	}

	/**
	 * Removes the appointment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment that was removed
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	@Override
	public Appointment remove(long appointmentId)
		throws NoSuchAppointmentException {

		return remove((Serializable)appointmentId);
	}

	/**
	 * Removes the appointment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the appointment
	 * @return the appointment that was removed
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	@Override
	public Appointment remove(Serializable primaryKey)
		throws NoSuchAppointmentException {

		Session session = null;

		try {
			session = openSession();

			Appointment appointment = (Appointment)session.get(
				AppointmentImpl.class, primaryKey);

			if (appointment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAppointmentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(appointment);
		}
		catch (NoSuchAppointmentException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Appointment removeImpl(Appointment appointment) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(appointment)) {
				appointment = (Appointment)session.get(
					AppointmentImpl.class, appointment.getPrimaryKeyObj());
			}

			if (appointment != null) {
				session.delete(appointment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (appointment != null) {
			clearCache(appointment);
		}

		return appointment;
	}

	@Override
	public Appointment updateImpl(Appointment appointment) {
		boolean isNew = appointment.isNew();

		if (!(appointment instanceof AppointmentModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(appointment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(appointment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in appointment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Appointment implementation " +
					appointment.getClass());
		}

		AppointmentModelImpl appointmentModelImpl =
			(AppointmentModelImpl)appointment;

		if (Validator.isNull(appointment.getUuid())) {
			String uuid = _portalUUID.generate();

			appointment.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (appointment.getCreateDate() == null)) {
			if (serviceContext == null) {
				appointment.setCreateDate(date);
			}
			else {
				appointment.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!appointmentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				appointment.setModifiedDate(date);
			}
			else {
				appointment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(appointment);
			}
			else {
				appointment = (Appointment)session.merge(appointment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AppointmentImpl.class, appointmentModelImpl, false, true);

		cacheUniqueFindersCache(appointmentModelImpl);

		if (isNew) {
			appointment.setNew(false);
		}

		appointment.resetOriginalValues();

		return appointment;
	}

	/**
	 * Returns the appointment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the appointment
	 * @return the appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	@Override
	public Appointment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAppointmentException {

		Appointment appointment = fetchByPrimaryKey(primaryKey);

		if (appointment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAppointmentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return appointment;
	}

	/**
	 * Returns the appointment with the primary key or throws a <code>NoSuchAppointmentException</code> if it could not be found.
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment
	 * @throws NoSuchAppointmentException if a appointment with the primary key could not be found
	 */
	@Override
	public Appointment findByPrimaryKey(long appointmentId)
		throws NoSuchAppointmentException {

		return findByPrimaryKey((Serializable)appointmentId);
	}

	/**
	 * Returns the appointment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appointmentId the primary key of the appointment
	 * @return the appointment, or <code>null</code> if a appointment with the primary key could not be found
	 */
	@Override
	public Appointment fetchByPrimaryKey(long appointmentId) {
		return fetchByPrimaryKey((Serializable)appointmentId);
	}

	/**
	 * Returns all the appointments.
	 *
	 * @return the appointments
	 */
	@Override
	public List<Appointment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Appointment> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Appointment> findAll(
		int start, int end, OrderByComparator<Appointment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Appointment> findAll(
		int start, int end, OrderByComparator<Appointment> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Appointment> list = null;

		if (useFinderCache) {
			list = (List<Appointment>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_APPOINTMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_APPOINTMENT;

				sql = sql.concat(AppointmentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Appointment>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the appointments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Appointment appointment : findAll()) {
			remove(appointment);
		}
	}

	/**
	 * Returns the number of appointments.
	 *
	 * @return the number of appointments
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_APPOINTMENT);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "appointmentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_APPOINTMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AppointmentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the appointment persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindByName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"name"}, true);

		_finderPathWithoutPaginationFindByName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
			new String[] {String.class.getName()}, new String[] {"name"}, true);

		_finderPathCountByName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
			new String[] {String.class.getName()}, new String[] {"name"},
			false);

		_finderPathWithPaginationFindByCountry = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCountry",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"country"}, true);

		_finderPathWithoutPaginationFindByCountry = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCountry",
			new String[] {String.class.getName()}, new String[] {"country"},
			true);

		_finderPathCountByCountry = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCountry",
			new String[] {String.class.getName()}, new String[] {"country"},
			false);

		_finderPathWithPaginationFindByAge = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAge",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"age"}, true);

		_finderPathWithoutPaginationFindByAge = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAge",
			new String[] {String.class.getName()}, new String[] {"age"}, true);

		_finderPathCountByAge = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAge",
			new String[] {String.class.getName()}, new String[] {"age"}, false);

		_setAppointmentUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAppointmentUtilPersistence(null);

		entityCache.removeCache(AppointmentImpl.class.getName());
	}

	private void _setAppointmentUtilPersistence(
		AppointmentPersistence appointmentPersistence) {

		try {
			Field field = AppointmentUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, appointmentPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = hmsPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = hmsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = hmsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_APPOINTMENT =
		"SELECT appointment FROM Appointment appointment";

	private static final String _SQL_SELECT_APPOINTMENT_WHERE =
		"SELECT appointment FROM Appointment appointment WHERE ";

	private static final String _SQL_COUNT_APPOINTMENT =
		"SELECT COUNT(appointment) FROM Appointment appointment";

	private static final String _SQL_COUNT_APPOINTMENT_WHERE =
		"SELECT COUNT(appointment) FROM Appointment appointment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "appointment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Appointment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Appointment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AppointmentPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

	@Reference
	private AppointmentModelArgumentsResolver
		_appointmentModelArgumentsResolver;

}