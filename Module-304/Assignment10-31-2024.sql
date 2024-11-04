-- I want to see all the employees that do not have any customers - subquery using not in

select * from employees where id  not in
(select distinct sales_rep_employee_id from customers where sales_rep_employee_id is not null )
order by id
;
  
-- I want to see all the customers that have not made an order - subquery using not in

select * from customers where id not in(
select distinct customer_id from orders
);

-- I want to see all of the products that have never been ordered - subquery using not in

select * from products where id not in(
select product_id from orderdetails);

-- I want to see all customers that have made an order that has more 
-- than 3 products in the order regardless of quantity
--  I think this can be done using a subquery in the having
     
	select * from customers where id in(
	select customer_id from orders  ord1 where ord1.id in (
    select order_id from (select distinct order_id, count(product_id) 
				from orderdetails  group by order_id 
                having count(product_id)>3) as temp));

-- I want to see any customer that has made an order greater than $50,000 - this subquery in having

select * from customers where id in (
	select distinct customer_id from orders o where o.id in(
		select order_id from(
			select order_id,sum(quantity_ordered*price_each) as total_price
									from orderdetails 
											group by order_id
											having total_price>50000
                                            ) as temp 
                                            ));

-- I want to see all orders and the number of products in that order 
-- and the total number of quantity ordered for that order .. 
-- HOWEVER .. I want the product count and the total quantity order done as 
-- subqueries in the select statement.    Do not use a  group by in the outer query

select * from (
select distinct order_id, 
count(product_id) as prod_count, 
sum(quantity_ordered) as tot_quantity
from orderdetails od, orders o  
where od.order_id = o.id
group by order_id
)as temp
;


-- Using a subquery as a table ... first create a query that 
-- shows the total number of orders by year .. group by year as a subtable.
-- And a second subtable query the total sales by year ...    
-- Then join both of these tables on year .. and the final output should be ...
--  year, total orders, total sales orderd by year
  
select yar1, orders_per_year,total_sale  
			from ((select year(order_date) as yar1 , 
				count(id) as orders_per_year 
				from orders
			group by year(order_date)) as tab1
inner join (select distinct year(order_date) as yar, 
						sum(quantity_ordered * price_each) as total_sale
						from orderdetails od inner join orders o
											on od.order_id = o.id
						group by year(order_date)
						order by total_sale desc) as tab2
on tab1.yar1 = tab2.yar);

  
 