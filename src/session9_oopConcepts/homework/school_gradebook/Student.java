package session9_oopConcepts.homework.school_gradebook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {

    private String name;
    private UUID uuid;
    private List<Double> grades;

    public Student(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
