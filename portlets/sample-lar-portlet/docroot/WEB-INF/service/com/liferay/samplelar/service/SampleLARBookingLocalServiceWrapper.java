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

package com.liferay.samplelar.service;

<<<<<<< HEAD
=======
import aQute.bnd.annotation.ProviderType;

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SampleLARBookingLocalService}.
 *
 * @author Mate Thurzo
 * @see SampleLARBookingLocalService
 * @generated
 */
<<<<<<< HEAD
=======
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public class SampleLARBookingLocalServiceWrapper
	implements SampleLARBookingLocalService,
		ServiceWrapper<SampleLARBookingLocalService> {
	public SampleLARBookingLocalServiceWrapper(
		SampleLARBookingLocalService sampleLARBookingLocalService) {
		_sampleLARBookingLocalService = sampleLARBookingLocalService;
	}

	/**
	* Adds the sample l a r booking to the database. Also notifies the appropriate model listeners.
	*
	* @param sampleLARBooking the sample l a r booking
	* @return the sample l a r booking that was added
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking addSampleLARBooking(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sampleLARBookingLocalService.addSampleLARBooking(sampleLARBooking);
	}

=======
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking addSampleLARBooking(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking) {
		return _sampleLARBookingLocalService.addSampleLARBooking(sampleLARBooking);
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking addSampleLARBooking(
		long userId, long groupId, java.lang.String bookingNumber,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sampleLARBookingLocalService.addSampleLARBooking(userId,
			groupId, bookingNumber, serviceContext);
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	/**
	* Creates a new sample l a r booking with the primary key. Does not add the sample l a r booking to the database.
	*
	* @param sampleLARBookingId the primary key for the new sample l a r booking
	* @return the new sample l a r booking
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking createSampleLARBooking(
		long sampleLARBookingId) {
		return _sampleLARBookingLocalService.createSampleLARBooking(sampleLARBookingId);
	}

	/**
<<<<<<< HEAD
	* Deletes the sample l a r booking with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sampleLARBookingId the primary key of the sample l a r booking
	* @return the sample l a r booking that was removed
	* @throws PortalException if a sample l a r booking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking deleteSampleLARBooking(
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sampleLARBookingLocalService.deleteSampleLARBooking(sampleLARBookingId);
=======
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sampleLARBookingLocalService.deletePersistedModel(persistedModel);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	/**
	* Deletes the sample l a r booking from the database. Also notifies the appropriate model listeners.
	*
	* @param sampleLARBooking the sample l a r booking
	* @return the sample l a r booking that was removed
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking deleteSampleLARBooking(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sampleLARBookingLocalService.deleteSampleLARBooking(sampleLARBooking);
	}

=======
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking deleteSampleLARBooking(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking) {
		return _sampleLARBookingLocalService.deleteSampleLARBooking(sampleLARBooking);
	}

	/**
	* Deletes the sample l a r booking with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sampleLARBookingId the primary key of the sample l a r booking
	* @return the sample l a r booking that was removed
	* @throws PortalException if a sample l a r booking with the primary key could not be found
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking deleteSampleLARBooking(
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sampleLARBookingLocalService.deleteSampleLARBooking(sampleLARBookingId);
	}

	@Override
	public void deleteSampleLARBookings(long groupId) {
		_sampleLARBookingLocalService.deleteSampleLARBookings(groupId);
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sampleLARBookingLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
=======
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
<<<<<<< HEAD
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
<<<<<<< HEAD
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
=======
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
<<<<<<< HEAD
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
		com.liferay.portal.kernel.dao.orm.Projection projection) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking fetchSampleLARBooking(
<<<<<<< HEAD
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
		long sampleLARBookingId) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.fetchSampleLARBooking(sampleLARBookingId);
	}

	/**
<<<<<<< HEAD
	* Returns the sample l a r booking with the matching UUID and company.
	*
	* @param uuid the sample l a r booking's UUID
	* @param companyId the primary key of the company
	* @return the matching sample l a r booking, or <code>null</code> if a matching sample l a r booking could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking fetchSampleLARBookingByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sampleLARBookingLocalService.fetchSampleLARBookingByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	* Returns the sample l a r booking matching the UUID and group.
	*
	* @param uuid the sample l a r booking's UUID
	* @param groupId the primary key of the group
	* @return the matching sample l a r booking, or <code>null</code> if a matching sample l a r booking could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking fetchSampleLARBookingByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking fetchSampleLARBookingByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.fetchSampleLARBookingByUuidAndGroupId(uuid,
			groupId);
	}

<<<<<<< HEAD
	/**
	* Returns the sample l a r booking with the primary key.
	*
	* @param sampleLARBookingId the primary key of the sample l a r booking
	* @return the sample l a r booking
	* @throws PortalException if a sample l a r booking with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking getSampleLARBooking(
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sampleLARBookingLocalService.getSampleLARBooking(sampleLARBookingId);
=======
	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _sampleLARBookingLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _sampleLARBookingLocalService.getBeanIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.portlet.exportimport.lar.PortletDataContext portletDataContext) {
		return _sampleLARBookingLocalService.getExportActionableDynamicQuery(portletDataContext);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
<<<<<<< HEAD
	* Returns the sample l a r booking with the matching UUID and company.
	*
	* @param uuid the sample l a r booking's UUID
	* @param companyId the primary key of the company
	* @return the matching sample l a r booking
	* @throws PortalException if a matching sample l a r booking could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking getSampleLARBookingByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sampleLARBookingLocalService.getSampleLARBookingByUuidAndCompanyId(uuid,
			companyId);
=======
	* Returns the sample l a r booking with the primary key.
	*
	* @param sampleLARBookingId the primary key of the sample l a r booking
	* @return the sample l a r booking
	* @throws PortalException if a sample l a r booking with the primary key could not be found
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking getSampleLARBooking(
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _sampleLARBookingLocalService.getSampleLARBooking(sampleLARBookingId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	/**
	* Returns the sample l a r booking matching the UUID and group.
	*
	* @param uuid the sample l a r booking's UUID
	* @param groupId the primary key of the group
	* @return the matching sample l a r booking
	* @throws PortalException if a matching sample l a r booking could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking getSampleLARBookingByUuidAndGroupId(
		java.lang.String uuid, long groupId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.getSampleLARBookingByUuidAndGroupId(uuid,
			groupId);
	}

<<<<<<< HEAD
=======
	@Override
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> getSampleLARBookings(
		long groupId, int start, int end) {
		return _sampleLARBookingLocalService.getSampleLARBookings(groupId,
			start, end);
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	/**
	* Returns a range of all the sample l a r bookings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.samplelar.model.impl.SampleLARBookingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sample l a r bookings
	* @param end the upper bound of the range of sample l a r bookings (not inclusive)
	* @return the range of sample l a r bookings
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> getSampleLARBookings(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
	*/
	@Override
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> getSampleLARBookings(
		int start, int end) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.getSampleLARBookings(start, end);
	}

	/**
<<<<<<< HEAD
	* Returns the number of sample l a r bookings.
	*
	* @return the number of sample l a r bookings
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSampleLARBookingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sampleLARBookingLocalService.getSampleLARBookingsCount();
	}

	/**
	* Updates the sample l a r booking in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sampleLARBooking the sample l a r booking
	* @return the sample l a r booking that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking updateSampleLARBooking(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sampleLARBookingLocalService.updateSampleLARBooking(sampleLARBooking);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _sampleLARBookingLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sampleLARBookingLocalService.setBeanIdentifier(beanIdentifier);
=======
	* Returns all the sample l a r bookings matching the UUID and company.
	*
	* @param uuid the UUID of the sample l a r bookings
	* @param companyId the primary key of the company
	* @return the matching sample l a r bookings, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> getSampleLARBookingsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _sampleLARBookingLocalService.getSampleLARBookingsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of sample l a r bookings matching the UUID and company.
	*
	* @param uuid the UUID of the sample l a r bookings
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of sample l a r bookings
	* @param end the upper bound of the range of sample l a r bookings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching sample l a r bookings, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> getSampleLARBookingsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.samplelar.model.SampleLARBooking> orderByComparator) {
		return _sampleLARBookingLocalService.getSampleLARBookingsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of sample l a r bookings.
	*
	* @return the number of sample l a r bookings
	*/
	@Override
	public int getSampleLARBookingsCount() {
		return _sampleLARBookingLocalService.getSampleLARBookingsCount();
	}

	@Override
	public int getSampleLARBookingsCount(long groupId) {
		return _sampleLARBookingLocalService.getSampleLARBookingsCount(groupId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sampleLARBookingLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

<<<<<<< HEAD
	@Override
	public com.liferay.samplelar.model.SampleLARBooking addSampleLARBooking(
		long userId, long groupId, java.lang.String bookingNumber,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sampleLARBookingLocalService.addSampleLARBooking(userId,
			groupId, bookingNumber, serviceContext);
	}

	@Override
	public void deleteSampleLARBookings(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_sampleLARBookingLocalService.deleteSampleLARBookings(groupId);
=======
	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sampleLARBookingLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* Updates the sample l a r booking in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sampleLARBooking the sample l a r booking
	* @return the sample l a r booking that was updated
	*/
	@Override
	public com.liferay.samplelar.model.SampleLARBooking updateSampleLARBooking(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking) {
		return _sampleLARBookingLocalService.updateSampleLARBooking(sampleLARBooking);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking updateSampleLARBooking(
		long userId, long sampleLARBookingId, java.lang.String bookingNumber,
		com.liferay.portal.service.ServiceContext serviceContext)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _sampleLARBookingLocalService.updateSampleLARBooking(userId,
			sampleLARBookingId, bookingNumber, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
<<<<<<< HEAD
=======
	@Deprecated
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public SampleLARBookingLocalService getWrappedSampleLARBookingLocalService() {
		return _sampleLARBookingLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
<<<<<<< HEAD
=======
	@Deprecated
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public void setWrappedSampleLARBookingLocalService(
		SampleLARBookingLocalService sampleLARBookingLocalService) {
		_sampleLARBookingLocalService = sampleLARBookingLocalService;
	}

	@Override
	public SampleLARBookingLocalService getWrappedService() {
		return _sampleLARBookingLocalService;
	}

	@Override
	public void setWrappedService(
		SampleLARBookingLocalService sampleLARBookingLocalService) {
		_sampleLARBookingLocalService = sampleLARBookingLocalService;
	}

	private SampleLARBookingLocalService _sampleLARBookingLocalService;
}