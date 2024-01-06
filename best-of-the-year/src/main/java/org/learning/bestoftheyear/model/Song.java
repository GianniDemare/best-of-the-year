package org.learning.bestoftheyear.model;

public class Song {
    // ATTRIBUTI
    private int id;
    private String title;
    private String authors;

    // COSTRUTTORI

    public Song(int id, String title, String authors) {
        this.id = id;
        this.title = title;
        this.authors = authors;
    }

    // METODI

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
}
