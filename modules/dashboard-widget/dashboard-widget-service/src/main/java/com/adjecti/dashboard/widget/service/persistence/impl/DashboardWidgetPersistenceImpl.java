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

package com.adjecti.dashboard.widget.service.persistence.impl;

import com.adjecti.dashboard.widget.exception.NoSuchDashboardWidgetException;
import com.adjecti.dashboard.widget.model.DashboardWidget;
import com.adjecti.dashboard.widget.model.DashboardWidgetTable;
import com.adjecti.dashboard.widget.model.impl.DashboardWidgetImpl;
import com.adjecti.dashboard.widget.model.impl.DashboardWidgetModelImpl;
import com.adjecti.dashboard.widget.service.persistence.DashboardWidgetPersistence;
import com.adjecti.dashboard.widget.service.persistence.DashboardWidgetUtil;
import com.adjecti.dashboard.widget.service.persistence.impl.constants.adjectiPersistenceConstants;

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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the dashboard widget service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {DashboardWidgetPersistence.class, BasePersistence.class})
public class DashboardWidgetPersistenceImpl
	extends BasePersistenceImpl<DashboardWidget>
	implements DashboardWidgetPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DashboardWidgetUtil</code> to access the dashboard widget persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DashboardWidgetImpl.class.getName();

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
	 * Returns all the dashboard widgets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard widgets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardWidgetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @return the range of matching dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard widgets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardWidgetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DashboardWidget> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard widgets where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardWidgetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<DashboardWidget> orderByComparator,
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

		List<DashboardWidget> list = null;

		if (useFinderCache) {
			list = (List<DashboardWidget>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (DashboardWidget dashboardWidget : list) {
					if (!uuid.equals(dashboardWidget.getUuid())) {
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

			sb.append(_SQL_SELECT_DASHBOARDWIDGET_WHERE);

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
				sb.append(DashboardWidgetModelImpl.ORDER_BY_JPQL);
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

				list = (List<DashboardWidget>)QueryUtil.list(
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
	 * Returns the first dashboard widget in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard widget
	 * @throws NoSuchDashboardWidgetException if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget findByUuid_First(
			String uuid, OrderByComparator<DashboardWidget> orderByComparator)
		throws NoSuchDashboardWidgetException {

		DashboardWidget dashboardWidget = fetchByUuid_First(
			uuid, orderByComparator);

		if (dashboardWidget != null) {
			return dashboardWidget;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDashboardWidgetException(sb.toString());
	}

	/**
	 * Returns the first dashboard widget in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard widget, or <code>null</code> if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget fetchByUuid_First(
		String uuid, OrderByComparator<DashboardWidget> orderByComparator) {

		List<DashboardWidget> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dashboard widget in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard widget
	 * @throws NoSuchDashboardWidgetException if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget findByUuid_Last(
			String uuid, OrderByComparator<DashboardWidget> orderByComparator)
		throws NoSuchDashboardWidgetException {

		DashboardWidget dashboardWidget = fetchByUuid_Last(
			uuid, orderByComparator);

		if (dashboardWidget != null) {
			return dashboardWidget;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchDashboardWidgetException(sb.toString());
	}

	/**
	 * Returns the last dashboard widget in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard widget, or <code>null</code> if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget fetchByUuid_Last(
		String uuid, OrderByComparator<DashboardWidget> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DashboardWidget> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dashboard widgets before and after the current dashboard widget in the ordered set where uuid = &#63;.
	 *
	 * @param dashboardWidgetId the primary key of the current dashboard widget
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard widget
	 * @throws NoSuchDashboardWidgetException if a dashboard widget with the primary key could not be found
	 */
	@Override
	public DashboardWidget[] findByUuid_PrevAndNext(
			long dashboardWidgetId, String uuid,
			OrderByComparator<DashboardWidget> orderByComparator)
		throws NoSuchDashboardWidgetException {

		uuid = Objects.toString(uuid, "");

		DashboardWidget dashboardWidget = findByPrimaryKey(dashboardWidgetId);

		Session session = null;

		try {
			session = openSession();

			DashboardWidget[] array = new DashboardWidgetImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, dashboardWidget, uuid, orderByComparator, true);

			array[1] = dashboardWidget;

			array[2] = getByUuid_PrevAndNext(
				session, dashboardWidget, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DashboardWidget getByUuid_PrevAndNext(
		Session session, DashboardWidget dashboardWidget, String uuid,
		OrderByComparator<DashboardWidget> orderByComparator,
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

		sb.append(_SQL_SELECT_DASHBOARDWIDGET_WHERE);

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
			sb.append(DashboardWidgetModelImpl.ORDER_BY_JPQL);
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
						dashboardWidget)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DashboardWidget> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dashboard widgets where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DashboardWidget dashboardWidget :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(dashboardWidget);
		}
	}

	/**
	 * Returns the number of dashboard widgets where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dashboard widgets
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DASHBOARDWIDGET_WHERE);

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
		"dashboardWidget.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(dashboardWidget.uuid IS NULL OR dashboardWidget.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the dashboard widget where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchDashboardWidgetException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dashboard widget
	 * @throws NoSuchDashboardWidgetException if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget findByUUID_G(String uuid, long groupId)
		throws NoSuchDashboardWidgetException {

		DashboardWidget dashboardWidget = fetchByUUID_G(uuid, groupId);

		if (dashboardWidget == null) {
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

			throw new NoSuchDashboardWidgetException(sb.toString());
		}

		return dashboardWidget;
	}

	/**
	 * Returns the dashboard widget where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dashboard widget, or <code>null</code> if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the dashboard widget where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dashboard widget, or <code>null</code> if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget fetchByUUID_G(
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

		if (result instanceof DashboardWidget) {
			DashboardWidget dashboardWidget = (DashboardWidget)result;

			if (!Objects.equals(uuid, dashboardWidget.getUuid()) ||
				(groupId != dashboardWidget.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_DASHBOARDWIDGET_WHERE);

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

				List<DashboardWidget> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					DashboardWidget dashboardWidget = list.get(0);

					result = dashboardWidget;

					cacheResult(dashboardWidget);
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
			return (DashboardWidget)result;
		}
	}

	/**
	 * Removes the dashboard widget where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dashboard widget that was removed
	 */
	@Override
	public DashboardWidget removeByUUID_G(String uuid, long groupId)
		throws NoSuchDashboardWidgetException {

		DashboardWidget dashboardWidget = findByUUID_G(uuid, groupId);

		return remove(dashboardWidget);
	}

	/**
	 * Returns the number of dashboard widgets where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dashboard widgets
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DASHBOARDWIDGET_WHERE);

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
		"dashboardWidget.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(dashboardWidget.uuid IS NULL OR dashboardWidget.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"dashboardWidget.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the dashboard widgets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard widgets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardWidgetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @return the range of matching dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard widgets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardWidgetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DashboardWidget> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard widgets where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardWidgetModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<DashboardWidget> orderByComparator,
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

		List<DashboardWidget> list = null;

		if (useFinderCache) {
			list = (List<DashboardWidget>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (DashboardWidget dashboardWidget : list) {
					if (!uuid.equals(dashboardWidget.getUuid()) ||
						(companyId != dashboardWidget.getCompanyId())) {

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

			sb.append(_SQL_SELECT_DASHBOARDWIDGET_WHERE);

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
				sb.append(DashboardWidgetModelImpl.ORDER_BY_JPQL);
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

				list = (List<DashboardWidget>)QueryUtil.list(
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
	 * Returns the first dashboard widget in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard widget
	 * @throws NoSuchDashboardWidgetException if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<DashboardWidget> orderByComparator)
		throws NoSuchDashboardWidgetException {

		DashboardWidget dashboardWidget = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (dashboardWidget != null) {
			return dashboardWidget;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDashboardWidgetException(sb.toString());
	}

	/**
	 * Returns the first dashboard widget in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard widget, or <code>null</code> if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<DashboardWidget> orderByComparator) {

		List<DashboardWidget> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dashboard widget in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard widget
	 * @throws NoSuchDashboardWidgetException if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<DashboardWidget> orderByComparator)
		throws NoSuchDashboardWidgetException {

		DashboardWidget dashboardWidget = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (dashboardWidget != null) {
			return dashboardWidget;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchDashboardWidgetException(sb.toString());
	}

	/**
	 * Returns the last dashboard widget in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard widget, or <code>null</code> if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<DashboardWidget> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DashboardWidget> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dashboard widgets before and after the current dashboard widget in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param dashboardWidgetId the primary key of the current dashboard widget
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard widget
	 * @throws NoSuchDashboardWidgetException if a dashboard widget with the primary key could not be found
	 */
	@Override
	public DashboardWidget[] findByUuid_C_PrevAndNext(
			long dashboardWidgetId, String uuid, long companyId,
			OrderByComparator<DashboardWidget> orderByComparator)
		throws NoSuchDashboardWidgetException {

		uuid = Objects.toString(uuid, "");

		DashboardWidget dashboardWidget = findByPrimaryKey(dashboardWidgetId);

		Session session = null;

		try {
			session = openSession();

			DashboardWidget[] array = new DashboardWidgetImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, dashboardWidget, uuid, companyId, orderByComparator,
				true);

			array[1] = dashboardWidget;

			array[2] = getByUuid_C_PrevAndNext(
				session, dashboardWidget, uuid, companyId, orderByComparator,
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

	protected DashboardWidget getByUuid_C_PrevAndNext(
		Session session, DashboardWidget dashboardWidget, String uuid,
		long companyId, OrderByComparator<DashboardWidget> orderByComparator,
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

		sb.append(_SQL_SELECT_DASHBOARDWIDGET_WHERE);

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
			sb.append(DashboardWidgetModelImpl.ORDER_BY_JPQL);
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
						dashboardWidget)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DashboardWidget> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dashboard widgets where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (DashboardWidget dashboardWidget :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(dashboardWidget);
		}
	}

	/**
	 * Returns the number of dashboard widgets where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dashboard widgets
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_DASHBOARDWIDGET_WHERE);

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
		"dashboardWidget.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(dashboardWidget.uuid IS NULL OR dashboardWidget.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"dashboardWidget.companyId = ?";

	private FinderPath _finderPathFetchByportletName;
	private FinderPath _finderPathCountByportletName;

	/**
	 * Returns the dashboard widget where portletName = &#63; or throws a <code>NoSuchDashboardWidgetException</code> if it could not be found.
	 *
	 * @param portletName the portlet name
	 * @return the matching dashboard widget
	 * @throws NoSuchDashboardWidgetException if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget findByportletName(String portletName)
		throws NoSuchDashboardWidgetException {

		DashboardWidget dashboardWidget = fetchByportletName(portletName);

		if (dashboardWidget == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("portletName=");
			sb.append(portletName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDashboardWidgetException(sb.toString());
		}

		return dashboardWidget;
	}

	/**
	 * Returns the dashboard widget where portletName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param portletName the portlet name
	 * @return the matching dashboard widget, or <code>null</code> if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget fetchByportletName(String portletName) {
		return fetchByportletName(portletName, true);
	}

	/**
	 * Returns the dashboard widget where portletName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param portletName the portlet name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dashboard widget, or <code>null</code> if a matching dashboard widget could not be found
	 */
	@Override
	public DashboardWidget fetchByportletName(
		String portletName, boolean useFinderCache) {

		portletName = Objects.toString(portletName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {portletName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByportletName, finderArgs);
		}

		if (result instanceof DashboardWidget) {
			DashboardWidget dashboardWidget = (DashboardWidget)result;

			if (!Objects.equals(
					portletName, dashboardWidget.getPortletName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_DASHBOARDWIDGET_WHERE);

			boolean bindPortletName = false;

			if (portletName.isEmpty()) {
				sb.append(_FINDER_COLUMN_PORTLETNAME_PORTLETNAME_3);
			}
			else {
				bindPortletName = true;

				sb.append(_FINDER_COLUMN_PORTLETNAME_PORTLETNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPortletName) {
					queryPos.add(portletName);
				}

				List<DashboardWidget> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByportletName, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {portletName};
							}

							_log.warn(
								"DashboardWidgetPersistenceImpl.fetchByportletName(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DashboardWidget dashboardWidget = list.get(0);

					result = dashboardWidget;

					cacheResult(dashboardWidget);
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
			return (DashboardWidget)result;
		}
	}

	/**
	 * Removes the dashboard widget where portletName = &#63; from the database.
	 *
	 * @param portletName the portlet name
	 * @return the dashboard widget that was removed
	 */
	@Override
	public DashboardWidget removeByportletName(String portletName)
		throws NoSuchDashboardWidgetException {

		DashboardWidget dashboardWidget = findByportletName(portletName);

		return remove(dashboardWidget);
	}

	/**
	 * Returns the number of dashboard widgets where portletName = &#63;.
	 *
	 * @param portletName the portlet name
	 * @return the number of matching dashboard widgets
	 */
	@Override
	public int countByportletName(String portletName) {
		portletName = Objects.toString(portletName, "");

		FinderPath finderPath = _finderPathCountByportletName;

		Object[] finderArgs = new Object[] {portletName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DASHBOARDWIDGET_WHERE);

			boolean bindPortletName = false;

			if (portletName.isEmpty()) {
				sb.append(_FINDER_COLUMN_PORTLETNAME_PORTLETNAME_3);
			}
			else {
				bindPortletName = true;

				sb.append(_FINDER_COLUMN_PORTLETNAME_PORTLETNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPortletName) {
					queryPos.add(portletName);
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

	private static final String _FINDER_COLUMN_PORTLETNAME_PORTLETNAME_2 =
		"dashboardWidget.portletName = ?";

	private static final String _FINDER_COLUMN_PORTLETNAME_PORTLETNAME_3 =
		"(dashboardWidget.portletName IS NULL OR dashboardWidget.portletName = '')";

	public DashboardWidgetPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(DashboardWidget.class);

		setModelImplClass(DashboardWidgetImpl.class);
		setModelPKClass(long.class);

		setTable(DashboardWidgetTable.INSTANCE);
	}

	/**
	 * Caches the dashboard widget in the entity cache if it is enabled.
	 *
	 * @param dashboardWidget the dashboard widget
	 */
	@Override
	public void cacheResult(DashboardWidget dashboardWidget) {
		entityCache.putResult(
			DashboardWidgetImpl.class, dashboardWidget.getPrimaryKey(),
			dashboardWidget);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				dashboardWidget.getUuid(), dashboardWidget.getGroupId()
			},
			dashboardWidget);

		finderCache.putResult(
			_finderPathFetchByportletName,
			new Object[] {dashboardWidget.getPortletName()}, dashboardWidget);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the dashboard widgets in the entity cache if it is enabled.
	 *
	 * @param dashboardWidgets the dashboard widgets
	 */
	@Override
	public void cacheResult(List<DashboardWidget> dashboardWidgets) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (dashboardWidgets.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DashboardWidget dashboardWidget : dashboardWidgets) {
			if (entityCache.getResult(
					DashboardWidgetImpl.class,
					dashboardWidget.getPrimaryKey()) == null) {

				cacheResult(dashboardWidget);
			}
		}
	}

	/**
	 * Clears the cache for all dashboard widgets.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DashboardWidgetImpl.class);

		finderCache.clearCache(DashboardWidgetImpl.class);
	}

	/**
	 * Clears the cache for the dashboard widget.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DashboardWidget dashboardWidget) {
		entityCache.removeResult(DashboardWidgetImpl.class, dashboardWidget);
	}

	@Override
	public void clearCache(List<DashboardWidget> dashboardWidgets) {
		for (DashboardWidget dashboardWidget : dashboardWidgets) {
			entityCache.removeResult(
				DashboardWidgetImpl.class, dashboardWidget);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DashboardWidgetImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DashboardWidgetImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DashboardWidgetModelImpl dashboardWidgetModelImpl) {

		Object[] args = new Object[] {
			dashboardWidgetModelImpl.getUuid(),
			dashboardWidgetModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, dashboardWidgetModelImpl);

		args = new Object[] {dashboardWidgetModelImpl.getPortletName()};

		finderCache.putResult(
			_finderPathCountByportletName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByportletName, args, dashboardWidgetModelImpl);
	}

	/**
	 * Creates a new dashboard widget with the primary key. Does not add the dashboard widget to the database.
	 *
	 * @param dashboardWidgetId the primary key for the new dashboard widget
	 * @return the new dashboard widget
	 */
	@Override
	public DashboardWidget create(long dashboardWidgetId) {
		DashboardWidget dashboardWidget = new DashboardWidgetImpl();

		dashboardWidget.setNew(true);
		dashboardWidget.setPrimaryKey(dashboardWidgetId);

		String uuid = PortalUUIDUtil.generate();

		dashboardWidget.setUuid(uuid);

		dashboardWidget.setCompanyId(CompanyThreadLocal.getCompanyId());

		return dashboardWidget;
	}

	/**
	 * Removes the dashboard widget with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dashboardWidgetId the primary key of the dashboard widget
	 * @return the dashboard widget that was removed
	 * @throws NoSuchDashboardWidgetException if a dashboard widget with the primary key could not be found
	 */
	@Override
	public DashboardWidget remove(long dashboardWidgetId)
		throws NoSuchDashboardWidgetException {

		return remove((Serializable)dashboardWidgetId);
	}

	/**
	 * Removes the dashboard widget with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dashboard widget
	 * @return the dashboard widget that was removed
	 * @throws NoSuchDashboardWidgetException if a dashboard widget with the primary key could not be found
	 */
	@Override
	public DashboardWidget remove(Serializable primaryKey)
		throws NoSuchDashboardWidgetException {

		Session session = null;

		try {
			session = openSession();

			DashboardWidget dashboardWidget = (DashboardWidget)session.get(
				DashboardWidgetImpl.class, primaryKey);

			if (dashboardWidget == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDashboardWidgetException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(dashboardWidget);
		}
		catch (NoSuchDashboardWidgetException noSuchEntityException) {
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
	protected DashboardWidget removeImpl(DashboardWidget dashboardWidget) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dashboardWidget)) {
				dashboardWidget = (DashboardWidget)session.get(
					DashboardWidgetImpl.class,
					dashboardWidget.getPrimaryKeyObj());
			}

			if (dashboardWidget != null) {
				session.delete(dashboardWidget);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (dashboardWidget != null) {
			clearCache(dashboardWidget);
		}

		return dashboardWidget;
	}

	@Override
	public DashboardWidget updateImpl(DashboardWidget dashboardWidget) {
		boolean isNew = dashboardWidget.isNew();

		if (!(dashboardWidget instanceof DashboardWidgetModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dashboardWidget.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					dashboardWidget);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dashboardWidget proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DashboardWidget implementation " +
					dashboardWidget.getClass());
		}

		DashboardWidgetModelImpl dashboardWidgetModelImpl =
			(DashboardWidgetModelImpl)dashboardWidget;

		if (Validator.isNull(dashboardWidget.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			dashboardWidget.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (dashboardWidget.getCreateDate() == null)) {
			if (serviceContext == null) {
				dashboardWidget.setCreateDate(date);
			}
			else {
				dashboardWidget.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!dashboardWidgetModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				dashboardWidget.setModifiedDate(date);
			}
			else {
				dashboardWidget.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(dashboardWidget);
			}
			else {
				dashboardWidget = (DashboardWidget)session.merge(
					dashboardWidget);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DashboardWidgetImpl.class, dashboardWidgetModelImpl, false, true);

		cacheUniqueFindersCache(dashboardWidgetModelImpl);

		if (isNew) {
			dashboardWidget.setNew(false);
		}

		dashboardWidget.resetOriginalValues();

		return dashboardWidget;
	}

	/**
	 * Returns the dashboard widget with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dashboard widget
	 * @return the dashboard widget
	 * @throws NoSuchDashboardWidgetException if a dashboard widget with the primary key could not be found
	 */
	@Override
	public DashboardWidget findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDashboardWidgetException {

		DashboardWidget dashboardWidget = fetchByPrimaryKey(primaryKey);

		if (dashboardWidget == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDashboardWidgetException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return dashboardWidget;
	}

	/**
	 * Returns the dashboard widget with the primary key or throws a <code>NoSuchDashboardWidgetException</code> if it could not be found.
	 *
	 * @param dashboardWidgetId the primary key of the dashboard widget
	 * @return the dashboard widget
	 * @throws NoSuchDashboardWidgetException if a dashboard widget with the primary key could not be found
	 */
	@Override
	public DashboardWidget findByPrimaryKey(long dashboardWidgetId)
		throws NoSuchDashboardWidgetException {

		return findByPrimaryKey((Serializable)dashboardWidgetId);
	}

	/**
	 * Returns the dashboard widget with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dashboardWidgetId the primary key of the dashboard widget
	 * @return the dashboard widget, or <code>null</code> if a dashboard widget with the primary key could not be found
	 */
	@Override
	public DashboardWidget fetchByPrimaryKey(long dashboardWidgetId) {
		return fetchByPrimaryKey((Serializable)dashboardWidgetId);
	}

	/**
	 * Returns all the dashboard widgets.
	 *
	 * @return the dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard widgets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardWidgetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @return the range of dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard widgets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardWidgetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findAll(
		int start, int end,
		OrderByComparator<DashboardWidget> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard widgets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardWidgetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard widgets
	 * @param end the upper bound of the range of dashboard widgets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard widgets
	 */
	@Override
	public List<DashboardWidget> findAll(
		int start, int end,
		OrderByComparator<DashboardWidget> orderByComparator,
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

		List<DashboardWidget> list = null;

		if (useFinderCache) {
			list = (List<DashboardWidget>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DASHBOARDWIDGET);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DASHBOARDWIDGET;

				sql = sql.concat(DashboardWidgetModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DashboardWidget>)QueryUtil.list(
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
	 * Removes all the dashboard widgets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DashboardWidget dashboardWidget : findAll()) {
			remove(dashboardWidget);
		}
	}

	/**
	 * Returns the number of dashboard widgets.
	 *
	 * @return the number of dashboard widgets
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DASHBOARDWIDGET);

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
		return "dashboardWidgetId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DASHBOARDWIDGET;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DashboardWidgetModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dashboard widget persistence.
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

		_finderPathFetchByportletName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByportletName",
			new String[] {String.class.getName()}, new String[] {"portletName"},
			true);

		_finderPathCountByportletName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByportletName",
			new String[] {String.class.getName()}, new String[] {"portletName"},
			false);

		_setDashboardWidgetUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setDashboardWidgetUtilPersistence(null);

		entityCache.removeCache(DashboardWidgetImpl.class.getName());
	}

	private void _setDashboardWidgetUtilPersistence(
		DashboardWidgetPersistence dashboardWidgetPersistence) {

		try {
			Field field = DashboardWidgetUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, dashboardWidgetPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = adjectiPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = adjectiPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = adjectiPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DASHBOARDWIDGET =
		"SELECT dashboardWidget FROM DashboardWidget dashboardWidget";

	private static final String _SQL_SELECT_DASHBOARDWIDGET_WHERE =
		"SELECT dashboardWidget FROM DashboardWidget dashboardWidget WHERE ";

	private static final String _SQL_COUNT_DASHBOARDWIDGET =
		"SELECT COUNT(dashboardWidget) FROM DashboardWidget dashboardWidget";

	private static final String _SQL_COUNT_DASHBOARDWIDGET_WHERE =
		"SELECT COUNT(dashboardWidget) FROM DashboardWidget dashboardWidget WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "dashboardWidget.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DashboardWidget exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DashboardWidget exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DashboardWidgetPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private DashboardWidgetModelArgumentsResolver
		_dashboardWidgetModelArgumentsResolver;

}