package com.lab;

public class Musician {
    private String name;
    private String instrument;
    private String genre;
    private int albums;
    private double rating;

    public Musician(String name, String instrument, String genre, int albums, double rating)
            throws InvalidMusicianDataException {

        setName(name);
        setRating(rating);
        setAlbums(albums);

        this.instrument = instrument;
        this.genre = genre;
    }

    public void setName(String name) throws InvalidMusicianDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidMusicianDataException("Имя не может быть пустым!");
        }
        this.name = name;
    }

    public void setRating(double rating) throws InvalidMusicianDataException {
        if (rating < 1 || rating > 10) {
            throw new InvalidMusicianDataException("Рейтинг должен быть от 1 до 10!");
        }
        this.rating = rating;
    }

    public void setAlbums(int albums) throws InvalidMusicianDataException {
        if (albums < 0) {
            throw new InvalidMusicianDataException("Альбомов не может быть меньше нуля!");
        }
        this.albums = albums;
    }

    public String getName() { return name; }
    public double getRating() { return rating; }

    public void releaseAlbum(String title) throws AlbumException {
        if (title == null || title.trim().isEmpty()) {
            throw new AlbumException("Название альбома не может быть пустым!");
        }
        albums++;
        System.out.println(name + " выпустил альбом: " + title);
    }

    @Override
    public String toString() {
        return "Музыкант: " + name + " | Инструмент: " + instrument + " | Рейтинг: " + rating;
    }
}