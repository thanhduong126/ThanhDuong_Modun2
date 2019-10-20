package MangVaPhuongThucTrongJava;

public class GiaTriLonNhatTrongMang2Chieu {
	public static void main(String[] args) {

		int[][] arr = new int[3][4];
		int[][] arr2 =/* new int[][]*/{
				{1, 2, 3, 4},
				{5, 6, 22, 8},
				{9, 10, 11, 12}
		};

		System.out.println(	"Gia tri lon nhat la: "+ getMaxValue(arr2));

	}
	public static int getMaxValue(int[][] arr){
		//khợi tạo giá trị lớn nhất = giá trị phần tử đầu tiên của mảng
		int max = arr[0][0];
		//duyệt từng phần tử theo dòng
		for (int i = 0; i < arr.length; i++) {
			//mỗi dòng thì duyệt theo cột
			for (int j = 0; j < arr[0].length; j++) {
				// nếu giá trị tại phần tử đang duyệt mà lớn hơn giá trị lớn nhất
				if (arr[i][j] > max) {
					// thì gán giá trị cho nó là giá trị lớn nhất
					max= arr[i][j];
				}
			}
		}
		// tra ve gia tri lon nhat
		return max;
	}
}
