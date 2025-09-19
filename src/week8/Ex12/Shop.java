package week8.Ex12;


import java.util.Scanner;

public class Shop {
    private Storehouse store;
    private Scanner reader;


    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome " + customer);
        System.out.println("Below is our sale offer:");

        for (String product : store.products()) {
            System.out.println(product);
        }


        while (true) {
            System.out.println("What do you want to buy? (Press enter to pay)");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }

            if(store.products().contains(product) && store.stock(product) > 0) {
                basket.add(product, store.price(product));
                store.take(product);
            } else {
                System.out.println(product + " is not in stock");
            }
        }
        System.out.println("Your purchases are: ");
        basket.print();
        System.out.println("basket price: " + basket.price());
    }
}