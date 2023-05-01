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

import io.jetprocess.exception.NoSuchTypeException;
import io.jetprocess.model.Type;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TypeUtil
 * @generated
 */
@ProviderType
public interface TypePersistence extends BasePersistence<Type> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TypeUtil} to access the type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching types
	 */
	public java.util.List<Type> findByUuid(String uuid);

	/**
	 * Returns a range of all the types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @return the range of matching types
	 */
	public java.util.List<Type> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching types
	 */
	public java.util.List<Type> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Type>
			orderByComparator);

	/**
	 * Returns an ordered range of all the types where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TypeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching types
	 */
	public java.util.List<Type> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Type>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching type
	 * @throws NoSuchTypeException if a matching type could not be found
	 */
	public Type findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Type>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Returns the first type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching type, or <code>null</code> if a matching type could not be found
	 */
	public Type fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Type>
			orderByComparator);

	/**
	 * Returns the last type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching type
	 * @throws NoSuchTypeException if a matching type could not be found
	 */
	public Type findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Type>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Returns the last type in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching type, or <code>null</code> if a matching type could not be found
	 */
	public Type fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Type>
			orderByComparator);

	/**
	 * Returns the types before and after the current type in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current type
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next type
	 * @throws NoSuchTypeException if a type with the primary key could not be found
	 */
	public Type[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Type>
				orderByComparator)
		throws NoSuchTypeException;

	/**
	 * Removes all the types where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of types where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching types
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the type in the entity cache if it is enabled.
	 *
	 * @param type the type
	 */
	public void cacheResult(Type type);

	/**
	 * Caches the types in the entity cache if it is enabled.
	 *
	 * @param types the types
	 */
	public void cacheResult(java.util.List<Type> types);

	/**
	 * Creates a new type with the primary key. Does not add the type to the database.
	 *
	 * @param id the primary key for the new type
	 * @return the new type
	 */
	public Type create(long id);

	/**
	 * Removes the type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the type
	 * @return the type that was removed
	 * @throws NoSuchTypeException if a type with the primary key could not be found
	 */
	public Type remove(long id) throws NoSuchTypeException;

	public Type updateImpl(Type type);

	/**
	 * Returns the type with the primary key or throws a <code>NoSuchTypeException</code> if it could not be found.
	 *
	 * @param id the primary key of the type
	 * @return the type
	 * @throws NoSuchTypeException if a type with the primary key could not be found
	 */
	public Type findByPrimaryKey(long id) throws NoSuchTypeException;

	/**
	 * Returns the type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the type
	 * @return the type, or <code>null</code> if a type with the primary key could not be found
	 */
	public Type fetchByPrimaryKey(long id);

	/**
	 * Returns all the types.
	 *
	 * @return the types
	 */
	public java.util.List<Type> findAll();

	/**
	 * Returns a range of all the types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @return the range of types
	 */
	public java.util.List<Type> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of types
	 */
	public java.util.List<Type> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Type>
			orderByComparator);

	/**
	 * Returns an ordered range of all the types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TypeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of types
	 * @param end the upper bound of the range of types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of types
	 */
	public java.util.List<Type> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Type>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the types from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of types.
	 *
	 * @return the number of types
	 */
	public int countAll();

}