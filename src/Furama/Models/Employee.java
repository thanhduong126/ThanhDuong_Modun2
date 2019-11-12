package Furama.Models;

public class Employee {
	private String hoTen;
	private String ngaySinh;
	private String soCmnd;
	private int soDienThoai;
	private String email;
	private String trinhDo;
	private String viTri;
	private double luong;

	public Employee() {
	}

	public Employee(String hoTen, String ngaySinh, String soCmnd, int soDienThoai, String email, String trinhDo, String viTri, double luong) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.soCmnd = soCmnd;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.trinhDo = trinhDo;
		this.viTri = viTri;
		this.luong = luong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoCmnd() {
		return soCmnd;
	}

	public void setSoCmnd(String soCmnd) {
		this.soCmnd = soCmnd;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public String getViTri() {
		return viTri;
	}

	public void setViTri(String viTri) {
		this.viTri = viTri;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	@Override
	public String toString() {
		return "Họ tên: " + hoTen + '\'' +
				"\nNgày sinh: " + ngaySinh + '\'' +
				"\nSố CMND: " + soCmnd + '\'' +
				"\nSố điện thoại: " + soDienThoai +
				"\nEmail: " + email + '\'' +
				"\nTrình độ: " + trinhDo + '\'' +
				"\nVị trí: " + viTri + '\'' +
				"\nLương: " + luong;
	}
}

