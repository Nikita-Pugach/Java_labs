package com.lab;

public class Main {
    public static void main(String[] args) {
        Truck[] trucks = new Truck[3];
        trucks[0] = new Truck("Volvo FH16", 25.0, "2025-01-15");
        trucks[1] = new Truck("MAN TGX", 20.0, "2025-03-10");
        trucks[2] = new Truck("Scania R450", 30.0, "2025-02-20");

        Ship[] ships = new Ship[2];
        ships[0] = new Ship("Ever Given", 20000, 220000);
        ships[1] = new Ship("MSC Irina", 24000, 240000);

        System.out.println("=== Перевозка грузов ===");
        Transportable[] transports = new Transportable[5];
        System.arraycopy(trucks, 0, transports, 0, 3);
        System.arraycopy(ships, 0, transports, 3, 2);

        String[] cargoes = {"Мебель", "Электроника", "Продукты", "Контейнеры", "Нефть"};
        double[] weights = {15.0, 22.0, 35.0, 18000, 25000};

        for (int i = 0; i < transports.length; i++) {
            transports[i].transport(cargoes[i], weights[i]);
        }

        System.out.println("\nТехобслуживание");
        Maintainable[] maintainables = new Maintainable[5];
        System.arraycopy(trucks, 0, maintainables, 0, 3);
        System.arraycopy(ships, 0, maintainables, 3, 2);

        for (Maintainable m : maintainables) {
            m.maintain();
        }

        System.out.println("\n=== Детали объектов ===");
        for (Truck t : trucks) {
            System.out.printf("%s, ТО: %s%n", t, t.getServiceDate());
        }
        for (Ship s : ships) {
            System.out.printf("%s, тоннаж: %.0f%n", s, s.getTonnage());
        }
    }
}