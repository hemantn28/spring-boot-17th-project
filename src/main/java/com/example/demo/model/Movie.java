package com.example.demo.model;

public class Movie {
    String name;
    int release;
    String genre;

    public Movie(String name, int release, String genre) {
        this.name = name;
        this.release = release;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
