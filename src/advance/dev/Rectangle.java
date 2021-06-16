package advance.dev;

public class Rectangle extends Shape {
	private double a,b;
	public Rectangle(double a, double b, String name) {
		super(name);
		this.a = a;
		this.b = b;
	}
	@Override
	public double chuVi() {
		return (a+b)*2;
	}

	@Override
	public double dienTich() {
		return a*b;
	}
	@Override
	public String toString() {
		return "Rectangle Chu vi: " + chuVi() + "\tDientich: " + dienTich();
	}
}
