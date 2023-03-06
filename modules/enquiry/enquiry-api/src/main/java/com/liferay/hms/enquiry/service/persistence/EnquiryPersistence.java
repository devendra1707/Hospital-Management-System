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

import com.liferay.hms.enquiry.exception.NoSuchEnquiryException;
import com.liferay.hms.enquiry.model.Enquiry;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the enquiry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EnquiryUtil
 * @generated
 */
@ProviderType
public interface EnquiryPersistence extends BasePersistence<Enquiry> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EnquiryUtil} to access the enquiry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the enquiries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching enquiries
	 */
	public java.util.List<Enquiry> findByUuid(String uuid);

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
	public java.util.List<Enquiry> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Enquiry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

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
	public java.util.List<Enquiry> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public Enquiry findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Returns the first enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public Enquiry fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public Enquiry findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public Enquiry fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

	/**
	 * Returns the enquiries before and after the current enquiry in the ordered set where uuid = &#63;.
	 *
	 * @param enquiryId the primary key of the current enquiry
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	public Enquiry[] findByUuid_PrevAndNext(
			long enquiryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Removes all the enquiries where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of enquiries where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching enquiries
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the enquiry where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchEnquiryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public Enquiry findByUUID_G(String uuid, long groupId)
		throws NoSuchEnquiryException;

	/**
	 * Returns the enquiry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public Enquiry fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the enquiry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public Enquiry fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the enquiry where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the enquiry that was removed
	 */
	public Enquiry removeByUUID_G(String uuid, long groupId)
		throws NoSuchEnquiryException;

	/**
	 * Returns the number of enquiries where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching enquiries
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the enquiries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching enquiries
	 */
	public java.util.List<Enquiry> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Enquiry> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Enquiry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

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
	public java.util.List<Enquiry> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public Enquiry findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Returns the first enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public Enquiry fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public Enquiry findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Returns the last enquiry in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public Enquiry fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

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
	public Enquiry[] findByUuid_C_PrevAndNext(
			long enquiryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Removes all the enquiries where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of enquiries where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching enquiries
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the enquiries where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching enquiries
	 */
	public java.util.List<Enquiry> findByName(String name);

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
	public java.util.List<Enquiry> findByName(String name, int start, int end);

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
	public java.util.List<Enquiry> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

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
	public java.util.List<Enquiry> findByName(
		String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public Enquiry findByName_First(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Returns the first enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public Enquiry fetchByName_First(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

	/**
	 * Returns the last enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public Enquiry findByName_Last(
			String name,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Returns the last enquiry in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public Enquiry fetchByName_Last(
		String name,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

	/**
	 * Returns the enquiries before and after the current enquiry in the ordered set where name = &#63;.
	 *
	 * @param enquiryId the primary key of the current enquiry
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	public Enquiry[] findByName_PrevAndNext(
			long enquiryId, String name,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Removes all the enquiries where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	public void removeByName(String name);

	/**
	 * Returns the number of enquiries where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching enquiries
	 */
	public int countByName(String name);

	/**
	 * Returns all the enquiries where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the matching enquiries
	 */
	public java.util.List<Enquiry> findByMobileNo(String mobileNo);

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
	public java.util.List<Enquiry> findByMobileNo(
		String mobileNo, int start, int end);

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
	public java.util.List<Enquiry> findByMobileNo(
		String mobileNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

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
	public java.util.List<Enquiry> findByMobileNo(
		String mobileNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public Enquiry findByMobileNo_First(
			String mobileNo,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Returns the first enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public Enquiry fetchByMobileNo_First(
		String mobileNo,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

	/**
	 * Returns the last enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry
	 * @throws NoSuchEnquiryException if a matching enquiry could not be found
	 */
	public Enquiry findByMobileNo_Last(
			String mobileNo,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Returns the last enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching enquiry, or <code>null</code> if a matching enquiry could not be found
	 */
	public Enquiry fetchByMobileNo_Last(
		String mobileNo,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

	/**
	 * Returns the enquiries before and after the current enquiry in the ordered set where mobileNo = &#63;.
	 *
	 * @param enquiryId the primary key of the current enquiry
	 * @param mobileNo the mobile no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	public Enquiry[] findByMobileNo_PrevAndNext(
			long enquiryId, String mobileNo,
			com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
				orderByComparator)
		throws NoSuchEnquiryException;

	/**
	 * Removes all the enquiries where mobileNo = &#63; from the database.
	 *
	 * @param mobileNo the mobile no
	 */
	public void removeByMobileNo(String mobileNo);

	/**
	 * Returns the number of enquiries where mobileNo = &#63;.
	 *
	 * @param mobileNo the mobile no
	 * @return the number of matching enquiries
	 */
	public int countByMobileNo(String mobileNo);

	/**
	 * Caches the enquiry in the entity cache if it is enabled.
	 *
	 * @param enquiry the enquiry
	 */
	public void cacheResult(Enquiry enquiry);

	/**
	 * Caches the enquiries in the entity cache if it is enabled.
	 *
	 * @param enquiries the enquiries
	 */
	public void cacheResult(java.util.List<Enquiry> enquiries);

	/**
	 * Creates a new enquiry with the primary key. Does not add the enquiry to the database.
	 *
	 * @param enquiryId the primary key for the new enquiry
	 * @return the new enquiry
	 */
	public Enquiry create(long enquiryId);

	/**
	 * Removes the enquiry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry that was removed
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	public Enquiry remove(long enquiryId) throws NoSuchEnquiryException;

	public Enquiry updateImpl(Enquiry enquiry);

	/**
	 * Returns the enquiry with the primary key or throws a <code>NoSuchEnquiryException</code> if it could not be found.
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry
	 * @throws NoSuchEnquiryException if a enquiry with the primary key could not be found
	 */
	public Enquiry findByPrimaryKey(long enquiryId)
		throws NoSuchEnquiryException;

	/**
	 * Returns the enquiry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param enquiryId the primary key of the enquiry
	 * @return the enquiry, or <code>null</code> if a enquiry with the primary key could not be found
	 */
	public Enquiry fetchByPrimaryKey(long enquiryId);

	/**
	 * Returns all the enquiries.
	 *
	 * @return the enquiries
	 */
	public java.util.List<Enquiry> findAll();

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
	public java.util.List<Enquiry> findAll(int start, int end);

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
	public java.util.List<Enquiry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator);

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
	public java.util.List<Enquiry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Enquiry>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the enquiries from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of enquiries.
	 *
	 * @return the number of enquiries
	 */
	public int countAll();

}