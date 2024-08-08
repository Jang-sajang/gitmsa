-- 1. 성(last name)이 Matos와 Taylor인 직원의 성, 직무 ID(job_id), 시작 날짜(start date)를 출력하는 보고서를 작성하세요. 
-- 쿼리를 시작 날짜 기준 오름차순으로 정렬하세요.

select last_name, job_id, hire_date
from employees
where last_name in('Matos', 'Taylor')
order by hire_date asc;
-- 2. 1994년에 고용된 모든 직원의 성(last name)과 입사 날짜(fire date)를 출력하는 보고서가 인사부서에 필요합니다.
select hire_date, last_name
from employees
where hire_date like '1994%';

select hire_date, last_name
from employees
where date_format(hire_date,'%Y')='1994';

-- 3. 직무가 영업 대표(sales representative) 또는 재고 사원(stock clerk)인 모든 직원의 성(last name), 
-- 직무(job), 급여(salary)를 출력하며, 급여가 $2,500, $3,500 또는 $7,000가 아닌 직원들을 포함하세요.
select last_name, J.job_title, salary
from employees E, jobs J
where E.job_id = J.job_id  and salary not in(2500,3500,7000) and J.job_title in('sales representative','stock clerk');

-- 4. 매니저 수를 나열하지 않고 구하세요. 열 이름을 '매니저 수(Number of Managers)'로 표시하세요.
select count(manager_id) as '매니저 수'
from employees;
-- 5. 매니저의 번호(manager number)와 해당 매니저 밑에서 가장 낮은 급여를 받는 직원의 급여를 출력하는 보고서를 작성하세요. 
-- 매니저가 알려지지 않은 경우와 최소 급여가 $6,000 이하인 그룹은 제외하세요. 출력 값을 급여 내림차순으로 정렬하세요.



