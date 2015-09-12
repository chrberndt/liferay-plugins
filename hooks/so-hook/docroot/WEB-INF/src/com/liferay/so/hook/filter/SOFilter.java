/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This file is part of Liferay Social Office. Liferay Social Office is free
 * software: you can redistribute it and/or modify it under the terms of the GNU
 * Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Liferay Social Office is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Liferay Social Office. If not, see http://www.gnu.org/licenses/agpl-3.0.html.
 */

package com.liferay.so.hook.filter;

<<<<<<< HEAD
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
=======
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.BaseFilter;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import com.liferay.so.util.PortletPropsValues;

import javax.servlet.FilterChain;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Sherry Yang
 */
<<<<<<< HEAD
public class SOFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(
			ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain filterChain)
		throws IOException, ServletException {

		try {
			HttpServletRequest request = (HttpServletRequest)servletRequest;

			User user = PortalUtil.getUser(request);

			if ((user == null) || !user.hasPrivateLayouts()) {
				filterChain.doFilter(servletRequest, servletResponse);
=======
public class SOFilter extends BaseFilter {

	@Override
	public boolean isFilterEnabled(
		HttpServletRequest request, HttpServletResponse response) {

		try {
			User user = PortalUtil.getUser(request);

			if (user == null) {
				return false;
			}
		}
		catch (Exception e) {
			if (_log.isWarnEnabled()) {
				_log.warn(e, e);
			}

			return false;
		}

		String uri = request.getRequestURI();

		if (uri.equals("/user") ||
			uri.equals(PortletPropsValues.LOGIN_REDIRECT)) {

			return true;
		}

		return false;
	}

	@Override
	protected Log getLog() {
		return _log;
	}

	@Override
	protected void processFilter(
			HttpServletRequest request, HttpServletResponse response,
			FilterChain filterChain)
		throws Exception {

		try {
			User user = PortalUtil.getUser(request);

			if ((user == null) || !user.hasPrivateLayouts()) {
				filterChain.doFilter(request, response);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

				return;
			}

			String portalURL = PortalUtil.getPortalURL(
				request, PortalUtil.isSecure(request));

			String redirect = user.getDisplayURL(
				portalURL, PortalUtil.getPathMain(), true);

<<<<<<< HEAD
			HttpServletResponse response = (HttpServletResponse)servletResponse;

			response.sendRedirect(redirect);
		}
		catch (Exception e) {
			filterChain.doFilter(servletRequest, servletResponse);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
=======
			response.sendRedirect(redirect);
		}
		catch (Exception e) {
			filterChain.doFilter(request, response);
		}
	}

	private static Log _log = LogFactoryUtil.getLog(SOFilter.class);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

}