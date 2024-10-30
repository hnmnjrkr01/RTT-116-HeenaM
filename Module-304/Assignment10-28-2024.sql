
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

select o.id, p.product_name, od.quantity_ordered
from orderdetails od, products p,orders o
where o.id= od.order_id and od.product_id = p.id 
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
select order_id, count(order_id) as total_product_ordered 
from orderdetails group by order_id
order by count(order_id) desc;

select order_id, count(product_id) as count, sum(quantity_ordered) as total_quantity,
max(quantity_ordered) as maximun, min(quantity_ordered) as minimum, 
avg(price_each) as price_avg, max(price_each) as max_price
from orderdetails
group by order_id
order by order_id;


-- Question 6  I want to see the customer that has made most payments (group by customer_id)
select customer_id , customer_name , amount 
from customers c, payments p
where customers.id = payments.customer_id
group by p.customer_id
order by amount desc;

select customer_id, count(*) 
from payments p
group by customer_id
order by count(*) desc;

select c.customer_name, count(*)
from customers c, payments p 
where p.customer_id = c.id
group by customer_id
order by count(*) desc
limit 1;

select customer_id,



-- Question 7 I want to see the office that has has the most orders (group by office_id)
select offices.id ,offices.city, count(orders.id) as order_total 
from offices, orders
where employees.office_id = offices.id and
employees.id = customers.sales_rep_employee_id and
customers.id = orders.customer_id ; -- Not working

select o.id, o.city, count(*)
from offices o, employees e, customers c, orders ord
where o.id = e.office_id
	and e.id = c.sales_rep_employee_id
    and c.id = ord.customer_id
group by o.id
order by count(*) desc;




-- Question 8 I want to see the order that has the most products ( group by order_id)
select orders.id, orderdetails.quantity_ordered,products.id as product_id
from orders, orderdetails, products 
where orders.id = orderdetails.order_id
and orderdetails.product_id = products.id
order by orderdetails.order_id;
-- order by max(orderdetails.order_id);
-- group by orderdetails.order_id;

select order_id, count(*)  
from orderdetails
group by order_id
order by count(*) desc;

-- when the database executes the query .. internally first it gathers all the data without the group by and using the where clause
-- then it does the group by and figures out the aggregate functions
-- then it applys the having
select o.id, o.city, year(ord.order_date), count(distinct e.id) as employees, count(distinct c.id) as customer_count, count(*) as order_count
from offices o, employees e, customers c, orders ord
where o.id = e.office_id
	and e.id = c.sales_rep_employee_id
    and c.id = ord.customer_id
    -- we can not use aggregate functions in the where clause - this is a good rule of thumb
    -- however we can use the raw data to limit the query before it does the aggregate function
    -- and year(ord.order_date) = 2003 and month(ord.order_date) = 6
   -- and c.customer_name LIKE 'A%'
group by o.id, year(ord.order_date)
-- having is very much like a where clause accept that it only works on the aggrgate functions
-- can only be used with group by statements
-- having count(distinct e.id) > 1
order by o.id asc, year(ord.order_date) desc;










-- Question 9 I want to see the employee first name and last name and the customer name ordered by the customer name
-- Question 11 I want to see the count of all orders by office 

 






































