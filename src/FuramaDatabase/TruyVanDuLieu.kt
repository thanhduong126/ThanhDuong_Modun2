-- Câu 2:
Select * from nhanvien
where ((HoTen like "H%") or (HoTen like "T%") or (HoTen like "K%")) and length(hoten)<=15;
-- Câu 3:
Select * from KhachHang
where (age >=18 and age<=50) and (diachi="Đà Nẵng" or diachi="Quảng Trị");
-- Câu4:
Select hoten,tenloaikhach,count(hopdong.idkhachhang) as 'solandat' from khachhang
inner join hopdong on khachhang.idkhachhang = hopdong.IDkhachhang
inner join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
where TenLoaiKhach="Diamond"
group by hoten
order by solandat asc;