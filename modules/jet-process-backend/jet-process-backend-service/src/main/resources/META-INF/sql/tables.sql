create table JP_BasicHead (
	basicHeadId LONG not null primary key,
	basicHeadValue VARCHAR(75) null,
	basicHeadCode LONG
);

create table JP_Category (
	id_ LONG not null primary key,
	name VARCHAR(75) null
);

create table JP_DeliveryMode (
	id_ LONG not null primary key,
	name VARCHAR(75) null
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

create table JP_Organization (
	id_ LONG not null primary key,
	name VARCHAR(75) null
);

create table JP_PrimaryHead (
	primaryHeadId LONG not null primary key,
	primaryHeadValue VARCHAR(75) null,
	basicHeadId LONG
);

create table JP_Receipt (
	uuid_ VARCHAR(75) null,
	receiptId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	typeId LONG,
	deliveryModeId LONG,
	receivedOn VARCHAR(75) null,
	letterDate VARCHAR(75) null,
	referenceNo VARCHAR(75) null,
	modeNo VARCHAR(75) null,
	CategoryId LONG,
	subject VARCHAR(75) null,
	remarks VARCHAR(75) null,
	name VARCHAR(75) null,
	designation VARCHAR(75) null,
	mobile VARCHAR(75) null,
	email VARCHAR(75) null,
	address VARCHAR(75) null,
	stateId LONG,
	pinCode VARCHAR(75) null,
	receiptNo VARCHAR(75) null,
	organizationId LONG,
	city VARCHAR(75) null,
	userPostId LONG,
	viewPdfUrl VARCHAR(75) null,
	docFileId LONG,
	nature VARCHAR(75) null,
	currentlyWith LONG,
	currentState LONG,
	attachStatus VARCHAR(75) null
);

create table JP_SecondaryHead (
	secondaryHeadId LONG not null primary key,
	secondaryHeadValue VARCHAR(75) null,
	primaryHeadId LONG
);

create table JP_State (
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	countryId LONG
);

create table JP_TertiaryHead (
	tertiaryHeadId LONG not null primary key,
	tertiaryHeadvalue VARCHAR(75) null,
	secondaryHeadId LONG
);

create table JP_Type (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	name VARCHAR(75) null
);