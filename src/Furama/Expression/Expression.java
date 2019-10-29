package Furama.Expression;

public interface Expression {
	void checkDienTichSuDungVaDienTichHoBoi(float dienTich) throws Exception;
	void checkChiPhiThue(double chiPhiThue) throws Exception;
	void checkSoLuongNguoiToiDa(int soNguoiToiDa) throws Exception;
	boolean getDichVuDiKem(String dichVuDiKem) throws Exception;
	void checkSoTang(int soTang) throws Exception;
}
