package Database.CoSoDuLieuQuanHe
//lấy toàn bộ trường customer
//select * from customer
//
//lấy các trường customer_number + age + city_ country trong bảng customer
//select customer_number,age,city,country from customer
//
//lấy tất cả những khách hàng trong bảng customervới điều kiện là cột city="Huế"
//select * from customer where city= "Huế"
//
//lấy tất cả những khách hàng cột customer_first_name  = " nguyễn" trong bảng customer
//select * from customer where customer_first_name="Nguyễn"
//
//lấy tất cả những customer có cột city có chữ cái đầu tiên là n
//select * from customer where city like "n%"
//
//lấy tất cả những customer có cột city có chữ n
//select * from customer where city like "%n%"
//
//lấy tất cả các cột trong bảng customer có city là đà nẵng và huế
//select* from customer where city in ("Đà Nẵng","Huế")
