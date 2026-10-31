package com.lab;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Musician find(Map<String, Musician> label, String name) throws MusicianNotFoundException {
        Musician m = label.get(name);
        if (m == null) {
            throw new MusicianNotFoundException("Музыкант '" + name + "' не найден в базе!");
        }
        return m;
    }

    public static void main(String[] args) {
        Map<String, Musician> label = new HashMap<>();

        try {
            Musician m1 = new Musician("Оззи Осборн", "Вокал", "Метал", 15, 9.5);
            label.put(m1.getName(), m1);
            System.out.println("Создан: " + m1.getName());

            System.out.println("Пытаемся создать музыканта с рейтингом 12...");
            Musician m2 = new Musician("Ошибочный", "Гитара", "Рок", 1, 12.0);

        } catch (InvalidMusicianDataException e) {
            System.out.println("Ошибка поймана: " + e.getMessage());
        }

        System.out.println("\nВыпуск альбомов и finally");
        try {
            Musician ozzy = find(label, "Оззи Осборн");
            ozzy.releaseAlbum("Patient Number 9");

            ozzy.releaseAlbum("");

        } catch (MusicianNotFoundException e) {
            System.out.println("не найден: " + e.getMessage());
        } catch (AlbumException e) {
            System.out.println("ошибка альбома: " + e.getMessage());
        } finally {
            System.out.println("[Блок finally сработал]");
        }

        System.out.println("\nМножественный catch (multi-catch)");
        try {
            Musician ghost = find(label, "Майкл Джексон");
            ghost.releaseAlbum("Thriller");
        } catch (MusicianNotFoundException | AlbumException e) {
            System.out.println("поймали ошибку (Multi-catch): " + e.getMessage());
        }

        System.out.println("\nCеттеры");
        try {
            Musician ozzy = find(label, "Оззи Осборн");

            ozzy.setRating(8.5);
            System.out.println("Рейтинг изменен на: " + ozzy.getRating());

            System.out.println("Пытаемся поставить рейтинг 15...");
            ozzy.setRating(15.0);

        } catch (MusicianNotFoundException e) {
            System.out.println("не найден: " + e.getMessage());
        } catch (InvalidMusicianDataException e) {
            System.out.println("ошибка данных: " + e.getMessage());
        }
    }
}