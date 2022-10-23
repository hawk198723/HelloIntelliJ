package Threads.Synchronization;

public class MyNewThread extends Thread {
    Display d;

    MyNewThread(Display d){
        this.d = d;
    }

    @Override
    public void run() {
        d.displayNum();
    }
}
