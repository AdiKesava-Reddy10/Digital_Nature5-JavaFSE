interface PaymentStrategy {
    void pay();
}

class UPI implements PaymentStrategy {

    public void pay() {
        System.out.println("UPI Payment");
    }
}

class Card implements PaymentStrategy {

    public void pay() {
        System.out.println("Card Payment");
    }
}

public class StrategyExample {

    public static void main(String[] args) {

        PaymentStrategy p =
                new UPI();

        p.pay();
    }
}
//