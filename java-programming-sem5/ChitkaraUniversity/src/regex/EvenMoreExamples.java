package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvenMoreExamples {
    public static void runExample9() {
        System.out.println("Replacing matches\n");

        String sentence = "Python Regular Expressions, Python";

        String regex = "Python";
        String replacer = "Java";

        System.out.println("Before replacing: " + sentence);

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        String sentenceReplaced1 = matcher.replaceFirst(replacer);
        System.out.println("After replacing first occurrence: " + sentenceReplaced1);

        String sentenceReplaced2 = matcher.replaceAll(replacer);
        System.out.println("After replacing all occurrences: " + sentenceReplaced2);
    }

    public static void runExample10() {
        System.out.println("matching exact number of digits manually\n");

        Pattern pattern = Pattern.compile("Flight No.: \\d\\d\\d\\d\\d");
//        ^ for exact digits

        Matcher matcher1 = pattern.matcher("Flight No.: 1024");
        Matcher matcher2 = pattern.matcher("Flight No.: 10242");
        Matcher matcher3 = pattern.matcher("Flight No.: 1024234");
        Matcher matcher4 = pattern.matcher("Flight: 1024234");

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());
        System.out.println(matcher4.find());
    }

    public static void runExample11() {
        System.out.println("matching exact number of digits with quantifier - curly braces\n");

        Pattern pattern = Pattern.compile("Flight No.: \\d{5}");

        Matcher matcher1 = pattern.matcher("Flight No.: 1024");
        Matcher matcher2 = pattern.matcher("Flight No.: 10242");
        Matcher matcher3 = pattern.matcher("Flight No.: 1024234");
        Matcher matcher4 = pattern.matcher("Flight: 1024234");

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());
        System.out.println(matcher4.find());
    }

    public static void runExample12() {
        System.out.println("matching exact number or more number of digits with comma in quantifier\n");

        Pattern pattern = Pattern.compile("Flight No.: \\d{5,}");

        Matcher matcher1 = pattern.matcher("Flight No.: 1024");
        Matcher matcher2 = pattern.matcher("Flight No.: 10242");
        Matcher matcher3 = pattern.matcher("Flight No.: 1024234");
        Matcher matcher4 = pattern.matcher("Flight: 1024234");

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());
        System.out.println(matcher4.find());
    }

    public static void runExample13() {
        System.out.println("matching start and end\n");

        Pattern pattern = Pattern.compile("^[fF]light [Nn]o.: \\d{5,}$");

        Matcher matcher1 = pattern.matcher("Flight No.: 1024");
        Matcher matcher2 = pattern.matcher(" Flight No.: 1024");
        Matcher matcher3 = pattern.matcher("Flight no.: 10242");
        Matcher matcher4 = pattern.matcher("pFlight No.: 10242");
        Matcher matcher5 = pattern.matcher("Flight No.: 10242 ");
        Matcher matcher6 = pattern.matcher("flight No.: 1024234");
        Matcher matcher7 = pattern.matcher("Flight: 1024234");
        Matcher matcher8 = pattern.matcher("light no.: 10242");

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());
        System.out.println(matcher4.find());
        System.out.println(matcher5.find());
        System.out.println(matcher6.find());
        System.out.println(matcher7.find());
        System.out.println(matcher8.find());
    }

    public static void runExample14() {
        System.out.println("matching start and end\n");

        Pattern pattern = Pattern.compile("^(AafF)light [Nn]o.: \\d{5,}$");

        Matcher matcher1 = pattern.matcher("Flight No.: 1024");
        Matcher matcher2 = pattern.matcher(" Alight No.: 1024");
        Matcher matcher3 = pattern.matcher("flight no.: 10242");
        Matcher matcher4 = pattern.matcher("pFlight No.: 10242");
        Matcher matcher5 = pattern.matcher("Flight No.: 10242 ");
        Matcher matcher6 = pattern.matcher("flight No.: 1024234");
        Matcher matcher7 = pattern.matcher("Flight: 1024234");
        Matcher matcher8 = pattern.matcher("light no.: 10242");

        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());
        System.out.println(matcher4.find());
        System.out.println(matcher5.find());
        System.out.println(matcher6.find());
        System.out.println(matcher7.find());
        System.out.println(matcher8.find());
    }

    public static void runExample15() {
        System.out.println("Matching and replacing groups\n");

        Pattern pattern = Pattern.compile("^(\\d+) divided by (\\d+)$");
        Matcher matcher = pattern.matcher("10 divided by 2");

        if (matcher.find()) {
            String statement = "Result: " + matcher.replaceFirst("$1/$2");
//            ^ gets values of first and second groups
            System.out.println(statement);

            int result = Integer.parseInt(matcher.group(1)) / Integer.parseInt(matcher.group(2));
            System.out.println("Result: " + result);
        }
    }

    public static void runExample16() {
        System.out.println("Masking card number using group, digits, and quantifier\n");

        String cardNumber = "1234-2222-3333-0911";

        Pattern pattern = Pattern.compile("(\\d{4}-){3}");
        Matcher matcher = pattern.matcher(cardNumber);

        String maskedCardNumber = matcher.replaceAll("XXXX-XXXX-XXXX-");
//        ^ can't use regex in replacement

        System.out.println(maskedCardNumber);
    }

    public static void main(String[] args) {

        runExample9();
        System.out.println("------------------------------");

        runExample10();
        System.out.println("------------------------------");

        runExample11();
        System.out.println("------------------------------");

        runExample12();
        System.out.println("------------------------------");

        runExample13();
        System.out.println("------------------------------");

        runExample14();
        System.out.println("------------------------------");

//        IMPORTANT
        runExample15();
        System.out.println("------------------------------");

//        IMPORTANT
        runExample16();
        System.out.println("------------------------------");

    }
}
