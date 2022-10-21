package Threads;

public class YieldThread extends Thread {
    public YieldThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("" + this.getName() + "<->" + i);

            if (i == 20) {
                System.out.println("--------yield starts!--------");
                this.yield();

            }
        }
    }
    public static void main(String[] args) {
        YieldThread yt1 = new YieldThread("Jason");
        YieldThread yt2 = new YieldThread("TTTTTTTTTT");
        yt1.start();
//        yt1.join(20000);
        yt2.start();
    }
}