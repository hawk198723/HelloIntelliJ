package OpenClosedSolution1;

public class OpenClosedSolution {
	public static void main(String[] args) {
		DrawingTool drawWhat = new DrawingTool();
		drawWhat.drawShape(new Rectangle());
		drawWhat.drawShape(new Circle());
		drawWhat.drawShape(new Triangle());
		drawWhat.drawShape(new Square());
	}
}

class DrawingTool {
	public void drawShape(Shape someShape) {
		someShape.draw();
	}

}

// Base Class
abstract class Shape {

	public abstract void draw();
}

class Rectangle extends Shape {
	Rectangle() {
	}

	public void draw() {
		System.out.println("Draw a Rectangle!!");
	}
}

class Circle extends Shape {
	Circle() {
	}

	public void draw() {
		System.out.println("Draw a Circle!!");

	}
}

class Triangle extends Shape {
	Triangle() {
	}

	public void draw() {
		System.out.println("Draw a Triangle!!");
	}
}

class Square extends Shape {
	Square() {
	}

	public void draw() {
		System.out.println("Draw a Square!!");
	}
}
