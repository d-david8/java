package session8_arrayListVsLinkedListAndWrappers.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 5. Create an ArrayList that stores city names. Add at least five city names initially.
 * Then, prompt the user to add a city name. If the city name is already in the list, display
 * a message saying it's a duplicate; otherwise, add it to the list.
 * */
public class CityNames {

    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        cityList.add("Cluj");
        cityList.add("Timisoara");
        cityList.add("Dej");
        cityList.add("Bucuresti");
        cityList.add("Arad");

        System.out.println("Current city list: " + cityList);

        System.out.print("Enter a city name to add: ");
        String newCity = scanner.nextLine();

        if (cityList.contains(newCity)) {
            System.out.println("City already exists in the list: " + newCity);
        } else {
            cityList.add(newCity);
            System.out.println("City added to the list: " + newCity);
        }

        System.out.println("Updated city list: " + cityList);

        scanner.close();
    }
}
