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

import io.jetprocess.exception.NoSuchPostalException;
import io.jetprocess.model.Postal;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the postal service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PostalUtil
 * @generated
 */
@ProviderType
public interface PostalPersistence extends BasePersistence<Postal> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PostalUtil} to access the postal persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the postals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching postals
	 */
	public java.util.List<Postal> findByUuid(String uuid);

	/**
	 * Returns a range of all the postals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PostalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @return the range of matching postals
	 */
	public java.util.List<Postal> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the postals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PostalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching postals
	 */
	public java.util.List<Postal> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Postal>
			orderByComparator);

	/**
	 * Returns an ordered range of all the postals where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PostalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching postals
	 */
	public java.util.List<Postal> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Postal>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first postal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching postal
	 * @throws NoSuchPostalException if a matching postal could not be found
	 */
	public Postal findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Postal>
				orderByComparator)
		throws NoSuchPostalException;

	/**
	 * Returns the first postal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching postal, or <code>null</code> if a matching postal could not be found
	 */
	public Postal fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Postal>
			orderByComparator);

	/**
	 * Returns the last postal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching postal
	 * @throws NoSuchPostalException if a matching postal could not be found
	 */
	public Postal findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Postal>
				orderByComparator)
		throws NoSuchPostalException;

	/**
	 * Returns the last postal in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching postal, or <code>null</code> if a matching postal could not be found
	 */
	public Postal fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Postal>
			orderByComparator);

	/**
	 * Returns the postals before and after the current postal in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current postal
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next postal
	 * @throws NoSuchPostalException if a postal with the primary key could not be found
	 */
	public Postal[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Postal>
				orderByComparator)
		throws NoSuchPostalException;

	/**
	 * Removes all the postals where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of postals where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching postals
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the postal where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPostalException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching postal
	 * @throws NoSuchPostalException if a matching postal could not be found
	 */
	public Postal findByUUID_G(String uuid, long groupId)
		throws NoSuchPostalException;

	/**
	 * Returns the postal where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching postal, or <code>null</code> if a matching postal could not be found
	 */
	public Postal fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the postal where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching postal, or <code>null</code> if a matching postal could not be found
	 */
	public Postal fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the postal where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the postal that was removed
	 */
	public Postal removeByUUID_G(String uuid, long groupId)
		throws NoSuchPostalException;

	/**
	 * Returns the number of postals where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching postals
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the postals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching postals
	 */
	public java.util.List<Postal> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the postals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PostalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @return the range of matching postals
	 */
	public java.util.List<Postal> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the postals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PostalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching postals
	 */
	public java.util.List<Postal> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Postal>
			orderByComparator);

	/**
	 * Returns an ordered range of all the postals where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PostalModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching postals
	 */
	public java.util.List<Postal> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Postal>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first postal in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching postal
	 * @throws NoSuchPostalException if a matching postal could not be found
	 */
	public Postal findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Postal>
				orderByComparator)
		throws NoSuchPostalException;

	/**
	 * Returns the first postal in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching postal, or <code>null</code> if a matching postal could not be found
	 */
	public Postal fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Postal>
			orderByComparator);

	/**
	 * Returns the last postal in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching postal
	 * @throws NoSuchPostalException if a matching postal could not be found
	 */
	public Postal findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Postal>
				orderByComparator)
		throws NoSuchPostalException;

	/**
	 * Returns the last postal in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching postal, or <code>null</code> if a matching postal could not be found
	 */
	public Postal fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Postal>
			orderByComparator);

	/**
	 * Returns the postals before and after the current postal in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current postal
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next postal
	 * @throws NoSuchPostalException if a postal with the primary key could not be found
	 */
	public Postal[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Postal>
				orderByComparator)
		throws NoSuchPostalException;

	/**
	 * Removes all the postals where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of postals where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching postals
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the postal in the entity cache if it is enabled.
	 *
	 * @param postal the postal
	 */
	public void cacheResult(Postal postal);

	/**
	 * Caches the postals in the entity cache if it is enabled.
	 *
	 * @param postals the postals
	 */
	public void cacheResult(java.util.List<Postal> postals);

	/**
	 * Creates a new postal with the primary key. Does not add the postal to the database.
	 *
	 * @param id the primary key for the new postal
	 * @return the new postal
	 */
	public Postal create(long id);

	/**
	 * Removes the postal with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the postal
	 * @return the postal that was removed
	 * @throws NoSuchPostalException if a postal with the primary key could not be found
	 */
	public Postal remove(long id) throws NoSuchPostalException;

	public Postal updateImpl(Postal postal);

	/**
	 * Returns the postal with the primary key or throws a <code>NoSuchPostalException</code> if it could not be found.
	 *
	 * @param id the primary key of the postal
	 * @return the postal
	 * @throws NoSuchPostalException if a postal with the primary key could not be found
	 */
	public Postal findByPrimaryKey(long id) throws NoSuchPostalException;

	/**
	 * Returns the postal with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the postal
	 * @return the postal, or <code>null</code> if a postal with the primary key could not be found
	 */
	public Postal fetchByPrimaryKey(long id);

	/**
	 * Returns all the postals.
	 *
	 * @return the postals
	 */
	public java.util.List<Postal> findAll();

	/**
	 * Returns a range of all the postals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PostalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @return the range of postals
	 */
	public java.util.List<Postal> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the postals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PostalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of postals
	 */
	public java.util.List<Postal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Postal>
			orderByComparator);

	/**
	 * Returns an ordered range of all the postals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PostalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of postals
	 * @param end the upper bound of the range of postals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of postals
	 */
	public java.util.List<Postal> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Postal>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the postals from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of postals.
	 *
	 * @return the number of postals
	 */
	public int countAll();

}