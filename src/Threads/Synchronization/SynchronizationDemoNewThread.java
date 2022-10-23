package Threads.Synchronization;

public class SynchronizationDemoNewThread extends Thread{
    SynchronizationDemoDisplay d;
    SynchronizationDemoNewThread(SynchronizationDemoDisplay d){
        this.d = d;
    }

    public void run(){
        d.displaynum();
    }
}
