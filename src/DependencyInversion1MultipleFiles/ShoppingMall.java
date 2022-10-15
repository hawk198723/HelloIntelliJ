package DependencyInversion1MultipleFiles;

public class ShoppingMall {
	
//	private CreditCard creditCard;
	private DebitCard debitCard;
	private Coupon coupon;
	
	public ShoppingMall(DebitCard debitCard){
		this.debitCard = debitCard;
	}
	
	public ShoppingMall(Coupon coupon) {
		this.coupon = coupon;
	}
	
	public void doPurchaseSomething(long amount) {
//		debitCard.doTransaction(amount);
		coupon.doTransaction(amount);
	}
	
	public static void main(String[] args) {
//		CreditCard creditCard = new CreditCard();
		DebitCard debitCard = new DebitCard();
		Coupon coupon = new Coupon();
		
		ShoppingMall shoppingMall = new ShoppingMall(coupon);
		shoppingMall.doPurchaseSomething(5000);
	}
}
