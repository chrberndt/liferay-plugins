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

package com.liferay.words.service;

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
public class WordsServiceClp implements WordsService {
	public WordsServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

<<<<<<< HEAD
		_methodName0 = "getBeanIdentifier";

		_methodParameterTypes0 = new String[] {  };

		_methodName1 = "setBeanIdentifier";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName3 = "checkSpelling";

		_methodParameterTypes3 = new String[] { "java.lang.String" };

		_methodName4 = "getSuggestions";
=======
		_methodName0 = "checkSpelling";

		_methodParameterTypes0 = new String[] { "java.lang.String" };

		_methodName1 = "getBeanIdentifier";

		_methodParameterTypes1 = new String[] {  };

		_methodName2 = "getSuggestions";

		_methodParameterTypes2 = new String[] { "java.lang.String" };

		_methodName4 = "setBeanIdentifier";
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

		_methodParameterTypes4 = new String[] { "java.lang.String" };
	}

	@Override
<<<<<<< HEAD
	public java.lang.String getBeanIdentifier() {
=======
	public java.util.List<java.lang.String> checkSpelling(java.lang.String text)
		throws java.lang.Exception {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName0,
<<<<<<< HEAD
					_methodParameterTypes0, new Object[] {  });
=======
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(text) });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
=======
			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

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
		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableService.invokeMethod(_methodName1,
				_methodParameterTypes1,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
=======
		return (java.util.List<java.lang.String>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] {  });
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
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public java.util.List<java.lang.String> checkSpelling(java.lang.String text)
		throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(text) });
=======

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<java.lang.String> getSuggestions(
		java.lang.String word) throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName2,
					_methodParameterTypes2,
					new Object[] { ClpSerializer.translateInput(word) });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<java.lang.String>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public java.util.List<java.lang.String> getSuggestions(
		java.lang.String word) throws java.lang.Exception {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName4,
					_methodParameterTypes4,
					new Object[] { ClpSerializer.translateInput(word) });
=======
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableService.invokeMethod(_methodName4,
				_methodParameterTypes4,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof java.lang.Exception) {
				throw (java.lang.Exception)t;
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

		return (java.util.List<java.lang.String>)ClpSerializer.translateOutput(returnObj);
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	private InvokableService _invokableService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
<<<<<<< HEAD
	private String _methodName3;
	private String[] _methodParameterTypes3;
=======
	private String _methodName2;
	private String[] _methodParameterTypes2;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private String _methodName4;
	private String[] _methodParameterTypes4;
}