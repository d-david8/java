package session11.homework.student;

public class MarksMain {

    public static void main(String[] args) {
        A studentA = new A(85, 90, 77);
        B studentB = new B(92, 88, 76, 94);

        System.out.println("Student A Percentage: " + studentA.getPercentage() + "%");
        System.out.println("Student B Percentage: " + studentB.getPercentage() + "%");
    }
}
