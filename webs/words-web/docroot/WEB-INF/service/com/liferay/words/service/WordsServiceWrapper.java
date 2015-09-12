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

package com.liferay.words.service;

<<<<<<< HEAD
=======
import aQute.bnd.annotation.ProviderType;

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link WordsService}.
 *
 * @author Brian Wing Shun Chan
 * @see WordsService
 * @generated
 */
<<<<<<< HEAD
=======
@ProviderType
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
public class WordsServiceWrapper implements WordsService,
	ServiceWrapper<WordsService> {
	public WordsServiceWrapper(WordsService wordsService) {
		_wordsService = wordsService;
	}

<<<<<<< HEAD
=======
	@Override
	public java.util.List<java.lang.String> checkSpelling(java.lang.String text)
		throws java.lang.Exception {
		return _wordsService.checkSpelling(text);
	}

>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _wordsService.getBeanIdentifier();
	}

<<<<<<< HEAD
	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_wordsService.setBeanIdentifier(beanIdentifier);
=======
	@Override
	public java.util.List<java.lang.String> getSuggestions(
		java.lang.String word) throws java.lang.Exception {
		return _wordsService.getSuggestions(word);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _wordsService.invokeMethod(name, parameterTypes, arguments);
	}

<<<<<<< HEAD
	@Override
	public java.util.List<java.lang.String> checkSpelling(java.lang.String text)
		throws java.lang.Exception {
		return _wordsService.checkSpelling(text);
	}

	@Override
	public java.util.List<java.lang.String> getSuggestions(
		java.lang.String word) throws java.lang.Exception {
		return _wordsService.getSuggestions(word);
=======
	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_wordsService.setBeanIdentifier(beanIdentifier);
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
<<<<<<< HEAD
=======
	@Deprecated
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public WordsService getWrappedWordsService() {
		return _wordsService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
<<<<<<< HEAD
=======
	@Deprecated
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	public void setWrappedWordsService(WordsService wordsService) {
		_wordsService = wordsService;
	}

	@Override
	public WordsService getWrappedService() {
		return _wordsService;
	}

	@Override
	public void setWrappedService(WordsService wordsService) {
		_wordsService = wordsService;
	}

	private WordsService _wordsService;
}