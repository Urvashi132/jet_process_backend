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

import io.jetprocess.exception.NoSuchDeliveryModeException;
import io.jetprocess.model.DeliveryMode;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the delivery mode service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DeliveryModeUtil
 * @generated
 */
@ProviderType
public interface DeliveryModePersistence extends BasePersistence<DeliveryMode> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DeliveryModeUtil} to access the delivery mode persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the delivery mode in the entity cache if it is enabled.
	 *
	 * @param deliveryMode the delivery mode
	 */
	public void cacheResult(DeliveryMode deliveryMode);

	/**
	 * Caches the delivery modes in the entity cache if it is enabled.
	 *
	 * @param deliveryModes the delivery modes
	 */
	public void cacheResult(java.util.List<DeliveryMode> deliveryModes);

	/**
	 * Creates a new delivery mode with the primary key. Does not add the delivery mode to the database.
	 *
	 * @param id the primary key for the new delivery mode
	 * @return the new delivery mode
	 */
	public DeliveryMode create(long id);

	/**
	 * Removes the delivery mode with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the delivery mode
	 * @return the delivery mode that was removed
	 * @throws NoSuchDeliveryModeException if a delivery mode with the primary key could not be found
	 */
	public DeliveryMode remove(long id) throws NoSuchDeliveryModeException;

	public DeliveryMode updateImpl(DeliveryMode deliveryMode);

	/**
	 * Returns the delivery mode with the primary key or throws a <code>NoSuchDeliveryModeException</code> if it could not be found.
	 *
	 * @param id the primary key of the delivery mode
	 * @return the delivery mode
	 * @throws NoSuchDeliveryModeException if a delivery mode with the primary key could not be found
	 */
	public DeliveryMode findByPrimaryKey(long id)
		throws NoSuchDeliveryModeException;

	/**
	 * Returns the delivery mode with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the delivery mode
	 * @return the delivery mode, or <code>null</code> if a delivery mode with the primary key could not be found
	 */
	public DeliveryMode fetchByPrimaryKey(long id);

	/**
	 * Returns all the delivery modes.
	 *
	 * @return the delivery modes
	 */
	public java.util.List<DeliveryMode> findAll();

	/**
	 * Returns a range of all the delivery modes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeliveryModeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of delivery modes
	 * @param end the upper bound of the range of delivery modes (not inclusive)
	 * @return the range of delivery modes
	 */
	public java.util.List<DeliveryMode> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the delivery modes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeliveryModeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of delivery modes
	 * @param end the upper bound of the range of delivery modes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of delivery modes
	 */
	public java.util.List<DeliveryMode> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DeliveryMode>
			orderByComparator);

	/**
	 * Returns an ordered range of all the delivery modes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DeliveryModeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of delivery modes
	 * @param end the upper bound of the range of delivery modes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of delivery modes
	 */
	public java.util.List<DeliveryMode> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DeliveryMode>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the delivery modes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of delivery modes.
	 *
	 * @return the number of delivery modes
	 */
	public int countAll();

}