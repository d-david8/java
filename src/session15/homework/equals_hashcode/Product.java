package session15.homework.equals_hashcode;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int id;

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Product A", 100, 1001);
        Product product2 = new Product("Product B", 150, 1001);

        System.out.println("Are the products equal? " + product1.equals(product2));
        System.out.println("Hash code for product1: " + product1.hashCode());
        System.out.println("Hash code for product2: " + product2.hashCode());

        product2.id = 1002;
        System.out.println("Are the products not equal? " + product1.equals(product2));
        System.out.println("Hash code for product1 after id change: " + product1.hashCode());
        System.out.println("Hash code for product2 after id change: " + product2.hashCode());
    }
}
