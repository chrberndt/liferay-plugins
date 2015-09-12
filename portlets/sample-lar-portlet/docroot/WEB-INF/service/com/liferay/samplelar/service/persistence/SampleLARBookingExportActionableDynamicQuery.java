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

package com.liferay.samplelar.service.persistence;

<<<<<<< HEAD
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.ExportImportHelperUtil;
import com.liferay.portal.kernel.lar.ManifestSummary;
import com.liferay.portal.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.util.PortalUtil;

=======
import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.exportimport.lar.ExportImportHelperUtil;
import com.liferay.portlet.exportimport.lar.ManifestSummary;
import com.liferay.portlet.exportimport.lar.PortletDataContext;
import com.liferay.portlet.exportimport.lar.StagedModelDataHandlerUtil;
import com.liferay.portlet.exportimport.lar.StagedModelType;

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.samplelar.model.SampleLARBooking;

/**
 * @author Mate Thurzo
<<<<<<< HEAD
 * @generated
 */
public class SampleLARBookingExportActionableDynamicQuery
	extends SampleLARBookingActionableDynamicQuery {
	public SampleLARBookingExportActionableDynamicQuery(
		PortletDataContext portletDataContext) throws SystemException {
=======
 * @deprecated As of 7.0.0, replaced by {@link com.liferay.samplelar.service.SampleLARBookingLocalServiceUtil#getExportActionableDynamicQuery(PortletDataContext)}
 * @generated
 */
@Deprecated
@ProviderType
public class SampleLARBookingExportActionableDynamicQuery
	extends SampleLARBookingActionableDynamicQuery {
	public SampleLARBookingExportActionableDynamicQuery(
		PortletDataContext portletDataContext) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		_portletDataContext = portletDataContext;

		setCompanyId(_portletDataContext.getCompanyId());

		setGroupId(_portletDataContext.getScopeGroupId());
	}

	@Override
<<<<<<< HEAD
	public long performCount() throws PortalException, SystemException {
=======
	public long performCount() throws PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		ManifestSummary manifestSummary = _portletDataContext.getManifestSummary();

		StagedModelType stagedModelType = getStagedModelType();

		long modelAdditionCount = super.performCount();

		manifestSummary.addModelAdditionCount(stagedModelType.toString(),
			modelAdditionCount);

		long modelDeletionCount = ExportImportHelperUtil.getModelDeletionCount(_portletDataContext,
				stagedModelType);

		manifestSummary.addModelDeletionCount(stagedModelType.toString(),
			modelDeletionCount);

		return modelAdditionCount;
	}

	@Override
	protected void addCriteria(DynamicQuery dynamicQuery) {
		_portletDataContext.addDateRangeCriteria(dynamicQuery, "modifiedDate");
	}

	protected StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				SampleLARBooking.class.getName()));
	}

	@Override
<<<<<<< HEAD
	@SuppressWarnings("unused")
	protected void performAction(Object object)
		throws PortalException, SystemException {
=======
	protected void performAction(Object object) throws PortalException {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		SampleLARBooking stagedModel = (SampleLARBooking)object;

		StagedModelDataHandlerUtil.exportStagedModel(_portletDataContext,
			stagedModel);
	}

	private PortletDataContext _portletDataContext;
}