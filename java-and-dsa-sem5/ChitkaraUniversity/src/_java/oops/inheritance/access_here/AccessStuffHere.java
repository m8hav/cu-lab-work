package _java.oops.inheritance.access_here;

import _java.oops.inheritance.access_this.AccessFromThis;

// cannot access classes that are not public in another package
// import oops.inheritance.access_this.Sample;

public class AccessStuffHere extends AccessFromThis {
    protected int c = 10;
    public void check() {
//        System.out.println(super);
//        ^ cannot print super since super is a reference to the parent class objects, but there is no parent class object and that class is just inherited here in this child class, and the only object is of this child class now, so super has no relevance and thus cannot be printed.
        System.out.println(this);
//      ^ this keyword does the job of referencing to the current class object.
    }
    public static void main(String[] args) {
        AccessStuffHere obj = new AccessStuffHere();
        AccessFromThis obj2 = new AccessFromThis();
        System.out.println(obj2.a);
        System.out.println(obj.c);
        System.out.println(obj.b);
        // cannot access methods or fields from another package if they aren't public or (protected with inheritance)
        System.out.println(obj.a);
        System.out.println(obj);
        obj.check();
    }
}

class AnotherOne extends AccessStuffHere {
    void bruh () {
        AnotherOne obj = new AnotherOne();
        System.out.println(obj.c);

        AccessFromThis obj2 = new AccessFromThis();
        System.out.println(obj2.a);
        // cannot access protected methods or fields from another class if it isn't inherited
        // System.out.println(obj2.b);

    }
}