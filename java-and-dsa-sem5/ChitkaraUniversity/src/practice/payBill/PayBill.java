package practice.payBill;

public class PayBill {
    private String month;

    private double rent;
    private double water;
    private double mobile;
    private double internet;
    private double electricity;

    private final String[] labels = {"Rent", "Water", "Mobile", "Internet", "Electricity"};
    private double[] bill = new double[5];
    boolean shallowCopy;

    public PayBill(String month, double [] bill, boolean shallowCopy) {
        this.month = month;
        this.shallowCopy = shallowCopy;
        if (shallowCopy) this.bill = bill;
        else {
//            for (int i = 0; i < bill.length; i++) this.bill[i] = bill[i];
//            OR
            System.arraycopy(bill, 0, this.bill, 0, bill.length);
        }
    }

    public void getMonthlyBill() {
        System.out.println("\n--" + (shallowCopy ? "Shallow Copy" : "Deep Copy") + "--");
        System.out.println(month);
        for (int i = 0; i < labels.length; i++) {
            System.out.printf("%s: " + bill[i] + "\n", labels[i]);
        }
        System.out.println();
    }
}
