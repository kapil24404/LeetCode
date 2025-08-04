# Write your MySQL query statement below
SELECT * FROM Cinema
where description!='boring' AND
id%2!=0 
ORDER BY rating DESC;