package week5;

public class Ex87 {
    public static class Apartment {
        private int rooms;
        private int squareMeters;
        private int pricePerSquareMeter;

        public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
            this.rooms = rooms;
            this.squareMeters = squareMeters;
            this.pricePerSquareMeter = pricePerSquareMeter;
        }

        public boolean larger(Apartment otherApartment) {
            return this.squareMeters > otherApartment.squareMeters;
        }

        public int calculatePrice() {
            return this.squareMeters * this.pricePerSquareMeter;
        }

        public int priceDifference(Apartment otherApartment) {
            int apartmentPrice = this.calculatePrice();
            int otherApartmentPrice = otherApartment.calculatePrice();
            return Math.abs(apartmentPrice - otherApartmentPrice);
        }

        public boolean moreExpensiveThan(Apartment otherApartment) {
            return this.calculatePrice() > otherApartment.calculatePrice();
        }

        public static void main(String[] args) {
            Apartment studioManhattan = new Apartment(1, 16, 5500);
            Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
            Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

            System.out.println(studioManhattan.larger(twoRoomsBrooklyn));
            System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn));

            System.out.println("Price difference between studioManhattan and twoRoomsBrooklyn: "
                    + studioManhattan.priceDifference(twoRoomsBrooklyn));

            System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));
            System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));
        }
    }
}

