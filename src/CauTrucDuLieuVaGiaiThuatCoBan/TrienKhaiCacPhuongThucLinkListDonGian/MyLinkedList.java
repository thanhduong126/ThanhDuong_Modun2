package CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiCacPhuongThucLinkListDonGian;

public class MyLinkedList<E> {
	private Node head;
	private int numNodes = 0;

	public MyLinkedList() {
		head = null;
	}

	public void printList() {
		Node temp = head;
		System.out.println("===Head: " + head.data);
		int i = 0;
		while (temp != null) {
			System.out.println("i= " + i + " value= " + temp.data);
			temp = temp.next;
			i++;
		}
	}

	public void addFirst(E e) {
		Node newNode = new Node(e);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		numNodes++;
	}

	public void add(int index, E element) {
		if (index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + "\nnumNodes: " + numNodes);
		}
		if (index == 0) {
			addFirst(element);
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			Node newNode = new Node(element);
			newNode.next = temp.next;
			temp.next = newNode;
			numNodes++;
		}
	}

	private class Node {
		private Node next;
		private Object data;

		public Node(Object data) {
			this.data = data;
		}

		public Object getData() {
			return data;
		}
	}

	public void addLast(E e) {

	}
}
