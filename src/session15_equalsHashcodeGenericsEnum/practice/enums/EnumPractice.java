package session15_equalsHashcodeGenericsEnum.practice.enums;

public class EnumPractice {

    public static void main(String[] args) {
        printEnumValues();
        printDayMessage(Day.MONDAY);
    }

    private static void printEnumValues() {
        for (Day day : Day.values())
            System.out.println(day + " is week day? " + day.isWeekday());
    }

    private static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("Start of the week");
            case TUESDAY -> System.out.println("Second day of the week");
            default -> System.out.println("Invalid day.");
        }
    }
}
