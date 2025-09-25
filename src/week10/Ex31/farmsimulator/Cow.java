package week10.Ex31.farmsimulator;

import java.util.Random;

    public class Cow implements Milkable, Alive {
        private static final String[] NAMES = new String[]{
                "Anu", "Arpa", "Essi", "Heluna", "Hely",
                "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
                "Jaana", "Jami", "Jatta", "Laku", "Liekki",
                "Mainikki", "Mella", "Mimmi", "Naatti",
                "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
                "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

        private String name;
        private double capacity;
        private double amount;
        private Random random;

        public Cow() {
            this(NAMES[new Random().nextInt(NAMES.length)]);
        }

        public Cow(String name) {
            this.name = name;
            this.random = new Random();
            this.capacity = 15 + random.nextInt(26); // 15-40
            this.amount = 0.0;
        }

        public String getName() {
            return this.name;
        }

        public double getCapacity() {
            return this.capacity;
        }

        public double getAmount() {
            return this.amount;
        }

        @Override
        public void liveHour() {
            double produced = 0.7 + (2.0 - 0.7) * random.nextDouble();
            this.amount += produced;
            if (this.amount > this.capacity) {
                this.amount = this.capacity;
            }
        }

        @Override
        public double milk() {
            double milked = this.amount;
            this.amount = 0.0;
            return milked;
        }

        @Override
        public String toString() {
            return this.name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.capacity);
        }
    }

