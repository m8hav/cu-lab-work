package _java.strings.compareStrings;

public class CompareStrings {
    public CompareStrings() {
        String a = new String("a");
        String b = "a";     // same as new String("a");

        System.out.println("a == b: " + (a == b));              // false
        System.out.println("a.equals(b): " + a.equals(b));      // true

        String c = a;
        System.out.println("a == c: " + (a == c));              // true
        System.out.println("a.equals(c): " + a.equals(c));      // true
    }
}
