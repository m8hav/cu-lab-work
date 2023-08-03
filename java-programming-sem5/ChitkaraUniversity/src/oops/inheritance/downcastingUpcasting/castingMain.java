package oops.inheritance.downcastingUpcasting;

public class castingMain {
    public static void main(String[] args) {

//        Bank bankObj = new Bank();
//        HDFC hdfcObj = new HDFC();

//        UPCASTING
        Bank bankObj = new HDFC(500000000);     // 50 crores

        bankObj.bankID();
        bankObj.bankName();
        bankObj.bankLocation();

        bankObj.turnover();


//        DOWNCASTING TO ACCESS METHODS IN CHILD OBJECT
        HDFC hdfcObj = (HDFC) bankObj;
        hdfcObj.type();


    }
}
