package dateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeExamples {
    private LocalTime time;

    public LocalTimeExamples() {
        time = LocalTime.now();
        System.out.println("Current LocalTime: " + time + "\n");
    }

    public void showCurrentTime() {
        System.out.println("Current Time: " + time);
    }

    public void showCurrentTimeWithAMPM() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss:nnnnnnnnn a");
        System.out.println("Current Time: " + time.format(formatter));
    }

    public void showCurrentHour() {
        System.out.println("Current Hour: " + time.getHour());
    }

    public void showCurrentMinute() {
        System.out.println("Current Minute: " + time.getMinute());
    }

    public void showCurrentSecond() {
        System.out.println("Current Second: " + time.getSecond());
    }

    public void showCurrentNano() {
        System.out.println("Current Nano: " + time.getNano());
    }

    public void showNextHour() {
        System.out.println("Next Hour: " + time.plusHours(1));
    }

    public void showPreviousHour() {
        System.out.println("Previous Hour: " + time.minusHours(1));
//        or
//        System.out.println("Previous Hour: " + time.plusHours(-1));
    }

    public void showNextMinute() {
        System.out.println("Next Minute: " + time.plusMinutes(1));
    }

    public void showPreviousMinute() {
        System.out.println("Previous Minute: " + time.minusMinutes(1));
//        or
//        System.out.println("Previous Minute: " + time.plusMinutes(-1));
    }

    public void showNextSecond() {
        System.out.println("Next Second: " + time.plusSeconds(1));
    }

    public void showPreviousSecond() {
        System.out.println("Previous Second: " + time.minusSeconds(1));
//        or
//        System.out.println("Previous Second: " + time.plusSeconds(-1));
    }

    public void showNextNano() {
        System.out.println("Next Nano: " + time.plusNanos(1));
    }

    public void showPreviousNano() {
        System.out.println("Previous Nano: " + time.minusNanos(1));
//        or
//        System.out.println("Previous Nano: " + time.plusNanos(-1));
    }

    public void showPositiveCounterInHour() {
        System.out.println("++ COUNTDOWN ++: " + time.plusHours(24));
    }

    public void showNegativeCounterInHour() {
        System.out.println("-- COUNTDOWN --: " + time.minusHours(24));
    }

    public static void main(String[] args) {
        LocalTimeExamples obj = new LocalTimeExamples();

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
