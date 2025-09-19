package week8.Ex12;

public class Purchase {
    private String product;
    private int unitPrice;
    private int amount;

    public Purchase(String product, int unitPrice, int amount) {
        this.product = product;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public int price() {
        return unitPrice * amount;
    }

    public void increaseAmount() {
        this.amount ++;
    }

   public String toString() {
        return this.product + ": "  + this.amount;
   }
}
