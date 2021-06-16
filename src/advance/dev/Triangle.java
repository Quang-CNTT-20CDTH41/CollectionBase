package advance.dev;

public class Triangle extends Shape{
	private double a,b,c;
	
	public Triangle(String name, double a, double b, double c) {
		super(name);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double chuVi() {
		return (a + b + c);
	}

	@Override
	public double dienTich() {
		double p = chuVi() / 2;
		double s = (p*(p-a)*(p-b)*(p-c));
		return s;
	}
	@Override
	public String toString() {
		return "Circle Chu vi: " + chuVi() + "\tDientich: " + dienTich();
	}
}
