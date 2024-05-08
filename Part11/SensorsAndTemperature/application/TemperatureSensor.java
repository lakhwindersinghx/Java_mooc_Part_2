package application;

import application.Sensor;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private Integer temperatureReading;
    private boolean status;

    public TemperatureSensor() {
        this.status=false;
    }

    @Override
    public boolean isOn() {
        return this.status;
    }


    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        if (isOn()) {
            this.temperatureReading = new Random().nextInt(61) - 30;
            return this.temperatureReading;
        }
        throw new IllegalStateException("Il sensore è spento !");
    }
}
