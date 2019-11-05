package FuramaDatabase

insert into TrinhDo(TrinhDo) values ("Đại Học"),("Cao Đẳng"),("Trung Cấp"),("Tốt Nghiệp Cấp 3");
insert into ViTri(tenvitri) values ("Tổng Giám Đốc"),("Trưởng Phòng"),("Phó Giám Đốc"),("Phó Trưởng Phòng"),("Kế Toán");
insert into BoPhan(TenBoPhan) values ("MarketTing"), ("Sale"),("Hành Chính"),("Kho"),("Nhân Sự"),("Văn Phòng");
insert into KieuThue(TenKieuThue,gia) values ("Vip",300000),("Nomal",200000);
insert into LoaiDichVu(TenLoaiDichVu) values ("Vip"),("Nomal"),("Hot");
insert into DichVuDikem(TenDichVuDiKem,Gia) values ("Karaoke",150000),("Food",200000),("Car",120000),("Drink",180000);
insert into LoaiKhach(TenLoaiKhach) values ("Diamond"),("Platium"),("Gold");

insert into KhachHang(IDLoaiKhach,Hoten,NgaySinh,SoCMND,SDT,Email,DiaChi,age)
values (1,"Hoàng","1994/10/10",32423423,2321432,"hoang@gmail.com","Quảng Trị",42),
(3,"Tiên","1995/10/10",3124234,2342342,"tien@gmail.com","Đà Nẵng",20),
(2,"Kiên","1992/06/04",2345345,324234,"kien@gmail.com","Huế",30),
(1,"Dương","1995/09/02",32423423,324234,"duong@gmail.com", "Huế",18),
(3,"Thanh","1993/05/02",324233443,432434,"thanh@gmail.com", "Đà Nẵng",51);

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
values (1,5,2,"2002/01/01","2006/02/06",600000,6000000),
(2,3,1,"2010/02/09","2018/04/04",400000,7000000),
(3,2,3,"2018/02/12","2019/01/08",800000,9000000),
(4,4,2,"2018/09/11","2016/04/09",500000,6500000),
(5,1,2,"2019/04/11","2019/09/09",600000,5500000),
(6,5,1,"2019/09/11","2019/10/15",500000,6500000),
(4,4,3,"2018/02/02","2018/10/09",700000,5500000),
(3,3,2,"2019/06/06","2019/10/09",600000,7500000);

insert into HopDongChiTiet(IDHopDong,IDDichVuDiKem,soluong)
values (17,4,5),
(18,1,1),
(20,2,4),
(19,3,3),
(21,4,2),
(24,3,1),
(17,2,5);

