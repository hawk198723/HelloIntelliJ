package DependencyInversionSolution1Abstract;

public class CreditCard extends BankCard{
	
	private int amount;

	public void doTransaction(long amount) {
//		Bank b = new Bank();???????
		// TODO Auto-generated method stub
		System.out.println("Payment using Credit Card.");
	}

}
