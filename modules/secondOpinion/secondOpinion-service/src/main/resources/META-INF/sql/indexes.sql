create index IX_A4FAFBE2 on hms_SecondOpinion (name[$COLUMN_LENGTH:75$]);
create index IX_55231197 on hms_SecondOpinion (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B2A111D9 on hms_SecondOpinion (uuid_[$COLUMN_LENGTH:75$], groupId);