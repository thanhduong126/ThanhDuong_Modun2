package Furama.Models;

public abstract class Service {
	private String id;
	private String tenDichVu;
	private int dienTichSuDung;
	private double chiPhiThue;
	private int soLuongNguoiToiDa;
	private String kieuThue; //nam, thang ngay, gio


	public Service() {
	}

	public Service(String id, String tenDichVu, int dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue) {
		this.id = id;
		this.tenDichVu = tenDichVu;
		this.dienTichSuDung = dienTichSuDung;
		this.chiPhiThue = chiPhiThue;
		this.soLuongNguoiToiDa = soLuongNguoiToiDa;
		this.kieuThue = kieuThue;

	}

	public abstract String showInfor();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTenDichVu() {
		return tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	public int getDienTichSuDung() {
		return dienTichSuDung;
	}

	public void setDienTichSuDung(int dienTichSuDung) {
		this.dienTichSuDung = dienTichSuDung;
	}

	public double getChiPhiThue() {
		return chiPhiThue;
	}

	public void setChiPhiThue(double chiPhiThue) {
		this.chiPhiThue = chiPhiThue;
	}

	public int getSoLuongNguoiToiDa() {
		return soLuongNguoiToiDa;
	}

	public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
		this.soLuongNguoiToiDa = soLuongNguoiToiDa;
	}

	public String getKieuThue() {
		return kieuThue;
	}

	public void setKieuThue(String kieuThue) {
		this.kieuThue = kieuThue;
	}

	@Override
	public String toString() {
		return "ID: " + id +
				"\nTên dịch vụ: " + tenDichVu +
				"\nDiện tích sử dụng: " + dienTichSuDung +
				"\nChi Phi Thuê: " + chiPhiThue +
				"\nSố lượng người tối đa: " + soLuongNguoiToiDa +
				"\nKiểu thuê: " + kieuThue ;
	}
}
