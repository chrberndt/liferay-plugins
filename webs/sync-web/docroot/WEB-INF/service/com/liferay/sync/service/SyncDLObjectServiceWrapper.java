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
 * Provides a wrapper for {@link SyncDLObjectService}.
 *
 * @author Brian Wing Shun Chan
 * @see SyncDLObjectService
 * @generated
 */
<<<<<<< HEAD
=======
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public class SyncDLObjectServiceWrapper implements SyncDLObjectService,
	ServiceWrapper<SyncDLObjectService> {
	public SyncDLObjectServiceWrapper(SyncDLObjectService syncDLObjectService) {
		_syncDLObjectService = syncDLObjectService;
	}

<<<<<<< HEAD
	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _syncDLObjectService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_syncDLObjectService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _syncDLObjectService.invokeMethod(name, parameterTypes, arguments);
	}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	@Override
	public com.liferay.sync.model.SyncDLObject addFileEntry(long repositoryId,
		long folderId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog,
		java.io.File file, java.lang.String checksum,
		com.liferay.portal.service.ServiceContext serviceContext)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.addFileEntry(repositoryId, folderId,
			sourceFileName, mimeType, title, description, changeLog, file,
			checksum, serviceContext);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject addFolder(long repositoryId,
		long parentFolderId, java.lang.String name,
		java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.addFolder(repositoryId, parentFolderId,
			name, description, serviceContext);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject cancelCheckOut(long fileEntryId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.cancelCheckOut(fileEntryId);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject checkInFileEntry(
		long fileEntryId, boolean majorVersion, java.lang.String changeLog,
		com.liferay.portal.service.ServiceContext serviceContext)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.checkInFileEntry(fileEntryId, majorVersion,
			changeLog, serviceContext);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject checkOutFileEntry(
<<<<<<< HEAD
		long fileEntryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		long fileEntryId, java.lang.String owner, long expirationTime,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.checkOutFileEntry(fileEntryId, owner,
			expirationTime, serviceContext);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject checkOutFileEntry(
		long fileEntryId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.checkOutFileEntry(fileEntryId,
			serviceContext);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.sync.model.SyncDLObject checkOutFileEntry(
		long fileEntryId, java.lang.String owner, long expirationTime,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectService.checkOutFileEntry(fileEntryId, owner,
			expirationTime, serviceContext);
	}

	/**
	* @deprecated As of 7.0.0, with no direct replacement
	*/
	@Override
	public com.liferay.sync.model.SyncDLObjectUpdate getAllSyncDLObjects(
		long repositoryId, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectService.getAllSyncDLObjects(repositoryId, folderId);
=======
	public com.liferay.sync.model.SyncDLObject copyFileEntry(
		long sourceFileEntryId, long repositoryId, long folderId,
		java.lang.String sourceFileName, java.lang.String title,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.copyFileEntry(sourceFileEntryId,
			repositoryId, folderId, sourceFileName, title, serviceContext);
	}

	@Override
	public java.util.List<com.liferay.sync.model.SyncDLObject> getAllFolderSyncDLObjects(
		long repositoryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.getAllFolderSyncDLObjects(repositoryId);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _syncDLObjectService.getBeanIdentifier();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public com.liferay.sync.model.SyncDLObject getFileEntrySyncDLObject(
<<<<<<< HEAD
		long groupId, long folderId, java.lang.String title)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectService.getFileEntrySyncDLObject(groupId, folderId,
			title);
=======
		long repositoryId, long folderId, java.lang.String title)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.getFileEntrySyncDLObject(repositoryId,
			folderId, title);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public java.util.List<com.liferay.sync.model.SyncDLObject> getFileEntrySyncDLObjects(
		long repositoryId, long folderId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.getFileEntrySyncDLObjects(repositoryId,
			folderId);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject getFolderSyncDLObject(
		long folderId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.getFolderSyncDLObject(folderId);
	}

	@Override
<<<<<<< HEAD
	public java.util.List<com.liferay.sync.model.SyncDLObject> getFolderSyncDLObjects(
		long repositoryId, long parentFolderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
	public com.liferay.sync.model.SyncDLObject getFolderSyncDLObject(
		long repositoryId, long parentFolderId, java.lang.String name)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.getFolderSyncDLObject(repositoryId,
			parentFolderId, name);
	}

	@Override
	public java.util.List<com.liferay.sync.model.SyncDLObject> getFolderSyncDLObjects(
		long repositoryId, long parentFolderId)
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.getFolderSyncDLObjects(repositoryId,
			parentFolderId);
	}

	@Override
	public com.liferay.portal.model.Group getGroup(long groupId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.getGroup(groupId);
	}

	@Override
<<<<<<< HEAD
	public long getLatestModifiedTime()
		throws com.liferay.portal.kernel.exception.SystemException {
=======
	public long getLatestModifiedTime() {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.getLatestModifiedTime();
	}

	@Override
<<<<<<< HEAD
	public com.liferay.sync.model.SyncContext getSyncContext(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectService.getSyncContext(uuid);
=======
	public com.liferay.sync.model.SyncContext getSyncContext()
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.getSyncContext();
	}

	@Override
	public java.lang.String getSyncDLObjectUpdate(long repositoryId,
		long lastAccessTime, int max)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.getSyncDLObjectUpdate(repositoryId,
			lastAccessTime, max);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public com.liferay.sync.model.SyncDLObjectUpdate getSyncDLObjectUpdate(
<<<<<<< HEAD
		long companyId, long repositoryId, long lastAccessTime)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectService.getSyncDLObjectUpdate(companyId,
			repositoryId, lastAccessTime);
=======
		long repositoryId, long parentFolderId, long lastAccessTime)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.getSyncDLObjectUpdate(repositoryId,
			parentFolderId, lastAccessTime);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public java.util.List<com.liferay.portal.model.Group> getUserSitesGroups()
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.getUserSitesGroups();
	}

	@Override
<<<<<<< HEAD
	public com.liferay.sync.model.SyncDLObject moveFileEntry(long fileEntryId,
		long newFolderId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _syncDLObjectService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject moveFileEntry(long fileEntryId,
		long newFolderId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.moveFileEntry(fileEntryId, newFolderId,
			serviceContext);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject moveFileEntryToTrash(
		long fileEntryId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.moveFileEntryToTrash(fileEntryId);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject moveFolder(long folderId,
		long parentFolderId,
		com.liferay.portal.service.ServiceContext serviceContext)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.moveFolder(folderId, parentFolderId,
			serviceContext);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject moveFolderToTrash(long folderId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.moveFolderToTrash(folderId);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject patchFileEntry(
<<<<<<< HEAD
		long fileEntryId, java.lang.String sourceVersion,
=======
		long fileEntryId, long sourceVersionId,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		java.lang.String sourceFileName, java.lang.String mimeType,
		java.lang.String title, java.lang.String description,
		java.lang.String changeLog, boolean majorVersion,
		java.io.File deltaFile, java.lang.String checksum,
		com.liferay.portal.service.ServiceContext serviceContext)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectService.patchFileEntry(fileEntryId, sourceVersion,
			sourceFileName, mimeType, title, description, changeLog,
			majorVersion, deltaFile, checksum, serviceContext);
=======
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.patchFileEntry(fileEntryId,
			sourceVersionId, sourceFileName, mimeType, title, description,
			changeLog, majorVersion, deltaFile, checksum, serviceContext);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public com.liferay.sync.model.SyncDLObject restoreFileEntryFromTrash(
		long fileEntryId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.restoreFileEntryFromTrash(fileEntryId);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject restoreFolderFromTrash(
		long folderId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _syncDLObjectService.restoreFolderFromTrash(folderId);
	}

=======
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.restoreFolderFromTrash(folderId);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_syncDLObjectService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.util.Map<java.lang.String, java.lang.Object> updateFileEntries(
		java.io.File zipFile)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _syncDLObjectService.updateFileEntries(zipFile);
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	@Override
	public com.liferay.sync.model.SyncDLObject updateFileEntry(
		long fileEntryId, java.lang.String sourceFileName,
		java.lang.String mimeType, java.lang.String title,
		java.lang.String description, java.lang.String changeLog,
		boolean majorVersion, java.io.File file, java.lang.String checksum,
		com.liferay.portal.service.ServiceContext serviceContext)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.updateFileEntry(fileEntryId,
			sourceFileName, mimeType, title, description, changeLog,
			majorVersion, file, checksum, serviceContext);
	}

	@Override
	public com.liferay.sync.model.SyncDLObject updateFolder(long folderId,
		java.lang.String name, java.lang.String description,
		com.liferay.portal.service.ServiceContext serviceContext)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return _syncDLObjectService.updateFolder(folderId, name, description,
			serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
<<<<<<< HEAD
=======
	@Deprecated
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public SyncDLObjectService getWrappedSyncDLObjectService() {
		return _syncDLObjectService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
<<<<<<< HEAD
=======
	@Deprecated
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public void setWrappedSyncDLObjectService(
		SyncDLObjectService syncDLObjectService) {
		_syncDLObjectService = syncDLObjectService;
	}

	@Override
	public SyncDLObjectService getWrappedService() {
		return _syncDLObjectService;
	}

	@Override
	public void setWrappedService(SyncDLObjectService syncDLObjectService) {
		_syncDLObjectService = syncDLObjectService;
	}

	private SyncDLObjectService _syncDLObjectService;
}