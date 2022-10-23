package Threads.Synchronization;

public class MyNewThread2 extends Thread{
        Display d;

        MyNewThread2(Display d){
            this.d = d;
        }

        @Override
        public void run() {
            d.displayChar();
        }
}
