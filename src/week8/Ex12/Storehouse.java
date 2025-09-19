package week8.Ex12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Storehouse {
    private Map<String, Integer> storehouse;
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;


    public Storehouse() {
        storehouse = new HashMap<>();
        prices = new HashMap<>();
        stocks = new HashMap<>();
    }



    public void addProduct(String product, int price, int stock){
        storehouse.put(product, stock);
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product){
        if(storehouse.containsKey(product)) {
            return prices.get(product);
        }
        return -99;
    }

    public int stock(String product){
        if(stocks.containsKey(product)){
            return stocks.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (stocks.containsKey(product) && stocks.get(product) > 0) {
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        return false; // No stock or product not found
    }

         public Set<String> products () {
            return new TreeSet<>(stocks.keySet());
        }
}
