package CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiCacPhuongThucArrayList;

import java.util.ArrayList;

public class TestMyList {
	public static void main(String[] args) {
		MyList<Integer> myList = new MyList<Integer>();
		System.out.println("myList1 ====================");
		myList.add(0, 20);
		myList.add(1, 30);
		myList.add(2, 40);
		myList.add(3, 50);
		myList.add(4, 60);
		myList.add(5, 30);
		myList.add(15);
		myList.add(20);
//		myList.remove(2);
		myList.disPlay();
		System.out.println("Vị trí Index đầu tiên là: "+myList.indexOf(30));
//		myList.size();
//
//		System.out.println("myList2 ====================");
//		MyList<Integer> myList2 = myList.clone();
//		myList2.add(4, 70);
//		myList2.disPlay();
//
//		System.out.println("myList3 =====================");
//
//		MyList<Integer> myList3 = myList.clone();
//		myList3.clone();
//		myList.disPlay();
	}
}
