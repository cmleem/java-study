package middletest.areacalculator;

public class areaCalculatorMain {
	public static void main(String[] args) {
		Circle circle = new Circle(4);
		Rectangle rectangle = new Rectangle(5, 6);
		Triangle triangle = new Triangle(7, 8);

		System.out.println("원의 면적: " + circle.getArea());
		System.out.println("사각형의 면적: " + rectangle.getArea());
		System.out.println("삼각형의 면적: " + triangle.getArea());
	}
}
