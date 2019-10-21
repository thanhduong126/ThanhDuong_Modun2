package LopVaDoiTuongTrongJAVA.PhuongTrinhBacHai;

public class QuadraticEquation {
	//Giai phuong trinh bac 2
	private double a,b,c;
	final double DELTA =b*b-(4*a*c);
	public QuadraticEquation() {
	}

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	public double getDiscriminant(){
		return b*b-(4*a*c);
	}
	public double getRoot1(){
		return ((-b+Math.sqrt(getDiscriminant()))/(2*a));
	}
	public double getRoot2(){
		return 	((-b-Math.sqrt(getDiscriminant()))/(2*a));
	}
	public double getRoot3(){
		return -b/(2*a);
	}
	@Override
	public String toString() {
		return "QuadraticEquation: " +
				"\na= " + a +
				"\nb= " + b +
				"\nc= " + c ;
	}
}
