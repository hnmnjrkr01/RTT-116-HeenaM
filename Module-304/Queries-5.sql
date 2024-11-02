select sum(amount) from payments where customer_id = 103;

select cust.id, cust.customer_name, ((select (sum(quantity_ordered * price_each)) 
from orders o,orderdetails od 
where o.id = od.order_id
and o.customer_id = cust.id) - (select sum(amount) from payments where customer_id = cust.id)) as amt_due 
from customers cust order by amt_due desc;

select sum(amount) from payments where customer_id = 141; -- 715738.98

select sum(od.quantity_ordered * od.price_each) from orders o inner join orderdetails od
on o.id = od.order_id where customer_id = 141; -- 820689.54

 select min(amount) as min_lot, max(amount) as max_lot, avg(amount) as avg_amt,
  count(amount)
  from payments where customer_id=103







