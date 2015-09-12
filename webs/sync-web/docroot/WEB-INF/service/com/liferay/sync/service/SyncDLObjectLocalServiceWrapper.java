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

package com.liferay.sync.service;

<<<<<<< HEAD
=======
import aQute.bnd.annotation.ProviderType;

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SyncDLObjectLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SyncDLObjectLocalService
 * @generated
 */
<<<<<<< HEAD
=======
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public class SyncDLObjectLocalServiceWrapper implements SyncDLObjectLocalService,
	ServiceWrapper<SyncDLObjectLocalService> {
	public SyncDLObjectLocalServiceWrapper(
		SyncDLObjectLocalService syncDLObjectLocalService) {
		_syncDLObjectLocalService = syncDLObjectLocalService;
	}

<<<<<<< HEAD
=======
	@Override
	public com.liferay.sync.model.SyncDLObject addSyncDLObject(long companyId,
		long userId, java.lang.String userName, long modifiedTime,
		long repositoryId, long parentFolderId, java.lang.String treePath,
		java.lang.String name, java.lang.String extension,
		java.lang.String mimeType, java.lang.String description,
		java.lang.String changeLog, java.lang.String extraSettings,
		java.lang.String version, long versionId, long size,
		java.lang.String checksum, java.lang.String event,
		java.util.Date lockExpirationDate, long lockUserId,
		java.lang.String lockUserName, java.lang.String type, long typePK,
		java.lang.String typeUuid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectLocalService.addSyncDLObject(companyId, userId,
			userName, modifiedTime, repositoryId, parentFolderId, treePath,
			name, extension, mimeType, description, changeLog, extraSettings,
			version, versionId, size, checksum, event, lockExpirationDate,
			lockUserId, lockUserName, type, typePK, typeUuid);
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	/**
	* Adds the sync d l object to the database. Also notifies the appropriate model listeners.
	*
	* @param syncDLObject the sync d l object
	* @return the sync d l object that was added
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sync.model.SyncDLObject addSyncDLObject(
		com.liferay.sync.model.SyncDLObject syncDLObject)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
	*/
	@Override
	public com.liferay.sync.model.SyncDLObject addSyncDLObject(
		com.liferay.sync.model.SyncDLObject syncDLObject) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectLocalService.addSyncDLObject(syncDLObject);
	}

	/**
	* Creates a new sync d l object with the primary key. Does not add the sync d l object to the database.
	*
	* @param syncDLObjectId the primary key for the new sync d l object
	* @return the new sync d l object
	*/
	@Override
	public com.liferay.sync.model.SyncDLObject createSyncDLObject(
		long syncDLObjectId) {
		return _syncDLObjectLocalService.createSyncDLObject(syncDLObjectId);
	}

	/**
<<<<<<< HEAD
	* Deletes the sync d l object with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param syncDLObjectId the primary key of the sync d l object
	* @return the sync d l object that was removed
	* @throws PortalException if a sync d l object with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sync.model.SyncDLObject deleteSyncDLObject(
		long syncDLObjectId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectLocalService.deleteSyncDLObject(syncDLObjectId);
=======
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectLocalService.deletePersistedModel(persistedModel);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	/**
	* Deletes the sync d l object from the database. Also notifies the appropriate model listeners.
	*
	* @param syncDLObject the sync d l object
	* @return the sync d l object that was removed
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sync.model.SyncDLObject deleteSyncDLObject(
		com.liferay.sync.model.SyncDLObject syncDLObject)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectLocalService.deleteSyncDLObject(syncDLObject);
	}

=======
	*/
	@Override
	public com.liferay.sync.model.SyncDLObject deleteSyncDLObject(
		com.liferay.sync.model.SyncDLObject syncDLObject) {
		return _syncDLObjectLocalService.deleteSyncDLObject(syncDLObject);
	}

	/**
	* Deletes the sync d l object with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param syncDLObjectId the primary key of the sync d l object
	* @return the sync d l object that was removed
	* @throws PortalException if a sync d l object with the primary key could not be found
	*/
	@Override
	public com.liferay.sync.model.SyncDLObject deleteSyncDLObject(
		long syncDLObjectId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectLocalService.deleteSyncDLObject(syncDLObjectId);
	}

	@Override
	public void deleteSyncDLObjects(java.lang.String version,
		java.lang.String type) {
		_syncDLObjectLocalService.deleteSyncDLObjects(version, type);
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _syncDLObjectLocalService.dynamicQuery();
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
		return _syncDLObjectLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sync.model.impl.SyncDLObjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _syncDLObjectLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sync.model.impl.SyncDLObjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _syncDLObjectLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _syncDLObjectLocalService.dynamicQueryCount(dynamicQuery);
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
		return _syncDLObjectLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject fetchSyncDLObject(
<<<<<<< HEAD
		long syncDLObjectId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectLocalService.fetchSyncDLObject(syncDLObjectId);
	}

=======
		long syncDLObjectId) {
		return _syncDLObjectLocalService.fetchSyncDLObject(syncDLObjectId);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject fetchSyncDLObject(
		java.lang.String type, long typePK) {
		return _syncDLObjectLocalService.fetchSyncDLObject(type, typePK);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _syncDLObjectLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _syncDLObjectLocalService.getBeanIdentifier();
	}

	@Override
	public long getLatestModifiedTime() {
		return _syncDLObjectLocalService.getLatestModifiedTime();
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectLocalService.getPersistedModel(primaryKeyObj);
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	/**
	* Returns the sync d l object with the primary key.
	*
	* @param syncDLObjectId the primary key of the sync d l object
	* @return the sync d l object
	* @throws PortalException if a sync d l object with the primary key could not be found
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	*/
	@Override
	public com.liferay.sync.model.SyncDLObject getSyncDLObject(
		long syncDLObjectId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectLocalService.getSyncDLObject(syncDLObjectId);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectLocalService.getPersistedModel(primaryKeyObj);
=======
	public java.util.List<com.liferay.sync.model.SyncDLObject> getSyncDLObjects(
		long repositoryId, long parentFolderId) {
		return _syncDLObjectLocalService.getSyncDLObjects(repositoryId,
			parentFolderId);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	/**
	* Returns a range of all the sync d l objects.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sync.model.impl.SyncDLObjectModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sync d l objects
	* @param end the upper bound of the range of sync d l objects (not inclusive)
	* @return the range of sync d l objects
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.sync.model.SyncDLObject> getSyncDLObjects(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
	*/
	@Override
	public java.util.List<com.liferay.sync.model.SyncDLObject> getSyncDLObjects(
		int start, int end) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectLocalService.getSyncDLObjects(start, end);
	}

	/**
	* Returns the number of sync d l objects.
	*
	* @return the number of sync d l objects
<<<<<<< HEAD
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSyncDLObjectsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectLocalService.getSyncDLObjectsCount();
	}

	/**
	* Updates the sync d l object in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param syncDLObject the sync d l object
	* @return the sync d l object that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sync.model.SyncDLObject updateSyncDLObject(
		com.liferay.sync.model.SyncDLObject syncDLObject)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectLocalService.updateSyncDLObject(syncDLObject);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _syncDLObjectLocalService.getBeanIdentifier();
=======
	*/
	@Override
	public int getSyncDLObjectsCount() {
		return _syncDLObjectLocalService.getSyncDLObjectsCount();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _syncDLObjectLocalService.invokeMethod(name, parameterTypes,
			arguments);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_syncDLObjectLocalService.setBeanIdentifier(beanIdentifier);
	}

<<<<<<< HEAD
	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _syncDLObjectLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject addSyncDLObject(long companyId,
		long modifiedTime, long repositoryId, long parentFolderId,
		java.lang.String name, java.lang.String extension,
		java.lang.String mimeType, java.lang.String description,
		java.lang.String changeLog, java.lang.String extraSettings,
		java.lang.String version, long size, java.lang.String checksum,
		java.lang.String event, java.util.Date lockExpirationDate,
		long lockUserId, java.lang.String lockUserName, java.lang.String type,
		long typePK, java.lang.String typeUuid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectLocalService.addSyncDLObject(companyId,
			modifiedTime, repositoryId, parentFolderId, name, extension,
			mimeType, description, changeLog, extraSettings, version, size,
			checksum, event, lockExpirationDate, lockUserId, lockUserName,
			type, typePK, typeUuid);
	}

	@Override
	public long getLatestModifiedTime()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectLocalService.getLatestModifiedTime();
=======
	/**
	* Updates the sync d l object in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param syncDLObject the sync d l object
	* @return the sync d l object that was updated
	*/
	@Override
	public com.liferay.sync.model.SyncDLObject updateSyncDLObject(
		com.liferay.sync.model.SyncDLObject syncDLObject) {
		return _syncDLObjectLocalService.updateSyncDLObject(syncDLObject);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
<<<<<<< HEAD
=======
	@Deprecated
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public SyncDLObjectLocalService getWrappedSyncDLObjectLocalService() {
		return _syncDLObjectLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
<<<<<<< HEAD
=======
	@Deprecated
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public void setWrappedSyncDLObjectLocalService(
		SyncDLObjectLocalService syncDLObjectLocalService) {
		_syncDLObjectLocalService = syncDLObjectLocalService;
	}

	@Override
	public SyncDLObjectLocalService getWrappedService() {
		return _syncDLObjectLocalService;
	}

	@Override
	public void setWrappedService(
		SyncDLObjectLocalService syncDLObjectLocalService) {
		_syncDLObjectLocalService = syncDLObjectLocalService;
	}

	private SyncDLObjectLocalService _syncDLObjectLocalService;
}