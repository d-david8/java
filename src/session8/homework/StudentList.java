package session8.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Create
 *   2 empty ArrayLists: studentList and graduateStudentList
 *   populate studentList with 10 students
 *   copy values from studentList to graduateStudentList
 *   iterate through graduateStudentList and print each graduated student

 * */
public class StudentList {

    public static void main(String[] args) {
        printGraduatedStudens();
    }

    private static void printGraduatedStudens() {
        List<String> studentList = new ArrayList<>();
        List<String> graduateStudentList = new ArrayList<>();

        System.out.println("Give the name of the students:");
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);
            String studentName = scanner.nextLine();
            studentList.add(studentName);
        }
        graduateStudentList.addAll(studentList);

        for (String student : graduateStudentList) {
            System.out.println(student);
        }
    }
}
