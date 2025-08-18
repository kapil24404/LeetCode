# Write your MySQL query statement below
Select e1.name
from Employee e1
join Employee e2
ON e1.id=e2.managerID
GROUP BY e2.managerID
HAVING COUNT(e2.managerID)>=5;