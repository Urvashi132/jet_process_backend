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

package io.jetprocess.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;JP_SecondaryHead&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see SecondaryHead
 * @generated
 */
public class SecondaryHeadTable extends BaseTable<SecondaryHeadTable> {

	public static final SecondaryHeadTable INSTANCE = new SecondaryHeadTable();

	public final Column<SecondaryHeadTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SecondaryHeadTable, Long> secondaryHeadId =
		createColumn(
			"secondaryHeadId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SecondaryHeadTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SecondaryHeadTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SecondaryHeadTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<SecondaryHeadTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SecondaryHeadTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SecondaryHeadTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<SecondaryHeadTable, String> secondaryHeadValue =
		createColumn(
			"secondaryHeadValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<SecondaryHeadTable, Long> primaryHeadId = createColumn(
		"primaryHeadId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private SecondaryHeadTable() {
		super("JP_SecondaryHead", SecondaryHeadTable::new);
	}

}