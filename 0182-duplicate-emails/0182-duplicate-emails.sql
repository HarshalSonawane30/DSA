/* Write your PL/SQL query statement below */
select email

from person 
Group by email 
having count (Distinct id)>1