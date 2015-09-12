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

package com.liferay.samplelar.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
<<<<<<< HEAD
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
=======
import com.liferay.portal.kernel.systemevent.SystemEvent;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.SystemEventConstants;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.samplelar.SampleLARBookingBookingNumberException;
import com.liferay.samplelar.model.SampleLARBooking;
import com.liferay.samplelar.service.base.SampleLARBookingLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

/**
 * @author Mate Thurzo
 */
public class SampleLARBookingLocalServiceImpl
	extends SampleLARBookingLocalServiceBaseImpl {

<<<<<<< HEAD
	public SampleLARBooking addSampleLARBooking(
			long userId, long groupId, String bookingNumber,
			ServiceContext serviceContext)
		throws PortalException, SystemException {
=======
	@Override
	public SampleLARBooking addSampleLARBooking(
			long userId, long groupId, String bookingNumber,
			ServiceContext serviceContext)
		throws PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		validate(bookingNumber);

		long sampleLARBookingId = counterLocalService.increment();

		SampleLARBooking sampleLARBooking = sampleLARBookingPersistence.create(
			sampleLARBookingId);

		sampleLARBooking.setGroupId(groupId);
		sampleLARBooking.setCompanyId(user.getCompanyId());
		sampleLARBooking.setUserId(userId);
		sampleLARBooking.setUserName(user.getFullName());
		sampleLARBooking.setCreateDate(serviceContext.getCreateDate(now));
		sampleLARBooking.setModifiedDate(serviceContext.getModifiedDate(now));
		sampleLARBooking.setBookingNumber(bookingNumber);

		sampleLARBookingPersistence.update(sampleLARBooking);

		return sampleLARBooking;
	}

<<<<<<< HEAD
	public void deleteSampleLARBookings(long groupId) throws SystemException {
=======
	@Override
	public SampleLARBooking deleteSampleLARBooking(long sampleLARBookingId) {
		SampleLARBooking sampleLARBooking =
			sampleLARBookingPersistence.fetchByPrimaryKey(sampleLARBookingId);

		return sampleLARBookingLocalService.deleteSampleLARBooking(
			sampleLARBooking);
	}

	@Override
	@SystemEvent(type = SystemEventConstants.TYPE_DELETE)
	public SampleLARBooking deleteSampleLARBooking(
		SampleLARBooking sampleLARBooking) {

		return sampleLARBookingPersistence.remove(sampleLARBooking);
	}

	@Override
	public void deleteSampleLARBookings(long groupId) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		List<SampleLARBooking> sampleLARBookings =
			sampleLARBookingPersistence.findByGroupId(groupId);

		for (SampleLARBooking sampleLARBooking : sampleLARBookings) {
			sampleLARBookingLocalService.deleteSampleLARBooking(
				sampleLARBooking);
		}
	}

<<<<<<< HEAD
	public SampleLARBooking updateSampleLARBooking(
			long userId, long sampleLARBookingId, String bookingNumber,
			ServiceContext serviceContext)
		throws PortalException, SystemException {
=======
	@Override
	public List<SampleLARBooking> getSampleLARBookings(
		long groupId, int start, int end) {

		return sampleLARBookingPersistence.findByGroupId(groupId, start, end);
	}

	@Override
	public int getSampleLARBookingsCount(long groupId) {
		return sampleLARBookingPersistence.countByGroupId(groupId);
	}

	@Override
	public SampleLARBooking updateSampleLARBooking(
			long userId, long sampleLARBookingId, String bookingNumber,
			ServiceContext serviceContext)
		throws PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

		User user = userPersistence.findByPrimaryKey(userId);

		validate(bookingNumber);

		SampleLARBooking sampleLARBooking =
			sampleLARBookingPersistence.findByPrimaryKey(sampleLARBookingId);

		sampleLARBooking.setUserId(userId);
		sampleLARBooking.setUserName(user.getFullName());
		sampleLARBooking.setModifiedDate(
			serviceContext.getModifiedDate(new Date()));
		sampleLARBooking.setBookingNumber(bookingNumber);

		return sampleLARBookingPersistence.update(sampleLARBooking);
	}

	protected void validate(String bookingNumber) throws PortalException {
		if (Validator.isNull(bookingNumber)) {
			throw new SampleLARBookingBookingNumberException();
		}
	}

}