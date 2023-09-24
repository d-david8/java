package session7_utilityClasses.practice;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
        getLocalDateTimeDecrement(localDateTime, 22);

        LocalDateTime start = LocalDateTime.now();
        LocalDateTime stop = LocalDateTime.now().plusDays(1);

        prntLocalDateTimeDifference(start, stop);
        printFormatedLocalDateTime(start);
    }

    public static void getLocalDateTimeDecrement(LocalDateTime localDateTime, long decrementHours) {
        System.out.println(localDateTime.minusHours(decrementHours));
    }

    public static void prntLocalDateTimeDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.toSeconds();

        System.out.printf("time diff is %d hours %d minutes %d seconds", hours, minutes, seconds);
    }

    public static void printFormatedLocalDateTime(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formatDateTime = localDateTime.format(formatter);

        System.out.println("\n" + formatDateTime);

    }
}
