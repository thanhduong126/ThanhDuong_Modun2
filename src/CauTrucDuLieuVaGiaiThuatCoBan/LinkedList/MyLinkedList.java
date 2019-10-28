package CauTrucDuLieuVaGiaiThuatCoBan.LinkedList;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Cloneable {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
        head = null;
    }

    public void add(int index, E element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", numNodes: " + numNodes);
        }
        if (index == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(element);
            temp.next = newNode;
            newNode.next = temp.next;

            numNodes++;
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
//        if (index < 0 || index > numNodes) {
//            throw new IndexOutOfBoundsException("Index: " + index + ", numNodes: " + numNodes);
//        }
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
        boolean isRemoved = false;
        System.out.println("size "+size());
        for (int i = 0; i < numNodes; i++) {
            if (object.equals(temp.data)) {
//                System.out.println("holder.next "+ holder.next.data + "temp.next" +temp.next.data);
//                holder.next = temp.next;
//                numNodes--;
                remove(i);
                isRemoved = true;
            }
            holder = temp;
            temp = temp.next;
        }
        return isRemoved;
    }

    public int size() {
        return numNodes;
    }

    // Sua lai return MyLinkedList<E> thay vi E
    public MyLinkedList<E> clone() {
        try {
            MyLinkedList<E> list = (MyLinkedList<E>) super.clone();//khong can implements Cloneable ,cai dat kieu khac
            return list;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (o.equals(temp.data)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

//    public void ensureCapacity(int minCapacity) { xoa method nay
//
//    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        if (head == null)
            throw new NoSuchElementException();
        return (E) head.data;
    }

    public E getLast() {
        if (head == null)
            throw new NoSuchElementException();
        Node temp = head;
        for (int i = 0; i < numNodes-1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = null;
        numNodes =0;
    }

    public void printList() {
        Node temp = head;
        System.out.println("=======HEAD "+head.data);
        int i = 0;
        while (temp != null && i< numNodes) {
            System.out.println("i = "+i+" value = "+temp.data);
            temp = temp.next;
            i++;
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
}
