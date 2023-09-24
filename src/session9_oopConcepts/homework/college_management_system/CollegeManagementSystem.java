package session9_oopConcepts.homework.college_management_system;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CollegeManagementSystem {

    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>();

        Professor professor1 = new Professor("Daniel", "Pop", "Masculine", "12111212", "Str. Street, No. 6, Cluj", 33, LocalDate.parse("1991-02-08"));
        Professor professor2 = new Professor("Mihai", "Ionescu", "Masculine", "2233232", "Str. Street, No. 12, Timisoara", 33, LocalDate.parse("1995-07-08"));

        Course math = new Course("Math", "calculations", "Every Monday", Duration.of(4, ChronoUnit.HOURS), professor1);
        Course cs = new Course("Computer science", "programming", "Every Friday", Duration.of(4, ChronoUnit.HOURS), professor2);

        courses.add(math);
        courses.add(cs);

        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
