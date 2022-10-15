package OpenClosed1MultipleFiles;

public class DrawingTool {
	public void drawShape(Shape someShpe) {
		if (someShpe.shape_code == 1) {
			drawRectangle(someShpe);
		} else if (someShpe.shape_code == 2) {
			drawCircle(someShpe);
		} else if (someShpe.shape_code == 3) {
			drawTriangle(someShpe);
		}
	}

	private void drawTriangle(Shape someShpe) {
		System.out.println("Draw a Triangle....!!");
	}

	private void drawCircle(Shape someShpe) {
		System.out.println("Draw a Circle....!!");

	}

	private void drawRectangle(Shape someShpe) {
		System.out.println("Draw a Rectangle....!!");

	}
}
