create index IX_A82DDD37 on HMS_Internation (name[$COLUMN_LENGTH:75$]);
create index IX_778D9B6C on HMS_Internation (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_505E0CEE on HMS_Internation (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_50BBC9E2 on HMS_International (name[$COLUMN_LENGTH:75$]);
create index IX_D01EDF97 on HMS_International (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B6385FD9 on HMS_International (uuid_[$COLUMN_LENGTH:75$], groupId);