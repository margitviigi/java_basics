package week9.Ex20.application;

import java.util.Random;
public class Thermometer implements Sensor {
    private boolean on;
    private Random random;

    public Thermometer() {
        this.on = false;
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void on() {
        this.on = true;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public int measure() {
        if (!on) {
            throw new IllegalStateException("Thermometer is off");
        }
        return random.nextInt(61) - 30;
    }
}
