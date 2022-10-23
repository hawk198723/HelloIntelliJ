package Thread.InheritanceCauseProb;

public class Window extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();   // if we add static, this prob will be solved.
    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(getName() + "Selling ticket, Printing, Ticket# is " + ticket);
                ticket--;
            }else{
                break;
            }

        }
    }
}
