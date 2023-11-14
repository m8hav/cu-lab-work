package _java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoreExamples {
    public static int countMatchesTest(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Group Count: " + matcher.groupCount());

        int matches = 0;
        while (matcher.find())
            matches++;

        return matches;
    }

    public static boolean caseInsensitiveTest(String regex, String text) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }

    public static void runExample1() {
        int matches1 = countMatchesTest(".", "");
//        ^ . regex means anything but not empty
        System.out.println(matches1);

        int matches2 = countMatchesTest(".", " ");
        System.out.println(matches2);

        int matches3 = countMatchesTest(".", "B.Tech");
        System.out.println(matches3);
    }

    public static void runExample2() {
        String regex = "INFOSYS";

        String text1 = "InfosSYsInfosys";
        String text2 = "TcS";

        boolean matches1 = caseInsensitiveTest(regex, text1);
        System.out.println(matches1);

        boolean matches2 = caseInsensitiveTest(regex, text2);
        System.out.println(matches2);
    }

    public static void runExample3() {
        System.out.println("single match of University - case insensitive\n");

        Pattern pattern = Pattern.compile("University", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("CHITKARA UNIVERSITY");

        boolean matchFound = matcher.find();

//        checking single match
        if (matchFound)
            System.out.println("Match found from " + matcher.start() + " and ends at " + (matcher.end() - 1) + ".");
        else
            System.out.println("Match not found");
    }

    public static void runExample4() {
        System.out.println("all matches of University - case insensitive\n");

        Pattern pattern = Pattern.compile("University", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("university CHITKARA UNIVERSITY");

//        checking all matches
        while (matcher.find())
            System.out.println("Match found from " + matcher.start() + " and ends at " + (matcher.end() - 1) + ".");
    }

    public static void runExample5() {
        System.out.println("with *\n");

        Pattern pattern = Pattern.compile("Ja*");
//        * matches 0 or more of the preceding token

        Matcher matcher1 = pattern.matcher("Java is a technology and a platform. - Java Trainer");
        Matcher matcher2 = pattern.matcher("Jva is a technology and a platform. - Jaava Trainer");

        while (matcher1.find())
            System.out.println("Match found from " + matcher1.start() + " and ends at " + (matcher1.end() - 1) + ".");

        System.out.println();

        while (matcher2.find())
            System.out.println("Match found from " + matcher2.start() + " and ends at " + (matcher2.end() - 1) + ".");
    }

    public static void runExample6() {
        System.out.println("with *\n");

        Pattern pattern1 = Pattern.compile("Java*");
        Matcher matcher1 = pattern1.matcher("JavaJavaJava");

        Pattern pattern2 = Pattern.compile("(Java)*");
        Matcher matcher2 = pattern2.matcher("JavaJavaJava");

        while (matcher1.find())
            System.out.println("Match found from " + matcher1.start() + " and ends at " + (matcher1.end() - 1) + ".");

        System.out.println();

        while (matcher2.find())
            System.out.println("Match found from " + matcher2.start() + " and ends at " + (matcher2.end() - 1) + ".");
    }

    public static void runExample7() {
        System.out.println("with +\n");

        Pattern pattern1 = Pattern.compile("Java+");
        Matcher matcher1 = pattern1.matcher("JavaJavaJava");

        Pattern pattern2 = Pattern.compile("(Java)+");
        Matcher matcher2 = pattern2.matcher("JavaJavaJava");

        while (matcher1.find())
            System.out.println("Match found from " + matcher1.start() + " and ends at " + (matcher1.end() - 1) + ".");

        System.out.println();

        while (matcher2.find())
            System.out.println("Match found from " + matcher2.start() + " and ends at " + (matcher2.end() - 1) + ".");
    }

    public static void runExample8() {
        System.out.println("match anythings starting with uni\n");

        Pattern pattern = Pattern.compile("uni(versity)*", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("uniion union university universities");

        while (matcher.find())
            System.out.println("Match found from " + matcher.start() + " and ends at " + (matcher.end() - 1) + ".");
    }

    public static void main(String[] args) {

        runExample1();
        System.out.println("------------------------------");

        runExample2();
        System.out.println("------------------------------");

        runExample3();
        System.out.println("------------------------------");

        runExample4();
        System.out.println("------------------------------");

        runExample5();
        System.out.println("------------------------------");

        runExample6();
        System.out.println("------------------------------");

        runExample7();
        System.out.println("------------------------------");

        runExample8();
        System.out.println("------------------------------");

    }
}
