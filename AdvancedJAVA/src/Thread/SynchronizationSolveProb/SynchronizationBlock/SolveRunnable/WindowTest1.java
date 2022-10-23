package Thread.SynchronizationSolveProb.SynchronizationBlock.SolveRunnable;

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("KIOSK 1");
        t2.setName("KIOSK 2");
        t3.setName("KIOSK 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
