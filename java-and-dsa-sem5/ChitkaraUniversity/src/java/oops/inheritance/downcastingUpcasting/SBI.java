package java.oops.inheritance.downcastingUpcasting;

public class SBI extends Bank {
    public SBI(long turnover) {
        super(turnover);
    }

    @Override
    public void bankID() {
        System.out.println("SB010010");
    }

    @Override
    public void bankName() {
        System.out.println("SBI");
    }

    @Override
    public void bankLocation() {
        System.out.println("BANGALORE");
    }

    public void type() {
        System.out.println("PRIVATE");
    }

}
