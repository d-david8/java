package session14.homework.frequent_shoping_items;

import session13.homework.online_shopping_system.*;
public class FrequentShoppingItems {

    public static void main(String[] args) {
        Product product1 = new Product("Product 1", "Description of product 1", 1, 3);
        Product product2 = new Product("Product 2", "Description of product 2", 2, 5);
        Product product3 = new Product("Product 3", "Description of product 3", 2, 5);

        Customer customer1 = new Customer("Dan", "dan@email.com", "Cetatii 322", "Dorobantilor 36");

        //adding products to the customer 1 shopping cart
        customer1.addToCart(product1, 1);
        customer1.addToCart(product2, 3);
        customer1.addToCart(product1, 1);
        customer1.addToCart(product3, 1);

        int orderNumber = customer1.placeOrder();

    }

}
