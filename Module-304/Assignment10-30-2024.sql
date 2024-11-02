-- which product did we sell the most of?   I would like to see the number of orders,
-- the total amount sold, and the product name

select max(quantity_ordered) from orderdetails;

select product_id, order_id ,quantity_ordered
from orderdetails
where quantity_ordered = 97;

select  count(order_id) ,(quantity_ordered* price_each) as total_amount_sold,product_id,product_name,quantity_ordered
from orderdetails, products
where orderdetails.product_id = products.id
group by order_id,total_amount_sold,product_id,product_name,quantity_ordered
order by quantity_ordered desc;


-- which product generated the most profit by year.  In the result I want to see the 
-- year, the product name, and the total profit.  order by year desc, profit desc

select year(o.order_date), p.product_name,
sum(od.quantity_ordered*(price_each - buy_price)) as total_profit
from products p, orderdetails od, orders o
where o.id = od.order_id
and od.product_id = p.id 
group by year(order_date),product_name
order by year(o.order_date) desc, total_profit desc;

-- which office is the most profitable?   
-- result should show the name of the office and the total profit for that office orderd by profit descending

select ofc.city, ofc.country, sum(od.quantity_ordered * (od.price_each - p.buy_price)) as total_profit
from offices ofc, employees e, customers c, 
orders ord, orderdetails od, products p
where ofc.id = e.office_id
and e.id = c.sales_rep_employee_id
and c.id = ord.customer_id
and ord.id = od.order_id
and od.product_id = p.id
group by ofc.city, ofc.country
order by total_profit desc;

-- Show me all the customers that have an outstanding balance due... 
-- would have to sum the payments for the customer and compare the total amount paid to the total amount purchased

select cust.id, cust.customer_name, ((select (sum(quantity_ordered * price_each)) 
from orders o,orderdetails od 
where o.id = od.order_id
and o.customer_id = cust.id) - (select sum(amount) from payments where customer_id = cust.id)) as amt_due 
from customers cust order by amt_due desc;

-- tony
SELECT 
c.customer_name AS Customer, 
SUM(od.quantity_ordered * od.price_each) AS Due, 
COALESCE(SUM(p.amount), 0) AS Paid, 
SUM(od.quantity_ordered * od.price_each) - COALESCE(SUM(p.amount), 0) AS Balance
FROM customers c
JOIN orders o on c.id = o.customer_id
JOIN orderdetails od ON o.id = od.order_id
LEFT JOIN payments p ON c.id = p.customer_id
GROUP BY c.id, c.customer_name
HAVING Balance > 0
ORDER BY Balance DESC;

-- kiran
select c.id, c.contact_firstname, c.contact_lastname, 
sum(quantity_ordered * price_each) as total_purchase, sum(pm.amount) as total_payment, 
if(sum(quantity_ordered * price_each) > sum(pm.amount),
(sum(quantity_ordered * price_each) - sum(pm.amount)), 'No outstanding' ) as outstanding_balance 
from customers c, payments pm, orderdetails od, orders o
where pm.customer_id = c.id
	and o.customer_id = c.id
    and od.order_id = o.id
group by c.id
order by c.id;







