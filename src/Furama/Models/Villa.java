package Furama.Models;

public class Villa extends Service {
	private String tieuChuanPhongVilla;
	private String tienNghiKhacVilla;
	private int soTangVilla;
	private float dienTichHoBoiVilla;

	public Villa() {
	}

	public Villa(String id, String tenDichVu, int dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhongVilla, String tienNghiKhacVilla, int soTangVilla, float dienTichHoBoiVilla) {
		super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
		this.tieuChuanPhongVilla = tieuChuanPhongVilla;
		this.tienNghiKhacVilla = tienNghiKhacVilla;
		this.soTangVilla = soTangVilla;
		this.dienTichHoBoiVilla = dienTichHoBoiVilla;
	}

	public String getTieuChuanPhongVilla() {
		return tieuChuanPhongVilla;
	}

	public void setTieuChuanPhongVilla(String tieuChuanPhongVilla) {
		this.tieuChuanPhongVilla = tieuChuanPhongVilla;
	}

	public String getTienNghiKhacVilla() {
		return tienNghiKhacVilla;
	}

	public void setTienNghiKhacVilla(String tienNghiKhacVilla) {
		this.tienNghiKhacVilla = tienNghiKhacVilla;
	}

	public int getSoTangVilla() {
		return soTangVilla;
	}

	public void setSoTangVilla(int soTangVilla) {
		this.soTangVilla = soTangVilla;
	}

	public float getDienTichHoBoiVilla() {
		return dienTichHoBoiVilla;
	}

	public void setDienTichHoBoiVilla(float dienTichHoBoiVilla) {
		this.dienTichHoBoiVilla = dienTichHoBoiVilla;
	}

	@Override
	public String showInfor() {
		return "Villa: " + super.toString() +
				"\nTiêu chuẩn phòng: " + tieuChuanPhongVilla +
				"\nTiện nghi khác: " + tienNghiKhacVilla +
				"\nSố tầng: " + soTangVilla +
				"\nDiện tích hồ bơi: " + dienTichHoBoiVilla;
	}


}
