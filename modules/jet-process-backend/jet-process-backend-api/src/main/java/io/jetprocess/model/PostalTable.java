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
 * The table class for the &quot;JP_Postal&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Postal
 * @generated
 */
public class PostalTable extends BaseTable<PostalTable> {

	public static final PostalTable INSTANCE = new PostalTable();

	public final Column<PostalTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PostalTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PostalTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PostalTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PostalTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PostalTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PostalTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PostalTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PostalTable, String> postalMode = createColumn(
		"postalMode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PostalTable, String> postalCharge = createColumn(
		"postalCharge", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PostalTable, String> medium = createColumn(
		"medium", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PostalTable, String> weight = createColumn(
		"weight", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PostalTable, Long> modeNo = createColumn(
		"modeNo", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PostalTable, String> peonBookNo = createColumn(
		"peonBookNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PostalTable, String> peonName = createColumn(
		"peonName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PostalTable, Date> outDate = createColumn(
		"outDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PostalTable, Date> deliveryDate = createColumn(
		"deliveryDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PostalTable, String> deliveryStatus = createColumn(
		"deliveryStatus", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private PostalTable() {
		super("JP_Postal", PostalTable::new);
	}

}