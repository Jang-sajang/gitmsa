create database madangUniversity;

use madangUniversity;
-- 373페이지 
-- 교수 / 아이디, 이름, 나이, 직위, 연구분야
create table Professor(
	   ssn varchar(20) primary key,
       name varchar(25),
       age integer(3),
       P_rank varchar(10),
       speciality varchar(20)
);
-- 학과 / 학과번호, 학과이름, 학과 사무실
create table Department(
	   dno integer(5),
       dname varchar(20),
       office varchar(20),
       
       ssn varchar(20),
       foreign key(ssn) references Professor(ssn)
);
-- 대학원생 / 아이디, 이름, 나이 ,학위과정
create table Graduate(
	   ssn varchar(20) primary key,
       name varchar(20),
       age integer(3),
       deg_prog char(2),
       
       dno integer(5),
       advisor varchar(20) null,
       foreign key(dno) references Department(dno), -- 7번) 대학원생에게는 전공학과가 하나씩 있다.
       foreign key(advisor) references Graduate(ssn)
);
-- 과제 / 과제번호, 지원기관, 개시일, 종료일, 예산액
create table Project(
	   pid varchar(10) primary key,
       sponsor varchar(10),
       start_date date,
       end_date date,
       budget INT(15),
       manager varchar(20),
       foreign key (manager) references Professor(ssn)
);

create table work_dept(		-- 근무
	   ssn varchar(20) not null,
       dno integer(5) not null,
       pct_time integer(3),
       foreign key(ssn) references Professor(ssn),
       foreign key(dno) references Department(dno),
       primary key(ssn, dno)
);

create table work_in(
	   ssn varchar(20),
	   pid varchar(10),
	   foreign key(ssn) references Professor(ssn),
	   foreign key(pid) references Project(pid),
       primary key(ssn, pid)
);

create table work_prog(
	   pid varchar(10),
       ssn varchar(20),
       foreign key(pid) references Project(pid),
       foreign key(ssn) references Graduate(ssn)
);
