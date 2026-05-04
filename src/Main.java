import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Payment mobilePayment = new MobilePayment(1000,"dialog","0771234577","ez cash");
        Payment cryptoPayment = new CryptoPayment(10000,"Binance","BTC","123456786");
        Payment cashPayment = new CashPayment(1000, "C-Clarke",1000);


        List <Payment> payments = new ArrayList<>();

        payments.add(mobilePayment);
        payments.add(cryptoPayment);
        payments.add(cashPayment);

        for (Payment payment:payments){
            payment.printAmount();
        }

        Refundable refundableCashPayment = new CashPayment(1200,"keels",1500);
        Refundable refundableMobilePayment = new MobilePayment(1200,"keels","21333", "dialog");

        List <Refundable> refundable = new ArrayList<>();

        refundable.add(refundableMobilePayment);
        refundable.add(refundableCashPayment);

        for (Refundable payment:refundable){
            payment.getRefundPolicy();
        }



    }
}
