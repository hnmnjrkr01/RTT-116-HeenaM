-- question1  
-- I want to see the name of the product line and all product names in that product line
-- order by the product line name then by the product name

select product_line, product_name from productlines pl, products p
where pl.id = p.productline_id
order by pl.product_line , p.product_name;

-- question 2   I want to see the order number, the product name, and the quantity ordered
-- order by the order number (descending), then the product name (ascending) , then the quantity ordered ( fewest first)

select order_id, quantity_ordered, product_name
from orderdetails od, products p 
where od.product_id = p.id 
order by order_id desc, product_name asc, quantity_ordered asc;

-- Question 3	I want to see all payments made by customers.  
-- The result should show the customer name, the check number, payment date, and the amount.   
-- I want the result set ordered by the customer name (ascending), the payment date ( descending  newest first)
select c.customer_name, p.check_number,p.payment_date, p.amount
from customers c, payments p
where c.id = p.customer_id
order by c.customer_name asc,p.payment_date desc;


-- Question 4 I want to see the orders and all products in that order - order number and product name
-- order by the order number ascending and the product name descending.
select od.order_id as order_number , p.product_name
from orderdetails od, products p
where od.product_id = p.id
order by od.order_id asc, p.product_name desc;

-- Question 5  I want to see the number of products in each order 
-- I want to see the order id and the count of each product in that order ... order by count(*) desc
select order_id, count(*) product_id 
from orderdetails
group by order_id 
order by product_id desc;

-- Question 6  I want to see the customer that has made most payments (group by customer_id)
select c.id, count(c.customer_name)
from customers c, payments p
where c.id = p.customer_id
group by c.id
order by c.customer_name;

-- Question 7 I want to see the office that has has the most orders (group by office_id)
select o.id, o.city ,count(*)
from offices o, employees e, customers c, orders ord 
where o.id = e.office_id
and e.id = c.sales_rep_employee_id
and c.id = ord.customer_id
group by o.id order by count(*) desc;

-- Question 8 I want to see the order that has the most products ( group by order_id)
select order_id, count(*)
from orderdetails
group by order_id
order by count(*) desc;

-- Question 9 I want to see the employee first name and last name and 
-- the customer name ordered by the customer name
select concat(e.firstname,' ', e.lastname) as employee_fullname, 
c.customer_name, concat(c.contact_firstname,' ', c.contact_lastname) as customer_fullname
from employees e , customers c
where e.id = c.sales_rep_employee_id
order by c.customer_name;

-- Question 11 I want to see the count of all orders by office 
select o.id, count(ord.id) as orders_per_office
from orders ord, offices o, employees e,customers c
where ord.customer_id = c.id
and c.sales_rep_employee_id = e.id
and e.office_id = o.id
group by o.id ;

-- Question 10  I want to see the total quantity ordered for each order ... 
-- we have not learned this yet .. but it group by the order_id and sum(quanity_ordered)
select order_id, sum(quantity_ordered) as total_quantity
from orderdetails
group by order_id;









