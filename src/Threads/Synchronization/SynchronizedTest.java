package Threads.Synchronization;

public class SynchronizedTest {
    public static void main(String[] args) {
        Display d = new Display();
        Display d1 = new Display();

        MyNewThread t1 = new MyNewThread(d);
        MyNewThread2 t2 = new MyNewThread2(d1);

        t1.setName("Robot 1 ");
        t2.setName("Robot 2 ");

        t1.start();
        t2.start();

    }
}
