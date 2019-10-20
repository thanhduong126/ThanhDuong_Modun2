package KeThua.ClassCircleAndCylinder;

public class Cylinder extends Circle{
	private int chieuCao;
	private float theTich;

	public Cylinder() {
	}

	public Cylinder(float banKinh, String color, int chieuCao, float theTich) {
		super(banKinh, color);
		this.chieuCao = chieuCao;
		this.theTich = theTich;
	}

	public int getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(int chieuCao) {
		this.chieuCao = chieuCao;
	}

	public float getTheTich() {
		return theTich;
	}

	public void setTheTich(float theTich) {
		this.theTich = theTich;
	}

	@Override
	public String toString() {
		return super.toString() +
				"Chiều cao: " + chieuCao +"\n"+
				"Thể tích: " + theTich ;
	}
}
