BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "Bank" (
	"bank_id"	TEXT NOT NULL UNIQUE,
	"bank_name"	TEXT NOT NULL UNIQUE,
	"bank_balance"	REAL NOT NULL,
	"bank_user_count"	INTEGER NOT NULL,
	PRIMARY KEY("bank_id")
);
CREATE TABLE IF NOT EXISTS "Statement" (
	"stm_id"	INTEGER NOT NULL UNIQUE,
	"ac_id_transsferor"	TEXT NOT NULL,
	"ac_name_transferor"	TEXT NOT NULL,
	"ac_id_recipient"	TEXT NOT NULL,
	"ac_name_recipient"	TEXT NOT NULL,
	"stm_date"	NUMERIC NOT NULL,
	"stm_transfer"	REAL,
	"stm_receive"	REAL,
	PRIMARY KEY("stm_id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "Account" (
	"ac_number"	TEXT NOT NULL UNIQUE,
	"bank_id"	TEXT NOT NULL,
	"bank_name"	TEXT NOT NULL,
	"ac_name"	TEXT NOT NULL,
	"ac_balance"	REAL NOT NULL,
	"user_id"	TEXT NOT NULL,
	PRIMARY KEY("ac_number")
);
CREATE TABLE IF NOT EXISTS "User" (
	"user_id"	TEXT NOT NULL UNIQUE,
	"user_password"	TEXT NOT NULL,
	"user_name"	TEXT,
	"user_tel"	TEXT,
	"bank_id"	TEXT,
	PRIMARY KEY("user_id")
);
INSERT INTO "User" ("user_id","user_password","user_name","user_tel","bank_id") VALUES ('Admin01','Admin','Anupat','0661128806',NULL),
 ('Admin02','Admin',NULL,NULL,NULL);
COMMIT;
