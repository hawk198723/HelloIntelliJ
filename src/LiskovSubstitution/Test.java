package LiskovSubstitution;

public class Test {

	public static void main(String[] args) {
		A obj = new A();
		obj.dosome();
		
		A obj1 = new B();
		obj1.dosome();

	}

}
