-- # Write your MySQL query statement below



select max(e1.salary) as secondhighestsalary 
from employee e1
join employee e2
on e1.salary<e2.salary;


-- SELECT IFNULL(
--     (
--         SELECT DISTINCT salary
--         FROM Employee
--         ORDER BY salary DESC
--         LIMIT 1 OFFSET 1
--     ), NULL
-- ) AS SecondHighestSalary;