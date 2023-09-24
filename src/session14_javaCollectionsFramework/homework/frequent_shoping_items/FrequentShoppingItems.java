package session14_javaCollectionsFramework.homework.frequent_shoping_items;

import java.util.*;

public class FrequentShoppingItems {

    public static void main(String[] args) {
        List<ShoppingCart> orders = generateShoppingCarts();
        int k = 3;

        System.out.println(retrieveProductsWithAppearance(orders));
        System.out.println(findTopKPoducts(k, retrieveProductsWithAppearance(orders)));
    }

    private static List<ShoppingCart> generateShoppingCarts() {
        List<ShoppingCart> carts = new ArrayList<>();

        ShoppingCart shoppingCart1 = new ShoppingCart();
        shoppingCart1.addProduct("P1");
        shoppingCart1.addProduct("P2");
        shoppingCart1.addProduct("P2");
        shoppingCart1.addProduct("P3");
        shoppingCart1.addProduct("P2");
        carts.add(shoppingCart1);

        ShoppingCart shoppingCart2 = new ShoppingCart();
        shoppingCart2.addProduct("P1");
        shoppingCart2.addProduct("P2");
        shoppingCart2.addProduct("P3");
        shoppingCart2.addProduct("P4");
        shoppingCart2.addProduct("P4");
        shoppingCart2.addProduct("P4");
        shoppingCart2.addProduct("P4");
        shoppingCart2.addProduct("P4");
        shoppingCart2.addProduct("P4");

        carts.add(shoppingCart2);

        return carts;
    }

    public static Map<String, Integer> retrieveProductsWithAppearance(List<ShoppingCart> shoppingCarts) {
        Map<String, Integer> allProducts = new HashMap<>();
        for (ShoppingCart shoppingCart : shoppingCarts) {
            for (String product : shoppingCart.getProducts()) {
                allProducts.put(product, allProducts.getOrDefault(product, 0) + 1);
            }
        }
        return allProducts;
    }

    public static Map<String, Integer> findTopKPoducts(int k, Map<String, Integer> products) {
        Map<String, Integer> topK = new HashMap<>();
        int minApareance = Integer.MAX_VALUE;
        String minProduct = "xxxx";
        for (Map.Entry product : products.entrySet()) {
            System.out.println(minApareance);
            if (k > 0) {
                if (minApareance > (int) product.getValue()) {
                    minApareance = (Integer) product.getValue();
                    minProduct = (String) product.getKey();
                }
                topK.put((String) product.getKey(), (Integer) product.getValue());

            } else {
                if (minApareance < (int) product.getValue()) {
                    topK.remove(minProduct);
                    minApareance = (Integer) product.getValue();
                    minProduct = (String) product.getKey();
                    topK.put((String) product.getKey(), (Integer) product.getValue());
                }
            }
            k--;
        }
        return topK;
    }
}
