package Payment;

public class PaypalPaymentService implements PaymentService {

    @Override
    public void processPayment() {
        System.out.println("PayPal");
    }
}