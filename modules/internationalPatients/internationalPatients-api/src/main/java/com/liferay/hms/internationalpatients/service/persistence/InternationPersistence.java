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

import com.liferay.hms.internationalpatients.exception.NoSuchInternationException;
import com.liferay.hms.internationalpatients.model.Internation;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the internation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InternationUtil
 * @generated
 */
@ProviderType
public interface InternationPersistence extends BasePersistence<Internation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InternationUtil} to access the internation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the internations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching internations
	 */
	public java.util.List<Internation> findByUuid(String uuid);

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
	public java.util.List<Internation> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Internation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator);

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
	public java.util.List<Internation> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first internation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public Internation findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Internation>
				orderByComparator)
		throws NoSuchInternationException;

	/**
	 * Returns the first internation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public Internation fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator);

	/**
	 * Returns the last internation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public Internation findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Internation>
				orderByComparator)
		throws NoSuchInternationException;

	/**
	 * Returns the last internation in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public Internation fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator);

	/**
	 * Returns the internations before and after the current internation in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current internation
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next internation
	 * @throws NoSuchInternationException if a internation with the primary key could not be found
	 */
	public Internation[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Internation>
				orderByComparator)
		throws NoSuchInternationException;

	/**
	 * Removes all the internations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of internations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching internations
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the internation where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInternationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public Internation findByUUID_G(String uuid, long groupId)
		throws NoSuchInternationException;

	/**
	 * Returns the internation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public Internation fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the internation where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public Internation fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the internation where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the internation that was removed
	 */
	public Internation removeByUUID_G(String uuid, long groupId)
		throws NoSuchInternationException;

	/**
	 * Returns the number of internations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching internations
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the internations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching internations
	 */
	public java.util.List<Internation> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<Internation> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Internation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator);

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
	public java.util.List<Internation> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first internation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public Internation findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Internation>
				orderByComparator)
		throws NoSuchInternationException;

	/**
	 * Returns the first internation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public Internation fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator);

	/**
	 * Returns the last internation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public Internation findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Internation>
				orderByComparator)
		throws NoSuchInternationException;

	/**
	 * Returns the last internation in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public Internation fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator);

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
	public Internation[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Internation>
				orderByComparator)
		throws NoSuchInternationException;

	/**
	 * Removes all the internations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of internations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching internations
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the internations where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching internations
	 */
	public java.util.List<Internation> findByName(String name);

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
	public java.util.List<Internation> findByName(
		String name, int start, int end);

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
	public java.util.List<Internation> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator);

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
	public java.util.List<Internation> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first internation in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public Internation findByName_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Internation>
				orderByComparator)
		throws NoSuchInternationException;

	/**
	 * Returns the first internation in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public Internation fetchByName_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator);

	/**
	 * Returns the last internation in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation
	 * @throws NoSuchInternationException if a matching internation could not be found
	 */
	public Internation findByName_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Internation>
				orderByComparator)
		throws NoSuchInternationException;

	/**
	 * Returns the last internation in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching internation, or <code>null</code> if a matching internation could not be found
	 */
	public Internation fetchByName_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator);

	/**
	 * Returns the internations before and after the current internation in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current internation
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next internation
	 * @throws NoSuchInternationException if a internation with the primary key could not be found
	 */
	public Internation[] findByName_PrevAndNext(
			long id, String name,
			com.liferay.portal.kernel.util.OrderByComparator<Internation>
				orderByComparator)
		throws NoSuchInternationException;

	/**
	 * Removes all the internations where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of internations where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching internations
	 */
	public int countByName(String name);

	/**
	 * Caches the internation in the entity cache if it is enabled.
	 *
	 * @param internation the internation
	 */
	public void cacheResult(Internation internation);

	/**
	 * Caches the internations in the entity cache if it is enabled.
	 *
	 * @param internations the internations
	 */
	public void cacheResult(java.util.List<Internation> internations);

	/**
	 * Creates a new internation with the primary key. Does not add the internation to the database.
	 *
	 * @param id the primary key for the new internation
	 * @return the new internation
	 */
	public Internation create(long id);

	/**
	 * Removes the internation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the internation
	 * @return the internation that was removed
	 * @throws NoSuchInternationException if a internation with the primary key could not be found
	 */
	public Internation remove(long id) throws NoSuchInternationException;

	public Internation updateImpl(Internation internation);

	/**
	 * Returns the internation with the primary key or throws a <code>NoSuchInternationException</code> if it could not be found.
	 *
	 * @param id the primary key of the internation
	 * @return the internation
	 * @throws NoSuchInternationException if a internation with the primary key could not be found
	 */
	public Internation findByPrimaryKey(long id)
		throws NoSuchInternationException;

	/**
	 * Returns the internation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the internation
	 * @return the internation, or <code>null</code> if a internation with the primary key could not be found
	 */
	public Internation fetchByPrimaryKey(long id);

	/**
	 * Returns all the internations.
	 *
	 * @return the internations
	 */
	public java.util.List<Internation> findAll();

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
	public java.util.List<Internation> findAll(int start, int end);

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
	public java.util.List<Internation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator);

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
	public java.util.List<Internation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Internation>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the internations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of internations.
	 *
	 * @return the number of internations
	 */
	public int countAll();

}