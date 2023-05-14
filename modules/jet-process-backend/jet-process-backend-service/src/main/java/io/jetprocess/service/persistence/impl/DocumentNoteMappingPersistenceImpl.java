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

package io.jetprocess.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import io.jetprocess.exception.NoSuchDocumentNoteMappingException;
import io.jetprocess.model.DocumentNoteMapping;
import io.jetprocess.model.DocumentNoteMappingTable;
import io.jetprocess.model.impl.DocumentNoteMappingImpl;
import io.jetprocess.model.impl.DocumentNoteMappingModelImpl;
import io.jetprocess.service.persistence.DocumentNoteMappingPersistence;
import io.jetprocess.service.persistence.DocumentNoteMappingUtil;
import io.jetprocess.service.persistence.impl.constants.JPPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the document note mapping service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {DocumentNoteMappingPersistence.class, BasePersistence.class}
)
public class DocumentNoteMappingPersistenceImpl
	extends BasePersistenceImpl<DocumentNoteMapping>
	implements DocumentNoteMappingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DocumentNoteMappingUtil</code> to access the document note mapping persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DocumentNoteMappingImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the document note mappings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching document note mappings
	 */
	@Override
	public List<DocumentNoteMapping> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DocumentNoteMapping> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<DocumentNoteMapping> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<DocumentNoteMapping> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<DocumentNoteMapping> list = null;

		if (useFinderCache) {
			list = (List<DocumentNoteMapping>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (DocumentNoteMapping documentNoteMapping : list) {
					if (!uuid.equals(documentNoteMapping.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_DOCUMENTNOTEMAPPING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DocumentNoteMappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<DocumentNoteMapping>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	@Override
	public DocumentNoteMapping findByUuid_First(
			String uuid,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException {

		DocumentNoteMapping documentNoteMapping = fetchByUuid_First(
			uuid, orderByComparator);

		if (documentNoteMapping != null) {
			return documentNoteMapping;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDocumentNoteMappingException(sb.toString());
	}

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	@Override
	public DocumentNoteMapping fetchByUuid_First(
		String uuid, OrderByComparator<DocumentNoteMapping> orderByComparator) {

		List<DocumentNoteMapping> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	@Override
	public DocumentNoteMapping findByUuid_Last(
			String uuid,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException {

		DocumentNoteMapping documentNoteMapping = fetchByUuid_Last(
			uuid, orderByComparator);

		if (documentNoteMapping != null) {
			return documentNoteMapping;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDocumentNoteMappingException(sb.toString());
	}

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	@Override
	public DocumentNoteMapping fetchByUuid_Last(
		String uuid, OrderByComparator<DocumentNoteMapping> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DocumentNoteMapping> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DocumentNoteMapping[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException {

		uuid = Objects.toString(uuid, "");

		DocumentNoteMapping documentNoteMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DocumentNoteMapping[] array = new DocumentNoteMappingImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, documentNoteMapping, uuid, orderByComparator, true);

			array[1] = documentNoteMapping;

			array[2] = getByUuid_PrevAndNext(
				session, documentNoteMapping, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentNoteMapping getByUuid_PrevAndNext(
		Session session, DocumentNoteMapping documentNoteMapping, String uuid,
		OrderByComparator<DocumentNoteMapping> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DOCUMENTNOTEMAPPING_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(DocumentNoteMappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						documentNoteMapping)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DocumentNoteMapping> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document note mappings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DocumentNoteMapping documentNoteMapping :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(documentNoteMapping);
		}
	}

	/**
	 * Returns the number of document note mappings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching document note mappings
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DOCUMENTNOTEMAPPING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"documentNoteMapping.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(documentNoteMapping.uuid IS NULL OR documentNoteMapping.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the document note mapping where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDocumentNoteMappingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a matching document note mapping could not be found
	 */
	@Override
	public DocumentNoteMapping findByUUID_G(String uuid, long groupId)
		throws NoSuchDocumentNoteMappingException {

		DocumentNoteMapping documentNoteMapping = fetchByUUID_G(uuid, groupId);

		if (documentNoteMapping == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDocumentNoteMappingException(sb.toString());
		}

		return documentNoteMapping;
	}

	/**
	 * Returns the document note mapping where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	@Override
	public DocumentNoteMapping fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the document note mapping where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	@Override
	public DocumentNoteMapping fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs);
		}

		if (result instanceof DocumentNoteMapping) {
			DocumentNoteMapping documentNoteMapping =
				(DocumentNoteMapping)result;

			if (!Objects.equals(uuid, documentNoteMapping.getUuid()) ||
				(groupId != documentNoteMapping.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_DOCUMENTNOTEMAPPING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<DocumentNoteMapping> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					DocumentNoteMapping documentNoteMapping = list.get(0);

					result = documentNoteMapping;

					cacheResult(documentNoteMapping);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DocumentNoteMapping)result;
		}
	}

	/**
	 * Removes the document note mapping where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the document note mapping that was removed
	 */
	@Override
	public DocumentNoteMapping removeByUUID_G(String uuid, long groupId)
		throws NoSuchDocumentNoteMappingException {

		DocumentNoteMapping documentNoteMapping = findByUUID_G(uuid, groupId);

		return remove(documentNoteMapping);
	}

	/**
	 * Returns the number of document note mappings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching document note mappings
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DOCUMENTNOTEMAPPING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"documentNoteMapping.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(documentNoteMapping.uuid IS NULL OR documentNoteMapping.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"documentNoteMapping.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the document note mappings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching document note mappings
	 */
	@Override
	public List<DocumentNoteMapping> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<DocumentNoteMapping> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<DocumentNoteMapping> list = null;

		if (useFinderCache) {
			list = (List<DocumentNoteMapping>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (DocumentNoteMapping documentNoteMapping : list) {
					if (!uuid.equals(documentNoteMapping.getUuid()) ||
						(companyId != documentNoteMapping.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_DOCUMENTNOTEMAPPING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DocumentNoteMappingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<DocumentNoteMapping>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public DocumentNoteMapping findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException {

		DocumentNoteMapping documentNoteMapping = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (documentNoteMapping != null) {
			return documentNoteMapping;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDocumentNoteMappingException(sb.toString());
	}

	/**
	 * Returns the first document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	@Override
	public DocumentNoteMapping fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		List<DocumentNoteMapping> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DocumentNoteMapping findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException {

		DocumentNoteMapping documentNoteMapping = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (documentNoteMapping != null) {
			return documentNoteMapping;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDocumentNoteMappingException(sb.toString());
	}

	/**
	 * Returns the last document note mapping in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document note mapping, or <code>null</code> if a matching document note mapping could not be found
	 */
	@Override
	public DocumentNoteMapping fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DocumentNoteMapping> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DocumentNoteMapping[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<DocumentNoteMapping> orderByComparator)
		throws NoSuchDocumentNoteMappingException {

		uuid = Objects.toString(uuid, "");

		DocumentNoteMapping documentNoteMapping = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DocumentNoteMapping[] array = new DocumentNoteMappingImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, documentNoteMapping, uuid, companyId,
				orderByComparator, true);

			array[1] = documentNoteMapping;

			array[2] = getByUuid_C_PrevAndNext(
				session, documentNoteMapping, uuid, companyId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentNoteMapping getByUuid_C_PrevAndNext(
		Session session, DocumentNoteMapping documentNoteMapping, String uuid,
		long companyId,
		OrderByComparator<DocumentNoteMapping> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_DOCUMENTNOTEMAPPING_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(DocumentNoteMappingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						documentNoteMapping)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DocumentNoteMapping> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document note mappings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (DocumentNoteMapping documentNoteMapping :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(documentNoteMapping);
		}
	}

	/**
	 * Returns the number of document note mappings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching document note mappings
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DOCUMENTNOTEMAPPING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"documentNoteMapping.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(documentNoteMapping.uuid IS NULL OR documentNoteMapping.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"documentNoteMapping.companyId = ?";

	public DocumentNoteMappingPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DocumentNoteMapping.class);

		setModelImplClass(DocumentNoteMappingImpl.class);
		setModelPKClass(long.class);

		setTable(DocumentNoteMappingTable.INSTANCE);
	}

	/**
	 * Caches the document note mapping in the entity cache if it is enabled.
	 *
	 * @param documentNoteMapping the document note mapping
	 */
	@Override
	public void cacheResult(DocumentNoteMapping documentNoteMapping) {
		entityCache.putResult(
			DocumentNoteMappingImpl.class, documentNoteMapping.getPrimaryKey(),
			documentNoteMapping);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				documentNoteMapping.getUuid(), documentNoteMapping.getGroupId()
			},
			documentNoteMapping);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the document note mappings in the entity cache if it is enabled.
	 *
	 * @param documentNoteMappings the document note mappings
	 */
	@Override
	public void cacheResult(List<DocumentNoteMapping> documentNoteMappings) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (documentNoteMappings.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DocumentNoteMapping documentNoteMapping : documentNoteMappings) {
			if (entityCache.getResult(
					DocumentNoteMappingImpl.class,
					documentNoteMapping.getPrimaryKey()) == null) {

				cacheResult(documentNoteMapping);
			}
		}
	}

	/**
	 * Clears the cache for all document note mappings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DocumentNoteMappingImpl.class);

		finderCache.clearCache(DocumentNoteMappingImpl.class);
	}

	/**
	 * Clears the cache for the document note mapping.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocumentNoteMapping documentNoteMapping) {
		entityCache.removeResult(
			DocumentNoteMappingImpl.class, documentNoteMapping);
	}

	@Override
	public void clearCache(List<DocumentNoteMapping> documentNoteMappings) {
		for (DocumentNoteMapping documentNoteMapping : documentNoteMappings) {
			entityCache.removeResult(
				DocumentNoteMappingImpl.class, documentNoteMapping);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DocumentNoteMappingImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DocumentNoteMappingImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DocumentNoteMappingModelImpl documentNoteMappingModelImpl) {

		Object[] args = new Object[] {
			documentNoteMappingModelImpl.getUuid(),
			documentNoteMappingModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, documentNoteMappingModelImpl);
	}

	/**
	 * Creates a new document note mapping with the primary key. Does not add the document note mapping to the database.
	 *
	 * @param id the primary key for the new document note mapping
	 * @return the new document note mapping
	 */
	@Override
	public DocumentNoteMapping create(long id) {
		DocumentNoteMapping documentNoteMapping = new DocumentNoteMappingImpl();

		documentNoteMapping.setNew(true);
		documentNoteMapping.setPrimaryKey(id);

		String uuid = PortalUUIDUtil.generate();

		documentNoteMapping.setUuid(uuid);

		documentNoteMapping.setCompanyId(CompanyThreadLocal.getCompanyId());

		return documentNoteMapping;
	}

	/**
	 * Removes the document note mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping that was removed
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	@Override
	public DocumentNoteMapping remove(long id)
		throws NoSuchDocumentNoteMappingException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the document note mapping with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the document note mapping
	 * @return the document note mapping that was removed
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	@Override
	public DocumentNoteMapping remove(Serializable primaryKey)
		throws NoSuchDocumentNoteMappingException {

		Session session = null;

		try {
			session = openSession();

			DocumentNoteMapping documentNoteMapping =
				(DocumentNoteMapping)session.get(
					DocumentNoteMappingImpl.class, primaryKey);

			if (documentNoteMapping == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentNoteMappingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(documentNoteMapping);
		}
		catch (NoSuchDocumentNoteMappingException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected DocumentNoteMapping removeImpl(
		DocumentNoteMapping documentNoteMapping) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(documentNoteMapping)) {
				documentNoteMapping = (DocumentNoteMapping)session.get(
					DocumentNoteMappingImpl.class,
					documentNoteMapping.getPrimaryKeyObj());
			}

			if (documentNoteMapping != null) {
				session.delete(documentNoteMapping);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (documentNoteMapping != null) {
			clearCache(documentNoteMapping);
		}

		return documentNoteMapping;
	}

	@Override
	public DocumentNoteMapping updateImpl(
		DocumentNoteMapping documentNoteMapping) {

		boolean isNew = documentNoteMapping.isNew();

		if (!(documentNoteMapping instanceof DocumentNoteMappingModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(documentNoteMapping.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					documentNoteMapping);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in documentNoteMapping proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DocumentNoteMapping implementation " +
					documentNoteMapping.getClass());
		}

		DocumentNoteMappingModelImpl documentNoteMappingModelImpl =
			(DocumentNoteMappingModelImpl)documentNoteMapping;

		if (Validator.isNull(documentNoteMapping.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			documentNoteMapping.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (documentNoteMapping.getCreateDate() == null)) {
			if (serviceContext == null) {
				documentNoteMapping.setCreateDate(date);
			}
			else {
				documentNoteMapping.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!documentNoteMappingModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				documentNoteMapping.setModifiedDate(date);
			}
			else {
				documentNoteMapping.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(documentNoteMapping);
			}
			else {
				documentNoteMapping = (DocumentNoteMapping)session.merge(
					documentNoteMapping);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DocumentNoteMappingImpl.class, documentNoteMappingModelImpl, false,
			true);

		cacheUniqueFindersCache(documentNoteMappingModelImpl);

		if (isNew) {
			documentNoteMapping.setNew(false);
		}

		documentNoteMapping.resetOriginalValues();

		return documentNoteMapping;
	}

	/**
	 * Returns the document note mapping with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the document note mapping
	 * @return the document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	@Override
	public DocumentNoteMapping findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocumentNoteMappingException {

		DocumentNoteMapping documentNoteMapping = fetchByPrimaryKey(primaryKey);

		if (documentNoteMapping == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocumentNoteMappingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return documentNoteMapping;
	}

	/**
	 * Returns the document note mapping with the primary key or throws a <code>NoSuchDocumentNoteMappingException</code> if it could not be found.
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping
	 * @throws NoSuchDocumentNoteMappingException if a document note mapping with the primary key could not be found
	 */
	@Override
	public DocumentNoteMapping findByPrimaryKey(long id)
		throws NoSuchDocumentNoteMappingException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the document note mapping with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the document note mapping
	 * @return the document note mapping, or <code>null</code> if a document note mapping with the primary key could not be found
	 */
	@Override
	public DocumentNoteMapping fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the document note mappings.
	 *
	 * @return the document note mappings
	 */
	@Override
	public List<DocumentNoteMapping> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DocumentNoteMapping> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<DocumentNoteMapping> findAll(
		int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<DocumentNoteMapping> findAll(
		int start, int end,
		OrderByComparator<DocumentNoteMapping> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<DocumentNoteMapping> list = null;

		if (useFinderCache) {
			list = (List<DocumentNoteMapping>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DOCUMENTNOTEMAPPING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENTNOTEMAPPING;

				sql = sql.concat(DocumentNoteMappingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DocumentNoteMapping>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the document note mappings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DocumentNoteMapping documentNoteMapping : findAll()) {
			remove(documentNoteMapping);
		}
	}

	/**
	 * Returns the number of document note mappings.
	 *
	 * @return the number of document note mappings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_DOCUMENTNOTEMAPPING);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id_";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DOCUMENTNOTEMAPPING;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DocumentNoteMappingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the document note mapping persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_setDocumentNoteMappingUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setDocumentNoteMappingUtilPersistence(null);

		entityCache.removeCache(DocumentNoteMappingImpl.class.getName());
	}

	private void _setDocumentNoteMappingUtilPersistence(
		DocumentNoteMappingPersistence documentNoteMappingPersistence) {

		try {
			Field field = DocumentNoteMappingUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, documentNoteMappingPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = JPPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JPPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JPPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DOCUMENTNOTEMAPPING =
		"SELECT documentNoteMapping FROM DocumentNoteMapping documentNoteMapping";

	private static final String _SQL_SELECT_DOCUMENTNOTEMAPPING_WHERE =
		"SELECT documentNoteMapping FROM DocumentNoteMapping documentNoteMapping WHERE ";

	private static final String _SQL_COUNT_DOCUMENTNOTEMAPPING =
		"SELECT COUNT(documentNoteMapping) FROM DocumentNoteMapping documentNoteMapping";

	private static final String _SQL_COUNT_DOCUMENTNOTEMAPPING_WHERE =
		"SELECT COUNT(documentNoteMapping) FROM DocumentNoteMapping documentNoteMapping WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "documentNoteMapping.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DocumentNoteMapping exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DocumentNoteMapping exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DocumentNoteMappingPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private DocumentNoteMappingModelArgumentsResolver
		_documentNoteMappingModelArgumentsResolver;

}