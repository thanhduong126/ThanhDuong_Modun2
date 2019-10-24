package CauTrucDuLieuVaGiaiThuatCoBan.TrienKhaiCacPhuongThucArrayList;
import java.util.Arrays;
public class MyList<E> {
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object elements[];

	public MyList() {
		elements = new Object[DEFAULT_CAPACITY];
	}

	public MyList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("Lỗi nhập số âm! ");
		}
		elements = new Object[capacity];
	}

	public void add(int index, E element) {
//		elements.length = Tao moi new elements.length
//      Duyet mang 1 tim gia tri index khi tim thay gan gia tri cua index[i] = index[element]
//		add vao mang elements
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Nhap khong dung index!");
		}
		ensuareCapacity(size + 1);
		System.arraycopy(elements, index, elements, index + 1, size - index);
		elements[index] = element;
		size++;
	}

	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Nhap sai kich co size!");
		}
		E objectRemoved = (E) elements[index];
		System.arraycopy(elements, index + 1, elements, index, elements.length - index - 1);
		elements[size - 1] = null;
		size--;
		return objectRemoved;
	}

	int size() {
		int sizeArr = elements.length;
		System.out.println("Size elements: " + sizeArr);
		return sizeArr;
	}

	public MyList<E> clone() {
		MyList<E> newMyList = new MyList<>();
		newMyList.elements = elements;
		newMyList.size = size;
		return newMyList;
	}

	boolean contains(E o) {
		return indexOf(o) >= 0;
	}

	//trả về vị trí index đầu tiên khi tìm kiếm phần tử element
	public int indexOf(E o) {
		for (int i = 0; i < elements.length - 1; i++) {
			if (elements[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	public boolean add(E e) {
		ensuareCapacity(size + 1);
		elements[size++] = e;
		return true;
	}

	void ensuareCapacity(int minCapacity) {
		elements = Arrays.copyOf(elements, elements.length + minCapacity);
	}

	E get(int i) {
		if (i < 0 || i >= elements.length) {
			throw new IndexOutOfBoundsException("Index: " + i + "Size: " + i);
		}
		return (E) elements[i];
	}

	void clear() {
		for (int i = 0; i < size; i++) {
			elements[i] = null;
		}
		size = 0;
	}

	public void disPlay() {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != null)
				System.out.print("Tai Vi tri " + i + ": " + elements[i] + " \n");
		}
	}


}
