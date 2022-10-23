package Thread.SynchronizationSolveProb.SynchronizationMethod.SolveInheritanceThread;

public class Window4 extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();   // if we add static, this prob will be solved.
    @Override
    public void run() {
        while (true){

            show(); //non static can call static mehtod
        }

    }

//    private synchronized void show(){ // lock: t1 t2 t3
private static synchronized void show(){ // lock: Window4.class  // static cannot call "this"
        if(ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "Selling ticket, Printing, Ticket# is " + ticket);
            ticket--;
        }
    }
}
