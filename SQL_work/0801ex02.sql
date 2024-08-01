SELECT * FROM madangdb.emp;

-- 1) 사원의 이름과 직위를 출력하세요. 단 사원의 이름은 '사원이름', 직위는 '사원직위' 머리글이 나오도록 출력하세요.
select ename 사원이름 , job 사원직위
from emp;
-- 2) 30번 부서에 근무하는 모든 사원의 이름과 급여를 출력하세요.
select ename, sal, deptno
from emp
where deptno like 30;
-- 3) 사원번호와 이름, 현재 급여, 증가한 급여분(열 이름은 '증가액'), 10% 인상된 급여(열 이름은 '인상된 급여')를 사원번호순으로 출력하세요.
select empno, ename, sal, round(sal*0.1) as 증가액, sal+round(sal*0.1) as 인상된급여
from emp
order by empno;
-- 4) 'S'로 시작하는 모든 사원과 부서번호를 출력하세요.
select ename, deptno
from emp
where ename like 's%';
-- 5) 모든 사원의 최대 및 최소 급여, 합계 및 평균 급여를 출력하세요. 열 이름은 각각 MAX, MIN, SUM, AVG로 합니다. 단, 소수점 이하는 반올림하여 정수로 출력하세요.
select max(sal) MAX, min(sal) MIN, sum(sal) SUM, round(avg(sal)) AVG
from emp;
-- 6) 업무 이름과 업무별로 동일한 업무를 하는 사원의 수를 출력하세요. 열 이름은 각각 '업무'와 '업무별 사원수'로 합니다.
select job 업무, count(job) as '업무별 사원수'
from emp
group by job;
-- 7) 사원의 최대 급여와 최소 급여의 차액을 출력하세요.
select (max(sal) - min(sal)) as 급여차액
from emp;
-- 8) 30번 부서의 구성원 수와 사원들 급여의 합계와 평균을 출력하세요.
select count(empno) 사원수, sum(sal) 급여합계, avg(sal) 평균
from emp
where DEPTNO like 30;