package Furama.Models;

public class ServiceFreeforRoom {
	private String tenDichVu;
	private String donVi;
	private double giaTien;

	public ServiceFreeforRoom() {
	}

	public ServiceFreeforRoom(String tenDichVu, String donVi, double giaTien) {
		this.tenDichVu = tenDichVu;
		this.donVi = donVi;
		this.giaTien = giaTien;
	}

	public String getTenDichVu() {
		return tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	public String getDonVi() {
		return donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	public double getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}

	@Override
	public String toString() {
		return "ServiceFreeforRoom: " +"\n"+
				"Tên dịch vụ: " + tenDichVu + '\n' +
				"Đơn vị: " + donVi + '\n' +
				"Giá tiền: " + giaTien ;
	}
}
