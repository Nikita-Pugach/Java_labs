package com.lab;

public class Game {
    private String name;
    private int id;
    private int rating;

    public Game(String name, int id, int rating) {
        this.name = name;
        this.id = id;
        this.rating = rating;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return String.format("ID: %d | Название: %s | Рейтинг: %d", id, name, rating);
    }
}