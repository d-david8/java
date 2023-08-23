package session8.homework;

import java.util.ArrayList;
import java.util.List;

// 2. Create a wishlist for christmas with ArrayList and print the values
public class WhishList {

    public static void main(String[] args) {

        List<String> wishList = new ArrayList<>();
        wishList.add("Laptop");
        wishList.add("Socks");
        wishList.add("Biscuits");

        System.out.println(wishList);

        for (String item : wishList) {
            System.out.println(item);
        }
    }
}
