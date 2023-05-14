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

import io.jetprocess.exception.NoSuchPrimaryHeadException;
import io.jetprocess.model.PrimaryHead;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the primary head service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PrimaryHeadUtil
 * @generated
 */
@ProviderType
public interface PrimaryHeadPersistence extends BasePersistence<PrimaryHead> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PrimaryHeadUtil} to access the primary head persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the primary heads where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @return the matching primary heads
	 */
	public java.util.List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId);

	/**
	 * Returns a range of all the primary heads where basicHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param basicHeadId the basic head ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @return the range of matching primary heads
	 */
	public java.util.List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId, int start, int end);

	/**
	 * Returns an ordered range of all the primary heads where basicHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param basicHeadId the basic head ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching primary heads
	 */
	public java.util.List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PrimaryHead>
			orderByComparator);

	/**
	 * Returns an ordered range of all the primary heads where basicHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param basicHeadId the basic head ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching primary heads
	 */
	public java.util.List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PrimaryHead>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	public PrimaryHead findByPrimaryHeadByBasicHeadId_First(
			long basicHeadId,
			com.liferay.portal.kernel.util.OrderByComparator<PrimaryHead>
				orderByComparator)
		throws NoSuchPrimaryHeadException;

	/**
	 * Returns the first primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	public PrimaryHead fetchByPrimaryHeadByBasicHeadId_First(
		long basicHeadId,
		com.liferay.portal.kernel.util.OrderByComparator<PrimaryHead>
			orderByComparator);

	/**
	 * Returns the last primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	public PrimaryHead findByPrimaryHeadByBasicHeadId_Last(
			long basicHeadId,
			com.liferay.portal.kernel.util.OrderByComparator<PrimaryHead>
				orderByComparator)
		throws NoSuchPrimaryHeadException;

	/**
	 * Returns the last primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	public PrimaryHead fetchByPrimaryHeadByBasicHeadId_Last(
		long basicHeadId,
		com.liferay.portal.kernel.util.OrderByComparator<PrimaryHead>
			orderByComparator);

	/**
	 * Returns the primary heads before and after the current primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param id the primary key of the current primary head
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next primary head
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	public PrimaryHead[] findByPrimaryHeadByBasicHeadId_PrevAndNext(
			long id, long basicHeadId,
			com.liferay.portal.kernel.util.OrderByComparator<PrimaryHead>
				orderByComparator)
		throws NoSuchPrimaryHeadException;

	/**
	 * Removes all the primary heads where basicHeadId = &#63; from the database.
	 *
	 * @param basicHeadId the basic head ID
	 */
	public void removeByPrimaryHeadByBasicHeadId(long basicHeadId);

	/**
	 * Returns the number of primary heads where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @return the number of matching primary heads
	 */
	public int countByPrimaryHeadByBasicHeadId(long basicHeadId);

	/**
	 * Caches the primary head in the entity cache if it is enabled.
	 *
	 * @param primaryHead the primary head
	 */
	public void cacheResult(PrimaryHead primaryHead);

	/**
	 * Caches the primary heads in the entity cache if it is enabled.
	 *
	 * @param primaryHeads the primary heads
	 */
	public void cacheResult(java.util.List<PrimaryHead> primaryHeads);

	/**
	 * Creates a new primary head with the primary key. Does not add the primary head to the database.
	 *
	 * @param id the primary key for the new primary head
	 * @return the new primary head
	 */
	public PrimaryHead create(long id);

	/**
	 * Removes the primary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the primary head
	 * @return the primary head that was removed
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	public PrimaryHead remove(long id) throws NoSuchPrimaryHeadException;

	public PrimaryHead updateImpl(PrimaryHead primaryHead);

	/**
	 * Returns the primary head with the primary key or throws a <code>NoSuchPrimaryHeadException</code> if it could not be found.
	 *
	 * @param id the primary key of the primary head
	 * @return the primary head
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	public PrimaryHead findByPrimaryKey(long id)
		throws NoSuchPrimaryHeadException;

	/**
	 * Returns the primary head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the primary head
	 * @return the primary head, or <code>null</code> if a primary head with the primary key could not be found
	 */
	public PrimaryHead fetchByPrimaryKey(long id);

	/**
	 * Returns all the primary heads.
	 *
	 * @return the primary heads
	 */
	public java.util.List<PrimaryHead> findAll();

	/**
	 * Returns a range of all the primary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @return the range of primary heads
	 */
	public java.util.List<PrimaryHead> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the primary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of primary heads
	 */
	public java.util.List<PrimaryHead> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PrimaryHead>
			orderByComparator);

	/**
	 * Returns an ordered range of all the primary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of primary heads
	 */
	public java.util.List<PrimaryHead> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PrimaryHead>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the primary heads from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of primary heads.
	 *
	 * @return the number of primary heads
	 */
	public int countAll();

}