package practice.paymentAppSystem;

public class Paytm extends PaymentApp implements BankAccountInterface {
    static int userCount = 0;
    static int cashbackRate = 5;
    int paytmID;
    int balance;
    public int checkCashback() {
        return cashbackRate;
    }
    public void payBill(int amount, String receiverID){
        System.out.println("Paid Rs. " + amount + " to ID " + receiverID + ".");
    }
    public int checkBalance() {
        return this.balance;
    }
    public void addMoney(int amount) {
        this.balance += amount;
        System.out.println("Added Rs. " + amount + " to your bank account.");
    }
    public int withdrawMoney(int amount) {
        if (amount >= this.balance) {
            this.balance -= amount;
            return amount;
        }
        System.out.println("Not enough balance.");
        return 0;
    }
    public Paytm(User userID) {
        super(5);
        this.paytmID += userCount++;
        this.balance = 0;
    }
}
