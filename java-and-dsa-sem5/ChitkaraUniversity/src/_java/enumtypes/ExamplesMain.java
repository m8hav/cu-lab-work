package _java.enumtypes;

enum Weekdays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Level {
    LOW, MEDIUM, HIGH
}

public class ExamplesMain {
    public static void main(String[] args) {
        Weekdays today = Weekdays.FRIDAY;
        System.out.println(today);

        Level myLevel = Level.MEDIUM;
        System.out.println(myLevel);
    }
}
