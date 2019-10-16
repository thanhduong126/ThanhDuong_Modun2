package MangVaPhuongThucTrongJava;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
	public static void main(String[] args) {
		int size;
		Scanner scanner = new Scanner(System.in);
		int[] arr;
		do {
			System.out.println("Nhập size của mảng: ");
			size = scanner.nextInt();
			if (size > 20) {
				System.out.println("Size cuả mảng bé hơn 20");
			}
		} while (size > 20);
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhập phần tử thứ: " + (i + 1));
			arr[i] = scanner.nextInt();
		}
		System.out.print("Mảng vừa nhập: ");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		int min = arr[0];

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println("Giá trị nhỏ nhất của mảng là: " + min);

	}
}
