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

import io.jetprocess.exception.NoSuchDraftRecipientException;
import io.jetprocess.model.DraftRecipient;
import io.jetprocess.model.DraftRecipientTable;
import io.jetprocess.model.impl.DraftRecipientImpl;
import io.jetprocess.model.impl.DraftRecipientModelImpl;
import io.jetprocess.service.persistence.DraftRecipientPersistence;
import io.jetprocess.service.persistence.DraftRecipientUtil;
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
 * The persistence implementation for the draft recipient service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {DraftRecipientPersistence.class, BasePersistence.class})
public class DraftRecipientPersistenceImpl
	extends BasePersistenceImpl<DraftRecipient>
	implements DraftRecipientPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DraftRecipientUtil</code> to access the draft recipient persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DraftRecipientImpl.class.getName();

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
	 * Returns all the draft recipients where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching draft recipients
	 */
	@Override
	public List<DraftRecipient> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DraftRecipient> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<DraftRecipient> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<DraftRecipient> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator,
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

		List<DraftRecipient> list = null;

		if (useFinderCache) {
			list = (List<DraftRecipient>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (DraftRecipient draftRecipient : list) {
					if (!uuid.equals(draftRecipient.getUuid())) {
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

			sb.append(_SQL_SELECT_DRAFTRECIPIENT_WHERE);

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
				sb.append(DraftRecipientModelImpl.ORDER_BY_JPQL);
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

				list = (List<DraftRecipient>)QueryUtil.list(
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
	 * Returns the first draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient findByUuid_First(
			String uuid, OrderByComparator<DraftRecipient> orderByComparator)
		throws NoSuchDraftRecipientException {

		DraftRecipient draftRecipient = fetchByUuid_First(
			uuid, orderByComparator);

		if (draftRecipient != null) {
			return draftRecipient;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDraftRecipientException(sb.toString());
	}

	/**
	 * Returns the first draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient fetchByUuid_First(
		String uuid, OrderByComparator<DraftRecipient> orderByComparator) {

		List<DraftRecipient> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient findByUuid_Last(
			String uuid, OrderByComparator<DraftRecipient> orderByComparator)
		throws NoSuchDraftRecipientException {

		DraftRecipient draftRecipient = fetchByUuid_Last(
			uuid, orderByComparator);

		if (draftRecipient != null) {
			return draftRecipient;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDraftRecipientException(sb.toString());
	}

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient fetchByUuid_Last(
		String uuid, OrderByComparator<DraftRecipient> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DraftRecipient> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DraftRecipient[] findByUuid_PrevAndNext(
			long id, String uuid,
			OrderByComparator<DraftRecipient> orderByComparator)
		throws NoSuchDraftRecipientException {

		uuid = Objects.toString(uuid, "");

		DraftRecipient draftRecipient = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DraftRecipient[] array = new DraftRecipientImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, draftRecipient, uuid, orderByComparator, true);

			array[1] = draftRecipient;

			array[2] = getByUuid_PrevAndNext(
				session, draftRecipient, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DraftRecipient getByUuid_PrevAndNext(
		Session session, DraftRecipient draftRecipient, String uuid,
		OrderByComparator<DraftRecipient> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DRAFTRECIPIENT_WHERE);

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
			sb.append(DraftRecipientModelImpl.ORDER_BY_JPQL);
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
						draftRecipient)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DraftRecipient> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the draft recipients where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DraftRecipient draftRecipient :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(draftRecipient);
		}
	}

	/**
	 * Returns the number of draft recipients where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching draft recipients
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DRAFTRECIPIENT_WHERE);

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
		"draftRecipient.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(draftRecipient.uuid IS NULL OR draftRecipient.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the draft recipient where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDraftRecipientException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient findByUUID_G(String uuid, long groupId)
		throws NoSuchDraftRecipientException {

		DraftRecipient draftRecipient = fetchByUUID_G(uuid, groupId);

		if (draftRecipient == null) {
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

			throw new NoSuchDraftRecipientException(sb.toString());
		}

		return draftRecipient;
	}

	/**
	 * Returns the draft recipient where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the draft recipient where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient fetchByUUID_G(
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

		if (result instanceof DraftRecipient) {
			DraftRecipient draftRecipient = (DraftRecipient)result;

			if (!Objects.equals(uuid, draftRecipient.getUuid()) ||
				(groupId != draftRecipient.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_DRAFTRECIPIENT_WHERE);

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

				List<DraftRecipient> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					DraftRecipient draftRecipient = list.get(0);

					result = draftRecipient;

					cacheResult(draftRecipient);
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
			return (DraftRecipient)result;
		}
	}

	/**
	 * Removes the draft recipient where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the draft recipient that was removed
	 */
	@Override
	public DraftRecipient removeByUUID_G(String uuid, long groupId)
		throws NoSuchDraftRecipientException {

		DraftRecipient draftRecipient = findByUUID_G(uuid, groupId);

		return remove(draftRecipient);
	}

	/**
	 * Returns the number of draft recipients where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching draft recipients
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DRAFTRECIPIENT_WHERE);

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
		"draftRecipient.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(draftRecipient.uuid IS NULL OR draftRecipient.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"draftRecipient.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching draft recipients
	 */
	@Override
	public List<DraftRecipient> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DraftRecipient> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<DraftRecipient> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<DraftRecipient> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator,
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

		List<DraftRecipient> list = null;

		if (useFinderCache) {
			list = (List<DraftRecipient>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (DraftRecipient draftRecipient : list) {
					if (!uuid.equals(draftRecipient.getUuid()) ||
						(companyId != draftRecipient.getCompanyId())) {

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

			sb.append(_SQL_SELECT_DRAFTRECIPIENT_WHERE);

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
				sb.append(DraftRecipientModelImpl.ORDER_BY_JPQL);
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

				list = (List<DraftRecipient>)QueryUtil.list(
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
	 * Returns the first draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DraftRecipient> orderByComparator)
		throws NoSuchDraftRecipientException {

		DraftRecipient draftRecipient = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (draftRecipient != null) {
			return draftRecipient;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDraftRecipientException(sb.toString());
	}

	/**
	 * Returns the first draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DraftRecipient> orderByComparator) {

		List<DraftRecipient> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DraftRecipient findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DraftRecipient> orderByComparator)
		throws NoSuchDraftRecipientException {

		DraftRecipient draftRecipient = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (draftRecipient != null) {
			return draftRecipient;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDraftRecipientException(sb.toString());
	}

	/**
	 * Returns the last draft recipient in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DraftRecipient> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DraftRecipient> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DraftRecipient[] findByUuid_C_PrevAndNext(
			long id, String uuid, long companyId,
			OrderByComparator<DraftRecipient> orderByComparator)
		throws NoSuchDraftRecipientException {

		uuid = Objects.toString(uuid, "");

		DraftRecipient draftRecipient = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DraftRecipient[] array = new DraftRecipientImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, draftRecipient, uuid, companyId, orderByComparator,
				true);

			array[1] = draftRecipient;

			array[2] = getByUuid_C_PrevAndNext(
				session, draftRecipient, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DraftRecipient getByUuid_C_PrevAndNext(
		Session session, DraftRecipient draftRecipient, String uuid,
		long companyId, OrderByComparator<DraftRecipient> orderByComparator,
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

		sb.append(_SQL_SELECT_DRAFTRECIPIENT_WHERE);

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
			sb.append(DraftRecipientModelImpl.ORDER_BY_JPQL);
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
						draftRecipient)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DraftRecipient> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the draft recipients where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (DraftRecipient draftRecipient :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(draftRecipient);
		}
	}

	/**
	 * Returns the number of draft recipients where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching draft recipients
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DRAFTRECIPIENT_WHERE);

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
		"draftRecipient.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(draftRecipient.uuid IS NULL OR draftRecipient.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"draftRecipient.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByDraftId;
	private FinderPath _finderPathWithoutPaginationFindByDraftId;
	private FinderPath _finderPathCountByDraftId;

	/**
	 * Returns all the draft recipients where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @return the matching draft recipients
	 */
	@Override
	public List<DraftRecipient> findByDraftId(long draftId) {
		return findByDraftId(
			draftId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DraftRecipient> findByDraftId(
		long draftId, int start, int end) {

		return findByDraftId(draftId, start, end, null);
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
	@Override
	public List<DraftRecipient> findByDraftId(
		long draftId, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return findByDraftId(draftId, start, end, orderByComparator, true);
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
	@Override
	public List<DraftRecipient> findByDraftId(
		long draftId, int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByDraftId;
				finderArgs = new Object[] {draftId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByDraftId;
			finderArgs = new Object[] {draftId, start, end, orderByComparator};
		}

		List<DraftRecipient> list = null;

		if (useFinderCache) {
			list = (List<DraftRecipient>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (DraftRecipient draftRecipient : list) {
					if (draftId != draftRecipient.getDraftId()) {
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

			sb.append(_SQL_SELECT_DRAFTRECIPIENT_WHERE);

			sb.append(_FINDER_COLUMN_DRAFTID_DRAFTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DraftRecipientModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(draftId);

				list = (List<DraftRecipient>)QueryUtil.list(
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
	 * Returns the first draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient findByDraftId_First(
			long draftId, OrderByComparator<DraftRecipient> orderByComparator)
		throws NoSuchDraftRecipientException {

		DraftRecipient draftRecipient = fetchByDraftId_First(
			draftId, orderByComparator);

		if (draftRecipient != null) {
			return draftRecipient;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("draftId=");
		sb.append(draftId);

		sb.append("}");

		throw new NoSuchDraftRecipientException(sb.toString());
	}

	/**
	 * Returns the first draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient fetchByDraftId_First(
		long draftId, OrderByComparator<DraftRecipient> orderByComparator) {

		List<DraftRecipient> list = findByDraftId(
			draftId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient
	 * @throws NoSuchDraftRecipientException if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient findByDraftId_Last(
			long draftId, OrderByComparator<DraftRecipient> orderByComparator)
		throws NoSuchDraftRecipientException {

		DraftRecipient draftRecipient = fetchByDraftId_Last(
			draftId, orderByComparator);

		if (draftRecipient != null) {
			return draftRecipient;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("draftId=");
		sb.append(draftId);

		sb.append("}");

		throw new NoSuchDraftRecipientException(sb.toString());
	}

	/**
	 * Returns the last draft recipient in the ordered set where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching draft recipient, or <code>null</code> if a matching draft recipient could not be found
	 */
	@Override
	public DraftRecipient fetchByDraftId_Last(
		long draftId, OrderByComparator<DraftRecipient> orderByComparator) {

		int count = countByDraftId(draftId);

		if (count == 0) {
			return null;
		}

		List<DraftRecipient> list = findByDraftId(
			draftId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DraftRecipient[] findByDraftId_PrevAndNext(
			long id, long draftId,
			OrderByComparator<DraftRecipient> orderByComparator)
		throws NoSuchDraftRecipientException {

		DraftRecipient draftRecipient = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DraftRecipient[] array = new DraftRecipientImpl[3];

			array[0] = getByDraftId_PrevAndNext(
				session, draftRecipient, draftId, orderByComparator, true);

			array[1] = draftRecipient;

			array[2] = getByDraftId_PrevAndNext(
				session, draftRecipient, draftId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DraftRecipient getByDraftId_PrevAndNext(
		Session session, DraftRecipient draftRecipient, long draftId,
		OrderByComparator<DraftRecipient> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_DRAFTRECIPIENT_WHERE);

		sb.append(_FINDER_COLUMN_DRAFTID_DRAFTID_2);

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
			sb.append(DraftRecipientModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(draftId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						draftRecipient)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DraftRecipient> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the draft recipients where draftId = &#63; from the database.
	 *
	 * @param draftId the draft ID
	 */
	@Override
	public void removeByDraftId(long draftId) {
		for (DraftRecipient draftRecipient :
				findByDraftId(
					draftId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(draftRecipient);
		}
	}

	/**
	 * Returns the number of draft recipients where draftId = &#63;.
	 *
	 * @param draftId the draft ID
	 * @return the number of matching draft recipients
	 */
	@Override
	public int countByDraftId(long draftId) {
		FinderPath finderPath = _finderPathCountByDraftId;

		Object[] finderArgs = new Object[] {draftId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DRAFTRECIPIENT_WHERE);

			sb.append(_FINDER_COLUMN_DRAFTID_DRAFTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(draftId);

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

	private static final String _FINDER_COLUMN_DRAFTID_DRAFTID_2 =
		"draftRecipient.draftId = ?";

	public DraftRecipientPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");
		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DraftRecipient.class);

		setModelImplClass(DraftRecipientImpl.class);
		setModelPKClass(long.class);

		setTable(DraftRecipientTable.INSTANCE);
	}

	/**
	 * Caches the draft recipient in the entity cache if it is enabled.
	 *
	 * @param draftRecipient the draft recipient
	 */
	@Override
	public void cacheResult(DraftRecipient draftRecipient) {
		entityCache.putResult(
			DraftRecipientImpl.class, draftRecipient.getPrimaryKey(),
			draftRecipient);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				draftRecipient.getUuid(), draftRecipient.getGroupId()
			},
			draftRecipient);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the draft recipients in the entity cache if it is enabled.
	 *
	 * @param draftRecipients the draft recipients
	 */
	@Override
	public void cacheResult(List<DraftRecipient> draftRecipients) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (draftRecipients.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DraftRecipient draftRecipient : draftRecipients) {
			if (entityCache.getResult(
					DraftRecipientImpl.class, draftRecipient.getPrimaryKey()) ==
						null) {

				cacheResult(draftRecipient);
			}
		}
	}

	/**
	 * Clears the cache for all draft recipients.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DraftRecipientImpl.class);

		finderCache.clearCache(DraftRecipientImpl.class);
	}

	/**
	 * Clears the cache for the draft recipient.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DraftRecipient draftRecipient) {
		entityCache.removeResult(DraftRecipientImpl.class, draftRecipient);
	}

	@Override
	public void clearCache(List<DraftRecipient> draftRecipients) {
		for (DraftRecipient draftRecipient : draftRecipients) {
			entityCache.removeResult(DraftRecipientImpl.class, draftRecipient);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DraftRecipientImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DraftRecipientImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DraftRecipientModelImpl draftRecipientModelImpl) {

		Object[] args = new Object[] {
			draftRecipientModelImpl.getUuid(),
			draftRecipientModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, draftRecipientModelImpl);
	}

	/**
	 * Creates a new draft recipient with the primary key. Does not add the draft recipient to the database.
	 *
	 * @param id the primary key for the new draft recipient
	 * @return the new draft recipient
	 */
	@Override
	public DraftRecipient create(long id) {
		DraftRecipient draftRecipient = new DraftRecipientImpl();

		draftRecipient.setNew(true);
		draftRecipient.setPrimaryKey(id);

		String uuid = PortalUUIDUtil.generate();

		draftRecipient.setUuid(uuid);

		draftRecipient.setCompanyId(CompanyThreadLocal.getCompanyId());

		return draftRecipient;
	}

	/**
	 * Removes the draft recipient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient that was removed
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	@Override
	public DraftRecipient remove(long id) throws NoSuchDraftRecipientException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the draft recipient with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the draft recipient
	 * @return the draft recipient that was removed
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	@Override
	public DraftRecipient remove(Serializable primaryKey)
		throws NoSuchDraftRecipientException {

		Session session = null;

		try {
			session = openSession();

			DraftRecipient draftRecipient = (DraftRecipient)session.get(
				DraftRecipientImpl.class, primaryKey);

			if (draftRecipient == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDraftRecipientException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(draftRecipient);
		}
		catch (NoSuchDraftRecipientException noSuchEntityException) {
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
	protected DraftRecipient removeImpl(DraftRecipient draftRecipient) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(draftRecipient)) {
				draftRecipient = (DraftRecipient)session.get(
					DraftRecipientImpl.class,
					draftRecipient.getPrimaryKeyObj());
			}

			if (draftRecipient != null) {
				session.delete(draftRecipient);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (draftRecipient != null) {
			clearCache(draftRecipient);
		}

		return draftRecipient;
	}

	@Override
	public DraftRecipient updateImpl(DraftRecipient draftRecipient) {
		boolean isNew = draftRecipient.isNew();

		if (!(draftRecipient instanceof DraftRecipientModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(draftRecipient.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					draftRecipient);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in draftRecipient proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DraftRecipient implementation " +
					draftRecipient.getClass());
		}

		DraftRecipientModelImpl draftRecipientModelImpl =
			(DraftRecipientModelImpl)draftRecipient;

		if (Validator.isNull(draftRecipient.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			draftRecipient.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (draftRecipient.getCreateDate() == null)) {
			if (serviceContext == null) {
				draftRecipient.setCreateDate(date);
			}
			else {
				draftRecipient.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!draftRecipientModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				draftRecipient.setModifiedDate(date);
			}
			else {
				draftRecipient.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(draftRecipient);
			}
			else {
				draftRecipient = (DraftRecipient)session.merge(draftRecipient);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DraftRecipientImpl.class, draftRecipientModelImpl, false, true);

		cacheUniqueFindersCache(draftRecipientModelImpl);

		if (isNew) {
			draftRecipient.setNew(false);
		}

		draftRecipient.resetOriginalValues();

		return draftRecipient;
	}

	/**
	 * Returns the draft recipient with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the draft recipient
	 * @return the draft recipient
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	@Override
	public DraftRecipient findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDraftRecipientException {

		DraftRecipient draftRecipient = fetchByPrimaryKey(primaryKey);

		if (draftRecipient == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDraftRecipientException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return draftRecipient;
	}

	/**
	 * Returns the draft recipient with the primary key or throws a <code>NoSuchDraftRecipientException</code> if it could not be found.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient
	 * @throws NoSuchDraftRecipientException if a draft recipient with the primary key could not be found
	 */
	@Override
	public DraftRecipient findByPrimaryKey(long id)
		throws NoSuchDraftRecipientException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the draft recipient with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the draft recipient
	 * @return the draft recipient, or <code>null</code> if a draft recipient with the primary key could not be found
	 */
	@Override
	public DraftRecipient fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the draft recipients.
	 *
	 * @return the draft recipients
	 */
	@Override
	public List<DraftRecipient> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DraftRecipient> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<DraftRecipient> findAll(
		int start, int end,
		OrderByComparator<DraftRecipient> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<DraftRecipient> findAll(
		int start, int end, OrderByComparator<DraftRecipient> orderByComparator,
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

		List<DraftRecipient> list = null;

		if (useFinderCache) {
			list = (List<DraftRecipient>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DRAFTRECIPIENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DRAFTRECIPIENT;

				sql = sql.concat(DraftRecipientModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DraftRecipient>)QueryUtil.list(
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
	 * Removes all the draft recipients from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DraftRecipient draftRecipient : findAll()) {
			remove(draftRecipient);
		}
	}

	/**
	 * Returns the number of draft recipients.
	 *
	 * @return the number of draft recipients
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DRAFTRECIPIENT);

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
		return _SQL_SELECT_DRAFTRECIPIENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DraftRecipientModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the draft recipient persistence.
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

		_finderPathWithPaginationFindByDraftId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDraftId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"draftId"}, true);

		_finderPathWithoutPaginationFindByDraftId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDraftId",
			new String[] {Long.class.getName()}, new String[] {"draftId"},
			true);

		_finderPathCountByDraftId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDraftId",
			new String[] {Long.class.getName()}, new String[] {"draftId"},
			false);

		_setDraftRecipientUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setDraftRecipientUtilPersistence(null);

		entityCache.removeCache(DraftRecipientImpl.class.getName());
	}

	private void _setDraftRecipientUtilPersistence(
		DraftRecipientPersistence draftRecipientPersistence) {

		try {
			Field field = DraftRecipientUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, draftRecipientPersistence);
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

	private static final String _SQL_SELECT_DRAFTRECIPIENT =
		"SELECT draftRecipient FROM DraftRecipient draftRecipient";

	private static final String _SQL_SELECT_DRAFTRECIPIENT_WHERE =
		"SELECT draftRecipient FROM DraftRecipient draftRecipient WHERE ";

	private static final String _SQL_COUNT_DRAFTRECIPIENT =
		"SELECT COUNT(draftRecipient) FROM DraftRecipient draftRecipient";

	private static final String _SQL_COUNT_DRAFTRECIPIENT_WHERE =
		"SELECT COUNT(draftRecipient) FROM DraftRecipient draftRecipient WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "draftRecipient.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DraftRecipient exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DraftRecipient exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DraftRecipientPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid", "id"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private DraftRecipientModelArgumentsResolver
		_draftRecipientModelArgumentsResolver;

}