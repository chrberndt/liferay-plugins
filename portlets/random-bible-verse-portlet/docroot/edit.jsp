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
Map<String, Bible> bibles = RBVUtil.getBibles();
%>

<portlet:actionURL var="updateURL" />

<<<<<<< HEAD
<aui:form action="<%= updateURL %>" method="post" name="fm" onSubmit="submitForm(document.<portlet:namespace />fm);">
=======
<aui:form action="<%= updateURL %>" method="post" name="fm" onSubmit='<%= "event.preventDefault(); " + renderResponse.getNamespace() + "saveForm();" %>'>
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

	<aui:select inlineLabel="true" name="language">
		<aui:option label="default-language" selected='<%= language.equals("") %>' value="" />

		<%
		for (Map.Entry<String, Bible> entry : bibles.entrySet()) {
			Bible bible = entry.getValue();
		%>

			<aui:option label="<%= StringUtil.toLowerCase(bible.getLanguageName()) %>" selected="<%= language.equals(bible.getLanguage()) %>" value="<%= bible.getLanguage() %>" />

		<%
		}
		%>

	</aui:select>

	<aui:button-row>
		<aui:button type="submit" value="save" />
	</aui:button-row>
<<<<<<< HEAD
</aui:form>
=======
</aui:form>

<aui:script>
	function <portlet:namespace />saveForm() {
		submitForm(document.<portlet:namespace />fm);
	}
</aui:script>
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
