package _java.strings.reverseStringManually;

public class ReverseStringManually {

    public String stringReverse(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }
    public void runProgram() {
        String str = "Bart";
        System.out.println(stringReverse(str));
    }

    public static void main(String[] args) {
        ReverseStringManually obj = new ReverseStringManually();
        obj.runProgram();
    }
}
