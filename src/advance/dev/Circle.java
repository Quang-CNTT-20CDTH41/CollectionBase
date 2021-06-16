package advance.dev;

public class Circle extends Shape {
	private double b;
	public Circle(double b, String name) {
		super(name);
		this.b = b;
	}
	@Override
	public double chuVi() {
		return b*2*Math.PI;
	}

	@Override
	public double dienTich() {
		return b*b*Math.PI;
	}
	@Override
	public String toString() {
		return "Circle Chu vi: " + chuVi() + "\tDientich: " + dienTich();
	}

}
