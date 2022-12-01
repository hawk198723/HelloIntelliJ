package JAVA8.LambdaExe.SimpleLambdaExe;

public class Test {
    public static void main(String[] args) {
        A obj = () -> System.out.println("walar!!");
        obj.show();
    }
}
