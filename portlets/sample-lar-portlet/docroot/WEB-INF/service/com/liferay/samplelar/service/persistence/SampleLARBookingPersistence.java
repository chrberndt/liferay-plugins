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

package com.liferay.samplelar.service.persistence;

<<<<<<< HEAD
=======
import aQute.bnd.annotation.ProviderType;

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.samplelar.model.SampleLARBooking;

/**
 * The persistence interface for the sample l a r booking service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mate Thurzo
<<<<<<< HEAD
 * @see SampleLARBookingPersistenceImpl
 * @see SampleLARBookingUtil
 * @generated
 */
=======
 * @see com.liferay.samplelar.service.persistence.impl.SampleLARBookingPersistenceImpl
 * @see SampleLARBookingUtil
 * @generated
 */
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public interface SampleLARBookingPersistence extends BasePersistence<SampleLARBooking> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SampleLARBookingUtil} to access the sample l a r booking persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the sample l a r bookings where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findByUuid(java.lang.String uuid);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns a range of all the sample l a r bookings where uuid = &#63;.
	*
	* <p>
<<<<<<< HEAD
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
=======
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of sample l a r bookings
	* @param end the upper bound of the range of sample l a r bookings (not inclusive)
	* @return the range of matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findByUuid(java.lang.String uuid,
		int start, int end);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns an ordered range of all the sample l a r bookings where uuid = &#63;.
	*
	* <p>
<<<<<<< HEAD
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
=======
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of sample l a r bookings
	* @param end the upper bound of the range of sample l a r bookings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the first sample l a r booking in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sample l a r booking
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a matching sample l a r booking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a matching sample l a r booking could not be found
	*/
	public SampleLARBooking findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the first sample l a r booking in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sample l a r booking, or <code>null</code> if a matching sample l a r booking could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public SampleLARBooking fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the last sample l a r booking in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sample l a r booking
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a matching sample l a r booking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a matching sample l a r booking could not be found
	*/
	public SampleLARBooking findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the last sample l a r booking in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sample l a r booking, or <code>null</code> if a matching sample l a r booking could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public SampleLARBooking fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the sample l a r bookings before and after the current sample l a r booking in the ordered set where uuid = &#63;.
	*
	* @param sampleLARBookingId the primary key of the current sample l a r booking
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sample l a r booking
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a sample l a r booking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking[] findByUuid_PrevAndNext(
		long sampleLARBookingId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a sample l a r booking with the primary key could not be found
	*/
	public SampleLARBooking[] findByUuid_PrevAndNext(long sampleLARBookingId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Removes all the sample l a r bookings where uuid = &#63; from the database.
	*
	* @param uuid the uuid
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public void removeByUuid(java.lang.String uuid);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the number of sample l a r bookings where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sample l a r booking where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.samplelar.NoSuchBookingException} if it could not be found.
=======
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the sample l a r booking where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchBookingException} if it could not be found.
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching sample l a r booking
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a matching sample l a r booking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a matching sample l a r booking could not be found
	*/
	public SampleLARBooking findByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the sample l a r booking where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching sample l a r booking, or <code>null</code> if a matching sample l a r booking could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public SampleLARBooking fetchByUUID_G(java.lang.String uuid, long groupId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the sample l a r booking where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching sample l a r booking, or <code>null</code> if a matching sample l a r booking could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public SampleLARBooking fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Removes the sample l a r booking where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the sample l a r booking that was removed
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	*/
	public SampleLARBooking removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the number of sample l a r bookings where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns all the sample l a r bookings where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findByUuid_C(
		java.lang.String uuid, long companyId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns a range of all the sample l a r bookings where uuid = &#63; and companyId = &#63;.
	*
	* <p>
<<<<<<< HEAD
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
=======
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of sample l a r bookings
	* @param end the upper bound of the range of sample l a r bookings (not inclusive)
	* @return the range of matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns an ordered range of all the sample l a r bookings where uuid = &#63; and companyId = &#63;.
	*
	* <p>
<<<<<<< HEAD
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
=======
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of sample l a r bookings
	* @param end the upper bound of the range of sample l a r bookings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the first sample l a r booking in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sample l a r booking
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a matching sample l a r booking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a matching sample l a r booking could not be found
	*/
	public SampleLARBooking findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the first sample l a r booking in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sample l a r booking, or <code>null</code> if a matching sample l a r booking could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public SampleLARBooking fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the last sample l a r booking in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sample l a r booking
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a matching sample l a r booking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a matching sample l a r booking could not be found
	*/
	public SampleLARBooking findByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the last sample l a r booking in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sample l a r booking, or <code>null</code> if a matching sample l a r booking could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public SampleLARBooking fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the sample l a r bookings before and after the current sample l a r booking in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param sampleLARBookingId the primary key of the current sample l a r booking
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sample l a r booking
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a sample l a r booking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking[] findByUuid_C_PrevAndNext(
		long sampleLARBookingId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a sample l a r booking with the primary key could not be found
	*/
	public SampleLARBooking[] findByUuid_C_PrevAndNext(
		long sampleLARBookingId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Removes all the sample l a r bookings where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the number of sample l a r bookings where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns all the sample l a r bookings where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findByGroupId(long groupId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns a range of all the sample l a r bookings where groupId = &#63;.
	*
	* <p>
<<<<<<< HEAD
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
=======
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of sample l a r bookings
	* @param end the upper bound of the range of sample l a r bookings (not inclusive)
	* @return the range of matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findByGroupId(long groupId,
		int start, int end);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns an ordered range of all the sample l a r bookings where groupId = &#63;.
	*
	* <p>
<<<<<<< HEAD
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
=======
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of sample l a r bookings
	* @param end the upper bound of the range of sample l a r bookings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the first sample l a r booking in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sample l a r booking
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a matching sample l a r booking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a matching sample l a r booking could not be found
	*/
	public SampleLARBooking findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the first sample l a r booking in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sample l a r booking, or <code>null</code> if a matching sample l a r booking could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public SampleLARBooking fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the last sample l a r booking in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sample l a r booking
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a matching sample l a r booking could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a matching sample l a r booking could not be found
	*/
	public SampleLARBooking findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the last sample l a r booking in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sample l a r booking, or <code>null</code> if a matching sample l a r booking could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public SampleLARBooking fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the sample l a r bookings before and after the current sample l a r booking in the ordered set where groupId = &#63;.
	*
	* @param sampleLARBookingId the primary key of the current sample l a r booking
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sample l a r booking
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a sample l a r booking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking[] findByGroupId_PrevAndNext(
		long sampleLARBookingId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a sample l a r booking with the primary key could not be found
	*/
	public SampleLARBooking[] findByGroupId_PrevAndNext(
		long sampleLARBookingId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Removes all the sample l a r bookings where groupId = &#63; from the database.
	*
	* @param groupId the group ID
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public void removeByGroupId(long groupId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the number of sample l a r bookings where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public int countByGroupId(long groupId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Caches the sample l a r booking in the entity cache if it is enabled.
	*
	* @param sampleLARBooking the sample l a r booking
	*/
<<<<<<< HEAD
	public void cacheResult(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking);
=======
	public void cacheResult(SampleLARBooking sampleLARBooking);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Caches the sample l a r bookings in the entity cache if it is enabled.
	*
	* @param sampleLARBookings the sample l a r bookings
	*/
<<<<<<< HEAD
	public void cacheResult(
		java.util.List<com.liferay.samplelar.model.SampleLARBooking> sampleLARBookings);
=======
	public void cacheResult(java.util.List<SampleLARBooking> sampleLARBookings);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Creates a new sample l a r booking with the primary key. Does not add the sample l a r booking to the database.
	*
	* @param sampleLARBookingId the primary key for the new sample l a r booking
	* @return the new sample l a r booking
	*/
<<<<<<< HEAD
	public com.liferay.samplelar.model.SampleLARBooking create(
		long sampleLARBookingId);
=======
	public SampleLARBooking create(long sampleLARBookingId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Removes the sample l a r booking with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sampleLARBookingId the primary key of the sample l a r booking
	* @return the sample l a r booking that was removed
<<<<<<< HEAD
	* @throws com.liferay.samplelar.NoSuchBookingException if a sample l a r booking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking remove(
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;

	public com.liferay.samplelar.model.SampleLARBooking updateImpl(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the sample l a r booking with the primary key or throws a {@link com.liferay.samplelar.NoSuchBookingException} if it could not be found.
	*
	* @param sampleLARBookingId the primary key of the sample l a r booking
	* @return the sample l a r booking
	* @throws com.liferay.samplelar.NoSuchBookingException if a sample l a r booking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking findByPrimaryKey(
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.samplelar.NoSuchBookingException;
=======
	* @throws NoSuchBookingException if a sample l a r booking with the primary key could not be found
	*/
	public SampleLARBooking remove(long sampleLARBookingId)
		throws com.liferay.samplelar.NoSuchBookingException;

	public SampleLARBooking updateImpl(SampleLARBooking sampleLARBooking);

	/**
	* Returns the sample l a r booking with the primary key or throws a {@link NoSuchBookingException} if it could not be found.
	*
	* @param sampleLARBookingId the primary key of the sample l a r booking
	* @return the sample l a r booking
	* @throws NoSuchBookingException if a sample l a r booking with the primary key could not be found
	*/
	public SampleLARBooking findByPrimaryKey(long sampleLARBookingId)
		throws com.liferay.samplelar.NoSuchBookingException;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the sample l a r booking with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sampleLARBookingId the primary key of the sample l a r booking
	* @return the sample l a r booking, or <code>null</code> if a sample l a r booking with the primary key could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.samplelar.model.SampleLARBooking fetchByPrimaryKey(
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public SampleLARBooking fetchByPrimaryKey(long sampleLARBookingId);

	@Override
	public java.util.Map<java.io.Serializable, SampleLARBooking> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns all the sample l a r bookings.
	*
	* @return the sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findAll();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns a range of all the sample l a r bookings.
	*
	* <p>
<<<<<<< HEAD
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
=======
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	* </p>
	*
	* @param start the lower bound of the range of sample l a r bookings
	* @param end the upper bound of the range of sample l a r bookings (not inclusive)
	* @return the range of sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findAll(int start, int end);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns an ordered range of all the sample l a r bookings.
	*
	* <p>
<<<<<<< HEAD
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
=======
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	* </p>
	*
	* @param start the lower bound of the range of sample l a r bookings
	* @param end the upper bound of the range of sample l a r bookings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the sample l a r bookings from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public java.util.List<SampleLARBooking> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleLARBooking> orderByComparator);

	/**
	* Removes all the sample l a r bookings from the database.
	*/
	public void removeAll();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	* Returns the number of sample l a r bookings.
	*
	* @return the number of sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
=======
	*/
	public int countAll();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}