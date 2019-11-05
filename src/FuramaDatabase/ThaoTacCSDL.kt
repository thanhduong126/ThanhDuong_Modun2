package FuramaDatabase

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

