Frequent Items in a Shopping Cart

Description:
In an e-commerce application, a feature is needed to quickly identify the most frequently purchased items in a user’s
shopping history. Your task is to create a method that takes a list of shopping carts as input, where each shopping cart
is represented as a list of product IDs (strings). The method should return a list of the K most frequently purchased
items across all shopping carts. If there are ties, return all the items that have the tied frequency. You should also
provide a method to add new purchases to the user's shopping history.

Your solution should focus on efficiency, both in terms of time and space complexity. Consider how you could minimize
the number of times you need to iterate over the data to find the solution. You are not limited to using just arrays and
lists — think about what other data structures could help you solve this problem more efficiently.

Hints:
Keeping a count of the occurrences of each item while going through the shopping carts can help in reducing the time
complexity.
Sorting a list can have a time complexity of O(n log n), but there might be a way to achieve a solution with a lower
time complexity.
After implementing the solution, demonstrate its usage in a main method by creating a list of shopping carts, finding,
and printing the K most frequently purchased items. Ensure to handle edge cases such as when K is larger than the number
of unique items in the shopping carts.
