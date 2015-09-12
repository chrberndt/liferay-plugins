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

package com.liferay.knowledgebase.admin.lar;

import com.liferay.knowledgebase.model.KBTemplate;
import com.liferay.knowledgebase.service.KBTemplateLocalServiceUtil;
<<<<<<< HEAD
import com.liferay.knowledgebase.service.persistence.KBTemplateUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.BaseStagedModelDataHandler;
import com.liferay.portal.kernel.lar.ExportImportPathUtil;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.service.ServiceContext;
=======
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.exportimport.lar.BaseStagedModelDataHandler;
import com.liferay.portlet.exportimport.lar.ExportImportPathUtil;
import com.liferay.portlet.exportimport.lar.PortletDataContext;
import com.liferay.portlet.exportimport.lar.StagedModelModifiedDateComparator;

import java.util.List;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

/**
 * @author Daniel Kocsis
 */
public class KBTemplateStagedModelDataHandler
	extends BaseStagedModelDataHandler<KBTemplate> {

	public static final String[] CLASS_NAMES = {KBTemplate.class.getName()};

	@Override
<<<<<<< HEAD
	public void deleteStagedModel(
			String uuid, long groupId, String className, String extraData)
		throws PortalException, SystemException {

		KBTemplate kbTemplate =
			KBTemplateLocalServiceUtil.fetchKBTemplateByUuidAndGroupId(
				uuid, groupId);

		if (kbTemplate != null) {
			KBTemplateLocalServiceUtil.deleteKBTemplate(kbTemplate);
=======
	public void deleteStagedModel(KBTemplate kbTemplate)
		throws PortalException {

		KBTemplateLocalServiceUtil.deleteKBTemplate(kbTemplate);
	}

	@Override
	public void deleteStagedModel(
			String uuid, long groupId, String className, String extraData)
		throws PortalException {

		KBTemplate kbTemplate = fetchStagedModelByUuidAndGroupId(uuid, groupId);

		if (kbTemplate != null) {
			deleteStagedModel(kbTemplate);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
	}

	@Override
<<<<<<< HEAD
=======
	public KBTemplate fetchStagedModelByUuidAndGroupId(
		String uuid, long groupId) {

		return KBTemplateLocalServiceUtil.fetchKBTemplateByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public List<KBTemplate> fetchStagedModelsByUuidAndCompanyId(
		String uuid, long companyId) {

		return KBTemplateLocalServiceUtil.getKBTemplatesByUuidAndCompanyId(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			new StagedModelModifiedDateComparator<KBTemplate>());
	}

	@Override
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public String[] getClassNames() {
		return CLASS_NAMES;
	}

	@Override
	public String getDisplayName(KBTemplate kbTemplate) {
		return kbTemplate.getTitle();
	}

	@Override
	protected void doExportStagedModel(
			PortletDataContext portletDataContext, KBTemplate kbTemplate)
		throws Exception {

		Element kbTemplateElement = portletDataContext.getExportDataElement(
			kbTemplate);

		portletDataContext.addClassedModel(
			kbTemplateElement, ExportImportPathUtil.getModelPath(kbTemplate),
			kbTemplate);
	}

	@Override
	protected void doImportStagedModel(
			PortletDataContext portletDataContext, KBTemplate kbTemplate)
		throws Exception {

		long userId = portletDataContext.getUserId(kbTemplate.getUserUuid());

		ServiceContext serviceContext = portletDataContext.createServiceContext(
			kbTemplate);

		KBTemplate importedKBTemplate = null;

		if (portletDataContext.isDataStrategyMirror()) {
<<<<<<< HEAD
			KBTemplate existingKBTemplate = KBTemplateUtil.fetchByUUID_G(
=======
			KBTemplate existingKBTemplate = fetchStagedModelByUuidAndGroupId(
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				kbTemplate.getUuid(), portletDataContext.getScopeGroupId());

			if (existingKBTemplate == null) {
				serviceContext.setUuid(kbTemplate.getUuid());

				importedKBTemplate = KBTemplateLocalServiceUtil.addKBTemplate(
					userId, kbTemplate.getTitle(), kbTemplate.getContent(),
					serviceContext);
			}
			else {
				importedKBTemplate =
					KBTemplateLocalServiceUtil.updateKBTemplate(
						existingKBTemplate.getKbTemplateId(),
						kbTemplate.getTitle(), kbTemplate.getContent(),
						serviceContext);
			}
		}
		else {
			importedKBTemplate = KBTemplateLocalServiceUtil.addKBTemplate(
				userId, kbTemplate.getTitle(), kbTemplate.getContent(),
				serviceContext);
		}

		portletDataContext.importClassedModel(kbTemplate, importedKBTemplate);
	}

}