package Thread.SynchronizationSolveProb.SynchronizationBlock.SolveRunnable;

class Window1 implements Runnable{
    private int ticket = 100;
//    Object obj = new Object();// create a lock , Object type

    WatchDog dog = new WatchDog();
    @Override
    public void run() {
        while (true){

            synchronized(dog){

                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName()+": Selling ticket--> Printing Ticket, Ticket # is " + ticket);
                    ticket --;
                }else {
                    break;
                }
            }

        }
    }
}

