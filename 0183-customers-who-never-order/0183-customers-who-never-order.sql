/* Write your PL/SQL query statement below */
select c.name as "Customers"
from Customers c
where id NOT IN

(select customerId from Orders)