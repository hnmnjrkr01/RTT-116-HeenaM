CREATE VIEW `student_address` AS
select firstname, lastname, street, city
from student
where state = 'NY';