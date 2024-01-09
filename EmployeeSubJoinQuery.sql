use testcourse;
#name of the employee  who works in IT department
#using subquery

select first_name,last_name from employees
 where department_id=(select department_id from departments 
                      where department_name="IT");
                      
#using join
select e.first_name,e.last_name from employees e join departments d
on e.department_id=d.department_id and d.department_name="IT";                    
                      
 select d.department_name,count(e.employee_id) as total from
 employees e join departments d
on e.department_id=d.department_id
group by d.department_id
order by total;

#write a query to display dispartment_id and department_name and manager first name and salary
select d.*,e.salary ,e.first_name from employees e join departments d
on e.MANAGER_ID=d.MANAGER_ID;

#find the employees who work in us
select e.first_name from
 employees e join departments d join locations l
on e.department_id=d.department_id
 and d.location_id=l.location_id and l.country_id="us";
 
#name of the employee who are working as managers 
 select distinct(e1.first_name) from employees e1 join employees e2
 on e1.employee_id=e2.manager_id
 ;
 
 select distinct(e2.first_name) from employees e1 join employees e2
 on e2.employee_id=e1.manager_id;
 
 
 
 
 
 
 
 
 