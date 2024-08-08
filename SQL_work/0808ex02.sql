SELECT * FROM hr.employees;

-- 사원의 이름이 8자 이상인 사원의 정보를 출력하세요.
select concat(first_name, last_name)
from employees
where '8' < length(concat(first_name, last_name));

-- 이름의 첫 글자가 대문자인 사원의 정보를 출력하세요.
select employee_id, first_name, phone_number
from employees
where 65<= ASCII(substr(first_name,1,1)) and ASCII(substr(first_name,1,1)) <= 90;

-- 사원의 성의 2번째 문자가 'c'인 사원의 이름과 이름의 길이를 출력하세요.
select last_name, length(last_name)
from employees
where last_name like '_c%';

-- 4. 주소 중 거리의 이름의 문자가 길이가 최소인 지역(locations)을 출력하세요.
select *
from locations
where length(street_address) in (select min(length(street_address)) from locations);
