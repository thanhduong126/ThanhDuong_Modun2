package MangVaPhuongThucTrongJava;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a size of the first Array: ");
		int sizeOfFirstArray = scanner.nextInt();
		System.out.print("Enter the first Array: ");
		int[] firstArray = new int[sizeOfFirstArray];
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = scanner.nextInt();
		}
		System.out.print("Enter a size of second array: ");
		int sizeOfSecondArray = scanner.nextInt();
		int[] secondArray = new int[sizeOfSecondArray];
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = scanner.nextInt();
		}
		GopMang gopMang = new GopMang();
		gopMang.poolingArray(firstArray, secondArray);

	}

	public void poolingArray(int[] first, int[] second) {
		int sizeOfArray = first.length + second.length;
		int[] theThirdArray = new int[sizeOfArray];
		for (int i = 0; i < first.length; i++) {
			theThirdArray[i] = first[i];
		}
		for (int i = 0; i < second.length; i++) {
			theThirdArray[i + first.length] = second[i];
		}
		System.out.print("Array after merging is: ");
		for (int i = 0; i < theThirdArray.length; i++) {
			System.out.print(theThirdArray[i] + " ");
		}
	}
}
