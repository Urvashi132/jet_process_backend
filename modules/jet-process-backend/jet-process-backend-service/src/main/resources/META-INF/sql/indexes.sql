create index IX_9C0082D on JP_Dispatch (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6E16B5EF on JP_Dispatch (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BED3E975 on JP_DocFile (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DFC24937 on JP_DocFile (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_356DE002 on JP_DocumentNoteMapping (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_89927F04 on JP_DocumentNoteMapping (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7B75582 on JP_Draft (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2BB5484 on JP_Draft (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BB730F75 on JP_DraftRecipient (draftId);
create index IX_E68AB76B on JP_DraftRecipient (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_87A01CAD on JP_DraftRecipient (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_68166EF5 on JP_FileMovement (fileId);
create index IX_5E54EAFE on JP_FileMovement (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_15781900 on JP_FileMovement (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_25992C25 on JP_Note (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D35877E7 on JP_Note (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_CB3B5AE0 on JP_NoteDocument (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_779D1962 on JP_NoteDocument (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6C1A6997 on JP_NoteDocumentMovement (noteDocumentId);
create index IX_A0423C2F on JP_NoteDocumentMovement (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3A0271 on JP_NoteDocumentMovement (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_8A22383E on JP_Postal (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_92B7B640 on JP_Postal (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_EAFA084A on JP_PrimaryHead (basicHeadId);

create index IX_2A032ED9 on JP_Receipt (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_380B979B on JP_Receipt (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_571E11AF on JP_ReceiptMovement (receiptId);
create index IX_E6170728 on JP_ReceiptMovement (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_248737AA on JP_ReceiptMovement (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BC0E2BEC on JP_SecondaryHead (primaryHeadId);

create index IX_6BB88E6E on JP_TertiaryHead (secondaryHeadId);