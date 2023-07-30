package strings.stringMethods;

public class CommonStringMethods {
    public void runStringMethods() {
        String a = "  bruh   \n";
        String b = " bart   ";
        System.out.println();

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println();

        System.out.println("a.trim(): " + a.trim());
        System.out.println("b.trim(): " + b.trim());
        System.out.println();

//        String.strip() was introduced in Java 11
//        System.out.println("a.strip(): " + a.strip());
//        System.out.println("b.strip(): " + b.strip());

        System.out.println("a.toLowerCase(): " + a.toLowerCase());
        System.out.println("a.toUpperCase(): " + a.toUpperCase());
        System.out.println("a.length(): " + a.length());
        System.out.println("a.trim().length(): " + a.trim().length());
        System.out.println("a.isEmpty(): " + a.isEmpty());
        System.out.println("a.trim().charAt(1): " + a.trim().charAt(1));
    }
}
