package practice.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MonthCalendar {
    LocalDate date;

    public MonthCalendar() {
        date = LocalDate.now();
    }

    public void showCalendar() {
        int currentYear = date.getYear();
        Month currentMonth = date.getMonth();
        int daysInCurrentMonth = currentMonth.length(date.isLeapYear());

        System.out.println("===== CALENDAR - " + currentMonth + ", " + currentYear + " =====");
        System.out.println();

        date = LocalDate.of(currentYear, currentMonth, 1);
        DayOfWeek day = date.getDayOfWeek();

        for (DayOfWeek weekDay : DayOfWeek.values()) {
            System.out.printf("%2s%-10s|", "", weekDay);
        }
        System.out.println();
        for (DayOfWeek weekDay : DayOfWeek.values()) {
            System.out.print("------------|");
        }
        System.out.println();

        int currentDate = 1;
        while (currentDate <= daysInCurrentMonth) {
            for (DayOfWeek weekDay : DayOfWeek.values()) {
                if (weekDay == day && currentDate <= daysInCurrentMonth) {
                    System.out.printf("%7s%5s|", currentDate++, "");
                    day = day.plus(1);
                }
                else
                    System.out.printf("%-12s|", "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MonthCalendar calendar = new MonthCalendar();
        calendar.showCalendar();
    }
}
