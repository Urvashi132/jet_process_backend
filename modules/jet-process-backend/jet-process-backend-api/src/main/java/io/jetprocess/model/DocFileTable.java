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
 * The table class for the &quot;JP_DocFile&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DocFile
 * @generated
 */
public class DocFileTable extends BaseTable<DocFileTable> {

	public static final DocFileTable INSTANCE = new DocFileTable();

	public final Column<DocFileTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DocFileTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, String> nature = createColumn(
		"nature", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, String> type = createColumn(
		"type_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Long> headId = createColumn(
		"headId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Long> fileCodeId = createColumn(
		"fileCodeId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, String> subject = createColumn(
		"subject", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, String> fileNo = createColumn(
		"fileNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Long> categoryId = createColumn(
		"categoryId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, String> remarks = createColumn(
		"remarks", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, String> reference = createColumn(
		"reference", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Long> year = createColumn(
		"year", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Long> userPostId = createColumn(
		"userPostId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Long> currentUser = createColumn(
		"currentUser", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Integer> currentState = createColumn(
		"currentState", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DocFileTable, Long> dealingOrganizationId =
		createColumn(
			"dealingOrganizationId", Long.class, Types.BIGINT,
			Column.FLAG_DEFAULT);

	private DocFileTable() {
		super("JP_DocFile", DocFileTable::new);
	}

}