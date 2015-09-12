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

package com.liferay.pushnotifications.sender.apple;

<<<<<<< HEAD
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.pushnotifications.sender.PushNotificationsSender;
import com.liferay.pushnotifications.util.PortletPropsValues;
=======
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.MapUtil;
import com.liferay.portal.kernel.util.PrefsPropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.pushnotifications.PushNotificationsException;
import com.liferay.pushnotifications.sender.PushNotificationsSender;
import com.liferay.pushnotifications.util.PortletPropsKeys;
import com.liferay.pushnotifications.util.PortletPropsValues;
import com.liferay.pushnotifications.util.PushNotificationsConstants;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;
import com.notnoop.apns.ApnsServiceBuilder;
import com.notnoop.apns.PayloadBuilder;

<<<<<<< HEAD
import java.util.List;
=======
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

/**
 * @author Silvio Santos
 * @author Bruno Farache
 */
public class ApplePushNotificationsSender implements PushNotificationsSender {

	public ApplePushNotificationsSender() {
<<<<<<< HEAD
		ApnsServiceBuilder appleServiceBuilder = APNS.newService();

		appleServiceBuilder.withCert(
			PortletPropsValues.APPLE_CERTIFICATE_PATH,
			PortletPropsValues.APPLE_CERTIFICATE_PASSWORD);

		if (PortletPropsValues.APPLE_SANDBOX) {
			appleServiceBuilder.withSandboxDestination();
		}

		_apnsService = appleServiceBuilder.build();
	}

	@Override
	public void send(List<String> tokens, JSONObject jsonObject)
		throws Exception {

		String payload = buildPayload(jsonObject);

		_apnsService.push(tokens, payload);
	}

	protected String buildPayload(JSONObject jsonObject) {
		PayloadBuilder builder = PayloadBuilder.newPayload();

		String entryTitle = jsonObject.getString("entryTitle");

		if (entryTitle != null) {
			builder.alertBody(entryTitle);
		}

		return builder.build();
	}

	private ApnsService _apnsService;
=======
	}

	public ApplePushNotificationsSender(
		String certificatePath, String certificatePassword, Boolean sandbox) {

		_certificatePath = certificatePath;
		_certificatePassword = certificatePassword;
		_sandbox = sandbox;
	}

	@Override
	public PushNotificationsSender create(Map<String, Object> configuration) {
		String certificatePath = MapUtil.getString(
			configuration, PortletPropsKeys.APPLE_CERTIFICATE_PATH, null);
		String certificatePassword = MapUtil.getString(
			configuration, PortletPropsKeys.APPLE_CERTIFICATE_PASSWORD, null);
		Boolean sandbox = (Boolean)configuration.get(
			PortletPropsKeys.APPLE_SANDBOX);

		return new ApplePushNotificationsSender(
			certificatePath, certificatePassword, sandbox);
	}

	public String getCertificatePassword() {
		if (Validator.isNull(_certificatePassword)) {
			_certificatePassword = PrefsPropsUtil.getString(
				PortletPropsKeys.APPLE_CERTIFICATE_PASSWORD,
				PortletPropsValues.APPLE_CERTIFICATE_PASSWORD);
		}

		return _certificatePassword;
	}

	public String getCertificatePath() {
		if (Validator.isNull(_certificatePath)) {
			_certificatePath = PrefsPropsUtil.getString(
				PortletPropsKeys.APPLE_CERTIFICATE_PATH,
				PortletPropsValues.APPLE_CERTIFICATE_PATH);
		}

		return _certificatePath;
	}

	public boolean isSandbox() {
		if (_sandbox == null) {
			_sandbox = PrefsPropsUtil.getBoolean(
				PortletPropsKeys.APPLE_SANDBOX,
				PortletPropsValues.APPLE_SANDBOX);
		}

		return _sandbox;
	}

	@Override
	public synchronized void reset() {
		_apnsService = null;
		_certificatePassword = null;
		_certificatePath = null;
		_sandbox = null;
	}

	@Override
	public void send(
			String platform, List<String> tokens, JSONObject payloadJSONObject)
		throws Exception {

		ApnsService apnsService = getApnsService();

		if (apnsService == null) {
			return;
		}

		String payload = buildPayload(payloadJSONObject);

		apnsService.push(tokens, payload);
	}

	public void setCertificatePassword(String certificatePassword) {
		_certificatePassword = certificatePassword;
	}

	public void setCertificatePath(String certificatePath) {
		_certificatePath = certificatePath;
	}

	public void setSandbox(boolean sandbox) {
		_sandbox = sandbox;
	}

	protected String buildPayload(JSONObject payloadJSONObject) {
		PayloadBuilder builder = PayloadBuilder.newPayload();

		String body = payloadJSONObject.getString(
			PushNotificationsConstants.KEY_BODY);

		if (Validator.isNotNull(body)) {
			builder.alertBody(body);
		}

		String bodyLocalizedKey = payloadJSONObject.getString(
			PushNotificationsConstants.KEY_BODY_LOCALIZED);

		if (Validator.isNotNull(bodyLocalizedKey)) {
			builder.localizedKey(bodyLocalizedKey);
		}

		JSONArray bodyLocalizedArgumentsJSONArray =
			payloadJSONObject.getJSONArray(
				PushNotificationsConstants.KEY_BODY_LOCALIZED_ARGUMENTS);

		if (bodyLocalizedArgumentsJSONArray != null) {
			List<String> localizedArguments = new ArrayList<>();

			for (int i = 0; i < bodyLocalizedArgumentsJSONArray.length(); i++) {
				localizedArguments.add(
					bodyLocalizedArgumentsJSONArray.getString(i));
			}

			builder.localizedArguments(localizedArguments);
		}

		String sound = payloadJSONObject.getString(
			PushNotificationsConstants.KEY_SOUND);

		if (Validator.isNotNull(sound)) {
			builder.sound(sound);
		}

		payloadJSONObject.remove(PushNotificationsConstants.KEY_BODY);
		payloadJSONObject.remove(PushNotificationsConstants.KEY_BODY_LOCALIZED);
		payloadJSONObject.remove(
			PushNotificationsConstants.KEY_BODY_LOCALIZED_ARGUMENTS);
		payloadJSONObject.remove(PushNotificationsConstants.KEY_SOUND);

		builder.customField(
			PushNotificationsConstants.KEY_PAYLOAD,
			payloadJSONObject.toString());

		return builder.build();
	}

	protected synchronized ApnsService getApnsService() throws Exception {
		if (_apnsService == null) {
			ApnsServiceBuilder appleServiceBuilder = APNS.newService();

			String certificatePath = getCertificatePath();

			if (Validator.isNull(certificatePath)) {
				throw new PushNotificationsException(
					"The property \"apple.certificate.path\" is not set in " +
						"portlet.properties");
			}

			InputStream is = null;

			try {
				is = new FileInputStream(certificatePath);
			}
			catch (FileNotFoundException fnfe) {
				Class<?> clazz = getClass();

				ClassLoader classLoader = clazz.getClassLoader();

				is = classLoader.getResourceAsStream(certificatePath);
			}

			if (is == null) {
				throw new PushNotificationsException(
					"Apple certificate does not exist at " + certificatePath);
			}

			String certificatePassword = getCertificatePassword();

			if (Validator.isNull(certificatePassword)) {
				throw new PushNotificationsException(
					"The property \"apple.certificate.password\" is not set " +
						"in portlet.properties");
			}

			appleServiceBuilder.withCert(is, certificatePassword);

			if (isSandbox()) {
				appleServiceBuilder.withSandboxDestination();
			}
			else {
				appleServiceBuilder.withProductionDestination();
			}

			_apnsService = appleServiceBuilder.build();
		}

		return _apnsService;
	}

	private ApnsService _apnsService;
	private String _certificatePassword;
	private String _certificatePath;
	private Boolean _sandbox;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

}