# Write your MySQL query statement below
Select e.name,b.bonus
FROM Employee as e
LEFT JOIN Bonus as b
ON e.empID=b.empID
where bonus<1000 OR bonus is NULL;