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

import io.jetprocess.exception.NoSuchSecondaryHeadException;
import io.jetprocess.model.SecondaryHead;
import io.jetprocess.model.SecondaryHeadTable;
import io.jetprocess.model.impl.SecondaryHeadImpl;
import io.jetprocess.model.impl.SecondaryHeadModelImpl;
import io.jetprocess.service.persistence.SecondaryHeadPersistence;
import io.jetprocess.service.persistence.SecondaryHeadUtil;
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
 * The persistence implementation for the secondary head service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {SecondaryHeadPersistence.class, BasePersistence.class})
public class SecondaryHeadPersistenceImpl
	extends BasePersistenceImpl<SecondaryHead>
	implements SecondaryHeadPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SecondaryHeadUtil</code> to access the secondary head persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SecondaryHeadImpl.class.getName();

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
	 * Returns all the secondary heads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the secondary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @return the range of matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the secondary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the secondary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator,
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

		List<SecondaryHead> list = null;

		if (useFinderCache) {
			list = (List<SecondaryHead>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (SecondaryHead secondaryHead : list) {
					if (!uuid.equals(secondaryHead.getUuid())) {
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

			sb.append(_SQL_SELECT_SECONDARYHEAD_WHERE);

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
				sb.append(SecondaryHeadModelImpl.ORDER_BY_JPQL);
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

				list = (List<SecondaryHead>)QueryUtil.list(
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
	 * Returns the first secondary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead findByUuid_First(
			String uuid, OrderByComparator<SecondaryHead> orderByComparator)
		throws NoSuchSecondaryHeadException {

		SecondaryHead secondaryHead = fetchByUuid_First(
			uuid, orderByComparator);

		if (secondaryHead != null) {
			return secondaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSecondaryHeadException(sb.toString());
	}

	/**
	 * Returns the first secondary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead fetchByUuid_First(
		String uuid, OrderByComparator<SecondaryHead> orderByComparator) {

		List<SecondaryHead> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last secondary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead findByUuid_Last(
			String uuid, OrderByComparator<SecondaryHead> orderByComparator)
		throws NoSuchSecondaryHeadException {

		SecondaryHead secondaryHead = fetchByUuid_Last(uuid, orderByComparator);

		if (secondaryHead != null) {
			return secondaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSecondaryHeadException(sb.toString());
	}

	/**
	 * Returns the last secondary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead fetchByUuid_Last(
		String uuid, OrderByComparator<SecondaryHead> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<SecondaryHead> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the secondary heads before and after the current secondary head in the ordered set where uuid = &#63;.
	 *
	 * @param secondaryHeadId the primary key of the current secondary head
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	@Override
	public SecondaryHead[] findByUuid_PrevAndNext(
			long secondaryHeadId, String uuid,
			OrderByComparator<SecondaryHead> orderByComparator)
		throws NoSuchSecondaryHeadException {

		uuid = Objects.toString(uuid, "");

		SecondaryHead secondaryHead = findByPrimaryKey(secondaryHeadId);

		Session session = null;

		try {
			session = openSession();

			SecondaryHead[] array = new SecondaryHeadImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, secondaryHead, uuid, orderByComparator, true);

			array[1] = secondaryHead;

			array[2] = getByUuid_PrevAndNext(
				session, secondaryHead, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected SecondaryHead getByUuid_PrevAndNext(
		Session session, SecondaryHead secondaryHead, String uuid,
		OrderByComparator<SecondaryHead> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SECONDARYHEAD_WHERE);

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
			sb.append(SecondaryHeadModelImpl.ORDER_BY_JPQL);
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
						secondaryHead)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SecondaryHead> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the secondary heads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (SecondaryHead secondaryHead :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(secondaryHead);
		}
	}

	/**
	 * Returns the number of secondary heads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching secondary heads
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SECONDARYHEAD_WHERE);

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
		"secondaryHead.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(secondaryHead.uuid IS NULL OR secondaryHead.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the secondary head where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSecondaryHeadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead findByUUID_G(String uuid, long groupId)
		throws NoSuchSecondaryHeadException {

		SecondaryHead secondaryHead = fetchByUUID_G(uuid, groupId);

		if (secondaryHead == null) {
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

			throw new NoSuchSecondaryHeadException(sb.toString());
		}

		return secondaryHead;
	}

	/**
	 * Returns the secondary head where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the secondary head where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead fetchByUUID_G(
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

		if (result instanceof SecondaryHead) {
			SecondaryHead secondaryHead = (SecondaryHead)result;

			if (!Objects.equals(uuid, secondaryHead.getUuid()) ||
				(groupId != secondaryHead.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SECONDARYHEAD_WHERE);

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

				List<SecondaryHead> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					SecondaryHead secondaryHead = list.get(0);

					result = secondaryHead;

					cacheResult(secondaryHead);
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
			return (SecondaryHead)result;
		}
	}

	/**
	 * Removes the secondary head where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the secondary head that was removed
	 */
	@Override
	public SecondaryHead removeByUUID_G(String uuid, long groupId)
		throws NoSuchSecondaryHeadException {

		SecondaryHead secondaryHead = findByUUID_G(uuid, groupId);

		return remove(secondaryHead);
	}

	/**
	 * Returns the number of secondary heads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching secondary heads
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SECONDARYHEAD_WHERE);

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
		"secondaryHead.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(secondaryHead.uuid IS NULL OR secondaryHead.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"secondaryHead.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the secondary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the secondary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @return the range of matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the secondary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the secondary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator,
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

		List<SecondaryHead> list = null;

		if (useFinderCache) {
			list = (List<SecondaryHead>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (SecondaryHead secondaryHead : list) {
					if (!uuid.equals(secondaryHead.getUuid()) ||
						(companyId != secondaryHead.getCompanyId())) {

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

			sb.append(_SQL_SELECT_SECONDARYHEAD_WHERE);

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
				sb.append(SecondaryHeadModelImpl.ORDER_BY_JPQL);
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

				list = (List<SecondaryHead>)QueryUtil.list(
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
	 * Returns the first secondary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SecondaryHead> orderByComparator)
		throws NoSuchSecondaryHeadException {

		SecondaryHead secondaryHead = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (secondaryHead != null) {
			return secondaryHead;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSecondaryHeadException(sb.toString());
	}

	/**
	 * Returns the first secondary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SecondaryHead> orderByComparator) {

		List<SecondaryHead> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last secondary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SecondaryHead> orderByComparator)
		throws NoSuchSecondaryHeadException {

		SecondaryHead secondaryHead = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (secondaryHead != null) {
			return secondaryHead;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchSecondaryHeadException(sb.toString());
	}

	/**
	 * Returns the last secondary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SecondaryHead> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<SecondaryHead> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the secondary heads before and after the current secondary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param secondaryHeadId the primary key of the current secondary head
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	@Override
	public SecondaryHead[] findByUuid_C_PrevAndNext(
			long secondaryHeadId, String uuid, long companyId,
			OrderByComparator<SecondaryHead> orderByComparator)
		throws NoSuchSecondaryHeadException {

		uuid = Objects.toString(uuid, "");

		SecondaryHead secondaryHead = findByPrimaryKey(secondaryHeadId);

		Session session = null;

		try {
			session = openSession();

			SecondaryHead[] array = new SecondaryHeadImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, secondaryHead, uuid, companyId, orderByComparator,
				true);

			array[1] = secondaryHead;

			array[2] = getByUuid_C_PrevAndNext(
				session, secondaryHead, uuid, companyId, orderByComparator,
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

	protected SecondaryHead getByUuid_C_PrevAndNext(
		Session session, SecondaryHead secondaryHead, String uuid,
		long companyId, OrderByComparator<SecondaryHead> orderByComparator,
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

		sb.append(_SQL_SELECT_SECONDARYHEAD_WHERE);

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
			sb.append(SecondaryHeadModelImpl.ORDER_BY_JPQL);
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
						secondaryHead)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SecondaryHead> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the secondary heads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (SecondaryHead secondaryHead :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(secondaryHead);
		}
	}

	/**
	 * Returns the number of secondary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching secondary heads
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SECONDARYHEAD_WHERE);

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
		"secondaryHead.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(secondaryHead.uuid IS NULL OR secondaryHead.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"secondaryHead.companyId = ?";

	private FinderPath
		_finderPathWithPaginationFindBySecondaryHeadByPrimaryHeadId;
	private FinderPath
		_finderPathWithoutPaginationFindBySecondaryHeadByPrimaryHeadId;
	private FinderPath _finderPathCountBySecondaryHeadByPrimaryHeadId;

	/**
	 * Returns all the secondary heads where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @return the matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId) {

		return findBySecondaryHeadByPrimaryHeadId(
			primaryHeadId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the secondary heads where primaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param primaryHeadId the primary head ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @return the range of matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId, int start, int end) {

		return findBySecondaryHeadByPrimaryHeadId(
			primaryHeadId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the secondary heads where primaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param primaryHeadId the primary head ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId, int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator) {

		return findBySecondaryHeadByPrimaryHeadId(
			primaryHeadId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the secondary heads where primaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param primaryHeadId the primary head ID
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching secondary heads
	 */
	@Override
	public List<SecondaryHead> findBySecondaryHeadByPrimaryHeadId(
		long primaryHeadId, int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBySecondaryHeadByPrimaryHeadId;
				finderArgs = new Object[] {primaryHeadId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBySecondaryHeadByPrimaryHeadId;
			finderArgs = new Object[] {
				primaryHeadId, start, end, orderByComparator
			};
		}

		List<SecondaryHead> list = null;

		if (useFinderCache) {
			list = (List<SecondaryHead>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (SecondaryHead secondaryHead : list) {
					if (primaryHeadId != secondaryHead.getPrimaryHeadId()) {
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

			sb.append(_SQL_SELECT_SECONDARYHEAD_WHERE);

			sb.append(
				_FINDER_COLUMN_SECONDARYHEADBYPRIMARYHEADID_PRIMARYHEADID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SecondaryHeadModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(primaryHeadId);

				list = (List<SecondaryHead>)QueryUtil.list(
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
	 * Returns the first secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead findBySecondaryHeadByPrimaryHeadId_First(
			long primaryHeadId,
			OrderByComparator<SecondaryHead> orderByComparator)
		throws NoSuchSecondaryHeadException {

		SecondaryHead secondaryHead = fetchBySecondaryHeadByPrimaryHeadId_First(
			primaryHeadId, orderByComparator);

		if (secondaryHead != null) {
			return secondaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("primaryHeadId=");
		sb.append(primaryHeadId);

		sb.append("}");

		throw new NoSuchSecondaryHeadException(sb.toString());
	}

	/**
	 * Returns the first secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead fetchBySecondaryHeadByPrimaryHeadId_First(
		long primaryHeadId,
		OrderByComparator<SecondaryHead> orderByComparator) {

		List<SecondaryHead> list = findBySecondaryHeadByPrimaryHeadId(
			primaryHeadId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head
	 * @throws NoSuchSecondaryHeadException if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead findBySecondaryHeadByPrimaryHeadId_Last(
			long primaryHeadId,
			OrderByComparator<SecondaryHead> orderByComparator)
		throws NoSuchSecondaryHeadException {

		SecondaryHead secondaryHead = fetchBySecondaryHeadByPrimaryHeadId_Last(
			primaryHeadId, orderByComparator);

		if (secondaryHead != null) {
			return secondaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("primaryHeadId=");
		sb.append(primaryHeadId);

		sb.append("}");

		throw new NoSuchSecondaryHeadException(sb.toString());
	}

	/**
	 * Returns the last secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching secondary head, or <code>null</code> if a matching secondary head could not be found
	 */
	@Override
	public SecondaryHead fetchBySecondaryHeadByPrimaryHeadId_Last(
		long primaryHeadId,
		OrderByComparator<SecondaryHead> orderByComparator) {

		int count = countBySecondaryHeadByPrimaryHeadId(primaryHeadId);

		if (count == 0) {
			return null;
		}

		List<SecondaryHead> list = findBySecondaryHeadByPrimaryHeadId(
			primaryHeadId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the secondary heads before and after the current secondary head in the ordered set where primaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the primary key of the current secondary head
	 * @param primaryHeadId the primary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	@Override
	public SecondaryHead[] findBySecondaryHeadByPrimaryHeadId_PrevAndNext(
			long secondaryHeadId, long primaryHeadId,
			OrderByComparator<SecondaryHead> orderByComparator)
		throws NoSuchSecondaryHeadException {

		SecondaryHead secondaryHead = findByPrimaryKey(secondaryHeadId);

		Session session = null;

		try {
			session = openSession();

			SecondaryHead[] array = new SecondaryHeadImpl[3];

			array[0] = getBySecondaryHeadByPrimaryHeadId_PrevAndNext(
				session, secondaryHead, primaryHeadId, orderByComparator, true);

			array[1] = secondaryHead;

			array[2] = getBySecondaryHeadByPrimaryHeadId_PrevAndNext(
				session, secondaryHead, primaryHeadId, orderByComparator,
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

	protected SecondaryHead getBySecondaryHeadByPrimaryHeadId_PrevAndNext(
		Session session, SecondaryHead secondaryHead, long primaryHeadId,
		OrderByComparator<SecondaryHead> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SECONDARYHEAD_WHERE);

		sb.append(_FINDER_COLUMN_SECONDARYHEADBYPRIMARYHEADID_PRIMARYHEADID_2);

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
			sb.append(SecondaryHeadModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(primaryHeadId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						secondaryHead)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SecondaryHead> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the secondary heads where primaryHeadId = &#63; from the database.
	 *
	 * @param primaryHeadId the primary head ID
	 */
	@Override
	public void removeBySecondaryHeadByPrimaryHeadId(long primaryHeadId) {
		for (SecondaryHead secondaryHead :
				findBySecondaryHeadByPrimaryHeadId(
					primaryHeadId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(secondaryHead);
		}
	}

	/**
	 * Returns the number of secondary heads where primaryHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary head ID
	 * @return the number of matching secondary heads
	 */
	@Override
	public int countBySecondaryHeadByPrimaryHeadId(long primaryHeadId) {
		FinderPath finderPath = _finderPathCountBySecondaryHeadByPrimaryHeadId;

		Object[] finderArgs = new Object[] {primaryHeadId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SECONDARYHEAD_WHERE);

			sb.append(
				_FINDER_COLUMN_SECONDARYHEADBYPRIMARYHEADID_PRIMARYHEADID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(primaryHeadId);

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

	private static final String
		_FINDER_COLUMN_SECONDARYHEADBYPRIMARYHEADID_PRIMARYHEADID_2 =
			"secondaryHead.primaryHeadId = ?";

	public SecondaryHeadPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(SecondaryHead.class);

		setModelImplClass(SecondaryHeadImpl.class);
		setModelPKClass(long.class);

		setTable(SecondaryHeadTable.INSTANCE);
	}

	/**
	 * Caches the secondary head in the entity cache if it is enabled.
	 *
	 * @param secondaryHead the secondary head
	 */
	@Override
	public void cacheResult(SecondaryHead secondaryHead) {
		entityCache.putResult(
			SecondaryHeadImpl.class, secondaryHead.getPrimaryKey(),
			secondaryHead);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {secondaryHead.getUuid(), secondaryHead.getGroupId()},
			secondaryHead);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the secondary heads in the entity cache if it is enabled.
	 *
	 * @param secondaryHeads the secondary heads
	 */
	@Override
	public void cacheResult(List<SecondaryHead> secondaryHeads) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (secondaryHeads.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SecondaryHead secondaryHead : secondaryHeads) {
			if (entityCache.getResult(
					SecondaryHeadImpl.class, secondaryHead.getPrimaryKey()) ==
						null) {

				cacheResult(secondaryHead);
			}
		}
	}

	/**
	 * Clears the cache for all secondary heads.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SecondaryHeadImpl.class);

		finderCache.clearCache(SecondaryHeadImpl.class);
	}

	/**
	 * Clears the cache for the secondary head.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SecondaryHead secondaryHead) {
		entityCache.removeResult(SecondaryHeadImpl.class, secondaryHead);
	}

	@Override
	public void clearCache(List<SecondaryHead> secondaryHeads) {
		for (SecondaryHead secondaryHead : secondaryHeads) {
			entityCache.removeResult(SecondaryHeadImpl.class, secondaryHead);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SecondaryHeadImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SecondaryHeadImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SecondaryHeadModelImpl secondaryHeadModelImpl) {

		Object[] args = new Object[] {
			secondaryHeadModelImpl.getUuid(),
			secondaryHeadModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, secondaryHeadModelImpl);
	}

	/**
	 * Creates a new secondary head with the primary key. Does not add the secondary head to the database.
	 *
	 * @param secondaryHeadId the primary key for the new secondary head
	 * @return the new secondary head
	 */
	@Override
	public SecondaryHead create(long secondaryHeadId) {
		SecondaryHead secondaryHead = new SecondaryHeadImpl();

		secondaryHead.setNew(true);
		secondaryHead.setPrimaryKey(secondaryHeadId);

		String uuid = PortalUUIDUtil.generate();

		secondaryHead.setUuid(uuid);

		secondaryHead.setCompanyId(CompanyThreadLocal.getCompanyId());

		return secondaryHead;
	}

	/**
	 * Removes the secondary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head that was removed
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	@Override
	public SecondaryHead remove(long secondaryHeadId)
		throws NoSuchSecondaryHeadException {

		return remove((Serializable)secondaryHeadId);
	}

	/**
	 * Removes the secondary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the secondary head
	 * @return the secondary head that was removed
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	@Override
	public SecondaryHead remove(Serializable primaryKey)
		throws NoSuchSecondaryHeadException {

		Session session = null;

		try {
			session = openSession();

			SecondaryHead secondaryHead = (SecondaryHead)session.get(
				SecondaryHeadImpl.class, primaryKey);

			if (secondaryHead == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSecondaryHeadException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(secondaryHead);
		}
		catch (NoSuchSecondaryHeadException noSuchEntityException) {
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
	protected SecondaryHead removeImpl(SecondaryHead secondaryHead) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(secondaryHead)) {
				secondaryHead = (SecondaryHead)session.get(
					SecondaryHeadImpl.class, secondaryHead.getPrimaryKeyObj());
			}

			if (secondaryHead != null) {
				session.delete(secondaryHead);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (secondaryHead != null) {
			clearCache(secondaryHead);
		}

		return secondaryHead;
	}

	@Override
	public SecondaryHead updateImpl(SecondaryHead secondaryHead) {
		boolean isNew = secondaryHead.isNew();

		if (!(secondaryHead instanceof SecondaryHeadModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(secondaryHead.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					secondaryHead);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in secondaryHead proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SecondaryHead implementation " +
					secondaryHead.getClass());
		}

		SecondaryHeadModelImpl secondaryHeadModelImpl =
			(SecondaryHeadModelImpl)secondaryHead;

		if (Validator.isNull(secondaryHead.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			secondaryHead.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (secondaryHead.getCreateDate() == null)) {
			if (serviceContext == null) {
				secondaryHead.setCreateDate(date);
			}
			else {
				secondaryHead.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!secondaryHeadModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				secondaryHead.setModifiedDate(date);
			}
			else {
				secondaryHead.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(secondaryHead);
			}
			else {
				secondaryHead = (SecondaryHead)session.merge(secondaryHead);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SecondaryHeadImpl.class, secondaryHeadModelImpl, false, true);

		cacheUniqueFindersCache(secondaryHeadModelImpl);

		if (isNew) {
			secondaryHead.setNew(false);
		}

		secondaryHead.resetOriginalValues();

		return secondaryHead;
	}

	/**
	 * Returns the secondary head with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the secondary head
	 * @return the secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	@Override
	public SecondaryHead findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSecondaryHeadException {

		SecondaryHead secondaryHead = fetchByPrimaryKey(primaryKey);

		if (secondaryHead == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSecondaryHeadException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return secondaryHead;
	}

	/**
	 * Returns the secondary head with the primary key or throws a <code>NoSuchSecondaryHeadException</code> if it could not be found.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head
	 * @throws NoSuchSecondaryHeadException if a secondary head with the primary key could not be found
	 */
	@Override
	public SecondaryHead findByPrimaryKey(long secondaryHeadId)
		throws NoSuchSecondaryHeadException {

		return findByPrimaryKey((Serializable)secondaryHeadId);
	}

	/**
	 * Returns the secondary head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param secondaryHeadId the primary key of the secondary head
	 * @return the secondary head, or <code>null</code> if a secondary head with the primary key could not be found
	 */
	@Override
	public SecondaryHead fetchByPrimaryKey(long secondaryHeadId) {
		return fetchByPrimaryKey((Serializable)secondaryHeadId);
	}

	/**
	 * Returns all the secondary heads.
	 *
	 * @return the secondary heads
	 */
	@Override
	public List<SecondaryHead> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the secondary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @return the range of secondary heads
	 */
	@Override
	public List<SecondaryHead> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the secondary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of secondary heads
	 */
	@Override
	public List<SecondaryHead> findAll(
		int start, int end,
		OrderByComparator<SecondaryHead> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the secondary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SecondaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of secondary heads
	 * @param end the upper bound of the range of secondary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of secondary heads
	 */
	@Override
	public List<SecondaryHead> findAll(
		int start, int end, OrderByComparator<SecondaryHead> orderByComparator,
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

		List<SecondaryHead> list = null;

		if (useFinderCache) {
			list = (List<SecondaryHead>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SECONDARYHEAD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SECONDARYHEAD;

				sql = sql.concat(SecondaryHeadModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SecondaryHead>)QueryUtil.list(
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
	 * Removes all the secondary heads from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SecondaryHead secondaryHead : findAll()) {
			remove(secondaryHead);
		}
	}

	/**
	 * Returns the number of secondary heads.
	 *
	 * @return the number of secondary heads
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SECONDARYHEAD);

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
		return "secondaryHeadId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SECONDARYHEAD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SecondaryHeadModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the secondary head persistence.
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

		_finderPathWithPaginationFindBySecondaryHeadByPrimaryHeadId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBySecondaryHeadByPrimaryHeadId",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"primaryHeadId"}, true);

		_finderPathWithoutPaginationFindBySecondaryHeadByPrimaryHeadId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBySecondaryHeadByPrimaryHeadId",
				new String[] {Long.class.getName()},
				new String[] {"primaryHeadId"}, true);

		_finderPathCountBySecondaryHeadByPrimaryHeadId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySecondaryHeadByPrimaryHeadId",
			new String[] {Long.class.getName()}, new String[] {"primaryHeadId"},
			false);

		_setSecondaryHeadUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setSecondaryHeadUtilPersistence(null);

		entityCache.removeCache(SecondaryHeadImpl.class.getName());
	}

	private void _setSecondaryHeadUtilPersistence(
		SecondaryHeadPersistence secondaryHeadPersistence) {

		try {
			Field field = SecondaryHeadUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, secondaryHeadPersistence);
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

	private static final String _SQL_SELECT_SECONDARYHEAD =
		"SELECT secondaryHead FROM SecondaryHead secondaryHead";

	private static final String _SQL_SELECT_SECONDARYHEAD_WHERE =
		"SELECT secondaryHead FROM SecondaryHead secondaryHead WHERE ";

	private static final String _SQL_COUNT_SECONDARYHEAD =
		"SELECT COUNT(secondaryHead) FROM SecondaryHead secondaryHead";

	private static final String _SQL_COUNT_SECONDARYHEAD_WHERE =
		"SELECT COUNT(secondaryHead) FROM SecondaryHead secondaryHead WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "secondaryHead.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SecondaryHead exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SecondaryHead exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SecondaryHeadPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private SecondaryHeadModelArgumentsResolver
		_secondaryHeadModelArgumentsResolver;

}