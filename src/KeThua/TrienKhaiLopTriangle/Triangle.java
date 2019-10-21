package KeThua.TrienKhaiLopTriangle;

public class Triangle extends Shape{
	private String colorTriangle;

	public Triangle() {

	}

	public Triangle(double size1, double size2, double size3, String colorTriangle) {
		super(size1, size2, size3);
		this.colorTriangle = colorTriangle;
	}

	public String getColorTriangle() {
		return colorTriangle;
	}

	public void setColorTriangle(String colorTriangle) {
		this.colorTriangle = colorTriangle;
	}

	@Override
	public String toString() {
		return super.toString()+
				"\ncolorTriangle: " + colorTriangle
				;
	}
}
