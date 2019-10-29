package Furama.Expression;

public class ExpressionServiceImpl implements Expression{

	@Override
	public void checkDienTichSuDungVaDienTichHoBoi(float dienTich) throws Exception {
		if (dienTich < 30) {
			throw new Exception("Nhập vào không hợp lệ!");
		}
	}

	@Override
	public void checkChiPhiThue(double chiPhiThue) throws Exception {
		if (chiPhiThue < 0) {
			throw new Exception("Số nhập vào phải là số nguyên dương");
		}
	}

	@Override
	public void checkSoLuongNguoiToiDa(int soNguoiToiDa) throws Exception {
		if (soNguoiToiDa < 0 || soNguoiToiDa > 20) {
			throw new Exception("\nLỗi nhập dữ liệu.\nHãy nhập lại!");
		}
	}

	@Override
	public boolean getDichVuDiKem(String dichVuDiKem) throws Exception {
		if(dichVuDiKem.equals("massage") || dichVuDiKem.equals("karaoke") || dichVuDiKem.equals("food")||(dichVuDiKem.equals("drink")) ||dichVuDiKem.equals("car")) {
			return true;
		}
		throw new Exception("Cần nhập đúng tên dịch vụ! Vui lòng nhập lại!");
	}

	@Override
	public void checkSoTang(int soTang) throws Exception {
		if (soTang < 0) {
			throw new Exception("Số nhập vào phải là số nguyên dương");
		}
	}
	}

