create table JP_BasicHead (
	uuid_ VARCHAR(75) null,
	basicHeadId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	basicHeadValue VARCHAR(75) null,
	basicHeadCode LONG
);

create table JP_Category (
	uuid_ VARCHAR(75) null,
	categoryId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	categoryValue VARCHAR(75) null
);

create table JP_DocFile (
	uuid_ VARCHAR(75) null,
	docFileId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nature VARCHAR(75) null,
	type_ VARCHAR(75) null,
	headId LONG,
	fileCodeId LONG,
	subject VARCHAR(75) null,
	fileNo VARCHAR(75) null,
	categoryId LONG,
	remarks VARCHAR(75) null,
	reference VARCHAR(75) null,
	year LONG,
	userPostId LONG,
	currentUser LONG,
	currentState INTEGER,
	dealingOrganizationId LONG
);

create table JP_PrimaryHead (
	uuid_ VARCHAR(75) null,
	primaryHeadId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	primaryHeadValue VARCHAR(75) null,
	basicHeadId LONG
);

create table JP_SecondaryHead (
	uuid_ VARCHAR(75) null,
	secondaryHeadId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	secondaryHeadValue VARCHAR(75) null,
	primaryHeadId LONG
);

create table JP_TertiaryHead (
	uuid_ VARCHAR(75) null,
	tertiaryHeadId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tertiaryHeadvalue VARCHAR(75) null,
	secondaryHeadId LONG
);