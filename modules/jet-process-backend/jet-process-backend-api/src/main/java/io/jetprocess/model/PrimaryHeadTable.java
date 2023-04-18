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
 * The table class for the &quot;JP_PrimaryHead&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see PrimaryHead
 * @generated
 */
public class PrimaryHeadTable extends BaseTable<PrimaryHeadTable> {

	public static final PrimaryHeadTable INSTANCE = new PrimaryHeadTable();

	public final Column<PrimaryHeadTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PrimaryHeadTable, Long> primaryHeadId = createColumn(
		"primaryHeadId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PrimaryHeadTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PrimaryHeadTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PrimaryHeadTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PrimaryHeadTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PrimaryHeadTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PrimaryHeadTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PrimaryHeadTable, String> primaryHeadValue =
		createColumn(
			"primaryHeadValue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<PrimaryHeadTable, Long> basicHeadId = createColumn(
		"basicHeadId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private PrimaryHeadTable() {
		super("JP_PrimaryHead", PrimaryHeadTable::new);
	}

}