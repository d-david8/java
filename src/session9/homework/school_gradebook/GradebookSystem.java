package session9.homework.school_gradebook;

public class GradebookSystem {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mihai Pop");
        Course mathCourse = new Course("Math");

        teacher.addCourse(mathCourse);

        Student student1 = new Student("Ion");
        Student student2 = new Student("Ana");

        teacher.addStudentToCourse(mathCourse.getName(), student1);
        teacher.addStudentToCourse(mathCourse.getName(), student2);

        teacher.assignGradeToStudent(mathCourse.getName(), "Ion", 8.0);
        teacher.assignGradeToStudent(mathCourse.getName(), "Ion", 5.0);
        teacher.assignGradeToStudent(mathCourse.getName(), "Ana", 9.5);
        teacher.assignGradeToStudent(mathCourse.getName(), "Ana", 7.0);

        teacher.displayStudentsForACourse("Math");
    }

}
