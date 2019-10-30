package Furama.Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionCustomerImpl implements ExpressionCustomer{
	String EMAIL_PATTERN = "^(.+)@(.+)$";
	String DATE_PATTERN = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
	String NUMBER_ID = "(^[0-9]*$)";
	@Override
	public boolean checkEmail(String checkEmail) {
		Pattern pattern = Pattern. compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher((CharSequence)checkEmail);
		return matcher.matches();
	}

	@Override
	public boolean checkgioiTinh(String gioiTinh) throws Exception {
		if(gioiTinh.equals("Male")||gioiTinh.equals("Female")||gioiTinh.equals("Unknow")){
			return true;
		}
		throw new Exception("Erro!");
	}

	@Override
	public boolean checkIDCard(String checkIDCard) {
		Pattern pattern = Pattern. compile(NUMBER_ID);
		Matcher matcher = pattern.matcher((CharSequence)checkIDCard);
		return matcher.matches();
	}

	@Override
	public boolean checkngaySinh(String checkNgaySinh) {
		Pattern pattern = Pattern.compile(DATE_PATTERN);
		Matcher matcher = pattern.matcher((CharSequence)checkNgaySinh);
		return matcher.matches();
	}
}
