package NgonNguLapTrinhJava;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
	public static void main(String[] args) {
		System.out.println("Linear Equation Resolver");
		System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhap A: ");
		double a = scanner.nextDouble();
		System.out.println("Nhap B: ");
		double b=  scanner.nextDouble();
		System.out.println("Nhap C: ");
		double c = scanner.nextDouble();
		if (a != 0) {
			double solution = -b / a;
			System.out.printf("The solution is: %f!", solution);
		}
		if (a != 0) {
			double answer = (c - b) / a;
			System.out.printf("Equation pass with x = %f!\n", answer);
		} else {
			if (b == 0) {
				System.out.print("The solution is all x!");
			} else {
				System.out.print("No solution!");
			}
		}
	}
}
