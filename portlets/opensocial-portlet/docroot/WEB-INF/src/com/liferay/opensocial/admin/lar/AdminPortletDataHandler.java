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

package com.liferay.opensocial.admin.lar;

import com.liferay.opensocial.model.Gadget;
import com.liferay.opensocial.model.impl.GadgetImpl;
import com.liferay.opensocial.service.GadgetLocalServiceUtil;
import com.liferay.opensocial.service.permission.GadgetPermission;
<<<<<<< HEAD
import com.liferay.opensocial.service.persistence.GadgetExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.lar.BasePortletDataHandler;
import com.liferay.portal.kernel.lar.DataLevel;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.xml.Element;
=======
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portlet.exportimport.lar.BasePortletDataHandler;
import com.liferay.portlet.exportimport.lar.DataLevel;
import com.liferay.portlet.exportimport.lar.PortletDataContext;
import com.liferay.portlet.exportimport.lar.StagedModelDataHandlerUtil;
import com.liferay.portlet.exportimport.lar.StagedModelType;
import com.liferay.portlet.exportimport.xstream.XStreamAliasRegistryUtil;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

import java.util.List;

import javax.portlet.PortletPreferences;

/**
 * @author Michael C. Han
 */
public class AdminPortletDataHandler extends BasePortletDataHandler {

	public AdminPortletDataHandler() {
		setDataLevel(DataLevel.PORTAL);
		setDeletionSystemEventStagedModelTypes(
			new StagedModelType(Gadget.class));
		setPublishToLiveByDefault(true);

		XStreamAliasRegistryUtil.register(GadgetImpl.class, "Gadget");
	}

	@Override
	protected PortletPreferences doDeleteData(
			PortletDataContext portletDataContext, String portletId,
			PortletPreferences portletPreferences)
		throws Exception {

		if (portletDataContext.addPrimaryKey(
				AdminPortletDataHandler.class, "deleteData")) {

			return portletPreferences;
		}

		GadgetLocalServiceUtil.deleteGadgets(portletDataContext.getCompanyId());

		return portletPreferences;
	}

	@Override
	protected String doExportData(
			final PortletDataContext portletDataContext, String portletId,
			PortletPreferences portletPreferences)
		throws Exception {

		Element rootElement = addExportDataRootElement(portletDataContext);

		portletDataContext.addPortletPermissions(
			GadgetPermission.RESOURCE_NAME);

		rootElement.addAttribute(
			"group-id", String.valueOf(portletDataContext.getScopeGroupId()));

		ActionableDynamicQuery actionableDynamicQuery =
<<<<<<< HEAD
			new GadgetExportActionableDynamicQuery(portletDataContext);
=======
			GadgetLocalServiceUtil.getExportActionableDynamicQuery(
				portletDataContext);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

		actionableDynamicQuery.performActions();

		return getExportDataRootElementString(rootElement);
	}

	@Override
	protected PortletPreferences doImportData(
			PortletDataContext portletDataContext, String portletId,
			PortletPreferences portletPreferences, String data)
		throws Exception {

		portletDataContext.importPortletPermissions(
			GadgetPermission.RESOURCE_NAME);
<<<<<<< HEAD

		Element gadgetsElement = portletDataContext.getImportDataGroupElement(
			Gadget.class);

		List<Element> gadgetElements = gadgetsElement.elements();

=======

		Element gadgetsElement = portletDataContext.getImportDataGroupElement(
			Gadget.class);

		List<Element> gadgetElements = gadgetsElement.elements();

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		for (Element gadgetElement : gadgetElements) {
			StagedModelDataHandlerUtil.importStagedModel(
				portletDataContext, gadgetElement);
		}

		return null;
	}

	@Override
	protected void doPrepareManifestSummary(
			PortletDataContext portletDataContext,
			PortletPreferences portletPreferences)
		throws Exception {

		ActionableDynamicQuery actionableDynamicQuery =
<<<<<<< HEAD
			new GadgetExportActionableDynamicQuery(portletDataContext);
=======
			GadgetLocalServiceUtil.getExportActionableDynamicQuery(
				portletDataContext);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

		actionableDynamicQuery.performCount();
	}

}