# Write your MySQL query statement below
Select a. id
FROM 
Weather as a
JOIN Weather as b
Where DATEDIFF(a.recordDate,b.recordDate)=1 AND
a.temperature>b.temperature;