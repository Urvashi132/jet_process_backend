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

import java.sql.Clob;
import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;JP_Draft&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Draft
 * @generated
 */
public class DraftTable extends BaseTable<DraftTable> {

	public static final DraftTable INSTANCE = new DraftTable();

	public final Column<DraftTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DraftTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DraftTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DraftTable, String> nature = createColumn(
		"nature", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftTable, Long> receiptId = createColumn(
		"receiptId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftTable, Long> replyTypeId = createColumn(
		"replyTypeId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftTable, Long> categoryId = createColumn(
		"categoryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftTable, String> subject = createColumn(
		"subject", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftTable, Clob> content = createColumn(
		"content", Clob.class, Types.CLOB, Column.FLAG_DEFAULT);
	public final Column<DraftTable, Boolean> dispatch = createColumn(
		"dispatch", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<DraftTable, String> status = createColumn(
		"status", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftTable, String> approvedBy = createColumn(
		"approvedBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private DraftTable() {
		super("JP_Draft", DraftTable::new);
	}

}