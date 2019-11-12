//-- Câu 2:
//Select * from nhanvien
//where ((HoTen like "H%") or (HoTen like "T%") or (HoTen like "K%")) and length(hoten)<=15;
//-- Câu 3:
//Select * from KhachHang
//where (age >=18 and age<=50) and (diachi="Đà Nẵng" or diachi="Quảng Trị");
//-- Câu4:
//Select hoten,tenloaikhach,count(hopdong.idkhachhang) as 'solandat' from khachhang
//inner join hopdong on khachhang.idkhachhang = hopdong.IDkhachhang
//inner join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
//where TenLoaiKhach="Diamond"
//group by hoten
//order by solandat asc;
//-- Câu 5:
//select khachhang.IDKhachHang,HoTen,loaikhach.TenLoaiKhach,hopdong.IDHopDong,dichvu.TenDichVu,NgayLamHopDong,NgayKetThuc,sum(dichvu.ChiPhiThue + hopdongchitiet.soluong*dichvudikem.Gia) as Tongtien
//from hopdong
//right join khachhang on hopdong.IDKhachHang=khachhang.IDKhachHang
//left join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
//left join dichvu on hopdong.IDDichVu=dichvu.IDDichVu
//left join loaidichvu on dichvu.IDLoaiDichVu=loaidichvu.IDLoaiDichVu
//left join hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
//left join dichvudikem on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
//group by khachhang.IDKhachHang;
//
//-- Câu 6:
//select dichvu.IDDichVu,dichvu.TenDichVu,dichvu.DienDich,dichvu.ChiPhiThue,loaidichvu.TenLoaiDichVu
//from dichvu
//inner join loaidichvu on dichvu.IDLoaiDichVu=loaidichvu.IDLoaiDichVu
//where not exists ( select hopdong.NgayLamHopDong from hopdong where (hopdong.NgayLamHopDong between "2019-01-01" and "2019-03-01")
//and dichvu.IDDichVu=hopdong.IDDichVu);
//
//-- Câu 7:
//select dichvu.IDDichVu,dichvu.TenDichVu,dichvu.DienDich,dichvu.SoNguoiToiDa,dichvu.ChiPhiThue,loaidichvu.TenLoaiDichVu
//from dichvu
//inner join loaidichvu on loaidichvu.IDLoaiDichVu=dichvu.IDLoaiDichVu
//where exists(select hopdong.IDHopDong from hopdong where year (hopdong.NgayLamHopDong)="2018" and hopdong.IDDichVu=dichvu.IDDichVu)
//and not exists(select hopdong.IDHopDong from hopdong where year(hopdong.NgayLamHopDong)="2019" and hopdong.IDDichVu=dichvu.IDDichVu);
//
//
//-- Câu 8:
//-- cách 1>>>
//select distinct khachhang.HoTen from khachhang;
//-- cách 2>>>
//select khachhang.HoTen from khachhang group by khachhang.HoTen;
//-- cách 3>>>
//select khachhang.HoTen from khachhang union select khachhang.HoTen from khachhang;
//-- Câu 9
//select meses.month , count(month(NgayLamHopDong)) as sokhachhangdangki
//FROM
//(
//SELECT 1 AS MONTH
//UNION SELECT 2 AS MONTH
//UNION SELECT 3 AS MONTH
//UNION SELECT 4 AS MONTH
//UNION SELECT 5 AS MONTH
//UNION SELECT 6 AS MONTH
//UNION SELECT 7 AS MONTH
//UNION SELECT 8 AS MONTH
//UNION SELECT 9 AS MONTH
//UNION SELECT 10 AS MONTH
//UNION SELECT 11 AS MONTH
//UNION SELECT 12 AS MONTH
//) as meses
//left join hopdong on month(hopdong.NgayLamHopDong) = meses.month
//left join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
//where year(hopdong.NgayLamHopDong) = '2019' or year(hopdong.NgayLamHopDong) is null or month(hopdong.NgayLamHopDong) is null
//group by meses.month
//order by meses.month;
//-- Câu 10:
//Select hopdong.IDHopDong,hopdong.NgayLamHopDong,hopdong.NgayKetThuc,hopdong.TienDatCoc,count(hopdongchitiet.ID_HopDongChiTiet) as SoLuongDichVuDiKem
//from hopdong
//inner join hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
//group by IDHopDong;
//
//-- Câu 11:
//select * from khachhang
//inner join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
//where TenLoaiKhach="Diamond" and ( DiaChi="Vinh" or DiaChi="Quãng Ngãi");
//
//-- Câu 12: problem
//select hopdong.IDHopDong,nhanvien.HoTen,khachhang.HoTen,khachhang.SDT,dichvu.Tendichvu,count(hopdongchitiet.IDDichVuDiKem) as solansudung
//from hopdong
//inner join nhanvien on hopdong.IDNhanVien=nhanvien.IDNhanVien
//inner join khachhang on hopdong.IDKhachHang=khachhang.IDKhachHang
//inner join dichvu on dichvu.IDDichVu=hopdong.IDDichVu
//inner join hopdongchitiet on hopdong.IDHopDong =hopdongchitiet.IDHopDong
//where not exists(select hopdong.IDHopDong where hopdong.NgayLamHopDong between "2019-01-01" and " 2019-06-31")
//and exists(select hopdong.IDHopDong where hopdong.NgayLamHopDong between "2019-09-01" and "2019-12-31");
//
//-- Câu 13:
//select dichvudikem.TenDichVuDiKem,hopdong.idhopdong,count( hopdongchitiet.IDDichVuDiKem) as solan from dichvudikem
//inner join hopdongchitiet on hopdongchitiet.iddichvudikem = dichvudikem.iddichvudikem
//inner join hopdong on hopdong.idhopdong = hopdongchitiet.idhopdong
//where hopdongchitiet.IDDichVuDiKem >=1
//group by hopdongchitiet.IDDichVuDiKem
//having count( hopdongchitiet.IDDichVuDiKem) >=all( select max(solan) from(select dichvudikem.TenDichVuDiKem,hopdong.idhopdong,count( hopdongchitiet.IDDichVuDiKem) as 'solan' from dichvudikem
//inner join hopdongchitiet on hopdongchitiet.iddichvudikem = dichvudikem.iddichvudikem
//inner join hopdong on hopdong.idhopdong = hopdongchitiet.idhopdong
//where hopdongchitiet.IDDichVuDiKem >=1
//group by hopdongchitiet.IDDichVuDiKem) tmp);
//
//-- Câu 14:
//select hopdong.IDHopDong,loaidichvu.TenLoaiDichVu,dichvudikem.TenDichVuDiKem,count(hopdongchitiet.IDDichVuDiKem) as solansudung
//from hopdong
//inner join loaidichvu on hopdong.IDDichVu = loaidichvu.IDLoaiDichVu
//inner join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
//inner join dichvudikem on dichvudikem.IDDichVuDiKem=hopdongchitiet.IDDichVuDiKem
//group by dichvudikem.TenDichVuDiKem having solansudung=1;
//
//-- Câu 15: problem
//select nhanvien.IDNhanVien,nhanvien.HoTen,nhanvien.SDT,nhanvien.DiaChi,trinhdo.TrinhDo,bophan.TenBoPhan,count(hopdong.IDNhanVien) as solantaohopdong
//from nhanvien inner join trinhdo on trinhdo.ID_TrinhDo=nhanvien.ID_TrinhDo
//inner join bophan on bophan.ID_BoPhan=nhanvien.ID_BoPhan
//inner join hopdong on hopdong.IDNhanVien=nhanvien.IDNhanVien
//where hopdong.NgayLamHopDong between "2016-01-01" and "2019-21-31"
//group by nhanvien.HoTen
//having solantaohopdong<4;
//
//-- Câu 16: Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
//delete from nhanvien where not exists(select nhanvien.IDNhanVien from hopdong
//where hopdong.NgayLamHopDong between "2017-01-01" and "2019-12-31" and hopdong.IDNhanVien= nhanvien.IDNhanVien);
//
//-- Câu 17:
//update khachhang,(select hopdong.IDKhachHang as id, sum(hopdong.TongTien) as Tongtien from hopdong
//where year(hopdong.NgayLamHopDong)=2019
//group by hopdong.IDKhachHang
//having tongtien>10000000) as temp set khachhang.IDLoaiKhach=(select loaikhach.IDLoaiKhach from loaikhach where loaikhach.TenLoaiKhach="Diamond")
//where khachhang.IDLoaiKhach=(select loaikhach.IDloaikhach from loaikhach where loaikhach.TenLoaikhach="Platium")
//and temp.id=khachhang.IDKhachHang;
//-- Câu 18:
//delete khachhang,hopdong,hopdongchitiet from khachhang inner join hopdong on khachhang.IDKhachHang= hopdong.IDKhachHang
//inner join hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
//where not exists(select hopdong.IDHopDong where year(hopdong.NgayLamHopDong)>"2016" and khachhang.IDKhachHang=hopdong.IDKhachHang);
//-- Câu 19:
//update dichvudikem inner join (select dichvudikem.TenDichVuDiKem as TenDichVuDiKem
//from hopdongchitiet inner join dichvudikem on dichvudikem.IDDichVuDiKem=hopdongchitiet.IDDichVuDiKem
//group by dichvudikem.IDDichVuDiKem
//having count(hopdongchitiet.IDDichVuDiKem)>3) as temp set dichvudikem.Gia=dichvudikem.Gia*2 where dichvudikem.TenDichVuDiKem=temp.TenDichVuDiKem;
//-- Câu 20:
//select nhanvien.IDNhanVien as ID, nhanvien.HoTen,nhanvien.Email,nhanvien.SDT,nhanvien.NgaySinh,nhanvien.DiaChi,"nhanvien" as FromTable
//from nhanvien
//union all
//select khachhang.IDKhachHang as ID,khachhang.HoTen,khachhang.Email,khachhang.SDT,khachhang.NgaySinh,khachhang.DiaChi,"khachhang" as FromTable
//from khachhang;
//
//
//
//
//
//
//
//
//
//
//
