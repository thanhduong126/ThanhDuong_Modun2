package Database.ThietKeTaoCoSoDuLieu

//create table customer(
//customer_number int auto_increment primary key,
//fullname varchar(50) not null,
//address varchar(255) not null,
//email varchar(255)  unique,
//phone int(11)  unique,
//tran_number int,
//account_number int(10),
//account_id int
//-- foreign key(tran_number) references transactions(tran_number),
//-- foreign key(account_number) references account(account_number)
//);
//create table accounts(
//account_number int(10) primary key unique,
//account_type varchar(50) not null,
//account_date date ,
//amounts double not null,
//descriptions varchar(255) not null,
//account_id int,
//customer_number int
//-- foreign key (customer_number) references customer(customer_number),
//-- foreign key(account_id) references account_type(account_id)
//);
//
//create table transactions(
//tran_number int auto_increment primary key,
//account_number int(10) not null,
//tran_date date not null,
//amounts double not null,
//descriptions varchar(255)
//-- foreign key(account_number) references accounts(account_number),
//);
//
//create table account_type(
//account_id int auto_increment primary key,
//account_name varchar(50)
//);
//alter table customer
//add  foreign key(tran_number) references transactions(tran_number);
//
//alter table customer
//add foreign key(account_id) references account_type(account_id);
//
//alter table  transactions
//add foreign key(account_number) references accounts(account_number);
//
//
//alter table accounts
//add  foreign key(account_number) references accounts(account_number);
//
//alter table accounts
//add foreign key(account_id) references account_type(account_id);






