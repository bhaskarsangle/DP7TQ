#decrease the salary of employee by 10% who works in use
use testcourse;
update employees e join  departments d join locations l
on e.department_id=d.department_id and d.location_id=l.location_id
set e.salary=e.salary-(0.2*e.salary)
where l.country_id="US";


#delete the employees working in HR department
create table employees_copy(select * from employees);

delete e
from employees_copy e join departments d
on e.department_id=d.department_id and d.DEPARTMENT_NAME="human resources";

#
select l.city,count(e.employee_id)as total from employees e join departments d join locations l
on e.department_id=d.department_id and d.location_id=l.location_id
group by l.city
order by total desc
limit 1;











