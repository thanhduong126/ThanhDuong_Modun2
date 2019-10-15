package NgonNguLapTrinhJava;
public class HienThi20SoNguyenToDauTien {
	public static void main(String[] args) {
		int n = 20;
		int x = 2;
		int count = 0;
		while (true) {
			if (checkNgTo(x)) {
				System.out.print(x + " ");
				count++;
			}
			if (count == n) {
				break;
			}
			x++;
		}
	}

	public static boolean checkNgTo(int k) {
		for (int i = 2; i <= Math.sqrt(k); i++) {
			if (k % i == 0) {
				return false;
			}
		}
		return true;
	}
}
