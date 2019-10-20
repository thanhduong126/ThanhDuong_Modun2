package MangVaPhuongThucTrongJava;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
	Scanner scanner = new Scanner(System.in);

	public void insertNumber(int[] listnum) {
		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		System.out.print("Enter index: ");
		int index = scanner.nextInt();
		if (index < 0 || index > listnum.length) {
			System.out.print("Not insert!");
		}
		int[] newList = new int[listnum.length + 1];
		for (int i = 0; i < index; i++) {
			newList[i] = listnum[i];
		}
		newList[index] = number;
		for (int i = index + 1; i < newList.length; i++) {
			newList[i] = listnum[i - 1];
		}
		System.out.print("New list number: ");
		for (int i = 0; i < newList.length; i++) {
			System.out.print(newList[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ThemPhanTuVaoMang themPhanTuVaoMang = new ThemPhanTuVaoMang();
		System.out.print("Enter element number of list: ");
		int number = scanner.nextInt();
		int[] listnum = new int[number];
		System.out.print("Enter List number: ");
		for (int i = 0; i < number; i++) {
			listnum[i] = scanner.nextInt();
		}
		themPhanTuVaoMang.insertNumber(listnum);
	}

}
