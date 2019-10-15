package NgonNguLapTrinhJava;

import java.util.Scanner;

public class HienThiHinhVe {
	public static void main(String[] args) {
		int choise;
		Scanner scanner = new Scanner(System.in);
		displayManu();

		choise = scanner.nextInt();
		while (choise != 0) {
			switch (choise) {
				case 1:
					hinhVuong();
					break;
				case 2:
					hinhTamGiac1();
					break;
				case 3:
					hinhTamGiac2();
					break;
				case 0:
					System.exit(0);

				default:
					System.out.println("Nhap sai choise!");
			}
			choise = scanner.nextInt();
			displayManu();
		}
	}

	public static void hinhVuong() {
		int n = 5, m = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

	public static void hinhTamGiac1() {

		for (int i = 0; i <= 5; i++) {

			for (int j=0;j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

	public static void hinhTamGiac2(){
		for (int i=7; i>=1;i--){
			for (int j=1;j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

	public static void displayManu() {
		System.out.println("Menu");
		System.out.println("1.Hình vuông");
		System.out.println("2.Hình tam giác 1");
		System.out.println("3.Hình tam giác 2");
	}

}
