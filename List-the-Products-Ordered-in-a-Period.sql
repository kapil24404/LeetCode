# Write your MySQL query statement below
Select p.product_name,SUM(o.unit ) as unit
from Products as p
RIGHT JOIN Orders as o
ON p.product_id=o.product_id
WHERE o.order_date >= '2020-02-01' AND o.order_date < '2020-03-01'
GROUP BY o.product_id
HAVING SUM(o.unit)>=100;
