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

package com.liferay.hms.internationalpatients.service.persistence;

import com.liferay.hms.internationalpatients.model.Internation;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the internation service. This utility wraps <code>com.liferay.hms.internationalpatients.service.persistence.impl.InternationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InternationPersistence
 * @generated
 */
public class InternationUtil {

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
	public static void clearCache(Internation internation) {
		getPersistence().clearCache(internation);
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
	public static Map<Serializable, Internation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Internation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Internation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Internation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Internation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Internation update(Internation internation) {
		return getPersistence().update(internation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Internation update(
		Internation internation, ServiceContext serviceContext) {

		return getPersistence().update(internation, serviceContext);
	}

	/**
	 * Returns all the internations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching internations
	 */
	public static List<Internation> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the internations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @return the range of matching internations
	 */
	public static List<Internation> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the internations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching internations
	 */
	public static List<Internation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Internation> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the internations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching internations
	 */
	public static List<Internation> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Internation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first internation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public static Internation findByUuid_First(
			String uuid, OrderByComparator<Internation> orderByComparator)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first internation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public static Internation fetchByUuid_First(
		String uuid, OrderByComparator<Internation> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last internation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public static Internation findByUuid_Last(
			String uuid, OrderByComparator<Internation> orderByComparator)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last internation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public static Internation fetchByUuid_Last(
		String uuid, OrderByComparator<Internation> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the internations before and after the current internation in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current internation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next internation
	 * @throws NoSuchInternationException if a internation with the primary key could not be found
	 */
	public static Internation[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<Internation> orderByComparator)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the internations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of internations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching internations
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the internation where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInternationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public static Internation findByUUID_G(String uuid, long groupId)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the internation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public static Internation fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the internation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public static Internation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the internation where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the internation that was removed
	 */
	public static Internation removeByUUID_G(String uuid, long groupId)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of internations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching internations
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the internations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching internations
	 */
	public static List<Internation> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the internations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @return the range of matching internations
	 */
	public static List<Internation> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the internations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching internations
	 */
	public static List<Internation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Internation> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the internations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching internations
	 */
	public static List<Internation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Internation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first internation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public static Internation findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Internation> orderByComparator)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first internation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public static Internation fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Internation> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last internation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public static Internation findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Internation> orderByComparator)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last internation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public static Internation fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Internation> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the internations before and after the current internation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current internation
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next internation
	 * @throws NoSuchInternationException if a internation with the primary key could not be found
	 */
	public static Internation[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<Internation> orderByComparator)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the internations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of internations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching internations
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the internations where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching internations
	 */
	public static List<Internation> findByName(String name) {
		return getPersistence().findByName(name);
	}

	/**
	 * Returns a range of all the internations where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @return the range of matching internations
	 */
	public static List<Internation> findByName(
		String name, int start, int end) {

		return getPersistence().findByName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the internations where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching internations
	 */
	public static List<Internation> findByName(
		String name, int start, int end,
		OrderByComparator<Internation> orderByComparator) {

		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the internations where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching internations
	 */
	public static List<Internation> findByName(
		String name, int start, int end,
		OrderByComparator<Internation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first internation in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public static Internation findByName_First(
			String name, OrderByComparator<Internation> orderByComparator)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	 * Returns the first internation in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public static Internation fetchByName_First(
		String name, OrderByComparator<Internation> orderByComparator) {

		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	 * Returns the last internation in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public static Internation findByName_Last(
			String name, OrderByComparator<Internation> orderByComparator)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last internation in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public static Internation fetchByName_Last(
		String name, OrderByComparator<Internation> orderByComparator) {

		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the internations before and after the current internation in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current internation
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next internation
	 * @throws NoSuchInternationException if a internation with the primary key could not be found
	 */
	public static Internation[] findByName_PrevAndNext(
			long id, String name,
			OrderByComparator<Internation> orderByComparator)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByName_PrevAndNext(
			id, name, orderByComparator);
	}

	/**
	 * Removes all the internations where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByName(String name) {
		getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of internations where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching internations
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Caches the internation in the entity cache if it is enabled.
	 *
	 * @param internation the internation
	 */
	public static void cacheResult(Internation internation) {
		getPersistence().cacheResult(internation);
	}

	/**
	 * Caches the internations in the entity cache if it is enabled.
	 *
	 * @param internations the internations
	 */
	public static void cacheResult(List<Internation> internations) {
		getPersistence().cacheResult(internations);
	}

	/**
	 * Creates a new internation with the primary key. Does not add the internation to the database.
	 *
	 * @param id the primary key for the new internation
	 * @return the new internation
	 */
	public static Internation create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the internation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the internation
	 * @return the internation that was removed
	 * @throws NoSuchInternationException if a internation with the primary key could not be found
	 */
	public static Internation remove(long id)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().remove(id);
	}

	public static Internation updateImpl(Internation internation) {
		return getPersistence().updateImpl(internation);
	}

	/**
	 * Returns the internation with the primary key or throws a <code>NoSuchInternationException</code> if it could not be found.
	 *
	 * @param id the primary key of the internation
	 * @return the internation
	 * @throws NoSuchInternationException if a internation with the primary key could not be found
	 */
	public static Internation findByPrimaryKey(long id)
		throws com.liferay.hms.internationalpatients.exception.
			NoSuchInternationException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the internation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the internation
	 * @return the internation, or <code>null</code> if a internation with the primary key could not be found
	 */
	public static Internation fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the internations.
	 *
	 * @return the internations
	 */
	public static List<Internation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the internations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @return the range of internations
	 */
	public static List<Internation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the internations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of internations
	 */
	public static List<Internation> findAll(
		int start, int end, OrderByComparator<Internation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the internations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of internations
	 * @param end the upper bound of the range of internations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of internations
	 */
	public static List<Internation> findAll(
		int start, int end, OrderByComparator<Internation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the internations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of internations.
	 *
	 * @return the number of internations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static InternationPersistence getPersistence() {
		return _persistence;
	}

	private static volatile InternationPersistence _persistence;

}