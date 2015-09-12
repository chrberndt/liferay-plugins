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

package com.liferay.knowledgebase.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.knowledgebase.service.KBTemplateServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class KBTemplateServiceClpInvoker {
	public KBTemplateServiceClpInvoker() {
<<<<<<< HEAD
		_methodName48 = "getBeanIdentifier";

		_methodParameterTypes48 = new String[] {  };

		_methodName49 = "setBeanIdentifier";

		_methodParameterTypes49 = new String[] { "java.lang.String" };

		_methodName54 = "addKBTemplate";

		_methodParameterTypes54 = new String[] {
=======
		_methodName56 = "getBeanIdentifier";

		_methodParameterTypes56 = new String[] {  };

		_methodName57 = "setBeanIdentifier";

		_methodParameterTypes57 = new String[] { "java.lang.String" };

		_methodName62 = "addKBTemplate";

		_methodParameterTypes62 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"java.lang.String", "java.lang.String", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

<<<<<<< HEAD
		_methodName55 = "deleteKBTemplate";

		_methodParameterTypes55 = new String[] { "long" };

		_methodName56 = "deleteKBTemplates";

		_methodParameterTypes56 = new String[] { "long", "long[][]" };

		_methodName57 = "getGroupKBTemplates";

		_methodParameterTypes57 = new String[] {
=======
		_methodName63 = "deleteKBTemplate";

		_methodParameterTypes63 = new String[] { "long" };

		_methodName64 = "deleteKBTemplates";

		_methodParameterTypes64 = new String[] { "long", "long[][]" };

		_methodName65 = "getGroupKBTemplates";

		_methodParameterTypes65 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName58 = "getGroupKBTemplatesCount";

		_methodParameterTypes58 = new String[] { "long" };

		_methodName59 = "getKBTemplate";

		_methodParameterTypes59 = new String[] { "long" };

		_methodName60 = "getKBTemplateSearchDisplay";

		_methodParameterTypes60 = new String[] {
=======
		_methodName66 = "getGroupKBTemplatesCount";

		_methodParameterTypes66 = new String[] { "long" };

		_methodName67 = "getKBTemplate";

		_methodParameterTypes67 = new String[] { "long" };

		_methodName68 = "getKBTemplateSearchDisplay";

		_methodParameterTypes68 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "java.lang.String", "java.lang.String", "java.util.Date",
				"java.util.Date", "boolean", "int[][]", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName61 = "updateKBTemplate";

		_methodParameterTypes61 = new String[] {
=======
		_methodName69 = "updateKBTemplate";

		_methodParameterTypes69 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "java.lang.String", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
<<<<<<< HEAD
		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
			return KBTemplateServiceUtil.getBeanIdentifier();
		}

		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
=======
		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			return KBTemplateServiceUtil.getBeanIdentifier();
		}

		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			KBTemplateServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
=======
		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBTemplateServiceUtil.addKBTemplate((java.lang.String)arguments[0],
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

<<<<<<< HEAD
		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
			return KBTemplateServiceUtil.deleteKBTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
=======
		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			return KBTemplateServiceUtil.deleteKBTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			KBTemplateServiceUtil.deleteKBTemplates(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
=======
		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBTemplateServiceUtil.getGroupKBTemplates(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBTemplate>)arguments[3]);
		}

<<<<<<< HEAD
		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return KBTemplateServiceUtil.getGroupKBTemplatesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			return KBTemplateServiceUtil.getKBTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
=======
		if (_methodName66.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
			return KBTemplateServiceUtil.getGroupKBTemplatesCount(((Long)arguments[0]).longValue());
		}

		if (_methodName67.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
			return KBTemplateServiceUtil.getKBTemplate(((Long)arguments[0]).longValue());
		}

		if (_methodName68.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes68, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBTemplateServiceUtil.getKBTemplateSearchDisplay(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.util.Date)arguments[3], (java.util.Date)arguments[4],
				((Boolean)arguments[5]).booleanValue(), (int[])arguments[6],
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBTemplate>)arguments[9]);
		}

<<<<<<< HEAD
		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
=======
		if (_methodName69.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes69, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBTemplateServiceUtil.updateKBTemplate(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		throw new UnsupportedOperationException();
	}

<<<<<<< HEAD
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private String _methodName56;
	private String[] _methodParameterTypes56;
	private String _methodName57;
	private String[] _methodParameterTypes57;
<<<<<<< HEAD
	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName61;
	private String[] _methodParameterTypes61;
=======
	private String _methodName62;
	private String[] _methodParameterTypes62;
	private String _methodName63;
	private String[] _methodParameterTypes63;
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName66;
	private String[] _methodParameterTypes66;
	private String _methodName67;
	private String[] _methodParameterTypes67;
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}