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

import io.jetprocess.exception.NoSuchOrganizationException;
import io.jetprocess.model.Organization;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrganizationUtil
 * @generated
 */
@ProviderType
public interface OrganizationPersistence extends BasePersistence<Organization> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrganizationUtil} to access the organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the organizations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching organizations
	 */
	public java.util.List<Organization> findByUuid(String uuid);

	/**
	 * Returns a range of all the organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @return the range of matching organizations
	 */
	public java.util.List<Organization> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching organizations
	 */
	public java.util.List<Organization> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Organization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching organizations
	 */
	public java.util.List<Organization> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Organization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching organization
	 * @throws NoSuchOrganizationException if a matching organization could not be found
	 */
	public Organization findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Organization>
				orderByComparator)
		throws NoSuchOrganizationException;

	/**
	 * Returns the first organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching organization, or <code>null</code> if a matching organization could not be found
	 */
	public Organization fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Organization>
			orderByComparator);

	/**
	 * Returns the last organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching organization
	 * @throws NoSuchOrganizationException if a matching organization could not be found
	 */
	public Organization findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Organization>
				orderByComparator)
		throws NoSuchOrganizationException;

	/**
	 * Returns the last organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching organization, or <code>null</code> if a matching organization could not be found
	 */
	public Organization fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Organization>
			orderByComparator);

	/**
	 * Returns the organizations before and after the current organization in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current organization
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next organization
	 * @throws NoSuchOrganizationException if a organization with the primary key could not be found
	 */
	public Organization[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Organization>
				orderByComparator)
		throws NoSuchOrganizationException;

	/**
	 * Removes all the organizations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of organizations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching organizations
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the organization in the entity cache if it is enabled.
	 *
	 * @param organization the organization
	 */
	public void cacheResult(Organization organization);

	/**
	 * Caches the organizations in the entity cache if it is enabled.
	 *
	 * @param organizations the organizations
	 */
	public void cacheResult(java.util.List<Organization> organizations);

	/**
	 * Creates a new organization with the primary key. Does not add the organization to the database.
	 *
	 * @param id the primary key for the new organization
	 * @return the new organization
	 */
	public Organization create(long id);

	/**
	 * Removes the organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the organization
	 * @return the organization that was removed
	 * @throws NoSuchOrganizationException if a organization with the primary key could not be found
	 */
	public Organization remove(long id) throws NoSuchOrganizationException;

	public Organization updateImpl(Organization organization);

	/**
	 * Returns the organization with the primary key or throws a <code>NoSuchOrganizationException</code> if it could not be found.
	 *
	 * @param id the primary key of the organization
	 * @return the organization
	 * @throws NoSuchOrganizationException if a organization with the primary key could not be found
	 */
	public Organization findByPrimaryKey(long id)
		throws NoSuchOrganizationException;

	/**
	 * Returns the organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the organization
	 * @return the organization, or <code>null</code> if a organization with the primary key could not be found
	 */
	public Organization fetchByPrimaryKey(long id);

	/**
	 * Returns all the organizations.
	 *
	 * @return the organizations
	 */
	public java.util.List<Organization> findAll();

	/**
	 * Returns a range of all the organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @return the range of organizations
	 */
	public java.util.List<Organization> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of organizations
	 */
	public java.util.List<Organization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Organization>
			orderByComparator);

	/**
	 * Returns an ordered range of all the organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of organizations
	 * @param end the upper bound of the range of organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of organizations
	 */
	public java.util.List<Organization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Organization>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the organizations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of organizations.
	 *
	 * @return the number of organizations
	 */
	public int countAll();

}