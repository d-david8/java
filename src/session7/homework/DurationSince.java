package session7.homework;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Description: Construct a method dubbed elapsedTimeSince that ingests a prior time
 * (in the HH:MM:SS format) as its input and displays the time duration from that moment to the present.
 * Input: A time given in the format HH:MM:SS.
 * Expected Output: The time span given as X hours, Y minutes, Z seconds.
 * */
public class DurationSince {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the time (HH:MM:SS): ");
        String timeString = scanner.nextLine();

        elapsedTimeSince(timeString);

        scanner.close();
    }

    public static void elapsedTimeSince(String timeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime givenTime = LocalTime.parse(timeString, formatter);
        LocalTime currentTime = LocalTime.now();

        Duration duration = Duration.between(currentTime, givenTime);

        long hours = duration.toHours();
        long minutes = duration.toMinutes() - (hours * 60);
        long seconds = duration.toSeconds() - (hours * 3600) - (minutes * 60);

        System.out.printf("The time span given as %d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
}
