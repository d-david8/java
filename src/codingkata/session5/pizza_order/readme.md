Pizza orde

Create a class named Pizza that stores information about a single pizza. It should contain the following:

- Private instance variables to store the size of the pizza (either small, medium,or large), the number of cheese
  toppings, the number of pepperoni toppings, and the number of ham toppings.
- Constructor(s) that set all of the instance variables.
- Public methods to get and set the instance variables.
- A public method named calcCost( ) that returns a double that is the cost of the pizza.Pizza cost is determined by:
    - Small: $10 + $2 per topping
    - Medium: $12 + $2 per topping
    - Large: $14 + $2 per topping

- Public method named getDescription()that returns a String containing the pizza size, quantity of each topping.

Write test code to create several pizzas and output their descriptions. For example, a large pizza with one cheese, one
pepperoni and two ham toppings should cost a total of$22.

Now Create a PizzaOrder class that allows up to three pizzas
to be saved in an order.Each pizza saved should be a Pizza object. Create a method calcTotal() that returns the cost of
order. In the runner order two pizzas and return the total cost.