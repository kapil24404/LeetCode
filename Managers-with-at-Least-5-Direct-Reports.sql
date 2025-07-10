# Write your MySQL query statement below
Select a.name  from Employee a
join Employee b
ON a.id=b.managerId
group by b.managerId
having count(b.managerId)>=5;