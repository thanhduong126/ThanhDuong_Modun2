package Database.ThietKeTaoCoSoDuLieu
//
//create table customers(
//id int auto_increment primary key,
//name varchar(50),
//address varchar(255),
//email varchar(255)
//);
//
//create table orders(
//orderid int auto_increment,
//staff varchar(50),
//customer_id int,
//primary key(orderid),
//foreign key( customer_id) references customer(id)
//);
//
//-- cách định nghĩa khóa ngoại khác
//-- CREATE TABLE orders(
//--    orderid INT AUTO_INCREMENT PRIMARY KEY,
//--    staff VARCHAR(50),
//--    customer_id INT REFERENCES customers(id)
//-- );