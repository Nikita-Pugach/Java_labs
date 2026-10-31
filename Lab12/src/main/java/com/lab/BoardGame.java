package com.lab;

public class BoardGame extends Game {
    private int players;

    public BoardGame(String name, int id, int rating, int players) {
        super(name, id, rating);
        this.players = players;
    }

    @Override
    public String toString() {
        return super.toString() + " | Игроков: " + players + " (Настольная)";
    }
}