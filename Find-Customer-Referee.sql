# Write your MySQL query statement below
Select name
from Customer 
where ISNULL(referee_id) OR referee_id!=2;;