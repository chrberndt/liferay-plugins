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
import com.liferay.portal.service.InvokableLocalService;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
<<<<<<< HEAD
=======
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public class SyncDLFileVersionDiffLocalServiceClp
	implements SyncDLFileVersionDiffLocalService {
	public SyncDLFileVersionDiffLocalServiceClp(
		InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

		_methodName0 = "addSyncDLFileVersionDiff";

		_methodParameterTypes0 = new String[] {
<<<<<<< HEAD
				"com.liferay.sync.model.SyncDLFileVersionDiff"
			};

		_methodName1 = "createSyncDLFileVersionDiff";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteSyncDLFileVersionDiff";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteSyncDLFileVersionDiff";

		_methodParameterTypes3 = new String[] {
				"com.liferay.sync.model.SyncDLFileVersionDiff"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
=======
				"long", "long", "long", "java.io.File"
			};

		_methodName1 = "addSyncDLFileVersionDiff";

		_methodParameterTypes1 = new String[] {
				"com.liferay.sync.model.SyncDLFileVersionDiff"
			};

		_methodName2 = "createSyncDLFileVersionDiff";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteExpiredSyncDLFileVersionDiffs";

		_methodParameterTypes3 = new String[] {  };

		_methodName4 = "deletePersistedModel";

		_methodParameterTypes4 = new String[] {
				"com.liferay.portal.model.PersistedModel"
			};

		_methodName5 = "deleteSyncDLFileVersionDiff";

		_methodParameterTypes5 = new String[] {
				"com.liferay.sync.model.SyncDLFileVersionDiff"
			};

		_methodName6 = "deleteSyncDLFileVersionDiff";

		_methodParameterTypes6 = new String[] { "long" };

		_methodName7 = "deleteSyncDLFileVersionDiffs";

		_methodParameterTypes7 = new String[] { "long" };

		_methodName8 = "dynamicQuery";

		_methodParameterTypes8 = new String[] {  };

		_methodName9 = "dynamicQuery";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName10 = "dynamicQuery";

		_methodParameterTypes10 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName11 = "dynamicQuery";

		_methodParameterTypes11 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
=======
		_methodName12 = "dynamicQueryCount";

		_methodParameterTypes12 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName13 = "dynamicQueryCount";

		_methodParameterTypes13 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

<<<<<<< HEAD
		_methodName10 = "fetchSyncDLFileVersionDiff";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getSyncDLFileVersionDiff";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getSyncDLFileVersionDiffs";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getSyncDLFileVersionDiffsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateSyncDLFileVersionDiff";

		_methodParameterTypes15 = new String[] {
				"com.liferay.sync.model.SyncDLFileVersionDiff"
			};

		_methodName16 = "getBeanIdentifier";

		_methodParameterTypes16 = new String[] {  };

		_methodName17 = "setBeanIdentifier";

		_methodParameterTypes17 = new String[] { "java.lang.String" };

		_methodName19 = "addSyncDLFileVersionDiff";

		_methodParameterTypes19 = new String[] {
				"long", "long", "long", "java.io.File"
			};

		_methodName20 = "deleteExpiredSyncDLFileVersionDiffs";

		_methodParameterTypes20 = new String[] {  };

		_methodName21 = "fetchSyncDLFileVersionDiff";

		_methodParameterTypes21 = new String[] { "long", "long", "long" };

		_methodName22 = "refreshExpirationDate";

		_methodParameterTypes22 = new String[] { "long" };
=======
		_methodName14 = "fetchSyncDLFileVersionDiff";

		_methodParameterTypes14 = new String[] { "long", "long", "long" };

		_methodName15 = "fetchSyncDLFileVersionDiff";

		_methodParameterTypes15 = new String[] { "long" };

		_methodName16 = "getActionableDynamicQuery";

		_methodParameterTypes16 = new String[] {  };

		_methodName17 = "getBeanIdentifier";

		_methodParameterTypes17 = new String[] {  };

		_methodName18 = "getPersistedModel";

		_methodParameterTypes18 = new String[] { "java.io.Serializable" };

		_methodName19 = "getSyncDLFileVersionDiff";

		_methodParameterTypes19 = new String[] { "long" };

		_methodName20 = "getSyncDLFileVersionDiffs";

		_methodParameterTypes20 = new String[] { "int", "int" };

		_methodName21 = "getSyncDLFileVersionDiffsCount";

		_methodParameterTypes21 = new String[] {  };

		_methodName23 = "refreshExpirationDate";

		_methodParameterTypes23 = new String[] { "long" };

		_methodName24 = "setBeanIdentifier";

		_methodParameterTypes24 = new String[] { "java.lang.String" };

		_methodName25 = "updateSyncDLFileVersionDiff";

		_methodParameterTypes25 = new String[] {
				"com.liferay.sync.model.SyncDLFileVersionDiff"
			};
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public com.liferay.sync.model.SyncDLFileVersionDiff addSyncDLFileVersionDiff(
<<<<<<< HEAD
		com.liferay.sync.model.SyncDLFileVersionDiff syncDLFileVersionDiff)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
		long fileEntryId, long sourceFileVersionId, long targetFileVersionId,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] {
<<<<<<< HEAD
						ClpSerializer.translateInput(syncDLFileVersionDiff)
=======
						fileEntryId,
						
					sourceFileVersionId,
						
					targetFileVersionId,
						
					ClpSerializer.translateInput(file)
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
=======
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.sync.model.SyncDLFileVersionDiff createSyncDLFileVersionDiff(
		long syncDLFileVersionDiffId) {
=======
	public com.liferay.sync.model.SyncDLFileVersionDiff addSyncDLFileVersionDiff(
		com.liferay.sync.model.SyncDLFileVersionDiff syncDLFileVersionDiff) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1,
<<<<<<< HEAD
					new Object[] { syncDLFileVersionDiffId });
=======
					new Object[] {
						ClpSerializer.translateInput(syncDLFileVersionDiff)
					});
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.sync.model.SyncDLFileVersionDiff deleteSyncDLFileVersionDiff(
		long syncDLFileVersionDiffId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
=======
	public com.liferay.sync.model.SyncDLFileVersionDiff createSyncDLFileVersionDiff(
		long syncDLFileVersionDiffId) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2,
					new Object[] { syncDLFileVersionDiffId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
=======
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteExpiredSyncDLFileVersionDiffs()
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName3,
				_methodParameterTypes3, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
=======
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4,
					new Object[] { ClpSerializer.translateInput(persistedModel) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
=======
		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public com.liferay.sync.model.SyncDLFileVersionDiff deleteSyncDLFileVersionDiff(
		com.liferay.sync.model.SyncDLFileVersionDiff syncDLFileVersionDiff)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
=======
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] {
						ClpSerializer.translateInput(syncDLFileVersionDiff)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
=======
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
=======
	public com.liferay.sync.model.SyncDLFileVersionDiff deleteSyncDLFileVersionDiff(
		long syncDLFileVersionDiffId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] { syncDLFileVersionDiffId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteSyncDLFileVersionDiffs(long fileEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName7,
				_methodParameterTypes7, new Object[] { fileEntryId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		Object returnObj = null;

		try {
<<<<<<< HEAD
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] {  });
=======
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8, new Object[] {  });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.DynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5,
=======
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName6,
					_methodParameterTypes6,
=======
		return (java.util.List<T>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName7,
					_methodParameterTypes7,
=======
		return (java.util.List<T>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (java.util.List)ClpSerializer.translateOutput(returnObj);
=======
		return (java.util.List<T>)ClpSerializer.translateOutput(returnObj);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public long dynamicQueryCount(
<<<<<<< HEAD
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8,
=======
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
<<<<<<< HEAD
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
=======
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					ClpSerializer.translateInput(projection)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public com.liferay.sync.model.SyncDLFileVersionDiff fetchSyncDLFileVersionDiff(
<<<<<<< HEAD
		long syncDLFileVersionDiffId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10,
					new Object[] { syncDLFileVersionDiffId });
=======
		long fileEntryId, long sourceFileVersionId, long targetFileVersionId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14,
					new Object[] {
						fileEntryId,
						
					sourceFileVersionId,
						
					targetFileVersionId
					});
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.sync.model.SyncDLFileVersionDiff getSyncDLFileVersionDiff(
		long syncDLFileVersionDiffId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11,
=======
	public com.liferay.sync.model.SyncDLFileVersionDiff fetchSyncDLFileVersionDiff(
		long syncDLFileVersionDiffId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { syncDLFileVersionDiffId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
=======
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16, new Object[] {  });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.sync.model.SyncDLFileVersionDiff> getSyncDLFileVersionDiffs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { start, end });
=======
		return (com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName17,
					_methodParameterTypes17, new Object[] {  });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (java.util.List<com.liferay.sync.model.SyncDLFileVersionDiff>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getSyncDLFileVersionDiffsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14, new Object[] {  });
=======
		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName18,
					_methodParameterTypes18,
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
=======
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return ((Integer)returnObj).intValue();
	}

	@Override
	public com.liferay.sync.model.SyncDLFileVersionDiff updateSyncDLFileVersionDiff(
		com.liferay.sync.model.SyncDLFileVersionDiff syncDLFileVersionDiff)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] {
						ClpSerializer.translateInput(syncDLFileVersionDiff)
					});
=======
		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.sync.model.SyncDLFileVersionDiff getSyncDLFileVersionDiff(
		long syncDLFileVersionDiffId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] { syncDLFileVersionDiffId });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
=======
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16, new Object[] {  });
=======
	public java.util.List<com.liferay.sync.model.SyncDLFileVersionDiff> getSyncDLFileVersionDiffs(
		int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20, new Object[] { start, end });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName17,
				_methodParameterTypes17,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
=======
		return (java.util.List<com.liferay.sync.model.SyncDLFileVersionDiff>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getSyncDLFileVersionDiffsCount() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21, new Object[] {  });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
<<<<<<< HEAD
=======

		return ((Integer)returnObj).intValue();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
<<<<<<< HEAD
	public com.liferay.sync.model.SyncDLFileVersionDiff addSyncDLFileVersionDiff(
		long fileEntryId, long sourceFileVersionId, long targetFileVersionId,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] {
						fileEntryId,
						
					sourceFileVersionId,
						
					targetFileVersionId,
						
					ClpSerializer.translateInput(file)
					});
=======
	public void refreshExpirationDate(long syncDLFileVersionDiffId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName23,
				_methodParameterTypes23,
				new Object[] { syncDLFileVersionDiffId });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
<<<<<<< HEAD

		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteExpiredSyncDLFileVersionDiffs()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			_invokableLocalService.invokeMethod(_methodName20,
				_methodParameterTypes20, new Object[] {  });
=======
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName24,
				_methodParameterTypes24,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
<<<<<<< HEAD
	public com.liferay.sync.model.SyncDLFileVersionDiff fetchSyncDLFileVersionDiff(
		long fileEntryId, long sourceFileVersionId, long targetFileVersionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21,
					new Object[] {
						fileEntryId,
						
					sourceFileVersionId,
						
					targetFileVersionId
=======
	public com.liferay.sync.model.SyncDLFileVersionDiff updateSyncDLFileVersionDiff(
		com.liferay.sync.model.SyncDLFileVersionDiff syncDLFileVersionDiff) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25,
					new Object[] {
						ClpSerializer.translateInput(syncDLFileVersionDiff)
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.sync.model.SyncDLFileVersionDiff)ClpSerializer.translateOutput(returnObj);
	}

<<<<<<< HEAD
	@Override
	public void refreshExpirationDate(long syncDLFileVersionDiffId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			_invokableLocalService.invokeMethod(_methodName22,
				_methodParameterTypes22,
				new Object[] { syncDLFileVersionDiffId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private InvokableLocalService _invokableLocalService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
<<<<<<< HEAD
=======
	private String _methodName18;
	private String[] _methodParameterTypes18;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
<<<<<<< HEAD
	private String _methodName22;
	private String[] _methodParameterTypes22;
=======
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}