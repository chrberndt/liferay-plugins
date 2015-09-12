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

package com.liferay.so.activities.util;

import com.liferay.portlet.documentlibrary.model.DLFileEntry;
<<<<<<< HEAD
import com.liferay.portlet.documentlibrary.model.DLFileVersion;
import com.liferay.portlet.documentlibrary.service.DLFileVersionLocalServiceUtil;
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portlet.social.model.SocialActivitySet;

/**
 * @author Matthew Kong
 */
public class ActivitiesUtil {

	public static Object[] getCommentsClassNameAndClassPK(
			SocialActivitySet activitySet)
		throws Exception {

		String className = activitySet.getClassName();
		long classPK = activitySet.getClassPK();

<<<<<<< HEAD
		if (className.equals(DLFileEntry.class.getName())) {
			if ((activitySet.getActivityCount() > 1) &&
				(activitySet.getType() ==
					SocialActivityKeyConstants.DL_ADD_FILE_ENTRY)) {

				className = SocialActivitySet.class.getName();
				classPK = activitySet.getActivitySetId();
			}
			else {
				className = DLFileVersion.class.getName();

				DLFileVersion dlFileVersion =
					DLFileVersionLocalServiceUtil.getLatestFileVersion(
						classPK, false);

				classPK = dlFileVersion.getFileVersionId();
			}
=======
		if (className.equals(DLFileEntry.class.getName()) &&
			(activitySet.getActivityCount() > 1) &&
			(activitySet.getType() ==
				SocialActivityKeyConstants.DL_ADD_FILE_ENTRY)) {

			className = SocialActivitySet.class.getName();
			classPK = activitySet.getActivitySetId();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}

		return new Object[] {className, classPK};
	}

}