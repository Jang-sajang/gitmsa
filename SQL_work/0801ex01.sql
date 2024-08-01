SELECT * FROM madangdb.orders;

select abs(-78), abs(78);

-- 고객별 주문 금액을 100원 단위로 반올림한 값을 구하시오.
select name, round(avg(saleprice),-2) as 평균주문금액
from orders O, customer C
where O.custid=C.custid
group by name;

select substr('ABCDEFG',3,4);
select trim(' ' from " A B C D E F ");

-- 도서 제목에 야구가 포함된 도서 // 를 농구로 변경한 후 도서 목록을 나타내세요
select replace (book.bookname,'야구' ,'농구') from book;

-- 굿스포츠에서 출판한 도서의 제목과 제목의 문자 수, 바이트 수를 출력하세요.

-- 마당서점의 고객 중에서 성이 같은 사람이 몇명이나 되는지 알고 싶다. 성별 인원수를 구하시오.
select substr(name,1,1) '성', count(*) '인원'
from Customer
group by substr(name,1,1);

select adddate('2024-07-01', interval -5 DAY) Before5,
	   adddate('2024-07-01', interval +5 DAY) After5;

-- 2024 7월 7일 주문받은 도서를 모두 나타내세요
select bookname, orderdate, orderdate
from book, orders where '2024-07-04' and book.bookid=orders.bookid;

create view Vorders
as select orderid, O.custid, name, O.bookid, bookname, saleprice, orderdate
from customer C , orders O, book B
where C.custid=O.custid and B.bookid=O.bookid;

-- 주소에 대한민국을 포함하는 고객들로 구성된 뷰를 만들고 조회하시오. 뷰의 이름은 vw_customer로 설정하기.
create view vw_customer
as select customer.custid, name, address, phone
from customer
where address like '대한민국%';

select * from vw_customer;

-- orders테이블에서 고객명과 도서명을 확인할 수 있는 뷰를 생성한 후, 김연아 고객이 구입한 도서의 주문번호, 도서명, 주문액을 출력하세요
create view vv_Orders
as select orderid, O.custid, O.bookid, name, bookname, saleprice, orderdate
from book B, orders O, customer C
where C.custid=O.custid and B.bookid=O.bookid;

select * from vv_orders;

select orderid as '주문번호', name, bookname as '도서명', saleprice as '주문액'
from vv_orders
where name like '김연아';

select count(phone)
from customer
group by name;

create table Mybook(
	bookid varchar(10),
    price integer(20)
    );
    insert into mybook VALUES('1',10000);
	insert into mybook VALUES('2',20000);
	insert into mybook (bookid) VALUES(3);
    
    alter table mybook add primary key (bookid);
    select price+100
    from mybook
    where bookid=3;
    select * from mybook;
	
    select sum(price), avg(price), count(*), count(price)
    from mybook
    where bookid >=4;
    
    select *
    from mybook
    where price is null;
	select count(*)
    from mybook
    where price is null;
	select *
    from mybook
    where price = '';
    
    select name '이름', ifnull(phone, '연락처없음') '전화번호'
    from customer;
    
    select bookid, ifnull(price,'책정불가')
    from mybook;