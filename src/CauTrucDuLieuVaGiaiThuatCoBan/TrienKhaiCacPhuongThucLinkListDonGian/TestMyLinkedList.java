package CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiCacPhuongThucLinkListDonGian;

public class TestMyLinkedList {
	public static void main(String[] args) {
		System.out.println("=============");
		MyLinkedList<String>  myLinkedList = new MyLinkedList<>();
		myLinkedList.add(0,"a");
		myLinkedList.add(1,"b");
		myLinkedList.add(2,"c");
		myLinkedList.add(3,"d");
		myLinkedList.addFirst("RRRR");
		myLinkedList.printList();
	}
}
