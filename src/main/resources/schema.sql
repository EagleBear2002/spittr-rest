create table Spittle (
	id identity,
	message varchar(140) not null,
	created_at timestamp not null,
	latitude double,
	longitude double
);

INSERT INTO Spittle (message,created_at,latitude,longitude)
             VALUES('message1',CURRENT_TIMESTAMP(),1.0,2.0);
INSERT INTO Spittle (message,created_at,latitude,longitude)
             VALUES('message2',CURRENT_TIMESTAMP(),3.0,4);
INSERT INTO Spittle (message,created_at,latitude,longitude)
             VALUES('message3',CURRENT_TIMESTAMP(),5,6);

create table Spitter (
	id identity,
	username varchar(20) unique not null,
	password varchar(20) not null,
	first_name varchar(30) not null,
	last_name varchar(30) not null,
	email varchar(30) not null
);