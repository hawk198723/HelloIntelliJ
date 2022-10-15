package DependencyInversionSolution1Abstract;

public class ShoppingMall {

//	private BankCard bankCard;
//
//	public ShoppingMall(BankCard bankCard) {
//		this.bankCard = bankCard;
//	}

	public static void buySome(Object obj, Integer i) {
		CreditCard c = new CreditCard();

		try {
			c.doTransaction(i);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Your transaction has been declind.");
		}
		System.out.println("You are buying an item " + obj + " at a cost of " + i + "$.");
	}

}
