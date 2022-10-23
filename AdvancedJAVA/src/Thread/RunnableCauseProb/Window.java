package Thread.RunnableCauseProb;

class Window implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                try {
                    Thread.sleep(100);
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
