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

insert into dichvu(TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,IDKieuThue,IDLoaiDichVu,TrangThai)
values ("Villa",30,4,10,300000,1,2,"Vẫn còn"),
("House",20,6,12,400000,2,1,"Vẫn còn"),
("Room",35,8,8,800000,3,1,"Vẫn còn");