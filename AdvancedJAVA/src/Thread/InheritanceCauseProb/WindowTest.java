package Thread.InheritanceCauseProb;

public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("Kiosk 1 ");
        t2.setName("Kiosk 2 ");
        t3.setName("Kiosk 3 ");

        t1.start();
        t2.start();
        t3.start();
    }
}
