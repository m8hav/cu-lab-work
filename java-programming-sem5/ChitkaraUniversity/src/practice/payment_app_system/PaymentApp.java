package practice.payment_app_system;

public abstract class PaymentApp {
    private int cashbackRate;
    abstract int checkCashback();
    abstract void payBill(int amount, String receiverID);
}
