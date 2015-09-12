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

import com.liferay.knowledgebase.service.KBArticleServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class KBArticleServiceClpInvoker {
	public KBArticleServiceClpInvoker() {
<<<<<<< HEAD
		_methodName88 = "getBeanIdentifier";

		_methodParameterTypes88 = new String[] {  };

		_methodName89 = "setBeanIdentifier";

		_methodParameterTypes89 = new String[] { "java.lang.String" };

		_methodName94 = "addAttachment";

		_methodParameterTypes94 = new String[] {
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.io.InputStream",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName95 = "addKBArticle";

		_methodParameterTypes95 = new String[] {
				"java.lang.String", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String[][]", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName96 = "deleteAttachment";

		_methodParameterTypes96 = new String[] {
				"long", "long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName97 = "deleteKBArticle";

		_methodParameterTypes97 = new String[] { "long" };

		_methodName98 = "deleteKBArticles";

		_methodParameterTypes98 = new String[] { "long", "long[][]" };

		_methodName99 = "getAttachment";

		_methodParameterTypes99 = new String[] {
				"long", "long", "java.lang.String", "long", "java.lang.String"
			};

		_methodName100 = "getGroupKBArticles";

		_methodParameterTypes100 = new String[] {
=======
		_methodName100 = "getBeanIdentifier";

		_methodParameterTypes100 = new String[] {  };

		_methodName101 = "setBeanIdentifier";

		_methodParameterTypes101 = new String[] { "java.lang.String" };

		_methodName106 = "revertKBArticle";

		_methodParameterTypes106 = new String[] {
				"long", "int", "com.liferay.portal.service.ServiceContext"
			};

		_methodName107 = "addKBArticle";

		_methodParameterTypes107 = new String[] {
				"java.lang.String", "long", "long", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String[][]",
				"java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName108 = "addKBArticlesMarkdown";

		_methodParameterTypes108 = new String[] {
				"long", "long", "java.lang.String", "boolean",
				"java.io.InputStream",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName109 = "addTempAttachment";

		_methodParameterTypes109 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.io.InputStream", "java.lang.String"
			};

		_methodName110 = "deleteKBArticle";

		_methodParameterTypes110 = new String[] { "long" };

		_methodName111 = "deleteKBArticles";

		_methodParameterTypes111 = new String[] { "long", "long[][]" };

		_methodName112 = "deleteTempAttachment";

		_methodParameterTypes112 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String"
			};

		_methodName113 = "fetchLatestKBArticle";

		_methodParameterTypes113 = new String[] { "long", "int" };

		_methodName114 = "getGroupKBArticles";

		_methodParameterTypes114 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName101 = "getGroupKBArticlesCount";

		_methodParameterTypes101 = new String[] { "long", "int" };

		_methodName102 = "getGroupKBArticlesRSS";

		_methodParameterTypes102 = new String[] {
=======
		_methodName115 = "getGroupKBArticlesCount";

		_methodParameterTypes115 = new String[] { "long", "int" };

		_methodName116 = "getGroupKBArticlesRSS";

		_methodParameterTypes116 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"int", "int", "java.lang.String", "java.lang.String",
				"com.liferay.portal.theme.ThemeDisplay"
			};

<<<<<<< HEAD
		_methodName103 = "getKBArticle";

		_methodParameterTypes103 = new String[] { "long", "int" };

		_methodName104 = "getKBArticleAndAllDescendantKBArticles";

		_methodParameterTypes104 = new String[] {
=======
		_methodName117 = "getKBArticle";

		_methodParameterTypes117 = new String[] { "long", "int" };

		_methodName118 = "getKBArticleAndAllDescendantKBArticles";

		_methodParameterTypes118 = new String[] {
				"long", "long", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName119 = "getKBArticleAndAllDescendants";

		_methodParameterTypes119 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "long", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName105 = "getKBArticleAndAllDescendants";

		_methodParameterTypes105 = new String[] {
				"long", "long", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName106 = "getKBArticleRSS";

		_methodParameterTypes106 = new String[] {
=======
		_methodName120 = "getKBArticleRSS";

		_methodParameterTypes120 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "int", "int", "java.lang.String", "java.lang.String",
				"com.liferay.portal.theme.ThemeDisplay"
			};

<<<<<<< HEAD
		_methodName107 = "getKBArticles";

		_methodParameterTypes107 = new String[] {
				"long", "long", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName108 = "getKBArticles";

		_methodParameterTypes108 = new String[] {
				"long", "long[][]", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName109 = "getKBArticles";

		_methodParameterTypes109 = new String[] {
=======
		_methodName121 = "getKBArticles";

		_methodParameterTypes121 = new String[] {
				"long", "long", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName122 = "getKBArticles";

		_methodParameterTypes122 = new String[] {
				"long", "long[][]", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName123 = "getKBArticles";

		_methodParameterTypes123 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "long[][]", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName110 = "getKBArticlesCount";

		_methodParameterTypes110 = new String[] { "long", "long", "int" };

		_methodName111 = "getKBArticlesCount";

		_methodParameterTypes111 = new String[] { "long", "long[][]", "int" };

		_methodName112 = "getKBArticleSearchDisplay";

		_methodParameterTypes112 = new String[] {
=======
		_methodName124 = "getKBArticlesCount";

		_methodParameterTypes124 = new String[] { "long", "long", "int" };

		_methodName125 = "getKBArticlesCount";

		_methodParameterTypes125 = new String[] { "long", "long[][]", "int" };

		_methodName126 = "getKBArticleSearchDisplay";

		_methodParameterTypes126 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "java.lang.String", "java.lang.String", "int",
				"java.util.Date", "java.util.Date", "boolean", "int[][]", "int",
				"int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName113 = "getKBArticleVersions";

		_methodParameterTypes113 = new String[] {
=======
		_methodName127 = "getKBArticleVersions";

		_methodParameterTypes127 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "long", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName114 = "getKBArticleVersionsCount";

		_methodParameterTypes114 = new String[] { "long", "long", "int" };

		_methodName115 = "getLatestKBArticle";

		_methodParameterTypes115 = new String[] { "long", "int" };

		_methodName116 = "getSectionsKBArticles";

		_methodParameterTypes116 = new String[] {
=======
		_methodName128 = "getKBArticleVersionsCount";

		_methodParameterTypes128 = new String[] { "long", "long", "int" };

		_methodName129 = "getLatestKBArticle";

		_methodParameterTypes129 = new String[] { "long", "int" };

		_methodName130 = "getSectionsKBArticles";

		_methodParameterTypes130 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "java.lang.String[][]", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName117 = "getSectionsKBArticlesCount";

		_methodParameterTypes117 = new String[] {
				"long", "java.lang.String[][]", "int"
			};

		_methodName118 = "getSiblingKBArticles";

		_methodParameterTypes118 = new String[] {
=======
		_methodName131 = "getSectionsKBArticlesCount";

		_methodParameterTypes131 = new String[] {
				"long", "java.lang.String[][]", "int"
			};

		_methodName132 = "getSiblingKBArticles";

		_methodParameterTypes132 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "long", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName119 = "getSiblingKBArticlesCount";

		_methodParameterTypes119 = new String[] { "long", "long", "int" };

		_methodName120 = "moveKBArticle";

		_methodParameterTypes120 = new String[] { "long", "long", "double" };

		_methodName121 = "subscribeGroupKBArticles";

		_methodParameterTypes121 = new String[] { "long", "java.lang.String" };

		_methodName122 = "subscribeKBArticle";

		_methodParameterTypes122 = new String[] { "long", "long" };

		_methodName123 = "unsubscribeGroupKBArticles";

		_methodParameterTypes123 = new String[] { "long", "java.lang.String" };

		_methodName124 = "unsubscribeKBArticle";

		_methodParameterTypes124 = new String[] { "long" };

		_methodName125 = "updateAttachments";

		_methodParameterTypes125 = new String[] {
				"java.lang.String", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName126 = "updateKBArticle";

		_methodParameterTypes126 = new String[] {
=======
		_methodName133 = "getSiblingKBArticlesCount";

		_methodParameterTypes133 = new String[] { "long", "long", "int" };

		_methodName134 = "getTempAttachmentNames";

		_methodParameterTypes134 = new String[] { "long", "java.lang.String" };

		_methodName135 = "moveKBArticle";

		_methodParameterTypes135 = new String[] { "long", "long", "long", "double" };

		_methodName136 = "subscribeGroupKBArticles";

		_methodParameterTypes136 = new String[] { "long", "java.lang.String" };

		_methodName137 = "subscribeKBArticle";

		_methodParameterTypes137 = new String[] { "long", "long" };

		_methodName138 = "unsubscribeGroupKBArticles";

		_methodParameterTypes138 = new String[] { "long", "java.lang.String" };

		_methodName139 = "unsubscribeKBArticle";

		_methodParameterTypes139 = new String[] { "long" };

		_methodName140 = "updateKBArticle";

		_methodParameterTypes140 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String[][]",
				"java.lang.String[][]", "long[][]",
				"com.liferay.portal.service.ServiceContext"
			};

<<<<<<< HEAD
		_methodName127 = "updateKBArticlesPriorities";

		_methodParameterTypes127 = new String[] { "long", "java.util.Map" };
=======
		_methodName141 = "updateKBArticlesPriorities";

		_methodParameterTypes141 = new String[] { "long", "java.util.Map" };
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
<<<<<<< HEAD
		if (_methodName88.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
			return KBArticleServiceUtil.getBeanIdentifier();
		}

		if (_methodName89.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
=======
		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
			return KBArticleServiceUtil.getBeanIdentifier();
		}

		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			KBArticleServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName94.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
			KBArticleServiceUtil.addAttachment((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.io.InputStream)arguments[4],
				(com.liferay.portal.service.ServiceContext)arguments[5]);

			return null;
		}

		if (_methodName95.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
			return KBArticleServiceUtil.addKBArticle((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.String)arguments[4], (java.lang.String)arguments[5],
				(java.lang.String[])arguments[6],
				(java.lang.String)arguments[7],
				(com.liferay.portal.service.ServiceContext)arguments[8]);
		}

		if (_methodName96.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
			KBArticleServiceUtil.deleteAttachment(((Long)arguments[0]).longValue(),
=======
		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return KBArticleServiceUtil.revertKBArticle(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[2]);
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return KBArticleServiceUtil.addKBArticle((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(java.lang.String)arguments[7],
				(java.lang.String[])arguments[8],
				(java.lang.String[])arguments[9],
				(com.liferay.portal.service.ServiceContext)arguments[10]);
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return KBArticleServiceUtil.addKBArticlesMarkdown(((Long)arguments[0]).longValue(),
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				((Boolean)arguments[3]).booleanValue(),
				(java.io.InputStream)arguments[4],
				(com.liferay.portal.service.ServiceContext)arguments[5]);
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
			KBArticleServiceUtil.addTempAttachment(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.io.InputStream)arguments[4],
				(java.lang.String)arguments[5]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName97.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
			return KBArticleServiceUtil.deleteKBArticle(((Long)arguments[0]).longValue());
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
=======
		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return KBArticleServiceUtil.deleteKBArticle(((Long)arguments[0]).longValue());
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			KBArticleServiceUtil.deleteKBArticles(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			return KBArticleServiceUtil.getAttachment(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(), (java.lang.String)arguments[4]);
		}

		if (_methodName100.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
=======
		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			KBArticleServiceUtil.deleteTempAttachment(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3]);

			return null;
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			return KBArticleServiceUtil.fetchLatestKBArticle(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getGroupKBArticles(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle>)arguments[4]);
		}

<<<<<<< HEAD
		if (_methodName101.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
=======
		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getGroupKBArticlesCount(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

<<<<<<< HEAD
		if (_methodName102.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
=======
		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getGroupKBArticlesRSS(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(com.liferay.portal.theme.ThemeDisplay)arguments[4]);
		}

<<<<<<< HEAD
		if (_methodName103.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
=======
		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getKBArticle(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

<<<<<<< HEAD
		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return KBArticleServiceUtil.getKBArticleAndAllDescendantKBArticles(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
=======
		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			return KBArticleServiceUtil.getKBArticleAndAllDescendantKBArticles(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle>)arguments[3]);
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getKBArticleAndAllDescendants(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle>)arguments[3]);
		}

<<<<<<< HEAD
		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
=======
		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getKBArticleRSS(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(com.liferay.portal.theme.ThemeDisplay)arguments[5]);
		}

<<<<<<< HEAD
		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
=======
		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getKBArticles(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
<<<<<<< HEAD
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[5]);
		}

		if (_methodName108.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
			return KBArticleServiceUtil.getKBArticles(((Long)arguments[0]).longValue(),
				(long[])arguments[1], ((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[5]);
		}

		if (_methodName109.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
=======
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle>)arguments[5]);
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getKBArticles(((Long)arguments[0]).longValue(),
				(long[])arguments[1], ((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle>)arguments[5]);
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return KBArticleServiceUtil.getKBArticles(((Long)arguments[0]).longValue(),
				(long[])arguments[1], ((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle>)arguments[3]);
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			return KBArticleServiceUtil.getKBArticlesCount(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

<<<<<<< HEAD
		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return KBArticleServiceUtil.getKBArticlesCount(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
=======
		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getKBArticlesCount(((Long)arguments[0]).longValue(),
				(long[])arguments[1], ((Integer)arguments[2]).intValue());
		}

<<<<<<< HEAD
		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
=======
		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getKBArticleSearchDisplay(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				(java.util.Date)arguments[4], (java.util.Date)arguments[5],
				((Boolean)arguments[6]).booleanValue(), (int[])arguments[7],
				((Integer)arguments[8]).intValue(),
				((Integer)arguments[9]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle>)arguments[10]);
		}

<<<<<<< HEAD
		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
=======
		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getKBArticleVersions(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle>)arguments[5]);
		}

<<<<<<< HEAD
		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
=======
		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getKBArticleVersionsCount(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

<<<<<<< HEAD
		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
=======
		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getLatestKBArticle(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue());
		}

<<<<<<< HEAD
		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
=======
		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getSectionsKBArticles(((Long)arguments[0]).longValue(),
				(java.lang.String[])arguments[1],
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle>)arguments[5]);
		}

<<<<<<< HEAD
		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
=======
		if (_methodName131.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getSectionsKBArticlesCount(((Long)arguments[0]).longValue(),
				(java.lang.String[])arguments[1],
				((Integer)arguments[2]).intValue());
		}

<<<<<<< HEAD
		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
=======
		if (_methodName132.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getSiblingKBArticles(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle>)arguments[5]);
		}

<<<<<<< HEAD
		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
=======
		if (_methodName133.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.getSiblingKBArticlesCount(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

<<<<<<< HEAD
		if (_methodName120.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
=======
		if (_methodName134.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes134, parameterTypes)) {
			return KBArticleServiceUtil.getTempAttachmentNames(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		if (_methodName135.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes135, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			KBArticleServiceUtil.moveKBArticle(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Double)arguments[3]).doubleValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName121.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
=======
		if (_methodName136.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes136, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			KBArticleServiceUtil.subscribeGroupKBArticles(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
=======
		if (_methodName137.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes137, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			KBArticleServiceUtil.subscribeKBArticle(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
=======
		if (_methodName138.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes138, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			KBArticleServiceUtil.unsubscribeGroupKBArticles(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
=======
		if (_methodName139.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes139, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			KBArticleServiceUtil.unsubscribeKBArticle(((Long)arguments[0]).longValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			return KBArticleServiceUtil.updateAttachments((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
=======
		if (_methodName140.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes140, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return KBArticleServiceUtil.updateKBArticle(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String[])arguments[5],
				(java.lang.String[])arguments[6], (long[])arguments[7],
				(com.liferay.portal.service.ServiceContext)arguments[8]);
		}

<<<<<<< HEAD
		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
=======
		if (_methodName141.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes141, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			KBArticleServiceUtil.updateKBArticlesPriorities(((Long)arguments[0]).longValue(),
				(java.util.Map<java.lang.Long, java.lang.Double>)arguments[1]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

<<<<<<< HEAD
	private String _methodName88;
	private String[] _methodParameterTypes88;
	private String _methodName89;
	private String[] _methodParameterTypes89;
	private String _methodName94;
	private String[] _methodParameterTypes94;
	private String _methodName95;
	private String[] _methodParameterTypes95;
	private String _methodName96;
	private String[] _methodParameterTypes96;
	private String _methodName97;
	private String[] _methodParameterTypes97;
	private String _methodName98;
	private String[] _methodParameterTypes98;
	private String _methodName99;
	private String[] _methodParameterTypes99;
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private String _methodName100;
	private String[] _methodParameterTypes100;
	private String _methodName101;
	private String[] _methodParameterTypes101;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
	private String _methodName108;
	private String[] _methodParameterTypes108;
	private String _methodName109;
	private String[] _methodParameterTypes109;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName112;
	private String[] _methodParameterTypes112;
	private String _methodName113;
	private String[] _methodParameterTypes113;
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
	private String _methodName120;
	private String[] _methodParameterTypes120;
	private String _methodName121;
	private String[] _methodParameterTypes121;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
<<<<<<< HEAD
=======
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
	private String _methodName131;
	private String[] _methodParameterTypes131;
	private String _methodName132;
	private String[] _methodParameterTypes132;
	private String _methodName133;
	private String[] _methodParameterTypes133;
	private String _methodName134;
	private String[] _methodParameterTypes134;
	private String _methodName135;
	private String[] _methodParameterTypes135;
	private String _methodName136;
	private String[] _methodParameterTypes136;
	private String _methodName137;
	private String[] _methodParameterTypes137;
	private String _methodName138;
	private String[] _methodParameterTypes138;
	private String _methodName139;
	private String[] _methodParameterTypes139;
	private String _methodName140;
	private String[] _methodParameterTypes140;
	private String _methodName141;
	private String[] _methodParameterTypes141;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}