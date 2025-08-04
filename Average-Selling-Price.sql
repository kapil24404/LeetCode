-- # Write your MySQL query statement below
-- Select product_id,
-- ROUND((SUM(units)),2) as average_price

Select P.product_id,IFNULL(ROUND(SUM(P.price*U.units)/SUM(U.units),2),0) as average_price from 
Prices as P
Left JOIN UnitsSold as U
ON P.product_id=U.product_id
AND U.purchase_date >=P.start_date
AND U.purchase_date <=P.end_date
GROUP BY P.product_id;