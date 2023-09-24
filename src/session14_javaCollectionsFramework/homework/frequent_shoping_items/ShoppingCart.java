package session14_javaCollectionsFramework.homework.frequent_shoping_items;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> products = new ArrayList<>();

    public void addProduct(String product){
        products.add(product);
    }
    public List<String> getProducts(){
        return products;
    }
}
