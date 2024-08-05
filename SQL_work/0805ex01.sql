create database highSchool;
use highschool;

create table Student(
	   SID varchar(10) auto_increment primary key,
	   sname varchar(20) not null,
       syear varchar(5) not null default '2024',
       sgrade varchar(3) not null ,
       sclass varchar(3) not null ,
       snumber varchar(5) not null ,
       spassword varchar(50) not null DEFAULT '1234' 
);

create table Teacher(
	   tID varchar(10) not null primary key,
       password varchar(20) not null,
       tname varchar(50) not null,
       subject varchar(50) not null,
       ttype char(1) null default '4'
);

create table lesson(
	   LID varchar(10) auto_increment primary key,
       tid varchar(10) not null,
       Lname varchar(50) not null,
       Lyear varchar(5) not null,
       Lgrade varchar(3) not null,
       Lsemester char(1) not null,
       Lclass varchar(3) null,
       Lday date,
       Ltime datetime,
       Lroom varchar(20) null,
       foreign key(tid) references teacher(tid)
);

create table AtList(
	   LID varchar(10) not null ,
	   SID varchar(10) not null ,
       primary key(lid, sid),
       foreign key(sid) references student(sid),
       foreign key(lid) references lesson(lid)
);

create table perform(
	   pid varchar(10) auto_increment primary key,
       ptitle varchar(100) not null,
       ptype char(1) null,
       pcontent tinytext not null,
       pstandard varchar(100) null,
       pstartdate1 date not null,
       penddate2 date not null,
       lid varchar(10) not null,
       foreign key(lid) references lesson(lid)
);

create table evaluation(
	   sid varchar(10) auto_increment primary key,
	   pid varchar(10) not null,
	   e_score integer not null,
       e_check char(1) null,
       e_chechdate date null,
--        primary key(lid, pid, sid),
       foreign key(lid) references lesson(lid),
       foreign key(pid) references perform(pid),
       foreign key(sid) references student(sid)
);