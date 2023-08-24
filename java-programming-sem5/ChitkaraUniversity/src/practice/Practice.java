package practice;

class Box {
    int width;
    int height;
}

public class Practice {
    static void test(double d) {
        System.out.println("double");
    }
    private int a;
    private static int myflag;
    static void test(float f) {
        System.out.println("float");
    }

    public static void main(String[] args) {
        Box obj = new Box();
        obj.height = 10;
        System.out.println(~50);
        int Integer = 10;
        System.out.println(Integer);

        test(99);
        test(99.9);

        int n = 20;
        final int p = 25;
        final int q = 15;
        final int r = 2 * (p - q);
        switch (n) {
            case p: n = n + 1;
            case q: n = n + 2;
            case r: n = n + 3;
            default: n = n + 4;
        }
        System.out.println(n);

//        final String a = new String("bruh");
        final String a = "bruh";
        switch (a) {
            case a:
                System.out.println("hi");
            default:
                System.out.println("default");
        }

        Practice obj2 = new Practice();
        obj2.a = 2;
        System.out.println(myflag);

        System.out.println(Double.toString(12));
        StringBuilder bruh = new StringBuilder("bruh");

//        int zi;
//        boolean zb;
//        System.out.println(zi);
//        System.out.println(zb);
    }
}
