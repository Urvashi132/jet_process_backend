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

import io.jetprocess.exception.NoSuchDocumentNoteMappingException;
import io.jetprocess.model.DocumentNoteMapping;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the document note mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DocumentNoteMappingUtil
 * @generated
 */
@ProviderType
public interface DocumentNoteMappingPersistence
	extends BasePersistence<DocumentNoteMapping> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DocumentNoteMappingUtil} to access the document note mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the document note mappings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching document note mappings
	 */
	public java.util.List<DocumentNoteMapping> findByUuid(String uuid);

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
	public java.util.List<DocumentNoteMapping> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<DocumentNoteMapping> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentNoteMapping>
			orderByComparator);

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
	public java.util.List<DocumentNoteMapping> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentNoteMapping>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException;

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentNoteMapping>
			orderByComparator);

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException;

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentNoteMapping>
			orderByComparator);

	/**
	 * Returns the document note mappings before and after the current document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current document note mapping
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	public DocumentNoteMapping[] findByUuid_PrevAndNext(
			long id, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException;

	/**
	 * Removes all the document note mappings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of document note mappings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching document note mappings
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the document note mapping where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDocumentNoteMappingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping findByUUID_G(String uuid, long groupId)
		throws NoSuchDocumentNoteMappingException;

	/**
	 * Returns the document note mapping where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the document note mapping where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the document note mapping where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the document note mapping that was removed
	 */
	public DocumentNoteMapping removeByUUID_G(String uuid, long groupId)
		throws NoSuchDocumentNoteMappingException;

	/**
	 * Returns the number of document note mappings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching document note mappings
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the document note mappings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching document note mappings
	 */
	public java.util.List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentNoteMapping>
			orderByComparator);

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
	public java.util.List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentNoteMapping>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException;

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentNoteMapping>
			orderByComparator);

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException;

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	public DocumentNoteMapping fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentNoteMapping>
			orderByComparator);

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
	public DocumentNoteMapping[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException;

	/**
	 * Removes all the document note mappings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of document note mappings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching document note mappings
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the document note mapping in the entity cache if it is enabled.
	 *
	 * @param documentNoteMapping the document note mapping
	 */
	public void cacheResult(DocumentNoteMapping documentNoteMapping);

	/**
	 * Caches the document note mappings in the entity cache if it is enabled.
	 *
	 * @param documentNoteMappings the document note mappings
	 */
	public void cacheResult(
		java.util.List<DocumentNoteMapping> documentNoteMappings);

	/**
	 * Creates a new document note mapping with the primary key. Does not add the document note mapping to the database.
	 *
	 * @param id the primary key for the new document note mapping
	 * @return the new document note mapping
	 */
	public DocumentNoteMapping create(long id);

	/**
	 * Removes the document note mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping that was removed
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	public DocumentNoteMapping remove(long id)
		throws NoSuchDocumentNoteMappingException;

	public DocumentNoteMapping updateImpl(
		DocumentNoteMapping documentNoteMapping);

	/**
	 * Returns the document note mapping with the primary key or throws a <code>NoSuchDocumentNoteMappingException</code> if it could not be found.
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	public DocumentNoteMapping findByPrimaryKey(long id)
		throws NoSuchDocumentNoteMappingException;

	/**
	 * Returns the document note mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping, or <code>null</code> if a document note mapping with the primary key could not be found
	 */
	public DocumentNoteMapping fetchByPrimaryKey(long id);

	/**
	 * Returns all the document note mappings.
	 *
	 * @return the document note mappings
	 */
	public java.util.List<DocumentNoteMapping> findAll();

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
	public java.util.List<DocumentNoteMapping> findAll(int start, int end);

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
	public java.util.List<DocumentNoteMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentNoteMapping>
			orderByComparator);

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
	public java.util.List<DocumentNoteMapping> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DocumentNoteMapping>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the document note mappings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of document note mappings.
	 *
	 * @return the number of document note mappings
	 */
	public int countAll();

}