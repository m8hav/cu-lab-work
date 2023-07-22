package oops;

public class ConstructorOverloadingInheritance extends ConstructorOverloading{
    private final String c;

    public ConstructorOverloadingInheritance(int a, int b) {
        super(a, b);
        this.c = null;
    }

    public ConstructorOverloadingInheritance(String one, String two, int a, int b, String c) {
        super(one, two, a, b);
        this.c = c;
    }

    public static void main(String [] args) {
        ConstructorOverloadingInheritance objThree = new ConstructorOverloadingInheritance(15, 20);
        ConstructorOverloadingInheritance objFour = new ConstructorOverloadingInheritance("hello", "there", 15, 20, "guys!");

        System.out.println(objThree.one);
        System.out.println(objThree.two);
        System.out.println(objThree.a);
        System.out.println(objThree.b);
        System.out.println(objThree.c);

        System.out.println();

        System.out.println(objFour.one);
        System.out.println(objFour.two);
        System.out.println(objFour.a);
        System.out.println(objFour.b);
        System.out.println(objFour.c);

    }

}

// Cannot inherit class that is declared final
// class AnotherOne extends Another {}