package Thread.SynchronizationSolveProb.SynchronizationMethod.SolveInheritanceThread;

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 t1 = new Window4();
        Window4 t2 = new Window4();
        Window4 t3 = new Window4();

        t1.setName("Kiosk 1 ");
        t2.setName("Kiosk 2 ");
        t3.setName("Kiosk 3 ");

        t1.start();
        t2.start();
        t3.start();
    }
}
