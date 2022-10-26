package Thread.Suspend.WaitMethod;

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("Producer 🏭");

        Consumer c1 = new Consumer(clerk);
        c1.setName("Consumer 1 ");
        Consumer c2 = new Consumer(clerk);
        c2.setName("Consumer 2 ");
        Consumer c3 = new Consumer(clerk);
        c3.setName("Consumer 3 ");

        p1.start();
        c1.start();
        c2.start();
        c3.start();
        // System.out.println("Producer about to stop the thread");
//         p1.stop();
//        System.out.println("Producer about to suspend");
//        p1.suspend();
//        System.out.println("Producer about to resume");
//        p1.resume();

//        try {
//            c1.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        c1.interrupt();
//        try {
//            c1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        c1.resume();
    }
}
