package NgonNguLapTrinhJava;

import java.util.Scanner;
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ( tất cả các số nguyên tố nhỏ hơn 100)
public class KiemTraSoNguyenTo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = scanner.nextInt();
		while (number!=0) {
			if (number == 2) {
				System.out.println("Number: " + number + " \nLà số nguyên tố! ");
			} else if (number < 2 || (number % 2 == 0) || (number % Math.sqrt(number) == 0)) {
				System.out.println("Number: " + number + "\nKhông phải là số nguyên tố!");
			} else {
				System.out.println("Number: " + number + "\nLà số nguyên tố!");
			}
			System.out.println("Enter Number: ");
			number = scanner.nextInt();
		}
	}
}

//
//	Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter Number: ");
//	int number = scanner.nextInt();
//		if (number < 2) {
//		System.out.println("Không phải là số nguyên tố!");
//	} else {
//		int i = 2;
//		boolean check = true;
//		while (i <= Math.sqrt(number)) {
//			if (number % i == 0) {
//				check = false;
//				break;
//			}
//			i++;
//		}
//		if (check) {
//			System.out.println("Number:  " + number + "Là số nguyên tố!");
//		} else {
//			System.out.println("Number: " + number + "Không phải là số nguyên tố!");
//		}
//	}
//}

