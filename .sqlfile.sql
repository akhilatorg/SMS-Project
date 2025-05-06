CREATE DATABASE studentdb;

USE studentdb;
drop table if exists admins;
CREATE TABLE login(
    username VARCHAR(100),
    password VARCHAR(100)
);

INSERT INTO login(username, password)
VALUES("Akhil", "bishtAkhil@196907");

select * from login;

CREATE TABLE student(
stuID VARCHAR(50),
name VARCHAR(50),
fname VARCHAR(50),
dob VARCHAR(50),
gender VARCHAR(50),
education VARCHAR(50),
sem VARCHAR(50),
phone VARCHAR(50),
email VARCHAR(50),
aadhaar VARCHAR(50),
address VARCHAR(50)
);
INSERT INTO student(stuID, name, fname, dob, gender, education, sem, phone,email,aadhaar, address)
VALUES();
SELECT * FROM student ;
