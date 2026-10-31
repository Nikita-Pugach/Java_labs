package com.lab;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV("Samsung QLED", 150, 2023, 55.0);
        Fridge fridge = new Fridge("LG DoorCooling", 200, 2022, 350);

        System.out.println("перегрузка");
        tv.turnOn();
        tv.turnOn(120);
        tv.turnOn("Эко-режим");

        System.out.println("\nпереопределение");
        System.out.println("ТВ: " + tv.getEnergyClass());
        System.out.println("Холодильник: " + fridge.getEnergyClass());

        System.out.println("\nДинамический");
        Device[] devices = { tv, fridge };
        for (Device d : devices) {
            System.out.println(d.getModel() + " имеет класс: " + d.getEnergyClass());
        }

        System.out.println("\nПриведение типов");
        for (Device d : devices) {
            if (d instanceof TV) {
                ((TV) d).changeChannel();
            } else if (d instanceof Fridge) {
                ((Fridge) d).freeze();
            }
        }
    }
}