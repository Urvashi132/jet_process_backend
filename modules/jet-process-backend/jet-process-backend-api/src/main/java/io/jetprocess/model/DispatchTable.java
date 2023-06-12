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
 * The table class for the &quot;JP_Dispatch&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Dispatch
 * @generated
 */
public class DispatchTable extends BaseTable<DispatchTable> {

	public static final DispatchTable INSTANCE = new DispatchTable();

	public final Column<DispatchTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DispatchTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, String> dispatchNo = createColumn(
		"dispatchNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, String> dispatchBy = createColumn(
		"dispatchBy", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, String> deliveryMode = createColumn(
		"deliveryMode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, String> subject = createColumn(
		"subject", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, String> dispathOn = createColumn(
		"dispathOn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, String> dispatchType = createColumn(
		"dispatchType", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, String> issueNo = createColumn(
		"issueNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, Long> receiptentId = createColumn(
		"receiptentId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DispatchTable, Long> draftId = createColumn(
		"draftId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DispatchTable() {
		super("JP_Dispatch", DispatchTable::new);
	}

}