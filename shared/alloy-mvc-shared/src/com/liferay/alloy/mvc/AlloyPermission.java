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

package com.liferay.alloy.mvc;

import com.liferay.portal.NoSuchResourceActionException;
<<<<<<< HEAD
=======
import com.liferay.portal.kernel.bean.BeanPropertiesUtil;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
<<<<<<< HEAD
=======
import com.liferay.portal.model.BaseModel;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.ResourceActionsUtil;
import com.liferay.portal.theme.PortletDisplay;
import com.liferay.portal.theme.ThemeDisplay;

/**
 * @author Ethan Bustad
 */
public class AlloyPermission {

	public static void check(
<<<<<<< HEAD
			PermissionChecker permissionChecker, long groupId, String portletId,
			String controller, String actionId)
		throws PortalException {

		if (!contains(
				permissionChecker, groupId, portletId, controller, actionId)) {

=======
			PermissionChecker permissionChecker, long groupId, String name,
			long primKey, String actionId)
		throws PortalException {

		if (!contains(permissionChecker, groupId, name, primKey, actionId)) {
			throw new PrincipalException();
		}
	}

	public static void check(
			ThemeDisplay themeDisplay, BaseModel<?> baseModel, String action)
		throws PortalException {

		if (!contains(themeDisplay, baseModel, action)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			throw new PrincipalException();
		}
	}

	public static void check(
<<<<<<< HEAD
			ThemeDisplay themeDisplay, String controller, String actionId)
		throws PortalException {

		if (!contains(themeDisplay, controller, actionId)) {
=======
			ThemeDisplay themeDisplay, String controller, String action)
		throws PortalException {

		if (!contains(themeDisplay, controller, action)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			throw new PrincipalException();
		}
	}

	public static boolean contains(
<<<<<<< HEAD
		PermissionChecker permissionChecker, long groupId, String portletId,
		String controller, String actionId) {

		actionId =
			_formatActionId(actionId) + StringPool.POUND +
				StringUtil.toUpperCase(controller);

		try {
			ResourceActionsUtil.checkAction(portletId, actionId);
		}
		catch (NoSuchResourceActionException e) {
			return true;
		}

		return permissionChecker.hasPermission(
			groupId, portletId, groupId, actionId);
	}

	public static boolean contains(
		ThemeDisplay themeDisplay, String controller, String actionId) {

		PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

		return contains(
			themeDisplay.getPermissionChecker(), themeDisplay.getScopeGroupId(),
			portletDisplay.getRootPortletId(), controller, actionId);
	}

	private static String _formatActionId(String actionId) {
		StringBuilder sb = new StringBuilder(StringUtil.toUpperCase(actionId));

		for (int i = 0; i < actionId.length(); i++) {
			char c = actionId.charAt(i);

			if (Character.isUpperCase(c) && (i > 0)) {
				int delta = sb.length() - actionId.length();
=======
		PermissionChecker permissionChecker, long groupId, String name,
		long primKey, String actionId) {

		return contains(permissionChecker, groupId, name, primKey, actionId, 0);
	}

	public static boolean contains(
		PermissionChecker permissionChecker, long groupId, String name,
		long primKey, String actionId, long ownerId) {

		try {
			ResourceActionsUtil.checkAction(name, actionId);
		}
		catch (NoSuchResourceActionException nsrae) {
			return true;
		}

		if (name.indexOf(CharPool.PERIOD) != -1) {
			if (ownerId <= 0) {
				ownerId = getOwnerId(name, primKey);
			}

			if (permissionChecker.hasOwnerPermission(
					permissionChecker.getCompanyId(), name, primKey, ownerId,
					actionId)) {

				return true;
			}
		}

		return permissionChecker.hasPermission(
			groupId, name, primKey, actionId);
	}

	public static boolean contains(
		ThemeDisplay themeDisplay, BaseModel<?> baseModel, String action) {

		return contains(
			themeDisplay.getPermissionChecker(), themeDisplay.getScopeGroupId(),
			BeanPropertiesUtil.getString(baseModel, "modelClassName"),
			(Long)baseModel.getPrimaryKeyObj(), StringUtil.toUpperCase(action));
	}

	public static boolean contains(
		ThemeDisplay themeDisplay, String controller, String action) {

		PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

		String actionId = formatActionId(controller, action);

		return contains(
			themeDisplay.getPermissionChecker(), themeDisplay.getScopeGroupId(),
			portletDisplay.getRootPortletId(), themeDisplay.getScopeGroupId(),
			actionId);
	}

	protected static String formatActionId(String controller, String action) {
		StringBuilder sb = new StringBuilder(StringUtil.toUpperCase(action));

		for (int i = 0; i < action.length(); i++) {
			char c = action.charAt(i);

			if (Character.isUpperCase(c) && (i > 0)) {
				int delta = sb.length() - action.length();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

				sb.insert(i + delta, CharPool.UNDERLINE);
			}
		}

<<<<<<< HEAD
		return sb.toString();
	}

=======
		sb.append(StringPool.POUND);
		sb.append(StringUtil.toUpperCase(controller));

		return sb.toString();
	}

	protected static long getOwnerId(String className, long classPK) {
		BaseModel<?> baseModel = null;

		try {
			AlloyServiceInvoker alloyServiceInvoker = new AlloyServiceInvoker(
				className);

			baseModel = alloyServiceInvoker.fetchModel(classPK);
		}
		catch (Exception e) {
		}

		return BeanPropertiesUtil.getLongSilent(baseModel, "userId");
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}