create table JP_BasicHead (
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	code_ LONG
);

create table JP_Category (
	id_ LONG not null primary key,
	name VARCHAR(255) null
);

create table JP_DeliveryMode (
	id_ LONG not null primary key,
	name VARCHAR(75) null
);

create table JP_DocFile (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
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
	subject VARCHAR(500) null,
	fileNo VARCHAR(75) null,
	categoryId LONG,
	remarks VARCHAR(500) null,
	reference VARCHAR(75) null,
	year LONG,
	userPostId LONG,
	currentUser LONG,
	currentState INTEGER,
	dealingOrganizationId LONG
);

create table JP_DocumentNoteMapping (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	noteDocumentId LONG,
	noteId LONG
);

create table JP_FileCategory (
	id_ LONG not null primary key,
	name VARCHAR(255) null
);

create table JP_FileMovement (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	receiverId LONG,
	senderId LONG,
	fileId LONG,
	priority VARCHAR(75) null,
	dueDate DATE null,
	remarks VARCHAR(500) null,
	active_ BOOLEAN,
	movementType LONG
);

create table JP_Note (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	content TEXT null,
	createdBy LONG,
	signature VARCHAR(500) null
);

create table JP_NoteDocument (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	noteDocumentNumber VARCHAR(75) null,
	subject VARCHAR(500) null,
	createdBy LONG,
	subjectCategoryId LONG,
	currentUser LONG,
	currentState INTEGER
);

create table JP_NoteDocumentMovement (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	receiverId LONG,
	senderId LONG,
	noteDocumentId LONG,
	remarks VARCHAR(500) null,
	active_ BOOLEAN,
	movementType LONG
);

create table JP_Organization (
	id_ LONG not null primary key,
	name VARCHAR(75) null
);

create table JP_PrimaryHead (
	id_ LONG not null primary key,
	name VARCHAR(255) null,
	basicHeadId LONG
);

create table JP_Receipt (
	uuid_ VARCHAR(75) null,
	Id LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	type_ VARCHAR(75) null,
	deliveryModeId LONG,
	receivedOn VARCHAR(75) null,
	letterDate VARCHAR(75) null,
	referenceNo VARCHAR(75) null,
	modeNo VARCHAR(75) null,
	CategoryId LONG,
	subject VARCHAR(500) null,
	remarks VARCHAR(500) null,
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

create table JP_ReceiptMovement (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	receiverId LONG,
	senderId LONG,
	receiptId LONG,
	priority VARCHAR(75) null,
	dueDate DATE null,
	remarks VARCHAR(500) null,
	active_ BOOLEAN,
	movementType LONG
);

create table JP_SecondaryHead (
	id_ LONG not null primary key,
	name VARCHAR(255) null,
	primaryHeadId LONG
);

create table JP_State (
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	countryId LONG
);

create table JP_SubjectCategory (
	id_ LONG not null primary key,
	name VARCHAR(255) null
);

create table JP_TertiaryHead (
	id_ LONG not null primary key,
	name VARCHAR(255) null,
	secondaryHeadId LONG
);

create table JP_Type (
	id_ LONG not null primary key,
	name VARCHAR(75) null
);