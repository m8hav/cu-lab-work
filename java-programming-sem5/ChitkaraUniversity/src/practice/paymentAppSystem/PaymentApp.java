package practice.paymentAppSystem;

public abstract class PaymentApp {
    private int cashbackRate;
    // public void setCashbackRate(int rate) {
    //     cashbackRate = rate;
    // }
    abstract int checkCashback();
    abstract void payBill(int amount, String receiverID);
    public PaymentApp(int rate) {
        cashbackRate = rate;
    }
}
