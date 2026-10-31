package com.lab;

public class VideoGame extends Game {
    private String platform;

    public VideoGame(String name, int id, int rating, String platform) {
        super(name, id, rating);
        this.platform = platform;
    }

    @Override
    public String toString() {
        return super.toString() + " | Платформа: " + platform + " (Видеоигра)";
    }
}