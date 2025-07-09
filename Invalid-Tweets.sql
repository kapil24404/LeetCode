# Write your MySQL query statement below
Select tweet_id 
FROM Tweets
where length(content)>15
ORDER BY tweet_id DESC;