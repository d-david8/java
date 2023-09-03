package session11.homework.student;

public class A extends Marks {
    private int subject1, subject2, subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3;
        return totalMarks / 3;
    }
}
