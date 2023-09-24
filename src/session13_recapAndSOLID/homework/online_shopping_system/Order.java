package session13_recapAndSOLID.homework.online_shopping_system;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private static int ordersCount = 0;
    private final int orderNumber;
    private final Customer customer;
    private double totalCost;
    private Map<Product, Integer> products;
    private OrderStatus orderStatus;

    public Order(Customer customer, Map<Product, Integer> products) {
        this.ordersCount++;
        this.customer = customer;
        this.orderNumber = ordersCount;
        this.orderStatus = OrderStatus.PENDING;
        this.products = new HashMap<Product, Integer>();
        for (Product product : products.keySet()) {
            this.products.put(product, products.get(product));
            this.totalCost += product.getPrice() * this.products.get(product);
        }
    }

    public double getTotalCost() {
        return this.totalCost;
    }

    public void displayOrderInfo() {
        System.out.println("Order number: " + orderNumber + "\n" +
                "Order status: " + orderStatus + "\n" +
                "Customer details:\n" + customer.getDetails() + "\n"
        );
        for (Product product : this.products.keySet()) {
            System.out.println(product.getDetails());
            System.out.println("Quantity: " + products.get(product));
        }
        System.out.println("Total cost: " + totalCost);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDetails() {
        return "Customer details:\n" + customer.getDetails() +
                "Order details:\n" +
                "Order number: " + orderNumber + "\n" +
                "Order status: " + orderStatus + "\n";
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
