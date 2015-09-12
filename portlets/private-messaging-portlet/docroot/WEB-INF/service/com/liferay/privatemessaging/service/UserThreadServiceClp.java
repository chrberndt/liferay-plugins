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

package com.liferay.privatemessaging.service;

<<<<<<< HEAD
=======
import aQute.bnd.annotation.ProviderType;

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.service.InvokableService;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
<<<<<<< HEAD
=======
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public class UserThreadServiceClp implements UserThreadService {
	public UserThreadServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

		_methodName0 = "getBeanIdentifier";

		_methodParameterTypes0 = new String[] {  };

<<<<<<< HEAD
		_methodName1 = "setBeanIdentifier";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName3 = "getLastThreadMessage";

		_methodParameterTypes3 = new String[] { "long" };

		_methodName4 = "getThreadMessages";

		_methodParameterTypes4 = new String[] { "long", "int", "int", "boolean" };

		_methodName5 = "getThreadMessagesCount";

		_methodParameterTypes5 = new String[] { "long" };

		_methodName6 = "getUserUserThreads";

		_methodParameterTypes6 = new String[] { "boolean" };
=======
		_methodName1 = "getLastThreadMessage";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "getThreadMessages";

		_methodParameterTypes2 = new String[] { "long", "int", "int", "boolean" };

		_methodName3 = "getThreadMessagesCount";

		_methodParameterTypes3 = new String[] { "long" };

		_methodName4 = "getUserUserThreads";

		_methodParameterTypes4 = new String[] { "boolean" };

		_methodName6 = "setBeanIdentifier";

		_methodParameterTypes6 = new String[] { "java.lang.String" };
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName0,
					_methodParameterTypes0, new Object[] {  });
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

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableService.invokeMethod(_methodName1,
				_methodParameterTypes1,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
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
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public com.liferay.portlet.messageboards.model.MBMessage getLastThreadMessage(
		long mbThreadId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName3,
					_methodParameterTypes3, new Object[] { mbThreadId });
=======
	public com.liferay.portlet.messageboards.model.MBMessage getLastThreadMessage(
		long mbThreadId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] { mbThreadId });
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

		return (com.liferay.portlet.messageboards.model.MBMessage)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.portlet.messageboards.model.MBMessage> getThreadMessages(
		long mbThreadId, int start, int end, boolean ascending)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName4,
					_methodParameterTypes4,
=======
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName2,
					_methodParameterTypes2,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { mbThreadId, start, end, ascending });
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

		return (java.util.List<com.liferay.portlet.messageboards.model.MBMessage>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getThreadMessagesCount(long mbThreadId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName5,
					_methodParameterTypes5, new Object[] { mbThreadId });
=======
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName3,
					_methodParameterTypes3, new Object[] { mbThreadId });
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

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.util.List<com.liferay.privatemessaging.model.UserThread> getUserUserThreads(
		boolean deleted)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName6,
					_methodParameterTypes6, new Object[] { deleted });
=======
		throws com.liferay.portal.security.auth.PrincipalException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] { deleted });
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
			if (t instanceof com.liferay.portal.security.auth.PrincipalException) {
				throw (com.liferay.portal.security.auth.PrincipalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.privatemessaging.model.UserThread>)ClpSerializer.translateOutput(returnObj);
	}

<<<<<<< HEAD
=======
	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableService.invokeMethod(_methodName6,
				_methodParameterTypes6,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
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

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private InvokableService _invokableService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
<<<<<<< HEAD
=======
	private String _methodName2;
	private String[] _methodParameterTypes2;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
<<<<<<< HEAD
	private String _methodName5;
	private String[] _methodParameterTypes5;
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private String _methodName6;
	private String[] _methodParameterTypes6;
}