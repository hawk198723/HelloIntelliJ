package Threads.GarbageCollection.FinalizeMethod;

public class GarbageCollection {

    static GarbageCollection s;

    public static void main(String[] args) {
        String s1 = new String("Jason");
        s1 = null;
        System.gc();

        GarbageCollection garbageCollection = new GarbageCollection();
        System.out.println(garbageCollection.hashCode());
        garbageCollection.finalize();

        garbageCollection = null;

        System.out.println(garbageCollection.hashCode());
        System.out.println("end of method");

        Dog dog = new Dog("Hello ");

        garbageCollection = null;
    }

    public void finalize(){
        System.out.println("finalize method called");
        System.out.println(10 / 0);
    }
}
