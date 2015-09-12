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

package com.liferay.samplelar.model;

<<<<<<< HEAD
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
=======
import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SampleLARBooking service. Represents a row in the &quot;SampleLARBooking&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.samplelar.model.impl.SampleLARBookingImpl}.
 * </p>
 *
 * @author Mate Thurzo
 * @see SampleLARBooking
 * @see com.liferay.samplelar.model.impl.SampleLARBookingImpl
 * @see com.liferay.samplelar.model.impl.SampleLARBookingModelImpl
 * @generated
 */
<<<<<<< HEAD
=======
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public interface SampleLARBookingModel extends BaseModel<SampleLARBooking>,
	StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sample l a r booking model instance should use the {@link SampleLARBooking} interface instead.
	 */

	/**
	 * Returns the primary key of this sample l a r booking.
	 *
	 * @return the primary key of this sample l a r booking
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sample l a r booking.
	 *
	 * @param primaryKey the primary key of this sample l a r booking
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this sample l a r booking.
	 *
	 * @return the uuid of this sample l a r booking
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this sample l a r booking.
	 *
	 * @param uuid the uuid of this sample l a r booking
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the sample l a r booking ID of this sample l a r booking.
	 *
	 * @return the sample l a r booking ID of this sample l a r booking
	 */
	public long getSampleLARBookingId();

	/**
	 * Sets the sample l a r booking ID of this sample l a r booking.
	 *
	 * @param sampleLARBookingId the sample l a r booking ID of this sample l a r booking
	 */
	public void setSampleLARBookingId(long sampleLARBookingId);

	/**
	 * Returns the group ID of this sample l a r booking.
	 *
	 * @return the group ID of this sample l a r booking
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sample l a r booking.
	 *
	 * @param groupId the group ID of this sample l a r booking
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sample l a r booking.
	 *
	 * @return the company ID of this sample l a r booking
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sample l a r booking.
	 *
	 * @param companyId the company ID of this sample l a r booking
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sample l a r booking.
	 *
	 * @return the user ID of this sample l a r booking
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sample l a r booking.
	 *
	 * @param userId the user ID of this sample l a r booking
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sample l a r booking.
	 *
	 * @return the user uuid of this sample l a r booking
<<<<<<< HEAD
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;
=======
	 */
	@Override
	public String getUserUuid();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	/**
	 * Sets the user uuid of this sample l a r booking.
	 *
	 * @param userUuid the user uuid of this sample l a r booking
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sample l a r booking.
	 *
	 * @return the user name of this sample l a r booking
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sample l a r booking.
	 *
	 * @param userName the user name of this sample l a r booking
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sample l a r booking.
	 *
	 * @return the create date of this sample l a r booking
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sample l a r booking.
	 *
	 * @param createDate the create date of this sample l a r booking
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sample l a r booking.
	 *
	 * @return the modified date of this sample l a r booking
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sample l a r booking.
	 *
	 * @param modifiedDate the modified date of this sample l a r booking
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the booking number of this sample l a r booking.
	 *
	 * @return the booking number of this sample l a r booking
	 */
	@AutoEscape
	public String getBookingNumber();

	/**
	 * Sets the booking number of this sample l a r booking.
	 *
	 * @param bookingNumber the booking number of this sample l a r booking
	 */
	public void setBookingNumber(String bookingNumber);

<<<<<<< HEAD
=======
	/**
	 * Returns the last publish date of this sample l a r booking.
	 *
	 * @return the last publish date of this sample l a r booking
	 */
	public Date getLastPublishDate();

	/**
	 * Sets the last publish date of this sample l a r booking.
	 *
	 * @param lastPublishDate the last publish date of this sample l a r booking
	 */
	public void setLastPublishDate(Date lastPublishDate);

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
<<<<<<< HEAD
	public int compareTo(SampleLARBooking sampleLARBooking);
=======
	public int compareTo(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	@Override
	public int hashCode();

	@Override
<<<<<<< HEAD
	public CacheModel<SampleLARBooking> toCacheModel();

	@Override
	public SampleLARBooking toEscapedModel();

	@Override
	public SampleLARBooking toUnescapedModel();
=======
	public CacheModel<com.liferay.samplelar.model.SampleLARBooking> toCacheModel();

	@Override
	public com.liferay.samplelar.model.SampleLARBooking toEscapedModel();

	@Override
	public com.liferay.samplelar.model.SampleLARBooking toUnescapedModel();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	@Override
	public String toString();

	@Override
	public String toXmlString();
}