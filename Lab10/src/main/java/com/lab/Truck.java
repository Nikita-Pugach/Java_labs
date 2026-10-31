package com.lab;

public class Truck implements Transportable, Maintainable {
    private String brand;
    private double capacity;
    private String serviceDate;

    public Truck(String brand, double capacity, String serviceDate) {
        this.brand = brand;
        this.capacity = capacity;
        this.serviceDate = serviceDate;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    @Override
    public double getCapacity() { return capacity; }
    public void setCapacity(double capacity) { this.capacity = capacity; }

    @Override
    public String getServiceDate() { return serviceDate; }
    public void setServiceDate(String serviceDate) { this.serviceDate = serviceDate; }

    @Override
    public void transport(String cargo, double weight) {
        if (weight <= capacity) {
            System.out.printf("Грузовик %s перевозит '%s' (%.1f т) по суше%n",
                    brand, cargo, weight);
        } else {
            System.out.printf("Грузовик %s не может перевезти %.1f т (макс. %.1f т)%n",
                    brand, weight, capacity);
        }
    }

    @Override
    public void maintain() {
        System.out.println("Грузовик " + brand + " проходит техобслуживание");
    }

    @Override
    public String toString() {
        return String.format("Truck{brand='%s', capacity=%.1f т, serviceDate='%s'}",
                brand, capacity, serviceDate);
    }
}