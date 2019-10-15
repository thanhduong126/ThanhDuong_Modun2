package NgonNguLapTrinhJava;
public class BaitapHienThiSoNguyenToNhoHon100 {
	public static void main(String[] args) {
		int x = 2;
		while (true) {
			if (checkNgTo(x)) {
				System.out.print(x + " ");
			}
			if (x>98) {
				break;
			}
			if (x == 2) {
				x++;
			} else {
				x += 2;
			}
		}
	}

	public static boolean checkNgTo(int p) {
		for (int i = 2; i <= Math.sqrt(p); i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
}
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97