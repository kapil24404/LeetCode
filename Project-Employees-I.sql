# Write your MySQL query statement below
Select p.project_id,ROUND(AVG(e.experience_years),2) as average_years from
Project as p
Left join Employee as e
ON p.employee_id =e.employee_id
GROUP BY p.project_id;
