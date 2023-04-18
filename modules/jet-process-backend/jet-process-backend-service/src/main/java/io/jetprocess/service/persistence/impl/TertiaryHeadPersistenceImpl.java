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

import io.jetprocess.exception.NoSuchTertiaryHeadException;
import io.jetprocess.model.TertiaryHead;
import io.jetprocess.model.TertiaryHeadTable;
import io.jetprocess.model.impl.TertiaryHeadImpl;
import io.jetprocess.model.impl.TertiaryHeadModelImpl;
import io.jetprocess.service.persistence.TertiaryHeadPersistence;
import io.jetprocess.service.persistence.TertiaryHeadUtil;
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
 * The persistence implementation for the tertiary head service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {TertiaryHeadPersistence.class, BasePersistence.class})
public class TertiaryHeadPersistenceImpl
	extends BasePersistenceImpl<TertiaryHead>
	implements TertiaryHeadPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TertiaryHeadUtil</code> to access the tertiary head persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TertiaryHeadImpl.class.getName();

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
	 * Returns all the tertiary heads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tertiary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @return the range of matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tertiary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TertiaryHead> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tertiary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TertiaryHead> orderByComparator,
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

		List<TertiaryHead> list = null;

		if (useFinderCache) {
			list = (List<TertiaryHead>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (TertiaryHead tertiaryHead : list) {
					if (!uuid.equals(tertiaryHead.getUuid())) {
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

			sb.append(_SQL_SELECT_TERTIARYHEAD_WHERE);

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
				sb.append(TertiaryHeadModelImpl.ORDER_BY_JPQL);
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

				list = (List<TertiaryHead>)QueryUtil.list(
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
	 * Returns the first tertiary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tertiary head
	 * @throws NoSuchTertiaryHeadException if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead findByUuid_First(
			String uuid, OrderByComparator<TertiaryHead> orderByComparator)
		throws NoSuchTertiaryHeadException {

		TertiaryHead tertiaryHead = fetchByUuid_First(uuid, orderByComparator);

		if (tertiaryHead != null) {
			return tertiaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTertiaryHeadException(sb.toString());
	}

	/**
	 * Returns the first tertiary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tertiary head, or <code>null</code> if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead fetchByUuid_First(
		String uuid, OrderByComparator<TertiaryHead> orderByComparator) {

		List<TertiaryHead> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tertiary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tertiary head
	 * @throws NoSuchTertiaryHeadException if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead findByUuid_Last(
			String uuid, OrderByComparator<TertiaryHead> orderByComparator)
		throws NoSuchTertiaryHeadException {

		TertiaryHead tertiaryHead = fetchByUuid_Last(uuid, orderByComparator);

		if (tertiaryHead != null) {
			return tertiaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTertiaryHeadException(sb.toString());
	}

	/**
	 * Returns the last tertiary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tertiary head, or <code>null</code> if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead fetchByUuid_Last(
		String uuid, OrderByComparator<TertiaryHead> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TertiaryHead> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tertiary heads before and after the current tertiary head in the ordered set where uuid = &#63;.
	 *
	 * @param tertiaryHeadId the primary key of the current tertiary head
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tertiary head
	 * @throws NoSuchTertiaryHeadException if a tertiary head with the primary key could not be found
	 */
	@Override
	public TertiaryHead[] findByUuid_PrevAndNext(
			long tertiaryHeadId, String uuid,
			OrderByComparator<TertiaryHead> orderByComparator)
		throws NoSuchTertiaryHeadException {

		uuid = Objects.toString(uuid, "");

		TertiaryHead tertiaryHead = findByPrimaryKey(tertiaryHeadId);

		Session session = null;

		try {
			session = openSession();

			TertiaryHead[] array = new TertiaryHeadImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, tertiaryHead, uuid, orderByComparator, true);

			array[1] = tertiaryHead;

			array[2] = getByUuid_PrevAndNext(
				session, tertiaryHead, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected TertiaryHead getByUuid_PrevAndNext(
		Session session, TertiaryHead tertiaryHead, String uuid,
		OrderByComparator<TertiaryHead> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TERTIARYHEAD_WHERE);

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
			sb.append(TertiaryHeadModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(tertiaryHead)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TertiaryHead> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tertiary heads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TertiaryHead tertiaryHead :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(tertiaryHead);
		}
	}

	/**
	 * Returns the number of tertiary heads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tertiary heads
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TERTIARYHEAD_WHERE);

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
		"tertiaryHead.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(tertiaryHead.uuid IS NULL OR tertiaryHead.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the tertiary head where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTertiaryHeadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tertiary head
	 * @throws NoSuchTertiaryHeadException if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead findByUUID_G(String uuid, long groupId)
		throws NoSuchTertiaryHeadException {

		TertiaryHead tertiaryHead = fetchByUUID_G(uuid, groupId);

		if (tertiaryHead == null) {
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

			throw new NoSuchTertiaryHeadException(sb.toString());
		}

		return tertiaryHead;
	}

	/**
	 * Returns the tertiary head where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tertiary head, or <code>null</code> if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the tertiary head where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tertiary head, or <code>null</code> if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead fetchByUUID_G(
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

		if (result instanceof TertiaryHead) {
			TertiaryHead tertiaryHead = (TertiaryHead)result;

			if (!Objects.equals(uuid, tertiaryHead.getUuid()) ||
				(groupId != tertiaryHead.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TERTIARYHEAD_WHERE);

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

				List<TertiaryHead> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					TertiaryHead tertiaryHead = list.get(0);

					result = tertiaryHead;

					cacheResult(tertiaryHead);
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
			return (TertiaryHead)result;
		}
	}

	/**
	 * Removes the tertiary head where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the tertiary head that was removed
	 */
	@Override
	public TertiaryHead removeByUUID_G(String uuid, long groupId)
		throws NoSuchTertiaryHeadException {

		TertiaryHead tertiaryHead = findByUUID_G(uuid, groupId);

		return remove(tertiaryHead);
	}

	/**
	 * Returns the number of tertiary heads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching tertiary heads
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TERTIARYHEAD_WHERE);

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
		"tertiaryHead.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(tertiaryHead.uuid IS NULL OR tertiaryHead.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"tertiaryHead.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the tertiary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tertiary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @return the range of matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tertiary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TertiaryHead> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tertiary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TertiaryHead> orderByComparator,
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

		List<TertiaryHead> list = null;

		if (useFinderCache) {
			list = (List<TertiaryHead>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (TertiaryHead tertiaryHead : list) {
					if (!uuid.equals(tertiaryHead.getUuid()) ||
						(companyId != tertiaryHead.getCompanyId())) {

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

			sb.append(_SQL_SELECT_TERTIARYHEAD_WHERE);

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
				sb.append(TertiaryHeadModelImpl.ORDER_BY_JPQL);
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

				list = (List<TertiaryHead>)QueryUtil.list(
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
	 * Returns the first tertiary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tertiary head
	 * @throws NoSuchTertiaryHeadException if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<TertiaryHead> orderByComparator)
		throws NoSuchTertiaryHeadException {

		TertiaryHead tertiaryHead = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (tertiaryHead != null) {
			return tertiaryHead;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchTertiaryHeadException(sb.toString());
	}

	/**
	 * Returns the first tertiary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tertiary head, or <code>null</code> if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<TertiaryHead> orderByComparator) {

		List<TertiaryHead> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tertiary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tertiary head
	 * @throws NoSuchTertiaryHeadException if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<TertiaryHead> orderByComparator)
		throws NoSuchTertiaryHeadException {

		TertiaryHead tertiaryHead = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (tertiaryHead != null) {
			return tertiaryHead;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchTertiaryHeadException(sb.toString());
	}

	/**
	 * Returns the last tertiary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tertiary head, or <code>null</code> if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<TertiaryHead> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<TertiaryHead> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tertiary heads before and after the current tertiary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param tertiaryHeadId the primary key of the current tertiary head
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tertiary head
	 * @throws NoSuchTertiaryHeadException if a tertiary head with the primary key could not be found
	 */
	@Override
	public TertiaryHead[] findByUuid_C_PrevAndNext(
			long tertiaryHeadId, String uuid, long companyId,
			OrderByComparator<TertiaryHead> orderByComparator)
		throws NoSuchTertiaryHeadException {

		uuid = Objects.toString(uuid, "");

		TertiaryHead tertiaryHead = findByPrimaryKey(tertiaryHeadId);

		Session session = null;

		try {
			session = openSession();

			TertiaryHead[] array = new TertiaryHeadImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, tertiaryHead, uuid, companyId, orderByComparator,
				true);

			array[1] = tertiaryHead;

			array[2] = getByUuid_C_PrevAndNext(
				session, tertiaryHead, uuid, companyId, orderByComparator,
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

	protected TertiaryHead getByUuid_C_PrevAndNext(
		Session session, TertiaryHead tertiaryHead, String uuid, long companyId,
		OrderByComparator<TertiaryHead> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_TERTIARYHEAD_WHERE);

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
			sb.append(TertiaryHeadModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(tertiaryHead)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TertiaryHead> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tertiary heads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (TertiaryHead tertiaryHead :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tertiaryHead);
		}
	}

	/**
	 * Returns the number of tertiary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching tertiary heads
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TERTIARYHEAD_WHERE);

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
		"tertiaryHead.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(tertiaryHead.uuid IS NULL OR tertiaryHead.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"tertiaryHead.companyId = ?";

	private FinderPath
		_finderPathWithPaginationFindByTertiaryHeadBySecondaryHeadId;
	private FinderPath
		_finderPathWithoutPaginationFindByTertiaryHeadBySecondaryHeadId;
	private FinderPath _finderPathCountByTertiaryHeadBySecondaryHeadId;

	/**
	 * Returns all the tertiary heads where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @return the matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByTertiaryHeadBySecondaryHeadId(
		long secondaryHeadId) {

		return findByTertiaryHeadBySecondaryHeadId(
			secondaryHeadId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tertiary heads where secondaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @return the range of matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByTertiaryHeadBySecondaryHeadId(
		long secondaryHeadId, int start, int end) {

		return findByTertiaryHeadBySecondaryHeadId(
			secondaryHeadId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tertiary heads where secondaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByTertiaryHeadBySecondaryHeadId(
		long secondaryHeadId, int start, int end,
		OrderByComparator<TertiaryHead> orderByComparator) {

		return findByTertiaryHeadBySecondaryHeadId(
			secondaryHeadId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tertiary heads where secondaryHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tertiary heads
	 */
	@Override
	public List<TertiaryHead> findByTertiaryHeadBySecondaryHeadId(
		long secondaryHeadId, int start, int end,
		OrderByComparator<TertiaryHead> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByTertiaryHeadBySecondaryHeadId;
				finderArgs = new Object[] {secondaryHeadId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindByTertiaryHeadBySecondaryHeadId;
			finderArgs = new Object[] {
				secondaryHeadId, start, end, orderByComparator
			};
		}

		List<TertiaryHead> list = null;

		if (useFinderCache) {
			list = (List<TertiaryHead>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (TertiaryHead tertiaryHead : list) {
					if (secondaryHeadId != tertiaryHead.getSecondaryHeadId()) {
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

			sb.append(_SQL_SELECT_TERTIARYHEAD_WHERE);

			sb.append(
				_FINDER_COLUMN_TERTIARYHEADBYSECONDARYHEADID_SECONDARYHEADID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TertiaryHeadModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(secondaryHeadId);

				list = (List<TertiaryHead>)QueryUtil.list(
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
	 * Returns the first tertiary head in the ordered set where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tertiary head
	 * @throws NoSuchTertiaryHeadException if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead findByTertiaryHeadBySecondaryHeadId_First(
			long secondaryHeadId,
			OrderByComparator<TertiaryHead> orderByComparator)
		throws NoSuchTertiaryHeadException {

		TertiaryHead tertiaryHead = fetchByTertiaryHeadBySecondaryHeadId_First(
			secondaryHeadId, orderByComparator);

		if (tertiaryHead != null) {
			return tertiaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("secondaryHeadId=");
		sb.append(secondaryHeadId);

		sb.append("}");

		throw new NoSuchTertiaryHeadException(sb.toString());
	}

	/**
	 * Returns the first tertiary head in the ordered set where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tertiary head, or <code>null</code> if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead fetchByTertiaryHeadBySecondaryHeadId_First(
		long secondaryHeadId,
		OrderByComparator<TertiaryHead> orderByComparator) {

		List<TertiaryHead> list = findByTertiaryHeadBySecondaryHeadId(
			secondaryHeadId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tertiary head in the ordered set where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tertiary head
	 * @throws NoSuchTertiaryHeadException if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead findByTertiaryHeadBySecondaryHeadId_Last(
			long secondaryHeadId,
			OrderByComparator<TertiaryHead> orderByComparator)
		throws NoSuchTertiaryHeadException {

		TertiaryHead tertiaryHead = fetchByTertiaryHeadBySecondaryHeadId_Last(
			secondaryHeadId, orderByComparator);

		if (tertiaryHead != null) {
			return tertiaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("secondaryHeadId=");
		sb.append(secondaryHeadId);

		sb.append("}");

		throw new NoSuchTertiaryHeadException(sb.toString());
	}

	/**
	 * Returns the last tertiary head in the ordered set where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tertiary head, or <code>null</code> if a matching tertiary head could not be found
	 */
	@Override
	public TertiaryHead fetchByTertiaryHeadBySecondaryHeadId_Last(
		long secondaryHeadId,
		OrderByComparator<TertiaryHead> orderByComparator) {

		int count = countByTertiaryHeadBySecondaryHeadId(secondaryHeadId);

		if (count == 0) {
			return null;
		}

		List<TertiaryHead> list = findByTertiaryHeadBySecondaryHeadId(
			secondaryHeadId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tertiary heads before and after the current tertiary head in the ordered set where secondaryHeadId = &#63;.
	 *
	 * @param tertiaryHeadId the primary key of the current tertiary head
	 * @param secondaryHeadId the secondary head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tertiary head
	 * @throws NoSuchTertiaryHeadException if a tertiary head with the primary key could not be found
	 */
	@Override
	public TertiaryHead[] findByTertiaryHeadBySecondaryHeadId_PrevAndNext(
			long tertiaryHeadId, long secondaryHeadId,
			OrderByComparator<TertiaryHead> orderByComparator)
		throws NoSuchTertiaryHeadException {

		TertiaryHead tertiaryHead = findByPrimaryKey(tertiaryHeadId);

		Session session = null;

		try {
			session = openSession();

			TertiaryHead[] array = new TertiaryHeadImpl[3];

			array[0] = getByTertiaryHeadBySecondaryHeadId_PrevAndNext(
				session, tertiaryHead, secondaryHeadId, orderByComparator,
				true);

			array[1] = tertiaryHead;

			array[2] = getByTertiaryHeadBySecondaryHeadId_PrevAndNext(
				session, tertiaryHead, secondaryHeadId, orderByComparator,
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

	protected TertiaryHead getByTertiaryHeadBySecondaryHeadId_PrevAndNext(
		Session session, TertiaryHead tertiaryHead, long secondaryHeadId,
		OrderByComparator<TertiaryHead> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_TERTIARYHEAD_WHERE);

		sb.append(
			_FINDER_COLUMN_TERTIARYHEADBYSECONDARYHEADID_SECONDARYHEADID_2);

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
			sb.append(TertiaryHeadModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(secondaryHeadId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(tertiaryHead)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TertiaryHead> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tertiary heads where secondaryHeadId = &#63; from the database.
	 *
	 * @param secondaryHeadId the secondary head ID
	 */
	@Override
	public void removeByTertiaryHeadBySecondaryHeadId(long secondaryHeadId) {
		for (TertiaryHead tertiaryHead :
				findByTertiaryHeadBySecondaryHeadId(
					secondaryHeadId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tertiaryHead);
		}
	}

	/**
	 * Returns the number of tertiary heads where secondaryHeadId = &#63;.
	 *
	 * @param secondaryHeadId the secondary head ID
	 * @return the number of matching tertiary heads
	 */
	@Override
	public int countByTertiaryHeadBySecondaryHeadId(long secondaryHeadId) {
		FinderPath finderPath = _finderPathCountByTertiaryHeadBySecondaryHeadId;

		Object[] finderArgs = new Object[] {secondaryHeadId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TERTIARYHEAD_WHERE);

			sb.append(
				_FINDER_COLUMN_TERTIARYHEADBYSECONDARYHEADID_SECONDARYHEADID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(secondaryHeadId);

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
		_FINDER_COLUMN_TERTIARYHEADBYSECONDARYHEADID_SECONDARYHEADID_2 =
			"tertiaryHead.secondaryHeadId = ?";

	public TertiaryHeadPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(TertiaryHead.class);

		setModelImplClass(TertiaryHeadImpl.class);
		setModelPKClass(long.class);

		setTable(TertiaryHeadTable.INSTANCE);
	}

	/**
	 * Caches the tertiary head in the entity cache if it is enabled.
	 *
	 * @param tertiaryHead the tertiary head
	 */
	@Override
	public void cacheResult(TertiaryHead tertiaryHead) {
		entityCache.putResult(
			TertiaryHeadImpl.class, tertiaryHead.getPrimaryKey(), tertiaryHead);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {tertiaryHead.getUuid(), tertiaryHead.getGroupId()},
			tertiaryHead);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tertiary heads in the entity cache if it is enabled.
	 *
	 * @param tertiaryHeads the tertiary heads
	 */
	@Override
	public void cacheResult(List<TertiaryHead> tertiaryHeads) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tertiaryHeads.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TertiaryHead tertiaryHead : tertiaryHeads) {
			if (entityCache.getResult(
					TertiaryHeadImpl.class, tertiaryHead.getPrimaryKey()) ==
						null) {

				cacheResult(tertiaryHead);
			}
		}
	}

	/**
	 * Clears the cache for all tertiary heads.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TertiaryHeadImpl.class);

		finderCache.clearCache(TertiaryHeadImpl.class);
	}

	/**
	 * Clears the cache for the tertiary head.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TertiaryHead tertiaryHead) {
		entityCache.removeResult(TertiaryHeadImpl.class, tertiaryHead);
	}

	@Override
	public void clearCache(List<TertiaryHead> tertiaryHeads) {
		for (TertiaryHead tertiaryHead : tertiaryHeads) {
			entityCache.removeResult(TertiaryHeadImpl.class, tertiaryHead);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TertiaryHeadImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(TertiaryHeadImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TertiaryHeadModelImpl tertiaryHeadModelImpl) {

		Object[] args = new Object[] {
			tertiaryHeadModelImpl.getUuid(), tertiaryHeadModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, tertiaryHeadModelImpl);
	}

	/**
	 * Creates a new tertiary head with the primary key. Does not add the tertiary head to the database.
	 *
	 * @param tertiaryHeadId the primary key for the new tertiary head
	 * @return the new tertiary head
	 */
	@Override
	public TertiaryHead create(long tertiaryHeadId) {
		TertiaryHead tertiaryHead = new TertiaryHeadImpl();

		tertiaryHead.setNew(true);
		tertiaryHead.setPrimaryKey(tertiaryHeadId);

		String uuid = PortalUUIDUtil.generate();

		tertiaryHead.setUuid(uuid);

		tertiaryHead.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tertiaryHead;
	}

	/**
	 * Removes the tertiary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tertiaryHeadId the primary key of the tertiary head
	 * @return the tertiary head that was removed
	 * @throws NoSuchTertiaryHeadException if a tertiary head with the primary key could not be found
	 */
	@Override
	public TertiaryHead remove(long tertiaryHeadId)
		throws NoSuchTertiaryHeadException {

		return remove((Serializable)tertiaryHeadId);
	}

	/**
	 * Removes the tertiary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tertiary head
	 * @return the tertiary head that was removed
	 * @throws NoSuchTertiaryHeadException if a tertiary head with the primary key could not be found
	 */
	@Override
	public TertiaryHead remove(Serializable primaryKey)
		throws NoSuchTertiaryHeadException {

		Session session = null;

		try {
			session = openSession();

			TertiaryHead tertiaryHead = (TertiaryHead)session.get(
				TertiaryHeadImpl.class, primaryKey);

			if (tertiaryHead == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTertiaryHeadException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tertiaryHead);
		}
		catch (NoSuchTertiaryHeadException noSuchEntityException) {
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
	protected TertiaryHead removeImpl(TertiaryHead tertiaryHead) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tertiaryHead)) {
				tertiaryHead = (TertiaryHead)session.get(
					TertiaryHeadImpl.class, tertiaryHead.getPrimaryKeyObj());
			}

			if (tertiaryHead != null) {
				session.delete(tertiaryHead);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tertiaryHead != null) {
			clearCache(tertiaryHead);
		}

		return tertiaryHead;
	}

	@Override
	public TertiaryHead updateImpl(TertiaryHead tertiaryHead) {
		boolean isNew = tertiaryHead.isNew();

		if (!(tertiaryHead instanceof TertiaryHeadModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tertiaryHead.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tertiaryHead);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tertiaryHead proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TertiaryHead implementation " +
					tertiaryHead.getClass());
		}

		TertiaryHeadModelImpl tertiaryHeadModelImpl =
			(TertiaryHeadModelImpl)tertiaryHead;

		if (Validator.isNull(tertiaryHead.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			tertiaryHead.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tertiaryHead.getCreateDate() == null)) {
			if (serviceContext == null) {
				tertiaryHead.setCreateDate(date);
			}
			else {
				tertiaryHead.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!tertiaryHeadModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tertiaryHead.setModifiedDate(date);
			}
			else {
				tertiaryHead.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tertiaryHead);
			}
			else {
				tertiaryHead = (TertiaryHead)session.merge(tertiaryHead);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TertiaryHeadImpl.class, tertiaryHeadModelImpl, false, true);

		cacheUniqueFindersCache(tertiaryHeadModelImpl);

		if (isNew) {
			tertiaryHead.setNew(false);
		}

		tertiaryHead.resetOriginalValues();

		return tertiaryHead;
	}

	/**
	 * Returns the tertiary head with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tertiary head
	 * @return the tertiary head
	 * @throws NoSuchTertiaryHeadException if a tertiary head with the primary key could not be found
	 */
	@Override
	public TertiaryHead findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTertiaryHeadException {

		TertiaryHead tertiaryHead = fetchByPrimaryKey(primaryKey);

		if (tertiaryHead == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTertiaryHeadException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tertiaryHead;
	}

	/**
	 * Returns the tertiary head with the primary key or throws a <code>NoSuchTertiaryHeadException</code> if it could not be found.
	 *
	 * @param tertiaryHeadId the primary key of the tertiary head
	 * @return the tertiary head
	 * @throws NoSuchTertiaryHeadException if a tertiary head with the primary key could not be found
	 */
	@Override
	public TertiaryHead findByPrimaryKey(long tertiaryHeadId)
		throws NoSuchTertiaryHeadException {

		return findByPrimaryKey((Serializable)tertiaryHeadId);
	}

	/**
	 * Returns the tertiary head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tertiaryHeadId the primary key of the tertiary head
	 * @return the tertiary head, or <code>null</code> if a tertiary head with the primary key could not be found
	 */
	@Override
	public TertiaryHead fetchByPrimaryKey(long tertiaryHeadId) {
		return fetchByPrimaryKey((Serializable)tertiaryHeadId);
	}

	/**
	 * Returns all the tertiary heads.
	 *
	 * @return the tertiary heads
	 */
	@Override
	public List<TertiaryHead> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tertiary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @return the range of tertiary heads
	 */
	@Override
	public List<TertiaryHead> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tertiary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tertiary heads
	 */
	@Override
	public List<TertiaryHead> findAll(
		int start, int end, OrderByComparator<TertiaryHead> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tertiary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TertiaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tertiary heads
	 * @param end the upper bound of the range of tertiary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tertiary heads
	 */
	@Override
	public List<TertiaryHead> findAll(
		int start, int end, OrderByComparator<TertiaryHead> orderByComparator,
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

		List<TertiaryHead> list = null;

		if (useFinderCache) {
			list = (List<TertiaryHead>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TERTIARYHEAD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TERTIARYHEAD;

				sql = sql.concat(TertiaryHeadModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TertiaryHead>)QueryUtil.list(
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
	 * Removes all the tertiary heads from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TertiaryHead tertiaryHead : findAll()) {
			remove(tertiaryHead);
		}
	}

	/**
	 * Returns the number of tertiary heads.
	 *
	 * @return the number of tertiary heads
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_TERTIARYHEAD);

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
		return "tertiaryHeadId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TERTIARYHEAD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TertiaryHeadModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tertiary head persistence.
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

		_finderPathWithPaginationFindByTertiaryHeadBySecondaryHeadId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findByTertiaryHeadBySecondaryHeadId",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"secondaryHeadId"}, true);

		_finderPathWithoutPaginationFindByTertiaryHeadBySecondaryHeadId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByTertiaryHeadBySecondaryHeadId",
				new String[] {Long.class.getName()},
				new String[] {"secondaryHeadId"}, true);

		_finderPathCountByTertiaryHeadBySecondaryHeadId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByTertiaryHeadBySecondaryHeadId",
			new String[] {Long.class.getName()},
			new String[] {"secondaryHeadId"}, false);

		_setTertiaryHeadUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setTertiaryHeadUtilPersistence(null);

		entityCache.removeCache(TertiaryHeadImpl.class.getName());
	}

	private void _setTertiaryHeadUtilPersistence(
		TertiaryHeadPersistence tertiaryHeadPersistence) {

		try {
			Field field = TertiaryHeadUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, tertiaryHeadPersistence);
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

	private static final String _SQL_SELECT_TERTIARYHEAD =
		"SELECT tertiaryHead FROM TertiaryHead tertiaryHead";

	private static final String _SQL_SELECT_TERTIARYHEAD_WHERE =
		"SELECT tertiaryHead FROM TertiaryHead tertiaryHead WHERE ";

	private static final String _SQL_COUNT_TERTIARYHEAD =
		"SELECT COUNT(tertiaryHead) FROM TertiaryHead tertiaryHead";

	private static final String _SQL_COUNT_TERTIARYHEAD_WHERE =
		"SELECT COUNT(tertiaryHead) FROM TertiaryHead tertiaryHead WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "tertiaryHead.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TertiaryHead exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TertiaryHead exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TertiaryHeadPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private TertiaryHeadModelArgumentsResolver
		_tertiaryHeadModelArgumentsResolver;

}