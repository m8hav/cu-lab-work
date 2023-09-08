package dateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateTimeExamples {
    private LocalDateTime dt;

    public LocalDateTimeExamples() {
        dt = LocalDateTime.now();
        System.out.println("Current LocalDateTime: " + dt + "\n");
    }

    public void showLocalDate() {
        System.out.println("Current LocalDate: " + dt.toLocalDate());
    }

    public void showLocalTime() {
        System.out.println("Current LocalTime: " + dt.toLocalTime());
    }

    public void showLocalDateTimeOf(int year, Month month, int day, int hour, int minute) {
        if (year < 0 || day < 0 || day > 31 || hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.out.println("Invalid Date-Time arguments.");
            return;
        }
        LocalDateTime customDt = LocalDateTime.of(year, month, day, hour, minute);
        System.out.println(customDt);
    }

    public void showLocalDateInFormat() {
        String formattedDate = dt.format(DateTimeFormatter.ISO_DATE);
        System.out.println(formattedDate);
    }

    public void showCustomLocalDate() {
        String localDateUSA = dt.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String localDateUK = dt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("USA: " + localDateUSA);
        System.out.println("UK: " + localDateUK);
    }

    public void showCustomLocalDateTime() {
//        String localDateUSLong = dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.US));
//        ^ problem in long format with US Locale or something. Find it and solve it.
        String localDateUKShort = dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.UK));
//        System.out.println("USA Long: " + localDateUSLong);
        System.out.println("UK Short: " + localDateUKShort);
    }

//    ================================================================================
//    FROM LocalDate
//    ================================================================================

    public void showTodayDate() {
        System.out.println("Today: " + dt);
    }

    public void showCurrentYear() {
        System.out.println("Current Year: " + dt.getYear());
    }

    public void showCurrentMonth() {
        System.out.println("Current Month: " + dt.getMonth());
    }

    public void showCurrentMonthValue() {
        System.out.println("Current Month Value: " + dt.getMonthValue());
    }

    public void showDaysOfWeek() {
        System.out.println("Day of Week: " + dt.getDayOfWeek());
    }

    public void showDaysOfMonth() {
        System.out.println("Day of Month: " + dt.getDayOfMonth());
    }

    public void showDaysOfYear() {
        System.out.println("Day of Year: " + dt.getDayOfYear());
    }

    public void showNextDate() {
        System.out.println("Next Date: " + dt.plusDays(1));
    }

    public void showPreviousDate() {
        System.out.println("Previous Date: " + dt.minusDays(1));
//        or
//        System.out.println("Previous Date: " + dt.plusDays(-1));
    }

    public void showNextWeek() {
        System.out.println("Next Week: " + dt.plusWeeks(1));
    }

    public void showPreviousWeek() {
        System.out.println("Previous Week: " + dt.minusWeeks(1));
//        or
//        System.out.println("Previous Week: " + dt.plusWeeks(-1));
    }

    public void showNextMonth() {
        System.out.println("Next Month: " + dt.plusMonths(1));
    }

    public void showPreviousMonth() {
        System.out.println("Previous Month: " + dt.minusMonths(1));
//        or
//        System.out.println("Previous Month: " + dt.plusMonths(-1));
    }

    public void showNextYear() {
        System.out.println("Next Year: " + dt.plusYears(1));
    }

    public void showPreviousYear() {
        System.out.println("Previous Year: " + dt.minusYears(1));
//        or
//        System.out.println("Previous Year: " + dt.plusYears(-1));
    }

    public void showLeapYear() {
        System.out.println("Checking leap year not supported in LocalDateTime. It's supported only in LocalDate.");
//        if (dt.isLeapYear())
//            System.out.println(dt.getYear() + " is a leap year.");
//        else
//            System.out.println(dt.getYear() + " is not a leap year.");
    }

//    ================================================================================
//    FROM LocalTime
//    ================================================================================

    public void showCurrentTime() {
        System.out.println("Current Time: " + dt);
    }

    public void showCurrentTimeWithAMPM() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss:nnnnnnnnn a");
        System.out.println("Current Time: " + dt.format(formatter));
    }

    public void showCurrentHour() {
        System.out.println("Current Hour: " + dt.getHour());
    }

    public void showCurrentMinute() {
        System.out.println("Current Minute: " + dt.getMinute());
    }

    public void showCurrentSecond() {
        System.out.println("Current Second: " + dt.getSecond());
    }

    public void showCurrentNano() {
        System.out.println("Current Nano: " + dt.getNano());
    }

    public void showNextHour() {
        System.out.println("Next Hour: " + dt.plusHours(1));
    }

    public void showPreviousHour() {
        System.out.println("Previous Hour: " + dt.minusHours(1));
//        or
//        System.out.println("Previous Hour: " + dt.plusHours(-1));
    }

    public void showNextMinute() {
        System.out.println("Next Minute: " + dt.plusMinutes(1));
    }

    public void showPreviousMinute() {
        System.out.println("Previous Minute: " + dt.minusMinutes(1));
//        or
//        System.out.println("Previous Minute: " + dt.plusMinutes(-1));
    }

    public void showNextSecond() {
        System.out.println("Next Second: " + dt.plusSeconds(1));
    }

    public void showPreviousSecond() {
        System.out.println("Previous Second: " + dt.minusSeconds(1));
//        or
//        System.out.println("Previous Second: " + dt.plusSeconds(-1));
    }

    public void showNextNano() {
        System.out.println("Next Nano: " + dt.plusNanos(1));
    }

    public void showPreviousNano() {
        System.out.println("Previous Nano: " + dt.minusNanos(1));
//        or
//        System.out.println("Previous Nano: " + dt.plusNanos(-1));
    }

    public void showPositiveCounterInHour() {
        System.out.println("++ COUNTDOWN ++: " + dt.plusHours(24));
    }

    public void showNegativeCounterInHour() {
        System.out.println("-- COUNTDOWN --: " + dt.minusHours(24));
    }

    public static void printSeparator(String title) {
        System.out.println();
        System.out.println("================================================================================");
        System.out.println("FROM LocalDate");
        System.out.println("================================================================================");
        System.out.println();
    }

    public static void main(String[] args) {
        LocalDateTimeExamples obj = new LocalDateTimeExamples();

        obj.showLocalDate();
        obj.showLocalTime();
        System.out.println();

        obj.showLocalDateTimeOf(2022, Month.JANUARY, 25, 6, 30);
        obj.showLocalDateInFormat();
        System.out.println();

        obj.showCustomLocalDate();
        obj.showCustomLocalDateTime();
        System.out.println();

//    ================================================================================
//    FROM LocalDate
//    ================================================================================

        printSeparator("FROM LocalDate");
        System.out.println();

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

//    ================================================================================
//    FROM LocalTime
//    ================================================================================

        printSeparator("FROM LocalTime");
        System.out.println();

        obj.showCurrentTime();
        System.out.println();

        obj.showCurrentTimeWithAMPM();
        System.out.println();

        obj.showCurrentHour();
        obj.showCurrentMinute();
        obj.showCurrentSecond();
        obj.showCurrentNano();
        System.out.println();

        obj.showNextHour();
        obj.showPreviousHour();
        System.out.println();

        obj.showNextMinute();
        obj.showPreviousMinute();
        System.out.println();

        obj.showNextSecond();
        obj.showPreviousSecond();
        System.out.println();

        obj.showNextNano();
        obj.showPreviousNano();
        System.out.println();

        obj.showPositiveCounterInHour();
        System.out.println();

        obj.showNegativeCounterInHour();
        System.out.println();
    }
}
