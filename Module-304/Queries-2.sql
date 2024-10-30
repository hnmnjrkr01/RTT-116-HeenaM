-- JOin and group by 
-- List office name and count of employees in that office 


select * from employees ;

select office_id, count(*) from employees group by office_id;

select firstname, count(*) from employees 
group by firstname;

-- joining employees and offices tables
select o.city ,e.office_id, count(*)
from employees e, offices o
where e.office_id = o.id
group by office_id;


-- coutnof all first names
select firstname, count(*)
from employees group by firstname;


-- find employee with most customers
select sales_rep_employee_id, count(*)
from customers 
group by sales_rep_employee_id
order by count(*) desc;


-- lost all  nulls here as we are looking for emp with most customer not other way

select e.firstname, e.lastname, sales_rep_employee_id, count(*)
from customers c, employees e where c.sales_rep_employee_id = e.id
group by sales_rep_employee_id
order by count(*) desc;

-- list of all cutomers for san fransisco office

select * from offices o, employees e
where o.id=1  and e.office_id = o.id;

select e.firstname, e.lastname, o.city  from offices o, employees e
where o.id=1  and e.office_id = o.id;

select e.firstname, e.lastname, o.city , c.customer_name ,c.contact_firstname, c.contact_lastname
from offices o, employees e, customers c
where o.id=1  and e.office_id = o.id and c.sales_rep_employee_id = e.id;

-- list of all customer the sales reps and the office names
select e.firstname, e.lastname, o.city , c.customer_name ,c.contact_firstname, c.contact_lastname
from offices o, employees e, customers c
where e.office_id = o.id and c.sales_rep_employee_id = e.id;

-- list customer that made an order and Customer name, office , emp name and order id and order date
select * from orders;

select e.firstname, e.lastname, o.city , c.customer_name ,c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date
from offices o, employees e, customers c, orders ord
where e.office_id = o.id and 
c.sales_rep_employee_id = e.id and
ord.customer_id = c.id
order by e.id, c.customer_name;


-- list of all products purchased , customer name, the office, emp name order id and the quantity ordered
select e.firstname, e.lastname, o.city , c.customer_name ,c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date, od.product_id, od.quantity_ordered
from offices o, employees e, customers c, orders ord, orderdetails od
where e.office_id = o.id and 
c.sales_rep_employee_id = e.id and
ord.customer_id = c.id and
ord.id = od.order_id
order by e.id, c.customer_name,  order_id;

select e.firstname, e.lastname, o.city , c.customer_name ,c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date, od.product_id, od.quantity_ordered
from offices o, employees e, customers c, orders ord, orderdetails od
where e.office_id = o.id and 
c.sales_rep_employee_id = e.id and
ord.customer_id = c.id and
ord.id = od.order_id
group by  order_id
order by e.id, c.customer_name; -- NOT WORKING 


-- everything above with product name, 
select e.firstname, e.lastname, o.city , c.customer_name ,c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date, od.product_id, od.quantity_ordered, p.product_name
from offices o, employees e, customers c, orders ord, orderdetails od, products p
where e.office_id = o.id and 
c.sales_rep_employee_id = e.id and
ord.customer_id = c.id and
ord.id = od.order_id and
od.product_id = p.id
order by e.id, c.customer_name,  order_id;


-- list od all the products thet were order, its frequency and how many times it was ordered (diff then quantity)
-- ordered most on top
-- order details table contain 1 record for each time product was ordered
-- need group by

select product_name, order_id as order_number
 from products p, orderdetails od
 where p.id = od.product_id;
 
select order_id as order_number, count(*)
 from products p, orderdetails od
 where p.id = od.product_id
 group by od.order_id order by od.order_id;

select e.firstname, e.lastname, o.city , c.customer_name ,c.contact_firstname, c.contact_lastname, ord.id as order_id, ord.order_date
from offices o, employees e, customers c, orders ord
where e.office_id = o.id and 
c.sales_rep_employee_id = e.id and
ord.customer_id = c.id
order by e.id, c.customer_name;

select e.firstname, e.lastname, o.city , c.customer_name ,c.contact_firstname, c.contact_lastname, 
ord.id as order_id, ord.order_date
from offices o inner join employees e on e.office_id = o.id
inner join customers c on c.sales_rep_employee_id = e.id 
inner join orders ord on ord.customer_id = c.id
order by e.id, c.customer_name;











