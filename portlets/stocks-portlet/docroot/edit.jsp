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

<%@ include file="/init.jsp" %>

<%
String symbolsString = StringUtil.merge(symbols, StringPool.SPACE);

symbols = StringUtil.split(ParamUtil.getString(request, "symbols", symbolsString), StringPool.SPACE);

symbolsString = StringUtil.merge(symbols, StringPool.SPACE);
%>

<portlet:actionURL var="portletURL" />

<<<<<<< HEAD
<aui:form action="<%= portletURL %>" method="post" name="fm" onSubmit="submitForm(document.<portlet:namespace />fm);">
=======
<aui:form action="<%= portletURL %>" method="post" name="fm" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "saveForm();" %>'>
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

	<liferay-ui:error exception="<%= ValidatorException.class %>">

		<%
		ValidatorException ve = (ValidatorException)errorException;
		%>

		<liferay-ui:message key="the-following-are-invalid-symbols" />

		<%
		Enumeration enu = ve.getFailedKeys();

		while (enu.hasMoreElements()) {
			String symbol = (String)enu.nextElement();
		%>

			<strong><%= symbol %></strong><%= (enu.hasMoreElements()) ? ", " : "." %>
<<<<<<< HEAD

		<%
		}
		%>

	</liferay-ui:error>

	<aui:input label="add-all-ticker-symbols-separated-by-spaces" name="symbols" type="textarea" value="<%= symbolsString %>" />

=======

		<%
		}
		%>

	</liferay-ui:error>

	<aui:input label="add-all-ticker-symbols-separated-by-spaces" name="symbols" type="textarea" value="<%= symbolsString %>" />

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>
</aui:form>
<<<<<<< HEAD
=======

<aui:script>
	function <portlet:namespace />saveForm() {
		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

<c:if test="<%= windowState.equals(WindowState.MAXIMIZED) %>">
	<aui:script>
		Liferay.Util.focusFormField(document.<portlet:namespace />fm.<portlet:namespace />symbols);
	</aui:script>
</c:if>