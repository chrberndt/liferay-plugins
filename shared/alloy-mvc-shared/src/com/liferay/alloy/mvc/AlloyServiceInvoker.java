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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
<<<<<<< HEAD
=======
import com.liferay.portal.kernel.dao.orm.Projection;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.TextFormatter;
import com.liferay.portal.model.BaseModel;

import java.lang.reflect.Method;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class AlloyServiceInvoker {

	public AlloyServiceInvoker(String className) {
		Class<?> clazz = getClass();

		ClassLoader classLoader = clazz.getClassLoader();

		int pos = className.indexOf(".model.");

		String simpleClassName = className.substring(pos + 7);

		String serviceClassName =
			className.substring(0, pos) + ".service." + simpleClassName +
				"LocalServiceUtil";

		try {
			Class<?> serviceClass = classLoader.loadClass(serviceClassName);

<<<<<<< HEAD
			dynamicQueryCountMethod = serviceClass.getMethod(
				"dynamicQueryCount", new Class[] {DynamicQuery.class});
=======
			deleteModelMethod = serviceClass.getMethod(
				"delete" + simpleClassName, new Class[] {long.class});
			dynamicQueryCountMethod1 = serviceClass.getMethod(
				"dynamicQueryCount", new Class[] {DynamicQuery.class});
			dynamicQueryCountMethod2 = serviceClass.getMethod(
				"dynamicQueryCount",
				new Class[] {DynamicQuery.class, Projection.class});
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			dynamicQueryMethod1 = serviceClass.getMethod(
				"dynamicQuery", new Class[0]);
			dynamicQueryMethod2 = serviceClass.getMethod(
				"dynamicQuery", new Class[] {DynamicQuery.class});
			dynamicQueryMethod3 = serviceClass.getMethod(
				"dynamicQuery",
				new Class[] {DynamicQuery.class, int.class, int.class});
			dynamicQueryMethod4 = serviceClass.getMethod(
				"dynamicQuery",
<<<<<<< HEAD
				new Class[] {DynamicQuery.class, int.class, int.class,
					OrderByComparator.class});
=======
				new Class[] {
					DynamicQuery.class, int.class, int.class,
					OrderByComparator.class
				});
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			fetchModelMethod = serviceClass.getMethod(
				"fetch" + simpleClassName, new Class[] {long.class});
			getModelsCountMethod = serviceClass.getMethod(
				"get" + TextFormatter.formatPlural(simpleClassName) + "Count",
				new Class[0]);
			getModelsMethod = serviceClass.getMethod(
				"get" + TextFormatter.formatPlural(simpleClassName),
				new Class[] {int.class, int.class});
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public DynamicQuery buildDynamicQuery() throws Exception {
		return (DynamicQuery)dynamicQueryMethod1.invoke(false);
	}

	public DynamicQuery buildDynamicQuery(Object[] properties)
		throws Exception {

		if ((properties.length == 0) || ((properties.length % 2) != 0)) {
			throw new IllegalArgumentException(
				"Properties length is not an even number");
		}

		DynamicQuery dynamicQuery = buildDynamicQuery();

		for (int i = 0; i < properties.length; i += 2) {
			String propertyName = String.valueOf(properties[i]);

			Property property = PropertyFactoryUtil.forName(propertyName);

			Object propertyValue = properties[i + 1];

			dynamicQuery.add(property.eq(propertyValue));
		}

		return dynamicQuery;
	}

<<<<<<< HEAD
=======
	public BaseModel<?> deleteModel(BaseModel<?> baseModel) throws Exception {
		return (BaseModel<?>)deleteModelMethod.invoke(
			false, baseModel.getPrimaryKeyObj());
	}

	public BaseModel<?> deleteModel(long classPK) throws Exception {
		return (BaseModel<?>)deleteModelMethod.invoke(false, classPK);
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	/**
	 * @deprecated As of 6.2.0, replaced by {@link
	 *             #executeDynamicQuery(DynamicQuery)}
	 */
<<<<<<< HEAD
=======
	@Deprecated
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery) throws Exception {
		return executeDynamicQuery(dynamicQuery);
	}

	/**
	 * @deprecated As of 6.2.0, replaced by {@link
	 *             #executeDynamicQueryCount(DynamicQuery)}
	 */
<<<<<<< HEAD
=======
	@Deprecated
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public long dynamicQueryCount(DynamicQuery dynamicQuery) throws Exception {
		return executeDynamicQueryCount(dynamicQuery);
	}

	@SuppressWarnings("rawtypes")
	public List executeDynamicQuery(DynamicQuery dynamicQuery)
		throws Exception {

		return (List)dynamicQueryMethod2.invoke(false, dynamicQuery);
	}

	@SuppressWarnings("rawtypes")
	public List executeDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end)
		throws Exception {

		return (List)dynamicQueryMethod3.invoke(
			false, dynamicQuery, start, end);
	}

	@SuppressWarnings("rawtypes")
	public List executeDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
<<<<<<< HEAD
			OrderByComparator obc)
=======
			OrderByComparator<?> obc)
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		throws Exception {

		return (List)dynamicQueryMethod4.invoke(
			false, dynamicQuery, start, end, obc);
	}

	@SuppressWarnings("rawtypes")
	public List executeDynamicQuery(Object[] properties) throws Exception {
		return executeDynamicQuery(buildDynamicQuery(properties));
	}

	@SuppressWarnings("rawtypes")
	public List executeDynamicQuery(Object[] properties, int start, int end)
		throws Exception {

		return executeDynamicQuery(buildDynamicQuery(properties), start, end);
	}

	@SuppressWarnings("rawtypes")
	public List executeDynamicQuery(
<<<<<<< HEAD
			Object[] properties, int start, int end, OrderByComparator obc)
=======
			Object[] properties, int start, int end, OrderByComparator<?> obc)
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		throws Exception {

		return executeDynamicQuery(
			buildDynamicQuery(properties), start, end, obc);
	}

	public long executeDynamicQueryCount(DynamicQuery dynamicQuery)
		throws Exception {

<<<<<<< HEAD
		return (Long)dynamicQueryCountMethod.invoke(false, dynamicQuery);
=======
		return (Long)dynamicQueryCountMethod1.invoke(false, dynamicQuery);
	}

	public long executeDynamicQueryCount(
			DynamicQuery dynamicQuery, Projection projection)
		throws Exception {

		return (Long)dynamicQueryCountMethod2.invoke(
			false, dynamicQuery, projection);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	public long executeDynamicQueryCount(Object[] properties) throws Exception {
		return executeDynamicQueryCount(buildDynamicQuery(properties));
	}

	public BaseModel<?> fetchModel(long classPK) throws Exception {
		return (BaseModel<?>)fetchModelMethod.invoke(false, classPK);
	}

	@SuppressWarnings("rawtypes")
	public List getModels(int start, int end) throws Exception {
		return (List)getModelsMethod.invoke(false, start, end);
	}

	public int getModelsCount() throws Exception {
		return (Integer)getModelsCountMethod.invoke(false);
	}

<<<<<<< HEAD
	protected Method dynamicQueryCountMethod;
=======
	protected Method deleteModelMethod;
	protected Method dynamicQueryCountMethod1;
	protected Method dynamicQueryCountMethod2;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	protected Method dynamicQueryMethod1;
	protected Method dynamicQueryMethod2;
	protected Method dynamicQueryMethod3;
	protected Method dynamicQueryMethod4;
	protected Method fetchModelMethod;
	protected Method getModelsCountMethod;
	protected Method getModelsMethod;

}