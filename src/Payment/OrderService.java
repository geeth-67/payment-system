package Payment;

public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {   // coding to the interface

        this.paymentService = paymentService;
    }

    public void processOrder() {

        System.out.println("Order is processing");
        paymentService.processPayment();
    }
}
