package Payment;

public class CryptoPaymentService implements PaymentService {

    @Override
    public void processPayment(){

        System.out.println("Crypto");
    }
}
