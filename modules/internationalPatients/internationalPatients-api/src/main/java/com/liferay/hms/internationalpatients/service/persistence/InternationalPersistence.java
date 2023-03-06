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

import com.liferay.hms.internationalpatients.exception.NoSuchInternationalException;
import com.liferay.hms.internationalpatients.model.International;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the international service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InternationalUtil
 * @generated
 */
@ProviderType
public interface InternationalPersistence
	extends BasePersistence<International> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InternationalUtil} to access the international persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the internationals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching internationals
	 */
	public java.util.List<International> findByUuid(String uuid);

	/**
	 * Returns a range of all the internationals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @return the range of matching internationals
	 */
	public java.util.List<International> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the internationals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching internationals
	 */
	public java.util.List<International> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator);

	/**
	 * Returns an ordered range of all the internationals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching internationals
	 */
	public java.util.List<International> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first international in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching international
	 * @throws NoSuchInternationalException if a matching international could not be found
	 */
	public International findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<International>
				orderByComparator)
		throws NoSuchInternationalException;

	/**
	 * Returns the first international in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching international, or <code>null</code> if a matching international could not be found
	 */
	public International fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator);

	/**
	 * Returns the last international in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching international
	 * @throws NoSuchInternationalException if a matching international could not be found
	 */
	public International findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<International>
				orderByComparator)
		throws NoSuchInternationalException;

	/**
	 * Returns the last international in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching international, or <code>null</code> if a matching international could not be found
	 */
	public International fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator);

	/**
	 * Returns the internationals before and after the current international in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current international
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next international
	 * @throws NoSuchInternationalException if a international with the primary key could not be found
	 */
	public International[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<International>
				orderByComparator)
		throws NoSuchInternationalException;

	/**
	 * Removes all the internationals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of internationals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching internationals
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the international where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchInternationalException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching international
	 * @throws NoSuchInternationalException if a matching international could not be found
	 */
	public International findByUUID_G(String uuid, long groupId)
		throws NoSuchInternationalException;

	/**
	 * Returns the international where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching international, or <code>null</code> if a matching international could not be found
	 */
	public International fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the international where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching international, or <code>null</code> if a matching international could not be found
	 */
	public International fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the international where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the international that was removed
	 */
	public International removeByUUID_G(String uuid, long groupId)
		throws NoSuchInternationalException;

	/**
	 * Returns the number of internationals where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching internationals
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the internationals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching internationals
	 */
	public java.util.List<International> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the internationals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @return the range of matching internationals
	 */
	public java.util.List<International> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the internationals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching internationals
	 */
	public java.util.List<International> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator);

	/**
	 * Returns an ordered range of all the internationals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching internationals
	 */
	public java.util.List<International> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first international in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching international
	 * @throws NoSuchInternationalException if a matching international could not be found
	 */
	public International findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<International>
				orderByComparator)
		throws NoSuchInternationalException;

	/**
	 * Returns the first international in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching international, or <code>null</code> if a matching international could not be found
	 */
	public International fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator);

	/**
	 * Returns the last international in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching international
	 * @throws NoSuchInternationalException if a matching international could not be found
	 */
	public International findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<International>
				orderByComparator)
		throws NoSuchInternationalException;

	/**
	 * Returns the last international in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching international, or <code>null</code> if a matching international could not be found
	 */
	public International fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator);

	/**
	 * Returns the internationals before and after the current international in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current international
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next international
	 * @throws NoSuchInternationalException if a international with the primary key could not be found
	 */
	public International[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<International>
				orderByComparator)
		throws NoSuchInternationalException;

	/**
	 * Removes all the internationals where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of internationals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching internationals
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the internationals where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching internationals
	 */
	public java.util.List<International> findByName(String name);

	/**
	 * Returns a range of all the internationals where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @return the range of matching internationals
	 */
	public java.util.List<International> findByName(
		String name, int start, int end);

	/**
	 * Returns an ordered range of all the internationals where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching internationals
	 */
	public java.util.List<International> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator);

	/**
	 * Returns an ordered range of all the internationals where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching internationals
	 */
	public java.util.List<International> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first international in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching international
	 * @throws NoSuchInternationalException if a matching international could not be found
	 */
	public International findByName_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<International>
				orderByComparator)
		throws NoSuchInternationalException;

	/**
	 * Returns the first international in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching international, or <code>null</code> if a matching international could not be found
	 */
	public International fetchByName_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator);

	/**
	 * Returns the last international in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching international
	 * @throws NoSuchInternationalException if a matching international could not be found
	 */
	public International findByName_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<International>
				orderByComparator)
		throws NoSuchInternationalException;

	/**
	 * Returns the last international in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching international, or <code>null</code> if a matching international could not be found
	 */
	public International fetchByName_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator);

	/**
	 * Returns the internationals before and after the current international in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current international
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next international
	 * @throws NoSuchInternationalException if a international with the primary key could not be found
	 */
	public International[] findByName_PrevAndNext(
			long id, String name,
			com.liferay.portal.kernel.util.OrderByComparator<International>
				orderByComparator)
		throws NoSuchInternationalException;

	/**
	 * Removes all the internationals where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of internationals where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching internationals
	 */
	public int countByName(String name);

	/**
	 * Caches the international in the entity cache if it is enabled.
	 *
	 * @param international the international
	 */
	public void cacheResult(International international);

	/**
	 * Caches the internationals in the entity cache if it is enabled.
	 *
	 * @param internationals the internationals
	 */
	public void cacheResult(java.util.List<International> internationals);

	/**
	 * Creates a new international with the primary key. Does not add the international to the database.
	 *
	 * @param id the primary key for the new international
	 * @return the new international
	 */
	public International create(long id);

	/**
	 * Removes the international with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the international
	 * @return the international that was removed
	 * @throws NoSuchInternationalException if a international with the primary key could not be found
	 */
	public International remove(long id) throws NoSuchInternationalException;

	public International updateImpl(International international);

	/**
	 * Returns the international with the primary key or throws a <code>NoSuchInternationalException</code> if it could not be found.
	 *
	 * @param id the primary key of the international
	 * @return the international
	 * @throws NoSuchInternationalException if a international with the primary key could not be found
	 */
	public International findByPrimaryKey(long id)
		throws NoSuchInternationalException;

	/**
	 * Returns the international with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the international
	 * @return the international, or <code>null</code> if a international with the primary key could not be found
	 */
	public International fetchByPrimaryKey(long id);

	/**
	 * Returns all the internationals.
	 *
	 * @return the internationals
	 */
	public java.util.List<International> findAll();

	/**
	 * Returns a range of all the internationals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @return the range of internationals
	 */
	public java.util.List<International> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the internationals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of internationals
	 */
	public java.util.List<International> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator);

	/**
	 * Returns an ordered range of all the internationals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>InternationalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of internationals
	 * @param end the upper bound of the range of internationals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of internationals
	 */
	public java.util.List<International> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<International>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the internationals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of internationals.
	 *
	 * @return the number of internationals
	 */
	public int countAll();

}