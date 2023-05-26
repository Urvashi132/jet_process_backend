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

import io.jetprocess.exception.NoSuchNoteDocumentMovementException;
import io.jetprocess.model.NoteDocumentMovement;
import io.jetprocess.model.NoteDocumentMovementTable;
import io.jetprocess.model.impl.NoteDocumentMovementImpl;
import io.jetprocess.model.impl.NoteDocumentMovementModelImpl;
import io.jetprocess.service.persistence.NoteDocumentMovementPersistence;
import io.jetprocess.service.persistence.NoteDocumentMovementUtil;
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
 * The persistence implementation for the note document movement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {NoteDocumentMovementPersistence.class, BasePersistence.class}
)
public class NoteDocumentMovementPersistenceImpl
	extends BasePersistenceImpl<NoteDocumentMovement>
	implements NoteDocumentMovementPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NoteDocumentMovementUtil</code> to access the note document movement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NoteDocumentMovementImpl.class.getName();

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
	 * Returns all the note document movements where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the note document movements where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @return the range of matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the note document movements where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the note document movements where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
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

		List<NoteDocumentMovement> list = null;

		if (useFinderCache) {
			list = (List<NoteDocumentMovement>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (NoteDocumentMovement noteDocumentMovement : list) {
					if (!uuid.equals(noteDocumentMovement.getUuid())) {
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

			sb.append(_SQL_SELECT_NOTEDOCUMENTMOVEMENT_WHERE);

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
				sb.append(NoteDocumentMovementModelImpl.ORDER_BY_JPQL);
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

				list = (List<NoteDocumentMovement>)QueryUtil.list(
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
	 * Returns the first note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement findByUuid_First(
			String uuid,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException {

		NoteDocumentMovement noteDocumentMovement = fetchByUuid_First(
			uuid, orderByComparator);

		if (noteDocumentMovement != null) {
			return noteDocumentMovement;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNoteDocumentMovementException(sb.toString());
	}

	/**
	 * Returns the first note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement fetchByUuid_First(
		String uuid,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		List<NoteDocumentMovement> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement findByUuid_Last(
			String uuid,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException {

		NoteDocumentMovement noteDocumentMovement = fetchByUuid_Last(
			uuid, orderByComparator);

		if (noteDocumentMovement != null) {
			return noteDocumentMovement;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNoteDocumentMovementException(sb.toString());
	}

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement fetchByUuid_Last(
		String uuid,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<NoteDocumentMovement> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the note document movements before and after the current note document movement in the ordered set where uuid = &#63;.
	 *
	 * @param id the primary key of the current note document movement
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	@Override
	public NoteDocumentMovement[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException {

		uuid = Objects.toString(uuid, "");

		NoteDocumentMovement noteDocumentMovement = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			NoteDocumentMovement[] array = new NoteDocumentMovementImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, noteDocumentMovement, uuid, orderByComparator, true);

			array[1] = noteDocumentMovement;

			array[2] = getByUuid_PrevAndNext(
				session, noteDocumentMovement, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NoteDocumentMovement getByUuid_PrevAndNext(
		Session session, NoteDocumentMovement noteDocumentMovement, String uuid,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
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

		sb.append(_SQL_SELECT_NOTEDOCUMENTMOVEMENT_WHERE);

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
			sb.append(NoteDocumentMovementModelImpl.ORDER_BY_JPQL);
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
						noteDocumentMovement)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NoteDocumentMovement> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the note document movements where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (NoteDocumentMovement noteDocumentMovement :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(noteDocumentMovement);
		}
	}

	/**
	 * Returns the number of note document movements where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching note document movements
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NOTEDOCUMENTMOVEMENT_WHERE);

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
		"noteDocumentMovement.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(noteDocumentMovement.uuid IS NULL OR noteDocumentMovement.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the note document movement where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNoteDocumentMovementException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement findByUUID_G(String uuid, long groupId)
		throws NoSuchNoteDocumentMovementException {

		NoteDocumentMovement noteDocumentMovement = fetchByUUID_G(
			uuid, groupId);

		if (noteDocumentMovement == null) {
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

			throw new NoSuchNoteDocumentMovementException(sb.toString());
		}

		return noteDocumentMovement;
	}

	/**
	 * Returns the note document movement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the note document movement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement fetchByUUID_G(
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

		if (result instanceof NoteDocumentMovement) {
			NoteDocumentMovement noteDocumentMovement =
				(NoteDocumentMovement)result;

			if (!Objects.equals(uuid, noteDocumentMovement.getUuid()) ||
				(groupId != noteDocumentMovement.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NOTEDOCUMENTMOVEMENT_WHERE);

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

				List<NoteDocumentMovement> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					NoteDocumentMovement noteDocumentMovement = list.get(0);

					result = noteDocumentMovement;

					cacheResult(noteDocumentMovement);
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
			return (NoteDocumentMovement)result;
		}
	}

	/**
	 * Removes the note document movement where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the note document movement that was removed
	 */
	@Override
	public NoteDocumentMovement removeByUUID_G(String uuid, long groupId)
		throws NoSuchNoteDocumentMovementException {

		NoteDocumentMovement noteDocumentMovement = findByUUID_G(uuid, groupId);

		return remove(noteDocumentMovement);
	}

	/**
	 * Returns the number of note document movements where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching note document movements
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NOTEDOCUMENTMOVEMENT_WHERE);

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
		"noteDocumentMovement.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(noteDocumentMovement.uuid IS NULL OR noteDocumentMovement.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"noteDocumentMovement.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @return the range of matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
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

		List<NoteDocumentMovement> list = null;

		if (useFinderCache) {
			list = (List<NoteDocumentMovement>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (NoteDocumentMovement noteDocumentMovement : list) {
					if (!uuid.equals(noteDocumentMovement.getUuid()) ||
						(companyId != noteDocumentMovement.getCompanyId())) {

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

			sb.append(_SQL_SELECT_NOTEDOCUMENTMOVEMENT_WHERE);

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
				sb.append(NoteDocumentMovementModelImpl.ORDER_BY_JPQL);
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

				list = (List<NoteDocumentMovement>)QueryUtil.list(
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
	 * Returns the first note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException {

		NoteDocumentMovement noteDocumentMovement = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (noteDocumentMovement != null) {
			return noteDocumentMovement;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchNoteDocumentMovementException(sb.toString());
	}

	/**
	 * Returns the first note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		List<NoteDocumentMovement> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException {

		NoteDocumentMovement noteDocumentMovement = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (noteDocumentMovement != null) {
			return noteDocumentMovement;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchNoteDocumentMovementException(sb.toString());
	}

	/**
	 * Returns the last note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<NoteDocumentMovement> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the note document movements before and after the current note document movement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param id the primary key of the current note document movement
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	@Override
	public NoteDocumentMovement[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException {

		uuid = Objects.toString(uuid, "");

		NoteDocumentMovement noteDocumentMovement = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			NoteDocumentMovement[] array = new NoteDocumentMovementImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, noteDocumentMovement, uuid, companyId,
				orderByComparator, true);

			array[1] = noteDocumentMovement;

			array[2] = getByUuid_C_PrevAndNext(
				session, noteDocumentMovement, uuid, companyId,
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

	protected NoteDocumentMovement getByUuid_C_PrevAndNext(
		Session session, NoteDocumentMovement noteDocumentMovement, String uuid,
		long companyId,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
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

		sb.append(_SQL_SELECT_NOTEDOCUMENTMOVEMENT_WHERE);

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
			sb.append(NoteDocumentMovementModelImpl.ORDER_BY_JPQL);
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
						noteDocumentMovement)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NoteDocumentMovement> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the note document movements where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (NoteDocumentMovement noteDocumentMovement :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(noteDocumentMovement);
		}
	}

	/**
	 * Returns the number of note document movements where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching note document movements
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NOTEDOCUMENTMOVEMENT_WHERE);

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
		"noteDocumentMovement.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(noteDocumentMovement.uuid IS NULL OR noteDocumentMovement.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"noteDocumentMovement.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByNoteDocumentId;
	private FinderPath _finderPathWithoutPaginationFindByNoteDocumentId;
	private FinderPath _finderPathCountByNoteDocumentId;

	/**
	 * Returns all the note document movements where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @return the matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByNoteDocumentId(
		long noteDocumentId) {

		return findByNoteDocumentId(
			noteDocumentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the note document movements where noteDocumentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param noteDocumentId the note document ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @return the range of matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByNoteDocumentId(
		long noteDocumentId, int start, int end) {

		return findByNoteDocumentId(noteDocumentId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the note document movements where noteDocumentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param noteDocumentId the note document ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByNoteDocumentId(
		long noteDocumentId, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return findByNoteDocumentId(
			noteDocumentId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the note document movements where noteDocumentId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param noteDocumentId the note document ID
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findByNoteDocumentId(
		long noteDocumentId, int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByNoteDocumentId;
				finderArgs = new Object[] {noteDocumentId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByNoteDocumentId;
			finderArgs = new Object[] {
				noteDocumentId, start, end, orderByComparator
			};
		}

		List<NoteDocumentMovement> list = null;

		if (useFinderCache) {
			list = (List<NoteDocumentMovement>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (NoteDocumentMovement noteDocumentMovement : list) {
					if (noteDocumentId !=
							noteDocumentMovement.getNoteDocumentId()) {

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

			sb.append(_SQL_SELECT_NOTEDOCUMENTMOVEMENT_WHERE);

			sb.append(_FINDER_COLUMN_NOTEDOCUMENTID_NOTEDOCUMENTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NoteDocumentMovementModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(noteDocumentId);

				list = (List<NoteDocumentMovement>)QueryUtil.list(
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
	 * Returns the first note document movement in the ordered set where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement findByNoteDocumentId_First(
			long noteDocumentId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException {

		NoteDocumentMovement noteDocumentMovement = fetchByNoteDocumentId_First(
			noteDocumentId, orderByComparator);

		if (noteDocumentMovement != null) {
			return noteDocumentMovement;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("noteDocumentId=");
		sb.append(noteDocumentId);

		sb.append("}");

		throw new NoSuchNoteDocumentMovementException(sb.toString());
	}

	/**
	 * Returns the first note document movement in the ordered set where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement fetchByNoteDocumentId_First(
		long noteDocumentId,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		List<NoteDocumentMovement> list = findByNoteDocumentId(
			noteDocumentId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last note document movement in the ordered set where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement
	 * @throws NoSuchNoteDocumentMovementException if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement findByNoteDocumentId_Last(
			long noteDocumentId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException {

		NoteDocumentMovement noteDocumentMovement = fetchByNoteDocumentId_Last(
			noteDocumentId, orderByComparator);

		if (noteDocumentMovement != null) {
			return noteDocumentMovement;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("noteDocumentId=");
		sb.append(noteDocumentId);

		sb.append("}");

		throw new NoSuchNoteDocumentMovementException(sb.toString());
	}

	/**
	 * Returns the last note document movement in the ordered set where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching note document movement, or <code>null</code> if a matching note document movement could not be found
	 */
	@Override
	public NoteDocumentMovement fetchByNoteDocumentId_Last(
		long noteDocumentId,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		int count = countByNoteDocumentId(noteDocumentId);

		if (count == 0) {
			return null;
		}

		List<NoteDocumentMovement> list = findByNoteDocumentId(
			noteDocumentId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the note document movements before and after the current note document movement in the ordered set where noteDocumentId = &#63;.
	 *
	 * @param id the primary key of the current note document movement
	 * @param noteDocumentId the note document ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	@Override
	public NoteDocumentMovement[] findByNoteDocumentId_PrevAndNext(
			long id, long noteDocumentId,
			OrderByComparator<NoteDocumentMovement> orderByComparator)
		throws NoSuchNoteDocumentMovementException {

		NoteDocumentMovement noteDocumentMovement = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			NoteDocumentMovement[] array = new NoteDocumentMovementImpl[3];

			array[0] = getByNoteDocumentId_PrevAndNext(
				session, noteDocumentMovement, noteDocumentId,
				orderByComparator, true);

			array[1] = noteDocumentMovement;

			array[2] = getByNoteDocumentId_PrevAndNext(
				session, noteDocumentMovement, noteDocumentId,
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

	protected NoteDocumentMovement getByNoteDocumentId_PrevAndNext(
		Session session, NoteDocumentMovement noteDocumentMovement,
		long noteDocumentId,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
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

		sb.append(_SQL_SELECT_NOTEDOCUMENTMOVEMENT_WHERE);

		sb.append(_FINDER_COLUMN_NOTEDOCUMENTID_NOTEDOCUMENTID_2);

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
			sb.append(NoteDocumentMovementModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(noteDocumentId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						noteDocumentMovement)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NoteDocumentMovement> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the note document movements where noteDocumentId = &#63; from the database.
	 *
	 * @param noteDocumentId the note document ID
	 */
	@Override
	public void removeByNoteDocumentId(long noteDocumentId) {
		for (NoteDocumentMovement noteDocumentMovement :
				findByNoteDocumentId(
					noteDocumentId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(noteDocumentMovement);
		}
	}

	/**
	 * Returns the number of note document movements where noteDocumentId = &#63;.
	 *
	 * @param noteDocumentId the note document ID
	 * @return the number of matching note document movements
	 */
	@Override
	public int countByNoteDocumentId(long noteDocumentId) {
		FinderPath finderPath = _finderPathCountByNoteDocumentId;

		Object[] finderArgs = new Object[] {noteDocumentId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NOTEDOCUMENTMOVEMENT_WHERE);

			sb.append(_FINDER_COLUMN_NOTEDOCUMENTID_NOTEDOCUMENTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(noteDocumentId);

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

	private static final String _FINDER_COLUMN_NOTEDOCUMENTID_NOTEDOCUMENTID_2 =
		"noteDocumentMovement.noteDocumentId = ?";

	public NoteDocumentMovementPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("id", "id_");
		dbColumnNames.put("active", "active_");

		setDBColumnNames(dbColumnNames);

		setModelClass(NoteDocumentMovement.class);

		setModelImplClass(NoteDocumentMovementImpl.class);
		setModelPKClass(long.class);

		setTable(NoteDocumentMovementTable.INSTANCE);
	}

	/**
	 * Caches the note document movement in the entity cache if it is enabled.
	 *
	 * @param noteDocumentMovement the note document movement
	 */
	@Override
	public void cacheResult(NoteDocumentMovement noteDocumentMovement) {
		entityCache.putResult(
			NoteDocumentMovementImpl.class,
			noteDocumentMovement.getPrimaryKey(), noteDocumentMovement);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				noteDocumentMovement.getUuid(),
				noteDocumentMovement.getGroupId()
			},
			noteDocumentMovement);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the note document movements in the entity cache if it is enabled.
	 *
	 * @param noteDocumentMovements the note document movements
	 */
	@Override
	public void cacheResult(List<NoteDocumentMovement> noteDocumentMovements) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (noteDocumentMovements.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NoteDocumentMovement noteDocumentMovement :
				noteDocumentMovements) {

			if (entityCache.getResult(
					NoteDocumentMovementImpl.class,
					noteDocumentMovement.getPrimaryKey()) == null) {

				cacheResult(noteDocumentMovement);
			}
		}
	}

	/**
	 * Clears the cache for all note document movements.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NoteDocumentMovementImpl.class);

		finderCache.clearCache(NoteDocumentMovementImpl.class);
	}

	/**
	 * Clears the cache for the note document movement.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NoteDocumentMovement noteDocumentMovement) {
		entityCache.removeResult(
			NoteDocumentMovementImpl.class, noteDocumentMovement);
	}

	@Override
	public void clearCache(List<NoteDocumentMovement> noteDocumentMovements) {
		for (NoteDocumentMovement noteDocumentMovement :
				noteDocumentMovements) {

			entityCache.removeResult(
				NoteDocumentMovementImpl.class, noteDocumentMovement);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NoteDocumentMovementImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NoteDocumentMovementImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NoteDocumentMovementModelImpl noteDocumentMovementModelImpl) {

		Object[] args = new Object[] {
			noteDocumentMovementModelImpl.getUuid(),
			noteDocumentMovementModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, noteDocumentMovementModelImpl);
	}

	/**
	 * Creates a new note document movement with the primary key. Does not add the note document movement to the database.
	 *
	 * @param id the primary key for the new note document movement
	 * @return the new note document movement
	 */
	@Override
	public NoteDocumentMovement create(long id) {
		NoteDocumentMovement noteDocumentMovement =
			new NoteDocumentMovementImpl();

		noteDocumentMovement.setNew(true);
		noteDocumentMovement.setPrimaryKey(id);

		String uuid = PortalUUIDUtil.generate();

		noteDocumentMovement.setUuid(uuid);

		noteDocumentMovement.setCompanyId(CompanyThreadLocal.getCompanyId());

		return noteDocumentMovement;
	}

	/**
	 * Removes the note document movement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement that was removed
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	@Override
	public NoteDocumentMovement remove(long id)
		throws NoSuchNoteDocumentMovementException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the note document movement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the note document movement
	 * @return the note document movement that was removed
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	@Override
	public NoteDocumentMovement remove(Serializable primaryKey)
		throws NoSuchNoteDocumentMovementException {

		Session session = null;

		try {
			session = openSession();

			NoteDocumentMovement noteDocumentMovement =
				(NoteDocumentMovement)session.get(
					NoteDocumentMovementImpl.class, primaryKey);

			if (noteDocumentMovement == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNoteDocumentMovementException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(noteDocumentMovement);
		}
		catch (NoSuchNoteDocumentMovementException noSuchEntityException) {
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
	protected NoteDocumentMovement removeImpl(
		NoteDocumentMovement noteDocumentMovement) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(noteDocumentMovement)) {
				noteDocumentMovement = (NoteDocumentMovement)session.get(
					NoteDocumentMovementImpl.class,
					noteDocumentMovement.getPrimaryKeyObj());
			}

			if (noteDocumentMovement != null) {
				session.delete(noteDocumentMovement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (noteDocumentMovement != null) {
			clearCache(noteDocumentMovement);
		}

		return noteDocumentMovement;
	}

	@Override
	public NoteDocumentMovement updateImpl(
		NoteDocumentMovement noteDocumentMovement) {

		boolean isNew = noteDocumentMovement.isNew();

		if (!(noteDocumentMovement instanceof NoteDocumentMovementModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(noteDocumentMovement.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					noteDocumentMovement);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in noteDocumentMovement proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NoteDocumentMovement implementation " +
					noteDocumentMovement.getClass());
		}

		NoteDocumentMovementModelImpl noteDocumentMovementModelImpl =
			(NoteDocumentMovementModelImpl)noteDocumentMovement;

		if (Validator.isNull(noteDocumentMovement.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			noteDocumentMovement.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (noteDocumentMovement.getCreateDate() == null)) {
			if (serviceContext == null) {
				noteDocumentMovement.setCreateDate(date);
			}
			else {
				noteDocumentMovement.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!noteDocumentMovementModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				noteDocumentMovement.setModifiedDate(date);
			}
			else {
				noteDocumentMovement.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(noteDocumentMovement);
			}
			else {
				noteDocumentMovement = (NoteDocumentMovement)session.merge(
					noteDocumentMovement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NoteDocumentMovementImpl.class, noteDocumentMovementModelImpl,
			false, true);

		cacheUniqueFindersCache(noteDocumentMovementModelImpl);

		if (isNew) {
			noteDocumentMovement.setNew(false);
		}

		noteDocumentMovement.resetOriginalValues();

		return noteDocumentMovement;
	}

	/**
	 * Returns the note document movement with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the note document movement
	 * @return the note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	@Override
	public NoteDocumentMovement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNoteDocumentMovementException {

		NoteDocumentMovement noteDocumentMovement = fetchByPrimaryKey(
			primaryKey);

		if (noteDocumentMovement == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNoteDocumentMovementException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return noteDocumentMovement;
	}

	/**
	 * Returns the note document movement with the primary key or throws a <code>NoSuchNoteDocumentMovementException</code> if it could not be found.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement
	 * @throws NoSuchNoteDocumentMovementException if a note document movement with the primary key could not be found
	 */
	@Override
	public NoteDocumentMovement findByPrimaryKey(long id)
		throws NoSuchNoteDocumentMovementException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the note document movement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the note document movement
	 * @return the note document movement, or <code>null</code> if a note document movement with the primary key could not be found
	 */
	@Override
	public NoteDocumentMovement fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the note document movements.
	 *
	 * @return the note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the note document movements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @return the range of note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the note document movements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findAll(
		int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the note document movements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NoteDocumentMovementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of note document movements
	 * @param end the upper bound of the range of note document movements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of note document movements
	 */
	@Override
	public List<NoteDocumentMovement> findAll(
		int start, int end,
		OrderByComparator<NoteDocumentMovement> orderByComparator,
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

		List<NoteDocumentMovement> list = null;

		if (useFinderCache) {
			list = (List<NoteDocumentMovement>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NOTEDOCUMENTMOVEMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NOTEDOCUMENTMOVEMENT;

				sql = sql.concat(NoteDocumentMovementModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NoteDocumentMovement>)QueryUtil.list(
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
	 * Removes all the note document movements from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NoteDocumentMovement noteDocumentMovement : findAll()) {
			remove(noteDocumentMovement);
		}
	}

	/**
	 * Returns the number of note document movements.
	 *
	 * @return the number of note document movements
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
					_SQL_COUNT_NOTEDOCUMENTMOVEMENT);

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
		return _SQL_SELECT_NOTEDOCUMENTMOVEMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NoteDocumentMovementModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the note document movement persistence.
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

		_finderPathWithPaginationFindByNoteDocumentId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNoteDocumentId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"noteDocumentId"}, true);

		_finderPathWithoutPaginationFindByNoteDocumentId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNoteDocumentId",
			new String[] {Long.class.getName()},
			new String[] {"noteDocumentId"}, true);

		_finderPathCountByNoteDocumentId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNoteDocumentId",
			new String[] {Long.class.getName()},
			new String[] {"noteDocumentId"}, false);

		_setNoteDocumentMovementUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setNoteDocumentMovementUtilPersistence(null);

		entityCache.removeCache(NoteDocumentMovementImpl.class.getName());
	}

	private void _setNoteDocumentMovementUtilPersistence(
		NoteDocumentMovementPersistence noteDocumentMovementPersistence) {

		try {
			Field field = NoteDocumentMovementUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, noteDocumentMovementPersistence);
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

	private static final String _SQL_SELECT_NOTEDOCUMENTMOVEMENT =
		"SELECT noteDocumentMovement FROM NoteDocumentMovement noteDocumentMovement";

	private static final String _SQL_SELECT_NOTEDOCUMENTMOVEMENT_WHERE =
		"SELECT noteDocumentMovement FROM NoteDocumentMovement noteDocumentMovement WHERE ";

	private static final String _SQL_COUNT_NOTEDOCUMENTMOVEMENT =
		"SELECT COUNT(noteDocumentMovement) FROM NoteDocumentMovement noteDocumentMovement";

	private static final String _SQL_COUNT_NOTEDOCUMENTMOVEMENT_WHERE =
		"SELECT COUNT(noteDocumentMovement) FROM NoteDocumentMovement noteDocumentMovement WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"noteDocumentMovement.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NoteDocumentMovement exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NoteDocumentMovement exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NoteDocumentMovementPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "id", "active"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private NoteDocumentMovementModelArgumentsResolver
		_noteDocumentMovementModelArgumentsResolver;

}