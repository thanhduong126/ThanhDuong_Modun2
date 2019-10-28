package CauTrucDuLieuVaGiaiThuatCoBan.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING MyLinkedList<Integer> /=/=/=/=");
        MyLinkedList<String> llInteger = new MyLinkedList<String>();

//        llInteger.addLast("12");
//        llInteger.addLast("12");
//        llInteger.addLast("12");
//        llInteger.addFirst("15");
//        llInteger.addFirst("13");
//        llInteger.addLast("14");
//        llInteger.addFirst("16");
        llInteger.add(0,"19");
        llInteger.add(1,"12");
        llInteger.addFirst("11");
        llInteger.addLast("15");
//        llInteger.addLast("12");
//        llInteger.remove("12");

//        llInteger.add(2,"19");
//        llInteger.add(3,"18");
//        llInteger.add(1,"11");
//        System.out.println("remove index 5 has value "+llInteger.remove(5));
//        System.out.println("remove index 5 has value "+llInteger.remove("13"));
//        llInteger.add(4,15);
        llInteger.printList();
        System.out.println("========================");
//        MyLinkedList<String> llInteger2 = llInteger.clone();
//        llInteger2.printList();
        System.out.println("==========================================");
        MyLinkedList<String> llInteger2 = llInteger.clone();
//
//        System.out.println("llInteger2 has contain 15: "+llInteger.contains("19"));
//        llInteger2.add("19");
//        System.out.println("llInteger2.getFirst : "+llInteger2.getFirst());
//        System.out.println("llInteger2.getLast : "+llInteger2.getLast());
////        llInteger2.clear();
//        llInteger2.printList();
    }

}
