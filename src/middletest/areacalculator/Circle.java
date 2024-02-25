package middletest.areacalculator;

public class Circle implements Shape {
	private int radius; // 반지름

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public int getArea() {
		return (int)(Math.PI * radius * radius);
	}
}
