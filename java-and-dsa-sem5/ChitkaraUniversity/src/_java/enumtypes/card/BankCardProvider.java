package _java.enumtypes.card;

public class BankCardProvider {

    private static final String BANK_NAME = "HDFC";
    private static final double MIN_SALARY = 100_000.00;

//    Debit Card given to all customers by default
    private Card card = Card.DEBIT_CARD;
    private Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public boolean isCustomerApplicable() {
        return customer.getCustomerSalary() >= MIN_SALARY;
    }

    public void approveAppropriateCard() {
        if (customer == null) {
            System.out.println("\nPLEASE SET A CUSTOMER BEFORE REQUESTING CARD APPROVAL");
            return;
        }

//        showing all cards
        System.out.println("\nALL AVAILABLE CARDS:");
        System.out.println("CARD NAME \t - FEE | LIMIT | SALARY\n");
        for (Card cardVal: Card.values()) {
            System.out.println(cardVal + " \t - " + cardVal.getAnnualFee() + " | " + cardVal.getCardLimit() + " | " + cardVal.getAnnualSalary());
            if (customer.getCustomerSalary() >= cardVal.getAnnualSalary()) {
                this.card = cardVal;
            }
        }
    }

    public void showInformation() {
        if (customer == null) {
            System.out.println("\nPLEASE SET A CUSTOMER BEFORE REQUESTING CARD INFORMATION");
            return;
        }

        System.out.println("\n\n====BANK AND CARD INFORMATION====");
        System.out.println(BANK_NAME + " Bank");

        System.out.println("\nCustomer Name: " + customer.getCustomerName());
        System.out.println("Customer Annual Salary: " + customer.getCustomerSalary());

        if (isCustomerApplicable()) {
            System.out.println("\nApproved For Card: " + "YES");
            System.out.println("Card Approved: " + this.card);
        } else {
            System.out.println("\nApproved For Card: " + "NO");
        }
    }
}
