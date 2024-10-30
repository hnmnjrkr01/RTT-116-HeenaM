-- lets calculate the total profit for an order 10100
select p.product_name, p.buy_price, od.quantity_ordered, od.price_each
from products p , orderdetails od
where p.id = od.product_id and od.order_id = 10100;

-- lets cal total profit for all orders
select p.product_name, p.buy_price, od.quantity_ordered, od.price_each as sales_price, 
(price_each - buy_price) as product_margin,
quantity_ordered * (price_each - buy_price) as line_item_margin
from products p, orderdetails od
where p.id = od.product_id AND od.order_id = 10100;


-- lets cal total profit for all orders group by
select od.order_id, sum(quantity_ordered*(price_each - buy_price)) as total_sale_price
from products p, orderdetails od
where p.id = od.product_id 
group by od.order_id;

select od.order_id, sum(quantity_ordered*(price_each - buy_price)) as total_sale_price
from products p, orderdetails od, orders o
where p.id = od.product_id and od.order_id = o.id
group by year(o.order_date), month(o.order_date);

select year(o.order_date), month(o.order_date), sum(quantity_ordered * (price_each - buy_price)) as total_profit
from products p, orderdetails od, orders o
where p.id = od.product_id and od.order_id = o.id
group by year(o.order_date), month(o.order_date);





select now(); select current_timestamp();

select * from orders where comments = null;
select * from orders where comments is null;


-- SBA Question
SELECT product_name, buy_price , 
CASE
	WHEN buy_price > 80 AND buy_price <=  50 THEN "LOW PRICE"
	WHEN buy_price >= 50 AND buy_price <= 100 THEN "Medium Price"
	WHEN buy_price > 100 AND buy_price <= 200 THEN "high Price"
ELSE "Out of our rang" END AS price_status 
FROM products 
ORDER BY buy_price DESC;

select * from customers where city in('las vegas','nantes','frankfurt');

select * from orders where customer_id in (select id from customers where id in(103,112,119));

select * from orders where customer_id in (select id from customers where customer_name like 'A%');

select * from orders where customer_id not in (select id from customers where customer_name like 'A%');

select o.id, o.order_date from 
orders o ,(select id from customers where customer_name like 'A%') c 
where o.customer_id = c.id
group by o.id, o.order_date ;



