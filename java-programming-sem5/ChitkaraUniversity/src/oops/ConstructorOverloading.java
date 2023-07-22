package oops;

public class ConstructorOverloading {
    public final String one, two;
    public final int a, b;

    public ConstructorOverloading (String one, String two, int a, int b) {
        this.one = one;
        this.two = two;
        this.a = a;
        this.b = b;
    }
    public ConstructorOverloading(int a, int b) {
        this(null, null, a, b);
    }

    public static void main(String[] args) {
        System.out.println("in public static void main method");

        for (int i = 1; i <= 5; i++) System.out.println(i);

        ConstructorOverloading objOne = new ConstructorOverloading(5, 10);
        System.out.println(objOne.one);
        System.out.println(objOne.two);
        System.out.println(objOne.a);
        System.out.println(objOne.b);

        ConstructorOverloading objTwo = new ConstructorOverloading("hello", "world", 5, 10);
        System.out.println(objTwo.one);
        System.out.println(objTwo.two);
        System.out.println(objTwo.a);
        System.out.println(objTwo.b);
    }

}

final class Another {}
// Cannot inherit class that is declared final
// abstract class AnotherOne extends Another {}
