package Threads;

public class TestRunnableDemo {
    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo( "Thread One");
        R1.start();

        RunnableDemo R2 = new RunnableDemo( "Thread Two");
        R2.start();
    }
}
