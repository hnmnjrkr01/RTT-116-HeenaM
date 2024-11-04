select product_name as name,
 productline_id as product_line, 
 buy_price as price
from products
order by price desc
;

-- Display the first name, last name, and city name of all customers from Germany. 
-- The output columns should display as: “First Name,” “Last Name,” and “City.” 
-- The output should be sorted by “Last Name” (ascending).

select contact_firstname as First_Name,
contact_lastname as Last_Name,
city as City
from customers where country = "Germany" 
order by contact_lastname
;

-- Display each of the unique values of the status field in the orders table. 
-- The output should be sorted alphabetically, ascending.
select distinct status
from orders
order by status
;

-- Display all fields from the payments table for payments made on or after January 1, 2005.
-- The output should be sorted by the payment date from highest to lowest.
select * from payments
where payment_date >= '2005-01-01'
order by payment_date desc
;

-- Display the last Name, first Name, email address, and job title of all employees working out 
-- of the San Francisco office. The output should be sorted by “Last Name.”

select e.lastname as Last_Name,
e.firstname as First_Name,
e.email,
e.job_title as Job,
 from employees e, offices o 
 where e.office_id = o.id
 and o.city = "San Francisco"
 order by Last_Name
; 

-- Display the name, product line, scale, and vendor of all of the car products 
-- both classic and vintage. The output should display all vintage cars first 
-- (sorted alphabetically by name), 
-- and all classic cars last (also sorted alphabetically by name). 

select p.product_name, p.product_scale, p.product_vendor,
pl.product_line as Vintage_Classic_Models
from products p, productlines pl
where p.productline_id = pl.id
and pl.product_line = 'Vintage Cars' 
or pl.product_line = 'Classic Cars'
order by Vintage_Classic_Models desc
;



