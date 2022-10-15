package OpenClosed1;

public class OpenClosed {
	public static void main(String[] args) {
		DrawingTool drawWhat = new DrawingTool();
		drawWhat.drawShape(new Rectangle());
		drawWhat.drawShape(new Circle());
		drawWhat.drawShape(new Triangle());

	}
}

class DrawingTool {
	public void drawShape(Shape someShpe) {
		if (someShpe.shape_code == 1) {
			drawRectangle(someShpe);
		} else if (someShpe.shape_code == 2) {
			drawCircle(someShpe);
		} else if (someShpe.shape_code == 3) {
			drawTriangle(someShpe);
		}
	}

	public void drawRectangle(Shape rec) {
		System.out.println("Draw a Rectangle!!....");
	}

	public void drawCircle(Shape cir) {
		System.out.println("Draw a Circle....!!");
	}

	public void drawTriangle(Shape tri) {
		System.out.println("Draw a Triangle....!!");
	}
}

// Base Class
class Shape {
	int shape_code;
}

class Rectangle extends Shape {
	Rectangle() {
		super.shape_code = 1;
	}
}

class Circle extends Shape {
	Circle() {
		super.shape_code = 2;
	}
}

class Triangle extends Shape {
	Triangle() {
		super.shape_code = 3;
	}
}
