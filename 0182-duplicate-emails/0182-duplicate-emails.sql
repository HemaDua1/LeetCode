# Write your MySQL query statement below
select e.email as Email
from Person as e
group by email
having count(e.email)>1 ;