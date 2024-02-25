package middletest.areacalculator;

public class Rectangle implements Shape {
	private int horizontal;
	private int vertical;

	public Rectangle(int horizontal, int vertical) {
		this.horizontal = horizontal;
		this.vertical = vertical;
	}

	@Override
	public int getArea() {
		return horizontal * vertical;
	}
}
