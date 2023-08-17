package session7.practice.time_tracking_system;

import java.time.LocalDateTime;
import java.util.Random;

public class TimeTrackingSystem {

    public static void main(String[] args) {
        Random random = new Random();
        Employee employee = new Employee();
        employee.setName("John");
        employee.setNIN(String.valueOf(random.nextInt(1, 1000)));

        TimeLog timeLog1 = new TimeLog();
        timeLog1.setCheckIn(LocalDateTime.now().minusHours(8));
        timeLog1.setCheckOut(LocalDateTime.now());

        TimeLog timeLog2 = new TimeLog();
        timeLog2.setCheckIn(LocalDateTime.now().minusHours(8));
        timeLog2.setCheckOut(LocalDateTime.now());

        employee.addTimeLog(timeLog1);
        employee.addTimeLog(timeLog2);

        System.out.println("Employee " + employee.getName() + ", with NIN " + employee.getNIN() + ", worked a total of " + employee.getHoursWorked() + " hours.");
    }
}