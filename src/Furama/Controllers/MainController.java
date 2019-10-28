package Furama.Controllers;

import Furama.Commons.FuncWriteAndReadFileCSV;
import Furama.Models.House;
import Furama.Models.Room;
import Furama.Models.Service;
import Furama.Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

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

	public static void displayMainMenu() {
		System.out.println("Choose the function you want to use!");
		System.out.println("1.Add New Services");
		System.out.println("2.Show Services");
		System.out.println("3.Exit");
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

	static ArrayList<House> houses = new ArrayList<House>();
	static ArrayList<Room> rooms = new ArrayList<Room>();
	static ArrayList<Villa> villas = new ArrayList<Villa>();

	public static void setAddService(Object object) {
		((Service) object).setId(UUID.randomUUID().toString().replace("-", ""));
		scanner.nextLine();
		System.out.println("Nhập tên dịch vụ: ");
		((Service) object).setTenDichVu(scanner.nextLine());
		System.out.println("Nhập diện tích sử dụng: ");
		((Service) object).setDienTichSuDung(scanner.nextInt());
		System.out.println("Nhập chi phí thuê: ");
		((Service) object).setChiPhiThue(scanner.nextInt());
		System.out.println("Số người tối đa: ");
		((Service) object).setSoLuongNguoiToiDa(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Kiểu thuê: ");
		((Service) object).setKieuThue(scanner.nextLine());
	}

	public static void addNewVilla() {
		Service villa = new Villa();
		setAddService(villa);
		System.out.println("Tiêu chuẩn phòng: ");
		((Villa) villa).setTieuChuanPhongVilla(scanner.nextLine());
		System.out.println("Tiện nghi khác: ");
		((Villa) villa).setTienNghiKhacVilla(scanner.nextLine());
		System.out.println("Diện tích hồ bơi: ");
		((Villa) villa).setDienTichHoBoiVilla(scanner.nextFloat());
		System.out.println("Số tầng: ");
		((Villa) villa).setSoTangVilla(scanner.nextInt());
		villas.add((Villa) villa);
		FuncWriteAndReadFileCSV.writerVillaToFileVillaCSV(villas);
	}

	public static void addNewHouse() {
		ArrayList<House> houses = new ArrayList<>();
		Service house = new House();
		setAddService(house);
		System.out.println("Tiêu chuẩn phòng: ");
		((House) house).setTieuChuanPhongHouse(scanner.nextLine());
		System.out.println("Tiện nghi khác: ");
		((House) house).setTienNghiKhacHouse(scanner.nextLine());
		System.out.println("Số tầng: ");
		((House) house).setSoTangHouse(scanner.nextInt());
		houses.add((House) house);
		FuncWriteAndReadFileCSV.writerVillaToFileHouseCSV(houses);
	}

	public static void addNewRoom() {
		Service room = new Room();
		setAddService(room);
		rooms.add((Room) room);
		FuncWriteAndReadFileCSV.writerVillaToFileRoomCSV(rooms);
	}
	private static void showAllVilla(){
		ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
		for (Villa villa:listVilla) {
			System.out.println("==================");
			villa.showInfor();
			System.out.println("==================");
		}
	}
	private static void showAllHouse(){
		ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
		for (House house:listHouse) {
			System.out.println("==================");
			house.showInfor();
			System.out.println("==================");
		}
	}
	private static void showAllRoom(){
		ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
		for (Room room:listRoom) {
			System.out.println("==================");
			room.showInfor();
			System.out.println("==================");
		}
	}

//	public static void showHouses() {
//		for (int i = 0; i < houses.size(); i++) {
//			System.out.println(houses.get(i).showInfor() + "\n");
//		}
//	}

//	public static void showVillas() {
//		for (int i = 0; i < villas.size(); i++) {
//			System.out.println(villas.get(i).showInfor() + "\n");
//		}
//	}
//
//	public static void showRooms() {
//		for (int i = 0; i < rooms.size(); i++) {
//			System.out.println(rooms.get(i).showInfor() + "\n");
//		}
//	}
}
