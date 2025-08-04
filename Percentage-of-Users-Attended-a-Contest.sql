# Write your MySQL query statement below
Select contest_id, ROUND(COUNT(distinct user_id)*100/(Select COUNT(user_id) from Users),2) as percentage from 
Register
GROUP BY contest_id
ORDER BY percentage desc,contest_id;