create table hms_SecondOpinion (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	email VARCHAR(75) null,
	mobile VARCHAR(75) null,
	specialty VARCHAR(75) null,
	remark VARCHAR(2036) null
);