package FuramaDatabase

insert into TrinhDo(TrinhDo) values ("Đại Học"),("Cao Đẳng"),("Trung Cấp"),("Tốt Nghiệp Cấp 3");
insert into ViTri(tenvitri) values ("Tổng Giám Đốc"),("Trưởng Phòng"),("Phó Giám Đốc"),("Phó Trưởng Phòng"),("Kế Toán");
insert into BoPhan(TenBoPhan) values ("MarketTing"), ("Sale"),("Hành Chính"),("Kho"),("Nhân Sự"),("Văn Phòng");
insert into KieuThue(TenKieuThue,gia) values ("Vip",300000),("Nomal",200000);
insert into LoaiDichVu(TenLoaiDichVu) values ("Vip"),("Nomal"),("Hot");
insert into DichVuDikem(TenDichVuDiKem,Gia) values ("Karaoke",150000),("Food",200000),("Car",120000),("Drink",180000);
insert into LoaiKhach(TenLoaiKhach) values ("Cao cấp"),("Trung Cấp"),("Bình Thường");

insert into KhachHang(IDLoaiKhach,Hoten,NgaySinh,SoCMND,SDT,Email,DiaChi)
values (1,"Hoàng","1994/10/10",32423423,2321432,"hoang@gmail.com","Quảng Trị"),
(3,"Tiên","1995/10/10",3124234,2342342,"tien@gmail.com","Đà Nẵng"),
(2,"Kiên","1992/06/04",2345345,324234,"kien@gmail.com","Huế"),
(1,"Dương","1995/09/02",32423423,324234,"duong@gmail.com", "Huế"),
(3,"Thanh","1993/05/02",324233443,432434,"thanh@gmail.com", "Đà Nẵng");

insert into dichvu(TenDichVu,DienDich,SoTang,SoNguoiToiDa,ChiPhiThue,IDKieuThue,IDLoaiDichVu,TrangThai)
values ("Villa",30,4,10,300000,1,2,"Vẫn còn"),
("House",20,6,12,400000,2,1,"Vẫn còn"),
("Room",35,8,8,800000,1,3,"Vẫn còn");

insert into NhanVien(HoTen,ID_ViTri,ID_TrinhDo,ID_BoPhan,NgaySinh,SoCMND,Luong,SDT,Email,DiaChi)
values ("Thiên",1,2,2,"1994/08/06",3245234,6000000,12312312,"thien@gmail.com","Huế"),
("Kiên",4,3,6,"1994/09/01",32345234,7000000,64512312,"kien@gmail.com","Đà Nẵng"),
("Hùng",3,2,5,"1995/05/04",435345234,6500000,35345342,"hung@gmail.com","Quảng Trị"),
("An",1,2,4,"1990/10/02",5756234,6500000,35345342,"an@gmail.com","Quảng Nam"),
("Ji Jeon",2,3,3,"1997/01/02",23423234,7500000,3453445342,"jijeon@gmail.com","Đà Nẵng"),
("Jaya",5,1,3,"1997/01/02",4534234,8500000,56455342,"jaya@gmail.com","Quảng Bình");

insert into HopDong(IDNhanVien,IDKhachHang,IDDichVu,NgayLamHopDong,NgayKetThuc,TienDatCoc,TongTien)
values (7,6,4,"2002/01/01","2006/02/06",6000000,60000000),
(12,10,5,"2010/08/09","2018/04/04",4000000,70000000),
(9,6,6,"2011/06/12","2019/01/08",8000000,90000000),
(8,6,4,"2007/09/11","2016/04/09",5000000,65000000),
(7,7,6,"2007/09/11","2017/01/09",5000000,65000000),
(10,8,5,"2005/02/02","2018/10/09",7000000,55000000),
(11,9,4,"2004/06/06","2019/10/09",6000000,75000000);

insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,soluong)
values (8,4,5),
(14,1,1),
(13,2,4),
(12,3,3),
(11,4,2),
(9,3,1),
(10,2,5);