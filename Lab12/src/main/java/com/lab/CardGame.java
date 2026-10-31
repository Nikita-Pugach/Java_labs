package com.lab;

public class CardGame extends Game {
    private String deckType;

    public CardGame(String name, int id, int rating, String deckType) {
        super(name, id, rating);
        this.deckType = deckType;
    }

    @Override
    public String toString() {
        return super.toString() + " | Колода: " + deckType + " (Карточная)";
    }
}