interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Paid using Card");
    }
}

public class OCPExample {
    public static void main(String[] args) {

        Payment p1 = new UpiPayment();
        p1.pay();

        Payment p2 = new CardPayment();
        p2.pay();
    }
}