package com.lab;

public class Fridge extends Device {
    private int volume;

    public Fridge(String model, int power, int year, int volume) {
        super(model, power, year);
        this.volume = volume;
    }

    @Override
    public String getEnergyClass() {
        return "Низкий";
    }

    public void freeze() {
        System.out.println(getModel() + ": Включаю режим заморозки.");
    }
}