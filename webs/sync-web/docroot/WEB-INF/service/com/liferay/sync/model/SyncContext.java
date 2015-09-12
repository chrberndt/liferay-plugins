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

package com.liferay.sync.model;

import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.model.Group;
<<<<<<< HEAD

import java.util.List;
=======
import com.liferay.portal.model.User;

import java.util.List;
import java.util.Map;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

/**
 * @author Dennis Ju
 */
@JSON
public class SyncContext {

<<<<<<< HEAD
=======
	public String getAuthType() {
		return _authType;
	}

	public String getOAuthConsumerKey() {
		return _oAuthConsumerKey;
	}

	public String getOAuthConsumerSecret() {
		return _oAuthConsumerSecret;
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public String getPluginVersion() {
		return _pluginVersion;
	}

	public int getPortalBuildNumber() {
		return _portalBuildNumber;
	}

<<<<<<< HEAD
	public long getUserId() {
		return _userId;
=======
	@JSON
	public Map<String, String> getPortletPreferencesMap() {
		return _portletPreferencesMap;
	}

	@JSON
	public User getUser() {
		return _user;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@JSON
	public List<Group> getUserSitesGroups() {
		return _userSitesGroups;
	}

<<<<<<< HEAD
=======
	public boolean isOAuthEnabled() {
		return _oAuthEnabled;
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public boolean isSocialOfficeInstalled() {
		return _socialOfficeInstalled;
	}

<<<<<<< HEAD
=======
	public void setAuthType(String authType) {
		_authType = authType;
	}

	public void setOAuthConsumerKey(String oAuthConsumerKey) {
		_oAuthConsumerKey = oAuthConsumerKey;
	}

	public void setOAuthConsumerSecret(String oAuthConsumerSecret) {
		_oAuthConsumerSecret = oAuthConsumerSecret;
	}

	public void setOAuthEnabled(boolean oAuthEnabled) {
		_oAuthEnabled = oAuthEnabled;
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public void setPluginVersion(String pluginVersion) {
		_pluginVersion = pluginVersion;
	}

	public void setPortalBuildNumber(int portalBuildNumber) {
		_portalBuildNumber = portalBuildNumber;
	}

<<<<<<< HEAD
=======
	public void setPortletPreferencesMap(
		Map<String, String> portletPreferencesMap) {

		_portletPreferencesMap = portletPreferencesMap;
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public void setSocialOfficeInstalled(boolean socialOfficeInstalled) {
		_socialOfficeInstalled = socialOfficeInstalled;
	}

<<<<<<< HEAD
	public void setUserId(long userId) {
		_userId = userId;
=======
	public void setUser(User user) {
		_user = user;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	public void setUserSitesGroups(List<Group> userSitesGroups) {
		_userSitesGroups = userSitesGroups;
	}

<<<<<<< HEAD
	private String _pluginVersion;
	private int _portalBuildNumber;
	private boolean _socialOfficeInstalled;
	private long _userId;
=======
	private String _authType;
	private String _oAuthConsumerKey;
	private String _oAuthConsumerSecret;
	private boolean _oAuthEnabled;
	private String _pluginVersion;
	private int _portalBuildNumber;
	private Map<String, String> _portletPreferencesMap;
	private boolean _socialOfficeInstalled;
	private User _user;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private List<Group> _userSitesGroups;

}