package com.lab;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== ЗАДАНИЕ 1: Map<String, Game> ===");
        Map<String, Game> games = new HashMap<>();

        games.put("Монополия", new BoardGame("Монополия", 1, 5, 4));
        games.put("Каркассон", new BoardGame("Каркассон", 2, 4, 5));
        games.put("Шахматы", new BoardGame("Шахматы", 3, 5, 2));

        games.put("Уно", new CardGame("Уно", 4, 4, "Классическая"));
        games.put("Покер", new CardGame("Покер", 5, 5, "52 карты"));
        games.put("Дурак", new CardGame("Дурак", 6, 3, "36 карт"));

        games.put("Ведьмак 3", new VideoGame("Ведьмак 3", 7, 5, "PC/PS5"));
        games.put("GTA V", new VideoGame("GTA V", 8, 5, "PC/Xbox"));

        for (Map.Entry<String,  Game> entry : games.entrySet() ) {
            System.out.println("Ключ: [" + entry.getKey() + "] -> " + entry.getValue());
        }

        System.out.println("\n=== ЗАДАНИЕ 2: Список врачей (List) ===");
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor(1, "Иванов", "Терапевт", 3, List.of(5, 4, 2)));
        doctors.add(new Doctor(2, "Петров", "Хирург", 4, List.of(3, 2, 1)));
        doctors.add(new Doctor(3, "Сидоров", "Окулист", 2, List.of(5, 5, 5)));
        doctors.add(new Doctor(4, "Кузнецова", "Педиатр", 5, List.of(4, 4, 4)));

        System.out.println("\n1. Врачи со средним рейтингом < 3:");
        for (Doctor d : doctors) {
            if (d.getAverageRating() < 3) System.out.println(d);
        }

        System.out.println("\n2. Повышаем рейтинг врачам со средним баллом >= 4...");
        for (Doctor d : doctors) {
            if (d.getAverageRating() >=4 &&  d.getRating() <= 5 ) {
                d.setRating(d.getRating() + 1);
            }
        }

        System.out.println("\n3. Врачи с рейтингом 5 (после повышения):");
        printDoctors(doctors, 5);

        System.out.println("\n4. Сортировка (по убыванию среднего балла, потом по имени):");
        doctors.sort(new Comparator<Doctor>() {
            @Override
            public int compare(Doctor d1, Doctor d2) {
                int res = Double.compare(d2.getAverageRating(), d1.getAverageRating());
                if (res == 0) res = d1.getName().compareTo(d2.getName());
                return res;
            }
        });

        for (Doctor d : doctors) {
            System.out.printf("ID: %d | Имя: %s | Средний балл: %.2f%n",
                    d.getId(), d.getName(), d.getAverageRating());
        }
    }

    public static void printDoctors(List<Doctor> doctors, int rating) {
        for (Doctor d : doctors) {
            if (d.getRating() == rating) System.out.println(d);
        }
    }
}