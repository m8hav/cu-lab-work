package java.enumtypes.card;

public class CardExampleMain {
    public static void main(String[] args) {
        String customerName = "Bart";
        double customerSalary = 600_000;

        Customer customer1 = new Customer(customerName, customerSalary);
        BankCardProvider bankCardProvider = new BankCardProvider();

        bankCardProvider.setCustomer(customer1);
        bankCardProvider.approveAppropriateCard();

        bankCardProvider.showInformation();

    }
}
