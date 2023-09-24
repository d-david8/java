package session7_utilityClasses.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDatePractice {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDateIncrement = localDate.plusDays(10);
        System.out.println(localDateIncrement);

        System.out.println(findNextSunday(LocalDate.now()));
    }

    public static LocalDate findNextSunday(LocalDate localDate) {
        return localDate.plusDays(DayOfWeek.SUNDAY.getValue() - localDate.getDayOfWeek().getValue());
    }
}
