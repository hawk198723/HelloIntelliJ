package Thread.Suspend.WaitMethod;

public class Clerk {

    private int productCount = 0;
    public synchronized void produceProduct() {
        if (productCount < 20 ) {
            productCount ++;
            System.out.println(Thread.currentThread().getName() + " starts producing, product Number: " + productCount);
            notify();
        }else {
            try {
                wait();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void consumeProduct() {
        if (productCount > 0 ) {
            System.out.println(Thread.currentThread().getName() + " starts consuming, product Number: " + productCount);
            productCount --;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
