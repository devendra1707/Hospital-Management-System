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

package com.liferay.hms.second.opinion.service.persistence;

import com.liferay.hms.second.opinion.model.SecondOpinion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the second opinion service. This utility wraps <code>com.liferay.hms.second.opinion.service.persistence.impl.SecondOpinionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondOpinionPersistence
 * @generated
 */
public class SecondOpinionUtil {

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
	public static void clearCache(SecondOpinion secondOpinion) {
		getPersistence().clearCache(secondOpinion);
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
	public static Map<Serializable, SecondOpinion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SecondOpinion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SecondOpinion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SecondOpinion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SecondOpinion update(SecondOpinion secondOpinion) {
		return getPersistence().update(secondOpinion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SecondOpinion update(
		SecondOpinion secondOpinion, ServiceContext serviceContext) {

		return getPersistence().update(secondOpinion, serviceContext);
	}

	/**
	 * Returns all the second opinions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching second opinions
	 */
	public static List<SecondOpinion> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the second opinions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @return the range of matching second opinions
	 */
	public static List<SecondOpinion> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the second opinions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching second opinions
	 */
	public static List<SecondOpinion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the second opinions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching second opinions
	 */
	public static List<SecondOpinion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SecondOpinion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first second opinion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public static SecondOpinion findByUuid_First(
			String uuid, OrderByComparator<SecondOpinion> orderByComparator)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first second opinion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public static SecondOpinion fetchByUuid_First(
		String uuid, OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last second opinion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public static SecondOpinion findByUuid_Last(
			String uuid, OrderByComparator<SecondOpinion> orderByComparator)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last second opinion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public static SecondOpinion fetchByUuid_Last(
		String uuid, OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the second opinions before and after the current second opinion in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current second opinion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next second opinion
	 * @throws NoSuchSecondOpinionException if a second opinion with the primary key could not be found
	 */
	public static SecondOpinion[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<SecondOpinion> orderByComparator)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the second opinions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of second opinions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching second opinions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the second opinion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSecondOpinionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public static SecondOpinion findByUUID_G(String uuid, long groupId)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the second opinion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public static SecondOpinion fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the second opinion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public static SecondOpinion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the second opinion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the second opinion that was removed
	 */
	public static SecondOpinion removeByUUID_G(String uuid, long groupId)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of second opinions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching second opinions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the second opinions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching second opinions
	 */
	public static List<SecondOpinion> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the second opinions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @return the range of matching second opinions
	 */
	public static List<SecondOpinion> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the second opinions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching second opinions
	 */
	public static List<SecondOpinion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the second opinions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching second opinions
	 */
	public static List<SecondOpinion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SecondOpinion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first second opinion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public static SecondOpinion findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SecondOpinion> orderByComparator)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first second opinion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public static SecondOpinion fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last second opinion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public static SecondOpinion findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SecondOpinion> orderByComparator)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last second opinion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public static SecondOpinion fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the second opinions before and after the current second opinion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current second opinion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next second opinion
	 * @throws NoSuchSecondOpinionException if a second opinion with the primary key could not be found
	 */
	public static SecondOpinion[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<SecondOpinion> orderByComparator)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the second opinions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of second opinions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching second opinions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the second opinions where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching second opinions
	 */
	public static List<SecondOpinion> findByName(String name) {
		return getPersistence().findByName(name);
	}

	/**
	 * Returns a range of all the second opinions where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @return the range of matching second opinions
	 */
	public static List<SecondOpinion> findByName(
		String name, int start, int end) {

		return getPersistence().findByName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the second opinions where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching second opinions
	 */
	public static List<SecondOpinion> findByName(
		String name, int start, int end,
		OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the second opinions where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching second opinions
	 */
	public static List<SecondOpinion> findByName(
		String name, int start, int end,
		OrderByComparator<SecondOpinion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first second opinion in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public static SecondOpinion findByName_First(
			String name, OrderByComparator<SecondOpinion> orderByComparator)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	 * Returns the first second opinion in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public static SecondOpinion fetchByName_First(
		String name, OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	 * Returns the last second opinion in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public static SecondOpinion findByName_Last(
			String name, OrderByComparator<SecondOpinion> orderByComparator)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last second opinion in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public static SecondOpinion fetchByName_Last(
		String name, OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the second opinions before and after the current second opinion in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current second opinion
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next second opinion
	 * @throws NoSuchSecondOpinionException if a second opinion with the primary key could not be found
	 */
	public static SecondOpinion[] findByName_PrevAndNext(
			long id, String name,
			OrderByComparator<SecondOpinion> orderByComparator)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByName_PrevAndNext(
			id, name, orderByComparator);
	}

	/**
	 * Removes all the second opinions where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByName(String name) {
		getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of second opinions where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching second opinions
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Caches the second opinion in the entity cache if it is enabled.
	 *
	 * @param secondOpinion the second opinion
	 */
	public static void cacheResult(SecondOpinion secondOpinion) {
		getPersistence().cacheResult(secondOpinion);
	}

	/**
	 * Caches the second opinions in the entity cache if it is enabled.
	 *
	 * @param secondOpinions the second opinions
	 */
	public static void cacheResult(List<SecondOpinion> secondOpinions) {
		getPersistence().cacheResult(secondOpinions);
	}

	/**
	 * Creates a new second opinion with the primary key. Does not add the second opinion to the database.
	 *
	 * @param id the primary key for the new second opinion
	 * @return the new second opinion
	 */
	public static SecondOpinion create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the second opinion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the second opinion
	 * @return the second opinion that was removed
	 * @throws NoSuchSecondOpinionException if a second opinion with the primary key could not be found
	 */
	public static SecondOpinion remove(long id)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().remove(id);
	}

	public static SecondOpinion updateImpl(SecondOpinion secondOpinion) {
		return getPersistence().updateImpl(secondOpinion);
	}

	/**
	 * Returns the second opinion with the primary key or throws a <code>NoSuchSecondOpinionException</code> if it could not be found.
	 *
	 * @param id the primary key of the second opinion
	 * @return the second opinion
	 * @throws NoSuchSecondOpinionException if a second opinion with the primary key could not be found
	 */
	public static SecondOpinion findByPrimaryKey(long id)
		throws com.liferay.hms.second.opinion.exception.
			NoSuchSecondOpinionException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the second opinion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the second opinion
	 * @return the second opinion, or <code>null</code> if a second opinion with the primary key could not be found
	 */
	public static SecondOpinion fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the second opinions.
	 *
	 * @return the second opinions
	 */
	public static List<SecondOpinion> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the second opinions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @return the range of second opinions
	 */
	public static List<SecondOpinion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the second opinions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of second opinions
	 */
	public static List<SecondOpinion> findAll(
		int start, int end,
		OrderByComparator<SecondOpinion> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the second opinions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondOpinionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of second opinions
	 * @param end the upper bound of the range of second opinions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of second opinions
	 */
	public static List<SecondOpinion> findAll(
		int start, int end, OrderByComparator<SecondOpinion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the second opinions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of second opinions.
	 *
	 * @return the number of second opinions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SecondOpinionPersistence getPersistence() {
		return _persistence;
	}

	private static volatile SecondOpinionPersistence _persistence;

}