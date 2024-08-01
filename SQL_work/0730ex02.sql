SELECT * FROM madangdb.book;

select * from book
where publisher in ('굿스포츠','대한미디어');

--  where publisher = '굿스포츠'|| publisher = '대한미디어');

select * from book
where bookname like '_구%';

update book
set bookname = '그 여자의 축구'
where bookid=2;


select * from book
where bookname like '_구%';

delete from book
where bookid=2;

SELECT * FROM madangdb.orders;

select sum(saleprice) from orders;
select avg(saleprice) from orders;
select count(saleprice) from orders;
select max(saleprice) from orders;
select min(saleprice) from orders;

select price as '판매가격' from book;

select 	sum(saleprice) as total,
		avg(saleprice) as 평균,
        min(saleprice) as '최소값',
        max(saleprice) as '최대값'
from Orders;

select count(*) from orders;

SELECT * FROM madangdb.orders;

select custid as 고객번호, count(saleprice) as 총주문량, sum(saleprice) as 총판매액 from orders
group by custid;

SELECT * FROM madangdb.book;

select bookname, publisher,price from book
where 10000<=price and price<=20000;

SELECT * FROM madangdb.orders;

select *
from customer, orders
where customer.custid=orders.custid
order by orders.orderid;


SELECT * FROM madangdb.orders;

select custid, name, count(saleprice) 
from orders, customer
where 8000<=saleprice
group by customer.name;

-- 고객의 이름과 고객의 주문한 도서의 이름을 구하시오--  
select name, bookname
from Orders, Book, Customer
where (Customer.custid=Orders.custid) and (Book.bookid=Orders.bookid)
order by Book.bookname;

SELECT * FROM madangdb.customer;

-- 가격이 2만원 이상인 책을 주문한 고객의 이름과 주문한 도서의 이름을 구하세요-- 

select name, bookname
from book,customer,orders
where (20000<=book.price) and (Customer.custid=Orders.custid) and (Book.bookid=Orders.bookid)
