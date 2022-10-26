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

    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("Kiosk 1 ");
        t2.setName("Kiosk 2 ");
        t3.setName("Kiosk 3 ");

        t1.start();
        t2.start();
        t3.start();
    }
}
