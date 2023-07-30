package strings.regexTest;

public class RegexTest {
    public void runRegex() {

//        Regex to match only digits
        String regex1 = "\\d";
//        Regex to match only non-digits
        String regex2 = "\\D";

        String a = "asdf";
        String b = "asdf!@#$";
        String c = "123";
        String d = "123asdf";
        String e = "123!@#$";
        String f = "123!@#asd";

        System.out.printf("Regex1 - %s:\n", regex1);
        System.out.println(a.matches(regex1));
        System.out.println(b.matches(regex1));
        System.out.println(c.matches(regex1));
        System.out.println(d.matches(regex1));
        System.out.println(e.matches(regex1));
        System.out.println(f.matches(regex1));
        System.out.println();

        System.out.printf("Regex2 - %s:\n", regex2);
        System.out.println(a.matches(regex2));
        System.out.println(b.matches(regex2));
        System.out.println(c.matches(regex2));
        System.out.println(d.matches(regex2));
        System.out.println(e.matches(regex2));
        System.out.println(f.matches(regex2));
    }
}
