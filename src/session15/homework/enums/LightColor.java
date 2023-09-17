package session15.homework.enums;

/*
 * Create an enum called LightColor that represents the three colors of a traffic light: red, yellow, and green.
 * Each color should have a string representation and a duration (in seconds) associated with it
 * (e.g., red = "Stop", 30 seconds; yellow = "Caution", 5 seconds; green = "Go", 45 seconds).
 * */
public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private final String displayString;
    private final int durationInSeconds;

    LightColor(String displayString, int durationInSeconds) {
        this.displayString = displayString;
        this.durationInSeconds = durationInSeconds;
    }

    public String getDisplayString() {
        return displayString;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public static void main(String[] args) throws InterruptedException {
        for (LightColor color : LightColor.values()) {
            System.out.println(color + " - " + color.getDisplayString() + " (" + color.getDurationInSeconds() + " seconds)");
        }
    }
}
