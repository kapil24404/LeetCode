# Write your MySQL query statement below
Select eu.unique_id,em.name
from Employees as em
LEFT JOIN EmployeeUNI as eu
ON em.id=eu.id;