package DependencyInversionSolution1MultipleFiles;

public class ShoppingMall {
	
//	private CreditCard creditCard;
//	private DebitCard debitCard;
//	private Coupon coupon;
	private BankCard bankCard;
	
	public ShoppingMall(BankCard bankCard){
		this.bankCard = bankCard;
	}
	
//	public ShoppingMall(Coupon coupon) {
//		this.coupon = coupon;
//	}
	
	public void doPurchaseSomething(long amount) {
//		debitCard.doTransaction(amount);
		bankCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
//		CreditCard creditCard = new CreditCard();
//		DebitCard debitCard = new DebitCard();
		BankCard bankCard = new Coupon();
		
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPurchaseSomething(5000);
	}
}
