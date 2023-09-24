package session17_streamsAndOptional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Given a list of employee objects with attributes: name, department, and salary;
 * find the department with the highest total salary.
 * */
public class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR", 5000));
        employees.add(new Employee("Bob", "IT", 6000));
        employees.add(new Employee("John", "IT", 7000));
        employees.add(new Employee("David", "Finance", 5500));
        employees.add(new Employee("Eve", "Finance", 6000));

        // Group employees by department and calculate the total salary for each department
        Map<String, Double> departmentTotalSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)));

        Optional<Map.Entry<String, Double>> maxSalary = departmentTotalSalary.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        if (maxSalary.isPresent()) {
            System.out.println("Department: " + maxSalary.get().getKey() + " total salary: " + maxSalary.get().getValue());
        }
    }
}
