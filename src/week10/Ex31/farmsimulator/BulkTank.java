package week10.Ex31.farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000.0;
        this.volume = 0.0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0.0;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (amount < 0) {
            return;
        }
        if (this.volume + amount <= this.capacity) {
            this.volume += amount;
        } else {
            this.volume = this.capacity;
        }
    }

    public double getFromTank(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount <= this.volume) {
            this.volume -= amount;
            return amount;
        } else {
            double allWeHave = this.volume;
            this.volume = 0.0;
            return allWeHave;
        }
    }

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + this.capacity;
    }
}

