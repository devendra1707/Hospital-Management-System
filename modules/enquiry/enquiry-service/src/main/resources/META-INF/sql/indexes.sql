create index IX_88500AEF on hms_Enquiry (mobileNo[$COLUMN_LENGTH:75$]);
create index IX_3273D677 on hms_Enquiry (name[$COLUMN_LENGTH:75$]);
create index IX_D467B4AC on hms_Enquiry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_336D762E on hms_Enquiry (uuid_[$COLUMN_LENGTH:75$], groupId);