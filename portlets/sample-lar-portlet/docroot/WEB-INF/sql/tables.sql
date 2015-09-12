create table SampleLARBooking (
	uuid_ VARCHAR(75) null,
	sampleLARBookingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
<<<<<<< HEAD
	bookingNumber VARCHAR(75) null
=======
	bookingNumber VARCHAR(75) null,
	lastPublishDate DATE null
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
);