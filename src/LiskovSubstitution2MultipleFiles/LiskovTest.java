package LiskovSubstitution2MultipleFiles;

public class LiskovTest {

	public static void main(String[] args) {
//		Rectangle rectangle = new Rectangle(20, 30);
		
		Square square = new Square(20);
		
//		verify(rectangle);
		verify(square);
	}

	public static void verify(Rectangle rec) {
		rec.setWidth(20);
		rec.setLength(30);

		System.out.println("Area is: " + rec.calculateArea());
	}
}
