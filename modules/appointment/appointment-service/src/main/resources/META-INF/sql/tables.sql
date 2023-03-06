create table hms_Appointment (
	uuid_ VARCHAR(75) null,
	appointmentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	mobile VARCHAR(75) null,
	email VARCHAR(75) null,
	country VARCHAR(75) null,
	age VARCHAR(75) null,
	speciality VARCHAR(75) null
);