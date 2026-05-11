package Payment;

public class CreditCardPaymentService implements PaymentService {

    @Override
    public void processPayment(){

        System.out.println("Credit Card..");
    }
}