package middletest.areacalculator;

public class Triangle implements Shape {
	private int base; //밑변
	private int height;

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public int getArea() {
		return (int)(0.5 * base * height);
	}
}
