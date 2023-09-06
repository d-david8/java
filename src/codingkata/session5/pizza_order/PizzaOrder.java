package codingkata.session5.pizza_order;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrder {
    private final List<Pizza> pizzaList = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        if (pizzaList.size() < 3) {
            pizzaList.add(pizza);
        } else {
            System.out.println("Maximum element was reached.");
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Pizza pizza : pizzaList) {
            totalCost += pizza.calcCost();
        }
        return totalCost;
    }
}
