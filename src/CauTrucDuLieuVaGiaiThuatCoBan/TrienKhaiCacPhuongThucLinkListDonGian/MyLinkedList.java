package CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiCacPhuongThucLinkListDonGian;

public class MyLinkedList<E> implements Cloneable{
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
		if (head == null) {
			head = new Node(e);
		} else {
			Node temp = head;
			for (int i = 0; i < numNodes - 1; i++) {
				temp = temp.next;
			}
			temp.next = new Node(e);
		}
		numNodes++;
	}

	public E remove(int index) {
		Node temp = head;
		Node holder;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;

		}
		holder = temp.next;
		temp.next = temp.next.next;
		numNodes--;
		return (E) holder.data;
	}

	public boolean remove(Object object) {
		Node temp = head;
		Node holder = head;
		boolean isRemove = false;
		for (int i = 0; i < numNodes; i++) {
			if (object.equals(temp.data)) {
				holder.next = temp.next;
				numNodes--;
				isRemove = true;
			}
			holder = temp;
			temp = temp.next;
		}
		return isRemove;
	}
		public int size(){
		return numNodes;
		}
		public MyLinkedList<E> clone(){
		try {
			MyLinkedList<E> list = (MyLinkedList<E>)super.clone();
			return list;
		}catch (CloneNotSupportedException e){
			throw new InternalError(e);
		}
	}
//	public int indexOf(E o){
//		Node temp = head;
//		for (int i = 0; i < numNodes; i++) {
//			if ((o.equals(equals())))
//		}
//		return -1;
//	}


//	public boolean contrains(E o){
//		return  indexOf(o) !=-1;
//	}

}
