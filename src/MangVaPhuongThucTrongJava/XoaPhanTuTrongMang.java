package MangVaPhuongThucTrongJava;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
	Scanner scanner = new Scanner(System.in);

	public void deleteElement(int[] array) {
		int[] newArray = new int[array.length - 1];
		System.out.print("Enter the element you want to delete: ");
		int number = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				count = 1;
				for (int j = 0; j < i; j++) {
					newArray[j] = array[j];
				}
				for (int j = i + 1; j < array.length; j++) {
					newArray[j - 1] = array[j];
				}
			}
		}
		if (count == 1) {
			System.out.print("New Array is: ");
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i] + " ");
			}
		} else {
			System.out.print("Not element found!");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a size of Array: ");
		int sizeOfArray = scanner.nextInt();
		System.out.print("The Array is: ");
		int[] array = new int[sizeOfArray];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		XoaPhanTuTrongMang xoaPhanTuTrongMang = new XoaPhanTuTrongMang();
		xoaPhanTuTrongMang.deleteElement(array);

	}
}
