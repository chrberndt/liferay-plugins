create table PushNotificationsDevice (
	pushNotificationsDeviceId LONG not null primary key,
	userId LONG,
	createDate DATE null,
	platform VARCHAR(75) null,
<<<<<<< HEAD
	token VARCHAR(75) null
=======
	token STRING null
>>>>>>> e7cdf43148702e1699eea503c162f42b84cbcee1
);