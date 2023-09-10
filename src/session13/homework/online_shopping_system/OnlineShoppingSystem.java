package session13.homework.online_shopping_system;


public class OnlineShoppingSystem {

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

        customer1.addToCart(product1, 10);
        customer1.removeFromCart(product3);

        System.out.println("Customer details: ");
        System.out.println(customer1.getDetails());

        System.out.println("\nShopping cart details");
        System.out.println(customer1.getShoppingCartDetails());

        System.out.println("Track an order");
        int orderNumber = customer1.placeOrder();
        customer1.trackOrderStatus(orderNumber);

        System.out.println("\nDisplay order details");
        Order order = customer1.getOrderByID(orderNumber);
        order.displayOrderInfo();

        System.out.println("Initiate the payment");
        Payment payment = new Payment(PaymentMethod.BANK_TRANSFER, order.getTotalCost(), order);
        System.out.println(payment.getPaymentStatus());

        System.out.println("Processing the payment");
        payment.processPayment();
        payment.displayPaymentInfo();
        System.out.println("New status of the order: " + order.getOrderStatus());

        customer1.addToCart(product1, 1);
        int orderNumber2 = customer1.placeOrder();
        Order order2 = customer1.getOrderByID(orderNumber2);
        Payment payment1 = new Payment(PaymentMethod.CASH_ON_DELIVERY, order2.getTotalCost(), order2);
        payment1.declinePayment();
        System.out.println();
        payment1.displayPaymentInfo();
        customer1.viewOrderHistory();
    }
}
