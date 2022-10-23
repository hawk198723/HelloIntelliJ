package Threads.Synchronization;

public class SynchronizationDemoDisplay {
    public void displaynum(){
        Integer x =0;
        System.out.println(Thread.currentThread().getName());

        synchronized (x){
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
