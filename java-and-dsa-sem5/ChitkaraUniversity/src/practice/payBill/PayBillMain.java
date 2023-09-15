package practice.payBill;

public class PayBillMain {
    public static void main(String[] args) {

//        creating initial variables with values
        String month = "January";
        double[] bill = {10000, 100, 500, 1000, 2500};

//        creating object with shallow copy of arguments
        PayBill objShallow = new PayBill(month, bill, true);
        objShallow.getMonthlyBill();

//        creating object with deep copy of arguments
        PayBill objDeep = new PayBill(month, bill, false);
        objDeep.getMonthlyBill();

//        changing values of variables
        month = "February";
        bill[0] = 50;
        bill[2] = 200;
        bill[4] = 300;
        System.out.println("\n---CHANGED VALUES OF VARIABLES---");
        System.out.println("Changed bill");

        objShallow.getMonthlyBill();
        objDeep.getMonthlyBill();
    }
}
