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

package com.liferay.knowledgebase.section.portlet;

import com.liferay.knowledgebase.NoSuchArticleException;
import com.liferay.knowledgebase.NoSuchCommentException;
import com.liferay.knowledgebase.model.KBArticle;
import com.liferay.knowledgebase.model.KBFolderConstants;
import com.liferay.knowledgebase.portlet.BaseKBPortlet;
import com.liferay.knowledgebase.service.KBArticleLocalServiceUtil;
import com.liferay.knowledgebase.service.KBArticleServiceUtil;
import com.liferay.knowledgebase.service.permission.KBArticlePermission;
import com.liferay.knowledgebase.util.ActionKeys;
import com.liferay.knowledgebase.util.WebKeys;
import com.liferay.portal.NoSuchSubscriptionException;
import com.liferay.portal.kernel.exception.PortalException;
<<<<<<< HEAD
import com.liferay.portal.kernel.portlet.PortletResponseUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.upload.UploadException;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ContentTypes;
=======
import com.liferay.portal.kernel.servlet.SessionErrors;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
<<<<<<< HEAD
import com.liferay.portlet.asset.AssetCategoryException;
import com.liferay.portlet.asset.AssetTagException;
import com.liferay.portlet.documentlibrary.DuplicateFileException;
import com.liferay.portlet.documentlibrary.FileNameException;
import com.liferay.portlet.documentlibrary.FileSizeException;
import com.liferay.portlet.documentlibrary.NoSuchFileException;
import com.liferay.util.bridges.mvc.MVCPortlet;
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Peter Shin
 * @author Brian Wing Shun Chan
 */
<<<<<<< HEAD
public class SectionPortlet extends MVCPortlet {

	public void addAttachment(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		UploadPortletRequest uploadPortletRequest =
			PortalUtil.getUploadPortletRequest(actionRequest);

		checkExceededSizeLimit(uploadPortletRequest);

		String portletId = PortalUtil.getPortletId(actionRequest);

		long resourcePrimKey = ParamUtil.getLong(
			uploadPortletRequest, "resourcePrimKey");

		String dirName = ParamUtil.getString(uploadPortletRequest, "dirName");
		String fileName = uploadPortletRequest.getFileName("file");

		InputStream inputStream = null;

		try {
			inputStream = uploadPortletRequest.getFileAsStream("file");

			ServiceContext serviceContext = ServiceContextFactory.getInstance(
				KBArticle.class.getName(), actionRequest);

			KBArticleServiceUtil.addAttachment(
				portletId, resourcePrimKey, dirName, fileName, inputStream,
				serviceContext);
		}
		finally {
			StreamUtil.cleanUp(inputStream);
		}
	}

	public void deleteAttachment(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		String portletId = PortalUtil.getPortletId(actionRequest);

		long resourcePrimKey = ParamUtil.getLong(
			actionRequest, "resourcePrimKey");

		String fileName = ParamUtil.getString(actionRequest, "fileName");

		KBArticleServiceUtil.deleteAttachment(
			themeDisplay.getCompanyId(), themeDisplay.getScopeGroupId(),
			portletId, resourcePrimKey, fileName);
	}

	public void deleteKBArticle(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long resourcePrimKey = ParamUtil.getLong(
			actionRequest, "resourcePrimKey");

		KBArticleServiceUtil.deleteKBArticle(resourcePrimKey);
	}

	public void deleteKBComment(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		if (!themeDisplay.isSignedIn()) {
			return;
		}

		long kbCommentId = ParamUtil.getLong(actionRequest, "kbCommentId");

		KBCommentServiceUtil.deleteKBComment(kbCommentId);
	}

	public void moveKBArticle(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		long resourcePrimKey = ParamUtil.getLong(
			actionRequest, "resourcePrimKey");

		long parentResourcePrimKey = ParamUtil.getLong(
			actionRequest, "parentResourcePrimKey");
		double priority = ParamUtil.getDouble(actionRequest, "priority");

		KBArticleServiceUtil.moveKBArticle(
			resourcePrimKey, parentResourcePrimKey, priority);
	}
=======
public class SectionPortlet extends BaseKBPortlet {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

	@Override
	public void render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		try {
			int status = getStatus(renderRequest);

			renderRequest.setAttribute(WebKeys.KNOWLEDGE_BASE_STATUS, status);

			KBArticle kbArticle = getKBArticle(renderRequest, status);

			renderRequest.setAttribute(
				WebKeys.KNOWLEDGE_BASE_KB_ARTICLE, kbArticle);
		}
		catch (Exception e) {
			if (e instanceof NoSuchArticleException ||
				e instanceof PrincipalException) {

				SessionErrors.add(renderRequest, e.getClass());
			}
			else {
				throw new PortletException(e);
			}
		}

		super.render(renderRequest, renderResponse);
	}

	@Override
	protected void doDispatch(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		if (SessionErrors.contains(
				renderRequest, NoSuchArticleException.class.getName()) ||
			SessionErrors.contains(
				renderRequest, NoSuchCommentException.class.getName()) ||
			SessionErrors.contains(
				renderRequest, NoSuchSubscriptionException.class.getName()) ||
			SessionErrors.contains(
				renderRequest, PrincipalException.getNestedClasses())) {

			include(templatePath + "error.jsp", renderRequest, renderResponse);
		}
		else {
			super.doDispatch(renderRequest, renderResponse);
		}
	}

	protected KBArticle getKBArticle(RenderRequest renderRequest, int status)
		throws PortalException {

		long resourcePrimKey = ParamUtil.getLong(
<<<<<<< HEAD
			actionRequest, "resourcePrimKey");

		long parentResourcePrimKey = ParamUtil.getLong(
			actionRequest, "parentResourcePrimKey");
		String title = ParamUtil.getString(actionRequest, "title");
		String urlTitle = ParamUtil.getString(actionRequest, "urlTitle");
		String content = ParamUtil.getString(actionRequest, "content");
		String description = ParamUtil.getString(actionRequest, "description");
		String[] sections = actionRequest.getParameterValues("sections");
		String dirName = ParamUtil.getString(actionRequest, "dirName");
		int workflowAction = ParamUtil.getInteger(
			actionRequest, "workflowAction");

		KBArticle kbArticle = null;

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
			KBArticle.class.getName(), actionRequest);

		if (cmd.equals(Constants.ADD)) {
			kbArticle = KBArticleServiceUtil.addKBArticle(
				portletId, parentResourcePrimKey, title, urlTitle, content,
				description, sections, dirName, serviceContext);
		}
		else if (cmd.equals(Constants.UPDATE)) {
			kbArticle = KBArticleServiceUtil.updateKBArticle(
				resourcePrimKey, title, content, description, sections, dirName,
				serviceContext);
		}

		if (!cmd.equals(Constants.ADD) && !cmd.equals(Constants.UPDATE)) {
			return;
		}

		if (workflowAction == WorkflowConstants.ACTION_SAVE_DRAFT) {
			String namespace = actionResponse.getNamespace();
			String redirect = getRedirect(actionRequest, actionResponse);

			String editURL = PortalUtil.getLayoutFullURL(themeDisplay);

			editURL = HttpUtil.setParameter(
				editURL, "p_p_id", PortletKeys.KNOWLEDGE_BASE_SECTION);
			editURL = HttpUtil.setParameter(
				editURL, namespace + "mvcPath",
				templatePath + "edit_article.jsp");
			editURL = HttpUtil.setParameter(
				editURL, namespace + "redirect", redirect);
			editURL = HttpUtil.setParameter(
				editURL, namespace + "resourcePrimKey",
				kbArticle.getResourcePrimKey());
			editURL = HttpUtil.setParameter(
				editURL, namespace + "status", WorkflowConstants.STATUS_ANY);

			actionRequest.setAttribute(WebKeys.REDIRECT, editURL);
		}
	}

	public void updateKBComment(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws Exception {

		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(
			WebKeys.THEME_DISPLAY);
=======
			renderRequest, "resourcePrimKey");
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

		if (resourcePrimKey > 0) {
			return KBArticleServiceUtil.getLatestKBArticle(
				resourcePrimKey, status);
		}

		String urlTitle = ParamUtil.getString(renderRequest, "urlTitle");

		if (Validator.isNull(urlTitle)) {
			return null;
		}

		long groupId = PortalUtil.getScopeGroupId(renderRequest);

		String kbFolderUrlTitle = ParamUtil.getString(
			renderRequest, "kbFolderUrlTitle");

		if (Validator.isNotNull(kbFolderUrlTitle)) {
			return KBArticleLocalServiceUtil.getKBArticleByUrlTitle(
				groupId, kbFolderUrlTitle, urlTitle);
		}

<<<<<<< HEAD
		super.addSuccessMessage(actionRequest, actionResponse);
	}

	protected void checkExceededSizeLimit(HttpServletRequest request)
		throws PortalException {

		UploadException uploadException = (UploadException)request.getAttribute(
			WebKeys.UPLOAD_EXCEPTION);

		if (uploadException != null) {
			if (uploadException.isExceededSizeLimit()) {
				throw new FileSizeException(uploadException.getCause());
			}

			throw new PortalException(uploadException.getCause());
		}
	}

	@Override
	protected void doDispatch(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		if (SessionErrors.contains(
				renderRequest, NoSuchArticleException.class.getName()) ||
			SessionErrors.contains(
				renderRequest, NoSuchCommentException.class.getName()) ||
			SessionErrors.contains(
				renderRequest, NoSuchSubscriptionException.class.getName()) ||
			SessionErrors.contains(
				renderRequest, PrincipalException.class.getName())) {

			include(templatePath + "error.jsp", renderRequest, renderResponse);
		}
		else {
			super.doDispatch(renderRequest, renderResponse);
		}
=======
		return KBArticleLocalServiceUtil.getKBArticleByUrlTitle(
			groupId, KBFolderConstants.DEFAULT_PARENT_FOLDER_ID, urlTitle);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	protected int getStatus(RenderRequest renderRequest) throws Exception {
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		if (!themeDisplay.isSignedIn()) {
			return WorkflowConstants.STATUS_APPROVED;
		}

		String value = renderRequest.getParameter("status");
		int status = GetterUtil.getInteger(value);

		if ((value != null) && (status == WorkflowConstants.STATUS_APPROVED)) {
			return WorkflowConstants.STATUS_APPROVED;
		}

		long resourcePrimKey = ParamUtil.getLong(
			renderRequest, "resourcePrimKey");

		if (resourcePrimKey == 0) {
			return WorkflowConstants.STATUS_APPROVED;
		}

		PermissionChecker permissionChecker =
			themeDisplay.getPermissionChecker();

		if (KBArticlePermission.contains(
				permissionChecker, resourcePrimKey, ActionKeys.UPDATE)) {

			return ParamUtil.getInteger(
				renderRequest, "status", WorkflowConstants.STATUS_ANY);
		}

		return WorkflowConstants.STATUS_APPROVED;
	}

<<<<<<< HEAD
	@Override
	protected boolean isSessionErrorException(Throwable cause) {
		if (cause instanceof AssetCategoryException ||
			cause instanceof AssetTagException ||
			cause instanceof DuplicateFileException ||
			cause instanceof FileNameException ||
			cause instanceof FileSizeException ||
			cause instanceof KBArticleContentException ||
			cause instanceof KBArticlePriorityException ||
			cause instanceof KBArticleTitleException ||
			cause instanceof KBCommentContentException ||
			cause instanceof NoSuchArticleException ||
			cause instanceof NoSuchCommentException ||
			cause instanceof NoSuchFileException ||
			cause instanceof PrincipalException ||
			super.isSessionErrorException(cause)) {

			return true;
		}

		return false;
	}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}