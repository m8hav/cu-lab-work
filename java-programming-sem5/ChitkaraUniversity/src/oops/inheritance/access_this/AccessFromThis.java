package oops.inheritance.access_this;

class Sample {
    public int a = 10;
}

public class AccessFromThis extends Sample {
    protected int b = 20;

    public static void main(String[] args) {
        AccessFromThis obj = new AccessFromThis();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
