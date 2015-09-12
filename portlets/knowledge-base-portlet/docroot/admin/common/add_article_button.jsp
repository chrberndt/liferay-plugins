<%--
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
--%>

<%@ include file="/admin/init.jsp" %>

<%
<<<<<<< HEAD
List<KBTemplate> kbTemplates = KBTemplateServiceUtil.getGroupKBTemplates(scopeGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, OrderByComparatorFactoryUtil.create("KBTemplate", "title", false));
=======
OrderByComparator<KBTemplate> obc = OrderByComparatorFactoryUtil.create("KBTemplate", "title", false);

List<KBTemplate> kbTemplates = KBTemplateServiceUtil.getGroupKBTemplates(scopeGroupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, obc);

long parentResourceClassNameId = ParamUtil.getLong(request, "parentResourceClassNameId", PortalUtil.getClassNameId(KBFolderConstants.getClassName()));
long parentResourcePrimKey = ParamUtil.getLong(request, "parentResourcePrimKey", KBFolderConstants.DEFAULT_PARENT_FOLDER_ID);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
%>

<liferay-portlet:renderURL var="addBasicKBArticleURL">
	<portlet:param name="mvcPath" value='<%= templatePath + "edit_article.jsp" %>' />
	<portlet:param name="redirect" value="<%= redirect %>" />
<<<<<<< HEAD
=======
	<portlet:param name="parentResourceClassNameId" value="<%= String.valueOf(parentResourceClassNameId) %>" />
	<portlet:param name="parentResourcePrimKey" value="<%= String.valueOf(parentResourcePrimKey) %>" />
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
</liferay-portlet:renderURL>

<c:choose>
	<c:when test="<%= kbTemplates.isEmpty() %>">
<<<<<<< HEAD
		<aui:button href="<%= addBasicKBArticleURL %>" value="add-article" />
	</c:when>
	<c:otherwise>
		<liferay-ui:icon-menu direction="down" extended="<%= false %>" icon="<%= StringPool.BLANK %>" message="add-article" showWhenSingleIcon="<%= true %>" triggerCssClass="btn kb-add-article-button">
			<liferay-ui:icon
				message="basic-article"
				url="<%= addBasicKBArticleURL %>"
			/>

			<%
			for (KBTemplate kbTemplate : kbTemplates) {
			%>

				<liferay-portlet:renderURL var="addKBArticleURL">
					<portlet:param name="mvcPath" value='<%= templatePath + "edit_article.jsp" %>' />
					<portlet:param name="redirect" value="<%= redirect %>" />
					<portlet:param name="kbTemplateId" value="<%= String.valueOf(kbTemplate.getKbTemplateId()) %>" />
				</liferay-portlet:renderURL>

				<liferay-ui:icon
					message="<%= HtmlUtil.escape(kbTemplate.getTitle()) %>"
					url="<%= addKBArticleURL %>"
				/>

			<%
			}
			%>

		</liferay-ui:icon-menu>
=======
		<aui:nav-item
			href="<%= addBasicKBArticleURL %>"
			iconCssClass="icon-file"
			label="add-article"
		/>
	</c:when>
	<c:otherwise>
		<aui:nav-item
			href="<%= addBasicKBArticleURL %>"
			iconCssClass="icon-file"
			label="basic-article"
		/>

		<%
		for (KBTemplate kbTemplate : kbTemplates) {
		%>

			<liferay-portlet:renderURL var="addKBArticleURL">
				<portlet:param name="mvcPath" value='<%= templatePath + "edit_article.jsp" %>' />
				<portlet:param name="redirect" value="<%= redirect %>" />
				<portlet:param name="parentResourceClassNameId" value="<%= String.valueOf(parentResourceClassNameId) %>" />
				<portlet:param name="parentResourcePrimKey" value="<%= String.valueOf(parentResourcePrimKey) %>" />
				<portlet:param name="kbTemplateId" value="<%= String.valueOf(kbTemplate.getKbTemplateId()) %>" />
			</liferay-portlet:renderURL>

			<aui:nav-item
				href="<%= addKBArticleURL %>"
				iconCssClass="icon-file"
				label="<%= HtmlUtil.escape(kbTemplate.getTitle()) %>"
			/>

		<%
		}
		%>

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	</c:otherwise>
</c:choose>