package java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleExamples {
    public SimpleExamples() {
    }

    public void runExample1() {
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher("Java");

        System.out.println(matcher.find());
    }

    public void runExample2() {
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher("JavaJavaKavaJava");
        Matcher matcher2 = pattern.matcher("Java JavaKava Java");

        int matches = 0;
        while (matcher.find())
            matches++;
        System.out.println(matches);

        int matches2 = 0;
        while (matcher2.find())
            matches2++;
        System.out.println(matches2);
    }

    public static void main(String[] args) {
        SimpleExamples obj = new SimpleExamples();
        obj.runExample1();
        obj.runExample2();
    }
}
