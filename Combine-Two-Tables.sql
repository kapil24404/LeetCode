# Write your MySQL query statement below
Select firstName,lastName,city,state
FROM Person AS p
LEFT JOIN Address as a
ON p.personID=a.personId;
