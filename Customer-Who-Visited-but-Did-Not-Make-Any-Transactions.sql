# Write your MySQL query statement below
Select  v.customer_id,Count(v.visit_id) as count_no_trans from Visits v
LEFT JOIN Transactions t
ON v.visit_id=t.visit_id
where t.transaction_id is NULL
group by customer_id;