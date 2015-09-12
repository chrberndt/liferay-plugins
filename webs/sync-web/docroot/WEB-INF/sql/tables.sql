create table SyncDLFileVersionDiff (
	syncDLFileVersionDiffId LONG not null primary key,
	fileEntryId LONG,
	sourceFileVersionId LONG,
	targetFileVersionId LONG,
	dataFileEntryId LONG,
	size_ LONG,
	expirationDate DATE null
);

create table SyncDLObject (
	syncDLObjectId LONG not null primary key,
	companyId LONG,
<<<<<<< HEAD
=======
	userId LONG,
	userName VARCHAR(75) null,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	createTime LONG,
	modifiedTime LONG,
	repositoryId LONG,
	parentFolderId LONG,
<<<<<<< HEAD
=======
	treePath STRING null,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	name VARCHAR(255) null,
	extension VARCHAR(75) null,
	mimeType VARCHAR(75) null,
	description STRING null,
	changeLog VARCHAR(75) null,
	extraSettings TEXT null,
	version VARCHAR(75) null,
<<<<<<< HEAD
=======
	versionId LONG,
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
	size_ LONG,
	checksum VARCHAR(75) null,
	event VARCHAR(75) null,
	lockExpirationDate DATE null,
	lockUserId LONG,
	lockUserName VARCHAR(75) null,
	type_ VARCHAR(75) null,
	typePK LONG,
	typeUuid VARCHAR(75) null
);