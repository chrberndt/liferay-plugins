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
int status = (Integer)request.getAttribute(WebKeys.KNOWLEDGE_BASE_STATUS);

KBArticle kbArticle = (KBArticle)request.getAttribute(WebKeys.KNOWLEDGE_BASE_KB_ARTICLE);

List<KBArticle> childKBArticles = KBArticleServiceUtil.getKBArticles(scopeGroupId, kbArticle.getResourcePrimKey(), status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, new KBArticlePriorityComparator(true));
=======
KBArticle kbArticle = (KBArticle)request.getAttribute(WebKeys.KNOWLEDGE_BASE_KB_ARTICLE);

int status = (Integer)request.getAttribute(WebKeys.KNOWLEDGE_BASE_STATUS);

List<KBArticle> childKBArticles = KBArticleServiceUtil.getKBArticles(scopeGroupId, kbArticle.getResourcePrimKey(), status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, new KBArticlePriorityComparator(true));

KBArticleURLHelper kbArticleURLHelper = new KBArticleURLHelper(renderRequest, renderResponse, templatePath);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
%>

<c:if test="<%= !childKBArticles.isEmpty() %>">
	<div class="kb-article-child">
		<div class="kb-elements">

			<%
			for (KBArticle childrenKBArticle : childKBArticles) {
			%>

<<<<<<< HEAD
				<div class="kb-element-header">
					<liferay-portlet:renderURL var="viewKBArticleURL">
						<portlet:param name="mvcPath" value='<%= templatePath + "view_article.jsp" %>' />
						<portlet:param name="resourcePrimKey" value="<%= String.valueOf(childrenKBArticle.getResourcePrimKey()) %>" />
						<portlet:param name="status" value="<%= String.valueOf(status) %>" />
					</liferay-portlet:renderURL>

					<liferay-ui:icon
						image="../trees/page"
						label="<%= true %>"
						message="<%= childrenKBArticle.getTitle() %>"
						method="get"
						url="<%= viewKBArticleURL %>"
					/>
				</div>
				<div class="kb-element-body">

					<%
					request.setAttribute("article_icons.jsp-kb_article", childrenKBArticle);
					%>

					<liferay-util:include page="/admin/article_icons.jsp" servletContext="<%= application %>" />

					<c:choose>
						<c:when test="<%= Validator.isNotNull(childrenKBArticle.getDescription()) %>">
							<%= childrenKBArticle.getDescription() %>
						</c:when>
						<c:otherwise>
							<%= StringUtil.shorten(HtmlUtil.extractText(childrenKBArticle.getContent()), 500) %>
						</c:otherwise>
					</c:choose>
				</div>
=======
				<section class="kb-element">
					<h2 class="kb-element-header">

						<%
						PortletURL viewKBArticleURL = null;

						if (rootPortletId.equals(PortletKeys.KNOWLEDGE_BASE_SECTION)) {
							viewKBArticleURL = kbArticleURLHelper.createViewWithRedirectURL(childrenKBArticle, currentURL);
						}
						else {
							viewKBArticleURL = kbArticleURLHelper.createViewURL(childrenKBArticle);
						}
						%>

						<aui:a href="<%= viewKBArticleURL.toString() %>"><%= childrenKBArticle.getTitle() %></aui:a>
					</h2>

					<div class="kb-element-body">
						<c:choose>
							<c:when test="<%= Validator.isNotNull(childrenKBArticle.getDescription()) %>">
								<%= childrenKBArticle.getDescription() %>
							</c:when>
							<c:otherwise>
								<p><%= StringUtil.shorten(HtmlUtil.extractText(childrenKBArticle.getContent()), 200) %></p>

								<aui:a href="<%= viewKBArticleURL.toString() %>"><liferay-ui:message key="read-more" /></aui:a>
							</c:otherwise>
						</c:choose>
					</div>
				</section>
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

			<%
			}
			%>

		</div>
	</div>
</c:if>