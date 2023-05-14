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
 * The table class for the &quot;JP_DocumentNoteMapping&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DocumentNoteMapping
 * @generated
 */
public class DocumentNoteMappingTable
	extends BaseTable<DocumentNoteMappingTable> {

	public static final DocumentNoteMappingTable INSTANCE =
		new DocumentNoteMappingTable();

	public final Column<DocumentNoteMappingTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocumentNoteMappingTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DocumentNoteMappingTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocumentNoteMappingTable, Long> companyId =
		createColumn(
			"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocumentNoteMappingTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocumentNoteMappingTable, String> userName =
		createColumn(
			"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DocumentNoteMappingTable, Date> createDate =
		createColumn(
			"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DocumentNoteMappingTable, Date> modifiedDate =
		createColumn(
			"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DocumentNoteMappingTable, Long> noteDocumentId =
		createColumn(
			"noteDocumentId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DocumentNoteMappingTable, Long> noteId = createColumn(
		"noteId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private DocumentNoteMappingTable() {
		super("JP_DocumentNoteMapping", DocumentNoteMappingTable::new);
	}

}