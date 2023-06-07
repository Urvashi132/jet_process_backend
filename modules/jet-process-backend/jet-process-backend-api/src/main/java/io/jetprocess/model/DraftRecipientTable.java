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
 * The table class for the &quot;JP_DraftRecipient&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see DraftRecipient
 * @generated
 */
public class DraftRecipientTable extends BaseTable<DraftRecipientTable> {

	public static final DraftRecipientTable INSTANCE =
		new DraftRecipientTable();

	public final Column<DraftRecipientTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DraftRecipientTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, Long> draftId = createColumn(
		"draftId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, Long> organizationId =
		createColumn(
			"organizationId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, String> designation = createColumn(
		"designation", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, String> mobile = createColumn(
		"mobile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, Long> stateId = createColumn(
		"stateId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, String> cityId = createColumn(
		"cityId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DraftRecipientTable, String> pinCode = createColumn(
		"pinCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private DraftRecipientTable() {
		super("JP_DraftRecipient", DraftRecipientTable::new);
	}

}