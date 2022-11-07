package Thread.GC;


public class GCTest{
    public int x = 0;
    public int value = 0;
    public GCTest(){
        System.out.println("Hello");
    }

    public Object Lego(){
        this.value = 10;
        int x = 0;

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        System.out.println("Building");
        return x;
    }

    public static void main(String[] args) {

        GCTest obj=new GCTest();
        obj=null;

        GCTest a = new GCTest();
        GCTest b = new GCTest();
        b = a;

        System.out.println("Collecting garbage...");
//        System.gc();

        System.out.println("Done...");
    }



}