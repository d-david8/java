package session13.homework.online_shopping_system;

import java.util.UUID;

class Payment {

    private UUID paymentID;
    private PaymentMethod paymentMethod;
    private double paymentAmount;
    private PaymentStatus paymentStatus;
    private Order order;

    public Payment(PaymentMethod paymentMethod, double paymentAmount, Order order) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.paymentStatus = PaymentStatus.PENDING;
        this.paymentID = UUID.randomUUID();
        this.order = order;
    }

    public UUID getPaymentID() {
        return paymentID;
    }

    public void processPayment() {
        this.paymentStatus = PaymentStatus.APPROVED;
        this.order.setOrderStatus(OrderStatus.PROCESSING);
    }

    public void declinePayment() {
        this.paymentStatus = PaymentStatus.DECLINED;
        this.order.setOrderStatus(OrderStatus.CANCELLED);
    }

    public void displayPaymentInfo() {
        System.out.println("Payment method: " + paymentMethod);
        System.out.println("Payment amount: " + paymentAmount);
        System.out.println("Payment status: " + paymentStatus);
        System.out.println("Order : " + order.getOrderDetails());
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
}
