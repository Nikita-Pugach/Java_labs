package com.lab;

import java.util.List;

public class Doctor {
    private int id;
    private String name;
    private String specialization;
    private int rating;
    private List<Integer> patientRatings;

    public Doctor(int id, String name, String specialization, int rating, List<Integer> patientRatings) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.rating = rating;
        this.patientRatings = patientRatings;
    }

    public double getAverageRating() {
        if (patientRatings == null || patientRatings.isEmpty()) return 0.0;
        int sum = 0;
        for (int r : patientRatings) sum += r;
        return (double) sum / patientRatings.size();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getRating() { return rating; }
    public void setRating(int rating) {
        if (rating > 5) {
            this.rating = 5;
        } else {
            this.rating = rating;
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Имя: %s | Спец: %s | Оценка: %d | Средний балл: %.2f",
                id, name, specialization, rating, getAverageRating());
    }
}