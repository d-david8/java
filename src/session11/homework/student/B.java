package session11.homework.student;

public class B extends Marks {
    private int subject1, subject2, subject3, subject4;

    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        return totalMarks / 4 * 1;
    }
}