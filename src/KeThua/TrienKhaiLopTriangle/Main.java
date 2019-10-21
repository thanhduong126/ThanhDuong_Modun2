package KeThua.TrienKhaiLopTriangle;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Triangle triangle = new Triangle();
		System.out.println("Nhập size 1: ");
		triangle.setSize1(scanner.nextDouble());
		System.out.println("Nhập size 2: ");
		triangle.setSize2(scanner.nextDouble());
		System.out.println("Nhập size3: ");
		triangle.setSize3(scanner.nextDouble());
		scanner.nextLine();

		System.out.println("Nhập color: ");
		triangle.setColorTriangle(scanner.nextLine());

		System.out.println(triangle.toString());
	}
}
