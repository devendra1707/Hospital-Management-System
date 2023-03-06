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

package com.liferay.hms.enquiry.service.persistence.impl;

import com.liferay.hms.enquiry.exception.NoSuchEnquiryException;
import com.liferay.hms.enquiry.model.Enquiry;
import com.liferay.hms.enquiry.model.EnquiryTable;
import com.liferay.hms.enquiry.model.impl.EnquiryImpl;
import com.liferay.hms.enquiry.model.impl.EnquiryModelImpl;
import com.liferay.hms.enquiry.service.persistence.EnquiryPersistence;
import com.liferay.hms.enquiry.service.persistence.EnquiryUtil;
import com.liferay.hms.enquiry.service.persistence.impl.constants.hmsPersistenceConstants;
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
 * The persistence implementation for the enquiry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {EnquiryPersistence.class, BasePersistence.class})
public class EnquiryPersistenceImpl
	extends BasePersistenceImpl<Enquiry> implements EnquiryPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>EnquiryUtil</code> to access the enquiry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		EnquiryImpl.class.getName();

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
	 * Returns all the enquiries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching enquiries
	 */
	@Override
	public List<Enquiry> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the enquiries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @return the range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the enquiries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Enquiry> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the enquiries where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Enquiry> orderByComparator, boolean useFinderCache) {

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

		List<Enquiry> list = null;

		if (useFinderCache) {
			list = (List<Enquiry>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Enquiry enquiry : list) {
					if (!uuid.equals(enquiry.getUuid())) {
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

			sb.append(_SQL_SELECT_ENQUIRY_WHERE);

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
				sb.append(EnquiryModelImpl.ORDER_BY_JPQL);
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

				list = (List<Enquiry>)QueryUtil.list(
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
	 * Returns the first enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	@Override
	public Enquiry findByUuid_First(
			String uuid, OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		Enquiry enquiry = fetchByUuid_First(uuid, orderByComparator);

		if (enquiry != null) {
			return enquiry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEnquiryException(sb.toString());
	}

	/**
	 * Returns the first enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public Enquiry fetchByUuid_First(
		String uuid, OrderByComparator<Enquiry> orderByComparator) {

		List<Enquiry> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	@Override
	public Enquiry findByUuid_Last(
			String uuid, OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		Enquiry enquiry = fetchByUuid_Last(uuid, orderByComparator);

		if (enquiry != null) {
			return enquiry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchEnquiryException(sb.toString());
	}

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public Enquiry fetchByUuid_Last(
		String uuid, OrderByComparator<Enquiry> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Enquiry> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the enquiries before and after the current enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param enquiryId the primary key of the current enquiry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	@Override
	public Enquiry[] findByUuid_PrevAndNext(
			long enquiryId, String uuid,
			OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		uuid = Objects.toString(uuid, "");

		Enquiry enquiry = findByPrimaryKey(enquiryId);

		Session session = null;

		try {
			session = openSession();

			Enquiry[] array = new EnquiryImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, enquiry, uuid, orderByComparator, true);

			array[1] = enquiry;

			array[2] = getByUuid_PrevAndNext(
				session, enquiry, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Enquiry getByUuid_PrevAndNext(
		Session session, Enquiry enquiry, String uuid,
		OrderByComparator<Enquiry> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ENQUIRY_WHERE);

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
			sb.append(EnquiryModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(enquiry)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Enquiry> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the enquiries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Enquiry enquiry :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(enquiry);
		}
	}

	/**
	 * Returns the number of enquiries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching enquiries
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENQUIRY_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "enquiry.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(enquiry.uuid IS NULL OR enquiry.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the enquiry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEnquiryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	@Override
	public Enquiry findByUUID_G(String uuid, long groupId)
		throws NoSuchEnquiryException {

		Enquiry enquiry = fetchByUUID_G(uuid, groupId);

		if (enquiry == null) {
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

			throw new NoSuchEnquiryException(sb.toString());
		}

		return enquiry;
	}

	/**
	 * Returns the enquiry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public Enquiry fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the enquiry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public Enquiry fetchByUUID_G(
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

		if (result instanceof Enquiry) {
			Enquiry enquiry = (Enquiry)result;

			if (!Objects.equals(uuid, enquiry.getUuid()) ||
				(groupId != enquiry.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ENQUIRY_WHERE);

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

				List<Enquiry> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Enquiry enquiry = list.get(0);

					result = enquiry;

					cacheResult(enquiry);
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
			return (Enquiry)result;
		}
	}

	/**
	 * Removes the enquiry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the enquiry that was removed
	 */
	@Override
	public Enquiry removeByUUID_G(String uuid, long groupId)
		throws NoSuchEnquiryException {

		Enquiry enquiry = findByUUID_G(uuid, groupId);

		return remove(enquiry);
	}

	/**
	 * Returns the number of enquiries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching enquiries
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ENQUIRY_WHERE);

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
		"enquiry.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(enquiry.uuid IS NULL OR enquiry.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"enquiry.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the enquiries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching enquiries
	 */
	@Override
	public List<Enquiry> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the enquiries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @return the range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the enquiries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Enquiry> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the enquiries where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Enquiry> orderByComparator, boolean useFinderCache) {

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

		List<Enquiry> list = null;

		if (useFinderCache) {
			list = (List<Enquiry>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Enquiry enquiry : list) {
					if (!uuid.equals(enquiry.getUuid()) ||
						(companyId != enquiry.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ENQUIRY_WHERE);

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
				sb.append(EnquiryModelImpl.ORDER_BY_JPQL);
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

				list = (List<Enquiry>)QueryUtil.list(
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
	 * Returns the first enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	@Override
	public Enquiry findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		Enquiry enquiry = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (enquiry != null) {
			return enquiry;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEnquiryException(sb.toString());
	}

	/**
	 * Returns the first enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public Enquiry fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Enquiry> orderByComparator) {

		List<Enquiry> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	@Override
	public Enquiry findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		Enquiry enquiry = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (enquiry != null) {
			return enquiry;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchEnquiryException(sb.toString());
	}

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public Enquiry fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Enquiry> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Enquiry> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the enquiries before and after the current enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param enquiryId the primary key of the current enquiry
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	@Override
	public Enquiry[] findByUuid_C_PrevAndNext(
			long enquiryId, String uuid, long companyId,
			OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		uuid = Objects.toString(uuid, "");

		Enquiry enquiry = findByPrimaryKey(enquiryId);

		Session session = null;

		try {
			session = openSession();

			Enquiry[] array = new EnquiryImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, enquiry, uuid, companyId, orderByComparator, true);

			array[1] = enquiry;

			array[2] = getByUuid_C_PrevAndNext(
				session, enquiry, uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Enquiry getByUuid_C_PrevAndNext(
		Session session, Enquiry enquiry, String uuid, long companyId,
		OrderByComparator<Enquiry> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_ENQUIRY_WHERE);

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
			sb.append(EnquiryModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(enquiry)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Enquiry> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the enquiries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Enquiry enquiry :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(enquiry);
		}
	}

	/**
	 * Returns the number of enquiries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching enquiries
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ENQUIRY_WHERE);

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
		"enquiry.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(enquiry.uuid IS NULL OR enquiry.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"enquiry.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByName;
	private FinderPath _finderPathWithoutPaginationFindByName;
	private FinderPath _finderPathCountByName;

	/**
	 * Returns all the enquiries where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching enquiries
	 */
	@Override
	public List<Enquiry> findByName(String name) {
		return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the enquiries where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @return the range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByName(String name, int start, int end) {
		return findByName(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the enquiries where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByName(
		String name, int start, int end,
		OrderByComparator<Enquiry> orderByComparator) {

		return findByName(name, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the enquiries where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByName(
		String name, int start, int end,
		OrderByComparator<Enquiry> orderByComparator, boolean useFinderCache) {

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

		List<Enquiry> list = null;

		if (useFinderCache) {
			list = (List<Enquiry>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Enquiry enquiry : list) {
					if (!name.equals(enquiry.getName())) {
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

			sb.append(_SQL_SELECT_ENQUIRY_WHERE);

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
				sb.append(EnquiryModelImpl.ORDER_BY_JPQL);
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

				list = (List<Enquiry>)QueryUtil.list(
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
	 * Returns the first enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	@Override
	public Enquiry findByName_First(
			String name, OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		Enquiry enquiry = fetchByName_First(name, orderByComparator);

		if (enquiry != null) {
			return enquiry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("name=");
		sb.append(name);

		sb.append("}");

		throw new NoSuchEnquiryException(sb.toString());
	}

	/**
	 * Returns the first enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public Enquiry fetchByName_First(
		String name, OrderByComparator<Enquiry> orderByComparator) {

		List<Enquiry> list = findByName(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	@Override
	public Enquiry findByName_Last(
			String name, OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		Enquiry enquiry = fetchByName_Last(name, orderByComparator);

		if (enquiry != null) {
			return enquiry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("name=");
		sb.append(name);

		sb.append("}");

		throw new NoSuchEnquiryException(sb.toString());
	}

	/**
	 * Returns the last enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public Enquiry fetchByName_Last(
		String name, OrderByComparator<Enquiry> orderByComparator) {

		int count = countByName(name);

		if (count == 0) {
			return null;
		}

		List<Enquiry> list = findByName(
			name, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the enquiries before and after the current enquiry in the ordered set where name = &#63;.
	 *
	 * @param enquiryId the primary key of the current enquiry
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	@Override
	public Enquiry[] findByName_PrevAndNext(
			long enquiryId, String name,
			OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		name = Objects.toString(name, "");

		Enquiry enquiry = findByPrimaryKey(enquiryId);

		Session session = null;

		try {
			session = openSession();

			Enquiry[] array = new EnquiryImpl[3];

			array[0] = getByName_PrevAndNext(
				session, enquiry, name, orderByComparator, true);

			array[1] = enquiry;

			array[2] = getByName_PrevAndNext(
				session, enquiry, name, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Enquiry getByName_PrevAndNext(
		Session session, Enquiry enquiry, String name,
		OrderByComparator<Enquiry> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ENQUIRY_WHERE);

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
			sb.append(EnquiryModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(enquiry)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Enquiry> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the enquiries where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	@Override
	public void removeByName(String name) {
		for (Enquiry enquiry :
				findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(enquiry);
		}
	}

	/**
	 * Returns the number of enquiries where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching enquiries
	 */
	@Override
	public int countByName(String name) {
		name = Objects.toString(name, "");

		FinderPath finderPath = _finderPathCountByName;

		Object[] finderArgs = new Object[] {name};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENQUIRY_WHERE);

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

	private static final String _FINDER_COLUMN_NAME_NAME_2 = "enquiry.name = ?";

	private static final String _FINDER_COLUMN_NAME_NAME_3 =
		"(enquiry.name IS NULL OR enquiry.name = '')";

	private FinderPath _finderPathWithPaginationFindByMobileNo;
	private FinderPath _finderPathWithoutPaginationFindByMobileNo;
	private FinderPath _finderPathCountByMobileNo;

	/**
	 * Returns all the enquiries where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the matching enquiries
	 */
	@Override
	public List<Enquiry> findByMobileNo(String mobileNo) {
		return findByMobileNo(
			mobileNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the enquiries where mobileNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @return the range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByMobileNo(String mobileNo, int start, int end) {
		return findByMobileNo(mobileNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the enquiries where mobileNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByMobileNo(
		String mobileNo, int start, int end,
		OrderByComparator<Enquiry> orderByComparator) {

		return findByMobileNo(mobileNo, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the enquiries where mobileNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param mobileNo the mobile no
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching enquiries
	 */
	@Override
	public List<Enquiry> findByMobileNo(
		String mobileNo, int start, int end,
		OrderByComparator<Enquiry> orderByComparator, boolean useFinderCache) {

		mobileNo = Objects.toString(mobileNo, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByMobileNo;
				finderArgs = new Object[] {mobileNo};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByMobileNo;
			finderArgs = new Object[] {mobileNo, start, end, orderByComparator};
		}

		List<Enquiry> list = null;

		if (useFinderCache) {
			list = (List<Enquiry>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Enquiry enquiry : list) {
					if (!mobileNo.equals(enquiry.getMobileNo())) {
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

			sb.append(_SQL_SELECT_ENQUIRY_WHERE);

			boolean bindMobileNo = false;

			if (mobileNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_3);
			}
			else {
				bindMobileNo = true;

				sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(EnquiryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindMobileNo) {
					queryPos.add(mobileNo);
				}

				list = (List<Enquiry>)QueryUtil.list(
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
	 * Returns the first enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	@Override
	public Enquiry findByMobileNo_First(
			String mobileNo, OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		Enquiry enquiry = fetchByMobileNo_First(mobileNo, orderByComparator);

		if (enquiry != null) {
			return enquiry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("mobileNo=");
		sb.append(mobileNo);

		sb.append("}");

		throw new NoSuchEnquiryException(sb.toString());
	}

	/**
	 * Returns the first enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public Enquiry fetchByMobileNo_First(
		String mobileNo, OrderByComparator<Enquiry> orderByComparator) {

		List<Enquiry> list = findByMobileNo(mobileNo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	@Override
	public Enquiry findByMobileNo_Last(
			String mobileNo, OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		Enquiry enquiry = fetchByMobileNo_Last(mobileNo, orderByComparator);

		if (enquiry != null) {
			return enquiry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("mobileNo=");
		sb.append(mobileNo);

		sb.append("}");

		throw new NoSuchEnquiryException(sb.toString());
	}

	/**
	 * Returns the last enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	@Override
	public Enquiry fetchByMobileNo_Last(
		String mobileNo, OrderByComparator<Enquiry> orderByComparator) {

		int count = countByMobileNo(mobileNo);

		if (count == 0) {
			return null;
		}

		List<Enquiry> list = findByMobileNo(
			mobileNo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the enquiries before and after the current enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param enquiryId the primary key of the current enquiry
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	@Override
	public Enquiry[] findByMobileNo_PrevAndNext(
			long enquiryId, String mobileNo,
			OrderByComparator<Enquiry> orderByComparator)
		throws NoSuchEnquiryException {

		mobileNo = Objects.toString(mobileNo, "");

		Enquiry enquiry = findByPrimaryKey(enquiryId);

		Session session = null;

		try {
			session = openSession();

			Enquiry[] array = new EnquiryImpl[3];

			array[0] = getByMobileNo_PrevAndNext(
				session, enquiry, mobileNo, orderByComparator, true);

			array[1] = enquiry;

			array[2] = getByMobileNo_PrevAndNext(
				session, enquiry, mobileNo, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Enquiry getByMobileNo_PrevAndNext(
		Session session, Enquiry enquiry, String mobileNo,
		OrderByComparator<Enquiry> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ENQUIRY_WHERE);

		boolean bindMobileNo = false;

		if (mobileNo.isEmpty()) {
			sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_3);
		}
		else {
			bindMobileNo = true;

			sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_2);
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
			sb.append(EnquiryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindMobileNo) {
			queryPos.add(mobileNo);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(enquiry)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Enquiry> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the enquiries where mobileNo = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 */
	@Override
	public void removeByMobileNo(String mobileNo) {
		for (Enquiry enquiry :
				findByMobileNo(
					mobileNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(enquiry);
		}
	}

	/**
	 * Returns the number of enquiries where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the number of matching enquiries
	 */
	@Override
	public int countByMobileNo(String mobileNo) {
		mobileNo = Objects.toString(mobileNo, "");

		FinderPath finderPath = _finderPathCountByMobileNo;

		Object[] finderArgs = new Object[] {mobileNo};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ENQUIRY_WHERE);

			boolean bindMobileNo = false;

			if (mobileNo.isEmpty()) {
				sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_3);
			}
			else {
				bindMobileNo = true;

				sb.append(_FINDER_COLUMN_MOBILENO_MOBILENO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindMobileNo) {
					queryPos.add(mobileNo);
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

	private static final String _FINDER_COLUMN_MOBILENO_MOBILENO_2 =
		"enquiry.mobileNo = ?";

	private static final String _FINDER_COLUMN_MOBILENO_MOBILENO_3 =
		"(enquiry.mobileNo IS NULL OR enquiry.mobileNo = '')";

	public EnquiryPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Enquiry.class);

		setModelImplClass(EnquiryImpl.class);
		setModelPKClass(long.class);

		setTable(EnquiryTable.INSTANCE);
	}

	/**
	 * Caches the enquiry in the entity cache if it is enabled.
	 *
	 * @param enquiry the enquiry
	 */
	@Override
	public void cacheResult(Enquiry enquiry) {
		entityCache.putResult(
			EnquiryImpl.class, enquiry.getPrimaryKey(), enquiry);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {enquiry.getUuid(), enquiry.getGroupId()}, enquiry);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the enquiries in the entity cache if it is enabled.
	 *
	 * @param enquiries the enquiries
	 */
	@Override
	public void cacheResult(List<Enquiry> enquiries) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (enquiries.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Enquiry enquiry : enquiries) {
			if (entityCache.getResult(
					EnquiryImpl.class, enquiry.getPrimaryKey()) == null) {

				cacheResult(enquiry);
			}
		}
	}

	/**
	 * Clears the cache for all enquiries.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EnquiryImpl.class);

		finderCache.clearCache(EnquiryImpl.class);
	}

	/**
	 * Clears the cache for the enquiry.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Enquiry enquiry) {
		entityCache.removeResult(EnquiryImpl.class, enquiry);
	}

	@Override
	public void clearCache(List<Enquiry> enquiries) {
		for (Enquiry enquiry : enquiries) {
			entityCache.removeResult(EnquiryImpl.class, enquiry);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(EnquiryImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(EnquiryImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(EnquiryModelImpl enquiryModelImpl) {
		Object[] args = new Object[] {
			enquiryModelImpl.getUuid(), enquiryModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(_finderPathFetchByUUID_G, args, enquiryModelImpl);
	}

	/**
	 * Creates a new enquiry with the primary key. Does not add the enquiry to the database.
	 *
	 * @param enquiryId the primary key for the new enquiry
	 * @return the new enquiry
	 */
	@Override
	public Enquiry create(long enquiryId) {
		Enquiry enquiry = new EnquiryImpl();

		enquiry.setNew(true);
		enquiry.setPrimaryKey(enquiryId);

		String uuid = _portalUUID.generate();

		enquiry.setUuid(uuid);

		enquiry.setCompanyId(CompanyThreadLocal.getCompanyId());

		return enquiry;
	}

	/**
	 * Removes the enquiry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry that was removed
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	@Override
	public Enquiry remove(long enquiryId) throws NoSuchEnquiryException {
		return remove((Serializable)enquiryId);
	}

	/**
	 * Removes the enquiry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the enquiry
	 * @return the enquiry that was removed
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	@Override
	public Enquiry remove(Serializable primaryKey)
		throws NoSuchEnquiryException {

		Session session = null;

		try {
			session = openSession();

			Enquiry enquiry = (Enquiry)session.get(
				EnquiryImpl.class, primaryKey);

			if (enquiry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEnquiryException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(enquiry);
		}
		catch (NoSuchEnquiryException noSuchEntityException) {
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
	protected Enquiry removeImpl(Enquiry enquiry) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(enquiry)) {
				enquiry = (Enquiry)session.get(
					EnquiryImpl.class, enquiry.getPrimaryKeyObj());
			}

			if (enquiry != null) {
				session.delete(enquiry);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (enquiry != null) {
			clearCache(enquiry);
		}

		return enquiry;
	}

	@Override
	public Enquiry updateImpl(Enquiry enquiry) {
		boolean isNew = enquiry.isNew();

		if (!(enquiry instanceof EnquiryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(enquiry.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(enquiry);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in enquiry proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Enquiry implementation " +
					enquiry.getClass());
		}

		EnquiryModelImpl enquiryModelImpl = (EnquiryModelImpl)enquiry;

		if (Validator.isNull(enquiry.getUuid())) {
			String uuid = _portalUUID.generate();

			enquiry.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (enquiry.getCreateDate() == null)) {
			if (serviceContext == null) {
				enquiry.setCreateDate(date);
			}
			else {
				enquiry.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!enquiryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				enquiry.setModifiedDate(date);
			}
			else {
				enquiry.setModifiedDate(serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(enquiry);
			}
			else {
				enquiry = (Enquiry)session.merge(enquiry);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(EnquiryImpl.class, enquiryModelImpl, false, true);

		cacheUniqueFindersCache(enquiryModelImpl);

		if (isNew) {
			enquiry.setNew(false);
		}

		enquiry.resetOriginalValues();

		return enquiry;
	}

	/**
	 * Returns the enquiry with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the enquiry
	 * @return the enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	@Override
	public Enquiry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEnquiryException {

		Enquiry enquiry = fetchByPrimaryKey(primaryKey);

		if (enquiry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEnquiryException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return enquiry;
	}

	/**
	 * Returns the enquiry with the primary key or throws a <code>NoSuchEnquiryException</code> if it could not be found.
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	@Override
	public Enquiry findByPrimaryKey(long enquiryId)
		throws NoSuchEnquiryException {

		return findByPrimaryKey((Serializable)enquiryId);
	}

	/**
	 * Returns the enquiry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry, or <code>null</code> if a enquiry with the primary key could not be found
	 */
	@Override
	public Enquiry fetchByPrimaryKey(long enquiryId) {
		return fetchByPrimaryKey((Serializable)enquiryId);
	}

	/**
	 * Returns all the enquiries.
	 *
	 * @return the enquiries
	 */
	@Override
	public List<Enquiry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the enquiries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @return the range of enquiries
	 */
	@Override
	public List<Enquiry> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the enquiries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of enquiries
	 */
	@Override
	public List<Enquiry> findAll(
		int start, int end, OrderByComparator<Enquiry> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the enquiries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EnquiryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of enquiries
	 * @param end the upper bound of the range of enquiries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of enquiries
	 */
	@Override
	public List<Enquiry> findAll(
		int start, int end, OrderByComparator<Enquiry> orderByComparator,
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

		List<Enquiry> list = null;

		if (useFinderCache) {
			list = (List<Enquiry>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ENQUIRY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ENQUIRY;

				sql = sql.concat(EnquiryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Enquiry>)QueryUtil.list(
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
	 * Removes all the enquiries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Enquiry enquiry : findAll()) {
			remove(enquiry);
		}
	}

	/**
	 * Returns the number of enquiries.
	 *
	 * @return the number of enquiries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ENQUIRY);

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
		return "enquiryId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ENQUIRY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EnquiryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the enquiry persistence.
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

		_finderPathWithPaginationFindByMobileNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMobileNo",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"mobileNo"}, true);

		_finderPathWithoutPaginationFindByMobileNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMobileNo",
			new String[] {String.class.getName()}, new String[] {"mobileNo"},
			true);

		_finderPathCountByMobileNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMobileNo",
			new String[] {String.class.getName()}, new String[] {"mobileNo"},
			false);

		_setEnquiryUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setEnquiryUtilPersistence(null);

		entityCache.removeCache(EnquiryImpl.class.getName());
	}

	private void _setEnquiryUtilPersistence(
		EnquiryPersistence enquiryPersistence) {

		try {
			Field field = EnquiryUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, enquiryPersistence);
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

	private static final String _SQL_SELECT_ENQUIRY =
		"SELECT enquiry FROM Enquiry enquiry";

	private static final String _SQL_SELECT_ENQUIRY_WHERE =
		"SELECT enquiry FROM Enquiry enquiry WHERE ";

	private static final String _SQL_COUNT_ENQUIRY =
		"SELECT COUNT(enquiry) FROM Enquiry enquiry";

	private static final String _SQL_COUNT_ENQUIRY_WHERE =
		"SELECT COUNT(enquiry) FROM Enquiry enquiry WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "enquiry.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Enquiry exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Enquiry exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		EnquiryPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

	@Reference
	private EnquiryModelArgumentsResolver _enquiryModelArgumentsResolver;

}