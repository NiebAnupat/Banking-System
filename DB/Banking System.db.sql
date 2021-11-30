CREATE TABLE MoneyDeposit (
	dp_id	INTEGER NOT NULL UNIQUE,
	dp_money	REAL NOT NULL,
	ac_number	INTEGER NOT NULL,
	PRIMARY KEY(dp_id)
);
CREATE TABLE  MoneyTransfer (
	tf_id	INTEGER NOT NULL UNIQUE,
	tf_money	REAL NOT NULL,
	ac_number_treansferor	INTEGER NOT NULL UNIQUE,
	ac_number_recipiebt	INTEGER NOT NULL UNIQUE,
	PRIMARY KEY(tf_id)
);
CREATE TABLE  MoneyWithdraw (
	wd_id	INTEGER NOT NULL UNIQUE,
	wd_money	REAL NOT NULL,
	ac_number	INTEGER NOT NULL UNIQUE,
	PRIMARY KEY(wd_id)
);
CREATE TABLE Statement (
	stm_id	INTEGER NOT NULL UNIQUE,
	stm_date	NUMERIC NOT NULL,
	dp_id	INTEGER,
	wd_id	INTEGER,
	tf_id	INTEGER,
	PRIMARY KEY(stm_id)	
);
CREATE TABLE Customers (
	customer_id	VARCHAR(512) NOT NULL UNIQUE,
	customer_password	VARCHAR(512) NOT NULL,
	customer_name	VARCHAR(512) NOT NULL,
	customer_tel	VARCHAR(512) NOT NULL,
	PRIMARY KEY(customer_id)
);
CREATE TABLE Bank (
	bank_id	INTEGER NOT NULL UNIQUE,
	bank_name	VARCHAR(512) NOT NULL UNIQUE,
	bank_balance	REAL NOT NULL,
	PRIMARY KEY(bank_id)
);
CREATE TABLE Account (
	customer_id	VARCHAR(512) NOT NULL,
	ac_number	INTEGER NOT NULL UNIQUE,
	bank_id	INTEGER NOT NULL,
	ac_name	VARCHAR(512) NOT NULL,
	ac_balance	REAL NOT NULL,
	PRIMARY KEY(ac_number)	
);
INSERT INTO Customers (customer_id,customer_password,customer_name,customer_tel) VALUES ('Admin01','Admin','Anupat','0661128806'),
 ('Nieb','Nieb1234','Anupat Kaewmee','0661128806'),
 ('Test','Test','Test','Test');
INSERT INTO Account (customer_id,ac_number,bank_id,ac_name,ac_balance) VALUES ('Nieb',1234,3,'Anupat',250.0),
 ('Admin01',1241,1,'Anupat',1252.0),
 ('Admin01',5123,2,'Anupat',214.0),
 ('Nieb',42612,6,'Anupat',643880.0);
INSERT INTO Bank (bank_id,bank_name,bank_balance) VALUES (1,'NiebBanking',0.0),
 (2,'NoeyBanking',0.0),
 (3,'EngBanking',0.0),
 (4,'PinukBanking',0.0),
 (5,'PeeBanking',0.0),
 (6,'IceBanking',0.0);
COMMIT;
