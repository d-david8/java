package session4_javaOperatorsAndLoops.practice;

public class JavaStatments {

    public static void main(String[] args) {
        int currentYear = 2023;
        int birthDay = 1991;
        int age = currentYear - birthDay;
//        System.out.println("Age is: "+ age);

//        if(age >= 18){
//            System.out.println("Eligible to vote.");
//        }else{
//            System.out.println("Not eligible to vote.");
//        }
        int number = 15;
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is zero");
        }
//        printMName();
//        printDistinction();
    }

    public static void printMName() {
        String name = "Ioana";
        String city = "Cluj";
        String sex = "f";
        int age = 20;

        if (city.equals("Cluj")) {
            if (sex.equals("f")) {
                if (age == 20) {
                    System.out.println(name);
                }
            }
        }
        if (city.equals("Cluj") && sex.equals("f") && age == 20) {
            System.out.println(name);
        }
    }

    public static void printDistinction() {
        int mark = 70;

        if (mark >= 85) {
            System.out.println("Distinction");
        } else if (mark >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
