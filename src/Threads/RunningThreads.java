package Threads;

public class RunningThreads extends Thread {
    public static void main(String[] args) {
        RunningThreads thread = new RunningThreads();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}