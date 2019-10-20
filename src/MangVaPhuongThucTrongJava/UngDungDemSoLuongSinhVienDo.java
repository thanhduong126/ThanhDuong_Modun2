package MangVaPhuongThucTrongJava;

import java.util.Scanner;

//Nhập size mảng
//Nhập từng phần tử cho mảng
//Trả về mảng đã nhập kèm với các điều kiện

public class UngDungDemSoLuongSinhVienDo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size;
		int[] arr;
		do {
			System.out.println("Số lượng sinh viên: ");
			size = scanner.nextInt();
			if (size > 30) {
				System.out.println("Mảng nhập cần bé hơn 30");
			}
		} while (size > 30);

		int i = 0;
		arr = new int[size];
		while (i < arr.length) {
			System.out.println("Nhập điểm sinh viên thứ " + (i + 1));
			arr[i] = scanner.nextInt();
			i++;
		}

		System.out.println("Kết quả danh sách sinh viên thi đỗ: ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print("Điểm "+arr[j] + ": ");
			if (arr[j] >= 5 && arr[j] <= 10) {
				System.out.println("Đạt");
			} else if (arr[j] > 10) {
				System.out.println("Thang điểm quy định tối đa là 10");
			} else {
				System.out.println("Không đạt");
			}
		}

	}
}
