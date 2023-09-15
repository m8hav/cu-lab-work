package practice.payBill;

class Second {
    Second bruh = new Second();
    public static void main(String[] args) {
        System.out.println("Main in non-public class Second");
    }
}

public class MultipleMains {
    public static void main(String[] args) {
        System.out.println("Main in public class MultipleMains");
    }
}

class Third {
    public static void main(String[] args) {
        System.out.println("Main in non-public class Third");
        StringBuilder bruh;
    }
}
