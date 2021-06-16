package advance.dev;

public abstract class Shape {
	private String name;
	public Shape(String name) {
		super();
		this.name = name;
	}
	public abstract double chuVi();
	public abstract double dienTich();
}
