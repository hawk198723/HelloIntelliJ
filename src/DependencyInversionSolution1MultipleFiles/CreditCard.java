package DependencyInversionSolution1MultipleFiles;

public class CreditCard implements BankCard{

	public void doTransaction(long amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment using Credit Card.");
	}

}
