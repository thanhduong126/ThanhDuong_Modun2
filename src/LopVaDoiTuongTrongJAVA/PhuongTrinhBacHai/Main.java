package LopVaDoiTuongTrongJAVA.PhuongTrinhBacHai;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QuadraticEquation quadraticEquation = new QuadraticEquation();
		System.out.println("Nhập a: ");
		quadraticEquation.setA(scanner.nextDouble());
		System.out.println("Nhập b: ");
		quadraticEquation.setB(scanner.nextDouble());
		System.out.println("Nhập c: ");
		quadraticEquation.setC(scanner.nextDouble());
		System.out.println("Delta: " + quadraticEquation.getDiscriminant());
			if (quadraticEquation.getDiscriminant() > 0) {
				System.out.println("Phương trình có 2 nghiệm phân biệt: \n" + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
			} else if (quadraticEquation.getDiscriminant() == 0) {
				System.out.println("Phương trình có 1 nghiệm" + quadraticEquation.getRoot3());
			} else {
				System.out.println("The equation has no roots");

		}
	}
}
