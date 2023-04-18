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

import io.jetprocess.exception.NoSuchPrimaryHeadException;
import io.jetprocess.model.PrimaryHead;
import io.jetprocess.model.PrimaryHeadTable;
import io.jetprocess.model.impl.PrimaryHeadImpl;
import io.jetprocess.model.impl.PrimaryHeadModelImpl;
import io.jetprocess.service.persistence.PrimaryHeadPersistence;
import io.jetprocess.service.persistence.PrimaryHeadUtil;
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
 * The persistence implementation for the primary head service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {PrimaryHeadPersistence.class, BasePersistence.class})
public class PrimaryHeadPersistenceImpl
	extends BasePersistenceImpl<PrimaryHead> implements PrimaryHeadPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PrimaryHeadUtil</code> to access the primary head persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PrimaryHeadImpl.class.getName();

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
	 * Returns all the primary heads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the primary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @return the range of matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the primary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PrimaryHead> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the primary heads where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<PrimaryHead> orderByComparator,
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

		List<PrimaryHead> list = null;

		if (useFinderCache) {
			list = (List<PrimaryHead>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (PrimaryHead primaryHead : list) {
					if (!uuid.equals(primaryHead.getUuid())) {
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

			sb.append(_SQL_SELECT_PRIMARYHEAD_WHERE);

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
				sb.append(PrimaryHeadModelImpl.ORDER_BY_JPQL);
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

				list = (List<PrimaryHead>)QueryUtil.list(
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
	 * Returns the first primary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead findByUuid_First(
			String uuid, OrderByComparator<PrimaryHead> orderByComparator)
		throws NoSuchPrimaryHeadException {

		PrimaryHead primaryHead = fetchByUuid_First(uuid, orderByComparator);

		if (primaryHead != null) {
			return primaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPrimaryHeadException(sb.toString());
	}

	/**
	 * Returns the first primary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead fetchByUuid_First(
		String uuid, OrderByComparator<PrimaryHead> orderByComparator) {

		List<PrimaryHead> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last primary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead findByUuid_Last(
			String uuid, OrderByComparator<PrimaryHead> orderByComparator)
		throws NoSuchPrimaryHeadException {

		PrimaryHead primaryHead = fetchByUuid_Last(uuid, orderByComparator);

		if (primaryHead != null) {
			return primaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPrimaryHeadException(sb.toString());
	}

	/**
	 * Returns the last primary head in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead fetchByUuid_Last(
		String uuid, OrderByComparator<PrimaryHead> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<PrimaryHead> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the primary heads before and after the current primary head in the ordered set where uuid = &#63;.
	 *
	 * @param primaryHeadId the primary key of the current primary head
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next primary head
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	@Override
	public PrimaryHead[] findByUuid_PrevAndNext(
			long primaryHeadId, String uuid,
			OrderByComparator<PrimaryHead> orderByComparator)
		throws NoSuchPrimaryHeadException {

		uuid = Objects.toString(uuid, "");

		PrimaryHead primaryHead = findByPrimaryKey(primaryHeadId);

		Session session = null;

		try {
			session = openSession();

			PrimaryHead[] array = new PrimaryHeadImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, primaryHead, uuid, orderByComparator, true);

			array[1] = primaryHead;

			array[2] = getByUuid_PrevAndNext(
				session, primaryHead, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PrimaryHead getByUuid_PrevAndNext(
		Session session, PrimaryHead primaryHead, String uuid,
		OrderByComparator<PrimaryHead> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PRIMARYHEAD_WHERE);

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
			sb.append(PrimaryHeadModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(primaryHead)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PrimaryHead> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the primary heads where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (PrimaryHead primaryHead :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(primaryHead);
		}
	}

	/**
	 * Returns the number of primary heads where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching primary heads
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PRIMARYHEAD_WHERE);

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
		"primaryHead.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(primaryHead.uuid IS NULL OR primaryHead.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the primary head where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPrimaryHeadException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead findByUUID_G(String uuid, long groupId)
		throws NoSuchPrimaryHeadException {

		PrimaryHead primaryHead = fetchByUUID_G(uuid, groupId);

		if (primaryHead == null) {
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

			throw new NoSuchPrimaryHeadException(sb.toString());
		}

		return primaryHead;
	}

	/**
	 * Returns the primary head where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the primary head where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead fetchByUUID_G(
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

		if (result instanceof PrimaryHead) {
			PrimaryHead primaryHead = (PrimaryHead)result;

			if (!Objects.equals(uuid, primaryHead.getUuid()) ||
				(groupId != primaryHead.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_PRIMARYHEAD_WHERE);

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

				List<PrimaryHead> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					PrimaryHead primaryHead = list.get(0);

					result = primaryHead;

					cacheResult(primaryHead);
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
			return (PrimaryHead)result;
		}
	}

	/**
	 * Removes the primary head where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the primary head that was removed
	 */
	@Override
	public PrimaryHead removeByUUID_G(String uuid, long groupId)
		throws NoSuchPrimaryHeadException {

		PrimaryHead primaryHead = findByUUID_G(uuid, groupId);

		return remove(primaryHead);
	}

	/**
	 * Returns the number of primary heads where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching primary heads
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PRIMARYHEAD_WHERE);

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
		"primaryHead.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(primaryHead.uuid IS NULL OR primaryHead.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"primaryHead.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the primary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the primary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @return the range of matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the primary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PrimaryHead> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the primary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PrimaryHead> orderByComparator,
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

		List<PrimaryHead> list = null;

		if (useFinderCache) {
			list = (List<PrimaryHead>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (PrimaryHead primaryHead : list) {
					if (!uuid.equals(primaryHead.getUuid()) ||
						(companyId != primaryHead.getCompanyId())) {

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

			sb.append(_SQL_SELECT_PRIMARYHEAD_WHERE);

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
				sb.append(PrimaryHeadModelImpl.ORDER_BY_JPQL);
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

				list = (List<PrimaryHead>)QueryUtil.list(
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
	 * Returns the first primary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<PrimaryHead> orderByComparator)
		throws NoSuchPrimaryHeadException {

		PrimaryHead primaryHead = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (primaryHead != null) {
			return primaryHead;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchPrimaryHeadException(sb.toString());
	}

	/**
	 * Returns the first primary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<PrimaryHead> orderByComparator) {

		List<PrimaryHead> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last primary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<PrimaryHead> orderByComparator)
		throws NoSuchPrimaryHeadException {

		PrimaryHead primaryHead = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (primaryHead != null) {
			return primaryHead;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchPrimaryHeadException(sb.toString());
	}

	/**
	 * Returns the last primary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<PrimaryHead> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<PrimaryHead> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the primary heads before and after the current primary head in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param primaryHeadId the primary key of the current primary head
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next primary head
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	@Override
	public PrimaryHead[] findByUuid_C_PrevAndNext(
			long primaryHeadId, String uuid, long companyId,
			OrderByComparator<PrimaryHead> orderByComparator)
		throws NoSuchPrimaryHeadException {

		uuid = Objects.toString(uuid, "");

		PrimaryHead primaryHead = findByPrimaryKey(primaryHeadId);

		Session session = null;

		try {
			session = openSession();

			PrimaryHead[] array = new PrimaryHeadImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, primaryHead, uuid, companyId, orderByComparator, true);

			array[1] = primaryHead;

			array[2] = getByUuid_C_PrevAndNext(
				session, primaryHead, uuid, companyId, orderByComparator,
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

	protected PrimaryHead getByUuid_C_PrevAndNext(
		Session session, PrimaryHead primaryHead, String uuid, long companyId,
		OrderByComparator<PrimaryHead> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_PRIMARYHEAD_WHERE);

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
			sb.append(PrimaryHeadModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(primaryHead)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PrimaryHead> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the primary heads where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (PrimaryHead primaryHead :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(primaryHead);
		}
	}

	/**
	 * Returns the number of primary heads where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching primary heads
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PRIMARYHEAD_WHERE);

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
		"primaryHead.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(primaryHead.uuid IS NULL OR primaryHead.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"primaryHead.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByPrimaryHeadByBasicHeadId;
	private FinderPath
		_finderPathWithoutPaginationFindByPrimaryHeadByBasicHeadId;
	private FinderPath _finderPathCountByPrimaryHeadByBasicHeadId;

	/**
	 * Returns all the primary heads where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @return the matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByPrimaryHeadByBasicHeadId(long basicHeadId) {
		return findByPrimaryHeadByBasicHeadId(
			basicHeadId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the primary heads where basicHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param basicHeadId the basic head ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @return the range of matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId, int start, int end) {

		return findByPrimaryHeadByBasicHeadId(basicHeadId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the primary heads where basicHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param basicHeadId the basic head ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId, int start, int end,
		OrderByComparator<PrimaryHead> orderByComparator) {

		return findByPrimaryHeadByBasicHeadId(
			basicHeadId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the primary heads where basicHeadId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param basicHeadId the basic head ID
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching primary heads
	 */
	@Override
	public List<PrimaryHead> findByPrimaryHeadByBasicHeadId(
		long basicHeadId, int start, int end,
		OrderByComparator<PrimaryHead> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByPrimaryHeadByBasicHeadId;
				finderArgs = new Object[] {basicHeadId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindByPrimaryHeadByBasicHeadId;
			finderArgs = new Object[] {
				basicHeadId, start, end, orderByComparator
			};
		}

		List<PrimaryHead> list = null;

		if (useFinderCache) {
			list = (List<PrimaryHead>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (PrimaryHead primaryHead : list) {
					if (basicHeadId != primaryHead.getBasicHeadId()) {
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

			sb.append(_SQL_SELECT_PRIMARYHEAD_WHERE);

			sb.append(_FINDER_COLUMN_PRIMARYHEADBYBASICHEADID_BASICHEADID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PrimaryHeadModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(basicHeadId);

				list = (List<PrimaryHead>)QueryUtil.list(
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
	 * Returns the first primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead findByPrimaryHeadByBasicHeadId_First(
			long basicHeadId, OrderByComparator<PrimaryHead> orderByComparator)
		throws NoSuchPrimaryHeadException {

		PrimaryHead primaryHead = fetchByPrimaryHeadByBasicHeadId_First(
			basicHeadId, orderByComparator);

		if (primaryHead != null) {
			return primaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("basicHeadId=");
		sb.append(basicHeadId);

		sb.append("}");

		throw new NoSuchPrimaryHeadException(sb.toString());
	}

	/**
	 * Returns the first primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead fetchByPrimaryHeadByBasicHeadId_First(
		long basicHeadId, OrderByComparator<PrimaryHead> orderByComparator) {

		List<PrimaryHead> list = findByPrimaryHeadByBasicHeadId(
			basicHeadId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching primary head
	 * @throws NoSuchPrimaryHeadException if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead findByPrimaryHeadByBasicHeadId_Last(
			long basicHeadId, OrderByComparator<PrimaryHead> orderByComparator)
		throws NoSuchPrimaryHeadException {

		PrimaryHead primaryHead = fetchByPrimaryHeadByBasicHeadId_Last(
			basicHeadId, orderByComparator);

		if (primaryHead != null) {
			return primaryHead;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("basicHeadId=");
		sb.append(basicHeadId);

		sb.append("}");

		throw new NoSuchPrimaryHeadException(sb.toString());
	}

	/**
	 * Returns the last primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching primary head, or <code>null</code> if a matching primary head could not be found
	 */
	@Override
	public PrimaryHead fetchByPrimaryHeadByBasicHeadId_Last(
		long basicHeadId, OrderByComparator<PrimaryHead> orderByComparator) {

		int count = countByPrimaryHeadByBasicHeadId(basicHeadId);

		if (count == 0) {
			return null;
		}

		List<PrimaryHead> list = findByPrimaryHeadByBasicHeadId(
			basicHeadId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the primary heads before and after the current primary head in the ordered set where basicHeadId = &#63;.
	 *
	 * @param primaryHeadId the primary key of the current primary head
	 * @param basicHeadId the basic head ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next primary head
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	@Override
	public PrimaryHead[] findByPrimaryHeadByBasicHeadId_PrevAndNext(
			long primaryHeadId, long basicHeadId,
			OrderByComparator<PrimaryHead> orderByComparator)
		throws NoSuchPrimaryHeadException {

		PrimaryHead primaryHead = findByPrimaryKey(primaryHeadId);

		Session session = null;

		try {
			session = openSession();

			PrimaryHead[] array = new PrimaryHeadImpl[3];

			array[0] = getByPrimaryHeadByBasicHeadId_PrevAndNext(
				session, primaryHead, basicHeadId, orderByComparator, true);

			array[1] = primaryHead;

			array[2] = getByPrimaryHeadByBasicHeadId_PrevAndNext(
				session, primaryHead, basicHeadId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PrimaryHead getByPrimaryHeadByBasicHeadId_PrevAndNext(
		Session session, PrimaryHead primaryHead, long basicHeadId,
		OrderByComparator<PrimaryHead> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PRIMARYHEAD_WHERE);

		sb.append(_FINDER_COLUMN_PRIMARYHEADBYBASICHEADID_BASICHEADID_2);

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
			sb.append(PrimaryHeadModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(basicHeadId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(primaryHead)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PrimaryHead> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the primary heads where basicHeadId = &#63; from the database.
	 *
	 * @param basicHeadId the basic head ID
	 */
	@Override
	public void removeByPrimaryHeadByBasicHeadId(long basicHeadId) {
		for (PrimaryHead primaryHead :
				findByPrimaryHeadByBasicHeadId(
					basicHeadId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(primaryHead);
		}
	}

	/**
	 * Returns the number of primary heads where basicHeadId = &#63;.
	 *
	 * @param basicHeadId the basic head ID
	 * @return the number of matching primary heads
	 */
	@Override
	public int countByPrimaryHeadByBasicHeadId(long basicHeadId) {
		FinderPath finderPath = _finderPathCountByPrimaryHeadByBasicHeadId;

		Object[] finderArgs = new Object[] {basicHeadId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PRIMARYHEAD_WHERE);

			sb.append(_FINDER_COLUMN_PRIMARYHEADBYBASICHEADID_BASICHEADID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(basicHeadId);

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
		_FINDER_COLUMN_PRIMARYHEADBYBASICHEADID_BASICHEADID_2 =
			"primaryHead.basicHeadId = ?";

	public PrimaryHeadPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(PrimaryHead.class);

		setModelImplClass(PrimaryHeadImpl.class);
		setModelPKClass(long.class);

		setTable(PrimaryHeadTable.INSTANCE);
	}

	/**
	 * Caches the primary head in the entity cache if it is enabled.
	 *
	 * @param primaryHead the primary head
	 */
	@Override
	public void cacheResult(PrimaryHead primaryHead) {
		entityCache.putResult(
			PrimaryHeadImpl.class, primaryHead.getPrimaryKey(), primaryHead);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {primaryHead.getUuid(), primaryHead.getGroupId()},
			primaryHead);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the primary heads in the entity cache if it is enabled.
	 *
	 * @param primaryHeads the primary heads
	 */
	@Override
	public void cacheResult(List<PrimaryHead> primaryHeads) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (primaryHeads.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PrimaryHead primaryHead : primaryHeads) {
			if (entityCache.getResult(
					PrimaryHeadImpl.class, primaryHead.getPrimaryKey()) ==
						null) {

				cacheResult(primaryHead);
			}
		}
	}

	/**
	 * Clears the cache for all primary heads.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PrimaryHeadImpl.class);

		finderCache.clearCache(PrimaryHeadImpl.class);
	}

	/**
	 * Clears the cache for the primary head.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PrimaryHead primaryHead) {
		entityCache.removeResult(PrimaryHeadImpl.class, primaryHead);
	}

	@Override
	public void clearCache(List<PrimaryHead> primaryHeads) {
		for (PrimaryHead primaryHead : primaryHeads) {
			entityCache.removeResult(PrimaryHeadImpl.class, primaryHead);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PrimaryHeadImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PrimaryHeadImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PrimaryHeadModelImpl primaryHeadModelImpl) {

		Object[] args = new Object[] {
			primaryHeadModelImpl.getUuid(), primaryHeadModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, primaryHeadModelImpl);
	}

	/**
	 * Creates a new primary head with the primary key. Does not add the primary head to the database.
	 *
	 * @param primaryHeadId the primary key for the new primary head
	 * @return the new primary head
	 */
	@Override
	public PrimaryHead create(long primaryHeadId) {
		PrimaryHead primaryHead = new PrimaryHeadImpl();

		primaryHead.setNew(true);
		primaryHead.setPrimaryKey(primaryHeadId);

		String uuid = PortalUUIDUtil.generate();

		primaryHead.setUuid(uuid);

		primaryHead.setCompanyId(CompanyThreadLocal.getCompanyId());

		return primaryHead;
	}

	/**
	 * Removes the primary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryHeadId the primary key of the primary head
	 * @return the primary head that was removed
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	@Override
	public PrimaryHead remove(long primaryHeadId)
		throws NoSuchPrimaryHeadException {

		return remove((Serializable)primaryHeadId);
	}

	/**
	 * Removes the primary head with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the primary head
	 * @return the primary head that was removed
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	@Override
	public PrimaryHead remove(Serializable primaryKey)
		throws NoSuchPrimaryHeadException {

		Session session = null;

		try {
			session = openSession();

			PrimaryHead primaryHead = (PrimaryHead)session.get(
				PrimaryHeadImpl.class, primaryKey);

			if (primaryHead == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPrimaryHeadException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(primaryHead);
		}
		catch (NoSuchPrimaryHeadException noSuchEntityException) {
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
	protected PrimaryHead removeImpl(PrimaryHead primaryHead) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(primaryHead)) {
				primaryHead = (PrimaryHead)session.get(
					PrimaryHeadImpl.class, primaryHead.getPrimaryKeyObj());
			}

			if (primaryHead != null) {
				session.delete(primaryHead);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (primaryHead != null) {
			clearCache(primaryHead);
		}

		return primaryHead;
	}

	@Override
	public PrimaryHead updateImpl(PrimaryHead primaryHead) {
		boolean isNew = primaryHead.isNew();

		if (!(primaryHead instanceof PrimaryHeadModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(primaryHead.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(primaryHead);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in primaryHead proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PrimaryHead implementation " +
					primaryHead.getClass());
		}

		PrimaryHeadModelImpl primaryHeadModelImpl =
			(PrimaryHeadModelImpl)primaryHead;

		if (Validator.isNull(primaryHead.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			primaryHead.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (primaryHead.getCreateDate() == null)) {
			if (serviceContext == null) {
				primaryHead.setCreateDate(date);
			}
			else {
				primaryHead.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!primaryHeadModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				primaryHead.setModifiedDate(date);
			}
			else {
				primaryHead.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(primaryHead);
			}
			else {
				primaryHead = (PrimaryHead)session.merge(primaryHead);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PrimaryHeadImpl.class, primaryHeadModelImpl, false, true);

		cacheUniqueFindersCache(primaryHeadModelImpl);

		if (isNew) {
			primaryHead.setNew(false);
		}

		primaryHead.resetOriginalValues();

		return primaryHead;
	}

	/**
	 * Returns the primary head with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the primary head
	 * @return the primary head
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	@Override
	public PrimaryHead findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPrimaryHeadException {

		PrimaryHead primaryHead = fetchByPrimaryKey(primaryKey);

		if (primaryHead == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPrimaryHeadException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return primaryHead;
	}

	/**
	 * Returns the primary head with the primary key or throws a <code>NoSuchPrimaryHeadException</code> if it could not be found.
	 *
	 * @param primaryHeadId the primary key of the primary head
	 * @return the primary head
	 * @throws NoSuchPrimaryHeadException if a primary head with the primary key could not be found
	 */
	@Override
	public PrimaryHead findByPrimaryKey(long primaryHeadId)
		throws NoSuchPrimaryHeadException {

		return findByPrimaryKey((Serializable)primaryHeadId);
	}

	/**
	 * Returns the primary head with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryHeadId the primary key of the primary head
	 * @return the primary head, or <code>null</code> if a primary head with the primary key could not be found
	 */
	@Override
	public PrimaryHead fetchByPrimaryKey(long primaryHeadId) {
		return fetchByPrimaryKey((Serializable)primaryHeadId);
	}

	/**
	 * Returns all the primary heads.
	 *
	 * @return the primary heads
	 */
	@Override
	public List<PrimaryHead> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the primary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @return the range of primary heads
	 */
	@Override
	public List<PrimaryHead> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the primary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of primary heads
	 */
	@Override
	public List<PrimaryHead> findAll(
		int start, int end, OrderByComparator<PrimaryHead> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the primary heads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PrimaryHeadModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of primary heads
	 * @param end the upper bound of the range of primary heads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of primary heads
	 */
	@Override
	public List<PrimaryHead> findAll(
		int start, int end, OrderByComparator<PrimaryHead> orderByComparator,
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

		List<PrimaryHead> list = null;

		if (useFinderCache) {
			list = (List<PrimaryHead>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PRIMARYHEAD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PRIMARYHEAD;

				sql = sql.concat(PrimaryHeadModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PrimaryHead>)QueryUtil.list(
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
	 * Removes all the primary heads from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PrimaryHead primaryHead : findAll()) {
			remove(primaryHead);
		}
	}

	/**
	 * Returns the number of primary heads.
	 *
	 * @return the number of primary heads
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PRIMARYHEAD);

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
		return "primaryHeadId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PRIMARYHEAD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PrimaryHeadModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the primary head persistence.
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

		_finderPathWithPaginationFindByPrimaryHeadByBasicHeadId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findByPrimaryHeadByBasicHeadId",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"basicHeadId"}, true);

		_finderPathWithoutPaginationFindByPrimaryHeadByBasicHeadId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByPrimaryHeadByBasicHeadId",
				new String[] {Long.class.getName()},
				new String[] {"basicHeadId"}, true);

		_finderPathCountByPrimaryHeadByBasicHeadId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByPrimaryHeadByBasicHeadId",
			new String[] {Long.class.getName()}, new String[] {"basicHeadId"},
			false);

		_setPrimaryHeadUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPrimaryHeadUtilPersistence(null);

		entityCache.removeCache(PrimaryHeadImpl.class.getName());
	}

	private void _setPrimaryHeadUtilPersistence(
		PrimaryHeadPersistence primaryHeadPersistence) {

		try {
			Field field = PrimaryHeadUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, primaryHeadPersistence);
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

	private static final String _SQL_SELECT_PRIMARYHEAD =
		"SELECT primaryHead FROM PrimaryHead primaryHead";

	private static final String _SQL_SELECT_PRIMARYHEAD_WHERE =
		"SELECT primaryHead FROM PrimaryHead primaryHead WHERE ";

	private static final String _SQL_COUNT_PRIMARYHEAD =
		"SELECT COUNT(primaryHead) FROM PrimaryHead primaryHead";

	private static final String _SQL_COUNT_PRIMARYHEAD_WHERE =
		"SELECT COUNT(primaryHead) FROM PrimaryHead primaryHead WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "primaryHead.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PrimaryHead exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PrimaryHead exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PrimaryHeadPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PrimaryHeadModelArgumentsResolver
		_primaryHeadModelArgumentsResolver;

}