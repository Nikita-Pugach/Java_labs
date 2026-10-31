package com.lab;

public class Ship implements Transportable, Maintainable {
    private String brand;
    private double capacity;
    private double tonnage;

    public Ship(String brand, double capacity, double tonnage) {
        this.brand = brand;
        this.capacity = capacity;
        this.tonnage = tonnage;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    @Override
    public double getCapacity() { return capacity; }
    public void setCapacity(double capacity) { this.capacity = capacity; }

    public double getTonnage() { return tonnage; }
    public void setTonnage(double tonnage) { this.tonnage = tonnage; }

    @Override
    public void transport(String cargo, double weight) {
        if (weight <= capacity) {
            System.out.printf("Корабль %s перевозит '%s' (%.1f т) по воде%n",
                    brand, cargo, weight);
        } else {
            System.out.printf("Корабль %s не может перевезти %.1f т (макс. %.1f т)%n",
                    brand, weight, capacity);
        }
    }

    @Override
    public void maintain() {
        System.out.println("Корабль " + brand + " проходит техобслуживание");
    }

    @Override
    public String getServiceDate() {
        return "По требованию";
    }

    @Override
    public String toString() {
        return String.format("Ship{brand='%s', capacity=%.1f т, tonnage=%.1f}",
                brand, capacity, tonnage);
    }
}