-- SELECT MAX(num) AS num
-- FROM MyNumbers
-- GROUP BY num
-- HAVING COUNT(num) = 1
-- ORDER BY num DESC
-- LIMIT 1;

SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
) AS singles;
