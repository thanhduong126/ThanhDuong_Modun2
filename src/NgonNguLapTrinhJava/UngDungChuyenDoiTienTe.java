package NgonNguLapTrinhJava;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
	public static void main(String[] args) {
		changeMoney();
	}
	public static void changeMoney(){
		double vnd,usd;
		double rate;
		Scanner scanner=new Scanner(System.in);
		vnd=23000;
		System.out.println("Tỉ giá đổi từ USD sang VND hiện tại là 23000/1USD");
		System.out.println("Nhập USD cần chuyển đổi: ");
		usd = scanner.nextDouble();
		rate =usd*vnd;
		System.out.println("VND: "+rate+"\b\b");



	}

}
// chuyển đổi vnd sang usd. double vnd +usd. hàm tính. hiển thị