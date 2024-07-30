SELECT * FROM madangdb.book;

-- 1) 도서번호가 1인 도서의 이름
-- 2) 가격이 2만원 이상인 도서의 이름
-- 3) 박지성의 총구매금액
-- 4) 박지성이 구매한 도서의 수
-- 5) 박지성이 구매한 도서의 출판사 수
-- 6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이
-- 7) 박지성이 구매하지 않은 도서의 이름

-- 8) 마당서점 도서의 총개수
-- 9) 마당서점에 도서를 납품하는 출판사의 총개수
-- 10) 모든 고객의 이름, 주소
-- 11) 2024년 7월 4일부터 2024년 7월 7일 사이에 주문된 도서의 목록
-- 12) 성이 김씨인 고객의 이름과 주소
-- 13) 성이 김씨이고 이름이 아로 끝나는 고객의 이름과 주소
-- 14) 주문 금액의 총액과  평균금액
-- 15) 고객의 이름과 고객별 구매액
-- 16) 고객의 이름과 고객이 구매한 도서목록

-- 1번--  
select bookid, bookname
from book
where bookid=1;

-- 2) 가격이 2만원 이상인 도서의 이름
select bookname,book.price
from book
where 20000<=book.price;

-- 3) 박지성의 총구매금액
select customer.name, sum(orders.saleprice) as 구매총액
from customer, orders
where name='박지성' and orders.custid=customer.custid;

-- 4) 박지성이 구매한 도서의 수
select name, count(*) as 구매수
from orders, customer
where customer.name='박지성' and customer.custid=orders.custid;

-- 5) 박지성이 구매한 도서의 출판사 수 xxxxxxxxxxxx
select name, count(publisher) as 출판사수
from book, customer, orders
where name='박지성' and book.bookid=orders.bookid and customer.custid=orders.custid;

-- 6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이
select name, bookname, price,(price-saleprice) as '할인가격'
from book, customer, orders
where name='박지성' and book.bookid=orders.bookid and customer.custid=orders.custid;

-- 7) 박지성이 구매하지 않은 도서의 이름 xxxx 안산거 어케함
select name, bookname
from book, customer, orders
where name not in ('박지성') and book.bookid=orders.bookid and customer.custid=orders.custid;

-- 8) 마당서점 도서의 총개수
select count(bookid) as 도서개수 from book;

-- 9) 마당서점에 도서를 납품하는 출판사의 총개수
select count(publisher) as 출판사의수 from book;

-- 10) 모든 고객의 이름, 주소
select name, address from customer;

-- 11) 2024년 7월 4일부터 2024년 7월 7일 사이에 주문된 도서의 목록
select bookid, orderdate from orders
where '2024-07-04' <= orderdate and orderdate <= '2024-07-07'; 

-- 12) 성이 김씨인 고객의 이름과 주소
select name, address from customer
where name like '김%';

-- 13) 성이 김씨이고 이름이 아로 끝나는 고객의 이름과 주소
select name, address from customer
where name like '김%아';

-- 14) 주문 금액의 총액과  평균금액
select sum(saleprice), avg(saleprice) from orders;

-- 15) 고객의 이름과 고객별 구매액
select name, saleprice
from customer, orders
where customer.custid=orders.custid;

-- 16) 고객의 이름과 고객이 구매한 도서목록
select name, bookname
from book, customer, orders
where book.bookid=orders.bookid and customer.custid=orders.custid;
