package Thread.SynchronizationSolveProb.SynchronizationBlock.SolveInheritanceThread;

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 t1 = new Window1();
        Window1 t2 = new Window1();
        Window1 t3 = new Window1();

        t1.setName("Kiosk 1 ");
        t2.setName("Kiosk 2 ");
        t3.setName("Kiosk 3 ");

        t1.start();
        t2.start();
        t3.start();
    }
}
