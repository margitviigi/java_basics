package week9.Ex20.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }
    public void off() {
        if(!sensors.isEmpty()) {
            sensors.get(0).off();
        }
    }
    public int measure() {
        if(!isOn() || sensors.isEmpty()){
            throw new IllegalStateException("AverageSensor is off or has no sensors");
        }
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }
        int average = sum / sensors.size();
        readings.add(average);
        return average;
    }
    public List<Integer> readings() {
        return new ArrayList<>(readings);
    }
}
