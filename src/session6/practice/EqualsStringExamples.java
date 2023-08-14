package session6.practice;

public class EqualsStringExamples {

    public static void main(String[] args) {
        String color1 = "Blue";
        String color2 = "blue";

        System.out.println(color1.equals(color2));
        System.out.println(color1.equalsIgnoreCase(color2));
        System.out.println(color1.toLowerCase().equals(color2.toLowerCase()));
    }
}
