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

package com.liferay.pushnotifications.service;

<<<<<<< HEAD
import com.liferay.portal.service.InvokableLocalService;

/**
 * @author Silvio Santos
 * @generated
 */
=======
import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author Bruno Farache
 * @generated
 */
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public class PushNotificationsDeviceLocalServiceClp
	implements PushNotificationsDeviceLocalService {
	public PushNotificationsDeviceLocalServiceClp(
		InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

		_methodName0 = "addPushNotificationsDevice";

		_methodParameterTypes0 = new String[] {
				"com.liferay.pushnotifications.model.PushNotificationsDevice"
			};

<<<<<<< HEAD
		_methodName1 = "createPushNotificationsDevice";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deletePushNotificationsDevice";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletePushNotificationsDevice";

		_methodParameterTypes3 = new String[] {
				"com.liferay.pushnotifications.model.PushNotificationsDevice"
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
		_methodName1 = "addPushNotificationsDevice";

		_methodParameterTypes1 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName2 = "createPushNotificationsDevice";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletePersistedModel";

		_methodParameterTypes3 = new String[] {
				"com.liferay.portal.model.PersistedModel"
			};

		_methodName4 = "deletePushNotificationsDevice";

		_methodParameterTypes4 = new String[] {
				"com.liferay.pushnotifications.model.PushNotificationsDevice"
			};

		_methodName5 = "deletePushNotificationsDevice";

		_methodParameterTypes5 = new String[] { "long" };

		_methodName6 = "deletePushNotificationsDevice";

		_methodParameterTypes6 = new String[] { "java.lang.String" };

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {  };

		_methodName8 = "dynamicQuery";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQuery";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName10 = "dynamicQuery";

		_methodParameterTypes10 = new String[] {
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
		_methodName11 = "dynamicQueryCount";

		_methodParameterTypes11 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName12 = "dynamicQueryCount";

		_methodParameterTypes12 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

<<<<<<< HEAD
		_methodName10 = "fetchPushNotificationsDevice";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPushNotificationsDevice";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getPushNotificationsDevices";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getPushNotificationsDevicesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updatePushNotificationsDevice";

		_methodParameterTypes15 = new String[] {
				"com.liferay.pushnotifications.model.PushNotificationsDevice"
			};

		_methodName16 = "getBeanIdentifier";

		_methodParameterTypes16 = new String[] {  };

		_methodName17 = "setBeanIdentifier";

		_methodParameterTypes17 = new String[] { "java.lang.String" };

		_methodName19 = "addPushNotificationsDevice";

		_methodParameterTypes19 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName20 = "deletePushNotificationsDevice";

		_methodParameterTypes20 = new String[] { "java.lang.String" };

		_methodName21 = "getTokens";

		_methodParameterTypes21 = new String[] {
				"long", "java.lang.String", "int", "int"
=======
		_methodName13 = "fetchPushNotificationsDevice";

		_methodParameterTypes13 = new String[] { "long" };

		_methodName14 = "getActionableDynamicQuery";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "getBeanIdentifier";

		_methodParameterTypes15 = new String[] {  };

		_methodName16 = "getPersistedModel";

		_methodParameterTypes16 = new String[] { "java.io.Serializable" };

		_methodName17 = "getPushNotificationsDevice";

		_methodParameterTypes17 = new String[] { "long" };

		_methodName18 = "getPushNotificationsDevices";

		_methodParameterTypes18 = new String[] { "int", "int" };

		_methodName19 = "getPushNotificationsDevices";

		_methodParameterTypes19 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName20 = "getPushNotificationsDevicesCount";

		_methodParameterTypes20 = new String[] {  };

		_methodName22 = "resetPushNotificationSenders";

		_methodParameterTypes22 = new String[] {  };

		_methodName23 = "sendPushNotification";

		_methodParameterTypes23 = new String[] {
				"java.lang.String", "java.util.List",
				"com.liferay.portal.kernel.json.JSONObject"
			};

		_methodName24 = "sendPushNotification";

		_methodParameterTypes24 = new String[] {
				"java.lang.String", "java.util.List",
				"com.liferay.portal.kernel.json.JSONObject", "java.util.Map"
			};

		_methodName25 = "sendPushNotification";

		_methodParameterTypes25 = new String[] {
				"long[][]", "com.liferay.portal.kernel.json.JSONObject"
			};

		_methodName26 = "setBeanIdentifier";

		_methodParameterTypes26 = new String[] { "java.lang.String" };

		_methodName27 = "updatePushNotificationsDevice";

		_methodParameterTypes27 = new String[] {
				"com.liferay.pushnotifications.model.PushNotificationsDevice"
			};

		_methodName28 = "updateToken";

		_methodParameterTypes28 = new String[] {
				"java.lang.String", "java.lang.String"
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			};
	}

	@Override
	public com.liferay.pushnotifications.model.PushNotificationsDevice addPushNotificationsDevice(
<<<<<<< HEAD
		com.liferay.pushnotifications.model.PushNotificationsDevice pushNotificationsDevice)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
		com.liferay.pushnotifications.model.PushNotificationsDevice pushNotificationsDevice) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] {
						ClpSerializer.translateInput(pushNotificationsDevice)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}
=======
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.pushnotifications.model.PushNotificationsDevice addPushNotificationsDevice(
		long userId, java.lang.String platform, java.lang.String token) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1,
					new Object[] {
						userId,
						
					ClpSerializer.translateInput(platform),
						
					ClpSerializer.translateInput(token)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.pushnotifications.model.PushNotificationsDevice createPushNotificationsDevice(
		long pushNotificationsDeviceId) {
		Object returnObj = null;

		try {
<<<<<<< HEAD
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1,
=======
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { pushNotificationsDeviceId });
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

		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.pushnotifications.model.PushNotificationsDevice deletePushNotificationsDevice(
		long pushNotificationsDeviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2,
=======
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(persistedModel) });
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

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.pushnotifications.model.PushNotificationsDevice deletePushNotificationsDevice(
		com.liferay.pushnotifications.model.PushNotificationsDevice pushNotificationsDevice) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4,
					new Object[] {
						ClpSerializer.translateInput(pushNotificationsDevice)
					});
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

		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.pushnotifications.model.PushNotificationsDevice deletePushNotificationsDevice(
		long pushNotificationsDeviceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { pushNotificationsDeviceId });
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

		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.pushnotifications.model.PushNotificationsDevice deletePushNotificationsDevice(
<<<<<<< HEAD
		com.liferay.pushnotifications.model.PushNotificationsDevice pushNotificationsDevice)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] {
						ClpSerializer.translateInput(pushNotificationsDevice)
					});
=======
		java.lang.String token)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] { ClpSerializer.translateInput(token) });
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

		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		Object returnObj = null;

		try {
<<<<<<< HEAD
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] {  });
=======
			returnObj = _invokableLocalService.invokeMethod(_methodName7,
					_methodParameterTypes7, new Object[] {  });
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
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8,
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
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
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
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10,
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
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11,
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
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
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
	public com.liferay.pushnotifications.model.PushNotificationsDevice fetchPushNotificationsDevice(
<<<<<<< HEAD
		long pushNotificationsDeviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10,
=======
		long pushNotificationsDeviceId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { pushNotificationsDeviceId });
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

		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.pushnotifications.model.PushNotificationsDevice getPushNotificationsDevice(
		long pushNotificationsDeviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11,
					new Object[] { pushNotificationsDeviceId });
=======
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14, new Object[] {  });
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
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);
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
		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
=======
		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
=======
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
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

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public java.util.List<com.liferay.pushnotifications.model.PushNotificationsDevice> getPushNotificationsDevices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { start, end });
=======
	public com.liferay.pushnotifications.model.PushNotificationsDevice getPushNotificationsDevice(
		long pushNotificationsDeviceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName17,
					_methodParameterTypes17,
					new Object[] { pushNotificationsDeviceId });
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
		return (java.util.List<com.liferay.pushnotifications.model.PushNotificationsDevice>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getPushNotificationsDevicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14, new Object[] {  });
=======
		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.pushnotifications.model.PushNotificationsDevice> getPushNotificationsDevices(
		int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName18,
					_methodParameterTypes18, new Object[] { start, end });
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
		return ((Integer)returnObj).intValue();
	}

	@Override
	public com.liferay.pushnotifications.model.PushNotificationsDevice updatePushNotificationsDevice(
		com.liferay.pushnotifications.model.PushNotificationsDevice pushNotificationsDevice)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] {
						ClpSerializer.translateInput(pushNotificationsDevice)
=======
		return (java.util.List<com.liferay.pushnotifications.model.PushNotificationsDevice>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.pushnotifications.model.PushNotificationsDevice> getPushNotificationsDevices(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] {
						start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
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

<<<<<<< HEAD
		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16, new Object[] {  });
=======
		return (java.util.List<com.liferay.pushnotifications.model.PushNotificationsDevice>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getPushNotificationsDevicesCount() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20, new Object[] {  });
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
		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public void resetPushNotificationSenders() {
		try {
			_invokableLocalService.invokeMethod(_methodName22,
				_methodParameterTypes22, new Object[] {  });
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
	}

	@Override
<<<<<<< HEAD
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public com.liferay.pushnotifications.model.PushNotificationsDevice addPushNotificationsDevice(
		long userId, java.lang.String platform, java.lang.String token)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] {
						userId,
						
					ClpSerializer.translateInput(platform),
						
					ClpSerializer.translateInput(token)
					});
=======
	public void sendPushNotification(java.lang.String platform,
		java.util.List<java.lang.String> tokens,
		com.liferay.portal.kernel.json.JSONObject payloadJSONObject)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName23,
				_methodParameterTypes23,
				new Object[] {
					ClpSerializer.translateInput(platform),
					
				ClpSerializer.translateInput(tokens),
					
				ClpSerializer.translateInput(payloadJSONObject)
				});
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
	public void sendPushNotification(java.lang.String platform,
		java.util.List<java.lang.String> tokens,
		com.liferay.portal.kernel.json.JSONObject payloadJSONObject,
		java.util.Map<java.lang.String, java.lang.Object> configuration)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName24,
				_methodParameterTypes24,
				new Object[] {
					ClpSerializer.translateInput(platform),
					
				ClpSerializer.translateInput(tokens),
					
				ClpSerializer.translateInput(payloadJSONObject),
					
				ClpSerializer.translateInput(configuration)
				});
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

		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.pushnotifications.model.PushNotificationsDevice deletePushNotificationsDevice(
		java.lang.String token)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20,
					new Object[] { ClpSerializer.translateInput(token) });
=======
	}

	@Override
	public void sendPushNotification(long[] toUserIds,
		com.liferay.portal.kernel.json.JSONObject payloadJSONObject)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName25,
				_methodParameterTypes25,
				new Object[] {
					ClpSerializer.translateInput(toUserIds),
					
				ClpSerializer.translateInput(payloadJSONObject)
				});
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
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName26,
				_methodParameterTypes26,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);
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

		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<java.lang.String> getTokens(long userId,
		java.lang.String platform, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21,
					new Object[] {
						userId,
						
					ClpSerializer.translateInput(platform),
						
					start,
						
					end
=======
	}

	@Override
	public com.liferay.pushnotifications.model.PushNotificationsDevice updatePushNotificationsDevice(
		com.liferay.pushnotifications.model.PushNotificationsDevice pushNotificationsDevice) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName27,
					_methodParameterTypes27,
					new Object[] {
						ClpSerializer.translateInput(pushNotificationsDevice)
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

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

		return (com.liferay.pushnotifications.model.PushNotificationsDevice)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void updateToken(java.lang.String oldToken, java.lang.String newToken)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName28,
				_methodParameterTypes28,
				new Object[] {
					ClpSerializer.translateInput(oldToken),
					
				ClpSerializer.translateInput(newToken)
				});
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

		return (java.util.List<java.lang.String>)ClpSerializer.translateOutput(returnObj);
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

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
<<<<<<< HEAD
	private String _methodName21;
	private String[] _methodParameterTypes21;
=======
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}