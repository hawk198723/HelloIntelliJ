package OpenClosed2;

public class PaymentProcessor {
	public void processPayment(PaymentMode paymentMode) {
		if (paymentMode == PaymentMode.CASH) {
			CashPayment cash = new CashPayment();
			cash.acceptPayment();
		} else if (paymentMode == PaymentMode.CREDIT_CARD) {
			CreditCardPayment credit = new CreditCardPayment();
			credit.acceptPayment();
		}
		else if (paymentMode == PaymentMode.GIFT) {
			GiftCardPayment gift = new GiftCardPayment();
			gift.acceptPayment();
		}
	}
}
