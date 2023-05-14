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

package io.jetprocess.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import io.jetprocess.exception.NoSuchFileCategoryException;
import io.jetprocess.model.FileCategory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the file category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FileCategoryUtil
 * @generated
 */
@ProviderType
public interface FileCategoryPersistence extends BasePersistence<FileCategory> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FileCategoryUtil} to access the file category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the file category in the entity cache if it is enabled.
	 *
	 * @param fileCategory the file category
	 */
	public void cacheResult(FileCategory fileCategory);

	/**
	 * Caches the file categories in the entity cache if it is enabled.
	 *
	 * @param fileCategories the file categories
	 */
	public void cacheResult(java.util.List<FileCategory> fileCategories);

	/**
	 * Creates a new file category with the primary key. Does not add the file category to the database.
	 *
	 * @param id the primary key for the new file category
	 * @return the new file category
	 */
	public FileCategory create(long id);

	/**
	 * Removes the file category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the file category
	 * @return the file category that was removed
	 * @throws NoSuchFileCategoryException if a file category with the primary key could not be found
	 */
	public FileCategory remove(long id) throws NoSuchFileCategoryException;

	public FileCategory updateImpl(FileCategory fileCategory);

	/**
	 * Returns the file category with the primary key or throws a <code>NoSuchFileCategoryException</code> if it could not be found.
	 *
	 * @param id the primary key of the file category
	 * @return the file category
	 * @throws NoSuchFileCategoryException if a file category with the primary key could not be found
	 */
	public FileCategory findByPrimaryKey(long id)
		throws NoSuchFileCategoryException;

	/**
	 * Returns the file category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the file category
	 * @return the file category, or <code>null</code> if a file category with the primary key could not be found
	 */
	public FileCategory fetchByPrimaryKey(long id);

	/**
	 * Returns all the file categories.
	 *
	 * @return the file categories
	 */
	public java.util.List<FileCategory> findAll();

	/**
	 * Returns a range of all the file categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FileCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of file categories
	 * @param end the upper bound of the range of file categories (not inclusive)
	 * @return the range of file categories
	 */
	public java.util.List<FileCategory> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the file categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FileCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of file categories
	 * @param end the upper bound of the range of file categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of file categories
	 */
	public java.util.List<FileCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FileCategory>
			orderByComparator);

	/**
	 * Returns an ordered range of all the file categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FileCategoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of file categories
	 * @param end the upper bound of the range of file categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of file categories
	 */
	public java.util.List<FileCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FileCategory>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the file categories from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of file categories.
	 *
	 * @return the number of file categories
	 */
	public int countAll();

}