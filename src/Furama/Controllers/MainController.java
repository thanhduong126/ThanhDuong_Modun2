package Furama.Controllers;

import Furama.Commons.FuncWriteAndReadFileCSV;
import Furama.Data.Employee;
import Furama.Expression.ExpressionCustomer;
import Furama.Expression.ExpressionCustomerImpl;
import Furama.Expression.ExpressionServiceImpl;
import Furama.Models.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
					break;
				case 5:
					addNewBookingResort();
					break;
				case 6:
					setMapEmployee();
					break;
				case 7:
					getticket();
					break;
				case 8:
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
					showAllNameVillaNotDuplicate();
					break;
				case 5:
					showAllNameHouseNotDuplicate();
					break;
				case 6:
					showAllNameRoomNotDuplicate();
					break;
				case 7:
					menuFurama();
					break;
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

	public static void displayBooking() {
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
		System.out.println("6.Map of Employee");
		System.out.println("7.Buy Ticket");
		System.out.println("8.Exit");
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
		System.out.println("3.Show All Room ");
		System.out.println("4.Show All Villa not Doplicate");
		System.out.println("5.Show All House not Doplicate");
		System.out.println("6.Show All Room not Doplicate");
		System.out.println("7.Back To Manu");
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

	public static void showInformationCustomer() {
		ArrayList<Customer> list = FuncWriteAndReadFileCSV.getCustomerFromCSV();
		Collections.sort(list, Customer::compareTo);
		int index = 0;
		for (Customer customer : list) {
			System.out.println("-----------------");
			System.out.println((index += 1) + "." + customer.showInfor());
			System.out.println("-----------------");
		}
	}

	public static void addNewBookingResort() {
		//Doc file Customer.CSV -> listCustomer
		ArrayList<Customer> listCustomers = FuncWriteAndReadFileCSV.getCustomerFromCSV();
		Collections.sort(listCustomers, Customer::compareTo);
		int i = 1;
		for (Customer customer : listCustomers) {
			System.out.println("------------------");
			System.out.println("No." + (i) + "\n" + customer.showInfor());
			System.out.println("------------------");
			i++;
		}
		System.out.println("-------------");
		System.out.println("Hãy Booking dịch vụ cho Customer!");
		//Chon 1 customer tu listCustomer
		Customer customer = listCustomers.get(scanner.nextInt() - 1);
		//Hien Thi menu
		System.out.println("1.Booking Villa");
		System.out.println("2.Booking House");
		System.out.println("3.Booking Room");
		//Chon 1 trong menu tren
		System.out.println("Chọn dịch vụ bạn muốn Booking!");
		int choose = scanner.nextInt();
		switch (choose) {
			case 1:
				i = 1;
				//Hien thi danh sach Vila de chon (listVilla tu file csv)
				ArrayList<Villa> listVillas = FuncWriteAndReadFileCSV.getVillaFromCSV();
				for (Villa villa : listVillas) {
					System.out.println("------------");
					System.out.println("No." + (i) + "\n" + villa.showInfor());
					System.out.println("------------");
					i++;
				}
				System.out.println("Chọn dịch vụ !");
				Villa villa = listVillas.get(scanner.nextInt() - 1);
				customer.setService(villa);
				break;
			case 2:
				i = 1;
				ArrayList<House> listHouses = FuncWriteAndReadFileCSV.getHouseFromCSV();
				for (House house : listHouses) {
					System.out.println("------------");
					System.out.println("No." + (i) + "\n" + house.showInfor());
					System.out.println("------------");
					i++;
				}
				System.out.println("Chọn dịch vụ !");
				House house = listHouses.get(scanner.nextInt() - 1);
				customer.setService(house);
				break;
			case 3:
				i = 1;
				ArrayList<Room> listRooms = FuncWriteAndReadFileCSV.getRoomFromCSV();
				for (Room room : listRooms) {
					System.out.println("------------");
					System.out.println("No." + (i) + "\n" + room.showInfor());
					System.out.println("------------");
					i++;
				}
				System.out.println("Chọn dịch vụ !");
				Room room = listRooms.get(scanner.nextInt() - 1);
				customer.setService(room);
				break;
			default:
				menuFurama();
				break;
		}
		//Luu vao file booking file Booking.CSV
		ArrayList<Customer> listBooking = FuncWriteAndReadFileCSV.getBookingFromCSV();
		listBooking.add(customer);
		FuncWriteAndReadFileCSV.writerCustomerToFileBookingCSV(listBooking);
		System.out.println(" Booking dịch vụ cho " + customer.getHoTen() + " thành công ");
	}


		private static void showAllNameVillaNotDuplicate() {
		String pathVilla = "src/Furama/Data/Villa.csv";
		Path path = Paths.get(pathVilla);
		if (!Files.exists(path)) {
			System.out.println("File không có!");
		} else {
			TreeSet<String> listVillaTreeSet = FuncWriteAndReadFileCSV.getAllNameServiceFromCSV(pathVilla);
			System.out.println("\nList TreeSet: ");
			for (String tr : listVillaTreeSet) {
				System.out.println("-----------");
				System.out.println(tr);
				System.out.println("-----------");
			}
		}
	}

	private static void showAllNameHouseNotDuplicate() {
		String pathHouse = "src/Furama/Data/House.csv";
		Path path = Paths.get(pathHouse);
		if (!Files.exists(path)) {
			System.out.println("File không có!");
		} else {
			TreeSet<String> listHouseTreeSet = FuncWriteAndReadFileCSV.getAllNameServiceFromCSV(pathHouse);
			System.out.println("\nList TreeSet: ");
			for (String tr : listHouseTreeSet) {
				System.out.println("-----------");
				System.out.println(tr);
				System.out.println("-----------");
			}
		}
	}

	private static void showAllNameRoomNotDuplicate() {
		String pathRoom = "src/Furama/Data/Room.csv";
		Path path = Paths.get(pathRoom);
		if (!Files.exists(path)) {
			System.out.println("File không có!");
		} else {
			TreeSet<String> listRoomTreeSet = FuncWriteAndReadFileCSV.getAllNameServiceFromCSV(pathRoom);
			System.out.println("\nList TreeSet: ");
			for (String tr : listRoomTreeSet) {
				System.out.println("-----------");
				System.out.println(tr);
				System.out.println("-----------");
			}
		}
	}

	public static void setMapEmployee() {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		Employee employee1 = map.put(1, new Employee("Hoàng Thanh Dương", "09/02/1995", "4444444444", 324343224, "duong@gmail.com", "Đại học", "Giám Đốc", 8000000));
		Employee employee2 = map.put(2, new Employee("Trần Đức Toàn", "09/08/1980", "5555555555", 545464564, "toan@gmail.com", "Trung học", "Nhân Viên", 5000000));
		Employee employee3 = map.put(3, new Employee("Nguyễn Thành Lâm", "09/08/2000", "666666666", 56765757, "lam@gmail.com", "Tiểu học", "Nhân Viên", 3000000));
		Employee employee4 = map.put(4, new Employee("Nguyễn Văn Chục", "09/08/1990", "6666666666", 22131231, "chuc@gmail.com", "Trung học phổ thông", "Trưởng phòng", 7000000));
		Employee employee5 = map.put(5, new Employee("Nguyễn Văn A", "09/08/1985", "777777777", 546464564, "vanA@gmail.com", "Trung học", "Nhân Viên", 6000000));
		Employee employee6 = map.put(6, new Employee("Nguyễn Văn B", "09/08/1981", "888888888", 54654654, "vanB@gmail.com", "Trung học", "Phó Phòng", 7000000));
		Employee employee7 = map.put(7, new Employee("Nguyễn Văn C", "10/08/1985", "99999999", 545464655, "vanC@gmail.com", "Trung học cơ sở", "Nhân Viên", 5000000));
		Employee employee8 = map.put(8, new Employee("Nguyễn Văn D", "15/02/1994", "59595959", 545464564, "vanE@gmail.com", "Trung học", "Nhân Viên", 5000000));
		Employee employee9 = map.put(9, new Employee("Nguyễn Văn E", "09/12/1983", "555995555", 959595555, "vanF@gmail.com", "Trung học", "Nhân Viên", 5000000));
		Employee employee10 = map.put(10, new Employee("Lê Văn Luyện", "19/10/1989", "555959255", 62929255, "vanP@gmail.com", "Trung học", "Nhân Viên", 5500000));

		for (int i = 1; i <= map.size(); i++) {
			System.out.println("Key: " + i + "\n" + map.get(i) + "\n");
		}
	}

	public static void getticket() {
		Queue<Employee> employees = new LinkedList<Employee>();

		Employee employee1 = new Employee("Hoàng Thanh Dương", "09/02/1995", "4444444444", 324343224, "duong@gmail.com", "Đại học", "Giám Đốc", 8000000);
		Employee employee2 = new Employee("Trần Đức Toàn", "09/08/1980", "5555555555", 545464564, "toan@gmail.com", "Trung học", "Nhân Viên", 5000000);
		Employee employee3 = new Employee("Nguyễn Thành Lâm", "09/08/2000", "666666666", 56765757, "lam@gmail.com", "Tiểu học", "Nhân Viên", 3000000);
		Employee employee4 = new Employee("Nguyễn Văn Chục", "09/08/1990", "6666666666", 22131231, "chuc@gmail.com", "Trung học phổ thông", "Trưởng phòng", 7000000);
		Employee employee5 = new Employee("Nguyễn Văn A", "09/08/1985", "777777777", 546464564, "vanA@gmail.com", "Trung học", "Nhân Viên", 6000000);
		Employee employee6 = new Employee("Nguyễn Văn B", "09/08/1981", "888888888", 54654654, "vanB@gmail.com", "Trung học", "Phó Phòng", 7000000);
		Employee employee7 = new Employee("Nguyễn Văn C", "10/08/1985", "99999999", 545464655, "vanC@gmail.com", "Trung học cơ sở", "Nhân Viên", 5000000);
		Employee employee8 = new Employee("Nguyễn Văn D", "15/02/1994", "59595959", 545464564, "vanE@gmail.com", "Trung học", "Nhân Viên", 5000000);
		Employee employee9 = new Employee("Nguyễn Văn E", "09/12/1983", "555995555", 959595555, "vanF@gmail.com", "Trung học", "Nhân Viên", 5000000);
		Employee employee10 = new Employee("Lê Văn Luyện", "19/10/1989", "555959255", 62929255, "vanP@gmail.com", "Trung học", "Nhân Viên", 5500000);

		employees.offer(employee1);
		employees.offer(employee2);
		employees.offer(employee3);
		employees.offer(employee4);
		employees.offer(employee5);
		employees.offer(employee6);
		employees.offer(employee7);
		employees.offer(employee8);
		employees.offer(employee9);
		employees.offer(employee10);

		for (Employee e:employees) {
			System.out.println(e.getHoTen());
		}
		employees.remove();
		System.out.println("--------");
		System.out.println("Sau khi mua ticket!");
		System.out.println("--------");
		for (Employee x:employees) {
			System.out.println(x.getHoTen());
		}
	}

	public static void tuHoSo(){
		Stack<Employee> stack = new Stack<Employee>();

		Employee employee1 = new Employee("Hoàng Thanh Dương", "09/02/1995", "4444444444", 324343224, "duong@gmail.com", "Đại học", "Giám Đốc", 8000000);
		Employee employee2 = new Employee("Trần Đức Toàn", "09/08/1980", "5555555555", 545464564, "toan@gmail.com", "Trung học", "Nhân Viên", 5000000);
		Employee employee3 = new Employee("Nguyễn Thành Lâm", "09/08/2000", "666666666", 56765757, "lam@gmail.com", "Tiểu học", "Nhân Viên", 3000000);
		Employee employee4 = new Employee("Nguyễn Văn Chục", "09/08/1990", "6666666666", 22131231, "chuc@gmail.com", "Trung học phổ thông", "Trưởng phòng", 7000000);
		Employee employee5 = new Employee("Nguyễn Văn A", "09/08/1985", "777777777", 546464564, "vanA@gmail.com", "Trung học", "Nhân Viên", 6000000);
		Employee employee6 = new Employee("Nguyễn Văn B", "09/08/1981", "888888888", 54654654, "vanB@gmail.com", "Trung học", "Phó Phòng", 7000000);
		Employee employee7 = new Employee("Nguyễn Văn C", "10/08/1985", "99999999", 545464655, "vanC@gmail.com", "Trung học cơ sở", "Nhân Viên", 5000000);
		Employee employee8 = new Employee("Nguyễn Văn D", "15/02/1994", "59595959", 545464564, "vanE@gmail.com", "Trung học", "Nhân Viên", 5000000);
		Employee employee9 = new Employee("Nguyễn Văn E", "09/12/1983", "555995555", 959595555, "vanF@gmail.com", "Trung học", "Nhân Viên", 5000000);
		Employee employee10 = new Employee("Lê Văn Luyện", "19/10/1989", "555959255", 62929255, "vanP@gmail.com", "Trung học", "Nhân Viên", 5500000);



	}

}


