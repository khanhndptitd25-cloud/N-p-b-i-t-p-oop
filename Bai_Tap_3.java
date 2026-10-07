interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    private String name = "thẻ tín dụng";
    private String type = "không dùng tiền mặt";

    @Override
    public void pay(double amount) {
        System.out.printf("Thanh toán %.0f bằng %s.\n", amount, name);
    }
}

class PayPalPayment implements PaymentMethod {
    private String name = "PayPal";
    private String type = "không dùng tiền mặt";

    @Override
    public void pay(double amount) {
        System.out.printf("Thanh toán %.0f qua %s.\n", amount, name);
    }
}

class CashPayment implements PaymentMethod {
    private String name = "tiền mặt";
    private String type = "trực tiếp";

    @Override
    public void pay(double amount) {
        System.out.printf("Thanh toán %.0f bằng %s.\n", amount, name);
    }
}

class MoMoPayment implements PaymentMethod {
    private String name = "MoMo";
    private String type = "không dùng tiền mặt";

    @Override
    public void pay(double amount) {
        System.out.printf("Thanh toán %.0f qua %s.\n", amount, name);
    }
}

class Order {
    private String customerName;
    private double amount;
    private PaymentMethod paymentMethod;

    public Order(String customerName, double amount, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        System.out.println("Khách hàng: " + customerName);
        paymentMethod.pay(amount);
        System.out.println(); // Dòng trống ngăn cách
    }
}

public class Bai_Tap_3 {
    public static void main(String[] args) {
        Order order1 = new Order("An", 200000, new CreditCardPayment());
        Order order2 = new Order("Bình", 150000, new PayPalPayment());
        Order order3 = new Order("Chi", 100000, new CashPayment());
        Order order4 = new Order("Dũng", 300000, new MoMoPayment());

        order1.checkout();
        order2.checkout();
        order3.checkout();
        order4.checkout();
    }
}
