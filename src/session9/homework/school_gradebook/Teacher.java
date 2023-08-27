package session9.homework.school_gradebook;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private List<Course> courses;

    public Teacher(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudentToCourse(String courseName, Student student) {
        boolean courseNotFound = true;
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.addStudent(student);
                courseNotFound = false;
                break;
            }
        }
        if (courseNotFound) {
            System.out.println("Course not found, the student was not added");
        }
    }

    public void assignGradeToStudent(String courseName, String studentName, double grade) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                List<Student> students = course.getStudents();
                for (Student student : students) {
                    if (student.getName().equals(studentName)) {
                        student.addGrade(grade);
                        break;
                    }
                }
                break;
            }
        }
    }

    public void displayStudentsForACourse(String courseName) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.displayStudentsWithAverageGrades();
            }
        }
    }
}
