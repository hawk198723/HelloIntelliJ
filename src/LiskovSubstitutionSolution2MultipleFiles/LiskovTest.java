package LiskovSubstitutionSolution2MultipleFiles;

public class LiskovTest {

	public static void main(String[] args) {

		
//		Shape shape = new Square(40);
		Shape shape = new Rectangle(20,40);
//		verify(rectangle);
		verify(shape);
	}

	public static void verify(Shape rec) {
//		rec.setWidth(20);
//		rec.setLength(30);

		System.out.println("Area is: " + rec.calculateArea());
	}
}
