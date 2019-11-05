package FuramaDatabase

-- Câu 2:
Select * from nhanvien
where ((HoTen like "H%") or (HoTen like "T%") or (HoTen like "K%")) and length(hoten)<=15;
-- Câu 3:
Select * from KhachHang
where (age >=18 and age<=50) and (diachi="Đà Nẵng" or diachi="Quảng Trị");
-- Câu4:
Select hoten,tenloaikhach, count(hopdong.idkhachhang) as 'solandat' from khachhang
inner join hopdong on khachhang.idkhachhang = hopdong.IDkhachhang
inner join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
where TenLoaiKhach="Diamond"
group by hoten
order by solandat asc;

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
