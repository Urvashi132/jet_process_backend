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

package com.adjecti.dashboard.widget.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;adjecti_DashboardWidget&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DashboardWidget
 * @generated
 */
public class DashboardWidgetTable extends BaseTable<DashboardWidgetTable> {

	public static final DashboardWidgetTable INSTANCE =
		new DashboardWidgetTable();

	public final Column<DashboardWidgetTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardWidgetTable, Long> dashboardWidgetId =
		createColumn(
			"dashboardWidgetId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DashboardWidgetTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DashboardWidgetTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DashboardWidgetTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DashboardWidgetTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardWidgetTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DashboardWidgetTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DashboardWidgetTable, String> portletName =
		createColumn(
			"portletName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardWidgetTable, String> thumbnail = createColumn(
		"thumbnail", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardWidgetTable, Boolean> added = createColumn(
		"added", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);

	private DashboardWidgetTable() {
		super("adjecti_DashboardWidget", DashboardWidgetTable::new);
	}

}