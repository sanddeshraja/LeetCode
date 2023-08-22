# Write your MySQL query statement below
Select name as Employee from Employee a
where salary >(Select salary from Employee b where a.managerId=b.id);