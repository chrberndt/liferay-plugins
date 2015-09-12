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

package com.liferay.privatemessaging.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.privatemessaging.service.UserThreadLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class UserThreadLocalServiceClpInvoker {
	public UserThreadLocalServiceClpInvoker() {
		_methodName0 = "addUserThread";

		_methodParameterTypes0 = new String[] {
				"com.liferay.privatemessaging.model.UserThread"
			};

		_methodName1 = "createUserThread";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteUserThread";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteUserThread";

		_methodParameterTypes3 = new String[] {
				"com.liferay.privatemessaging.model.UserThread"
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

		_methodName10 = "fetchUserThread";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getUserThread";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getActionableDynamicQuery";

		_methodParameterTypes12 = new String[] {  };

		_methodName14 = "deletePersistedModel";

		_methodParameterTypes14 = new String[] {
				"com.liferay.portal.model.PersistedModel"
			};

		_methodName15 = "getPersistedModel";

		_methodParameterTypes15 = new String[] { "java.io.Serializable" };

		_methodName16 = "getUserThreads";

		_methodParameterTypes16 = new String[] { "int", "int" };

		_methodName17 = "getUserThreadsCount";

		_methodParameterTypes17 = new String[] {  };

		_methodName18 = "updateUserThread";

		_methodParameterTypes18 = new String[] {
				"com.liferay.privatemessaging.model.UserThread"
			};

<<<<<<< HEAD
		_methodName40 = "getBeanIdentifier";

		_methodParameterTypes40 = new String[] {  };

		_methodName41 = "setBeanIdentifier";

		_methodParameterTypes41 = new String[] { "java.lang.String" };

		_methodName46 = "addPrivateMessage";

		_methodParameterTypes46 = new String[] {
=======
		_methodName43 = "getBeanIdentifier";

		_methodParameterTypes43 = new String[] {  };

		_methodName44 = "setBeanIdentifier";

		_methodParameterTypes44 = new String[] { "java.lang.String" };

		_methodName49 = "addPrivateMessage";

		_methodParameterTypes49 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.util.List",
				"com.liferay.portal.theme.ThemeDisplay"
			};

<<<<<<< HEAD
		_methodName47 = "addPrivateMessageBranch";

		_methodParameterTypes47 = new String[] {
=======
		_methodName50 = "addPrivateMessageBranch";

		_methodParameterTypes50 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "long", "java.lang.String", "java.util.List",
				"com.liferay.portal.theme.ThemeDisplay"
			};

<<<<<<< HEAD
		_methodName48 = "addUserThread";

		_methodParameterTypes48 = new String[] {
				"long", "long", "long", "boolean", "boolean"
			};

		_methodName49 = "deleteUser";

		_methodParameterTypes49 = new String[] { "long" };

		_methodName50 = "deleteUserThread";

		_methodParameterTypes50 = new String[] { "long", "long" };

		_methodName51 = "fetchUserThread";

		_methodParameterTypes51 = new String[] { "long", "long" };

		_methodName52 = "getMBThreadUserThreads";

		_methodParameterTypes52 = new String[] { "long" };

		_methodName53 = "getUserThread";

		_methodParameterTypes53 = new String[] { "long", "long" };

		_methodName54 = "getUserUserThreadCount";

		_methodParameterTypes54 = new String[] { "long", "boolean" };

		_methodName55 = "getUserUserThreadCount";

		_methodParameterTypes55 = new String[] { "long", "boolean", "boolean" };

		_methodName56 = "getUserUserThreads";

		_methodParameterTypes56 = new String[] { "long", "boolean" };

		_methodName57 = "getUserUserThreads";

		_methodParameterTypes57 = new String[] { "long", "boolean", "boolean" };

		_methodName58 = "getUserUserThreads";

		_methodParameterTypes58 = new String[] { "long", "boolean", "int", "int" };

		_methodName59 = "markUserThreadAsRead";

		_methodParameterTypes59 = new String[] { "long", "long" };

		_methodName60 = "markUserThreadAsUnread";

		_methodParameterTypes60 = new String[] { "long", "long" };

		_methodName61 = "updateUserName";

		_methodParameterTypes61 = new String[] { "com.liferay.portal.model.User" };
=======
		_methodName51 = "addUserThread";

		_methodParameterTypes51 = new String[] {
				"long", "long", "long", "boolean", "boolean"
			};

		_methodName52 = "deleteUser";

		_methodParameterTypes52 = new String[] { "long" };

		_methodName53 = "deleteUserThread";

		_methodParameterTypes53 = new String[] { "long", "long" };

		_methodName54 = "fetchUserThread";

		_methodParameterTypes54 = new String[] { "long", "long" };

		_methodName55 = "getMBThreadUserThreads";

		_methodParameterTypes55 = new String[] { "long" };

		_methodName56 = "getUserThread";

		_methodParameterTypes56 = new String[] { "long", "long" };

		_methodName57 = "getUserUserThreadCount";

		_methodParameterTypes57 = new String[] { "long", "boolean" };

		_methodName58 = "getUserUserThreadCount";

		_methodParameterTypes58 = new String[] { "long", "boolean", "boolean" };

		_methodName59 = "getUserUserThreads";

		_methodParameterTypes59 = new String[] { "long", "boolean" };

		_methodName60 = "getUserUserThreads";

		_methodParameterTypes60 = new String[] { "long", "boolean", "boolean" };

		_methodName61 = "getUserUserThreads";

		_methodParameterTypes61 = new String[] { "long", "boolean", "int", "int" };

		_methodName62 = "markUserThreadAsRead";

		_methodParameterTypes62 = new String[] { "long", "long" };

		_methodName63 = "markUserThreadAsUnread";

		_methodParameterTypes63 = new String[] { "long", "long" };

		_methodName64 = "updateUserName";

		_methodParameterTypes64 = new String[] { "com.liferay.portal.model.User" };
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return UserThreadLocalServiceUtil.addUserThread((com.liferay.privatemessaging.model.UserThread)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return UserThreadLocalServiceUtil.createUserThread(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return UserThreadLocalServiceUtil.deleteUserThread(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return UserThreadLocalServiceUtil.deleteUserThread((com.liferay.privatemessaging.model.UserThread)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return UserThreadLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return UserThreadLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return UserThreadLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return UserThreadLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<?>)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return UserThreadLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return UserThreadLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return UserThreadLocalServiceUtil.fetchUserThread(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return UserThreadLocalServiceUtil.getUserThread(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return UserThreadLocalServiceUtil.getActionableDynamicQuery();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return UserThreadLocalServiceUtil.deletePersistedModel((com.liferay.portal.model.PersistedModel)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return UserThreadLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			return UserThreadLocalServiceUtil.getUserThreads(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			return UserThreadLocalServiceUtil.getUserThreadsCount();
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			return UserThreadLocalServiceUtil.updateUserThread((com.liferay.privatemessaging.model.UserThread)arguments[0]);
		}

<<<<<<< HEAD
		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			return UserThreadLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName41.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
=======
		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
			return UserThreadLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName44.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes44, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			UserThreadLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
=======
		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return UserThreadLocalServiceUtil.addPrivateMessage(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4],
				(java.util.List<com.liferay.portal.kernel.util.ObjectValuePair<java.lang.String, java.io.InputStream>>)arguments[5],
				(com.liferay.portal.theme.ThemeDisplay)arguments[6]);
		}

<<<<<<< HEAD
		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
=======
		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return UserThreadLocalServiceUtil.addPrivateMessageBranch(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(java.util.List<com.liferay.portal.kernel.util.ObjectValuePair<java.lang.String, java.io.InputStream>>)arguments[3],
				(com.liferay.portal.theme.ThemeDisplay)arguments[4]);
		}

<<<<<<< HEAD
		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
=======
		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			UserThreadLocalServiceUtil.addUserThread(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Boolean)arguments[3]).booleanValue(),
				((Boolean)arguments[4]).booleanValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
=======
		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			UserThreadLocalServiceUtil.deleteUser(((Long)arguments[0]).longValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
=======
		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			UserThreadLocalServiceUtil.deleteUserThread(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
=======
		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return UserThreadLocalServiceUtil.fetchUserThread(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

<<<<<<< HEAD
		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
			return UserThreadLocalServiceUtil.getMBThreadUserThreads(((Long)arguments[0]).longValue());
		}

		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
=======
		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			return UserThreadLocalServiceUtil.getMBThreadUserThreads(((Long)arguments[0]).longValue());
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return UserThreadLocalServiceUtil.getUserThread(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

<<<<<<< HEAD
		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
=======
		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return UserThreadLocalServiceUtil.getUserUserThreadCount(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

<<<<<<< HEAD
		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
=======
		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return UserThreadLocalServiceUtil.getUserUserThreadCount(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue());
		}

<<<<<<< HEAD
		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
=======
		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return UserThreadLocalServiceUtil.getUserUserThreads(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

<<<<<<< HEAD
		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
=======
		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return UserThreadLocalServiceUtil.getUserUserThreads(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Boolean)arguments[2]).booleanValue());
		}

<<<<<<< HEAD
		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
=======
		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return UserThreadLocalServiceUtil.getUserUserThreads(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue());
		}

<<<<<<< HEAD
		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
=======
		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			UserThreadLocalServiceUtil.markUserThreadAsRead(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
=======
		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			UserThreadLocalServiceUtil.markUserThreadAsUnread(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
=======
		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			UserThreadLocalServiceUtil.updateUserName((com.liferay.portal.model.User)arguments[0]);

			return null;
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
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
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
	private String _methodName57;
	private String[] _methodParameterTypes57;
	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName61;
	private String[] _methodParameterTypes61;
<<<<<<< HEAD
=======
	private String _methodName62;
	private String[] _methodParameterTypes62;
	private String _methodName63;
	private String[] _methodParameterTypes63;
	private String _methodName64;
	private String[] _methodParameterTypes64;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}