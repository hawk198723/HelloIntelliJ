package Thread.SynchronizationSolveProb.SynchronizationMethod.SolveRunnable;

class Window2 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while (true){

            show();
        }

    }

    private synchronized void show(){ // lock:this
        if(ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName()+": Selling ticket--> Printing Ticket, Ticket # is " + ticket);

            ticket --;
        }
    }
}
