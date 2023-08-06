package enumtypes.cardTrainersCode;


//bank will offer different type of cards based on customer salary
public class BankCardProvider {

    private static final String BANKNAME = "HDFC";
    private double customerSalary;

    private static final double MINSALARY = 100000.00;

    private static boolean isCustomerApplicable;
    private String approvedCardName;

    Customer customer;
    Card card;

    public BankCardProvider(Customer customer){
        this.customer = customer;
    }
    
    public void checkCustomerApplication() {
        if(customer.getCustomerSalary() >= MINSALARY) isCustomerApplicable = true;
        else isCustomerApplicable = false;
    }

    public static boolean isCustomerApplicable() {
        return isCustomerApplicable;
    }

    public String getCardApproved() {
        //default debit card to all customers
        approvedCardName = card.DEBIT_CARD.toString();

        //show all cards
        System.out.println("\nAll Available Cards : ");
        System.out.println("CARD NAME" + " \t - " + "LIMIT" + " | " + "FEE" + " | " + "SALARY\n" );

        for (Card card : Card.values()) {

            System.out.println(card + " \t - " + card.getCardLimit() + " | " + card.getAnnualFee() + " | " + card.getAnnualSalary() );

            //if(Double.compare(customer.getCustomerSalary(), customerAnnualSalary) >= 0) {
            if(customer.getCustomerSalary() >= card.getAnnualSalary()) {
                this.approvedCardName = card.name();
                //By default, Enum.toString() returns the same value as Enum.name().
            }
        }
        //show the approved card
        //System.out.println(approvedCardName);
        return approvedCardName;
    }

    public void showInformation() {
        System.out.println(BANKNAME + " Bank\n");

        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Salary: " + customer.getCustomerSalary());

        //System.out.println(isCustomerApplicable());
        if(isCustomerApplicable()) {
            System.out.println("\nApproved For Card : " + "YES");
            System.out.println("\nCard Approved : " + getCardApproved());
        }else {
            System.out.println("Approved For Card : " + "NO");
        }
    }

    //DRIVER CODE
    public static void main(String[] args) {

        String customerName = "Cecila";
        double annualSalary = 510000.00;

        Customer customer = new Customer(customerName, annualSalary);
        BankCardProvider obj = new BankCardProvider(customer);

        obj.checkCustomerApplication();
        obj.showInformation();
		
		/*
		if(){
			System.err.println("ERROR: ");
	        System.exit(-1);
		}
		*/
    }
}