package session9_oopConcepts.homework.school_gradebook;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayStudentsWithAverageGrades() {
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", Average Grade: " + student.calculateAverageGrade());
        }
    }
}
