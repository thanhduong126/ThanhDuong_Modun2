package Database.ThietKeTaoCoSoDuLieu

//create table contacts(
//contact_id int(11) not null Auto_increment,
//last_name varchar(50) not null,
//first_name varchar(50),
//birthday date,
//constraint contacts_pk primary key(contact_id)
//);

//create table suppliers(
//supplier_id int(11) not null auto_increment,
//supplier_name varchar(50) not null,
//account_rep varchar(30) not null default "TBD",
//constraint suppliers_pk primary key(supplier_id)
//);

//delete table
//drop table suppliers,contacts;

//thêm column acccount_vip vào bảng suppliers
//alter table suppliers add acccount_vip varchar(50);
//
//sửa cấu trúc: acccount_vip chuyển sang kiểu int(10)
//alter table suppliers modify acccount_vip int(10);
//
//thay đổi tên column và thay đổi cấu trúc thành int(20)
//alter table suppliers change column acccount_vip account_vip
//int(20)
//ĐỔi tên column
//alter table suppliers
//rename to supperman