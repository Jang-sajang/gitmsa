SELECT * FROM madangdb.orders;

-- 대한미디어에서 출판한 도서를 구매한 고객의 이름을 출력하세여
select name, bookname
from customer, book, orders
where publisher like'대한미디어' and book.bookid=orders.bookid and customer.custid=orders.custid;

-- 고객의 이름과 고객별 구매액
select customer.name, sum(orders.saleprice)
from customer, orders
where customer.custid = orders.custid
group by customer.name
order by customer.name; -- 가나다 순 

-- 고객의 이름과 고객이 구매한 도서 목록
select name, bookname
from book, customer, orders
where book.bookid=orders.bookid and customer.custid=orders.custid;

-- 대한민국에 거주하는 고객리스트
select name, address
from customer
where address like '대한민국%';

-- 도서를 주문한 고객리스트 출력 (서브쿼리)  
select name from customer
where custid in (select custid from orders);

-- 대한국민에 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 출력하세요 //유니온 학습
select name from customer
where address like '대한민국%'
union all
select name from customer
where custid in (select custid from orders);

select name, address
from customer cs
where exists (select *
			  from orders od
			  where cs.custid=od.custid);
              

create table NewBook(
	bookid	integer,
    bookname varchar(20),
    publisher varchar(20),
    price integer,
	primary key (bookid));
    
create table NewOrders(
	orderid integer primary key,
    custid integer not null,
    bookid integer not null,
    saleprice integer,
    orderdate date,
    foreign key (custid) references newcustomer(custid) ON DELETE cascade);
    
describe newbook;

alter table NewBook add isbn varchar(13);
alter table NewBook modify isbn integer;
alter table NewBook drop isbn;
alter table NewBook modify bookname varchar(20) not null;

alter table NewBook add primary key (bookname, publisher);

delete from NewBook where bookid='1';  -- 업데이트 딜리트는 where 절이 꼭 있어야한다

-- 인설트 인투로 선언해주고  자료 만드는게 정확하대.
insert into book(bookid, bookname, publsger, price)
	values (11, '스포츠 의학','한솔의학서점','9000');
    
-- 1) 박지성이 구매한 도서의 출판사 // 와 같은 출판사 에서 / 도서를 구매한 고객의 이름
select name
from Book B, customer C, Orders O
where count(custid) >=1 and C.custid = O.custid;

select publisher
from Book B, customer C, Orders O
where name = '박지성' and B.bookid = O.bookid and C.custid = O.custid;

-- 2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select name, publisher
from Book B, customer C, Orders O
where publisher in (select publisher from book) and B.bookid = O.bookid and C.custid = O.custid;

-- 3) 전체 고객의 30%이상이 구매한 도서 