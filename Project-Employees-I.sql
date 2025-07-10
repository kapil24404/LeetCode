# Write your MySQL query statement below
Select p.project_id, ROUND(avg(e.experience_years),2) as average_years
from Project p
Left join Employee e
ON p.employee_id=e.employee_id
group by p.project_id;