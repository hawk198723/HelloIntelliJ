package Thread.InheritanceCauseProb;

public class Window extends Thread{
    private static int ticket = 100;
private static Object obj = new Object();   // if we add static, this prob will be solved.
    @Override
    public void run() {
        while (true){

            // for inheritance we cannot use this all the time, but we could use Window.class, because class is an object as well --> Class clazz = Window.class
            synchronized (Window.class){ //the reason it doesn't work here because it has to work with one obj, but in Window.java, we have three window instances, and every instance has one object.
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
}
