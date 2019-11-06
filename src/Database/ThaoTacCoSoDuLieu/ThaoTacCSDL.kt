package Database.ThaoTacCoSoDuLieu

select customerNumber,customerName from customers
where contactFirstName like "%A%";

select * from customers
where customerNumber between 103 and 150;

select * from customers
where contactLastName in("King","Nelson");

select * from customers
where country="USA" or country="France";

select customerName,phone,city,country from customers
order by customerName desc;

select customernumber, contactlastname, contactfirstname, phone, city
from customers
order by contactfirstname,contactLastName asc;

select count(country) as 'Số khách hàng số ở France'
from customers
where city = 'Nantes';

update customers
set customerName="Hoang Thanh Duong"
where customerNumber = "103";

select status from orders
group by status;

select status, COUNT(*) as 'So luong status'
from orders
group by status;

select status, sum(quantityOrdered*priceEach) as amount
from orders
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
group by status;

select orderNumber, sum(quantityOrdered * priceEach) as total
from orderdetails
group by orderNumber;

select year(orderDate) as year,sum(quantityOrdered*priceEach) as total
from orders
inner join orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003;
