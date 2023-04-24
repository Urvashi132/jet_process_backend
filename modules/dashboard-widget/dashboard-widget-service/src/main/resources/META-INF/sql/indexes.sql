create index IX_EFBC73DC on adjecti_DashboardWidget (portletName[$COLUMN_LENGTH:75$]);
create index IX_49647D0D on adjecti_DashboardWidget (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3C12E2CF on adjecti_DashboardWidget (uuid_[$COLUMN_LENGTH:75$], groupId);