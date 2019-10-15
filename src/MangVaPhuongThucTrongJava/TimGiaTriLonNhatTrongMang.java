package MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
	public static void main(String[] args) {
		int size;
		int[] arr;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập phần tử vào mảng: ");
			size = scanner.nextInt();
			if (size > 20) {
				System.out.println("Size phải bé hơn 20");
			}
		} while (size > 20);

		arr = new int[size];
		int i = 0;
		while (i < arr.length) {
			System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
			i++;
		}
		System.out.println("Mảng vừa nhập: ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(" " + arr[j]);
		}
		int max = arr[0];
		int index = 1;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
				index = j + 1;
			}
		}
		System.out.println("\nGiá trị lớn nhất trong mảng: " + max + " \nTại vị trí: " + index);
		// Làm sao để in ra 2 giá trị lớn nhất = nhau.
		// Ví dụ 1 mảng 1 2 3 3. làm sao in ra: Giá trị lớn nhất là 3 ở vị trí 2 và 3 ở vị trí 3
	}

}
