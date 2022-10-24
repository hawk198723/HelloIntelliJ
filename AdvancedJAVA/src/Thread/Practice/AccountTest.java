package Thread.Practice;

/*
* two persons share one bank account, one person deposit 1000 at a time, each person deposit 3 times.
*
*/
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(0);

        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("Marry");
        c2.setName("Ethan");

        c1.start();
        c2.start();
    }
}



