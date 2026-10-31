package com.lab;

public class TV extends Device {
    private double screenSize;

    public TV(String model, int power, int year, double screenSize) {
        super(model, power, year);
        this.screenSize = screenSize;
    }

    @Override
    public String getEnergyClass() {
        return "Высокий";
    }

    public void changeChannel() {
        System.out.println(getModel() + ": Переключаю канал.");
    }
}