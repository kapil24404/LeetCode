# Write your MySQL query statement below
Select u.unique_id,e.name from Employees e
Left join EmployeeUNI u
ON u.id=e.id;
