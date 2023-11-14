package _java.autoboxing;

public class AutoBoxing {
    public static void main(String[] args) {
        // Autoboxing
        int a = 10;
        Integer aI = a;
        aI = Integer.valueOf(a);

        // Unboxing
        Integer bI = 5;
        int b = bI;
        b = bI.intValue();
    }
}
