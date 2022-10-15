package OpenClosedSolution2;

public class Main {

	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();
		processor.processPayment(new ApplePayment());
//		processor.processPayment(PaymentMode.CASH);
//		processor.processPayment(PaymentMode.GIFT);
	}

}
