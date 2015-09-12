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

package com.liferay.pushnotifications.messaging;

<<<<<<< HEAD
import com.liferay.portal.kernel.dao.orm.QueryUtil;
=======
import com.liferay.portal.kernel.json.JSONArray;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
<<<<<<< HEAD
import com.liferay.pushnotifications.sender.PushNotificationsSender;
import com.liferay.pushnotifications.service.PushNotificationsDeviceLocalServiceUtil;

import java.util.List;
import java.util.Map;
=======
import com.liferay.pushnotifications.service.PushNotificationsDeviceLocalServiceUtil;
import com.liferay.pushnotifications.util.PushNotificationsConstants;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

/**
 * @author Silvio Santos
 * @author Bruno Farache
 */
public class PushNotificationsMessageListener implements MessageListener {

<<<<<<< HEAD
	public Map<String, PushNotificationsSender> getPushNotificationsSenders() {
		return _pushNotificationsSenders;
	}

	@Override
	public void receive(Message message) {
		JSONObject jsonObject = (JSONObject)message.getPayload();

		long userId = jsonObject.getLong("userId");

		if (_log.isDebugEnabled()) {
			_log.debug(
				"Received message " + jsonObject + " for user " + userId);
		}

		try {
			for (Map.Entry<String, PushNotificationsSender> entry :
					_pushNotificationsSenders.entrySet()) {

				String platform = entry.getKey();

				List<String> tokens =
					PushNotificationsDeviceLocalServiceUtil.getTokens(
						userId, platform, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

				if (tokens.isEmpty()) {
					continue;
				}

				PushNotificationsSender pushNotificationsSender =
					entry.getValue();

				pushNotificationsSender.send(tokens, jsonObject);
			}
=======
	@Override
	public void receive(Message message) {
		JSONObject payloadJSONObject = (JSONObject)message.getPayload();

		JSONArray toUserIdsJSONArray = payloadJSONObject.getJSONArray(
			PushNotificationsConstants.KEY_TO_USER_IDS);

		long[] toUserIds = new long[toUserIdsJSONArray.length()];

		for (int i = 0; i < toUserIdsJSONArray.length(); i++) {
			toUserIds[i] = toUserIdsJSONArray.getLong(i);
		}

		payloadJSONObject.remove(PushNotificationsConstants.KEY_TO_USER_IDS);

		try {
			PushNotificationsDeviceLocalServiceUtil.sendPushNotification(
				toUserIds, payloadJSONObject);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Exception e) {
			_log.error("Unable to send notification", e);
		}
	}

<<<<<<< HEAD
	public void setPushNotificationsSenders(
		Map<String, PushNotificationsSender> pushNotificationSenders) {

		_pushNotificationsSenders = pushNotificationSenders;
	}

	private static Log _log = LogFactoryUtil.getLog(
		PushNotificationsMessageListener.class);

	private Map<String, PushNotificationsSender> _pushNotificationsSenders;

=======
	private static Log _log = LogFactoryUtil.getLog(
		PushNotificationsMessageListener.class);

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}