package com.lab;

public class Device {
    private String model;
    private int power;
    private int year;

    public Device(String model, int power, int year) {
        this.model = model;
        this.power = power;
        this.year = year;
    }

    public String getModel() { return model; }
    public int getPower() { return power; }

    public void turnOn() {
        System.out.println(model + " включается стандартно.");
    }

    public void turnOn(int power) {
        System.out.println(model + " включается на мощности " + power + " Вт.");
    }

    public void turnOn(String mode) {
        System.out.println(model + " включается в режиме: " + mode);
    }

    public String getEnergyClass() {
        return "Средний";
    }
}