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

package com.liferay.pushnotifications.service.base;

<<<<<<< HEAD
=======
import aQute.bnd.annotation.ProviderType;

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.pushnotifications.service.PushNotificationsDeviceLocalServiceUtil;

import java.util.Arrays;

/**
<<<<<<< HEAD
 * @author Silvio Santos
 * @generated
 */
=======
 * @author Bruno Farache
 * @generated
 */
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public class PushNotificationsDeviceLocalServiceClpInvoker {
	public PushNotificationsDeviceLocalServiceClpInvoker() {
		_methodName0 = "addPushNotificationsDevice";

		_methodParameterTypes0 = new String[] {
				"com.liferay.pushnotifications.model.PushNotificationsDevice"
			};

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
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchPushNotificationsDevice";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPushNotificationsDevice";

		_methodParameterTypes11 = new String[] { "long" };

<<<<<<< HEAD
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

		_methodName40 = "getBeanIdentifier";

		_methodParameterTypes40 = new String[] {  };

		_methodName41 = "setBeanIdentifier";

		_methodParameterTypes41 = new String[] { "java.lang.String" };

		_methodName46 = "addPushNotificationsDevice";

		_methodParameterTypes46 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName47 = "deletePushNotificationsDevice";

		_methodParameterTypes47 = new String[] { "java.lang.String" };

		_methodName48 = "getTokens";

		_methodParameterTypes48 = new String[] {
				"long", "java.lang.String", "int", "int"
=======
		_methodName12 = "getActionableDynamicQuery";

		_methodParameterTypes12 = new String[] {  };

		_methodName14 = "deletePersistedModel";

		_methodParameterTypes14 = new String[] {
				"com.liferay.portal.model.PersistedModel"
			};

		_methodName15 = "getPersistedModel";

		_methodParameterTypes15 = new String[] { "java.io.Serializable" };

		_methodName16 = "getPushNotificationsDevices";

		_methodParameterTypes16 = new String[] { "int", "int" };

		_methodName17 = "getPushNotificationsDevicesCount";

		_methodParameterTypes17 = new String[] {  };

		_methodName18 = "updatePushNotificationsDevice";

		_methodParameterTypes18 = new String[] {
				"com.liferay.pushnotifications.model.PushNotificationsDevice"
			};

		_methodName43 = "getBeanIdentifier";

		_methodParameterTypes43 = new String[] {  };

		_methodName44 = "setBeanIdentifier";

		_methodParameterTypes44 = new String[] { "java.lang.String" };

		_methodName49 = "addPushNotificationsDevice";

		_methodParameterTypes49 = new String[] {
				"long", "java.lang.String", "java.lang.String"
			};

		_methodName50 = "deletePushNotificationsDevice";

		_methodParameterTypes50 = new String[] { "java.lang.String" };

		_methodName51 = "getPushNotificationsDevices";

		_methodParameterTypes51 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName52 = "resetPushNotificationSenders";

		_methodParameterTypes52 = new String[] {  };

		_methodName53 = "sendPushNotification";

		_methodParameterTypes53 = new String[] {
				"long[][]", "com.liferay.portal.kernel.json.JSONObject"
			};

		_methodName54 = "sendPushNotification";

		_methodParameterTypes54 = new String[] {
				"java.lang.String", "java.util.List",
				"com.liferay.portal.kernel.json.JSONObject"
			};

		_methodName55 = "sendPushNotification";

		_methodParameterTypes55 = new String[] {
				"java.lang.String", "java.util.List",
				"com.liferay.portal.kernel.json.JSONObject", "java.util.Map"
			};

		_methodName56 = "updateToken";

		_methodParameterTypes56 = new String[] {
				"java.lang.String", "java.lang.String"
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.addPushNotificationsDevice((com.liferay.pushnotifications.model.PushNotificationsDevice)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.createPushNotificationsDevice(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.deletePushNotificationsDevice(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.deletePushNotificationsDevice((com.liferay.pushnotifications.model.PushNotificationsDevice)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
<<<<<<< HEAD
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
=======
				(com.liferay.portal.kernel.util.OrderByComparator<?>)arguments[3]);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.fetchPushNotificationsDevice(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.getPushNotificationsDevice(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
<<<<<<< HEAD
			return PushNotificationsDeviceLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
=======
			return PushNotificationsDeviceLocalServiceUtil.getActionableDynamicQuery();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.deletePersistedModel((com.liferay.portal.model.PersistedModel)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return PushNotificationsDeviceLocalServiceUtil.getPushNotificationsDevices(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

<<<<<<< HEAD
		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.getPushNotificationsDevicesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.updatePushNotificationsDevice((com.liferay.pushnotifications.model.PushNotificationsDevice)arguments[0]);
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
=======
		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.getPushNotificationsDevicesCount();
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.updatePushNotificationsDevice((com.liferay.pushnotifications.model.PushNotificationsDevice)arguments[0]);
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			PushNotificationsDeviceLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
=======
		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return PushNotificationsDeviceLocalServiceUtil.addPushNotificationsDevice(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2]);
		}

<<<<<<< HEAD
		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.deletePushNotificationsDevice((java.lang.String)arguments[0]);
		}

		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.getTokens(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
=======
		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.deletePushNotificationsDevice((java.lang.String)arguments[0]);
		}

		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
			return PushNotificationsDeviceLocalServiceUtil.getPushNotificationsDevices(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			PushNotificationsDeviceLocalServiceUtil.resetPushNotificationSenders();

			return null;
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			PushNotificationsDeviceLocalServiceUtil.sendPushNotification((long[])arguments[0],
				(com.liferay.portal.kernel.json.JSONObject)arguments[1]);

			return null;
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			PushNotificationsDeviceLocalServiceUtil.sendPushNotification((java.lang.String)arguments[0],
				(java.util.List<java.lang.String>)arguments[1],
				(com.liferay.portal.kernel.json.JSONObject)arguments[2]);

			return null;
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			PushNotificationsDeviceLocalServiceUtil.sendPushNotification((java.lang.String)arguments[0],
				(java.util.List<java.lang.String>)arguments[1],
				(com.liferay.portal.kernel.json.JSONObject)arguments[2],
				(java.util.Map<java.lang.String, java.lang.Object>)arguments[3]);

			return null;
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			PushNotificationsDeviceLocalServiceUtil.updateToken((java.lang.String)arguments[0],
				(java.lang.String)arguments[1]);

			return null;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}

		throw new UnsupportedOperationException();
	}

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
<<<<<<< HEAD
	private String _methodName13;
	private String[] _methodParameterTypes13;
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
<<<<<<< HEAD
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
=======
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
	private String _methodName51;
	private String[] _methodParameterTypes51;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
	private String _methodName56;
	private String[] _methodParameterTypes56;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}