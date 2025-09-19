package week8.Ex12;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> basket;

    public ShoppingBasket(){
        basket = new HashMap<>();
    }
    public void add(String product, int price) {
        if (basket.containsKey(product)) {
            basket.get(product).increaseAmount();

        } else {
            basket.put(product, new Purchase(product, price, 1));
        }
    }

    public int price(){
        int totalPrice = 0;
        for(Purchase purchase : basket.values()){
            totalPrice += purchase.price();
        }
        return totalPrice;
    }

    public void print(){
        for(Purchase purchase : basket.values()) {
            System.out.println(purchase);
        }
    }
}
