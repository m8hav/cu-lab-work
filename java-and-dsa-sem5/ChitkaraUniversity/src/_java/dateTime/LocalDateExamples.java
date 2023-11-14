package _java.dateTime;

import java.time.LocalDate;

public class LocalDateExamples {
    private LocalDate date;

    public LocalDateExamples() {
        date = LocalDate.now();
        System.out.println("Current LocalDate: " + date + "\n");
    }

    public void showTodayDate() {
        System.out.println("Today: " + date);
    }

    public void showCurrentYear() {
        System.out.println("Current Year: " + date.getYear());
    }

    public void showCurrentMonth() {
        System.out.println("Current Month: " + date.getMonth());
    }

    public void showCurrentMonthValue() {
        System.out.println("Current Month Value: " + date.getMonthValue());
    }

    public void showDaysOfWeek() {
        System.out.println("Day of Week: " + date.getDayOfWeek());
    }

    public void showDaysOfMonth() {
        System.out.println("Day of Month: " + date.getDayOfMonth());
    }

    public void showDaysOfYear() {
        System.out.println("Day of Year: " + date.getDayOfYear());
    }

    public void showNextDate() {
        System.out.println("Next Date: " + date.plusDays(1));
    }

    public void showPreviousDate() {
        System.out.println("Previous Date: " + date.minusDays(1));
//        or
//        System.out.println("Previous Date: " + date.plusDays(-1));
    }

    public void showNextWeek() {
        System.out.println("Next Week: " + date.plusWeeks(1));
    }

    public void showPreviousWeek() {
        System.out.println("Previous Week: " + date.minusWeeks(1));
//        or
//        System.out.println("Previous Week: " + date.plusWeeks(-1));
    }

    public void showNextMonth() {
        System.out.println("Next Month: " + date.plusMonths(1));
    }

    public void showPreviousMonth() {
        System.out.println("Previous Month: " + date.minusMonths(1));
//        or
//        System.out.println("Previous Month: " + date.plusMonths(-1));
    }

    public void showNextYear() {
        System.out.println("Next Year: " + date.plusYears(1));
    }

    public void showPreviousYear() {
        System.out.println("Previous Year: " + date.minusYears(1));
//        or
//        System.out.println("Previous Year: " + date.plusYears(-1));
    }

    public void showLeapYear() {
        if (date.isLeapYear())
            System.out.println(date.getYear() + " is a leap year.");
        else
            System.out.println(date.getYear() + " is not a leap year.");
    }

    public static void main(String[] args) {
        LocalDateExamples obj = new LocalDateExamples();

        obj.showTodayDate();
        System.out.println();

        obj.showCurrentYear();
        obj.showCurrentMonth();
        System.out.println();

        obj.showCurrentMonthValue();
        System.out.println();

        obj.showDaysOfWeek();
        obj.showDaysOfMonth();
        obj.showDaysOfYear();
        System.out.println();

        obj.showNextDate();
        obj.showPreviousDate();
        System.out.println();

        obj.showNextWeek();
        obj.showPreviousWeek();
        System.out.println();

        obj.showNextMonth();
        obj.showPreviousMonth();
        System.out.println();

        obj.showNextYear();
        obj.showPreviousYear();
        System.out.println();

        obj.showLeapYear();
        System.out.println();
    }
}
