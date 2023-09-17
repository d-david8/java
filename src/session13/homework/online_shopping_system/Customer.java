package session13.homework.online_shopping_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer {
    private String name;
    private String email;
    private String shippingAddress;
    private String billingAddress;
    private Map<Product, Integer> shoppingCart;
    private List<Order> orderHistory;

    public Customer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.shoppingCart = new HashMap<>();
        this.orderHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void addToCart(Product product, int quantity) {
        if (product.getQuantity() >= quantity) {
            if (!shoppingCart.containsKey(product)) {
                shoppingCart.put(product, quantity);
                product.setQuantity(product.getQuantity() - quantity);
            } else {
                int newQuantity = shoppingCart.get(product) + quantity;
                shoppingCart.put(product, newQuantity);
                product.setQuantity(product.getQuantity() - quantity);
            }
        } else {
            System.out.println("Insufficient products in stock");
        }
    }

    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    public Order getOrderByID(int id) {
        for (Order order : orderHistory) {
            if (order.getOrderNumber() == id)
                return order;
        }
        return null;
    }

    public int placeOrder() {
        Order order = new Order(this, shoppingCart);
        orderHistory.add(order);
        shoppingCart.clear();
        return order.getOrderNumber();
    }

    public String getDetails() {
        return "  Name: " + name + "\n" +
                "  Email: " + email + "\n" +
                "  Billing address: " + billingAddress + "\n" +
                "  Shipping address: " + shippingAddress;
    }

    public void viewOrderHistory() {
        System.out.println("All orders: ");
        for (Order order : orderHistory) {
            order.displayOrderInfo();
        }
    }

    public void trackOrderStatus(int orderNumber) {
        for (Order order : orderHistory) {
            if (order.getOrderNumber() == orderNumber) {
                System.out.println("Order Status: " + order.getOrderStatus());
                return;
            }
        }
        System.out.println("Order not found.");
    }

    public String getShoppingCartDetails() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!shoppingCart.isEmpty()) {
            for (Product product : shoppingCart.keySet()) {
                stringBuilder.append(product.getDetails() + "\n");
                stringBuilder.append("Quantity: ");
                stringBuilder.append(shoppingCart.get(product));
                stringBuilder.append("\n");
            }
        } else {
            stringBuilder.append("The cart is empty!");
        }
        return stringBuilder.toString();
    }
}