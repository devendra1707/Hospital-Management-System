create table hms_Enquiry (
	uuid_ VARCHAR(75) null,
	enquiryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	mobileNo VARCHAR(75) null,
	concern VARCHAR(75) null
);