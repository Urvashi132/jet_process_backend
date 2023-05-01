create index IX_64B02917 on JP_Category (uuid_[$COLUMN_LENGTH:75$]);

create index IX_617A4AFE on JP_DeliveryMode (uuid_[$COLUMN_LENGTH:75$]);

create index IX_BED3E975 on JP_DocFile (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DFC24937 on JP_DocFile (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_4D9F7902 on JP_Organization (uuid_[$COLUMN_LENGTH:75$]);

create index IX_EAFA084A on JP_PrimaryHead (basicHeadId);

create index IX_2A032ED9 on JP_Receipt (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_380B979B on JP_Receipt (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BC0E2BEC on JP_SecondaryHead (primaryHeadId);

create index IX_F6E105F6 on JP_State (uuid_[$COLUMN_LENGTH:75$]);

create index IX_6BB88E6E on JP_TertiaryHead (secondaryHeadId);

create index IX_4399C5DB on JP_Type (uuid_[$COLUMN_LENGTH:75$]);