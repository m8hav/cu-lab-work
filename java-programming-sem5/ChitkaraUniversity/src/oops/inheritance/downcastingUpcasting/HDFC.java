package oops.inheritance.downcastingUpcasting;

public class HDFC extends Bank {
    public HDFC(long turnover) {
        super(turnover);
    }

    @Override
    public void bankID() {
        System.out.println("HD110011");
    }

    @Override
    public void bankName() {
        System.out.println("HDFC Bank");
    }

    @Override
    public void bankLocation() {
        System.out.println("DELHI");
    }

    public void type() {
        System.out.println("PRIVATE");
    }

}
