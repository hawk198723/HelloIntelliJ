package LiskovSubstitutionSolution1MultipleFiles;
public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));
		
		B b = new B();
		System.out.println("11+3=" + b.func1(11, 3));
		System.out.println("1+8=" + b.func1(1, 8));
		System.out.println("11+3+9=" + b.func2(11, 3));
		
		System.out.println("11-3=" + b.func3(11, 3));
	}
}



