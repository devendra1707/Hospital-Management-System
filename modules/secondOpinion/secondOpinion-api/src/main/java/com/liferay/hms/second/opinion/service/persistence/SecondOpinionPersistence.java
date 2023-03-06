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

import com.liferay.hms.second.opinion.exception.NoSuchSecondOpinionException;
import com.liferay.hms.second.opinion.model.SecondOpinion;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the second opinion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SecondOpinionUtil
 * @generated
 */
@ProviderType
public interface SecondOpinionPersistence
	extends BasePersistence<SecondOpinion> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SecondOpinionUtil} to access the second opinion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the second opinions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching second opinions
	 */
	public java.util.List<SecondOpinion> findByUuid(String uuid);

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
	public java.util.List<SecondOpinion> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<SecondOpinion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator);

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
	public java.util.List<SecondOpinion> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first second opinion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public SecondOpinion findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
				orderByComparator)
		throws NoSuchSecondOpinionException;

	/**
	 * Returns the first second opinion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public SecondOpinion fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator);

	/**
	 * Returns the last second opinion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public SecondOpinion findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
				orderByComparator)
		throws NoSuchSecondOpinionException;

	/**
	 * Returns the last second opinion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public SecondOpinion fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator);

	/**
	 * Returns the second opinions before and after the current second opinion in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current second opinion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next second opinion
	 * @throws NoSuchSecondOpinionException if a second opinion with the primary key could not be found
	 */
	public SecondOpinion[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
				orderByComparator)
		throws NoSuchSecondOpinionException;

	/**
	 * Removes all the second opinions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of second opinions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching second opinions
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the second opinion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSecondOpinionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public SecondOpinion findByUUID_G(String uuid, long groupId)
		throws NoSuchSecondOpinionException;

	/**
	 * Returns the second opinion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public SecondOpinion fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the second opinion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public SecondOpinion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the second opinion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the second opinion that was removed
	 */
	public SecondOpinion removeByUUID_G(String uuid, long groupId)
		throws NoSuchSecondOpinionException;

	/**
	 * Returns the number of second opinions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching second opinions
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the second opinions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching second opinions
	 */
	public java.util.List<SecondOpinion> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<SecondOpinion> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<SecondOpinion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator);

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
	public java.util.List<SecondOpinion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first second opinion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public SecondOpinion findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
				orderByComparator)
		throws NoSuchSecondOpinionException;

	/**
	 * Returns the first second opinion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public SecondOpinion fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator);

	/**
	 * Returns the last second opinion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public SecondOpinion findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
				orderByComparator)
		throws NoSuchSecondOpinionException;

	/**
	 * Returns the last second opinion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public SecondOpinion fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator);

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
	public SecondOpinion[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
				orderByComparator)
		throws NoSuchSecondOpinionException;

	/**
	 * Removes all the second opinions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of second opinions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching second opinions
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the second opinions where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching second opinions
	 */
	public java.util.List<SecondOpinion> findByName(String name);

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
	public java.util.List<SecondOpinion> findByName(
		String name, int start, int end);

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
	public java.util.List<SecondOpinion> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator);

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
	public java.util.List<SecondOpinion> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first second opinion in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public SecondOpinion findByName_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
				orderByComparator)
		throws NoSuchSecondOpinionException;

	/**
	 * Returns the first second opinion in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public SecondOpinion fetchByName_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator);

	/**
	 * Returns the last second opinion in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion
	 * @throws NoSuchSecondOpinionException if a matching second opinion could not be found
	 */
	public SecondOpinion findByName_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
				orderByComparator)
		throws NoSuchSecondOpinionException;

	/**
	 * Returns the last second opinion in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching second opinion, or <code>null</code> if a matching second opinion could not be found
	 */
	public SecondOpinion fetchByName_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator);

	/**
	 * Returns the second opinions before and after the current second opinion in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current second opinion
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next second opinion
	 * @throws NoSuchSecondOpinionException if a second opinion with the primary key could not be found
	 */
	public SecondOpinion[] findByName_PrevAndNext(
			long id, String name,
			com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
				orderByComparator)
		throws NoSuchSecondOpinionException;

	/**
	 * Removes all the second opinions where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of second opinions where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching second opinions
	 */
	public int countByName(String name);

	/**
	 * Caches the second opinion in the entity cache if it is enabled.
	 *
	 * @param secondOpinion the second opinion
	 */
	public void cacheResult(SecondOpinion secondOpinion);

	/**
	 * Caches the second opinions in the entity cache if it is enabled.
	 *
	 * @param secondOpinions the second opinions
	 */
	public void cacheResult(java.util.List<SecondOpinion> secondOpinions);

	/**
	 * Creates a new second opinion with the primary key. Does not add the second opinion to the database.
	 *
	 * @param id the primary key for the new second opinion
	 * @return the new second opinion
	 */
	public SecondOpinion create(long id);

	/**
	 * Removes the second opinion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the second opinion
	 * @return the second opinion that was removed
	 * @throws NoSuchSecondOpinionException if a second opinion with the primary key could not be found
	 */
	public SecondOpinion remove(long id) throws NoSuchSecondOpinionException;

	public SecondOpinion updateImpl(SecondOpinion secondOpinion);

	/**
	 * Returns the second opinion with the primary key or throws a <code>NoSuchSecondOpinionException</code> if it could not be found.
	 *
	 * @param id the primary key of the second opinion
	 * @return the second opinion
	 * @throws NoSuchSecondOpinionException if a second opinion with the primary key could not be found
	 */
	public SecondOpinion findByPrimaryKey(long id)
		throws NoSuchSecondOpinionException;

	/**
	 * Returns the second opinion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the second opinion
	 * @return the second opinion, or <code>null</code> if a second opinion with the primary key could not be found
	 */
	public SecondOpinion fetchByPrimaryKey(long id);

	/**
	 * Returns all the second opinions.
	 *
	 * @return the second opinions
	 */
	public java.util.List<SecondOpinion> findAll();

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
	public java.util.List<SecondOpinion> findAll(int start, int end);

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
	public java.util.List<SecondOpinion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator);

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
	public java.util.List<SecondOpinion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SecondOpinion>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the second opinions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of second opinions.
	 *
	 * @return the number of second opinions
	 */
	public int countAll();

}