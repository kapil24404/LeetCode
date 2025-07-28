# Write your MySQL query statement below
Select w1.id 
from Weather as w1
join Weather as w2
where w1.temperature>w2.temperature
AND DATEDIFF(w1.recordDate,w2.recordDate)=1;