package KeThua.TrienKhaiLopTriangle;

public class Shape {
	private double size1=1.0;
	private double size2=1.0;
	private double size3=1.0;

	public Shape() {
	}

	public Shape(double size1, double size2, double size3) {
		this.size1 = size1;
		this.size2 = size2;
		this.size3 = size3;
	}

	public double getSize1() {
		return size1;
	}

	public void setSize1(double size1) {
		this.size1 = size1;
	}

	public double getSize2() {
		return size2;
	}

	public void setSize2(double size2) {
		this.size2 = size2;
	}

	public double getSize3() {
		return size3;
	}

	public void setSize3(double size3) {
		this.size3 = size3;
	}


	@Override
	public String toString() {
		return "Shape: " +
				"\nsize1: " + size1 +
				"\nsize2: " + size2 +
				"\nsize3: " + size3
				;
	}
}
