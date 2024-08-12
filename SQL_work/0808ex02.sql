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

-- 5. 이름이 'A','J', 'M'으로 시작하는 사원의 이름과 이름의 길이를 출력하세요.
select concat(first_name,last_name), length(concat(first_name,last_name))
from employees
where substr(first_name,1,1) in ('A', 'J', 'M');

-- - -- Date 타입 처리 문제
-- 1. 1987년에 입사한 사원의 이름을 출력하세요.
select * from job_history;

select concat(E.first_name,E.last_name) as '사원의 이름', E.hire_date
from employees E
where hire_date like '1987%';

-- 2. 사원의 이름, 입사년도, 근무년수를 출력하세요.
select concat(E.first_name,E.last_name), hire_date, 2024-(substr(hire_date,1,4)) as 근무년수
from employees E;

select concat(E.first_name,E.last_name), hire_date, datediff(sysdate(),hire_date)/365 as 근무년수
from employees E;

-- 3. '1987-06-01'과 '1987-07-30'사이에 입사한 사원의 이름과 입사일을 출력하세요.
select concat(E.first_name,E.last_name), hire_date
from employees E
where hire_date between '1987-06-01' and '1987-07-30'; 

-- 4. 6월에 입사한 사원의 이름과 성을 출력하세요.
select concat(E.last_name,E.first_name), hire_date
from employees E
where hire_date like '_____06%';				-- underBar 

select concat(E.last_name,E.first_name), E.hire_date
from employees E
where date_format(hire_date,'%m')=06;

-- 5. 부서별, 연도별 입사한 사원의 수를 구하세요.