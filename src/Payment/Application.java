package Payment;

public class Application {

    public static void main(String[] args) {

        OrderService payPalOrderService = new OrderService( new PaypalPaymentService());
        payPalOrderService.processOrder();

        OrderService cryptoOrderService = new OrderService( new CryptoPaymentService());
        cryptoOrderService.processOrder();
    }
}
