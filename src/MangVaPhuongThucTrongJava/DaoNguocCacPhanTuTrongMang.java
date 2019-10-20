package MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class DaoNguocCacPhanTuTrongMang {
	//input1= size mang ok
	//input2= nhap tung phan tu trong mang ok
	//output1 in ra mang vua nhap ok
	//chạy vòng lặp để đảo ngược mảng
	//output2= mảng đã được đảo ngược

	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		int[] array;

		do {
			System.out.println("Nhập độ dài của mảng: ");
			size = scanner.nextInt();
			if (size > 20) {
				System.out.println("Độ dài cần nhập bé hơn 20!");
			}
		} while (size > 20);
		array = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Nhập phần tử thứ " + (i + 1));
			array[i] = scanner.nextInt();
		}
		System.out.print("Mảng vừa nhập là: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		for (int j = 0; j < array.length / 2; j++) {
			int temp = array[j];
			array[j] = array[size - 1 - j];
			array[size - 1 - j] = temp;
		}
		System.out.println("Mảng đã được đảo ngược: ");
		for (int x : array
		) {
			System.out.print(x + " ");
		}

	}
}
