package LiskovSubstitution2MultipleFiles;

public class Square extends Rectangle {
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
