create database MDbudongsan;

use MDbudongsanl;

create table Budongsan(
	   Fnum  integer(10),
       address varchar(20),
       price integer(20),
       ssNum integer(15)
);

show databases;
show tables;

use mysql;
desc user;

create user FINN@localhost identified by '1234';

select * from user;
create user mdguest1@localhost identified by '1234';
create user mdguest2 identified by '1234';

grant all privileges on madangdb.* to FINN@localhost;
flush privileges;

select * from madangdb.book;
grant select on madangdb.book to mdguest@localhost;