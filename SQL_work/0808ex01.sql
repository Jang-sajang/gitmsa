-- 1. Employees와 Departments 테이블에 저장된 행의 개수를 출력하세요.
-- 2. Employees 테이블에 대한 employee_id, last_name, job_id, hire_date를 출력하세요.
-- 3. Employees 테이블에서 salary가 12,000 이상인 직원의 last_name과 salary를 출력하세요.
-- 4. 부서번호 (department_id)가 20 혹은 50인 직원의 last_name과 department_id를 last_name에 대하여 오름차순으로 출력하세요.
-- 5. last_name의 세 번째에 a가 들어가는 직원의 last_name을 출력하세요.
-- 6. 같은 일(job)을 하는 사람의 수를 세어 출력하세요.
-- 7. 급여(salary)의 최대값과 최소값의 차이를 구하세요.
-- 8. Toronto(city)에서 일하는 직원의 last_name, job, department_id, department_name을 출력하세요.

-- 1번
select count(employees.employee_id) as 'row of Employees',count(departments.department_id) as 'row of Departments'
from departments,employees;
select count(*) from employees;

-- 2번
select employee_id,last_name, job_title, hire_date
from employees E, jobs J
where J.job_id = E.job_id;

-- 3. Employees 테이블에서 salary가 12,000 이상인 직원의 last_name과 salary를 출력하세요.
select last_name, salary
from employees
where 12000<=salary;

-- 4. 부서번호 (department_id)가 20 혹은 50인 직원의 last_name과 department_id를 last_name에 대하여 오름차순으로 출력하세요.
select D.department_name, E.department_id
from employees E, departments D
where E.department_id in(20, 50) and D.department_id = E.department_id
order by e.department_name asc;

-- 5. last_name의 세 번째에 a가 들어가는 직원의 last_name을 출력하세요.
 

-- 6. 같은 일(job)을 하는 사람의 수를 세어 출력하세요.
select job_id, count(*) from employees
group by job_id
having 2 <= count(job_id);

-- 8. Toronto(city)에서 일하는 직원의 last_name, job, department_id, department_name을 출력하세요.
select e.last_name, j.job_title, d.department, d.department_name
from emlpoyees E, jobs j, deprtment d,location l
where e.job_id = j.job_id and e.depart_id, 