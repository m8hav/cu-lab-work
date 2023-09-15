package java.oops.inheritance.downcastingUpcasting;

abstract public class Bank {

    private String bankID;
    private String bankName;
    private String Location;

    private long turnover;

    public Bank(long turnover) {
        this.turnover = turnover;
    }
    public abstract void bankID();
    public abstract void bankName();
    public abstract void bankLocation();
    public void turnover(){
        System.out.printf("Turnover: %d\n", turnover);
    }
}
