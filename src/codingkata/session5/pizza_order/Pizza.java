package codingkata.session5.pizza_order;

public class Pizza {

    private Size size;
    private int numCheeseTopping;
    private int numPepperoniTopping;
    private int numHamTopping;


    public Pizza(Size size, int numCheeseTopping, int numPepperoniTopping, int numHamTopping) {
        this.size = size;
        this.numCheeseTopping = Math.max(numCheeseTopping, 0);
        this.numPepperoniTopping = Math.max(numPepperoniTopping, 0);
        this.numHamTopping = Math.max(numHamTopping, 0);
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getNumCheeseTopping() {
        return numCheeseTopping;
    }

    public void setNumCheeseTopping(int numCheeseTopping) {
        this.numCheeseTopping = numCheeseTopping;
    }

    public int getNumPepperoniTopping() {
        return numPepperoniTopping;
    }

    public void setNumPepperoniTopping(int numPepperoniTopping) {
        this.numPepperoniTopping = numPepperoniTopping;
    }

    public int getNumHamTopping() {
        return numHamTopping;
    }

    public void setNumHamTopping(int numHamTopping) {
        this.numHamTopping = numHamTopping;
    }

    public double calcCost() {
        double cost = 0;
        switch (size) {
            case SMALL -> cost += 10;
            case MEDIUM -> cost += 12;
            case LARGE -> cost += 14;
        }

        int totalToppings = numCheeseTopping + numPepperoniTopping + numHamTopping;
        cost += 2 * totalToppings;
        return cost;
    }

    public String getDescription() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("pizza size " + size + "\n");
        if (numCheeseTopping > 0) {
            stringBuilder.append(numCheeseTopping + " x cheese toppings" + "\n");
        }
        if (numPepperoniTopping > 0) {
            stringBuilder.append(numPepperoniTopping + " x pepperoni toppings" + "\n");
        }
        if (numHamTopping > 0) {
            stringBuilder.append(numHamTopping + " x ham toppings");
        }
        return stringBuilder.toString();
    }
}
