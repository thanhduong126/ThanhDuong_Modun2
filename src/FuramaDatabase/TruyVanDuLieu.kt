create table ViTri(
ID_ViTri int auto_increment primary key not null,
tenvitri varchar(45)
);
create table TrinhDo(
ID_TrinhDo int auto_increment primary key not null,
TrinhDo varchar(45)
);
create table BoPhan(
ID_BoPhan int auto_increment primary key not null,
TenBoPhan varchar(45)
);
create table LoaiKhach(
IDLoaiKhach int auto_increment primary key not null,
TenLoaiKhach varchar(45)
);

create table KieuThue(
IDKieuThue int auto_increment primary key not null,
TenKieuThue varchar(45),
Gia double
);

create table LoaiDichVu(
IDLoaiDichVu int auto_increment primary key not null,
TenLoaiDichVu varchar(45)
);

create table DichVuDiKem(
IDDichVuDiKem int auto_increment primary key not null,
TenDichVuDiKem varchar(45),
Gia double,
Donvi varchar(45),
TrangThaiKhaDung varchar(45)
);

create table DichVu(
IDDichVu int auto_increment primary key not null,
TenDichVu varchar(45),
DienDich float,
SoTang int,
SoNguoiToiDa int,
ChiPhiThue double,
IDKieuThue int,
IDLoaiDichVu int,
TrangThai varchar(45),
foreign key (IDKieuThue) references KieuThue(IDKieuThue),
foreign key (IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);

create table KhachHang(
IDKhachHang int auto_increment primary key not null,
IDLoaiKhach int,
HoTen varchar(45),
NgaySinh date,
SoCMND varchar(45),
SDT int(20),
Email varchar(45),
DiaChi varchar(45),
age int,
foreign key(IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);
-------------
create table NhanVien(
IDNhanVien int auto_increment primary key not null,
HoTen varchar(45),
ID_ViTri int,
ID_TrinhDo int,
ID_BoPhan int,
NgaySinh date,
SoCMND varchar(45),
Luong double,
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
foreign key (ID_ViTri) references ViTri(ID_ViTri),
foreign key (ID_TrinhDo) references TrinhDo(ID_TrinhDo),
foreign key (ID_BoPhan) references BoPhan(ID_BoPhan)
);

create table HopDong(
IDHopDong int auto_increment primary key not null,
IDNhanVien int,
IDKhachHang int,
IDDichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc double,
TongTien double,
foreign key(IDNhanVien) references NhanVien(IDNhanVien),
foreign key(IDKhachHang) references Khachhang(IDKhachHang),
foreign key(IDDichVu) references DichVu(IDDichVu)
);
create table HopDongChiTiet(
ID_HopDongChiTiet int auto_increment primary key not null,
IDHopDong int,
IDDichVuDiKem int,
soluong int,
foreign key (IDHopDong) references HopDong(IDHopDong),
foreign key (IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);

alter table HopDongChiTiet
modify column soluong double