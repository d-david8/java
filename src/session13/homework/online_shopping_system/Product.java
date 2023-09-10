package session13.homework.online_shopping_system;

class Product {
    private String name;
    private String description;
    private double price;
    private int quantity;

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addToInventory(int quantityToAdd) {
        quantity += quantityToAdd;
    }


    public void removeFromInventory(int quantityToRemove) {
        if (quantityToRemove <= quantity) {
            quantity -= quantityToRemove;
        } else {
            System.out.println("Insufficient stock.");
        }
    }

    public boolean isInStock() {
        return quantity > 0;
    }

    public String getDetails() {
        return "Name: " + name + "\n" +
                "Description: " + description + "\n" +
                "Price " + price;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantity);
    }
}