package LiskovSubstitutionSolution1MultipleFiles;
public class B extends BaseClass {

	private A a = new A();

	public int func1(int a, int b) {
		return a + b;
	}

	public int func2(int a, int b) {
		return func1(a, b) + 9;
	}

	public int func3(int a, int b) {
		return this.a.func1(a, b);
	}
}