package session9.practice.onlinecheckoutsystem;

public class OnlineStore {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("Laptop", 3554));
        shoppingCart.addItem(new Item("Monitor", 2000));

        shoppingCart.printShoppingCart();
        System.out.println("Total cost: " + shoppingCart.getTotalCost());
    }
}
