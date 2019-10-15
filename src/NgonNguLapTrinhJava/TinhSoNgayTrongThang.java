package NgonNguLapTrinhJava;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tháng cần tìm: ");
		int month = scanner.nextInt();

		String daysInMonth;
		switch (month) {
			case 2:
				daysInMonth = "28 or 29";
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				daysInMonth = "31";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				daysInMonth = "30";
				break;
			default:
				daysInMonth = "";
		}
		if (daysInMonth != "") System.out.printf("The month '%d' has %s days!", month, daysInMonth);
		else System.out.print("Invalid input!");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhập tháng cần tìm: ");
//		int month = scanner.nextInt();
//
//		 while (month!=0) {
//			 switch (month) {
//				 case 5:
//				 case 7:
//				 case 8:
//				 case 10:
//				 case 12:
//				 case 3:
//				 case 1:
//					 System.out.println(" Month " + month + " Có 31 ngày ");
//					 break;
//				 case 4:
//				 case 6:
//				 case 9:
//				 case 11:
//					 System.out.println(" Month " + month + " Có 30 ngày ");
//					 break;
//				 case 2:
//					 System.out.println(" Month " + month + " Có 28 -29 ngày ");
//					 break;
//				 default:
//					 System.out.println(" Enter is wrong! ");
//					 break;
//			 }
//			 month =scanner.nextInt();
//		 }
	}
}