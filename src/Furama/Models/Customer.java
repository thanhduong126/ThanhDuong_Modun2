package Furama.Models;

public class Customer implements Comparable<Customer> {
	private String iD;
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	private String soCmnd;
	private int soDt;
	private String email;
	private String loaiKhach;
	private String diaChi;

	public Customer() {
	}

	public Customer(String id, String hoTen, String ngaySinh, String gioiTinh, String soCmnd, int soDt, String email, String loaiKhach, String diaChi) {
		this.iD = id;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soCmnd = soCmnd;
		this.soDt = soDt;
		this.email = email;
		this.loaiKhach = loaiKhach;
		this.diaChi = diaChi;
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

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoCmnd() {
		return soCmnd;
	}

	public void setSoCmnd(String soCmnd) {
		this.soCmnd = soCmnd;
	}

	public int getSoDt() {
		return soDt;
	}

	public void setSoDt(int soDt) {
		this.soDt = soDt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoaiKhach() {
		return loaiKhach;
	}

	public void setLoaiKhach(String loaiKhach) {
		this.loaiKhach = loaiKhach;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String showInfor() {
		return "Customer: " +
				"\nID: " + iD +
				"\nHọ tên: " + hoTen +
				"\nNgày sinh: " + ngaySinh +
				"\nGiới tính: " + gioiTinh +
				"\nSố CMND: " + soCmnd +
				"\nSố điện thoại: " + soDt +
				"\nEmail: " + email +
				"\nLoại khách hàng: " + loaiKhach +
				"\nĐịa chỉ: " + diaChi;
	}

	@Override
	public int compareTo(Customer customer) {
		int kq = this.getHoTen().compareTo(customer.getHoTen());
		// tên giống nhau thì so sánh tiếp địa chỉ
		if(kq!=0)
			return kq;
		kq=this.getDiaChi().compareTo(customer.getDiaChi());
		return kq;
	}
}
