package Furama.Controllers;

import Furama.Commons.FuncWriteAndReadFileCSV;
import Furama.Expression.ExpressionCustomer;
import Furama.Expression.ExpressionCustomerImpl;
import Furama.Expression.ExpressionServiceImpl;
import Furama.Models.*;

import java.util.*;
import java.util.regex.Pattern;

public class MainController {
	static Scanner scanner = new Scanner(System.in);

	public static void menuFurama() {
		displayMainMenu();
		int choose = scanner.nextInt();
		while (choose != 0) {
			switch (choose) {
				case 1:
					menuAddServices();
					break;
				case 2:
					showServices();
					break;
				case 3:
					addNewCustomer();
					break;
				case 4:
					showInformationCustomer();
				case 5:
					showInformationCustomer();
					displayBooking();

					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Không có trong choose");
					break;
			}
			displayMainMenu();
			choose = scanner.nextInt();
		}
	}

	public static void menuAddServices() {
		disPlayManuService();
		int choose = scanner.nextInt();
		while (choose != 0) {
			switch (choose) {
				case 1:
					addNewVilla();
					break;
				case 2:
					addNewHouse();
					break;
				case 3:
					addNewRoom();
					break;
				case 4:
					menuFurama();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Enter the wrong choice!");
					break;
			}
			disPlayManuService();
			choose = scanner.nextInt();

		}
	}

	public static void showServices() {
		disPlayService();
		int choose = scanner.nextInt();
		while (choose != 0) {
			switch (choose) {
				case 1:
					showAllVilla();
					break;
				case 2:
					showAllHouse();
					break;
				case 3:
					showAllRoom();
					break;
				case 4:
					menuFurama();
				case 0:
					System.exit(0);
				default:
					System.out.println("Enter the wrong choice!");
					break;
			}
			disPlayService();
			choose = scanner.nextInt();
		}
	}
	public static void displayBooking(){
		System.out.println("1.Booking Villa");
		System.out.println("2.Booking  House");
		System.out.println("3.Booking  Room");
	}

	public static void displayMainMenu() {
		System.out.println("Choose the function you want to use!");
		System.out.println("1.Add New Services");
		System.out.println("2.Show Services");
		System.out.println("3.Add New Customer");
		System.out.println("4.Show Information Customer");
		System.out.println("5.Add New Booking Resort ");
		System.out.println("6.Exit");
	}

	public static void disPlayManuService() {
		System.out.println("Choose the function you want to use!");
		System.out.println("1.Add New Villa");
		System.out.println("2.Add New House");
		System.out.println("3.Add New Room");
		System.out.println("4.Back to Manu");
		System.out.println("5.Exit");
	}

	public static void disPlayService() {
		System.out.println("Choose the function you want to use!");
		System.out.println("1.Show All Villa");
		System.out.println("2.Show All House");
		System.out.println("3.Show All Room");
		System.out.println("4.Back To Manu");
	}

	public static void setAddService(Service service) {
		ExpressionServiceImpl expressionService = new ExpressionServiceImpl();
		boolean flag = false;
		service.setId(UUID.randomUUID().toString().replace("-", ""));
		scanner.nextLine();
		while (!flag) {
			System.out.println("Nhập tên dịch vụ: ");
			String checkName = scanner.nextLine();
			if (Pattern.matches("^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", checkName)) {
				service.setTenDichVu(checkName);
				flag = true;
			} else {
				System.out.println("Erro!");
				flag = false;
			}
		}
		System.out.println("---------------------");

		do {
			try {
				flag = false;
				System.out.println("Nhập vào diện tích: ");
				float area = scanner.nextFloat();
				expressionService.checkDienTichSuDungVaDienTichHoBoi(area);
				service.setDienTichSuDung(area);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Giá trị nhập vào phải lớn hơn 30." + "\n" + "Lỗi: " + ex.getMessage());
			}
		} while (!flag);
		System.out.println("---------------------------");
		do {
			try {
				flag = false;
				System.out.println("Nhập chi phí thuê: ");
				int chiPhiThue = scanner.nextInt();
				expressionService.checkChiPhiThue(chiPhiThue);
				service.setChiPhiThue(chiPhiThue);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Lỗi: " + ex.getMessage());
			}
		} while (!flag);
		System.out.println("---------------------------");
		do {
			try {
				flag = false;
				System.out.println("Nhập số người tối đa: ");
				int soNguoiToiDa = scanner.nextInt();
				expressionService.checkSoLuongNguoiToiDa(soNguoiToiDa);
				service.setSoLuongNguoiToiDa(soNguoiToiDa);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Lưu ý tối đa chỉ 20 người!" + ex.getMessage());
			}
		} while (!flag);
		scanner.nextLine();
		System.out.println("---------------------------");
		System.out.println("Kiểu thuê: ");
		service.setKieuThue(scanner.nextLine());
		do {
			try {
				flag = false;
				System.out.println("Dịch vụ đi kèm gồm có: massage,karaoke,food,drink,car!");
				System.out.println("Hãy nhập một trong những dịch vụ này!");
				String dichVuDiKem = scanner.nextLine();
				expressionService.getDichVuDiKem(dichVuDiKem);
				service.setDichVuDiKem(dichVuDiKem);
				flag = true;
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		} while (!flag);
	}

	public static void addNewVilla() {
		ExpressionServiceImpl expressionService = new ExpressionServiceImpl();
		Service villa = new Villa();
		setAddService(villa);
		boolean flag = false;
		while (!flag) {
			System.out.println("Tiêu chuẩn phòng: ");
			String checkName = scanner.nextLine();
			if (Pattern.matches("^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", checkName)) {
				((Villa) villa).setTieuChuanPhongVilla(checkName);
				flag = true;
			} else {
				System.out.println("Erro!");
				flag = false;
			}
		}
		System.out.println("---------------------------");
		System.out.println("Tiện nghi khác: ");
		((Villa) villa).setTienNghiKhacVilla(scanner.nextLine());
		System.out.println("---------------------------");
		do {
			try {
				flag = false;
				System.out.println("Số tầng: ");
				int soTang = scanner.nextInt();
				expressionService.checkSoTang(soTang);
				((Villa) villa).setSoTangVilla(soTang);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Lỗi: " + ex.getMessage());
			}
		} while (!flag);
//		System.out.println("Số tầng: ");
//		((Villa) villa).setSoTangVilla(scanner.nextInt());
		System.out.println("---------------------------");
		do {
			try {

				flag = false;
				System.out.println("Nhập vào diện tích hồ bơi: ");
				float area = scanner.nextFloat();
				expressionService.checkDienTichSuDungVaDienTichHoBoi(area);
				((Villa) villa).setDienTichHoBoiVilla(area);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Giá trị nhập vào phải lớn hơn 30." + "\n" + "Lỗi: " + ex.getMessage());
				flag = false;
			}
		} while (!flag);
//		System.out.println("Nhập vào diện tích hồ bơi: ");
//		((Villa) villa).setDienTichHoBoiVilla(scanner.nextFloat());
		System.out.println("---------------------------");
		ArrayList<Villa> villas = FuncWriteAndReadFileCSV.getVillaFromCSV();
		villas.add((Villa) villa);
		FuncWriteAndReadFileCSV.writerServiceToFileVillaCSV(villas);
	}

	public static void addNewHouse() {
		ExpressionServiceImpl expressionService = new ExpressionServiceImpl();
		Service house = new House();
		setAddService(house);
		boolean flag = false;
		while (!flag) {
			System.out.println("Tiêu chuẩn phòng: ");
			String checkName = scanner.nextLine();
			if (Pattern.matches("^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", checkName)) {
				((House) house).setTieuChuanPhongHouse(checkName);
				flag = true;
			} else {
				System.out.println("Erro!");
				flag = false;
			}
		}
		System.out.println("--------------------");
		System.out.println("Tiện nghi khác: ");
		((House) house).setTienNghiKhacHouse(scanner.nextLine());
		System.out.println("--------------------");
		do {
			try {
				flag = false;
				System.out.println("Số tầng: ");
				int soTang = scanner.nextInt();
				expressionService.checkSoTang(soTang);
				((House) house).setSoTangHouse(soTang);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Lỗi: " + ex.getMessage());
			}
		} while (!flag);
		System.out.println("--------------------");
		ArrayList<House> houses = FuncWriteAndReadFileCSV.getHouseFromCSV();
		houses.add((House) house);
		FuncWriteAndReadFileCSV.writerServiceToFileHouseCSV(houses);
	}

	public static void addNewRoom() {
		Service room = new Room();
		setAddService(room);
		System.out.println("----------------");
		ArrayList<Room> rooms = FuncWriteAndReadFileCSV.getRoomFromCSV();
		rooms.add((Room) room);
		FuncWriteAndReadFileCSV.writerServiceToFileRoomCSV(rooms);
	}

	private static void showAllVilla() {
		ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
		for (Villa villa : listVilla) {
			System.out.println("==================");
			System.out.println(villa.showInfor());
			System.out.println("==================");
		}
	}

	private static void showAllHouse() {
		ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
		for (House house : listHouse) {
			System.out.println("==================");
			System.out.println(house.showInfor());
			System.out.println("==================");
		}
	}

	private static void showAllRoom() {
		ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
		for (Room room : listRoom) {
			System.out.println("==================");
			System.out.println(room.showInfor());
			System.out.println("==================");
		}
	}

	public static void addNewCustomer() {
		Customer customer = new Customer();
		ExpressionCustomer expressionCustomer = new ExpressionCustomerImpl();
		boolean flag = false;
		customer.setiD(UUID.randomUUID().toString().replace("-", ""));
		scanner.nextLine();
		while (!flag) {
			System.out.println("Nhập họ và tên: ");
			String checkName = scanner.nextLine();
			if (Pattern.matches("^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", checkName)) {
				customer.setHoTen(checkName);
				flag = true;
			} else {
				System.out.println("Erro!");
				flag = false;
			}
		}
		System.out.println("-----------------------------");
		boolean check;
		do {
			try {
				flag = false;
				do {
					System.out.println("Nhập ngày sinh: ");
					String checkDate = scanner.nextLine();
					check = false;
					if (expressionCustomer.checkngaySinh(checkDate)) {
						customer.setNgaySinh(checkDate);
						check = true;
					} else {
						System.out.println("Nhập date lỗi");
					}
				} while (!check);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Nhập sai định dạng!");
			}
		} while (!flag);
		System.out.println("------------------");
		do {
			try {
				flag = false;
				System.out.println("Hãy một trong 3 nhập giới tính sau: Male,Female,Unknow.");
				String gioiTinh = scanner.nextLine();
				expressionCustomer.checkgioiTinh(gioiTinh);
				customer.setGioiTinh(gioiTinh);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Lỗi nhập dữ liệu! Nhập chính xác một trong ba giá trị trên!" + ex.getMessage());
			}
		} while (!flag);
		System.out.println("---------------");
		do {
			try {
				flag = false;
				do {
					System.out.println("Số chứng minh: ");
					String checkID = scanner.nextLine();
					check = false;
					if (expressionCustomer.checkIDCard(checkID)) {
						customer.setSoCmnd(checkID);
						check = true;
					} else {
						System.out.println("Nhập sai định dạng!");
					}
				} while (!check);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Nhập sai định dạng! Hãy nhập lại!");
			}
		} while (!flag);
		System.out.println("---------------------");
		System.out.println("Nhập số điện thoại: ");
		customer.setSoDt(scanner.nextInt());
		scanner.nextLine();
		System.out.println("---------------------");
		do {
			try {
				flag = false;
				do {
					System.out.println("Nhập email: ");
					String checkEmail = scanner.nextLine();
					check = false;
					if (expressionCustomer.checkEmail(checkEmail)) {
						customer.setEmail(checkEmail);
						check = true;
					} else {
						System.out.println("Nhập sai định dạng!");
					}
				} while (!check);
				flag = true;
			} catch (Exception ex) {
				System.out.println("Hãy nhập lại!");
			}
		} while (!flag);
		System.out.println("Loại khách: ");
		customer.setLoaiKhach(scanner.nextLine());
		System.out.println("Địa chỉ: ");
		customer.setDiaChi(scanner.nextLine());
		ArrayList<Customer> customers = FuncWriteAndReadFileCSV.getCustomerFromCSV();
		customers.add(customer);
		FuncWriteAndReadFileCSV.writerCustomerToFileCustomerCSV(customers);
	}
	public static void showInformationCustomer(){
		ArrayList<Customer> list =FuncWriteAndReadFileCSV.getCustomerFromCSV();
		Collections.sort(list,Customer::compareTo);
		int index=0;
		for (Customer customer:list) {
			System.out.println("-----------------");
			System.out.println((index+=1)+"."+customer.showInfor());
			System.out.println("-----------------");
		}
	}
}

