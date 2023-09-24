package session17_streamsAndOptional.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Given a list of products with attributes: name, category, and price; find the category
 * with the highest average price.
 * */
public class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1", "Category1", 50.0));
        products.add(new Product("Product2", "Category2", 60.0));
        products.add(new Product("Product3", "Category1", 40.0));
        products.add(new Product("Product4", "Category2", 70.0));
        products.add(new Product("Product5", "Category1", 55.0));

        Map<String, Double> categoryAveragePrice = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));

        Optional<Map.Entry<String, Double>> maxCategory = categoryAveragePrice.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        maxCategory.ifPresent(stringDoubleEntry ->
                System.out.println("Category: " + stringDoubleEntry.getKey() +
                        " price: " + stringDoubleEntry.getValue()));
    }
}
