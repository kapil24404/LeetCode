# Write your MySQL query statement below
Select sell_date,COUNT(DISTINCT product) as num_sold ,
GROUP_CONCAT(DISTINCT product
SEPARATOR ',') as products
from Activities
GROUP BY sell_date;