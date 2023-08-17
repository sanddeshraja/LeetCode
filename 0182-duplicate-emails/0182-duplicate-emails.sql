# Write your MySQL query statement below
Select distinct m.email from person m, person n
where m.id <> n.id and m.email = n.email;