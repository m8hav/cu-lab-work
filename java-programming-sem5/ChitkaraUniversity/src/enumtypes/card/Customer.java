package enumtypes.card;

public class Customer {
    private final String customerName;
    private final double customerSalary;

    public Customer(String customerName, double customerSalary) {
        this.customerName = customerName;
        this.customerSalary = customerSalary;
    }

    public String getCustomerName() {
        return customerName;
    }
    public double getCustomerSalary() {
        return customerSalary;
    }
}
