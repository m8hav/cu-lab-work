package practice;

class PA {
    static int a = 0;
    int b = 0;
    static void print() {
        System.out.println("hey from A");
    }
}

class PB extends PA {
//    static fields are inherited
    static void printA() {
        System.out.println(a);
    }
//    normal fields are inherited too
    void printB() {
        System.out.println(b);
    }
}

class PC extends PA {
    static void print() {
        System.out.println("hey from C");
    }
}

class PD extends PA {
//    @Override
    int b = 2;
//    @Override
    static int a = 1;
//    ^ gives error on both because @Override annotation is not applicable to fields

//    @Override
//    ^ here gives error because @Override annotation cannot be used on static methods
    static void print() {
        System.out.println("hey from D");
    }
}

public class StaticInheritanceTest {
    public static void main(String[] args) {
        PA.print();
        PB.print();
        PC.print();
        PD.print();
    }
}
