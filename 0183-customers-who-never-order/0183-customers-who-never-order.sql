# Write your MySQL query statement below
select name AS Customers from customers 
where id not in (select customerId from orders  );