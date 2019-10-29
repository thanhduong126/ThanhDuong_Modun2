package Test;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		HocSinh hocSinh = new HocSinh();
		Scanner scanner = new Scanner(System.in);
		boolean flag =false;
		while (!flag) {
			System.out.println("Nhập tên: ");
			String checkName = scanner.nextLine();
			if (Pattern.matches("^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$",checkName)) {
				hocSinh.setTen(checkName);
				flag =true;
			} else {
				System.out.println("Erro!");
				flag=false;
			}
		}
	}
	public static class HocSinh{
		private String ten;

		public HocSinh(){}
		public HocSinh(String ten){
			this.ten= ten;
		}
		public void  setTen(String ten){
			this.ten = ten;
		}
		public String getTen(){
			return ten;
		}
	}
}
