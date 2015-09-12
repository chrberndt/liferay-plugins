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

package com.liferay.samplelar.service;

<<<<<<< HEAD
=======
import aQute.bnd.annotation.ProviderType;

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.service.InvokableLocalService;

/**
 * @author Mate Thurzo
 * @generated
 */
<<<<<<< HEAD
=======
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public class SampleLARBookingLocalServiceClp
	implements SampleLARBookingLocalService {
	public SampleLARBookingLocalServiceClp(
		InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

		_methodName0 = "addSampleLARBooking";

		_methodParameterTypes0 = new String[] {
				"com.liferay.samplelar.model.SampleLARBooking"
			};

<<<<<<< HEAD
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
=======
		_methodName1 = "addSampleLARBooking";

		_methodParameterTypes1 = new String[] {
				"long", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName2 = "createSampleLARBooking";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletePersistedModel";

		_methodParameterTypes3 = new String[] {
				"com.liferay.portal.model.PersistedModel"
			};

		_methodName4 = "deleteSampleLARBooking";

		_methodParameterTypes4 = new String[] {
				"com.liferay.samplelar.model.SampleLARBooking"
			};

		_methodName5 = "deleteSampleLARBooking";

		_methodParameterTypes5 = new String[] { "long" };

		_methodName6 = "deleteSampleLARBookings";

		_methodParameterTypes6 = new String[] { "long" };

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {  };

		_methodName8 = "dynamicQuery";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQuery";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName10 = "dynamicQuery";

		_methodParameterTypes10 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

<<<<<<< HEAD
		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
=======
		_methodName11 = "dynamicQueryCount";

		_methodParameterTypes11 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName12 = "dynamicQueryCount";

		_methodParameterTypes12 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

<<<<<<< HEAD
		_methodName10 = "fetchSampleLARBooking";

		_methodParameterTypes10 = new String[] { "long" };

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

		_methodName20 = "getBeanIdentifier";

		_methodParameterTypes20 = new String[] {  };

		_methodName21 = "setBeanIdentifier";

		_methodParameterTypes21 = new String[] { "java.lang.String" };

		_methodName23 = "addSampleLARBooking";

		_methodParameterTypes23 = new String[] {
				"long", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName24 = "deleteSampleLARBookings";

		_methodParameterTypes24 = new String[] { "long" };

		_methodName25 = "updateSampleLARBooking";

		_methodParameterTypes25 = new String[] {
=======
		_methodName13 = "fetchSampleLARBooking";

		_methodParameterTypes13 = new String[] { "long" };

		_methodName14 = "fetchSampleLARBookingByUuidAndGroupId";

		_methodParameterTypes14 = new String[] { "java.lang.String", "long" };

		_methodName15 = "getActionableDynamicQuery";

		_methodParameterTypes15 = new String[] {  };

		_methodName16 = "getBeanIdentifier";

		_methodParameterTypes16 = new String[] {  };

		_methodName17 = "getExportActionableDynamicQuery";

		_methodParameterTypes17 = new String[] {
				"com.liferay.portlet.exportimport.lar.PortletDataContext"
			};

		_methodName18 = "getPersistedModel";

		_methodParameterTypes18 = new String[] { "java.io.Serializable" };

		_methodName19 = "getSampleLARBooking";

		_methodParameterTypes19 = new String[] { "long" };

		_methodName20 = "getSampleLARBookingByUuidAndGroupId";

		_methodParameterTypes20 = new String[] { "java.lang.String", "long" };

		_methodName21 = "getSampleLARBookings";

		_methodParameterTypes21 = new String[] { "long", "int", "int" };

		_methodName22 = "getSampleLARBookings";

		_methodParameterTypes22 = new String[] { "int", "int" };

		_methodName23 = "getSampleLARBookingsByUuidAndCompanyId";

		_methodParameterTypes23 = new String[] { "java.lang.String", "long" };

		_methodName24 = "getSampleLARBookingsByUuidAndCompanyId";

		_methodParameterTypes24 = new String[] {
				"java.lang.String", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName25 = "getSampleLARBookingsCount";

		_methodParameterTypes25 = new String[] {  };

		_methodName26 = "getSampleLARBookingsCount";

		_methodParameterTypes26 = new String[] { "long" };

		_methodName28 = "setBeanIdentifier";

		_methodParameterTypes28 = new String[] { "java.lang.String" };

		_methodName29 = "updateSampleLARBooking";

		_methodParameterTypes29 = new String[] {
				"com.liferay.samplelar.model.SampleLARBooking"
			};

		_methodName30 = "updateSampleLARBooking";

		_methodParameterTypes30 = new String[] {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
				"long", "long", "java.lang.String",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking addSampleLARBooking(
<<<<<<< HEAD
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking)
		throws com.liferay.portal.kernel.exception.SystemException {
=======
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking) {
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(
							sampleLARBooking) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
=======
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking addSampleLARBooking(
		long userId, long groupId, java.lang.String bookingNumber,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1,
					new Object[] {
						userId,
						
					groupId,
						
					ClpSerializer.translateInput(bookingNumber),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking createSampleLARBooking(
		long sampleLARBookingId) {
		Object returnObj = null;

		try {
<<<<<<< HEAD
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1, new Object[] { sampleLARBookingId });
=======
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2, new Object[] { sampleLARBookingId });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.samplelar.model.SampleLARBooking deleteSampleLARBooking(
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName2,
					_methodParameterTypes2, new Object[] { sampleLARBookingId });
=======
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(persistedModel) });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}
=======
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking deleteSampleLARBooking(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4,
					new Object[] { ClpSerializer.translateInput(
							sampleLARBooking) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking deleteSampleLARBooking(
<<<<<<< HEAD
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] { ClpSerializer.translateInput(
							sampleLARBooking) });
=======
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5, new Object[] { sampleLARBookingId });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
=======
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
=======
	public void deleteSampleLARBookings(long groupId) {
		try {
			_invokableLocalService.invokeMethod(_methodName6,
				_methodParameterTypes6, new Object[] { groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		Object returnObj = null;

		try {
<<<<<<< HEAD
			returnObj = _invokableLocalService.invokeMethod(_methodName4,
					_methodParameterTypes4, new Object[] {  });
=======
			returnObj = _invokableLocalService.invokeMethod(_methodName7,
					_methodParameterTypes7, new Object[] {  });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.DynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName5,
					_methodParameterTypes5,
=======
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName6,
					_methodParameterTypes6,
=======
		return (java.util.List<T>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (java.util.List)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName7,
					_methodParameterTypes7,
=======
		return (java.util.List<T>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (java.util.List)ClpSerializer.translateOutput(returnObj);
=======
		return (java.util.List<T>)ClpSerializer.translateOutput(returnObj);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public long dynamicQueryCount(
<<<<<<< HEAD
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8,
=======
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
<<<<<<< HEAD
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName9,
					_methodParameterTypes9,
=======
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					ClpSerializer.translateInput(projection)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking fetchSampleLARBooking(
<<<<<<< HEAD
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10, new Object[] { sampleLARBookingId });
=======
		long sampleLARBookingId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { sampleLARBookingId });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.samplelar.model.SampleLARBooking fetchSampleLARBookingByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11,
					new Object[] { ClpSerializer.translateInput(uuid), companyId });
=======
	public com.liferay.samplelar.model.SampleLARBooking fetchSampleLARBookingByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14,
					new Object[] { ClpSerializer.translateInput(uuid), groupId });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.samplelar.model.SampleLARBooking fetchSampleLARBookingByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { ClpSerializer.translateInput(uuid), groupId });
=======
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15, new Object[] {  });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking getSampleLARBooking(
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13, new Object[] { sampleLARBookingId });
=======
		return (com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16, new Object[] {  });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}
=======
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.portlet.exportimport.lar.PortletDataContext portletDataContext) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName17,
					_methodParameterTypes17,
					new Object[] {
						ClpSerializer.translateInput(portletDataContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
=======
		return (com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery)ClpSerializer.translateOutput(returnObj);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName14,
					_methodParameterTypes14,
=======
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName18,
					_methodParameterTypes18,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public com.liferay.samplelar.model.SampleLARBooking getSampleLARBookingByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15,
					new Object[] { ClpSerializer.translateInput(uuid), companyId });
=======
	public com.liferay.samplelar.model.SampleLARBooking getSampleLARBooking(
		long sampleLARBookingId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19, new Object[] { sampleLARBookingId });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking getSampleLARBookingByUuidAndGroupId(
		java.lang.String uuid, long groupId)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16,
=======
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] { ClpSerializer.translateInput(uuid), groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> getSampleLARBookings(
<<<<<<< HEAD
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName17,
					_methodParameterTypes17, new Object[] { start, end });
=======
		long groupId, int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21,
					new Object[] { groupId, start, end });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.samplelar.model.SampleLARBooking>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
<<<<<<< HEAD
	public int getSampleLARBookingsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName18,
					_methodParameterTypes18, new Object[] {  });
=======
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> getSampleLARBookings(
		int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName22,
					_methodParameterTypes22, new Object[] { start, end });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return ((Integer)returnObj).intValue();
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking updateSampleLARBooking(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] { ClpSerializer.translateInput(
							sampleLARBooking) });
=======
		return (java.util.List<com.liferay.samplelar.model.SampleLARBooking>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> getSampleLARBookingsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23,
					new Object[] { ClpSerializer.translateInput(uuid), companyId });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}
=======
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.samplelar.model.SampleLARBooking>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.samplelar.model.SampleLARBooking> getSampleLARBookingsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.samplelar.model.SampleLARBooking> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName24,
					_methodParameterTypes24,
					new Object[] {
						ClpSerializer.translateInput(uuid),
						
					companyId,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20, new Object[] {  });
=======
		return (java.util.List<com.liferay.samplelar.model.SampleLARBooking>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getSampleLARBookingsCount() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25, new Object[] {  });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

<<<<<<< HEAD
		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName21,
				_methodParameterTypes21,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
=======
		return ((Integer)returnObj).intValue();
	}

	@Override
	public int getSampleLARBookingsCount(long groupId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName26,
					_methodParameterTypes26, new Object[] { groupId });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
<<<<<<< HEAD
=======

		return ((Integer)returnObj).intValue();
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
<<<<<<< HEAD
	public com.liferay.samplelar.model.SampleLARBooking addSampleLARBooking(
		long userId, long groupId, java.lang.String bookingNumber,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23,
					new Object[] {
						userId,
						
					groupId,
						
					ClpSerializer.translateInput(bookingNumber),
						
					ClpSerializer.translateInput(serviceContext)
					});
=======
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName28,
				_methodParameterTypes28,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
<<<<<<< HEAD

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteSampleLARBookings(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			_invokableLocalService.invokeMethod(_methodName24,
				_methodParameterTypes24, new Object[] { groupId });
=======
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking updateSampleLARBooking(
		com.liferay.samplelar.model.SampleLARBooking sampleLARBooking) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName29,
					_methodParameterTypes29,
					new Object[] { ClpSerializer.translateInput(
							sampleLARBooking) });
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
<<<<<<< HEAD
=======

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public com.liferay.samplelar.model.SampleLARBooking updateSampleLARBooking(
		long userId, long sampleLARBookingId, java.lang.String bookingNumber,
		com.liferay.portal.service.ServiceContext serviceContext)
<<<<<<< HEAD
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25,
=======
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName30,
					_methodParameterTypes30,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
					new Object[] {
						userId,
						
					sampleLARBookingId,
						
					ClpSerializer.translateInput(bookingNumber),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

<<<<<<< HEAD
			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

=======
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.samplelar.model.SampleLARBooking)ClpSerializer.translateOutput(returnObj);
	}

	private InvokableLocalService _invokableLocalService;
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
	private String _methodName14;
	private String[] _methodParameterTypes14;
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
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
<<<<<<< HEAD
=======
	private String _methodName22;
	private String[] _methodParameterTypes22;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
<<<<<<< HEAD
=======
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
}