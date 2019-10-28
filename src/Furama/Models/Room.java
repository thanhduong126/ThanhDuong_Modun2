package Furama.Models;

public class Room extends Service {
	private ServiceFreeforRoom serviceFreeforRoom;

	public Room() {
	}

	@Override
	public String showInfor() {
		return "Room: " + super.toString() +
				"\nDịch vụ miễn phí đi kèm: " + serviceFreeforRoom;
	}

	public Room(String id, String tenDichVu, int dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, ServiceFreeforRoom serviceFreeforRoom) {
		super(id, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
		this.serviceFreeforRoom = serviceFreeforRoom;
	}

	public ServiceFreeforRoom getServiceFreeforRoom() {
		return serviceFreeforRoom;
	}

	public void setServiceFreeforRoom(ServiceFreeforRoom serviceFreeforRoom) {
		this.serviceFreeforRoom = serviceFreeforRoom;
	}
}
