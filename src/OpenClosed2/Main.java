package OpenClosed2;

public class Main {

	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();
		processor.processPayment(PaymentMode.CREDIT_CARD);
		processor.processPayment(PaymentMode.CASH);
		processor.processPayment(PaymentMode.GIFT);
	}

}
