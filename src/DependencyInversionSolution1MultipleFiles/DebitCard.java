package DependencyInversionSolution1MultipleFiles;

public class DebitCard implements BankCard{

	public void doTransaction(long amount) {
		// TODO Auto-generated method stub
		System.out.println("Using debit card.");
	}

}
