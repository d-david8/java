package session9_oopConcepts.practice.onlinecheckoutsystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void printShoppingCart() {
        for (Item item : items) {
            System.out.print(item + "\n");
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }

        return totalCost;
    }
}
