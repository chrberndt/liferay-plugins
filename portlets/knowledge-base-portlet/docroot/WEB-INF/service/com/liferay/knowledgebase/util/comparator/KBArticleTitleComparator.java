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

package com.liferay.knowledgebase.util.comparator;

import com.liferay.knowledgebase.model.KBArticle;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringUtil;

/**
 * @author Peter Shin
 * @author Brian Wing Shun Chan
 */
public class KBArticleTitleComparator extends OrderByComparator<KBArticle> {

	public static final String ORDER_BY_ASC = "KBArticle.title ASC";

	public static final String ORDER_BY_DESC = "KBArticle.title DESC";

	public static final String[] ORDER_BY_FIELDS = {"title"};

	public KBArticleTitleComparator() {
		this(false);
	}

	public KBArticleTitleComparator(boolean ascending) {
		_ascending = ascending;
	}

	@Override
<<<<<<< HEAD
	public int compare(Object obj1, Object obj2) {
		KBArticle kbArticle1 = (KBArticle)obj1;
		KBArticle kbArticle2 = (KBArticle)obj2;

=======
	public int compare(KBArticle kbArticle1, KBArticle kbArticle2) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		int value = StringUtil.toLowerCase(kbArticle1.getTitle()).compareTo(
			StringUtil.toLowerCase(kbArticle2.getTitle()));

		if (_ascending) {
			return value;
		}
		else {
			return -value;
		}
	}

	@Override
	public String getOrderBy() {
		if (_ascending) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

	@Override
	public boolean isAscending() {
		return _ascending;
	}

	private boolean _ascending;

}