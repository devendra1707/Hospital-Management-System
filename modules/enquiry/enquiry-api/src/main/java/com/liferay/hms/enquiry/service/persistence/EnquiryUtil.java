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

package com.liferay.hms.enquiry.service.persistence;

import com.liferay.hms.enquiry.model.Enquiry;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the enquiry service. This utility wraps <code>com.liferay.hms.enquiry.service.persistence.impl.EnquiryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnquiryPersistence
 * @generated
 */
public class EnquiryUtil {

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
	public static void clearCache(Enquiry enquiry) {
		getPersistence().clearCache(enquiry);
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
	public static Map<Serializable, Enquiry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Enquiry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Enquiry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Enquiry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Enquiry update(Enquiry enquiry) {
		return getPersistence().update(enquiry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Enquiry update(
		Enquiry enquiry, ServiceContext serviceContext) {

		return getPersistence().update(enquiry, serviceContext);
	}

	/**
	 * Returns all the enquiries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching enquiries
	 */
	public static List<Enquiry> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
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
	public static List<Enquiry> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
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
	public static List<Enquiry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static List<Enquiry> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Enquiry> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public static Enquiry findByUuid_First(
			String uuid, OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public static Enquiry fetchByUuid_First(
		String uuid, OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public static Enquiry findByUuid_Last(
			String uuid, OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public static Enquiry fetchByUuid_Last(
		String uuid, OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static Enquiry[] findByUuid_PrevAndNext(
			long enquiryId, String uuid,
			OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByUuid_PrevAndNext(
			enquiryId, uuid, orderByComparator);
	}

	/**
	 * Removes all the enquiries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of enquiries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching enquiries
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the enquiry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEnquiryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public static Enquiry findByUUID_G(String uuid, long groupId)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the enquiry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public static Enquiry fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the enquiry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public static Enquiry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the enquiry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the enquiry that was removed
	 */
	public static Enquiry removeByUUID_G(String uuid, long groupId)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of enquiries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching enquiries
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the enquiries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching enquiries
	 */
	public static List<Enquiry> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
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
	public static List<Enquiry> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
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
	public static List<Enquiry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public static List<Enquiry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Enquiry> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
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
	public static Enquiry findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public static Enquiry fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
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
	public static Enquiry findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public static Enquiry fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
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
	public static Enquiry[] findByUuid_C_PrevAndNext(
			long enquiryId, String uuid, long companyId,
			OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByUuid_C_PrevAndNext(
			enquiryId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the enquiries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of enquiries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching enquiries
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the enquiries where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching enquiries
	 */
	public static List<Enquiry> findByName(String name) {
		return getPersistence().findByName(name);
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
	public static List<Enquiry> findByName(String name, int start, int end) {
		return getPersistence().findByName(name, start, end);
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
	public static List<Enquiry> findByName(
		String name, int start, int end,
		OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().findByName(name, start, end, orderByComparator);
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
	public static List<Enquiry> findByName(
		String name, int start, int end,
		OrderByComparator<Enquiry> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public static Enquiry findByName_First(
			String name, OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	 * Returns the first enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public static Enquiry fetchByName_First(
		String name, OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	 * Returns the last enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public static Enquiry findByName_Last(
			String name, OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public static Enquiry fetchByName_Last(
		String name, OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().fetchByName_Last(name, orderByComparator);
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
	public static Enquiry[] findByName_PrevAndNext(
			long enquiryId, String name,
			OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByName_PrevAndNext(
			enquiryId, name, orderByComparator);
	}

	/**
	 * Removes all the enquiries where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByName(String name) {
		getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of enquiries where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching enquiries
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Returns all the enquiries where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the matching enquiries
	 */
	public static List<Enquiry> findByMobileNo(String mobileNo) {
		return getPersistence().findByMobileNo(mobileNo);
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
	public static List<Enquiry> findByMobileNo(
		String mobileNo, int start, int end) {

		return getPersistence().findByMobileNo(mobileNo, start, end);
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
	public static List<Enquiry> findByMobileNo(
		String mobileNo, int start, int end,
		OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().findByMobileNo(
			mobileNo, start, end, orderByComparator);
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
	public static List<Enquiry> findByMobileNo(
		String mobileNo, int start, int end,
		OrderByComparator<Enquiry> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByMobileNo(
			mobileNo, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public static Enquiry findByMobileNo_First(
			String mobileNo, OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByMobileNo_First(
			mobileNo, orderByComparator);
	}

	/**
	 * Returns the first enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public static Enquiry fetchByMobileNo_First(
		String mobileNo, OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().fetchByMobileNo_First(
			mobileNo, orderByComparator);
	}

	/**
	 * Returns the last enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public static Enquiry findByMobileNo_Last(
			String mobileNo, OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByMobileNo_Last(
			mobileNo, orderByComparator);
	}

	/**
	 * Returns the last enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public static Enquiry fetchByMobileNo_Last(
		String mobileNo, OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().fetchByMobileNo_Last(
			mobileNo, orderByComparator);
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
	public static Enquiry[] findByMobileNo_PrevAndNext(
			long enquiryId, String mobileNo,
			OrderByComparator<Enquiry> orderByComparator)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByMobileNo_PrevAndNext(
			enquiryId, mobileNo, orderByComparator);
	}

	/**
	 * Removes all the enquiries where mobileNo = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 */
	public static void removeByMobileNo(String mobileNo) {
		getPersistence().removeByMobileNo(mobileNo);
	}

	/**
	 * Returns the number of enquiries where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the number of matching enquiries
	 */
	public static int countByMobileNo(String mobileNo) {
		return getPersistence().countByMobileNo(mobileNo);
	}

	/**
	 * Caches the enquiry in the entity cache if it is enabled.
	 *
	 * @param enquiry the enquiry
	 */
	public static void cacheResult(Enquiry enquiry) {
		getPersistence().cacheResult(enquiry);
	}

	/**
	 * Caches the enquiries in the entity cache if it is enabled.
	 *
	 * @param enquiries the enquiries
	 */
	public static void cacheResult(List<Enquiry> enquiries) {
		getPersistence().cacheResult(enquiries);
	}

	/**
	 * Creates a new enquiry with the primary key. Does not add the enquiry to the database.
	 *
	 * @param enquiryId the primary key for the new enquiry
	 * @return the new enquiry
	 */
	public static Enquiry create(long enquiryId) {
		return getPersistence().create(enquiryId);
	}

	/**
	 * Removes the enquiry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry that was removed
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	public static Enquiry remove(long enquiryId)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().remove(enquiryId);
	}

	public static Enquiry updateImpl(Enquiry enquiry) {
		return getPersistence().updateImpl(enquiry);
	}

	/**
	 * Returns the enquiry with the primary key or throws a <code>NoSuchEnquiryException</code> if it could not be found.
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	public static Enquiry findByPrimaryKey(long enquiryId)
		throws com.liferay.hms.enquiry.exception.NoSuchEnquiryException {

		return getPersistence().findByPrimaryKey(enquiryId);
	}

	/**
	 * Returns the enquiry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry, or <code>null</code> if a enquiry with the primary key could not be found
	 */
	public static Enquiry fetchByPrimaryKey(long enquiryId) {
		return getPersistence().fetchByPrimaryKey(enquiryId);
	}

	/**
	 * Returns all the enquiries.
	 *
	 * @return the enquiries
	 */
	public static List<Enquiry> findAll() {
		return getPersistence().findAll();
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
	public static List<Enquiry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Enquiry> findAll(
		int start, int end, OrderByComparator<Enquiry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Enquiry> findAll(
		int start, int end, OrderByComparator<Enquiry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the enquiries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of enquiries.
	 *
	 * @return the number of enquiries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EnquiryPersistence getPersistence() {
		return _persistence;
	}

	private static volatile EnquiryPersistence _persistence;

}