# Write your MySQL query statement below
Select e.name ,b.bonus from Employee as e
Left JOIN Bonus as b
ON e.empId=b.empId
where b.bonus<1000 or b.bonus is NULL;