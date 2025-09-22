package week9.Ex20.application;

public class ConstantSensor implements Sensor {
    private final int value;

    public ConstantSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {

    }
    public void off() {

    }
    public int measure() {
        return value;
    }
}
