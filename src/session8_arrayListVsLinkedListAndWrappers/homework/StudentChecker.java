package session8_arrayListVsLinkedListAndWrappers.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * 6. Given a LinkedList storing student names, write a program that checks if a particular student
 * name exists in the list. If it does, remove that name from the list.
 * */
public class StudentChecker {

    public static void main(String[] args) {
        List<String> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Frank");
        studentList.add("David");
        studentList.add("Eva");

        System.out.println("Current student list: " + studentList);

        System.out.print("Enter the student name to check and remove: ");
        String studentName = scanner.nextLine();

        if (studentList.contains(studentName)) {
            studentList.remove(studentName);
            System.out.println("Student removed: " + studentName);
        } else {
            System.out.println("Student not found in the list: " + studentName);
        }

        System.out.println("Updated student list: " + studentList);

        scanner.close();
    }
}
