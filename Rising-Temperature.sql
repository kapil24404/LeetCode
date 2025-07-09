# Write your MySQL query statement below
SELECT W.id
FROM Weather W
JOIN Weather T
  ON DATEDIFF(W.recordDate, T.recordDate) = 1
WHERE W.temperature > T.temperature;

