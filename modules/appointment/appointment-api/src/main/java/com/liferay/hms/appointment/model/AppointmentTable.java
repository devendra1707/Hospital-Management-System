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

package com.liferay.hms.appointment.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;hms_Appointment&quot; database table.
 *
 * @author devendra
 * @see Appointment
 * @generated
 */
public class AppointmentTable extends BaseTable<AppointmentTable> {

	public static final AppointmentTable INSTANCE = new AppointmentTable();

	public final Column<AppointmentTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, Long> appointmentId = createColumn(
		"appointmentId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<AppointmentTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, String> mobile = createColumn(
		"mobile", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, String> country = createColumn(
		"country", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, String> age = createColumn(
		"age", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<AppointmentTable, String> speciality = createColumn(
		"speciality", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private AppointmentTable() {
		super("hms_Appointment", AppointmentTable::new);
	}

}