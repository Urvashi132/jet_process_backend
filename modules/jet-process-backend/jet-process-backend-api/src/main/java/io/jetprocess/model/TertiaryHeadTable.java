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

/**
 * The table class for the &quot;JP_TertiaryHead&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see TertiaryHead
 * @generated
 */
public class TertiaryHeadTable extends BaseTable<TertiaryHeadTable> {

	public static final TertiaryHeadTable INSTANCE = new TertiaryHeadTable();

	public final Column<TertiaryHeadTable, Long> tertiaryHeadId = createColumn(
		"tertiaryHeadId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<TertiaryHeadTable, String> tertiaryHeadvalue =
		createColumn(
			"tertiaryHeadvalue", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<TertiaryHeadTable, Long> secondaryHeadId = createColumn(
		"secondaryHeadId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private TertiaryHeadTable() {
		super("JP_TertiaryHead", TertiaryHeadTable::new);
	}

}