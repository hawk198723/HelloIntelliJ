package LiskovSubstitutionSolution2MultipleFiles;

public class Square implements Shape {
	private int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int calculateArea() {
		return this.side * this.side;
	}
}
