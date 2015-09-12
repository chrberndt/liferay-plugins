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

package com.liferay.pushnotifications.service.impl;

<<<<<<< HEAD
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.pushnotifications.model.PushNotificationsDevice;
=======
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.pushnotifications.PushNotificationsException;
import com.liferay.pushnotifications.model.PushNotificationsDevice;
import com.liferay.pushnotifications.sender.PushNotificationsSender;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.pushnotifications.service.base.PushNotificationsDeviceLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.Map;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

/**
 * @author Silvio Santos
 * @author Bruno Farache
 */
public class PushNotificationsDeviceLocalServiceImpl
	extends PushNotificationsDeviceLocalServiceBaseImpl {

	@Override
	public PushNotificationsDevice addPushNotificationsDevice(
<<<<<<< HEAD
			long userId, String platform, String token)
		throws SystemException {
=======
		long userId, String platform, String token) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

		long pushNotificationsDeviceId = counterLocalService.increment();

		PushNotificationsDevice pushNotificationsDevice =
			pushNotificationsDevicePersistence.create(
				pushNotificationsDeviceId);

		pushNotificationsDevice.setUserId(userId);
		pushNotificationsDevice.setCreateDate(new Date());
		pushNotificationsDevice.setPlatform(platform);
		pushNotificationsDevice.setToken(token);

		pushNotificationsDevicePersistence.update(pushNotificationsDevice);

		return pushNotificationsDevice;
	}

	@Override
	public PushNotificationsDevice deletePushNotificationsDevice(String token)
<<<<<<< HEAD
		throws PortalException, SystemException {
=======
		throws PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

		PushNotificationsDevice pushNotificationsDevice =
			pushNotificationsDevicePersistence.findByToken(token);

		pushNotificationsDevicePersistence.remove(pushNotificationsDevice);

		return pushNotificationsDevice;
	}

	@Override
<<<<<<< HEAD
	public List<String> getTokens(
			long userId, String platform, int start, int end)
		throws SystemException {

		List<String> tokens = new ArrayList<String>();

		List<PushNotificationsDevice> pushNotificationsDevices =
			pushNotificationsDevicePersistence.findByU_P(
				userId, platform, start, end);

		for (PushNotificationsDevice pushNotificationsDevice :
				pushNotificationsDevices) {

			tokens.add(pushNotificationsDevice.getToken());
		}

		return tokens;
	}

=======
	public List<PushNotificationsDevice> getPushNotificationsDevices(
		int start, int end, OrderByComparator orderByComparator) {

		return pushNotificationsDevicePersistence.findAll(
			start, end, orderByComparator);
	}

	@Override
	public void resetPushNotificationSenders() {
		for (Map.Entry<String, PushNotificationsSender> entry :
				_pushNotificationsSenders.entrySet()) {

			PushNotificationsSender pushNotificationsSender = entry.getValue();

			pushNotificationsSender.reset();
		}
	}

	@Override
	public void sendPushNotification(
			long[] toUserIds, JSONObject payloadJSONObject)
		throws PortalException {

		for (String platform : _pushNotificationsSenders.keySet()) {
			List<String> tokens = new ArrayList<>();

			List<PushNotificationsDevice> pushNotificationsDevices =
				pushNotificationsDevicePersistence.findByU_P(
					toUserIds, platform, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			for (PushNotificationsDevice pushNotificationsDevice :
					pushNotificationsDevices) {

				tokens.add(pushNotificationsDevice.getToken());
			}

			if (tokens.isEmpty()) {
				continue;
			}

			sendPushNotification(platform, tokens, payloadJSONObject);
		}
	}

	@Override
	public void sendPushNotification(
			String platform, List<String> tokens, JSONObject payloadJSONObject)
		throws PortalException {

		sendPushNotification(platform, tokens, payloadJSONObject, null);
	}

	@Override
	public void sendPushNotification(
			String platform, List<String> tokens, JSONObject payloadJSONObject,
			Map<String, Object> configuration)
		throws PortalException {

		PushNotificationsSender pushNotificationsSender =
			_pushNotificationsSenders.get(platform);

		if (pushNotificationsSender == null) {
			return;
		}

		if (configuration != null) {
			pushNotificationsSender = pushNotificationsSender.create(
				configuration);
		}

		try {
			pushNotificationsSender.send(platform, tokens, payloadJSONObject);
		}
		catch (PushNotificationsException pne) {
			if (_log.isWarnEnabled()) {
				_log.warn(pne.getMessage());
			}
		}
		catch (PortalException pe) {
			throw pe;
		}
		catch (Exception e) {
			throw new PortalException(e);
		}
	}

	@Override
	public void updateToken(String oldToken, String newToken)
		throws PortalException {

		PushNotificationsDevice oldPushNotificationsDevice =
			deletePushNotificationsDevice(oldToken);

		PushNotificationsDevice newPushNotificationsDevice =
			pushNotificationsDevicePersistence.fetchByToken(newToken);

		if (newPushNotificationsDevice == null) {
			addPushNotificationsDevice(
				oldPushNotificationsDevice.getUserId(),
				oldPushNotificationsDevice.getPlatform(), newToken);
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		PushNotificationsDeviceLocalServiceImpl.class);

	@BeanReference(name = "pushNotificationsSenders")
	private Map<String, PushNotificationsSender> _pushNotificationsSenders;

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}