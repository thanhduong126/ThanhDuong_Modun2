package MangVaPhuongThucTrongJava;

import java.util.Arrays;

public class GopMang {
	public static void main(String[] args) {
		//Tạo 2 mảng cho trước
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr1 = {2, 3, 4, 5, 6, 7};
		int count1 = 0, count2 = 0;

		//Sử dụng vòng lặp để duyệt phần tử mảng 1 va 2 đê đếm index cộng lại của 2 mảng
		for (int i = 0; i < arr.length; i++) {
			count1++;
		}
		for (int i = 0; i < arr1.length; i++) {
			count2++;
		}
		int sum= count1+count2;
		System.out.println("Số lượng phần tử trong mảng: "+sum);
		//tạo mảng thứ 3 có kích thước bằng 2 mảng đã cho trước cộng lại
		int[] arr2 = new int[sum];
		//chạy vòng lặp cho mảng 1 gán cho chỉ số tương ứng với mảng 3
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=arr[i];
			//Khi mà mảng 1 duyệt hết tiếp tục gán giá trị tiếp theo bằng với mảng 2
			// độ dài mảng 3 sẽ trừ đi mảng 1 để lấy vị trí gán tiếp giá trị 0 của mảng 2 cho mảng 3
			}




	}
}
