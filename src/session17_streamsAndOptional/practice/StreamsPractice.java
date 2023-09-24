package session17_streamsAndOptional.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1999.99),
                new Product("Phone", 500.32));
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 53, 41, 75, 65),
                Arrays.asList(1, 11, 43, 43, 57, 64),
                Arrays.asList(1, 2, 33, 4, 545, 56)
        );

//        printEvenNumbers(numbers);
//        printEvenNumbersWithStream(numbers);
//        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce vel sapien at libero aliquet suscipit.";
//        printContainingSubstring(input, "pi");
//        printStringLengthMap(strings);
//        printProductsPrice(products);
//        printOfStringOfCharacters(strings);
//        printIncreasedPrices(products);
//        printFlatmap(listOfLists);
//        printCountedProducts(products);
        lazyStreamInitialization(strings);

    }

    private static void lazyStreamInitialization(List<String> strings) {
        Stream<String> stream = strings.stream()
                .filter(s -> {
                    System.out.println("Filter: " + s);
                    return s.startsWith("b");
                })
                .map(s -> {
                    System.out.println("Map: " + s);
                    return s.toUpperCase();
                });
        System.out.println("Stream created, no operation performed yet");
        stream.forEach(s -> System.out.println("Foreach: " + s));
    }

    private static void printCountedProducts(List<Product> products) {
        long count = products.stream()
                .filter(product -> product.getName().startsWith("L"))
                .filter(product -> product.getPrice() > 200)
                .count();
        System.out.println(count);

    }

    private static void printFlatmap(List<List<Integer>> input) {
        List<Integer> result = input.stream()
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        System.out.println(result);
    }

    private static void printIncreasedPrices(List<Product> products) {
        List<String> formattedPrices = products.stream()
                .map(product -> product.getPrice() * 1.1)
                .map(newPrice -> "$" + String.format("%.2f", newPrice))
                .toList();
        System.out.println(formattedPrices);
    }

    private static void printOfStringOfCharacters(List<String> input) {
        input.stream()
                .map(StreamsPractice::stringToChar)
                .forEach(System.out::println);

    }

    private static List<Character> stringToChar(String string) {
        return string.chars()
                .mapToObj(c -> (char) c)
                .toList();
    }

    public static void printProductsPrice(List<Product> products) {
        List<Double> result = products.stream()
                .map(Product::getPrice)
                .toList();
        System.out.println("List of prices: " + result);
    }


    private static void printStringLengthMap(List<String> input) {
        List<Integer> result = input.stream()
                .map(String::length)
                .toList();
        System.out.println("Length of strings: " + result);
    }

    private static void printContainingSubstring(String input, String substring) {
        List<String> wordsContainingSubstring = Arrays.stream(input.split(" "))
                .filter(word -> word.contains(substring))
                .toList();
        System.out.println(wordsContainingSubstring);
    }

    private static void printEvenNumbersWithStream(List<Integer> numbers) {
        //stream approach
        List<Integer> evenNumbersStream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Stream approach: " + evenNumbersStream);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        //traditional approach
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Traditional approach: " + evenNumbers);
    }


}
