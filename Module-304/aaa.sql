select * from new_view_table;
select col_date from new_view_table;

select * from products order by 1 desc;
select * from customers;
select * from orders;
select * from orderdetails order by 1 desc;
select * from employees;
select * from productlines;

select customer_name, contact_lastname, contact_firstname from customers 
where customer_name = 'First name'or
contact_firstname = 'First name' or
contact_lastname = 'First name';

select * from orderdetails where order_id=10100;
delete from products where id in (114, 112);