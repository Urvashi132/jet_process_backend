create index IX_C8A1770F on JP_BasicHead (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_12EA7551 on JP_BasicHead (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CF3C16B1 on JP_Category (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_398C9573 on JP_Category (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BED3E975 on JP_DocFile (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DFC24937 on JP_DocFile (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_EAFA084A on JP_PrimaryHead (basicHeadId);
create index IX_FA106723 on JP_PrimaryHead (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A9BE5A65 on JP_PrimaryHead (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BC0E2BEC on JP_SecondaryHead (primaryHeadId);
create index IX_48CD76D5 on JP_SecondaryHead (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_637FAE97 on JP_SecondaryHead (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6BB88E6E on JP_TertiaryHead (secondaryHeadId);
create index IX_634AD485 on JP_TertiaryHead (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4018B847 on JP_TertiaryHead (uuid_[$COLUMN_LENGTH:75$], groupId);