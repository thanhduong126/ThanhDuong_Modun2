package Furama.Models;

public class ServiceForAll {
	private String tenDichVu;

	public ServiceForAll() {
	}
	public ServiceForAll(String tenDichVu) {
		this.tenDichVu = tenDichVu;

	}

	public String getTenDichVu() {
		return tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}
	@Override
	public String toString() {
		return "ServiceForAll: " +"\n"+
				"Tên dịch vụ: " + tenDichVu;

	}
}
