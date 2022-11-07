package Thread.GC;
public class GCTest{
    public int x = 0;
    public int value = 0;
    public GCTest(){
        System.out.println("Hello");
    }

    public static Object Lego(){
        int x = 0;
        System.out.println(Runtime.getRuntime().totalMemory());
//        Runtime runtime = Runtime.getRuntime();
//        runtime.gc();
        Runtime.getRuntime().gc();
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println("Building");
        return x;
    }

    public static void main(String[] args) {

        GCTest obj = new GCTest();
        obj = null;

        GCTest a = new GCTest();
        GCTest b = new GCTest();
        b = a;

        Lego();
        System.out.println("Collecting garbage...");

//        System.out.println(Runtime.getRuntime().totalMemory());
//        System.gc();
//        System.out.println(Runtime.getRuntime().totalMemory());
//        System.out.println(Runtime.getRuntime().freeMemory());


        System.out.println("Done...");
    }



}