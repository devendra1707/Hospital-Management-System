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

package com.liferay.hms.enquiry.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;hms_Enquiry&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Enquiry
 * @generated
 */
public class EnquiryTable extends BaseTable<EnquiryTable> {

	public static final EnquiryTable INSTANCE = new EnquiryTable();

	public final Column<EnquiryTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnquiryTable, Long> enquiryId = createColumn(
		"enquiryId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<EnquiryTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EnquiryTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EnquiryTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<EnquiryTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnquiryTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EnquiryTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<EnquiryTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnquiryTable, String> mobileNo = createColumn(
		"mobileNo", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EnquiryTable, String> concern = createColumn(
		"concern", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private EnquiryTable() {
		super("hms_Enquiry", EnquiryTable::new);
	}

}