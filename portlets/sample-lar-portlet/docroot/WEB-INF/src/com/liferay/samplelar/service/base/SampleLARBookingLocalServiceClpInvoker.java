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

package com.liferay.samplelar.service.base;

<<<<<<< HEAD
=======
import aQute.bnd.annotation.ProviderType;

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.samplelar.service.SampleLARBookingLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Mate Thurzo
 * @generated
 */
<<<<<<< HEAD
=======
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public class SampleLARBookingLocalServiceClpInvoker {
	public SampleLARBookingLocalServiceClpInvoker() {
		_methodName0 = "addSampleLARBooking";

		_methodParameterTypes0 = new String[] {
				"com.liferay.samplelar.model.SampleLARBooking"
			};

		_methodName1 = "createSampleLARBooking";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteSampleLARBooking";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteSampleLARBooking";

		_methodParameterTypes3 = new String[] {
				"com.liferay.samplelar.model.SampleLARBooking"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchSampleLARBooking";

		_methodParameterTypes10 = new String[] { "long" };

<<<<<<< HEAD
		_methodName11 = "fetchSampleLARBookingByUuidAndCompanyId";

		_methodParameterTypes11 = new String[] { "java.lang.String", "long" };

		_methodName12 = "fetchSampleLARBookingByUuidAndGroupId";

		_methodParameterTypes12 = new String[] { "java.lang.String", "long" };

		_methodName13 = "getSampleLARBooking";

		_methodParameterTypes13 = new String[] { "long" };

		_methodName14 = "getPersistedModel";

		_methodParameterTypes14 = new String[] { "java.io.Serializable" };

		_methodName15 = "getSampleLARBookingByUuidAndCompanyId";

		_methodParameterTypes15 = new String[] { "java.lang.String", "long" };

		_methodName16 = "getSampleLARBookingByUuidAndGroupId";

		_methodParameterTypes16 = new String[] { "java.lang.String", "long" };

		_methodName17 = "getSampleLARBookings";

		_methodParameterTypes17 = new String[] { "int", "int" };

		_methodName18 = "getSampleLARBookingsCount";

		_methodParameterTypes18 = new String[] {  };

		_methodName19 = "updateSampleLARBooking";

		_methodParameterTypes19 = new String[] {
				"com.liferay.samplelar.model.SampleLARBooking"
			};

		_methodName42 = "getBeanIdentifier";

		_methodParameterTypes42 = new String[] {  };

		_methodName43 = "setBeanIdentifier";

		_methodParameterTypes43 = new String[] { "java.lang.String" };

		_methodName48 = "addSampleLARBooking";

		_methodParameterTypes48 = new String[] {
=======
		_methodName11 = "fetchSampleLARBookingByUuidAndGroupId";

		_methodParameterTypes11 = new String[] { "java.lang.String", "long" };

		_methodName12 = "getSampleLARBooking";

		_methodParameterTypes12 = new String[] { "long" };

		_methodName13 = "getActionableDynamicQuery";

		_methodParameterTypes13 = new String[] {  };

		_methodName15 = "getExportActionableDynamicQuery";

		_methodParameterTypes15 = new String[] {
				"com.liferay.portlet.exportimport.lar.PortletDataContext"
			};

		_methodName16 = "deletePersistedModel";

		_methodParameterTypes16 = new String[] {
				"com.liferay.portal.model.PersistedModel"
			};

		_methodName17 = "getPersistedModel";

		_methodParameterTypes17 = new String[] { "java.io.Serializable" };

		_methodName18 = "getSampleLARBookingsByUuidAndCompanyId";

		_methodParameterTypes18 = new String[] { "java.lang.String", "long" };

		_methodName19 = "getSampleLARBookingsByUuidAndCompanyId";

		_methodParameterTypes19 = new String[] {
				"java.lang.String", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName20 = "getSampleLARBookingByUuidAndGroupId";

		_methodParameterTypes20 = new String[] { "java.lang.String", "long" };

		_methodName21 = "getSampleLARBookings";

		_methodParameterTypes21 = new String[] { "int", "int" };

		_methodName22 = "getSampleLARBookingsCount";

		_methodParameterTypes22 = new String[] {  };

		_methodName23 = "updateSampleLARBooking";

		_methodParameterTypes23 = new String[] {
				"com.liferay.samplelar.model.SampleLARBooking"
			};

		_methodName46 = "getBeanIdentifier";

		_methodParameterTypes46 = new String[] {  };

		_methodName47 = "setBeanIdentifier";

		_methodParameterTypes47 = new String[] { "java.lang.String" };

		_methodName52 = "addSampleLARBooking";

		_methodParameterTypes52 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

<<<<<<< HEAD
		_methodName49 = "deleteSampleLARBookings";

		_methodParameterTypes49 = new String[] { "long" };

		_methodName50 = "updateSampleLARBooking";

		_methodParameterTypes50 = new String[] {
=======
		_methodName53 = "deleteSampleLARBooking";

		_methodParameterTypes53 = new String[] { "long" };

		_methodName54 = "deleteSampleLARBooking";

		_methodParameterTypes54 = new String[] {
				"com.liferay.samplelar.model.SampleLARBooking"
			};

		_methodName55 = "deleteSampleLARBookings";

		_methodParameterTypes55 = new String[] { "long" };

		_methodName56 = "getSampleLARBookings";

		_methodParameterTypes56 = new String[] { "long", "int", "int" };

		_methodName57 = "getSampleLARBookingsCount";

		_methodParameterTypes57 = new String[] { "long" };

		_methodName58 = "updateSampleLARBooking";

		_methodParameterTypes58 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.addSampleLARBooking((com.liferay.samplelar.model.SampleLARBooking)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.createSampleLARBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.deleteSampleLARBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.deleteSampleLARBooking((com.liferay.samplelar.model.SampleLARBooking)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
<<<<<<< HEAD
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
=======
				(com.liferay.portal.kernel.util.OrderByComparator<?>)arguments[3]);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.fetchSampleLARBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
<<<<<<< HEAD
			return SampleLARBookingLocalServiceUtil.fetchSampleLARBookingByUuidAndCompanyId((java.lang.String)arguments[0],
=======
			return SampleLARBookingLocalServiceUtil.fetchSampleLARBookingByUuidAndGroupId((java.lang.String)arguments[0],
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				((Long)arguments[1]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
<<<<<<< HEAD
			return SampleLARBookingLocalServiceUtil.fetchSampleLARBookingByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
=======
			return SampleLARBookingLocalServiceUtil.getSampleLARBooking(((Long)arguments[0]).longValue());
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
<<<<<<< HEAD
			return SampleLARBookingLocalServiceUtil.getSampleLARBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
=======
			return SampleLARBookingLocalServiceUtil.getActionableDynamicQuery();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
<<<<<<< HEAD
			return SampleLARBookingLocalServiceUtil.getSampleLARBookingByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
=======
			return SampleLARBookingLocalServiceUtil.getExportActionableDynamicQuery((com.liferay.portlet.exportimport.lar.PortletDataContext)arguments[0]);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
<<<<<<< HEAD
			return SampleLARBookingLocalServiceUtil.getSampleLARBookingByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
=======
			return SampleLARBookingLocalServiceUtil.deletePersistedModel((com.liferay.portal.model.PersistedModel)arguments[0]);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
<<<<<<< HEAD
			return SampleLARBookingLocalServiceUtil.getSampleLARBookings(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
=======
			return SampleLARBookingLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
<<<<<<< HEAD
			return SampleLARBookingLocalServiceUtil.getSampleLARBookingsCount();
=======
			return SampleLARBookingLocalServiceUtil.getSampleLARBookingsByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
<<<<<<< HEAD
			return SampleLARBookingLocalServiceUtil.updateSampleLARBooking((com.liferay.samplelar.model.SampleLARBooking)arguments[0]);
		}

		if (_methodName42.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes42, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName43.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes43, parameterTypes)) {
=======
			return SampleLARBookingLocalServiceUtil.getSampleLARBookingsByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue(),
				((Integer)arguments[3]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<com.liferay.samplelar.model.SampleLARBooking>)arguments[4]);
		}

		if (_methodName20.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.getSampleLARBookingByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName21.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes21, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.getSampleLARBookings(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName22.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes22, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.getSampleLARBookingsCount();
		}

		if (_methodName23.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes23, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.updateSampleLARBooking((com.liferay.samplelar.model.SampleLARBooking)arguments[0]);
		}

		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName47.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			SampleLARBookingLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

<<<<<<< HEAD
		if (_methodName48.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes48, parameterTypes)) {
=======
		if (_methodName52.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return SampleLARBookingLocalServiceUtil.addSampleLARBooking(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

<<<<<<< HEAD
		if (_methodName49.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes49, parameterTypes)) {
=======
		if (_methodName53.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.deleteSampleLARBooking(((Long)arguments[0]).longValue());
		}

		if (_methodName54.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.deleteSampleLARBooking((com.liferay.samplelar.model.SampleLARBooking)arguments[0]);
		}

		if (_methodName55.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			SampleLARBookingLocalServiceUtil.deleteSampleLARBookings(((Long)arguments[0]).longValue());

			return null;
		}

<<<<<<< HEAD
		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
=======
		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.getSampleLARBookings(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
			return SampleLARBookingLocalServiceUtil.getSampleLARBookingsCount(((Long)arguments[0]).longValue());
		}

		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			return SampleLARBookingLocalServiceUtil.updateSampleLARBooking(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
<<<<<<< HEAD
	private String _methodName14;
	private String[] _methodParameterTypes14;
=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
<<<<<<< HEAD
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
=======
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
	private String _methodName56;
	private String[] _methodParameterTypes56;
	private String _methodName57;
	private String[] _methodParameterTypes57;
	private String _methodName58;
	private String[] _methodParameterTypes58;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}