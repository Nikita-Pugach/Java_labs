package com.lab;

public class Main {
    public static void main(String[] args) {
        Building[] buildings = new Building[5];

        buildings[0] = new ResidentialBuilding("ул. Ленина, 10", 9, 4500, 120);
        buildings[1] = new ResidentialBuilding("ул. Пушкина, 25", 5, 2800, 60);
        buildings[2] = new ResidentialBuilding("пр. Мира, 7", 12, 7200, 200);
        buildings[3] = new OfficeBuilding("ул. Гагарина, 3", 6, 3800, 15);
        buildings[4] = new OfficeBuilding("пр. Независимости, 50", 10, 6000, 25);

        for (Building b : buildings) {
            b.displayInfo();
            System.out.println("--------------------");
        }
    }
}