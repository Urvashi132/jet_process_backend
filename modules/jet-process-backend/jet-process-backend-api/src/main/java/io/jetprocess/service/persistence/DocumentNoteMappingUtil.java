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

import io.jetprocess.model.DocumentNoteMapping;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the document note mapping service. This utility wraps <code>io.jetprocess.service.persistence.impl.DocumentNoteMappingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentNoteMappingPersistence
 * @generated
 */
public class DocumentNoteMappingUtil {

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
	public static void clearCache(DocumentNoteMapping documentNoteMapping) {
		getPersistence().clearCache(documentNoteMapping);
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
	public static Map<Serializable, DocumentNoteMapping> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DocumentNoteMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DocumentNoteMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DocumentNoteMapping> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DocumentNoteMapping update(
		DocumentNoteMapping documentNoteMapping) {

		return getPersistence().update(documentNoteMapping);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DocumentNoteMapping update(
		DocumentNoteMapping documentNoteMapping,
		ServiceContext serviceContext) {

		return getPersistence().update(documentNoteMapping, serviceContext);
	}

	/**
	 * Returns all the document note mappings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching document note mappings
	 */
	public static List<DocumentNoteMapping> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the document note mappings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentNoteMappingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @return the range of matching document note mappings
	 */
	public static List<DocumentNoteMapping> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the document note mappings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentNoteMappingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document note mappings
	 */
	public static List<DocumentNoteMapping> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the document note mappings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentNoteMappingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching document note mappings
	 */
	public static List<DocumentNoteMapping> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping findByUuid_First(
			String uuid,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws io.jetprocess.exception.NoSuchDocumentNoteMappingException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping fetchByUuid_First(
		String uuid, OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping findByUuid_Last(
			String uuid,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws io.jetprocess.exception.NoSuchDocumentNoteMappingException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping fetchByUuid_Last(
		String uuid, OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the document note mappings before and after the current document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current document note mapping
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	public static DocumentNoteMapping[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws io.jetprocess.exception.NoSuchDocumentNoteMappingException {

		return getPersistence().findByUuid_PrevAndNext(
			id, uuid, orderByComparator);
	}

	/**
	 * Removes all the document note mappings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of document note mappings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching document note mappings
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the document note mapping where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDocumentNoteMappingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping findByUUID_G(String uuid, long groupId)
		throws io.jetprocess.exception.NoSuchDocumentNoteMappingException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the document note mapping where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the document note mapping where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the document note mapping where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the document note mapping that was removed
	 */
	public static DocumentNoteMapping removeByUUID_G(String uuid, long groupId)
		throws io.jetprocess.exception.NoSuchDocumentNoteMappingException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of document note mappings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching document note mappings
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the document note mappings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching document note mappings
	 */
	public static List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the document note mappings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentNoteMappingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @return the range of matching document note mappings
	 */
	public static List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the document note mappings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentNoteMappingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document note mappings
	 */
	public static List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the document note mappings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentNoteMappingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching document note mappings
	 */
	public static List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws io.jetprocess.exception.NoSuchDocumentNoteMappingException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws io.jetprocess.exception.NoSuchDocumentNoteMappingException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public static DocumentNoteMapping fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the document note mappings before and after the current document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current document note mapping
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	public static DocumentNoteMapping[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws io.jetprocess.exception.NoSuchDocumentNoteMappingException {

		return getPersistence().findByUuid_C_PrevAndNext(
			id, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the document note mappings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of document note mappings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching document note mappings
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the document note mapping in the entity cache if it is enabled.
	 *
	 * @param documentNoteMapping the document note mapping
	 */
	public static void cacheResult(DocumentNoteMapping documentNoteMapping) {
		getPersistence().cacheResult(documentNoteMapping);
	}

	/**
	 * Caches the document note mappings in the entity cache if it is enabled.
	 *
	 * @param documentNoteMappings the document note mappings
	 */
	public static void cacheResult(
		List<DocumentNoteMapping> documentNoteMappings) {

		getPersistence().cacheResult(documentNoteMappings);
	}

	/**
	 * Creates a new document note mapping with the primary key. Does not add the document note mapping to the database.
	 *
	 * @param id the primary key for the new document note mapping
	 * @return the new document note mapping
	 */
	public static DocumentNoteMapping create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the document note mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping that was removed
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	public static DocumentNoteMapping remove(long id)
		throws io.jetprocess.exception.NoSuchDocumentNoteMappingException {

		return getPersistence().remove(id);
	}

	public static DocumentNoteMapping updateImpl(
		DocumentNoteMapping documentNoteMapping) {

		return getPersistence().updateImpl(documentNoteMapping);
	}

	/**
	 * Returns the document note mapping with the primary key or throws a <code>NoSuchDocumentNoteMappingException</code> if it could not be found.
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	public static DocumentNoteMapping findByPrimaryKey(long id)
		throws io.jetprocess.exception.NoSuchDocumentNoteMappingException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the document note mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping, or <code>null</code> if a document note mapping with the primary key could not be found
	 */
	public static DocumentNoteMapping fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the document note mappings.
	 *
	 * @return the document note mappings
	 */
	public static List<DocumentNoteMapping> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the document note mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentNoteMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @return the range of document note mappings
	 */
	public static List<DocumentNoteMapping> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the document note mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentNoteMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of document note mappings
	 */
	public static List<DocumentNoteMapping> findAll(
		int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the document note mappings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DocumentNoteMappingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of document note mappings
	 * @param end the upper bound of the range of document note mappings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of document note mappings
	 */
	public static List<DocumentNoteMapping> findAll(
		int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the document note mappings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of document note mappings.
	 *
	 * @return the number of document note mappings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DocumentNoteMappingPersistence getPersistence() {
		return _persistence;
	}

	private static volatile DocumentNoteMappingPersistence _persistence;

}