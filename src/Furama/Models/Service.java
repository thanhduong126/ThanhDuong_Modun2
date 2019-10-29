package Furama.Models;

public abstract class Service {
	private String id;
	private String tenDichVu;
	private float dienTichSuDung;
	private double chiPhiThue;
	private int soLuongNguoiToiDa;
	private String kieuThue; //nam, thang ngay, gio
	private String dichVuDiKem;
	public Service() {
	}

	public abstract String showInfor();
	public Service(String id, String tenDichVu, float dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuDiKem) {
		this.id = id;
		this.tenDichVu = tenDichVu;
		this.dienTichSuDung = dienTichSuDung;
		this.chiPhiThue = chiPhiThue;
		this.soLuongNguoiToiDa = soLuongNguoiToiDa;
		this.kieuThue = kieuThue;
		this.dichVuDiKem = dichVuDiKem;
	}

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

	public float getDienTichSuDung() {
		return dienTichSuDung;
	}

	public void setDienTichSuDung(float dienTichSuDung) {
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

	public String getDichVuDiKem() {
		return dichVuDiKem;
	}

	public void setDichVuDiKem(String dichVuDiKem) {
		this.dichVuDiKem = dichVuDiKem;
	}

	@Override
	public String toString() {
		return "ID: " + id +
				"\nTên dịch vụ: " + tenDichVu +
				"\nDiện tích sử dụng: " + dienTichSuDung +
				"\nChi Phi Thuê: " + chiPhiThue +
				"\nSố lượng người tối đa: " + soLuongNguoiToiDa +
				"\nKiểu thuê: " + kieuThue +"\nDịch vụ đi kèm: "+dichVuDiKem ;
	}
}
