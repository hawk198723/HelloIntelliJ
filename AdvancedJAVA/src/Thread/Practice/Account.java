package Thread.Practice;

class Account{
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    //    public void deposit(double amount){
    public synchronized void deposit(double amount){
        if (amount > 0) {
            balance = balance + amount;

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": deposit successfully! Your remaining balance is: " + balance);
        }
    }
}