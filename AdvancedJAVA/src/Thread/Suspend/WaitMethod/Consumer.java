package Thread.Suspend.WaitMethod;

public class Consumer extends Thread{

    private Clerk clerk;
    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + ": starting consuming product...");

        while (true){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.consumeProduct();
        }
    }
}
