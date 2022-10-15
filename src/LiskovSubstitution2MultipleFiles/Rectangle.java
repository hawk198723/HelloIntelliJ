package LiskovSubstitution2MultipleFiles;

public class Rectangle {
	private int width;
	private int length;

	public Rectangle() {
	}

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getLength() {
		return width;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public int calculateArea() {
		return this.length * this.width;
	}


}
