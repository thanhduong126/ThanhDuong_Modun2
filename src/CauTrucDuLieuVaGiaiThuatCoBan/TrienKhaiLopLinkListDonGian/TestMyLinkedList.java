package CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiLopLinkListDonGian;

public class TestMyLinkedList {
	public static void main(String[] args) {
		System.out.println("/=/=/=/= TESTING /=/=/=/=");
		MyLinkedList ll = new MyLinkedList("A");
//		ll.addFirst(11);
//		ll.addFirst(12);
//		ll.addFirst(13);
		ll.add(1, 11);
		ll.add(2, 9);
		ll.add(3, 10);
		ll.printList();


	}
}

