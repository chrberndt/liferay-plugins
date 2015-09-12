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

package com.liferay.repository.external.model;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
<<<<<<< HEAD
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.Lock;
import com.liferay.portal.model.User;
import com.liferay.portal.service.persistence.LockUtil;
import com.liferay.portlet.documentlibrary.NoSuchFileVersionException;
import com.liferay.portlet.documentlibrary.model.DLFileEntryConstants;
import com.liferay.portlet.documentlibrary.util.DLUtil;
=======
import com.liferay.portal.kernel.lock.Lock;
import com.liferay.portal.kernel.lock.LockManagerUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.Repository;
import com.liferay.portal.kernel.repository.capabilities.Capability;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileShortcut;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.repository.model.RepositoryModelOperation;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.security.auth.PrincipalThreadLocal;
import com.liferay.portlet.documentlibrary.NoSuchFileVersionException;
import com.liferay.portlet.documentlibrary.model.DLFileEntryConstants;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.liferay.portlet.exportimport.lar.StagedModelType;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.repository.external.ExtRepositoryAdapter;
import com.liferay.repository.external.ExtRepositoryFileEntry;

import java.io.InputStream;

import java.util.Collections;
<<<<<<< HEAD
import java.util.Date;
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import java.util.List;

/**
 * @author Iván Zaera
 * @author Sergio González
 */
public class ExtRepositoryFileEntryAdapter
	extends ExtRepositoryObjectAdapter<FileEntry> implements FileEntry {

	public ExtRepositoryFileEntryAdapter(
		ExtRepositoryAdapter extRepositoryAdapter, long extRepositoryObjectId,
		String uuid, ExtRepositoryFileEntry extRepositoryFileEntry) {

		super(
			extRepositoryAdapter, extRepositoryObjectId, uuid,
			extRepositoryFileEntry);

		_extRepositoryFileEntry = extRepositoryFileEntry;
	}

	@Override
<<<<<<< HEAD
	public InputStream getContentStream()
		throws PortalException, SystemException {

=======
	public void execute(RepositoryModelOperation repositoryModelOperation)
		throws PortalException {

		repositoryModelOperation.execute(this);
	}

	@Override
	public InputStream getContentStream() throws PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		ExtRepositoryAdapter extRepositoryAdapter = getRepository();

		return extRepositoryAdapter.getContentStream(this);
	}

	@Override
<<<<<<< HEAD
	public InputStream getContentStream(String version)
		throws PortalException, SystemException {

=======
	public InputStream getContentStream(String version) throws PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		ExtRepositoryAdapter extRepositoryAdapter = getRepository();

		FileVersion fileVersion = getFileVersion(version);

		return extRepositoryAdapter.getContentStream(
			(ExtRepositoryFileVersionAdapter)fileVersion);
	}

	@Override
	public ExtRepositoryFileEntry getExtRepositoryModel() {
		return _extRepositoryFileEntry;
	}

	@Override
	public long getFileEntryId() {
		return getPrimaryKey();
	}

	@Override
<<<<<<< HEAD
	public FileVersion getFileVersion() throws SystemException {
=======
	public String getFileName() {
		return DLUtil.getSanitizedFileName(getTitle(), getExtension());
	}

	@Override
	public List<FileShortcut> getFileShortcuts() {
		return Collections.emptyList();
	}

	@Override
	public FileVersion getFileVersion() {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		try {
			List<ExtRepositoryFileVersionAdapter>
				extRepositoryFileVersionAdapters =
					_getExtRepositoryFileVersionAdapters();

			return extRepositoryFileVersionAdapters.get(0);
		}
		catch (PortalException pe) {
			throw new SystemException(pe);
		}
	}

	@Override
<<<<<<< HEAD
	public FileVersion getFileVersion(String version)
		throws PortalException, SystemException {

=======
	public FileVersion getFileVersion(String version) throws PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		List<ExtRepositoryFileVersionAdapter> extRepositoryFileVersionAdapters =
			_getExtRepositoryFileVersionAdapters();

		for (ExtRepositoryFileVersionAdapter extRepositoryFileVersionAdapter :
				extRepositoryFileVersionAdapters) {

			String curVersion = extRepositoryFileVersionAdapter.getVersion();

			if (curVersion.equals(version)) {
				return extRepositoryFileVersionAdapter;
			}
		}

		throw new NoSuchFileVersionException(
			"No file version with {fileEntryId=" + getFileEntryId() +
				", version: " + version + "}");
	}

	@Override
	@SuppressWarnings({"rawtypes"})
<<<<<<< HEAD
	public List<FileVersion> getFileVersions(int status)
		throws SystemException {

=======
	public List<FileVersion> getFileVersions(int status) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		if ((status == WorkflowConstants.STATUS_ANY) ||
			(status == WorkflowConstants.STATUS_APPROVED)) {

			try {
				return (List)_getExtRepositoryFileVersionAdapters();
			}
			catch (PortalException pe) {
				throw new SystemException(pe);
			}
		}
		else {
			return Collections.emptyList();
		}
	}

	@Override
	public Folder getFolder() {
		Folder parentFolder = null;

		try {
			parentFolder = getParentFolder();
		}
		catch (Exception e) {
			_log.error(e, e);
		}

		return parentFolder;
	}

	@Override
	public long getFolderId() {
		Folder folder = getFolder();

		return folder.getFolderId();
	}

	@Override
	public String getIcon() {
		return DLUtil.getFileIcon(getExtension());
	}

	@Override
<<<<<<< HEAD
	@SuppressWarnings("unused")
	public FileVersion getLatestFileVersion()
		throws PortalException, SystemException {

		return getFileVersion();
	}

	@SuppressWarnings("unused")
	public FileVersion getLatestFileVersion(boolean trusted)
		throws PortalException, SystemException {
=======
	public String getIconCssClass() {
		return DLUtil.getFileIconCssClass(getExtension());
	}

	@Override
	@SuppressWarnings("unused")
	public FileVersion getLatestFileVersion() throws PortalException {
		return getFileVersion();
	}

	@Override
	@SuppressWarnings("unused")
	public FileVersion getLatestFileVersion(boolean trusted)
		throws PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

		return getFileVersion();
	}

	@Override
	public Lock getLock() {
		if (!isCheckedOut()) {
			return null;
		}

		String checkedOutBy = _extRepositoryFileEntry.getCheckedOutBy();

		User user = getUser(checkedOutBy);

<<<<<<< HEAD
		Lock lock = LockUtil.create(0);

		lock.setCompanyId(getCompanyId());

		if (user != null) {
			lock.setUserId(user.getUserId());
			lock.setUserName(user.getFullName());
		}

		lock.setCreateDate(new Date());

		return lock;
=======
		long userId = 0;
		String userName = null;

		if (user != null) {
			userId = user.getUserId();
			userName = user.getFullName();
		}

		return LockManagerUtil.createLock(0, getCompanyId(), userId, userName);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public String getMimeType() {
		String mimeType = _extRepositoryFileEntry.getMimeType();

		if (Validator.isNull(mimeType)) {
			mimeType = MimeTypesUtil.getContentType(getTitle());
		}

		return mimeType;
	}

	@Override
	public String getMimeType(String version) {
		FileVersion fileVersion = null;

		try {
			fileVersion = getFileVersion(version);
		}
		catch (PortalException pe) {
			if (_log.isWarnEnabled()) {
				_log.warn(
					"Unable to obtain version " + version + " for external " +
						"repository file entry " + getTitle(),
					pe);
			}
		}
		catch (SystemException se) {
			if (_log.isWarnEnabled()) {
				_log.warn(
					"Unable to obtain version " + version + " for external " +
						"repository file entry " + getTitle(),
					se);
			}
		}

		if (fileVersion != null) {
			String mimeType = fileVersion.getMimeType();

			if (Validator.isNotNull(mimeType)) {
				return mimeType;
			}
		}

		return MimeTypesUtil.getContentType(getTitle());
	}

	@Override
	public Class<?> getModelClass() {
		return FileEntry.class;
	}

	@Override
	public String getName() {
		return getTitle();
	}

	@Override
	public int getReadCount() {
		return 0;
	}

	@Override
<<<<<<< HEAD
=======
	public <T extends Capability> T getRepositoryCapability(
		Class<T> capabilityClass) {

		Repository repository = getRepository();

		return repository.getCapability(capabilityClass);
	}

	@Override
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public StagedModelType getStagedModelType() {
		return new StagedModelType(DLFileEntryConstants.getClassName());
	}

	@Override
	public String getTitle() {
		return _extRepositoryFileEntry.getTitle();
	}

	@Override
	public String getVersion() {
		try {
			List<ExtRepositoryFileVersionAdapter>
				extRepositoryFileVersionAdapters =
					_getExtRepositoryFileVersionAdapters();

			FileVersion fileVersion = extRepositoryFileVersionAdapters.get(0);

			return fileVersion.getVersion();
		}
		catch (Exception e) {
			return null;
		}
	}

	@Override
	public long getVersionUserId() {
		return getUserId();
	}

	@Override
	public String getVersionUserName() {
		return getUserName();
	}

	@Override
<<<<<<< HEAD
	@SuppressWarnings("unused")
	public String getVersionUserUuid() throws SystemException {
=======
	public String getVersionUserUuid() {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		return getUserUuid();
	}

	@Override
	public boolean hasLock() {
<<<<<<< HEAD
		return isCheckedOut();
=======
		if (!isCheckedOut()) {
			return false;
		}

		User checkedOutByUser = getUser(
			_extRepositoryFileEntry.getCheckedOutBy());

		if (checkedOutByUser.getUserId() != PrincipalThreadLocal.getUserId()) {
			return false;
		}

		return true;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public boolean isCheckedOut() {
		if (Validator.isNull(_extRepositoryFileEntry.getCheckedOutBy())) {
			return false;
		}

		return true;
	}

	@Override
	public boolean isManualCheckInRequired() {
		return true;
	}

	@Override
<<<<<<< HEAD
=======
	public <T extends Capability> boolean isRepositoryCapabilityProvided(
		Class<T> capabilityClass) {

		Repository repository = getRepository();

		return repository.isCapabilityProvided(capabilityClass);
	}

	@Override
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public boolean isSupportsLocking() {
		return true;
	}

	private List<ExtRepositoryFileVersionAdapter>
			_getExtRepositoryFileVersionAdapters()
<<<<<<< HEAD
		throws PortalException, SystemException {

		if (_extRepositoryFileVersionAdapters == null) {
			ExtRepositoryAdapter extRepositoryAdapter = getRepository();

			_extRepositoryFileVersionAdapters =
				extRepositoryAdapter.getExtRepositoryFileVersionAdapters(this);
		}

		return _extRepositoryFileVersionAdapters;
=======
		throws PortalException {

		ExtRepositoryAdapter extRepositoryAdapter = getRepository();

		return extRepositoryAdapter.getExtRepositoryFileVersionAdapters(this);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	private static Log _log = LogFactoryUtil.getLog(
		ExtRepositoryFileEntryAdapter.class);

	private ExtRepositoryFileEntry _extRepositoryFileEntry;
<<<<<<< HEAD
	private List<ExtRepositoryFileVersionAdapter>
		_extRepositoryFileVersionAdapters;
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

}