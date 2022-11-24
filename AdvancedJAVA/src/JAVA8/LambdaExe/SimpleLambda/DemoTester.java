package JAVA8.LambdaExe.SimpleLambda;

public class DemoTester {
    public static void main(String[] args) {
//        Demo i = new Demo();
//        i.doTransaction();
//        i.m1();

//        Interf interf = new Demo();
//        interf.doTransaction();
//        interf.m1(); // can't do that

        System.out.println("#########################");
//        Interf obj = () -> {
//            System.out.println("dfgdgdg");
//        };
//        obj.doTransaction();
            Interf inter = (a, b) -> System.out.println("Sum: "+ (a + b));

            inter.doTransaction(6,8);

        Interf d = (n, m)-> {System.out.println("result:" + (n*m));};
        d.doTransaction(5,6);
    }
}
