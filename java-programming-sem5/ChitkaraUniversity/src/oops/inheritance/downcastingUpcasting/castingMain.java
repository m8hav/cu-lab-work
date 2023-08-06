package oops.inheritance.downcastingUpcasting;

public class castingMain {
    public static void main(String[] args) {

//        UPCASTING
        Bank bankObj = new HDFC(500000000);     // 50 crores
        bankObj.bankID();
        bankObj.bankName();
        bankObj.bankLocation();
        bankObj.turnover();
//        bankObj.type();
//        ^ can't use this method since the reference is of the class Bank which doesn't have this method
//        so we have to downcast in order to use this method

//        DOWNCASTING TO ACCESS METHODS IN CHILD OBJECT
        HDFC hdfcObj = (HDFC) bankObj;
        hdfcObj.type();

    }
}
