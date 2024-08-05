create database highSchool;
use highschool;

create table Student(
	   s_ID integer auto_increment primary key,
	   s_name varchar(20) not null,
       s_year varchar(5) not null default '2024',
       s_grade varchar(3) not null ,
       s_class varchar(3) not null ,
       s_number varchar(5) not null ,
       s_password varchar(50) not null DEFAULT '1234' 
);

create table Teacher(
	   t_ID integer(10) not null primary key,
       password varchar(20) not null,
       t_name varchar(50) not null,
       subject varchar(50) not null,
       t_type char(1) null default '4'
);

create table lesson(
	   L_ID integer(10) auto_increment primary key,
       t_id integer(10) not null,
       L_name varchar(50) not null,
       L_year varchar(5) not null,
       L_grade varchar(3) not null,
       L_semester char(1) not null,
       L_class varchar(3) null,
       L_day date,
       L_time datetime,
       L_room varchar(20) null,
       foreign key(t_id) references Teacher(t_ID)
);

create table AtList(
	   L_ID integer(10) not null ,
	   S_ID integer(10) not null ,
       primary key(l_id, s_id),
       foreign key(s_id) references student(s_id),
       foreign key(l_id) references lesson(l_id)
);

create table perform(
	   p_id integer(10) auto_increment primary key,
       p_title varchar(100) not null,
       p_type char(1) null,
       p_content tinytext not null,
       p_standard varchar(100) null,
       p_startdate1 date not null,
       p_end_date2 date not null,
       l_id integer(10) not null,
       foreign key(l_id) references lesson(l_id)
);

create table evaluation(
	   s_id integer(10) auto_increment primary key,
       L_ID integer(10) not null ,
	   p_id integer(10) not null,
	   e_score integer not null,
       e_check char(1) null,
       e_chechdate date null,
--        primary key(lid, pid, sid),
       foreign key(l_id) references lesson(l_id),
       foreign key(p_id) references perform(p_id),
       foreign key(s_id) references student(s_id)
);