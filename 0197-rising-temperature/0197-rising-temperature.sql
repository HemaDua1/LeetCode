# Write your MySQL query statement below
select p1.id as Id
from Weather as p1
join Weather as p2
on datediff(p1.recordDate,p2.recordDate)=1
 and p1.temperature>p2.temperature;