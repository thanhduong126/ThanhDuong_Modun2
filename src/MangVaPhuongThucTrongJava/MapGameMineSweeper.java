package MangVaPhuongThucTrongJava;

public class MapGameMineSweeper {
	public static void main(String[] args) {
//		Nội dung
//		Giả sử bạn tham gia lập trình trò chơi Mine Sweeper, một bộ phận khác đã giúp bạn tạo ra một ma trận với một số vị trí được đánh dấu là có mìn, bạn sẽ bổ sung thông số về số lượng quả mìn xung quanh một ô vào ma trận đó.
//
//		Ví dụ, bạn được cung cấp một ma trận như sau:
//
//*...
//....
//.*..
//....
//		Bạn cần tạo ra được ma trận như sau:
//
//*100
//		2210
//		1*10
//		1110
//		Hướng dẫn
//		Hãy tạo project, tạo class MineSweeper và hàm Main trước khi bắt đầu.
//
//		Bước 1: tạo báo cáo từ một bản đồ 1x1
//
//		Tạo một ma trận đầu vào với kích thước 1x1 và có một vị trí được đánh dấu là có mìn, viết mã để in ra báo cáo trong trường hợp này:
//
//		String[][] map = {
//				{"*"}
//		};
//
//		System.out.print("*");
//		Bước 2: tạo báo cáo từ một bản đồ 1x2
//
//		Sửa mã để bản đồ đầu vào có 1 dòng và 2 cột, với một vị trí được đánh dấu là có mìn, sử dụng vòng lặp để in ra báo cáo trong trường hợp này, trong vòng lặp, để dễ hiểu, sử dụng biến đếm là x cho chỉ mục của cột, và nếu cần, y cho chỉ mục của hàng, giống như trong khái niệm hệ tọa độ toán học. Như vậy, ô bất kỳ trên bản đồ sẽ được truy xuất bằng tọa độ [y][x].
//
//		String[][] map = {
//				{"*", "."}
//		};
//
//		for (int xOrdinate = 0; xOrdinate < map[0].length; xOrdinate++) {
//			if (map[0][xOrdinate].equals("*")) System.out.print("*");
//			else System.out.print(1);
//		}
//		Bước 3: tái cấu trúc (khử mã khó đọc)
//
//		Biểu thức map[0].length và map[0][x] là khó đọc (không thể ngay lập tức hiểu). Ta đặt tên cho giá trị của những biểu thức này
//
//		String[][] map = {
//				{"*", "."}
//		};
//
//		final int MAP_WIDTH = map[0].length;
//
//		for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
//			String curentCell = map[0][xOrdinate];
//			if (curentCell.equals("*")) System.out.print("*");
//			else System.out.print(1);
//		}
//		Bước 4: tái cấu trúc: đoạn mã làm hai việc một lúc
//
//		Vòng lặp for ở đoạn mã trên đang làm hai việc cùng một lúc: vừa kiểm tra các ô láng giềng vừa in kết quả ra màn hình. Đây là một nợ kỹ thuật có thể cản trở việc phát triển ứng dụng này ở những bước sau. Để khử nợ kỹ thuật này, ta đưa việc “in kết quả ra màn hình” vào đoạn mã khác:
//
//		String[][] map = {
//				{"*", "."}
//		};
//
//		final int MAP_WIDTH = map[0].length;
//
//		String[][] mapReport = new String[1][MAP_WIDTH];
//		for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
//			String curentCell = map[0][xOrdinate];
//			if (curentCell.equals("*")) mapReport[0][xOrdinate] = "*";
//			else mapReport[0][xOrdinate] = "1";
//		}
//
//		for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
//			String currentCellReport = mapReport[0][xOrdinate];
//			System.out.print(currentCellReport);
//		}
//		Để ý rằng nhờ có bước khử mã khó đọc ở bước trước, mã ở bước này vẫn rất dễ đọc.
//
//				Bước 5: tạo báo cáo từ một bản đồ 1 dòng với số cột tùy ý
//
//		Sửa mã để bản đồ có nhiều cột hơn, sửa mã để in ra báo cáo trong trường hợp có mìn ở vị trí bất kỳ.
//
//		Với một ô bất kỳ, ta đếm trong các ô láng giềng của nó (ở đây mới có hai trường hợp là bên trái và bên phải) có ô nào đang “ôm bom” hay không.
//
//		String[][] map = {
//				{"*", ".", "*", ".", "."}
//		};
//
//		final int MAP_WIDTH = map[0].length;
//
//		String[][] mapReport = new String[1][MAP_WIDTH];
//		for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
//			String curentCell = map[0][xOrdinate];
//			if (curentCell.equals("*")) {
//				mapReport[0][xOrdinate] = "*";
//			} else {
//				int minesAround = 0;
//
//				boolean hasNeighbourAtLeft = xOrdinate - 1 >= 0;
//				boolean hasMineAtLeft = hasNeighbourAtLeft && map[0][xOrdinate - 1].equals("*");
//				if (hasMineAtLeft) minesAround++;
//
//				boolean hasNeighbourAtRight = xOrdinate + 1 < MAP_WIDTH;
//				boolean hasMineAtRight = hasNeighbourAtRight && map[0][xOrdinate + 1].equals("*");
//				if (hasMineAtRight) minesAround++;
//
//				mapReport[0][xOrdinate] = String.valueOf(minesAround);
//			}
//		}
//
//		for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
//			String currentCellReport = mapReport[0][xOrdinate];
//			System.out.print(currentCellReport);
//		}
//		Bước 6: tái cấu trúc (khử mã lặp)
//
//		Bước trước đã sản sinh ra mã lặp, một cách để khử chúng là liệt kê danh sách các láng giềng vào một mảng, sau đó chạy vòng lặp để kiểm tra từng láng giềng một.
//
//				String[][] map = {
//				{"*", ".", "*", ".", "."}
//		};
//
//		final int MAP_WIDTH = map[0].length;
//
//		String[][] mapReport = new String[1][MAP_WIDTH];
//		for (int xOrdinate = 0; xOrdinate < map[0].length; xOrdinate++) {
//			String curentCell = map[0][xOrdinate];
//			if (curentCell.equals("*")) {
//				mapReport[0][xOrdinate] = "*";
//			} else {
//				final int[][] NEIGHBOURS_ORDINATE = {
//						{0, xOrdinate - 1}, {0, xOrdinate + 1}
//				};
//
//				int minesAround = 0;
//				for (int i = 0; i < NEIGHBOURS_ORDINATE.length; i++) {
//					int[] neighbourOrdinate = NEIGHBOURS_ORDINATE[i];
//					int xOrdinateOfNeighbour = neighbourOrdinate[1];
//					int yOrdinateOfNeighbour = neighbourOrdinate[0];
//
//					boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0 || xOrdinateOfNeighbour == MAP_WIDTH;
//					if (isOutOfMapNeighbour) continue;
//
//					boolean isMineOwnerNeighbour = map[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals("*");
//					if (isMineOwnerNeighbour) minesAround++;
//				}
//
//				mapReport[0][xOrdinate] = String.valueOf(minesAround);
//			}
//		}
//
//		for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
//			String currentCellReport = mapReport[0][xOrdinate];
//			System.out.print(currentCellReport);
//		}
//		Bước 7: tạo báo cáo từ bản đồ có kích thước tùy ý
//
//		Sửa để bản đồ đầu vào có nhiều dòng hơn:
//
//		String[][] map = {
//				{"*", ".", "*", ".", "."},
//				{".", "*", ".", ".", "."}
//		};
//		final int MAP_HEIGHT = map.length;
//		final int MAP_WIDTH = map[0].length;
//
//		Sửa để mảng mapReport có số cột bằng với số cột của mảng map thay vì chỉ một dòng như hiện tại:
//
//		String[][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];
//		Sửa để phần mã đếm số láng giềng “ôm bom” duyệt qua tất cả các dòng thay vì chỉ mỗi dòng đầu tiên như hiện tại, đồng thời sửa những phần mã đang sử dụng chỉ mục của dòng đầu tiên (số 0) thành sử dụng chỉ mục thực tế của dòng.
//
//				String[][] mapReport = new String[MAP_HEIGHT][MAP_WIDTH];
//		for (int yOrdinate = 0; yOrdinate < MAP_HEIGHT; yOrdinate++) {
//			for (int xOrdinate = 0; xOrdinate < map[0].length; xOrdinate++) {
//				String curentCell = map[yOrdinate][xOrdinate];
//				if (curentCell.equals("*")) {
//					mapReport[yOrdinate][xOrdinate] = "*";
//				} else {
//					final int[][] NEIGHBOURS_ORDINATE = {
//							{yOrdinate, xOrdinate - 1}, {yOrdinate, xOrdinate + 1}
//					};
//
//					int minesAround = 0;
//					for (int i = 0; i < NEIGHBOURS_ORDINATE.length; i++) {
//						int[] neighbourOrdinate = NEIGHBOURS_ORDINATE[i];
//						int xOrdinateOfNeighbour = neighbourOrdinate[1];
//						int yOrdinateOfNeighbour = neighbourOrdinate[0];
//
//						boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0 || xOrdinateOfNeighbour == MAP_WIDTH;
//						if (isOutOfMapNeighbour) continue;
//
//						boolean isMineOwnerNeighbour = map[yOrdinateOfNeighbour][xOrdinateOfNeighbour].equals("*");
//						if (isMineOwnerNeighbour) minesAround++;
//					}
//
//					mapReport[yOrdinate][xOrdinate] = String.valueOf(minesAround);
//				}
//			}
//		}
//		Tương tự, sửa để phần mã in báo áo in ra tất cả các dòng của báo cáo, thay vì chỉ mỗi dòng đầu tiên như hiện tại:
//
//		for (int yOrdinate = 0; yOrdinate < MAP_HEIGHT; yOrdinate++) {
//			for (int xOrdinate = 0; xOrdinate < MAP_WIDTH; xOrdinate++) {
//				String currentCellReport = mapReport[yOrdinate][xOrdinate];
//				System.out.print(currentCellReport);
//			}
//		}
//		Bạn tự sửa mã để sau khi in hết một dòng thì in thêm ký tự xuống dòng.
//
//		Chạy thử để kiểm tra kết quả.
//
//				Mã hiện tại đang chỉ đếm những láng giềng ở phía bên trái và bên phải, ta bổ sung tọa độ của các láng giềng còn lại vào danh sách láng giềng:
//
//		final int[][] NEIGHBOURS_ORDINATE = {
//				{yOrdinate - 1, xOrdinate - 1}, {yOrdinate - 1, xOrdinate}, {yOrdinate - 1, xOrdinate + 1},
//				{yOrdinate, xOrdinate - 1}, {yOrdinate, xOrdinate + 1},
//				{yOrdinate + 1, xOrdinate - 1}, {yOrdinate + 1, xOrdinate}, {yOrdinate + 1, xOrdinate + 1},
//		};
//		Bổ sung mã để kiểm tra láng giềng nằm ngoài bản đồ:
//
//		boolean isOutOfMapNeighbour = xOrdinateOfNeighbour < 0
//				|| xOrdinateOfNeighbour == MAP_WIDTH
//				|| yOrdinateOfNeighbour < 0
//				|| yOrdinateOfNeighbour == MAP_HEIGHT;
//		if (isOutOfMapNeighbour) continue;
//		Chạy thử để kiểm tra kết quả.
//
////				Bạn có thể thấy, nhờ liên tục tái cấu trúc, ta chỉ cần sửa rất ít mã ở bước này. Bạn có thể thêm mã để tạo mảng đầu vào từ nhập liệu của người dùng. Bạn có thể tham khảo mã hoàn chỉnh ở đây.
//
	}
}
