package Furama.Models;

public class House extends Service {
	private String tieuChuanPhongHouse;
	private String tienNghiKhacHouse;
	private int soTangHouse;

	public House() {
	}

	@Override
	public String showInfor() {
		return "House: " + super.toString() +
				"\nTiêu chuẩn phòng: " + tieuChuanPhongHouse +
				"\nTiện nghi khác: " + tienNghiKhacHouse +
				"\nSố tầng: " + soTangHouse
				;
	}

	public House(String id, String tenDichVu, int dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhongHouse, String tienNghiKhacHouse, int soTangHouse) {
		super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
		this.tieuChuanPhongHouse = tieuChuanPhongHouse;
		this.tienNghiKhacHouse = tienNghiKhacHouse;
		this.soTangHouse = soTangHouse;
	}

	public String getTieuChuanPhongHouse() {
		return tieuChuanPhongHouse;
	}

	public void setTieuChuanPhongHouse(String tieuChuanPhongHouse) {
		this.tieuChuanPhongHouse = tieuChuanPhongHouse;
	}

	public String getTienNghiKhacHouse() {
		return tienNghiKhacHouse;
	}

	public void setTienNghiKhacHouse(String tienNghiKhacHouse) {
		this.tienNghiKhacHouse = tienNghiKhacHouse;
	}

	public int getSoTangHouse() {
		return soTangHouse;
	}

	public void setSoTangHouse(int soTangHouse) {
		this.soTangHouse = soTangHouse;
	}

}
