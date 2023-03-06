create index IX_4DCF46DB on hms_Appointment (age[$COLUMN_LENGTH:75$]);
create index IX_E3D796B2 on hms_Appointment (country[$COLUMN_LENGTH:75$]);
create index IX_F4D473B8 on hms_Appointment (email[$COLUMN_LENGTH:75$]);
create index IX_3ACE1216 on hms_Appointment (groupId);
create index IX_9D569442 on hms_Appointment (name[$COLUMN_LENGTH:75$], email[$COLUMN_LENGTH:75$], country[$COLUMN_LENGTH:75$], age[$COLUMN_LENGTH:75$]);
create index IX_528E3E08 on hms_Appointment (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_591EA68A on hms_Appointment (uuid_[$COLUMN_LENGTH:75$], groupId);