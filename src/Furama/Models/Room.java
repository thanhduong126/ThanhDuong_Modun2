package Furama.Models;

public class Room extends Service {
	public Room() {
	}

	public Room(String id, String tenDichVu, float dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuDiKem) {
		super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue, dichVuDiKem);
	}

	@Override
	public String showInfor() {
		return "Room: " + super.toString();
	}

}

