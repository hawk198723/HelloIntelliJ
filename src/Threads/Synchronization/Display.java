package Threads.Synchronization;

public class Display {
    public synchronized void displayNum() {
        Integer x = 0;

            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println( Thread.currentThread().getName() + "displays  num: " + i);
            }

    }

    public synchronized void displayChar(){
        for (int i = 65; i < 80 ; i++) {
            System.out.println( Thread.currentThread().getName() + "displays char: "+(char)i);
            i++;
            if (i == 2) {
                System.exit(-1);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
