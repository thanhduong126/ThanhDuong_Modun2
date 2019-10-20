package KeThua.ClassCircleAndCylinder;

public class Circle {
	private float banKinh;
	private String color;

	public Circle() {
	}

	public Circle(float banKinh, String color) {
		this.banKinh = banKinh;
		this.color = color;
	}

	public float getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(float banKinh) {
		this.banKinh = banKinh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle: \n" +
				"Bán kính: " + banKinh +"\b\b\n"+
				"Color: " + color +"\n";
	}
}
