select * from offices;

insert into offices(city, phone, address_line1, address_line2, state, country, postal_code, territory)
			value( 'Austin', 123-456-7894, 'Austin Downtorn', 'Red River Street' , 'TX','USA',78681,'USA');

update offices set phone = '+91 971-222-2456', country = "India" where id=8 ;





select * from employees where office_id=5;

-- I want to see the join employee and offices

select firstname, lastname, city, o.id, office_id, e.id
from employees e, offices o where e.office_id=o.id;

-- list of customers of particular employee
select * from customers where sales_rep_employee_id=1504;

-- list of customers with firstname Cassidy
select * from customers where contact_lastname='Cassidy';
select * from customers where country ='Ireland';

select * from customers where credit_limit>10000 and  credit_limit<50000;

-- customers with name begins with J  % is a wild card
select * from customers where contact_firstname LIKE "h%e%";




