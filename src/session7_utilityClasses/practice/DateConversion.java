package session7_utilityClasses.practice;

import java.util.Date;

public class DateConversion {

    public static void main(String[] args) {
        Date utilDate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        System.out.println("java.util.Date: " + utilDate);
        System.out.println("java.sql.Date: " + sqlDate);
    }
}
