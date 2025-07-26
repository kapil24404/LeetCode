# Write your MySQL query statement below
Select unique_id,name
FROM Employees as e
LEFT JOIN 
EmployeeUNI as f
ON e.id=f.id;

