# Write your MySQL query statement below
Select name as Customers
FROM Customers as c
LEFT JOIN Orders o ON c.id = o.customerID
WHERE o.id IS NULL;