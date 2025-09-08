package week4;

public class Ex77 {


    public static class LyyraCard {
        private double balance;

        public LyyraCard(double balanceAtStart) {
            this.balance = balanceAtStart;
        }

        public void payEconomical() {
            if (this.balance >= 2.50) {
                this.balance -= 2.50;
            }
        }

        public void payGourmet() {
            if (this.balance >= 4.00) {
                this.balance -= 4.00;
            }
        }

        public void loadMoney(double amount) {

            if (amount > 0 && this.balance + amount <= 150) {
                this.balance += amount;
            }
            if (amount > 0 && this.balance + amount >= 150) {
                this.balance += 150 - this.balance;
            }
        }

        @Override
        public String toString() {
            return "This card has " + this.balance + " euros.";
        }
    }


    public static void main(String[] args) {

        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        System.out.println( "Pekka: " + cardPekka);
        cardBrian.payEconomical();
        System.out.println( "Brian: " + cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        System.out.println( "Brian: " + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);


    }
}