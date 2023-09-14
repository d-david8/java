package session15.practice.equals_and_hascode;

import java.util.HashSet;
import java.util.Set;

public class EqualsAndHascodePractice {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("Alice");
        emp1.setDepartment("IT");

        Employee emp2 = new Employee();
        emp2.setId(1);
        emp2.setName("Alice");
        emp2.setDepartment("IT");

        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(emp1);
        employeeSet.add(emp2);

        System.out.println("Set size:  " + employeeSet.size());
        System.out.println("emp1 hashcode: " + emp1.hashCode());
        System.out.println("emp2 hashcode: " + emp2.hashCode());

        System.out.println("emp1 print: " + emp1);
    }
}
