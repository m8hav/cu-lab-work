package practice.paymentAppSystem;

public interface BankAccountInterface {
    int balance = 0;
    int checkBalance();
    void addMoney(int amount);
    int withdrawMoney(int amount);
}
