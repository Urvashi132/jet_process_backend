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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import io.jetprocess.model.DraftRecipient;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the draft recipient service. This utility wraps <code>io.jetprocess.service.persistence.impl.DraftRecipientPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DraftRecipientPersistence
 * @generated
 */
public class DraftRecipientUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(DraftRecipient draftRecipient) {
		getPersistence().clearCache(draftRecipient);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, DraftRecipient> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DraftRecipient> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DraftRecipient> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DraftRecipient> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DraftRecipient update(DraftRecipient draftRecipient) {
		return getPersistence().update(draftRecipient);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DraftRecipient update(
		DraftRecipient draftRecipient, ServiceContext serviceContext) {

		return getPersistence().update(draftRecipient, serviceContext);
	}

	/**
	 * Returns all the draft recipients where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching draft recipients
	 */
	public static List<DraftRecipient> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the draft recipients where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @return the range of matching draft recipients
	 */
	public static List<DraftRecipient> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the draft recipients where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching draft recipients
	 */
	public static List<DraftRecipient> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the draft recipients where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching draft recipients
	 */
	public static List<DraftRecipient> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public static DraftRecipient findByUuid_First(
			String uuid, OrderByComparator<DraftRecipient> orderByComparator)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public static DraftRecipient fetchByUuid_First(
		String uuid, OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public static DraftRecipient findByUuid_Last(
			String uuid, OrderByComparator<DraftRecipient> orderByComparator)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public static DraftRecipient fetchByUuid_Last(
		String uuid, OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the draft recipients before and after the current draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current draft recipient
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next draft recipient
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	public static DraftRecipient[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<DraftRecipient> orderByComparator)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the draft recipients where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of draft recipients where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching draft recipients
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the draft recipient where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDraftRecipientException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public static DraftRecipient findByUUID_G(String uuid, long groupId)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the draft recipient where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public static DraftRecipient fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the draft recipient where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public static DraftRecipient fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the draft recipient where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the draft recipient that was removed
	 */
	public static DraftRecipient removeByUUID_G(String uuid, long groupId)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of draft recipients where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching draft recipients
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching draft recipients
	 */
	public static List<DraftRecipient> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @return the range of matching draft recipients
	 */
	public static List<DraftRecipient> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching draft recipients
	 */
	public static List<DraftRecipient> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching draft recipients
	 */
	public static List<DraftRecipient> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public static DraftRecipient findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DraftRecipient> orderByComparator)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public static DraftRecipient fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public static DraftRecipient findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DraftRecipient> orderByComparator)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public static DraftRecipient fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the draft recipients before and after the current draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current draft recipient
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next draft recipient
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	public static DraftRecipient[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<DraftRecipient> orderByComparator)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByUuid_C_PrevAndNext(
			id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the draft recipients where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching draft recipients
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the draft recipients where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @return the matching draft recipients
	 */
	public static List<DraftRecipient> findByDraftId(long draftId) {
		return getPersistence().findByDraftId(draftId);
	}

	/**
	 * Returns a range of all the draft recipients where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @return the range of matching draft recipients
	 */
	public static List<DraftRecipient> findByDraftId(
		long draftId, int start, int end) {

		return getPersistence().findByDraftId(draftId, start, end);
	}

	/**
	 * Returns an ordered range of all the draft recipients where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching draft recipients
	 */
	public static List<DraftRecipient> findByDraftId(
		long draftId, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().findByDraftId(
			draftId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the draft recipients where draftId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param draftId the draft ID
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching draft recipients
	 */
	public static List<DraftRecipient> findByDraftId(
		long draftId, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByDraftId(
			draftId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public static DraftRecipient findByDraftId_First(
			long draftId, OrderByComparator<DraftRecipient> orderByComparator)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByDraftId_First(draftId, orderByComparator);
	}

	/**
	 * Returns the first draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public static DraftRecipient fetchByDraftId_First(
		long draftId, OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().fetchByDraftId_First(
			draftId, orderByComparator);
	}

	/**
	 * Returns the last draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	public static DraftRecipient findByDraftId_Last(
			long draftId, OrderByComparator<DraftRecipient> orderByComparator)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByDraftId_Last(draftId, orderByComparator);
	}

	/**
	 * Returns the last draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	public static DraftRecipient fetchByDraftId_Last(
		long draftId, OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().fetchByDraftId_Last(draftId, orderByComparator);
	}

	/**
	 * Returns the draft recipients before and after the current draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param id the primary key of the current draft recipient
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next draft recipient
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	public static DraftRecipient[] findByDraftId_PrevAndNext(
			long id, long draftId,
			OrderByComparator<DraftRecipient> orderByComparator)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByDraftId_PrevAndNext(
			id, draftId, orderByComparator);
	}

	/**
	 * Removes all the draft recipients where draftId = &#63; from the database.
	 *
	 * @param draftId the draft ID
	 */
	public static void removeByDraftId(long draftId) {
		getPersistence().removeByDraftId(draftId);
	}

	/**
	 * Returns the number of draft recipients where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @return the number of matching draft recipients
	 */
	public static int countByDraftId(long draftId) {
		return getPersistence().countByDraftId(draftId);
	}

	/**
	 * Caches the draft recipient in the entity cache if it is enabled.
	 *
	 * @param draftRecipient the draft recipient
	 */
	public static void cacheResult(DraftRecipient draftRecipient) {
		getPersistence().cacheResult(draftRecipient);
	}

	/**
	 * Caches the draft recipients in the entity cache if it is enabled.
	 *
	 * @param draftRecipients the draft recipients
	 */
	public static void cacheResult(List<DraftRecipient> draftRecipients) {
		getPersistence().cacheResult(draftRecipients);
	}

	/**
	 * Creates a new draft recipient with the primary key. Does not add the draft recipient to the database.
	 *
	 * @param id the primary key for the new draft recipient
	 * @return the new draft recipient
	 */
	public static DraftRecipient create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the draft recipient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient that was removed
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	public static DraftRecipient remove(long id)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().remove(id);
	}

	public static DraftRecipient updateImpl(DraftRecipient draftRecipient) {
		return getPersistence().updateImpl(draftRecipient);
	}

	/**
	 * Returns the draft recipient with the primary key or throws a <code>NoSuchDraftRecipientException</code> if it could not be found.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	public static DraftRecipient findByPrimaryKey(long id)
		throws io.jetprocess.exception.NoSuchDraftRecipientException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the draft recipient with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient, or <code>null</code> if a draft recipient with the primary key could not be found
	 */
	public static DraftRecipient fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the draft recipients.
	 *
	 * @return the draft recipients
	 */
	public static List<DraftRecipient> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the draft recipients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @return the range of draft recipients
	 */
	public static List<DraftRecipient> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the draft recipients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of draft recipients
	 */
	public static List<DraftRecipient> findAll(
		int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the draft recipients.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DraftRecipientModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of draft recipients
	 * @param end the upper bound of the range of draft recipients (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of draft recipients
	 */
	public static List<DraftRecipient> findAll(
		int start, int end, OrderByComparator<DraftRecipient> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the draft recipients from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of draft recipients.
	 *
	 * @return the number of draft recipients
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DraftRecipientPersistence getPersistence() {
		return _persistence;
	}

	private static volatile DraftRecipientPersistence _persistence;

}