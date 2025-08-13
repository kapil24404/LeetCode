# Write your MySQL query statement below
-- DELETE p FROM Person p
-- JOIN Person p2 
-- ON p.Email = p2.Email AND p.Id > p2.Id;
DELETE p1
from Person p1
JOIN Person p2
ON p1.email=p2.email
WHERE p1.id>p2.id;